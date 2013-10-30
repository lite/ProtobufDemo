#!/usr/bin/env python
#!encoding:utf-8

import time
import KVCommand_pb2 as pb 
import socket
import thread
import struct

def handle_login(login):
    response = pb.KVResponse()
    response.status = 0
    response.message = "handle_login" + login.username + login.password
    return response
    
def handle_item(item):
    response = pb.KVResponse()
    response.status = 0
    response.message = "handle_item" + item.command
    return response

def handler(conn):
    while 1:
        try:
            conn.settimeout(5) 
            buf = conn.recv(100) 
            if len(buf) > 0:
                # print "Received request: ", len(buf)
                # print repr(buf), len(buf)
                msg_id, msg_len, packet = struct.unpack("!II%ds"%(len(buf)-8), buf)
                print "%x"%(msg_id), msg_len, repr(packet)
                if len(buf) == msg_len+8:
                    request = pb.KVRequest()
                    request.ParseFromString(packet)
                    if request.type == pb.KVRequest.ITEM:
                        response = handle_item(request.item)
                    else:
                        response = handle_login(request.login)
                    
                    print response
                    tmp = response.SerializeToString()
                    packet = struct.pack("!II%ds"%(len(tmp)), 0xFEDCB000, len(tmp), tmp)
                    conn.send(packet)
            
            time.sleep(1)
        except socket.timeout:
            print 'time out' 
        except:
            # print 'exception'
            break
    
    conn.close()

if __name__=='__main__': 
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    s.bind(('', 8080))
    s.listen(5)  
   
    while True:
        conn, addr = s.accept()
        thread.start_new_thread(handler, (conn, ))
   
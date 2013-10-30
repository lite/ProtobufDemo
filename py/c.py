#!/usr/bin/env python
#!encoding:utf-8

import KVCommand_pb2 as pb 
import time
import sys
import socket
import struct

class SocketService():
    def __init__(self, host = "localhost", port = 8080):
        try:
            self.s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
            self.s.connect((host , port))
        except socket.error, msg:
            print 'Failed to create socket. Error code: ' + str(msg[0]) + ' , Error message : ' + msg[1]
            sys.exit()

    def send(self, message):
        self.s.sendall(message)

    def recv(self, buff = 4096):
        return self.s.recv(buff)

    def __del__(self):
        self.s.close()

def test_command_pb():
    request = pb.KVRequest()
    request.type = pb.KVRequest.ITEM;
    request.item.command = "bbb"
    return send_recv(request)

def test_login_pb():
    request = pb.KVRequest()
    request.type = pb.KVRequest.LOGIN;
    request.login.username = "user"
    request.login.password = "pass"
    return send_recv(request)
        
def send_recv(request):
    s = SocketService(host = "localhost", port = 8080)
    tmp = request.SerializeToString()
    # print tmp
    packet = struct.pack("!II%ds"%(len(tmp)), 0xFEDCB000, len(tmp), tmp)
    print repr(packet), len(packet)
    s.send(packet)
    buf = s.recv(4096)
    print buf
    msg_id, msg_len, packet = struct.unpack("!II%ds"%(len(buf)-8), buf)
    response = pb.KVResponse()
    response.ParseFromString(packet)
    return response
    
if __name__ == '__main__':
    #response = test_command_pb()
    response = test_login_pb()
    print response
    
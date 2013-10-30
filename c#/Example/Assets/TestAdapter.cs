using Tuner.Net;
using UnityEngine;
using System.IO;

public class TestAdapter : ITNetAdapter
{
	private string message;

	public string Message {
		get {
			return message;
		}
	}

	public MemoryStream Login(string user, string pass){
		Example.KVRequest request = new Example.KVRequest ();
		request.Type = Example.KVRequest.RequestType.LOGIN;
		request.Login = new Example.KVLogin ();
		request.Login.Username = user;
		request.Login.Password = pass;
		return RequestToMemoryStream (request);
	}

	public MemoryStream Item(string command){
		Example.KVRequest request = new Example.KVRequest ();
		request.Type = Example.KVRequest.RequestType.ITEM;
		request.Item = new Example.KVItem ();
		request.Item.Command = command;

		return RequestToMemoryStream (request);
	}

	static MemoryStream RequestToMemoryStream (Example.KVRequest request)
	{
		MemoryStream tempStream = new MemoryStream ();
		Example.KVRequest.Serialize (tempStream, request);
		return tempStream;
	}

	public void HandleMsg (System.Object state, TNetMsg msg)
	{
		Example.KVResponse response = Example.KVResponse.Deserialize (msg.m_DataMsg);
		message = response.Message; 
	}

	public ITNetWriter createMsgWriter ()
	{
		return new TNetWriter ();
	}

	public ITNetReader createMsgReader ()
	{
		return new TNetReader ();
	}

	public void onConnected ()
	{
		Debug.Log ("onConnected");
	}

	public void onAccepted ()
	{
	}

	public void onReConnected ()
	{
	}

	public void onNetWorkFailed ()
	{
	}

	public void onReConnectBegin ()
	{
	}
}
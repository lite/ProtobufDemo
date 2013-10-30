using UnityEngine;
using System.Collections;
using Tuner.Net;
using System.IO;

public class Test : MonoBehaviour
{
  TestAdapter adapter;

  void Start()
  {
    adapter = new TestAdapter();
  }

  void OnGUI()
  {
    if (!Client.Instance.IsConnected())
    {
      if (GUILayout.Button("Connect"))
      {
        testConnect();
      }
      return;
    }
    if (GUILayout.Button("Disconnect"))
    {
      testDisconnect();
    }
    if (GUILayout.Button("Login"))
    {
      testLogin();
    }
    if (GUILayout.Button("Item"))
    {
      testItem();
    }
    if (adapter != null)
    {
      GUILayout.Label(adapter.Message);
    }
  }

  void testConnect()
  {
    Client.Instance.Init(adapter);
    Client.Instance.Connect("127.0.0.1", 8080);
  }

  void testDisconnect()
  {
    Client.Instance.DisConnect();
  }

  void testLogin()
  {
    Client.Instance.SendMessage(1, adapter.Login("user", "pass"));
  }

  void testItem()
  {
    Client.Instance.SendMessage(1, adapter.Item("bbb"));
  }

  void Update()
  {
    Client.Instance.Update();
  }
}

package com.heaven.progress.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimlpleSocketServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(4700);
		Socket socket = serverSocket.accept();
		PrintWriter os = new PrintWriter(socket.getOutputStream());
		BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Client:" + is.readLine());
		String line = sin.readLine();
		while (!line.equals("bye")) { // 如果该字符串为 "bye"，则停止循环
			os.println(line); // 向客户端输出该字符串
			os.flush(); // 刷新输出流，使Client马上收到该字符串
			System.out.println("Server:" + line); // 在系统标准输出上打印读入的字符串
			System.out.println("Client:" + is.readLine()); // 从Client读入一字符串，并打印到标准输出上
			line = sin.readLine(); // 从系统标准输入读入一字符串
		} // 继续循环
		os.close(); // 关闭Socket输出流
		is.close(); // 关闭Socket输入流
		socket.close(); // 关闭Socket
		serverSocket.close(); // 关闭ServerSocket
	}
}

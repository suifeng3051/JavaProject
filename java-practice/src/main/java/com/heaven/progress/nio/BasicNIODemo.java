package com.heaven.progress.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * java new IO 基本功能演示类
 * @author heaven
 *
 */
public class BasicNIODemo {
	public static void main(String[] args1) throws IOException {
		//String args[] ={"d:/abc.txt","d:/out.txt"};
		//copyFileUseNIO(args[0], args[1]);
		sliceBuffer();
	}
	/**
	 * 用java NIO api拷贝文件
	 * @param src
	 * @param dst
	 * @throws IOException
	 */
	public static void copyFileUseNIO(String src,String dst) throws IOException{
		//声明源文件和目标文件
				FileInputStream fi=new FileInputStream(new File(src));
				FileOutputStream fo=new FileOutputStream(new File(dst));
				//获得传输通道channel
				FileChannel inChannel=fi.getChannel();
				FileChannel outChannel=fo.getChannel();
				//获得容器buffer
				ByteBuffer buffer=ByteBuffer.allocate(1024);
				while(true){
					//判断是否读完文件
					int eof =inChannel.read(buffer);
					if(eof==-1){
						break;	
					}
					//重设一下buffer的position=0，limit=position
					buffer.flip();
					//开始写
					outChannel.write(buffer);
					//写完要重置buffer，重设position=0,limit=capacity
					buffer.clear();
				}
				inChannel.close();
				outChannel.close();
				fi.close();
				fo.close();
	}
	/**
	 * 获取buffer有两种方法，分配和包装
	 * @param capacity
	 * @return ByteBuffer
	 */
	public static void allocateAndPackageBuffer(int capacity){
		//1.分配一个buffer
		ByteBuffer byteBuffer1=ByteBuffer.allocate(capacity);
		//2.包装一个buffer
		byte[] array=new byte[capacity];
		ByteBuffer byteBuffer2=ByteBuffer.wrap(array);
		System.out.println(byteBuffer1.capacity());
		System.out.println(byteBuffer2.capacity());
	}
	
	/**
	 * buffer 分片演示方法
	 */
	public static void sliceBuffer(){
		//先创建一个缓冲区
		ByteBuffer byteBuffer=ByteBuffer.allocate(10);
		for(int i=1;i<byteBuffer.capacity();i++){
			byteBuffer.put((byte)i);
		}
		//分片其实就是通过position和limit来指定一个窗口
		byteBuffer.position(3);
		byteBuffer.limit(7);
		//开始分片
		ByteBuffer sliceBuffer=byteBuffer.slice();
		//我们把分片中的数据都乘以11
		for (int i=0; i<sliceBuffer.capacity(); ++i) {
		     byte b = sliceBuffer.get( i );
		     b *= 11;
		     sliceBuffer.put( i, b );
		}
		//再打印原来的缓冲区，此时内容已经发生变化
		byteBuffer.position( 0 );
		byteBuffer.limit( byteBuffer.capacity() );
		while (byteBuffer.remaining()>0) {
		     System.out.println( byteBuffer.get() );
		}
		
	}

}

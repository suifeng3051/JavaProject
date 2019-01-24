package com.heaven.arithmetic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeTextWords {

	public static void main(String[] args) {
		try {
			String urla = "D:/a.txt";
			String urlb = "D:/b.txt";
			String a[] = readText(urla, ";");
			String b[] = readText(urlb, ";");
			merge(a, b);
		}catch(FileNotFoundException e){
			System.out.println("无此文件!");
		} catch (Exception e) {

		}
	}

	private static void merge(String[] a, String[] b) throws FileNotFoundException {
		int newLength=a.length+b.length;
		String [] merge=new String[newLength];
		int j=0;
		if(a.length>=b.length){
			for(int i=0;i<a.length;i++){
				merge[j]=a[i];
				j++;
				if(i<b.length){
					merge[j]=b[i];
					j++;
				}
			}
		}else{
			for(int i=0;i<b.length;i++){
				merge[j]=b[i];
				j++;
				if(i<a.length){
					merge[j]=a[i];
					j++;
				}
			}
		}
		
		PrintWriter pw=new PrintWriter(new File("D:/c.txt"));
		for(String word:merge){
			pw.println(word);
		}
		pw.close();
	}

	private static String[] readText(String url2, String splitPattern)
			throws IOException {
		File file = new File(url2);
		FileReader fr = new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		StringBuffer lineBuffer=new StringBuffer();
		String line;
		while((line=br.readLine())!=null){
			lineBuffer.append(line);
		}
		br.close();
		return lineBuffer.toString().split(splitPattern);
	}

}

package java.io.examples;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
	private String words [];
	private int position=0;
	FileManager(String filePath,char seperators[]) throws IOException{
		File file=new File(filePath);
		FileReader reader=new FileReader(file);
		long fileSize=file.length();
		char[] filebuffer=new char[(int)fileSize];
		reader.read(filebuffer);
		String text=new String(filebuffer);
		String regex;
		if(seperators.length==1){
			regex=""+seperators[0];
		}else{
			regex=""+seperators[0]+"|"+seperators[1];
		}
		words=text.split(regex);
		reader.close();
		
	}
	public String nextWord(){
		if(words.length>position){
			return words[position++];
		}else{
			return null;
		}
	}

}

package java.io.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MergeText {
	public static void main(String[] args) {
		try {
			FileManager fma=new FileManager("D:/a.txt",new char[] {';'});
			FileManager fmb=new FileManager("D:/b.txt",new char[] {';'});
			FileWriter fw=new FileWriter(new File("D:/d.txt"));
			String aword=null;
			String bword=null;
			while((aword=fma.nextWord())!=null){
				fw.write(aword+"\n");
				
				if((bword=fmb.nextWord())!=null){
					fw.write(bword+"\n");
				}
				
			}
			while((bword=fmb.nextWord())!=null){
				fw.write(bword+"\n");
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

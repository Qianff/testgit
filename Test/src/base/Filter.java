package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;

public class Filter {
	public static void main(String args[]) throws Exception{
	    new Filter().outputStreamWriterTest();
		
	}
	/*
	 * reader
	 */
	public  void inputStreamTest() throws Exception{
		  File f=new File("d:"+File.separator+"test.txt");
	      InputStream input=new FileInputStream(f);
	      byte[] b=new byte[1024];
	      int d=input.read(b);
	      input.close();
	      System.out.println("result:"+new String(b));
	      System.out.println(d);
	}
	
	/*
	 * writer
	 */
	public void outputStreamWriterTest(){
		 File file = new File("d:"+File.separator+"test.txt");
	        FileOutputStream fos = null;
	        // BufferedOutputStream bos = null;
	        OutputStreamWriter osw = null;
	        try {
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	            fos = new FileOutputStream(file);
	            osw = new OutputStreamWriter(fos);
	            fos.write("sdsdsdsd".getBytes());
	            // osw.write("Write2FileByOutputStream");
	            // bos = new BufferedOutputStream(fos);
	            // bos.write("Write2FileByOutputStream".getBytes());
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (null != osw) {
	                try {
	                    osw.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            if (null != fos) {
	                try {
	                    fos.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	}
 
}

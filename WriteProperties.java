package Utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) {

		Properties prop = new Properties();
		OutputStream writeFile = null;
		
		try {
			writeFile = new FileOutputStream("config.properties");
			prop.setProperty("DBServer" , "Thala071.exchennai");
			prop.setProperty("DBName" , "Cheeks071.exbangalore");
			prop.setProperty("DBNumber" , "Hitman07w.exmumbai");
			prop.setProperty("DBplace" , "Thalapathy0723.excambridge");
			
			prop.store(writeFile, null);
			System.out.println("Created properties successfully");
		}catch (IOException io){
			io.printStackTrace();
		}finally {
			if (writeFile != null){
				try{
					writeFile.close();
				}catch(IOException e){
					e.printStackTrace();
					
				}
			}
			
			
			
		}
		
	}

}

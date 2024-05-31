package vaibhao.vk;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

public class LoadingPropertiesFileApp {

	public static void main(String[] args) throws SQLException,IOException {
	File file=new File(".");
	String path=file.getAbsolutePath();
	String path1=path.substring(0,path.length()-1);
	path1=path1+"src\\resource\\db.properties";
	FileInputStream fin=new FileInputStream(file);
	
	}
}

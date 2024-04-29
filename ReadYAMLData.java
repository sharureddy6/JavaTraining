package Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class ReadYAMLData {

	public static void main(String[] args) throws FileNotFoundException, YamlException {
		
		String filepath = System.getProperty("user.dir") + "//testData.yml";
		FileReader file = new FileReader(filepath);	
		
		YamlReader reader = new YamlReader(file);
		
		//map - JSONobject
		//list -JSONArray
		
		Map testData = (Map)reader.read();
		
		List testCases = (List) testData.get("students");
		System.out.println(testCases);
		
	}

}

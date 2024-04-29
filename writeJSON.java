package Utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class writeJSON {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		JSONObject student1 = new JSONObject();
		student1.put("Studentname" , "James");
		student1.put("Grade", "6th");
		student1.put("Location" , "UK ");
		
		JSONObject student2 = new JSONObject();
		student2.put("Studentname" , "jack");
		student2.put("Grade", "6th");
		student2.put("Location" , "UK ");
		
		System.out.println(student1.toJSONString());
		System.out.println(student2.toJSONString());
		
		JSONArray studentDetails = new JSONArray();
		studentDetails.add(student1);
		studentDetails.add(student2);
		
		System.out.println(studentDetails.toJSONString());
		
		JSONObject details = new JSONObject();
		details.put("StudentDetails", studentDetails);
		System.out.println(details.toJSONString());
		
		
	}

}

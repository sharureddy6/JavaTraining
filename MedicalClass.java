package OOPSproject;

public class MedicalClass implements Student {


    public void displayName() {
        System.out.println("Hi, we are medical students");      
    }


    public void getStudentName() {
        System.out.println("Hi, my name is nktyaa");      
    }

    
    public void getstandard() {
        System.out.println("We are from MBBS");      
    }
    
    public void getuniversity(){
        System.out.println("University name is London university");
    }
    
    public static void main (String[] args){
        EngineeringClass eng = new EngineeringClass();
        MedicalClass med = new MedicalClass();
        
        eng.getstandard();
        eng.displayName();
        eng.getStudentName();
        eng.getuniversity();
        
        System.out.println("*********************");
        
        med.getstandard();
        med.displayName();
        med.getStudentName();
        med.getuniversity();
    }


	
	public void getInterfaceName() {
		// TODO Auto-generated method stub
		
	}

}

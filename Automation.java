package oops;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Language obj=new Automation();
		obj.Java();
		TestTool obj1=new Automation();
		obj1.Selenium();
		MultipleLanguage obj2=new Automation();
		obj2.python();
		obj2.ruby();
		
		
		

	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("learn selenium");
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("learn java");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("learn ruby");
	}

}

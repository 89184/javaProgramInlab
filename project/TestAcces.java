import test.DemoAccess;

class TestAccess extends DemoAccess{
	public static void main(String args[]){
		DemoAccess obj=new DemoAccess();
			
		System.out.println("private value is:"+obj.value1);
		System.out.println("public value is:"+obj.value2);
		System.out.println("protected value is:"+obj.value3);
		System.out.println("value is:"+obj.value4);	
	
	}
}

package week3.day1;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("************MOBILE***************");
		
		Mobile mobObj = new Mobile();
		mobObj.sendMsg();
		mobObj.makeCall1();
		mobObj.saveContact();
		
		System.out.println("************Andorid Phone*********");
		
		AndroidPhone androiddObj = new AndroidPhone();
		androiddObj.sendMsg();
		androiddObj.makeCall1();
		androiddObj.saveContact();
		androiddObj.takeVideo();
		
		System.out.println("************Smart Phone************");
		
		SmartPhone smartObj = new SmartPhone();
		smartObj.sendMsg();
		smartObj.makeCall1();
		smartObj.saveContact();
		smartObj.connectWhatsApp();
		
		

	}

}

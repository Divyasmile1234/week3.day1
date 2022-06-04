package week3.day1.classroom;

 public class SmartPhone extends AndroiPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SmartPhone smtpn= new SmartPhone();
     smtpn.sendMsg();
     smtpn.makeCall();
     smtpn.saveContact();
     smtpn.takeVideo();
     smtpn.connectWhatsApp();
	}
	public void takeVideo()
	{
		System.out.println("Taking a Video in SmartPhone");
	}
	public void connectWhatsApp()
	{
		System.out.println("Connecting to WhatsApp");
	}
}

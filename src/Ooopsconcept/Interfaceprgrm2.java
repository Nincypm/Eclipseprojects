package Ooopsconcept;

interface SmartTVRemote
{
	void speaksensor();
}

interface TVRemote extends SmartTVRemote
{
	void channelnavigation();
}


class TV implements TVRemote
{

	@Override
	public void speaksensor() {

		System.out.println("channel 01");
	}

	@Override
	public void channelnavigation() {

		System.out.println("voice sensing");
		
	}
	
}
public class Interfaceprgrm2 {

	public static void main(String[] args) {

		TVRemote ob=new TV();
		ob.channelnavigation();
		ob.speaksensor();
	}

}

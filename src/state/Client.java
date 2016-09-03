package state;

public class Client {

	public static void main(String[] args) {
		CLight light=new CLight(new CLightStateOn());
		light.getLightState().state();
		light.pressSwitch();
		light.getLightState().state();
		light.pressSwitch();
		light.getLightState().state();
	}

}

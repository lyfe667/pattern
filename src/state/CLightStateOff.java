package state;

public class CLightStateOff implements ILightState {

	@Override
	public void pressSwitch(CLight light) {
		System.out.println("开灯！");
		light.setLightState(new CLightStateOn()    );
	}

	@Override
	public void state() {
		System.out.println("灯关着");
	}

}

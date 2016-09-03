package state;

public class CLightStateOn implements ILightState {

	@Override
	public void pressSwitch(CLight light) {
		System.out.println("关灯！");
		light.setLightState(new CLightStateOff());
	}

	@Override
	public void state() {
		System.out.println("灯开着！");
	}

}

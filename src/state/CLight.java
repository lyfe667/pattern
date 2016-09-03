package state;

public class CLight {
	private ILightState lightState;

	public CLight(ILightState lightState) {
		super();
		this.lightState = lightState;
	}

	public ILightState getLightState() {
		return lightState;
	}

	public void setLightState(ILightState lightState) {
		this.lightState = lightState;
	}
	
	public void pressSwitch()
	{
		this.lightState.pressSwitch(this);
	}
	
}

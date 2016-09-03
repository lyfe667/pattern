package adapter;

public class TestClient {

	public static void main(String[] args) {
		Client client=new Client();
		client.request(new Adapter(new Adaptee()));
	}

}

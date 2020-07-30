package Interface_Concepts;

public class inheritDevelopingloans extends Developingloans {

	public static void main(String[] args) {
		inheritDevelopingloans ip = new inheritDevelopingloans();
		ip.homeloan();
		Developingloans ds = new Developingloans();
		ds.localloan();

	}

}

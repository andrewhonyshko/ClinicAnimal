/**
* Работа клиники
*/
public class ClinicRunner{
	public static void main(String[] args)
	{
		System.out.println("hi");
		final Clinic clinic =new Clinic(10);
		clinic.addClient(0, new Client("Andrew",new Cat("Tom")));
	}
}
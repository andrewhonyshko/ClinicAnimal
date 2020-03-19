/**
* Класс описывает клинику
* @author Honyshko
* @since 19.03.2020
*/

public class Clinic{
	/**
	* Список клієнтів
	*/
	private final Client[] clients;
	
	public Clinic(final int size)
	{
		this.clients=new Client[size];
	}
	
	/**
	* Добавити клієнта
	* 
	*/
	public void addClient(final int position, final Client client)
	{
		this.clients[position]=client;
	}
	public Client[] findByName(final String name)
	{
		return new Client[]{};
	}
}
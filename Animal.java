/**
* Базовий клас тварин
*/
public class Animal implements Pet{
	
	private final String name;
	
	/**
	* Конструктор
	* @param name Імя тварини
	*/
	public Animal(String name)
	{
		this.name=name;
	}
	/**
	* Подать голос
	*/
	@Override 
	public void makeSound()
	{
		System.out.println(
			String.format("%s say: %s",this.name,"beep"));
	}
	public String getName()
	{
		return this.name;
	}
}
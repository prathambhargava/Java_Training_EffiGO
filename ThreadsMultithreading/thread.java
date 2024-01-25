package ThreadsMultithreading;

public class thread {
	public static void main(String args[])
	{
		Thread t = new Thread("Hello Everyone this is a Thread Running Currently!");

		// Thread gets started
		t.start();

		// getting data of
		// Thread through String
		String s = t.getName();
		System.out.println(s);
	}
}

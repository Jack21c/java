
class Client implements Runnable
{
	Bank bank;
	Client(Bank bbank)
	{
		bank = bbank;
	}

	public void run()
	{
		
		while(true)
		{
			synchronized(bank)
			{
				int s = 5000;
				bank.put(-1 * s);
				bank.put(s);
				System.out.println(bank.account);
			}
	    	
			
		}
	}
}

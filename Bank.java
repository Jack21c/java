
 class Bank {

	int account = 10000;
	synchronized public void put (int sum)
	{
		account += sum;
	}
}

package Org.System;

public class Desktop extends Computer
{

	public void desktopSize()
	{
		System.out.println("This is a Desktop Size");
	}
	public static void main(String[] args)
	{
		Desktop dobj=new Desktop();
	    dobj.desktopSize();
	    dobj.computerModel();
	}
}

//import java.io.*;
//import java.util.*;
public class Singleton {
		private static Singleton single=new Singleton();
		public static Singleton getInstance()
		{
			return single;
		}
		public void walk()
	    {
			System.out.println("Singleton class");
		}

	}



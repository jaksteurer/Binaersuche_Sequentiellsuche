
public class SuchartenMain {
	static int LAENGEARRAY = 10;
	static int[]arrayzahlen = new int [LAENGEARRAY];
	static int KONTROLLZAHL = 5;
	static int STARTWERT = 0;

	public static void main(String[] args) {

		for(int i=0;i<arrayzahlen.length;i++)
		{
			arrayzahlen[i] = i;
			System.out.print(arrayzahlen[i]+", ");
		}
		System.out.print("\n");
		System.out.println("\nGewählte Zahl: "+KONTROLLZAHL);		
		//sequentiellSuche(arrayzahlen, STARTWERT, arrayzahlen.length, KONTROLLZAHL);
		//binaerSuche(arrayzahlen, STARTWERT, arrayzahlen.length, KONTROLLZAHL);
		for(int i=0;i<100;i++)
		{
			binaerSuche(i);
		}
	
	}
	static boolean sequentiellSuche(int [] arrayzahlen, int anfang, int ende, int zahl)
	{
		System.out.println("\nSEQUENTIELLSUCHE: ");
		ende = arrayzahlen.length;
		int suchschritte = 0;
		for(int i = 0;i<ende;i++)
		{
			suchschritte++;
			if(arrayzahlen[i]==zahl)
			{
				System.out.println("Suchschritte: "+suchschritte);
				return true;
			}
		}
		return false;
	}
	
	static boolean binaerSuche(int [] arrayzahlen, int anfang, int ende, int zahl) //mein Programm
	{	
		System.out.println("\nBINÄRSUCHE: ");
		ende = arrayzahlen.length-1;
		anfang=0;
		int suchschritte=0 ;

		while(anfang<= ende)
		{	
			suchschritte++;
			int haelfte = anfang+((ende-anfang)/2); //arrayzahlen.length
			System.out.println("Suchschritt"+anfang+ende+haelfte);
			if(arrayzahlen[haelfte] == zahl)
			{
				return true;
			}
			else if (arrayzahlen[haelfte] > zahl) 
			{
				ende = haelfte-1; 
			}
			else if (arrayzahlen[haelfte] < zahl)
			{
				ende = haelfte+1;
			}
		}
		System.out.println("Suchschritte: "+suchschritte);
		return false;
	}
	
	static boolean binaerSuche(int suchzahl) //PHYTON Programm Lehrer
	{	
		System.out.println("Zu suchende Zahl: "+suchzahl);
		int anfang = 0;
		int ende = arrayzahlen.length-1;
		int zaehler = 0;
		while(anfang <= ende)
		{
			zaehler +=1;
			int halbe= anfang + ((ende-anfang)/2);
			System.out.println("Suchschritt: "+anfang+" "+ende+" "+halbe);
			if(arrayzahlen[halbe]==suchzahl)
			{
				System.out.println("Gefunden!");
				return true;
			}else if(suchzahl <arrayzahlen[halbe])
			{
				ende = halbe-1;
			}else
			{
				anfang = halbe+1;
			}
		}
		System.out.println("Zählschritte: "+zaehler);
	return false;
	}
}
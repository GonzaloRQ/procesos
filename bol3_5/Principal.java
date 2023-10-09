package bol3_5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Random;
import java.io.FileReader;

public class Principal
{
	public static void main(String[] args)
	{
		Random r = new Random();
		File fichero = new File(args[0]);

		try (BufferedWriter bf = new BufferedWriter(new FileWriter(fichero));)
		{
			for (int i = 0; i < 20; i++)
			{
				int numAzar = r.nextInt(100);
				bf.write(numAzar);

			}
		} 
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}

	}

	static void Ordenanza()
	{
		
	}
}

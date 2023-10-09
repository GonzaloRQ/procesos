package bol3_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumMayor
{
	public static void main(String[] args)
	{
		int numMax = Integer.MIN_VALUE;
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]));)
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				int n = Integer.valueOf(line);
				if(n >= numMax)
				{
					numMax = n;
				}
			}
			
		} catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}
	
}

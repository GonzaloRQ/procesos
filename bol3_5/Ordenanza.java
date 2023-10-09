package bol3_5;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ordenanza
{
	public static void main(String[] args)
	{
		List<Integer> listaNumeros = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(args[0]));)
		{
			String line;
			while((line = br.readLine()) != null)
			{
				int n = Integer.valueOf(line);
				listaNumeros.add(n);	
			}
			Collections.sort(listaNumeros, Collections.reverseOrder());
			

		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]));)
		{
			for(Integer nums : listaNumeros)
			{
				bw.write(nums);
			}
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

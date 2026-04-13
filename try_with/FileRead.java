import java.io.*;
class FileRead
{
	public static void main(String args[])
	{
		try(FileReader reader = new FileReader("Data.txt");
		BufferedReader br = new BufferedReader(reader))
		{
			String line = null;
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
		}
		catch(FileNotFoundException fne)
		{
			System.out.println(fne);
		}
		catch(IOException ne)
		{
			System.out.println(ne);
		}
		//reader.close(); No need to write close() method when use try with statements.
		//br.close();
	}

}

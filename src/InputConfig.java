import java.util.PropertyPermission;
import java.util.Scanner;

public class InputConfig
{
	
	public static String getString()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			String input = sc.nextLine();
			if (input.isBlank())
			{
				System.err.println("Không được để trống");
			}
			else
			{
				return input;
			}
		}
		while (true);
	}
	
	public static Integer getInteger()
	{
		do
		{
			try
			{
				return Integer.parseInt(getString());
			}
			catch (NumberFormatException e)
			{
				System.err.println("Nhập không đúng định dạng");
			}
		}
		while (true);
	}
	
}

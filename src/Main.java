import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws CustomException
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập vào số: ");
//		Integer number = getNumber(sc);
		System.out.println("Nhập ngày sinh: ");
		Date date = null;
		try
		{
			date = getDate(sc);
		}
		catch (ParseException e)
		{
			throw new CustomException("Nhập ngày sai định dạng dd/MM/yyyy");
		}
		System.out.println("Date = " + date);
	}
	
	public static int getNumber(Scanner sc)
	{
		do
		{
			try
			{
				return Integer.parseInt(sc.nextLine());
			}
			catch (NumberFormatException e)
//			catch (Exception e)
			{
				System.err.println("Nhập không đúng định dạng");
			}
		}
		while (true);
		
	}
	
	public static Date getDate(Scanner sc) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.parse(sc.nextLine());
	}
	
}
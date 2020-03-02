package getiamgecolor;

import java.awt.Color;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		//Input file information as "filename.png:x:y" where x and y are the coordinates of the pixel.
		String fileInfo = sc.nextLine();
		String[] fileInfoArr = fileInfo.split(":");
		
		//Splits file information into correct variables.
		String fileName = fileInfoArr[0];
		int x = Integer.parseInt(fileInfoArr[1]);
		int y = Integer.parseInt(fileInfoArr[2]);
		
		GetPixelColor.setImageFile(fileName);
		String color = GetPixelColor.getPixelColor(x, y);
		
		System.out.println(color);
	}

}

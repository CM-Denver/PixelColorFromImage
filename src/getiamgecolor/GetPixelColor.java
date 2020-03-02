package getiamgecolor;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class GetPixelColor {
	
	public static BufferedImage image;
	
	static void setImageFile(String imageFile) throws IOException {
		File file = new File(imageFile);
		GetPixelColor.image = ImageIO.read(file);
	}
	
	static void setImageURL(String url) throws IOException {
		URL url1 = new URL(url);
		GetPixelColor.image = ImageIO.read(url1);
	}
	
	static String getPixelColor(int x, int y) {
		int color = image.getRGB(x, y);
		Color c = new Color(color, true);
		String hex = String.format("#%02x%02x%02x", c.getRed(), c.getGreen(), c.getBlue());
		
		return hex;
	}

}

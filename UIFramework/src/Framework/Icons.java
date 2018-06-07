package Framework;

import java.awt.Composite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Icons 
{
	public ImageIcon radioButtonChecked;
	public ImageIcon radioButtonUnchecked;
	
	public Icons(Theme theme)
	{
		radioButtonChecked = new ImageIcon(scaleImage(theme.radioButtonCheckedPath,24,24));
		radioButtonUnchecked = new ImageIcon(scaleImage(theme.radioButtonUnCheckedPath,24,24));
	}
	
	//TODO
	private Image scaleImage(String path, int scaleX, int scaleY)
	{
		Image result = null;
		BufferedImage bufferedImage;

		try 
		{
			bufferedImage = ImageIO.read(new File(path));
			
			result = bufferedImage;

			result = result.getScaledInstance(scaleX, scaleY, BufferedImage.SCALE_SMOOTH);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return result;
	}

}

package Themes;
import java.awt.Color;
import java.awt.Font;

import Framework.Theme;

public class Dark extends Theme
{
	public Dark()
	{
		this.DarkPrimaryColor = new Color(32, 37, 41);
		this.LightPrimaryColor = new Color(50, 56, 61);
		this.PrimaryText = new Color(220,220,220);
		
		this.PrimaryFont = new Font("Consolas", Font.PLAIN, 16);
	}
}

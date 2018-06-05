package Framework;

import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;

import Shapes.RoundedCorners;

public abstract class Theme implements ITheme
{
	public Color DarkPrimaryColor;
	public Color LightPrimaryColor;
	public Color PrimaryColor;
	public Color Text_Icons;
	public Color AccentColor;
	public Color PrimaryText;
	public Color SecondaryText;
	public Color DividerColor;
	
	public Font PrimaryFont;
	
	@Override
	public void init() 
	{
		UIManager.put("Menu.selectionBackground", this.AccentColor);
		UIManager.put("MenuItem.selectionBackground", this.AccentColor);
	}
	
	@Override
	public JFrame getJFrame() 
	{
		JFrame result = new JFrame();
		
		result.setBackground(DarkPrimaryColor);
		
		return result;
	}
	
	@Override
	public JPanel getJPanelBackground() 
	{
		JPanel result = new JPanel();
		
		result.setBackground(DarkPrimaryColor);
		
		return result;
	}
	
	@Override
	public JPanel getJPanelForeground() 
	{
		JPanel result = new JPanel();
		
		result.setBackground(LightPrimaryColor);
		
		return result;
	}
	
	@Override
	public JMenuBar getJMenuBar() 
	{
		JMenuBar result = new JMenuBar();
		
		result.setBackground(LightPrimaryColor);
		
		result.setBorder(BorderFactory.createEmptyBorder());
		
		return result;
	}
	
	@Override
	public JMenu getJMenu(String title) 
	{
		JMenu result = new JMenu();
		
		//Color
		result.setForeground(PrimaryText);
		
		//Text
		result.setFont(PrimaryFont);
		result.setText(title);
		
		//Layout
		result.setBorder(BorderFactory.createEmptyBorder());
		result.getPopupMenu().setBorder(null);
		
		return result;
	}
	
	@Override
	public JMenuItem getJMenuItem(String title) 
	{
		JMenuItem result = new JMenuItem() 
		{
			@Override
			protected void paintBorder(Graphics g) 
			{

			}
			

		};
		
		
		//Color
		result.setForeground(PrimaryText);
		result.setBackground(LightPrimaryColor);
		
		//Text
		result.setFont(PrimaryFont);
		result.setText(title);
		
		//Layout
		result.setBorder(BorderFactory.createEmptyBorder());
		
		
		return result;
	}
	
	@Override
	public JButton getJButton(String title, Boolean roundedCorners)
	{
		JButton result = new JButton(title);
		
		//result.setBorder(BorderFactory.createEmptyBorder());
		result.setFont(PrimaryFont);
		result.setBackground(LightPrimaryColor);
		result.addFocusListener(new FocusListener() 
		{
			
			@Override
			public void focusLost(FocusEvent arg0) 
			{
				result.setBackground(LightPrimaryColor);
				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) 
			{
				result.setBackground(LightPrimaryColor);
				
			}
			
		});
		result.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				result.setBackground(AccentColor);
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) 
			{
				result.setBackground(LightPrimaryColor);
				super.mouseExited(e);
			}
		});
		result.setBorderPainted(false);
		result.setForeground(PrimaryText);
		result.setFocusPainted(false);
		
		
		return result;
	}
}

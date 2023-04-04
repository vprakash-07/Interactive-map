import states.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class project extends JFrame 
{
	JButton b;
	JFrame f;
	public project()
	{
		f = new JFrame("About India");
		JPanel p = new JPanel();
		JLabel l1 = new JLabel("label 1");
		JLabel l2 = new JLabel("label 2");
		JLabel l3 = new JLabel("image");
		JLabel l4 = new JLabel("text");
		b = new JButton("physical");
		b.setBounds(0,30,100,30);
		l4.setBounds(0,60,100,30);
		l3.setBounds(0,0,800,963);
		l3.setIcon(new ImageIcon("India.png"));
		//l1.setBounds(100,100,100,20);
		//l2.setBounds(100,300,300,20);
		l1.setOpaque(true);
		l2.setOpaque(true);
		l1.setBackground(Color.green);
		l2.setBackground(Color.blue);
		p.setBounds(0,0,800,963);
		//p.setBackground(Color.green);
		//p.add(l4);
		//p.add(l1);
		//p.add(l2);
		p.add(l3);
		//p.add(b);
		p.setLayout(null);
		f.add(p);
	    f.setSize(800,963);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.addMouseListener(new MouseAdapter() 
		{
            public void mouseClicked(MouseEvent e)
			{
				Point p = e.getLocationOnScreen();
			
				try
				{
					Robot r = new Robot();
					Color c = r.getPixelColor(p.x, p.y); 
					//l1.setText("X = "+p.x+" ; Y = "+p.y);
					//l2.setText("Red = " + c.getRed() + ", Green = " + c.getGreen() + ", Blue = " + c.getBlue());
					if(c.getRed() == 252 && c.getGreen() == 78 && c.getBlue() == 42 )
						{
							himachal_pradesh hp = new himachal_pradesh();	
						}
					if(c.getRed() == 254 && c.getGreen() == 217 && c.getBlue() == 118 )
						{
							punjab pu = new punjab();	
						}
					if(c.getRed() == 207 && c.getGreen() == 89 && c.getBlue() == 126 )
						{
							uttarakhand ut = new uttarakhand();	
						}
					if(c.getRed() == 4 && c.getGreen() == 90 && c.getBlue() == 141 )
						{
							haryana hr = new haryana();	
						}
					if(c.getRed() == 189 && c.getGreen() == 0 && c.getBlue() == 38 )
						{
							delhi dl = new delhi();	
						}
					if(c.getRed() == 204 && c.getGreen() == 80 && c.getBlue() == 62 )
						{
							uttar_pradesh up = new uttar_pradesh();	
						}
					if(c.getRed() == 254 && c.getGreen() == 224 && c.getBlue() == 144 )
						{
							Rajasthan ra = new Rajasthan();
						}
					if(c.getRed() == 254 && c.getGreen() == 178 && c.getBlue() == 76 )
						{
							madhya_pradesh mp = new madhya_pradesh();	
						}
					if(c.getRed() == 179 && c.getGreen() == 222 && c.getBlue() == 105 )
						{
							bihar br = new bihar();
						}
					if(c.getRed() == 153 && c.getGreen() == 112 && c.getBlue() == 171 )
						{
							jharkhand jh = new jharkhand();
						}
					if(c.getRed() == 166 && c.getGreen() == 189 && c.getBlue() == 219 )
						{
							west_bengal wb = new west_bengal();
						}
					if(c.getRed() == 237 && c.getGreen() == 173 && c.getBlue() == 8 )
						{
							gujarat gj = new gujarat();
						}
					if(c.getRed() == 255 && c.getGreen() == 127 && c.getBlue() == 0 )
						{
							maharashtra ma = new maharashtra();
						}
					if(c.getRed() == 0 && c.getGreen() == 109 && c.getBlue() == 44 )
						{
							chhatisgarh cg = new chhatisgarh();
						}
					if(c.getRed() == 202 && c.getGreen() == 86 && c.getBlue() == 44 )
						{
							odisha od = new odisha();
						}
					if(c.getRed() == 251 && c.getGreen() == 180 && c.getBlue() == 174 )
						{
							goa ga = new goa();
						}
					if(c.getRed() == 152 && c.getGreen() == 78 && c.getBlue() == 163 )
						{
							karnataka kar = new karnataka();
						}
					if(c.getRed() == 53 && c.getGreen() == 151 && c.getBlue() == 143 )
						{
							telangana tel = new telangana();
						}
					if(c.getRed() == 191 && c.getGreen() == 129 && c.getBlue() == 45 )
						{
							andhra_pradesh ap = new andhra_pradesh();
						}
					if(c.getRed() == 140 && c.getGreen() == 107 && c.getBlue() == 177)
						{
							kerala ke = new kerala();
						}
					if(c.getRed() == 215 && c.getGreen() == 48 && c.getBlue() == 31 )
						{
							tamilnadu tn = new tamilnadu();
						}
					if(c.getRed() == 116 && c.getGreen() == 173 && c.getBlue() == 209 )
						{
							sikkim sk = new sikkim();
						}
					if(c.getRed() == 115 && c.getGreen() == 175 && c.getBlue() == 72 )
						{
							assam as = new assam();
						}
					if(c.getRed() == 90 && c.getGreen() == 174 && c.getBlue() == 97 )
						{
							arunachal an = new arunachal();
						}
					if(c.getRed() == 178 && c.getGreen() == 223 && c.getBlue() == 138 )
						{
							meghalaya mn = new meghalaya();
						}
					if(c.getRed() == 156 && c.getGreen() == 203 && c.getBlue() == 134 )
						{
							tripura tp = new tripura();
						}
					if(c.getRed() == 65 && c.getGreen() == 174 && c.getBlue() == 118 )
						{
							mizoram mz = new mizoram();
						}
					if(c.getRed() == 199 && c.getGreen() == 233 && c.getBlue() == 180)
						{
							manipur man = new manipur();
						}
					if(c.getRed() == 166 && c.getGreen() == 219 && c.getBlue() == 160 )
						{
							nagaland nl = new nagaland();
						}
					if(c.getRed() == 128 && c.getGreen() == 0 && c.getBlue() == 255 )
						{
							jammu jk = new jammu();
						}
					if(c.getRed() == 199 && c.getGreen() == 142 && c.getBlue() == 255 )
						{
							ladakh ld = new ladakh();
						}
					if(c.getRed() == 0 && c.getGreen() == 68 && c.getBlue() == 27 )
						{
							lakshadweep lak = new lakshadweep();
						}
					if(c.getRed() == 51 && c.getGreen() == 160 && c.getBlue() == 44 )
						{
							andaman and = new andaman();
						}
					
						
					
	
				}
				catch(Exception error)
				{
					System.out.println(error.getMessage());
				}
				
            }
			
   
		});
		
	}
	
	public static void main(String args[])
	{
		new project();
	}
}
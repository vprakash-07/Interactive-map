package states;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class lakshadweep extends JFrame 
{
	JFrame f;
	JTabbedPane t;
	JPanel p,p1,p2,p3,p4,p5;
	JLabel l,l1,l2,l3,l4;
	public lakshadweep()
	{
	    f = new JFrame("Lakshadweep");
		t = new JTabbedPane();
		l = new JLabel();
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l.setBounds(0,0,733,506);
		l.setIcon(new ImageIcon(getClass().getResource("/states/lakshadweep.jpg")));
		l1.setBounds(0,0,733,506);
		l1.setIcon(new ImageIcon(getClass().getResource("/states/about_lakshadweep.png")));
		l2.setBounds(0,0,800,550);
		l2.setIcon(new ImageIcon(getClass().getResource("/states/history_lakshadweep.png")));
		l3.setBounds(0,0,800,550);
		l3.setIcon(new ImageIcon(getClass().getResource("/states/information_lakshadweep.png")));
		l4.setBounds(0,0,800,550);
		l4.setIcon(new ImageIcon(getClass().getResource("/states/tourism_lakshadweep.png")));
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		JScrollPane scroll1 = new JScrollPane(p2);  
		JScrollPane scroll2 = new JScrollPane(p3);
		JScrollPane scroll3 = new JScrollPane(p4);
		JScrollPane scroll4 = new JScrollPane(p5);
		JScrollPane scroll5 = new JScrollPane(p1);
        scroll1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		scroll2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scroll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		scroll3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scroll3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		scroll4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scroll4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		scroll5.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scroll5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
		p1.add(l);
		p2.add(l1);
		p3.add(l2);
		p4.add(l3);
		p5.add(l4);
		t.addTab("Map",scroll5);
		t.addTab("About",scroll1);
		t.addTab("History",scroll2);
		t.addTab("Information",scroll3);
		t.addTab("Tourism",scroll4);
		f.add(t);
		f.setSize(850,580);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new lakshadweep();
	}
}
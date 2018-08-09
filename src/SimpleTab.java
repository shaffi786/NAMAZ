import java.awt.Container;
import java.util.*;

import java.awt.event.*;

import javax.swing.*;

public class SimpleTab extends JFrame {

 
public SimpleTab() {

super("JTabbedPane");

setSize(700, 500);
setVisible(true);

Container contents = getContentPane();



JTabbedPane jt = new JTabbedPane();
    jt.add("Fajr",new Fajr());
    jt.add("Zohar", new Zohar());
    jt.add("Asar", new Asar( ) ) ;
    jt.add("Magrib", new Magrib( ) ) ;
    jt.add("Esha", new Esha( ) ) ;
    jt.add("Juma", new Juma( ) ) ;
    
   

contents.add(jt);

//addWindowListener(new BasicWindowMonitor()); setVisible(true);

}

public static void main(String args[]) { 
    SimpleTab s = new SimpleTab();
    s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class Fajr extends JPanel   
{
  public Fajr()   
  {
        JLabel Father   = new JLabel("FATHER: GOES TO MASJID :530 ~5,COMES BACK FROM MASJID : 6:30 TO 7 AM");
        JLabel mother   = new JLabel("MOTHER:OFFERS NAMAZ AT HOME");
        JLabel brother  = new JLabel("...");
        JLabel self     = new JLabel("...");
        JLabel sister   = new JLabel("MY SISTER ,CHILDREN,JIJU NEVER OFFER NAMAZ");
        JLabel wife     = new JLabel("...");
        add(Father);   
        add(mother);  
        add(brother);
        add(self);
        add(wife);
        add(sister);
  }      
}
class Zohar extends JPanel   
{
  public Zohar()   
  {
    JLabel Father   = new JLabel("FATHER:GOES TO MASJID AT  AT 1230 ~ 1 PM AND COMES BACK HOMES AT 230 PM");
        JLabel mother   = new JLabel("MOTHER:OFFERS NAMAZ JUST BEFORE DAD COMES,AT HOME");
        JLabel brother  = new JLabel("BROTHER:GOES TO ASAR NAMAZ WHEN EVER HE IS FREE/NO OFFICE E.G SUNDAYS,SATERDAY");
        JLabel self     = new JLabel("MYSELF:I OFFER NAMAZ WHEN I GET TIME DURING LUNCH BREAK");
        JLabel sister   = new JLabel("MY SISTER ,CHILDREN,JIJU NEVER OFFER NAMAZ");
        JLabel wife     = new JLabel("...");
        add(Father);   
        add(mother);  
        add(brother);
        add(self);
        add(sister);
   
  }
}
class Asar extends JPanel   
{
  public Asar()   
  {
   JLabel Father   = new JLabel("FATHER GOES TO MASJID AT 430~5 PM, AND COMES BACK HOME FOR TEA AT AROPUND 530 PM.");
        JLabel mother   = new JLabel("MOTHER:DOES NAMAZ AT HOME");
        JLabel brother  = new JLabel("GOES TO ASAR NAMAZ WHEN EVER HE IS FREE/NO OFFICE E.G SUNDAYS,SATERDAY");
        JLabel self     = new JLabel("...");
        JLabel sister   = new JLabel("MY SISTER ,CHILDREN,JIJU NEVER OFFER NAMAZ");
        JLabel wife     = new JLabel("...");
        add(Father);   
        add(mother);  
        add(brother);
        add(self);
        add(wife);
        add(sister);
     
  }  
 }
class Magrib extends JPanel   
{
  public Magrib()   
  {
   JLabel Father   = new JLabel("MY FATHER GOES TO MASJID AT MAGRIB NAMAZ AT 530 ~ 6 PM COMES BACK HOME AT 830PM");
        JLabel mother   = new JLabel("MY MOTHER PERFORMS NAMAZ AT MAGRIB AND READ QURAN AFTER NAMAZ.");
        JLabel brother  = new JLabel("BROTHER:GOES TO ASAR NAMAZ WHEN EVER HE IS FREE/NO OFFICE E.G SUNDAYS,SATERDAY.");
        JLabel self     = new JLabel("I OFFER MAGRIB NAMAZ,IF I AM OUT OF OFFICE");
        JLabel sister   = new JLabel("MY SISTER ,CHILDREN,JIJU NEVER OFFER NAMAZ");
        JLabel wife     = new JLabel("...");
        add(Father);   
        add(mother);  
        add(brother);
        add(self);
        add(wife);
        add(sister);
    
    
  } 
  }
class Esha extends JPanel   
{
  public Esha()   
  {
   JLabel Father        = new JLabel("MY FTAHER GOES TO MASJID AT 530~ 6 COMES BACK AT 830 PM");
        JLabel mother   = new JLabel("...");
        JLabel brother  = new JLabel("GOES TO ASAR NAMAZ WHEN EVER HE IS FREE/NO OFFICE E.G SUNDAYS,SATERDAY");
        JLabel self     = new JLabel("I GO TO MASJID AT 8 PM ,IF I HAVE NOT DONE MAGRIB NAMAZ");
        JLabel sister   = new JLabel("MY SISTER ,CHILDREN,JIJU NEVER OFFER NAMAZ");
        JLabel wife     = new JLabel("...");
        add(Father);   
        add(mother);  
        add(brother);
        add(sister);
        add(self);
        add(wife);
  } 
  }
class Juma extends JPanel   
{
  public Juma()   
  {
    JLabel Father   = new JLabel("MY FATHER GOES TO JUMA NAMAZ AT 12:00 AND RETURNS HOME AT 3PM");
        JLabel mother   = new JLabel("MY MOTHER OFFERS NAMAZ AT HOME AROUND 1~3 PM");
        JLabel brother  = new JLabel("BROTHER GOES TO JUMA NAMAZ BEFORE LEAVEING TO OFFICE.");
        JLabel self     = new JLabel("I OFFER JUMA NAMAZ AT AMBERPET MOSQUE");
        JLabel sister   = new JLabel("MY SISTER ,CHILDREN,JIJU NEVER OFFER NAMAZ");
        JLabel wife     = new JLabel("WIFE:DOES NAMAZ AT HOME");
        add(Father);   
        add(mother);  
        add(brother);
        add(self);
        add(wife);
        add(sister);
  } 
  }
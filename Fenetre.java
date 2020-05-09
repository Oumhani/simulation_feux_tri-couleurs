package simutation_feux;

import java.awt.Color;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;

public class Fenetre extends JFrame{
	private Panneau pan1 = new Panneau();
private Panneau pan = new Panneau();
private Panneau pan2 = new Panneau();
private Route r1=new Route(1,"1");
private Route r2=new Route(2,"2");

static JMenuBar menubar = new JMenuBar();
JMenu AjoutVehicule = new JMenu("Ajouter Vehicules");

public Fenetre(){
this.setTitle("Graphics Test");
this.setSize(1000,1000);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLocationRelativeTo(null);
this.setContentPane(pan1);
this.setVisible(true);

go();
}
private void go(){
    pan1.add(pan);
    pan1.add(pan2);
     
	 Feu f1=new Feu(15,Color.red,180,340,250);//route1
	 Feu f2=new Feu(12,Color.red,180,565,540);//route3
	 Feu f3=new Feu(15,Color.orange,180,340,230);//route1
	 Feu f4=new Feu(15,Color.orange,180,565,560);//route3
     Feu f5=new Feu(15,Color.green,180,340,210);//route1
	 Feu f6=new Feu(15,Color.green,180,565,580);//route3
     Feu f7=new Feu(15,Color.red,180,310,505);//route2
	 Feu f8=new Feu(15,Color.red,180,600,280);//route4
	 Feu f9=new Feu(15,Color.orange,180,290,505);//route2
	 Feu f10=new Feu(15,Color.orange,180,620,280);//route4
	 Feu f11=new Feu(15,Color.green,180,270,505);//route2
	 Feu f12=new Feu(15,Color.green,180,640,280);//route4
	 
	
	
  // f1.changeColor();	
    Vehicule v1= new Vehicule(50,Color.yellow,5,10,400);
    Vehicule v3= new Vehicule(50,Color.green,10,10,300);
    Vehicule v4= new Vehicule(50,Color.yellow,15,400,300);
    Vehicule v2= new Vehicule(50,Color.red,5,500,10);
  
    
    r1.addVehicule(v1);
    r2.addVehicule(v2);
    r1.addVehicule(v3);
    r1.addVehicule(v4);
    r1.addFeu(f1);
    r1.addFeu(f2);
    r1.addFeu(f3);
    r1.addFeu(f4);
    r1.addFeu(f5);
    r1.addFeu(f6);
    r1.addFeu(f7);
    r1.addFeu(f8);
    r1.addFeu(f9);
    r1.addFeu(f10);
    r1.addFeu(f11);
    r1.addFeu(f12);
    
    Vector<Feu> f=r1.getF();
    Vector<Vehicule> v=r1.getVehicules();
  
    for(int i=0;i<v.size();i++)
    {
       v.get(i).start();
    }
   
    while(true)  // plusieurs vehicules
    {
           System.out.println(v1.getX());
        
           try {
                 Thread.sleep(60);
           } catch (InterruptedException e) {
                 e.printStackTrace();
           }
           
    pan.setFeu(r1.getF());
    pan.setVehicule(r1.getVehicules());
  pan2.setVehicule(r2.getVehicules());
    v1.setRoule(true);
    v2.setRoule1(true);
 



if(v1.getX()==f1.getX()-60 && f1.getClr().equals(Color.red))   //si le feux est rouge alors la voiture doit arretter 
    v1.setRoule(false);                                        //60 c'est le point ou la voiture doit s'arrete
if(v3.getX()==f1.getX()-60 && f1.getClr().equals(Color.red))
    v3.setRoule(false);


if(v2.getY()>f3.getY() && v2.getY()<f3.getY()+20 && f3.getClr().equals(Color.red))
    v2.setRoule1(false);




/*if(v1.getX()>pan.getWidth())
       v1.setX(0);
if(v2.getY()<0)
       v2.setY(pan.getWidth());

*/
/*Vector<Vehicules> V=r2.getVehicules();

for(int i=0;i<V.size();i++)
{
   V.get(i).start();
}
*/

pan.repaint();}

}
public static void main(String[] args) {
       Fenetre f=new Fenetre();
       String imgUrl="icon.png";
       ImageIcon icone = new ImageIcon(imgUrl);
       JLabel jlabel = new JLabel(icone, JLabel.CENTER);
       //ajouter les deux JLabel a JFrame
       f.getContentPane().add(jlabel);
       f.validate();
}
}
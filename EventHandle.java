import java.awt.*;
import java.awt.event.*;
public class EventHandle extends Frame
{
Frame f;
TextField tf1;
TextField tf2;
TextField tf3;
Label l1;
Button btn;
EventHandle ()
{

this.setTitle("Largest");
this.setLayout (null);
tf1 = new TextField();
tf1.setBounds(100, 50, 85, 20);
tf2 = new TextField();
tf2.setBounds(100, 100, 85, 20);
tf3 = new TextField();
tf3.setBounds(100, 140, 85, 20);
btn = new Button("Largest");
btn.setBounds(110,230,60,40);
l1 = new Label("");
l1.setBounds(100, 190, 85, 20);
this.add(btn);
this.add(tf1);
this.add(tf2);
this.add(tf3);
this.add(l1);

this.setSize(300,300);
this. setVisible(true);

this.addWindowListener (new WindowAdapter ()
{
public void windowClosing (WindowEvent we)
{
System.exit (0);
}
});

btn.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
int a = Integer.parseInt(tf1.getText());
int b = Integer.parseInt(tf2.getText());
int c = Integer.parseInt(tf3.getText());
if(a>=b && a>=c)
l1.setText("Largest = " + String.valueOf(a));
else if (b>=c)
l1.setText("Largest = " + String.valueOf(b));
else
l1.setText("Largest = "+ String.valueOf(c));
}
});

}
public static void main (String args[])

{
new EventHandle ();
}
}

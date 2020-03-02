import java.awt.*;
import javax.swing.*;

public class GridDemo
{
public static void main(String []arg)

{
JFrame frame= new JFrame("griddemo");

JButton b1= new JButton("1");
JButton b2= new JButton("2");
JButton b3= new JFrame("3");
JButton b4= new JButton("4");
JButton b5= new JButton("5");

JPanel f = new JPanel(new GridLayout(3,2,10,10));


f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
frame.setDeultOperation(JFrame,EXIT_ON_CLOSE);
frame.setSize(300,200);

frame.getContentPanel.add(f);
frame.setVisible(true);
}
}
#LAYOUTMANAGER IN JAVA

   The LayoutManagers are used to arrange components in a particular manner.
 LayoutManager is an interface that is implemented by all the classes of layout managers.
  There are following classes that represents the layout managers:

1. java.awt.BorderLayout
  java.awt.FlowLayout
  java.awt.GridLayout
  java.awt.CardLayout
  java.awt.GridBagLayout
  javax.swing.BoxLayout
  javax.swing.GroupLayout
  javax.swing.ScrollPaneLayout
  javax.swing.SpringLayout etc.
    
##java FlowLayout
 The FlowLayout is used to arrange the components in a line, one after another (in a flow).

### Field of FlowLayout:

 1. public static final int LEFT
    public static final int RIGHT
    public static final int CENTER
    public static final int LEADING
    public static final int TRAILING
---

_constructors of Flowlayout_

- **FlowLAyout()**: it create a flow layout with centered alignment and a defult 5 until horizantal and vertical gap.

_ **FlowLayout(int align)**: it create a fkioq with the given alignment and a default 5 unit horizontal and vertical gap.

- **FlowLayout(int align, int hgap, int vgap)**:creates a flow layout with the given alignment and the given horizontal and vertical gap.


_code_

```
import java.awt.*;

class FlowLayoutDemo
{

FlowLayoutDemo(){
Frame f = new Frame("flowlayout");

Button b1= new Button("1");
Button b2= new Button("2");
Button b3= new Button("3");
Button b4= new Button("4");
Button b5= new Button("5");

f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);


f.setLayout( new FlowLayout(FlowLayout.RIGHT));

f.setSize(350,350);
f.setVisible(true);

}
 public static void main(String arg[])
{

new FlowLayoutDemo();
}
}
```


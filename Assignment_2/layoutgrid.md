# GRIDLAYOUT IN JAVA:
_The Java GridBagLayout class is used to align components vertically, horizontally or along their baseline.
The components may not be of same size. Each GridBagLayout object maintains a dynamic, rectangular grid of cells. 
Each component occupies one or more cells known as its display area. Each component associates an instance of GridBagConstraints.
 With the help of constraints object we arrange component's display area on the grid. The GridBagLayout manages each component's minimum
 and preferred sizes in order to determine component's size._


## constructors
1. GridLayout(): It Creates a grid layout with a default of one column per component, in a single row.

2. GridLayout(int rw, int cl): It creates a grid layout with the specified number of rows and columns.

3. GridLayout(int rw, int cl, int hgap, int vgap): It creates a grid layout with the specified number of rows and columns with horizontal 
and vertical gap.

### Methods:

- **addLayoutComponent(String str, Component cmp)**: Adds the specified component with the specified name to the layout.
- **setColumns(int cl)**: Sets the number of columns in this layout to the specified value.

- **setHgap(int hgap)**: Sets the horizontal gap between components to the specified value.
- **setRows(int rw)**: Sets the number of rows in this layout to the specified value.
- **setVgap(int vgap)**: Sets the vertical gap between components to the specified value.
- **layoutContainer(Container pr)**: Lays out the specified container using this layout.
- **toString()**: Returns the string representation of this grid layout’s value


_code_

```
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
```
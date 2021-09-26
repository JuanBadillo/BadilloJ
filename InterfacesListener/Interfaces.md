# Interfaces Listener

#### ActionListener 
Esta interfaz se ocupa de los eventos de acción. A continuación se\
 muestra el método de manejo de eventos disponible en la interfaz ActionListener: 

`void actionPerformed(ActionEvent ae)`

#### AdjustmentListener 
Esta interfaz se ocupa del evento de ajuste generado por la barra de\
 desplazamiento. A continuación se muestra el método de manejo de\
 eventos disponible en la interfaz de AdjustmentListener :

`void adjustmentValueChanged(AdjustmentEvent ae)`

#### ComponentListener 
Esta interfaz se ocupa de los eventos de los componentes. A\
 continuación se muestran los métodos de manejo de eventos\
 disponibles en la interfaz ComponentListener: 

`void componentResized(ComponentEvent ce)`\
`void componentMoved(ComponentEvent ce)`\
`void componentShown(ComponentEvent ce)`\
`void componentHidden(ComponentEvent ce)`

#### ContainerListener 
Esta interfaz se ocupa de los eventos que se pueden generar en los\
 contenedores. A continuación se muestran los métodos de manejo de\
 eventos disponibles en la interfaz ContainerListener:

`void componentAdded(ContainerEvent ce)`\
`void componentRemoved(ContainerEvent ce)`

#### FocusListener 
Esta interfaz se ocupa de los eventos de enfoque que se pueden\
 generar en diferentes componentes o contenedores. A continuación\
 se muestran los métodos de manejo de eventos disponibles en la\
 interfaz FocusListener:

`void focusGained(FocusEvent fe)`\
`void focusLost(FocusEvent fe)`

#### ItemListener 
Esta interfaz se ocupa del evento del artículo. A continuación\
 se muestra el método de manejo de eventos disponible en la interfaz\
 ItemListener:

`void itemStateChanged(ItemEvent ie)`

#### KeyListener 
Esta interfaz se ocupa de los eventos clave. A continuación\
 se muestran los métodos de manejo de eventos disponibles en la\
 interfaz KeyListener:

`void keyPressed(KeyEvent ke)`\
`void keyReleased(KeyEvent ke)`\
`void keyTyped(KeyEvent ke)`

#### MouseListener 
Esta interfaz se ocupa de cinco de los eventos del mouse. A\
 continuación se muestran los métodos de manejo de eventos\
 disponibles en la interfaz MouseListener:

`void mouseClicked(MouseEvent me)`\
`void mousePressed(MouseEvent me)`\
`void mouseReleased(MouseEvent me)`\
`void mouseEntered(MouseEvent me)`\
`void mouseExited(MouseEvent me)`

#### MouseMotionListener 
Esta interfaz se ocupa de dos de los eventos del mouse. A\
 continuación se muestran los métodos de manejo de eventos\
 disponibles en la interfaz MouseMotionListener:

`void mouseMoved(MouseEvent me)`\
`void mouseDragged(MouseEvent me)`

#### WindowListener 
Esta interfaz se ocupa de siete de los eventos de ventana. A\
 continuación se muestran los métodos de manejo de eventos\
 disponibles en la interfaz WindowListener:

`void windowActivated(WindowEvent we)`\
`void windowDeactivated(WindowEvent we)`\
`void windowIconified(WindowEvent we)`\
`void windowDeiconified(WindowEvent we)`\
`void windowOpened(WindowEvent we)`\
`void windowClosed(WindowEvent we)`\
`void windowClosing(WindowEvent we)`
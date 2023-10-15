# CalculatorApp
## Step1 : Prepare GUI
### 1.1 Make a frame
First, we need to create a JFrame that is an instance of the JFrame class and represents a window on the screen (similar to a menu bar). we will add other components to it later.
```
JFrame frame = new JFrame("Calculator");
```
### 1.2 Setup frame
- set the size of the frame as you prefer. This sets the size of the frame to be 305 pixels in width and 510 pixels in height
```
frame.setSize(305, 510);:
```
- frame.getContentPane() is a method of the JFrame class that retrieves the content pane of the frame. The content pane is a container where you typically add components (e.g., buttons, labels, panels) that you want to display within the frame.
```
frame.getContentPane().setLayout(null);
frame.getContentPane().setBackground(Color.black);
```
- make the screen visible for you. Yes! it was hided till this step.
```
frame.setVisible(true);
```
- This sets the default close operation for the frame. EXIT_ON_CLOSE means the application will exit and close when the frame is closed.
```
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```
### 1.1 Create label
label is a class in Java Swing that represents a displayed area for a short amount of text or an image. we will use it to show our value in the calculator.
```
JLabel label = new JLabel();
```

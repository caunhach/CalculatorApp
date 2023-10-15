/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorapplication;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CalculatorApplication implements ActionListener{

    double num1=0, num2=0, result=0;
    int calculation;
    JFrame frame = new JFrame("Calculator");
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMUL = new JButton("X");
    JButton buttonDiv = new JButton("/");
    JButton buttonPLUS = new JButton("+");
    JButton buttonMINUS = new JButton("-");
    JButton buttonSQUARE = new JButton("X\u00B2");
    JButton buttonReciprocal = new JButton("1/X");
    JButton buttonSQRT = new JButton("\u221A");
    CalculatorApplication(){
        prepareGui();
        addComponents();
        addActionEvent();
    }
    public void prepareGui(){
        frame.setSize(305, 510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addComponents(){

        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10,40,270,40);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);
        
        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setFocusable(false);
        frame.add(buttonDiv);

        buttonSQRT.setBounds(10, 170, 60, 40);
        buttonSQRT.setFont(new Font("Arial", Font.BOLD, 16));
        buttonSQRT.setFocusable(false);
        frame.add(buttonSQRT);

        buttonMUL.setBounds(220, 230, 60, 40);
        buttonMUL.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMUL.setFocusable(false);
        frame.add(buttonMUL);

        buttonMINUS.setBounds(220, 170, 60, 40);
        buttonMINUS.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMINUS.setFocusable(false);
        frame.add(buttonMINUS);

        buttonPLUS.setBounds(220, 290, 60, 40);
        buttonPLUS.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPLUS.setFocusable(false);
        frame.add(buttonPLUS);

        buttonSQUARE.setBounds(80, 170, 60, 40);
        buttonSQUARE.setFont(new Font("Arial", Font.BOLD, 16));
        buttonSQUARE.setFocusable(false);
        frame.add(buttonSQUARE);

        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 12));
        buttonReciprocal.setFocusable(false);
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        buttonDelete.setFocusable(false);
        frame.add(buttonDelete);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        buttonClear.setFocusable(false);
        frame.add(buttonClear);
    }

    public void addActionEvent(){

        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSQRT.addActionListener(this);
        buttonSQUARE.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMINUS.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMUL.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPLUS.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }
    public static void main(String[] args) {
        CalculatorApplication Calculator = new CalculatorApplication();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if (source == onRadioButton){
            enable();
        }
        else if (source == offRadioButton){
            disable();
        }
        else if (source == buttonClear){
            label.setText("");
            textField.setText("");
        }
        else if (source == buttonDelete){
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0){
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith(""))
                label.setText("");
        }
        else if (source == buttonZero){
            if (textField.getText().equals("0"))
                return;
            else
                textField.setText(textField.getText() + "0");
        }
        else if (source == buttonOne)
            textField.setText(textField.getText() + "1");
        else if (source == buttonTwo)
            textField.setText(textField.getText() + "2");
        else if (source == buttonThree)
            textField.setText(textField.getText() + "3");
        else if (source == buttonFour)
            textField.setText(textField.getText() + "4");
        else if (source == buttonFive)
            textField.setText(textField.getText() + "5");
        else if (source == buttonSix)
            textField.setText(textField.getText() + "6");
        else if (source == buttonSeven)
            textField.setText(textField.getText() + "7");
        else if (source == buttonEight)
            textField.setText(textField.getText() + "8");
        else if (source == buttonNine)
            textField.setText(textField.getText() + "9");
        else if (source == buttonDot){
            if (textField.getText().contains(".")){
                return ;
            }
            else {
                textField.setText(textField.getText() + ".");
            }
        }
        else if (source == buttonPLUS){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 1;
            textField.setText("");
            label.setText( str + "+");
        }
        else if (source == buttonMINUS){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 2;
            textField.setText("");
            label.setText( str + "-");
        }
        else if (source == buttonMUL){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 3;
            textField.setText("");
            label.setText( str + "X");
        }
        else if (source == buttonDiv){
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            calculation = 4;
            textField.setText("");
            label.setText( str + "/");
        }
        else if (source == buttonSQUARE){
            num1 = Double.parseDouble(textField.getText());
            double square = Math.pow(num1, 2);
            String string = Double.toString(square);
            if(string.endsWith(".0")){
                textField.setText(string.replace(".0", ""));
            }
            else{
                textField.setText(string);
            }
        }
        else if (source == buttonSQRT){
            num1 = Double.parseDouble(textField.getText());
            double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));
        }
        else if (source == buttonReciprocal){
            num1 = Double.parseDouble(textField.getText());
            double reciprocal = 1/num1;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")){
                textField.setText(string.replace(".0", ""));
            }
            else{
                textField.setText(string);
            }
        }
        else if (source == buttonEqual){
            num2 = Double.parseDouble(textField.getText());
            switch(calculation){
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
            }
            if (Double.toString(result).endsWith(".0")){
                textField.setText(Double.toString(result).replace(".0", ""));
            }
            else{
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
    }
    public void enable(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSQRT.setEnabled(true);
        buttonSQUARE.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMINUS.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPLUS.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
    }
    public void disable(){
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSQRT.setEnabled(false);
        buttonSQUARE.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMINUS.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPLUS.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);    
    }
}

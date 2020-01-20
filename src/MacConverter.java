import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MacConverter extends JFrame{

    private JPanel mainPanel;
    private JTextField MacInput;
    private JTextField MacInputTwo;
    private JButton ConvButton1;
    private JButton Conv2Button;

    public MacConverter(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        ConvButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Conv1Text = MacInput.getText();
                char[] Conv2Chars = {'0','0' ,':', '0','0' ,':', '0','0' ,':', '0','0' ,':', '0','0' ,':', '0','0'};
                char[] Conv1Chars = Conv1Text.toCharArray();

                Conv2Chars[0] = Conv1Chars[0];
                Conv2Chars[1] = Conv1Chars[1];

                Conv2Chars[3] = Conv1Chars[2];
                Conv2Chars[4] = Conv1Chars[3];


                Conv2Chars[6] = Conv1Chars[5];
                Conv2Chars[7] = Conv1Chars[6];

                Conv2Chars[9] = Conv1Chars[7];
                Conv2Chars[10] = Conv1Chars[8];


                Conv2Chars[12] = Conv1Chars[10];
                Conv2Chars[13] = Conv1Chars[11];

                Conv2Chars[15] = Conv1Chars[12];
                Conv2Chars[16] = Conv1Chars[13];

                String Conv2Text = String.copyValueOf(Conv2Chars);
                MacInputTwo.setText(Conv2Text);
            }
        });
        Conv2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Conv2Text = MacInputTwo.getText();
                char[] Conv1Chars = {'0','0','0','0' ,'.', '0','0','0','0' ,'.', '0','0','0','0'};
                char[] Conv2Chars = Conv2Text.toCharArray();

                Conv1Chars[0] = Conv2Chars[0];
                Conv1Chars[1] = Conv2Chars[1];
                Conv1Chars[2] = Conv2Chars[3];
                Conv1Chars[3] = Conv2Chars[4];

                Conv1Chars[5] = Conv2Chars[6];
                Conv1Chars[6] = Conv2Chars[7];
                Conv1Chars[7] = Conv2Chars[9];
                Conv1Chars[8] = Conv2Chars[10];

                Conv1Chars[10] = Conv2Chars[12];
                Conv1Chars[11] = Conv2Chars[13];
                Conv1Chars[12] = Conv2Chars[15];
                Conv1Chars[13] = Conv2Chars[16];

                String Conv1Text = String.copyValueOf(Conv1Chars);
                MacInput.setText(Conv1Text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new MacConverter("Mac Converter");
        frame.setVisible(true);
    }
}

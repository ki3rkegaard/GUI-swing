import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FirstGUI implements ActionListener {
     private static JLabel userLabel;
     private static JTextField userText;
     private static JLabel passwordLabel;
     private static JPasswordField passwordText;
     private static JButton button;
     private static JLabel success;

    public static void main(String [] args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Username");//text displayed
        userLabel.setBounds(10, 20, 80, 25); //location and size(x, y, w, l)
        panel.add(userLabel);//adds to display

        userText = new JTextField(20);//user can write in box, characters shown
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");//text displayed
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();//user can write in box, characters not shown
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new FirstGUI());
        panel.add(button);

        success = new JLabel();
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String user = userText.getText();
        String password = passwordText.getText();
        //System.out.println(user+ ", "+password);
        if(user.equals("Jacob") && password.equals("password123")){
            success.setText("Login Successful");
        }
        else{
            success.setText("Login Failed, Please Try Again");
        }
    }   
}

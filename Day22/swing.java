package Day22;
import javax.swing.*;
import java.awt.event.*;;
public class swing {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Demo swing application!");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // label and button for the panel
        JLabel jl = new JLabel("Click me to see magic!");
        JButton jb = new JButton("Click");

        // the action listner for the button
        jb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                jl.setText("look i changed!");
            }
        } );

        JPanel jp = new JPanel();
        // to add the components in the jpanel
        jp.add(jl);
        jp.add(jb);

        // to add the panel in the main frame
        jf.add(jp);

        jf.setSize(1000,1000);
        jf.setVisible(true);
    }
}

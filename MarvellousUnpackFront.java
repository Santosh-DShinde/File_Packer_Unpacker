
// MrvellousUnpackFront.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.ActionListener;
import javax.swing.JLabel;


class InvalidFileException extends Exception
{
    public InvalidFileException(String str)
    {
        super(str);
    }
}

public class MarvellousUnpackFront extends Template implements ActionListener
{
    JButton SUBMIT,PREVIOUS;
    JLabel label1,label2,title;
    final JTextField text1;

    public MarvellousUnpackFront()   //Constructor
    {

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        title = new JLable("Unpacking Posrtal");
        Dimension size = title.getPreferredSize();
        title.setBounds(40,50,size.width,size.height);
        title.setFont(new Font("Century",Font.BOLD,17));
        title.setForeground(color.blue);

        label1 = new JLabe();
        label1.setText("File Name");
        label1.setForeground(Color.white);
        label1.setBounds(350,50,size.width,size.height);

        text1 = new JTextField(15);
        Dimension tsize = text1.getPreferredSize();
        text1.setBounds(500,50,tsize.width,tsize.height);
        text1.setToolTipText("Enter Name OF Directory ");


        BUBMUT = new JButton("Extract Here");
        Dimension bsize = SUBMIT.getPreferredSize();
        SUBMIT.setBounds(350,200,bsize.width,bsize.height);
        SUBMIT.addActionListener(this);

        PREVIOUS = new JButton("PREVIOUS");
        Dimention b2sze = PREVIOUS.getPreferredSize();
        PREVIOUS.setBounds(500,200,b2size.width,b2size.height);
        PREVIOUS.addActionListener(this);

        _header.add(title);
        _header.add(label);
        _header.add(text1);
        _header.add(SUBMIT);
        _header.add(PREVIOUS);

        this.setSize(1000,400 );
        this.setResizable( false);
        this.setVisible( true);
        text1.requestFocusInWindow();
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==exit)
        {
            this.setVisible(false);
            System.exit(0);
        }
        if(ae.getSource()==minimize)
        {
            this.setState(ICONIFED);
        }
        if(ae.getSource()==SUBMIT)
        {
            try {
                MarvellousUnpackFront obj = new MarvellousUnpackFront(text1.getText());
                this.dispose();
                NextPagePAge t = new NextPage("admin");
            }
            catch(InvalidFileException obj)
            {
                this.setVisible(false);
                this.dispose();

                JOptionPane.showMessageDialogue(this,"Invalid Packed File","Error",JOptionPane.ERROR_MASSAGE);
            

                NextPage t = new NextPage("MArvellousAdmin");
            }
            catch(Exception e)
            {}
        }
        if(ae.getSource() == PREVIOUS)
        {
            this.setVisible(false);
            this.dispose();
            NextPage t = new NextPage("admin");
        }
    }
}

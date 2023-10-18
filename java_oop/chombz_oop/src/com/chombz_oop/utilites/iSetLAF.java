package com.chombz_oop.utilites;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * this interface set tne look and feel of the GUi
 *
 * @author chomb
 */
public interface iSetLAF
{

    //Member method to set the look to Nimbus
    public static void setLookAndFeel()
    {
        try
        {
            //Check if the nimbus look and feel is support and get its classname
            for (UIManager.LookAndFeelInfo lafInfo
                    : UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(lafInfo.getName()))
                {
                    UIManager.setLookAndFeel(lafInfo.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException
                | UnsupportedLookAndFeelException e)
        {
            try
            {
                //If the nimbus look and feel is not available, use the metal LAF
                UIManager.setLookAndFeel(UIManager.
                        getCrossPlatformLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException
                    | IllegalAccessException
                    | UnsupportedLookAndFeelException ex)
            {
                JOptionPane.showMessageDialog(null,
                        "The Metal Look and Feel is not available",
                        "Look and Feel unavailable",
                        JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null,
                    "The Nimbus Look and Feel is not available",
                    "Look and Feel unavailable",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}

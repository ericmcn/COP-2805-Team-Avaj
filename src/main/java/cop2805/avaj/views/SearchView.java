package cop2805.avaj.views;

import java.awt.*;
import javax.swing.*;

/**
 * The search view displays a JFrame for performing a search.
 * 
 * @author Kevin Kirkfield
 */
public class SearchView {
    
    public static final String OPEN_SETTINGS_BUTTON_NAME = "Settings";
    public static final String OPEN_INDEX_MANAGEMENT_BUTTON_NAME = "Manage Indexed Files";
    
    private JFrame frame;
    private JButton openSettingsButton;
    private JButton openIndexManagementButton;
    
    public JButton getOpenSettingsButton() {
        
        return openSettingsButton;
        
    }
    
    public JButton getOpenIndexManagementButton() {
        
        return openIndexManagementButton;
        
    }
    
    public SearchView() {
        
        // Create the frame.
        frame = new JFrame();
        
        // Set the default close operation.
        // TODO: This should be changed once the UI is done.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create buttons to open the application settings view and index
        // management view.
        // TODO: This should be improved. It could be in a menu bar under File.
        openSettingsButton = new JButton(OPEN_SETTINGS_BUTTON_NAME);
        frame.add(openSettingsButton, BorderLayout.PAGE_START);
        
        openIndexManagementButton = new JButton(OPEN_INDEX_MANAGEMENT_BUTTON_NAME);
        frame.add(openIndexManagementButton, BorderLayout.PAGE_END);
        
        // Pack the size and display.
        frame.pack();
        frame.setVisible(true);
        
    }
}

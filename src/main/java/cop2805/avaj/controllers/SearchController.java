package cop2805.avaj.controllers;

import cop2805.avaj.models.*;
import cop2805.avaj.views.*;
import java.awt.event.*;

/**
 * The search controller handles action events on the search view.
 * 
 * @author Kevin Kirkfield
 */
public class SearchController implements ActionListener {
    
    private SearchModel model;
    private SearchView view;
    
    public SearchController(SearchModel model, SearchView view) {
        
        this.model = model;
        this.view = view;
        
        view.getOpenSettingsButton().addActionListener(this);
        view.getOpenIndexManagementButton().addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals(SearchView.OPEN_SETTINGS_BUTTON_NAME)) {
            // TODO: Open settings menu.
        }
        else if (e.getActionCommand().equals(SearchView.OPEN_INDEX_MANAGEMENT_BUTTON_NAME)) {
            // TODO: Open index management menu.
        }
        
    }
}

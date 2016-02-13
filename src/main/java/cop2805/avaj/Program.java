package cop2805.avaj;

import cop2805.avaj.controllers.*;
import cop2805.avaj.models.*;
import cop2805.avaj.views.*;
import javax.swing.SwingUtilities;

/**
 * This is the entry point of the application. It handles application start
 * functionality and creates any data contexts and controllers.
 * 
 * @author Kevin Kirkfield, TODO: Add your name here.
 */
public class Program {
    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SearchController c = new SearchController(new SearchModel(), new SearchView());
            }
        });
        
    }
}

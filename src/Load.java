/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GOI
 */
public class Load {

    // The main method is the entry point for the Java application
    public static void main(String[] args) {

        // Creating an instance of the ScreenLoader class
        ScreenLoader SL = new ScreenLoader();

        // Making the ScreenLoader window visible
        SL.setVisible(true);

        // Creating an instance of the WelcomeMenu class (presumably the next screen/menu)
        WelcomeMenu wm = new WelcomeMenu();

        try {
            // A loop that runs from 0 to 50 (inclusive)
            for (int i = 0; i <= 50; i++) {

                // Pausing the thread for 100 milliseconds to create a loading delay effect
                Thread.sleep(100);

                // Setting the text of the 'count' label on the ScreenLoader window
                // It updates to display the current percentage value (i.e., "i%")
                SL.count.setText(Integer.toString(i) + "%");

                // Updating the progress bar on the ScreenLoader window to reflect the current value
                SL.progress.setValue(i);

                // When the progress reaches 50% (loading is done), hide ScreenLoader and show WelcomeMenu
                if (i == 50) {
                    SL.setVisible(false);  // Hide the loading screen
                    wm.setVisible(true);   // Show the welcome menu screen
                }
            }
        } // Catching any InterruptedException that may occur during Thread.sleep() calls
        catch (InterruptedException e) {
            // No specific handling for the exception in this case, just an empty block
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GOI
 */
public class Load {
     public static void main(String[] args){
    ScreenLoader SL = new ScreenLoader();
    SL.setVisible(true);
    WelcomeMenu wm = new WelcomeMenu();
    wm.setVisible(false);
    
    try{
        for(int i = 0; i <=100; i++){
            Thread.sleep(110);
            SL.count.setText(Integer.toString(i)+"%");
            SL.progress.setValue(i);
            
            if(i == 100){
                SL.setVisible(false);
                wm.setVisible(true);
            }
        }
        }
    catch(Exception e){
    
    }
    }
}

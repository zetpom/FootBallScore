/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fbscore;

/**
 *
 * @author ZETPOM
 */
public class ThaiMsg implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("live result: Thai " + ((ScoreFB)o).getThaiScore() + "-" +((ScoreFB)o).getUaeScore() + " Uae");
    }
}

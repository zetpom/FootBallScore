/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fbscore;

import java.util.*;
/**
 *
 * @author ZETPOM
 */
public class FBScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  sc  = new Scanner(System.in);
        ThaiMsg th  = new ThaiMsg();
        UaeMsg  uae = new UaeMsg();

        ScoreFB fbs = new ScoreFB();
        fbs.register(th);
        fbs.register(uae);
        
        String inp;
        System.out.println("//press 1 for add 1 thai score, press 2 for add uae score,press enter for close this program.");
        while(true){
            System.out.print("Enter Score Thai " + fbs.getThaiScore() + "-" + fbs.getUaeScore() + " UAE ");
            inp = sc.nextLine();

            if(inp.equals("1")){
                fbs.addThaiScore();
            }

            if(inp.equals("2")){
                fbs.addUaeScore();
            }

            if(inp.equals("")){
                break;
            }
        }
    }

}

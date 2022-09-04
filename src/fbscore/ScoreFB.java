/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fbscore;

import java.util.ArrayList;
/**
 *
 * @author ZETPOM
 */
public class ScoreFB implements Source {
    private final ArrayList<MyObserver> list;
    private int thaiScore = 0;
    private int  uaeScore = 0;  

    public ScoreFB(){
        this.list = new ArrayList<MyObserver>();
    }

    public void addThaiScore(){
        thaiScore++;
        notifyObservers();
    }

    public int getThaiScore(){
        return thaiScore;
    }

    public void addUaeScore(){
        uaeScore++;
        notifyObservers();
    }

    public int getUaeScore(){
        return uaeScore;
    }
    
    @Override
    public void register (MyObserver observer){
        list.add(observer);
    }

    @Override
    public void notifyObservers(){
        for (int i = 0; i < list.size(); ++i){
            list.get(i).update(this);
        }
    }
}

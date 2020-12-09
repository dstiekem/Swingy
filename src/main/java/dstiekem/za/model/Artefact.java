package dstiekem.za.model;

import dstiekem.za.controller.Level;
import dstiekem.za.model.HitPoints;

//attributes:
//hp
//w
//a
//behaviours:
//increase hitpoints,
public abstract class Artefact{
      protected HitPoints hp;
      protected Attack a;
      protected Defense d;
      protected String art;
      Artefact(String artefact){
            this.art = artefact;
      }
      public int getHi() {
            return this.hp.getHi();
      }
      public int getAt() {
            return this.a.getAt();
      }
      public int getDe() {
            return this.d.getDe();
      }
      public void setHi(int hi) {
           this.hp.setHi(hi);
      }
      public void setAt(int at) {
            this.a.setAtt(at);
      }
      public void setDe(int de) {
            this.d.setDe(de);
      }
      public void HpUp(Level level) {
            int hp = this.getHi();
            int lev = level.getLev();
            //switch case for every level go here.
            //
            this.setHi(hp);
      }
     /* public void setArt(String art) {
            this.art = art;
      }*/
      public String getArt() {
            return this.art;
      }
}
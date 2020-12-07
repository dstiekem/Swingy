package dstiekem.za.model;

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
      Artefact(){
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

      }
      public void setAt(int At) {

      }
      public void setDe(int De) {

      }

}
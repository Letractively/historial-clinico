package com.historiaclinica.hospital;
// Generated 10-abr-2013 14:38:16 by Hibernate Tools 3.2.1.GA



/**
 * PermisosxusurioId generated by hbm2java
 */
public class PermisosxusurioId  implements java.io.Serializable {


     private int idUsurio;
     private int idPermiso;

    public PermisosxusurioId() {
    }

    public PermisosxusurioId(int idUsurio, int idPermiso) {
       this.idUsurio = idUsurio;
       this.idPermiso = idPermiso;
    }
   
    public int getIdUsurio() {
        return this.idUsurio;
    }
    
    public void setIdUsurio(int idUsurio) {
        this.idUsurio = idUsurio;
    }
    public int getIdPermiso() {
        return this.idPermiso;
    }
    
    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PermisosxusurioId) ) return false;
		 PermisosxusurioId castOther = ( PermisosxusurioId ) other; 
         
		 return (this.getIdUsurio()==castOther.getIdUsurio())
 && (this.getIdPermiso()==castOther.getIdPermiso());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdUsurio();
         result = 37 * result + this.getIdPermiso();
         return result;
   }   


}



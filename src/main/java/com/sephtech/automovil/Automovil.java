

package com.sephtech.automovil;

import com.sephtech.automovil.igu.Principal;


public class Automovil {

    public static void main(String[] args) {
      
        //llamamos y hacemos visible a nuestro IGU
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}

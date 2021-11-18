/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.emsi.tpbanque_melhaouitarek.ejb;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import ma.emsi.tpbanque_melhaouitarek.entities.CompteBancaire;

/**
 *
 * @author Xune
 */
@Singleton
@Startup
public class Init {

    @EJB
    GestionnaireCompte g;

    @PostConstruct
    public void init() {
        
          if (g.nbComptes() == 0) {
            g.creerCompte(new CompteBancaire("John Lennon", 150000));
            g.creerCompte(new CompteBancaire("Paul McCartney", 950000));
            g.creerCompte(new CompteBancaire("Ringo Starr", 20000));
            g.creerCompte(new CompteBancaire("Georges Harrisson", 100000));
        }
    }

}

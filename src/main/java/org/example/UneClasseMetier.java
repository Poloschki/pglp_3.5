package org.example;


public class UneClasseMetier {
    private Login login;

    public void uneMethodeMetier() {
        login.afficheLogMessage("Début de uneMethodeMetier");

        //Traitement

        login.afficheLogMessage("Fin de uneMethodeMetier");
    }
}

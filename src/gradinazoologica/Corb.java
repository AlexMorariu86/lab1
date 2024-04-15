package gradinazoologica;

import gradinazoologica.Animal;

public class Corb extends Animal implements Zburator {
    @Override
    public void zboara() {
        System.out.println("Corbul zboara");
    }
}

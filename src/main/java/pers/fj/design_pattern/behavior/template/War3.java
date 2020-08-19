package pers.fj.design_pattern.behavior.template;

public class War3 implements Game {
    @Override
    public void initialize() {
        System.out.println("Initialize War3 game");
    }

    @Override
    public void play() {
        System.out.println("Play War3 game");
    }

    @Override
    public void exit() {
        System.out.println("Exit War3 game");
    }

    public static void main(String[] args) {
        Game game = new War3();
        game.initialize();
        game.play();
        game.exit();
    }
}

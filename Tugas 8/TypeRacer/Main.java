package TypeRacer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[4];

        typers[0] = new Typer("Bot Paddo", 80, typeRacer);
        typers[1] = new Typer("Bot Hairi", 72, typeRacer);
        typers[2] = new Typer("Bot Kak Ardhi", 71, typeRacer);
        typers[3] = new Typer("Bot Nia", 50, typeRacer);

        typeRacer.getRareContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
        typeRacer.displayRaceStandingPeriodically();
    }
}

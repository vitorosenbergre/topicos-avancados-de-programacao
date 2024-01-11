package src;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplificador Top-O-Line");
        Tuner tuner = new Tuner("Sintonizador AM/FM Top-O-Line", amp);
        DVDPlayer dvd = new DVDPlayer("DVD Player Top-O-Line", amp);
        Projector projector = new Projector("Projetor Top-O-Line", dvd);
        TheaterLights lights = new TheaterLights("Luzes da sala de cinema");
        Screen screen = new Screen("Tela de cinema", 10);
        PopcornPopper popper = new PopcornPopper("Máquina de pipoca");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, projector, screen, lights, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}

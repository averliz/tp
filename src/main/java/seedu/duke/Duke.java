package seedu.duke;

public class Duke {
    public Ui ui;
    public Deliveryman deliveryman;
    public Menu menu;
    /**
     * Main entry-point for the java.duke.Duke application.
     */
    public Duke() {
        ui = new Ui();
        menu = new Menu();
    }


    public void run() {
        deliveryman = DataManager.loadProfile();
        Route.loadRoutes();
        ui.showWelcomeScreen();
        menu.showLoopingMenuUntilExit(deliveryman);
        ui.showFarewellScreen();
    }

    public static void main(String[] args) {
        new Duke().run();
    }
}
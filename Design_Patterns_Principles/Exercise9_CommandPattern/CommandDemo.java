public class CommandDemo {

    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        Command play = new PlayCommand(player);
        Command stop = new StopCommand(player);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(play);
        remote.pressButton();

        remote.setCommand(stop);
        remote.pressButton();
    }
}

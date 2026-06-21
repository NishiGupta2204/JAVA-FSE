public class StopCommand implements Command {

    private MusicPlayer player;

    public StopCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stopMusic();
    }
}

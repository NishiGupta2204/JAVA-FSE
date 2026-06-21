public class PlayCommand implements Command {

    private MusicPlayer player;

    public PlayCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.playMusic();
    }
}

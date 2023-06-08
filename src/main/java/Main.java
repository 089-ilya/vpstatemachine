import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static final List<State> STATES = Arrays.stream(State.values())
            .filter(state -> state != State.NULL)
            .toList();

    public static void main(String[] args) throws InterruptedException {
        VideoPlayer videoPlayer = new VideoPlayer();

        Random random = new Random();
        while (true) {
            Thread.sleep(1500);
            videoPlayer.transitionTo(STATES.get(random.nextInt(STATES.size())));
        }
    }
}

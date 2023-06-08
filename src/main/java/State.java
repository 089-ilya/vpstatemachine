import java.util.Arrays;
import java.util.List;

public enum State  {

    NULL {
        @Override
        public boolean canTransitTo(State state) {
            return state == PLAYING;
        }
    },

    PLAYING {
        @Override
        public boolean canTransitTo(State state) {
            return AVAILABLE_PLAYING_TRANSITIONS.contains(state);
        }
    },
    STOPPED {
        @Override
        public boolean canTransitTo(State state) {
            return state == PLAYING;
        }
    },
    PAUSED {
        @Override
        public boolean canTransitTo(State state) {
            return state == PLAYING;
        }
    },
    BUFFERING {
        @Override
        public boolean canTransitTo(State state) {
            return state == PLAYING;
        }
    };

    private static final List<State> AVAILABLE_PLAYING_TRANSITIONS = List.of(STOPPED, PAUSED, BUFFERING);
    public abstract boolean canTransitTo(State state);
}

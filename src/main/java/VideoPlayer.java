public class VideoPlayer {

    private State currentState = State.NULL;

    public void transitionTo(State nextState) {
        if (currentState.canTransitTo(nextState)) {
            System.out.println("Transition from state " + currentState + " to " + nextState + " is SUCCESSFUL");
            this.currentState = nextState;
        } else {
            System.out.println("Transition from state " + currentState + " to " + nextState + " is UNAVAILABLE");
        }
    }

}

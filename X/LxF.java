package X;

/* loaded from: LxF.class */
public final class LxF extends RuntimeException {
    public final int timeoutOperation;

    public LxF(int i) {
        super(i != 1 ? i != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
        this.timeoutOperation = i;
    }
}

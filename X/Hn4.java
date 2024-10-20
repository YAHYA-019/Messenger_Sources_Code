package X;

/* loaded from: Hn4.class */
public final class Hn4 {
    public Thread A00 = Thread.currentThread();

    public void A00() {
        Thread thread = this.A00;
        if (thread == null) {
            thread = Thread.currentThread();
            this.A00 = thread;
        }
        if (Thread.currentThread() != thread) {
            throw AnonymousClass001.A0N("Wrong thread");
        }
    }
}

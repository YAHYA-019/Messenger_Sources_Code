package X;

/* renamed from: X.4Ku, reason: invalid class name */
/* loaded from: 4Ku.class */
public final class C4Ku {
    public static final C4Ku A00 = new Object();
    public volatile C4Ku next;
    public volatile Thread thread;

    public C4Ku() {
        C4Kx c4Kx = C4Kt.A00;
        Thread currentThread = Thread.currentThread();
        if (c4Kx instanceof C4P5) {
            this.thread = currentThread;
        } else {
            ((C4Kw) c4Kx).A03.lazySet(this, currentThread);
        }
    }
}

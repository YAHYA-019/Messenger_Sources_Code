package X;

/* renamed from: X.32U, reason: invalid class name */
/* loaded from: 32U.class */
public final class C32U extends 1F8 implements C3mO {
    public boolean A00;

    /* JADX WARN: Multi-variable type inference failed */
    public void run() {
        synchronized (this) {
            this.A00 = true;
        }
        super/*java.util.concurrent.FutureTask*/.run();
    }
}

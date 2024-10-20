package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: Kbw.class */
public abstract class Kbw {
    public static final ExecutorService A00;
    public static final ThreadFactory A01;

    static {
        Lu2 lu2 = Lu2.A00;
        A01 = lu2;
        A00 = Executors.newCachedThreadPool(lu2);
    }
}

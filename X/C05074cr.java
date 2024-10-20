package X;

import java.util.concurrent.Executor;

/* renamed from: X.4cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4cr.class */
public final class C05074cr {
    public static final int A01;
    public static final int A02;
    public static final C05074cr A03 = new C05074cr();
    public final Executor A00 = new Object();

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        A01 = availableProcessors + 1;
        A02 = (availableProcessors * 2) + 1;
    }
}

package X;

import java.util.Arrays;

/* renamed from: X.7tl, reason: invalid class name */
/* loaded from: 7tl.class */
public final class C7tl {
    public final C00i A00;
    public final C00i A01;

    /* JADX WARN: Type inference failed for: r0v28, types: [X.6KJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.7QH, java.lang.Object] */
    public C7tl() {
        1BV A00 = 1BV.A00(83131);
        this.A00 = A00;
        1BV A002 = 1BV.A00(83131);
        this.A01 = A002;
        for (6KI r0 : Arrays.asList((6KI) A00.get(), (6KI) A002.get())) {
            Integer num = 0S2.A01;
            ?? obj = new Object();
            ((6KJ) obj).A01 = true;
            ((6KJ) obj).A00 = num;
            synchronized (r0) {
                r0.A03.A01 = obj;
            }
            r0.A07("messenger_graph");
            r0.A04((7QH) new Object());
        }
    }

    public static final C7tl A00() {
        return new C7tl();
    }
}

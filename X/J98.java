package X;

import java.util.concurrent.Executors;

/* loaded from: J98.class */
public final class J98 extends C00q implements C00m {
    public static final J98 A00 = new J98();

    public J98() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        return Executors.newFixedThreadPool(4);
    }
}

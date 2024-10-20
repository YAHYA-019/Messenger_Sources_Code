package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.3kh, reason: invalid class name */
/* loaded from: 3kh.class */
public final class C3kh extends C00q implements C00m {
    public static final C3kh A00 = new C3kh();

    public C3kh() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new 1DJ("rpstore-dispatch", -1));
        11T.A0I(newSingleThreadExecutor, "null cannot be cast to non-null type java.util.concurrent.Executor");
        return newSingleThreadExecutor;
    }
}

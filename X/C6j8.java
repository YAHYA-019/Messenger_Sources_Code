package X;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.6j8, reason: invalid class name */
/* loaded from: 6j8.class */
public final class C6j8 implements C2sd {
    public final C2sd A00;
    public final Executor A01;

    public C6j8(C2sd c2sd, Executor executor) {
        11T.A0F(executor, 1);
        this.A01 = executor;
        this.A00 = c2sd;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // X.C2sd
    public ListenableFuture ARv(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        ?? obj = new Object();
        this.A01.execute(new RunnableC1268AcB(this, immutableList, obj));
        return obj;
    }
}

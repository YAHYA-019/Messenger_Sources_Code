package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.3di, reason: invalid class name */
/* loaded from: 3di.class */
public final class C3di implements 1K9 {
    public final SettableFuture A00;

    public C3di(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    public void onFailure(Throwable th) {
        this.A00.setException(th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.set(obj);
    }
}

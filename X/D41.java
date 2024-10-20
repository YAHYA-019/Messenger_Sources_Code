package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: D41.class */
public final class D41 implements 1K9 {
    public ListenableFuture A00;
    public SettableFuture A01;

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        SettableFuture settableFuture = this.A01;
        if (settableFuture != null) {
            settableFuture.setException(th);
        }
        this.A01 = null;
        this.A00 = null;
    }

    public void onSuccess(Object obj) {
        SettableFuture settableFuture = this.A01;
        if (settableFuture != null) {
            settableFuture.set(obj);
        }
        this.A01 = null;
        this.A00 = null;
    }
}

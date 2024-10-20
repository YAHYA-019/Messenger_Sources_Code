package X;

import java.lang.ref.WeakReference;

/* loaded from: D43.class */
public final class D43 implements 1K9 {
    public final WeakReference A00;

    public D43(C06i c06i) {
        11T.A0F(c06i, 1);
        this.A00 = 7zL.A14(c06i);
    }

    public void onFailure(Throwable th) {
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C06i c06i;
        if (obj == null || (c06i = (C06i) this.A00.get()) == null) {
            return;
        }
        c06i.accept(obj);
    }
}

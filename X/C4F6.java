package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.4F6, reason: invalid class name */
/* loaded from: 4F6.class */
public final class C4F6 implements C4F1, C4F2, C4F3 {
    public final CountDownLatch A00 = new CountDownLatch(1);

    public C4F6() {
    }

    public /* synthetic */ C4F6(C4Rv c4Rv) {
    }

    @Override // X.C4F1
    public final void Bmz() {
        this.A00.countDown();
    }

    @Override // X.C4F2
    public final void onFailure(Exception exc) {
        this.A00.countDown();
    }

    @Override // X.C4F3
    public final void onSuccess(Object obj) {
        this.A00.countDown();
    }
}

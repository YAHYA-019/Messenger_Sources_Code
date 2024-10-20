package X;

import java.util.concurrent.Future;

/* renamed from: X.5if, reason: invalid class name */
/* loaded from: 5if.class */
public final class C5if extends AnonymousClass457 {
    public final Future A00;

    public C5if(Future future) {
        this.A00 = future;
    }

    @Override // X.AnonymousClass458
    public void A05(Throwable th) {
        if (th != null) {
            this.A00.cancel(false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return 04S.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CancelFutureOnCancel[");
        A0k.append(this.A00);
        return AnonymousClass001.A0g(A0k, ']');
    }
}

package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* renamed from: X.4Fu, reason: invalid class name */
/* loaded from: 4Fu.class */
public final class C4Fu implements Callable, 2Lh {
    public static final Object A03 = ListenableFuture.class;
    public final C00i A02 = new 1BQ(66204);
    public final C00i A00 = new 1BQ(16616);
    public final C00i A01 = new 1BV(17105);

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        return ((C2s4) this.A01.get()).A00(new 69G(r302, this), null, (ListenableFuture) obj2);
    }

    public String B5Q() {
        return "network_detailed_info";
    }

    public int B5R() {
        return 13;
    }

    public Class BBP() {
        return ListenableFuture.class;
    }

    public Class BC4() {
        return Void.class;
    }

    public boolean BS6(2Lc r302) {
        return true;
    }

    public /* bridge */ /* synthetic */ Object D0r(int i, int i2) {
        return ((C2s4) this.A01.get()).A01(this);
    }

    public /* bridge */ /* synthetic */ Object D1A(int i, int i2) {
        return null;
    }

    public /* bridge */ /* synthetic */ void D2e(Object obj) {
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        return ((2Ag) this.A02.get()).Ayv();
    }
}

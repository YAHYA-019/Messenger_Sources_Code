package X;

import android.app.ActivityManager;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: X.2s3, reason: invalid class name */
/* loaded from: 2s3.class */
public final class C2s3 extends 2Lg implements Callable {
    public static final Object A03 = Future.class;
    public Context A00;
    public final C00i A01;
    public final C00i A02;

    public C2s3() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A00 = context;
        this.A01 = new 1HH(context, 100171);
        this.A02 = new 1BV(17105);
    }

    public /* bridge */ /* synthetic */ Object A02() {
        return ((C2s4) this.A02.get()).A01(this);
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        return r302.A0D != null ? 1hM.A01 : ((C2s4) this.A02.get()).A00(new 5rF(r302), (ListenableFuture) obj, (ListenableFuture) obj2);
    }

    public String B5Q() {
        return "memory_stats";
    }

    public int B5R() {
        return 5;
    }

    public Class BBP() {
        return Future.class;
    }

    public boolean BS6(2Lc r302) {
        return true;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        return new 2tA((ActivityManager) this.A01.get());
    }
}

package X;

import com.facebook.inject.FbInjector;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.39f, reason: invalid class name */
/* loaded from: 39f.class */
public final class C39f extends 2Lg {
    public final C00i A02 = FbInjector.A00;
    public C0eq A01 = null;
    public C3Te A00 = null;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.RLw, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A02() {
        ?? obj = new Object();
        C3Te c3Te = this.A00;
        if (c3Te == null) {
            c3Te = new C3Te();
            this.A00 = c3Te;
        }
        ((RLw) obj).A00 = c3Te.A07(1BK.A04(this.A02));
        ((RLw) obj).A01 = this.A00.A05();
        ((RLw) obj).A02 = this.A00.A06();
        return (Object) obj;
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        RLw rLw = (RLw) obj;
        RLw rLw2 = (RLw) obj2;
        if (rLw != null && rLw2 != null) {
            C0eq c0eq = this.A01;
            if (c0eq == null) {
                c0eq = new C0eq();
                this.A01 = c0eq;
            }
            r302.AxQ().A06("cpu_vendor", c0eq.A01);
            r302.AxQ().A06("cpu_name", c0eq.A00);
            int i = rLw.A00;
            int i2 = (-1) << (-1);
            if (i != i2) {
                r302.AxQ().A02("battery_temp", i);
                r302.AxQ().A02("battery_temp_inc", rLw2.A00 - i);
            }
            int i3 = rLw.A01;
            if (i3 != i2) {
                r302.AxQ().A02("cpu_temp", i3);
                r302.AxQ().A02("cpu_temp_inc", rLw2.A01 - i3);
            }
            int i4 = rLw.A02;
            if (i4 != i2) {
                r302.AxQ().A02("gpu_temp", i4);
                r302.AxQ().A02("gpu_temp_inc", rLw2.A02 - i4);
            }
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "thermal_stats";
    }

    public int B5R() {
        return 21;
    }

    public Class BBP() {
        return RLw.class;
    }

    public boolean BS6(2Lc r302) {
        return r302.A08;
    }
}

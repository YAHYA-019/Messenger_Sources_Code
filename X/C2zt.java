package X;

import android.content.Context;

/* renamed from: X.2zt, reason: invalid class name */
/* loaded from: 2zt.class */
public final class C2zt implements 29I {
    public final C3lz A00;
    public final C2lo A01 = new Object();
    public final C00m A02;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2lo, java.lang.Object] */
    public C2zt(C3lz c3lz, C00m c00m) {
        this.A02 = c00m;
        this.A00 = c3lz;
    }

    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        11T.A0F(context, 0);
        C2lo c2lo = this.A01;
        c2lo.A00 = context;
        try {
            return this.A00.ABq(c2lo, obj, obj3);
        } finally {
            c2lo.A00 = null;
        }
    }

    public String AhU() {
        return 0Pz.A0W("binder:", (String) this.A02.invoke());
    }

    public Class BHc() {
        return this.A00.getClass();
    }

    public boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return this.A00.Cyz(obj, obj2, obj3, obj4);
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C2md c2md = (C2md) obj4;
        11T.A0F(context, 0);
        C2lo c2lo = this.A01;
        c2lo.A00 = context;
        if (c2md != null) {
            try {
                c2md.A00.invoke();
            } finally {
                c2lo.A00 = null;
            }
        }
    }
}

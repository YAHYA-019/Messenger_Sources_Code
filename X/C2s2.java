package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.2s2, reason: invalid class name */
/* loaded from: 2s2.class */
public final class C2s2 extends 2Lg {
    public final C00i A01 = new 1BQ(33098);
    public final C00i A00 = new 1BQ(16385);

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        C00i c00i;
        if (obj != null && obj2 != null && (c00i = this.A01) != null) {
            r302.AxQ().A06("is_free_mode", Boolean.valueOf(((1vL) c00i.get()).A0T()));
            r302.AxQ().A06("free_carrier_id", ((1vL) c00i.get()).A0A());
            C00i c00i2 = this.A00;
            if (((2yD) c00i2.get()).AZk(36325179827179902L)) {
                r302.AxQ().A06("zero_balance_state", ((1vL) c00i.get()).A0D());
            }
            if (((2yD) c00i2.get()).AZk(36325179827245439L)) {
                r302.AxQ().A06("eligibility_hash", ((1vL) c00i.get()).A0C());
            }
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "free_mode_stats";
    }

    public int B5R() {
        return 43;
    }

    public Class BBP() {
        return C03133x7.class;
    }

    public boolean BS6(2Lc r302) {
        return r302.A01;
    }
}

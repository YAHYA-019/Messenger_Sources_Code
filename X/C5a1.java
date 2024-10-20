package X;

import com.mapbox.mapboxsdk.location.LocationComponentOptions;

/* renamed from: X.5a1, reason: invalid class name */
/* loaded from: 5a1.class */
public final class C5a1 {
    public final 1Br A01 = 1Bq.A00(49412);
    public final 1Br A00 = 1Bq.A00(99390);

    public final void A00(long j) {
        if (j <= 0) {
            throw AnonymousClass001.A0L("Should only be called for One-to-one threads!");
        }
        String valueOf = String.valueOf(j);
        C00i c00i = this.A01.A00;
        C12044yi c12044yi = (C12044yi) c00i.get();
        Integer num = 0S2.A0C;
        long now = ((C0dp) this.A00.A00.get()).now() - c12044yi.A04(7ZN.A00(num), valueOf);
        C12044yi c12044yi2 = (C12044yi) c00i.get();
        if (now <= LocationComponentOptions.STALE_STATE_DELAY_MS) {
            c12044yi2.A06(7ZN.A00(num), valueOf);
            return;
        }
        String A00 = 7ZN.A00(num);
        1Ql edit = c12044yi2.A01.edit();
        edit.CaE(C12044yi.A00(A00, valueOf), 1);
        edit.CaH(C12044yi.A01(A00, valueOf), c12044yi2.A00.now());
        edit.commit();
        C12044yi.A02(c12044yi2);
    }
}

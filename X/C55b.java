package X;

import android.text.TextUtils;

/* renamed from: X.55b, reason: invalid class name */
/* loaded from: 55b.class */
public final class C55b implements 55Q {
    public static C5z5 A00(1Iw r301, C55c c55c) {
        8TR A00 = C5z5.A00(r301);
        A00.A2a(c55c.A0A);
        String str = c55c.A07;
        C5z5 c5z5 = A00.A01;
        c5z5.A05 = str;
        c5z5.A08 = c55c.A0B;
        c5z5.A01 = c55c.A02;
        c5z5.A02 = c55c.A03;
        c5z5.A06 = c55c.A08;
        A00.A2Z(c55c.A05);
        c5z5.A03 = c55c.A04;
        c5z5.A00 = c55c.A00;
        C26z c26z = C26z.LEFT;
        2RH r0 = c55c.A06;
        A00.A24(c26z, r0 != null ? 4YU.A00(r0) : 0.0f);
        String str2 = c55c.A09;
        if (!TextUtils.isEmpty(str2)) {
            A00.A2S(str2);
        }
        return A00.A2W();
    }

    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        return A00(r302, (C55c) anonymousClass544);
    }

    public Class BDi() {
        return C55c.class;
    }
}

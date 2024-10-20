package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4y5, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4y5.class */
public final class C11944y5 {
    public final 1Br A00 = 1Bq.A00(99390);
    public final 1Br A02 = 1Bq.A00(65997);
    public final 1Br A04 = 1Bu.A00(65998);
    public final 1Br A03 = 1Bu.A00(66524);
    public final 1Br A01 = 1Bq.A00(33013);

    public static final void A00(C11944y5 c11944y5) {
        1Ql A08 = 1Br.A08(c11944y5.A01);
        A08.CaH(4YV.A0Y(c11944y5.A04.A00, 1NK.A5v), 1Br.A00(c11944y5.A00));
        A08.commitImmediately();
    }

    public static final boolean A01(C11944y5 c11944y5) {
        long A02 = c11944y5.A02();
        C1ud c1ud = (C1ud) 1Br.A0B(c11944y5.A02);
        boolean A1P = AnonymousClass001.A1P(((1Br.A00(c11944y5.A00) - A02) > (C1ud.A00(c1ud).Av9(c1ud.A02, 36597901664063267L) * 60000) ? 1 : ((1Br.A00(c11944y5.A00) - A02) == (C1ud.A00(c1ud).Av9(c1ud.A02, 36597901664063267L) * 60000) ? 0 : -1)));
        0fH.A0j(1BJ.A00(821), A1P ? "passed cooldown check" : "not passed cooldown check");
        return A1P;
    }

    public final long A02() {
        return ((FbSharedPreferences) this.A01.A00.get()).Av1(C1wg.A03(1NK.A5v, (C1wg) this.A04.A00.get()), 0L);
    }
}

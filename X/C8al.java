package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8al, reason: invalid class name */
/* loaded from: 8al.class */
public final class C8al extends 1LH {
    public final int A00;
    public final long A01;
    public final 1Br A02 = 1Bq.A00(49709);
    public final 9In A03;
    public final MigColorScheme A04;

    public C8al(9In r302, MigColorScheme migColorScheme, int i, long j) {
        this.A04 = migColorScheme;
        this.A03 = r302;
        this.A00 = i;
        this.A01 = j;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A04;
        2lO A0T = 7zT.A0T((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C9zj.A01(A0L, migColorScheme, 7zS.A0l(AeS, migColorScheme, A1W), this, 59);
        8Tn A09 = 8Tn.A09(AeS, migColorScheme);
        String A0A = 3yH.A0A(A0L, 7zN.A0t((5Ou) 1Br.A0B(this.A02), 0S2.A0R, this.A01), 2131957718);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Resources A0E = 4YU.A0E(AeS);
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) 4YV.A0o(A0E, this.A00, 2131820617)).append((CharSequence) "\n\n").append((CharSequence) 9C7.A00(A0E, new C1360Af2(AQn.A01(this, 48), migColorScheme.Atv(), A1W ? 1 : 0), 3yH.A09(A0L, 2131957716), 3yH.A09(A0L, 2131957717), "[[learn-more]]"));
        11T.A0A(append);
        A09.A2Y(new 8NJ(C9py.A02(3yH.A09(A0L, 2131957715), this, 108), 9Di.A01(migColorScheme), append, (CharSequence) null, A0A, (List) null, true));
        return 8Tn.A06(A0L, c2k5, A0T, A09);
    }
}

package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8gr, reason: invalid class name */
/* loaded from: 8gr.class */
public final class C8gr extends 1LH {
    public final int A00;
    public final boolean A01;
    public final long A02;
    public final 5zD A03;
    public final MigColorScheme A04;
    public final CharSequence A05;
    public final boolean A06;

    public C8gr(5zD r302, MigColorScheme migColorScheme, CharSequence charSequence, int i, long j, boolean z, boolean z2) {
        1BL.A11(1, charSequence, migColorScheme, r302);
        this.A05 = charSequence;
        this.A00 = i;
        this.A04 = migColorScheme;
        this.A03 = r302;
        this.A02 = j;
        this.A06 = z;
        this.A01 = z2;
    }

    public static final SpannableStringBuilder A01(C2k6 c2k6, C00m c00m) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(0Pz.A0W("... ", 3yH.A09(c2k6, 2131964166)));
        spannableStringBuilder.setSpan(new StyleSpan(1), 4, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new 8Br(c00m, 6), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, AMJ.A00);
        CharSequence charSequence = this.A05;
        if (AnonymousClass001.A1O(charSequence.length())) {
            return null;
        }
        if (this.A06) {
            SpannableStringBuilder A01 = A01(c2k5, AQl.A01(A00, 0));
            Object A002 = 2rO.A00(c2k5, AQg.A00(this, A00, 25), new Object[]{A00});
            11T.A0A(A002);
            C6n3 c6n3 = (C6n3) A002;
            85A A012 = C6n2.A01(c2k5.A05);
            A012.A2Z(charSequence);
            C6n2 c6n2 = A012.A01;
            c6n2.A06 = A01;
            A012.A0N();
            A012.A2Y(c6n3);
            5zD r0 = this.A03;
            A012.A2X(r0);
            c6n2.A01 = this.A01 ? 0 : this.A04.B4i();
            return new 8dL(A012.A2W(), r0, c6n3, this.A04, true);
        }
        2lQ r02 = 2lO.A02;
        2lO A0d = 7zS.A0d(7zS.A0c((2lO) null, 0S2.A0u, true), charSequence);
        int B4i = this.A04.B4i();
        long j = this.A02;
        SpannableStringBuilder A013 = A01(c2k5, new AKJ(A00, 49));
        int i = 7zP.A1V(A00) ? this.A00 : (-1) >>> 1;
        2KG r03 = 2KG.A04;
        Typeface typeface = Typeface.DEFAULT;
        long A08 = 7zP.A08();
        3yF A0v = 7zM.A0v(c2k5.A05, charSequence, 0);
        7zS.A1N(c2k5, A0v, B4i, j);
        A0v.A33(0);
        7zU.A0y(typeface, c2k5, A0v, A08);
        A0v.A38(r03);
        7zS.A1W(A0v, false);
        A0v.A2u(i);
        A0v.A2b();
        7zO.A1R(A0v, true, false);
        A0v.A01.A0b = A013;
        A0v.A2a();
        A0v.A1w(null);
        return 7zQ.A0c(A0d, A0v);
    }
}

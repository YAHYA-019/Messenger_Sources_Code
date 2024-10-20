package X;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.8gp, reason: invalid class name */
/* loaded from: 8gp.class */
public final class C8gp extends 1LH {
    public static final CallerContext A06 = CallerContext.A0B("CustomThemeLargeTileComponent");
    public final Drawable A00;
    public final Drawable A01;
    public final Uri A02;
    public final 9W4 A03;
    public final boolean A04;
    public final String A05;

    public C8gp(Drawable drawable, Drawable drawable2, Uri uri, 9W4 r305, String str, boolean z) {
        11T.A0F(str, 2);
        this.A03 = r305;
        this.A05 = str;
        this.A02 = uri;
        this.A01 = drawable;
        this.A04 = z;
        this.A00 = drawable2;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI r0 = (1LI) AQs.A01(c2k5, this, 7zL.A1Z(c2k5), 6);
        2lQ r02 = 2lO.A02;
        2lO A0K = 4YV.A0K(4YV.A0K(4YV.A0K((2lO) null, 0S2.A01, 3yH.A06(c2k5, 2132279412)), 0S2.A00, 3yH.A06(c2k5, R.dimen.mapbox_minimum_scale_span_when_rotating)), 0S2.A0A, 7zM.A09(c2k5));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r03 = A0L.A00;
        8Tm A00 = C8mf.A00(A0L.AeS());
        9W4 r04 = this.A03;
        A00.A2a(r04.A07);
        A00.A2X();
        Resources A0E = 4YU.A0E(r03);
        A00.A2Z(A0E.getDimension(R.dimen.mapbox_four_dp));
        A00.A0C(A0E.getDimensionPixelSize(R.dimen.mapbox_minimum_scale_span_when_rotating));
        A00.A1L(A0E.getDimensionPixelSize(2132279349));
        8Tm.A07(A00, r0, A0L);
        String str = this.A05;
        long A062 = 3yH.A06(A0L, 2132279348);
        int i = r04.A0C;
        Typeface typeface = Typeface.DEFAULT;
        long A08 = 7zP.A08();
        3yF A0v = 7zM.A0v(r03, str, 0);
        7zS.A1Q(A0L, A0v, i, A062);
        A0v.A33(0);
        A0v.A34(typeface);
        7zU.A1H(A0L, A0v, 0, A08);
        7zP.A1D(A0v);
        A0v.A2u(1);
        7zS.A1V(A0v, false);
        7zR.A13((2K8) null, A0L, A0v);
        return C2so.A05(A0L, c2k5, A0K);
    }
}

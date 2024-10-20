package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.8ii, reason: invalid class name */
/* loaded from: 8ii.class */
public final class C8ii extends 2Kb {
    public final Drawable A00;
    public final Uri A01;
    public final 1Im A02;
    public final 1Im A03;
    public final 1Im A04;
    public final 1Im A05;
    public final CharSequence A08;
    public final int A07 = R.dimen.mapbox_eight_dp;
    public final int A06 = 2132279398;

    public C8ii(Drawable drawable, Uri uri, 1Im r304, 1Im r305, 1Im r306, 1Im r307, CharSequence charSequence) {
        this.A00 = drawable;
        this.A01 = uri;
        this.A08 = charSequence;
        this.A02 = r304;
        this.A04 = r305;
        this.A05 = r306;
        this.A03 = r307;
    }

    public C2lt A0s(2lX r302) {
        11T.A0F(r302, 0);
        A2r a2r = A2r.A00;
        C2ll A0r = 7zQ.A0r(r302, new C2lk(C29N.A00, RwC.A00, 15, true), AVF.A01(this, 37));
        2lQ r0 = 2lO.A02;
        long A06 = 3yH.A06(r302, this.A07);
        long A062 = 3yH.A06(r302, this.A06);
        Integer num = 0S2.A04;
        2lO A0V = 7zT.A0V((2lO) null, 7zL.A0i(num, A062), A06);
        CharSequence charSequence = this.A08;
        if (charSequence != null) {
            A0V = 7zS.A0d(A0V, charSequence);
        }
        return new C2lt(7zQ.A0Z(4YV.A0L(4YV.A0L(7zR.A0R(A0V, AVF.A01(this, 38), 1), 0S2.A03, AVF.A01(this, 39), 1), num, AVF.A01(this, 40), 1), 0S2.A0Y, AVF.A01(this, 41)), a2r, A0r);
    }
}

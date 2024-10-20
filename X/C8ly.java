package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.8ly, reason: invalid class name */
/* loaded from: 8ly.class */
public final class C8ly extends C1rj {
    public static final CallerContext A02 = CallerContext.A0B("InstantGameFloatingArcadeIconComponentSpec");
    public Fcg A00;
    public boolean A01;

    public C8ly() {
        super("InstantGameFloatingArcadeIconComponent");
    }

    public final Object[] A0k() {
        return 7zN.A1b(this.A00, this.A01);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Fcg fcg = this.A00;
        boolean z = this.A01;
        11T.A0H(r302, fcg);
        1Bi.A03(83603);
        int i = 0;
        Context context = r302.A0D;
        Drawable A05 = fcg.A05(context, 3Eh.A0y);
        11T.A0A(A05);
        2cM A00 = z ? 2cK.A00(r302) : C1rg.A00(r302);
        int color = context.getColor(2132213801);
        float A002 = C0A8.A00(context, 2.1322794E9f);
        A00.A2Z(C1ro.CENTER);
        A00.A2a(C1rp.CENTER);
        A00.A1M(2132279321);
        A00.A1W(2132279328);
        C9da.A01(A00, A002, color);
        A00.A2B(C26z.VERTICAL, R.dimen.mapbox_eight_dp);
        C26z c26z = C26z.END;
        if (!z) {
            i = 2132279306;
        }
        A00.A2B(c26z, i);
        A00.A1J(2131958255);
        C2cm A003 = C2cl.A00(r302);
        A003.A2b(A05);
        A003.A2Z(2132213798);
        A00.A2X(7zL.A0J(A003));
        1LI A2V = A00.A2V();
        11T.A0A(A2V);
        return A2V;
    }
}

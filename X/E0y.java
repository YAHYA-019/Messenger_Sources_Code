package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: E0y.class */
public final class E0y extends 3Fn {
    public final C00i A00;
    public final C00i A01;
    public final AnonymousClass622 A02;
    public final C6eP A03;
    public final FbUserSession A04;
    public final 5zD A05;
    public final 6Az A06;
    public final 7Wh A07;

    public E0y(FbUserSession fbUserSession, C00i c00i, C00i c00i2, 5zD r305, 6Az r306, AnonymousClass622 anonymousClass622, C6eP c6eP, 7Wh r309) {
        1BL.A11(1, fbUserSession, c00i, c00i2);
        this.A04 = fbUserSession;
        this.A03 = c6eP;
        this.A00 = c00i;
        this.A01 = c00i2;
        this.A02 = anonymousClass622;
        this.A06 = r306;
        this.A07 = r309;
        this.A05 = r305;
    }

    private final void A00(View view, C6eP c6eP) {
        7Wh r309;
        6Az r0 = this.A06;
        if (r0 == null || !(c6eP instanceof C63i)) {
            FbUserSession fbUserSession = this.A04;
            AnonymousClass622 anonymousClass622 = this.A02;
            r309 = this.A07;
            c6eP.ACM(view, fbUserSession, this.A05, anonymousClass622, r309);
        } else {
            AnonymousClass622 anonymousClass6222 = this.A02;
            r309 = this.A07;
            ((C63i) c6eP).ACH(view, this.A05, r0, anonymousClass6222, r309);
        }
        if (view instanceof GFC) {
            ((GFC) view).Cwl(r309);
        }
    }

    public /* bridge */ /* synthetic */ void A01(View view) {
        DPA dpa = (DPA) view;
        11T.A0F(dpa, 0);
        try {
            View view2 = dpa.A01;
            if (view2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A00(view2, this.A03);
            dpa.A00(false);
        } catch (Exception e) {
            ((9XZ) this.A01.get()).A00(this.A02.A03, e);
            C63j c63j = (C63j) this.A00.get();
            if (!(c63j instanceof C6eP)) {
                throw e;
            }
            C6eP c6eP = (C6eP) c63j;
            if (dpa.A00 == null) {
                View ALJ = c6eP.ALJ(dpa);
                boolean z = false;
                if (dpa.A01 != dpa.A02) {
                    z = true;
                    dpa.removeAllViews();
                }
                dpa.A00 = ALJ;
                if (z) {
                    dpa.addView(ALJ, new ViewGroup.LayoutParams(-2, -2));
                    dpa.A02 = ALJ;
                }
            }
            View view3 = dpa.A00;
            if (view3 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A00(view3, c6eP);
            dpa.A00(true);
        }
    }
}

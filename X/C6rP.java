package X;

import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.6rP, reason: invalid class name */
/* loaded from: 6rP.class */
public final class C6rP extends C1rj {
    public static final int A03 = 3yG.A01(32.0f);
    public int A00;
    public 7RU A01;
    public MigColorScheme A02;

    public C6rP() {
        super("MigGlyphFavicon");
        this.A00 = A03;
    }

    public static C85w A00(1Iw r301) {
        return new C85w(r301, new C6rP());
    }

    public final Object[] A0k() {
        return 1BK.A1a(this.A02, this.A01, this.A00);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        7RU r0 = this.A01;
        MigColorScheme migColorScheme = this.A02;
        int i = this.A00;
        LayerDrawable A00 = 7RV.A00(r302.A0D.getResources(), (C1u2) 1Bi.A03(16839), r0, migColorScheme);
        if (A00 == null) {
            return null;
        }
        C2cq A002 = C2cp.A00(r302, 0);
        A002.A0C(i);
        A002.A1L(i);
        A002.A2a(A00);
        A002.A2b(ImageView.ScaleType.CENTER_INSIDE);
        return A002.A2W();
    }
}

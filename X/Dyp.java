package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Dyp.class */
public final class Dyp extends C1rj {
    public View.OnClickListener A00;
    public C1p8 A01;
    public MigColorScheme A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;

    public Dyp() {
        super("MigListCheckbox");
        this.A05 = true;
    }

    public static Duc A00(1Iw r301) {
        return new Duc(r301, new Dyp());
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A04), this.A00, this.A02, this.A03, Boolean.valueOf(this.A05), this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1u3 c1u3;
        C1u4 c1u4;
        int i;
        boolean z = this.A04;
        MigColorScheme migColorScheme = this.A02;
        C1p8 c1p8 = this.A01;
        View.OnClickListener onClickListener = this.A00;
        boolean z2 = this.A05;
        CharSequence charSequence = this.A03;
        F4h f4h = (F4h) 1Bn.A0A(99488);
        C2cq A00 = C2cp.A00(r302, 0);
        C1u2 c1u2 = (C1u2) f4h.A00.get();
        if (z) {
            c1u3 = F4h.A01;
            c1u4 = F4h.A03;
            if (!z2) {
                i = migColorScheme.Ahs();
                A00.A2a(c1u2.A09(c1u3, c1u4, i));
                A00.A0z(32.0f);
                A00.A0l(32.0f);
                A00.A2T((onClickListener == null && z2) ? 1LI.A09(r302, Dyp.class, "MigListCheckbox", 1137737702) : null);
                A00.A2S(charSequence);
                A00.A1r(1LI.A03(r302, Dyp.class, "MigListCheckbox"));
                A00.A0F("android.widget.CompoundButton");
                A00.A2Q(true);
                return A00.A2W();
            }
            if (c1p8 == null) {
                c1p8 = F4h.A04;
            }
        } else {
            c1u3 = F4h.A02;
            c1u4 = F4h.A03;
            c1p8 = F4h.A05;
        }
        i = migColorScheme.Chx(c1p8);
        A00.A2a(c1u2.A09(c1u3, c1u4, i));
        A00.A0z(32.0f);
        A00.A0l(32.0f);
        A00.A2T((onClickListener == null && z2) ? 1LI.A09(r302, Dyp.class, "MigListCheckbox", 1137737702) : null);
        A00.A2S(charSequence);
        A00.A1r(1LI.A03(r302, Dyp.class, "MigListCheckbox"));
        A00.A0F("android.widget.CompoundButton");
        A00.A2Q(true);
        return A00.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 466811311) {
            if (i != 1137737702) {
                return null;
            }
            1Is r0 = r302.A00.A01;
            View view = ((3xC) obj).A00;
            View.OnClickListener onClickListener = ((Dyp) r0).A00;
            if (onClickListener == null) {
                return null;
            }
            onClickListener.onClick(view);
            return null;
        }
        F5R f5r = (F5R) obj;
        1Is r02 = r302.A00.A01;
        View view2 = f5r.A00;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
        0Cs r03 = f5r.A01;
        boolean z = ((Dyp) r02).A04;
        r03.A0a(view2, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.A0A(true);
        accessibilityNodeInfoCompat.A0B(z);
        return null;
    }
}

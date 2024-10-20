package X;

import android.R;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* renamed from: X.5wz, reason: invalid class name */
/* loaded from: 5wz.class */
public final class C5wz extends C1rj {
    public 1LI A00;
    public 55J A01;

    public C5wz() {
        super("ClickListItemDecorationLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C5wz c5wz = (C5wz) super.A0l();
        c5wz.A00 = 4YV.A0J(c5wz.A00);
        return c5wz;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r0 = this.A00;
        55J r02 = this.A01;
        11T.A0F(r302, 0);
        11T.A0F(r0, 1);
        11T.A0F(r02, 2);
        C1rq A01 = C1rg.A01(r302, null, 0);
        2dD A00 = C2dB.A00(r302);
        A00.A2X(r0);
        A00.A1N(0);
        A01.A2f(A00.A2W());
        A01.A0j(1.0f);
        A01.A2Q(true);
        1Im r312 = null;
        A01.A2T(r02.A02 == null ? null : 1LI.A02(r302, C5wz.class, 0S2.A01, "ClickListItemDecorationLayout", (Object[]) null, -1351902487));
        if (r02.A03 != null) {
            r312 = 1LI.A02(r302, C5wz.class, 0S2.A01, "ClickListItemDecorationLayout", (Object[]) null, 71235917);
        }
        A01.A1q(r312);
        A01.A1r(1LI.A02(r302, C5wz.class, 0S2.A01, "ClickListItemDecorationLayout", (Object[]) null, 466811311));
        Drawable drawable = r02.A01;
        if (drawable != null) {
            A01.A0D(drawable);
        } else {
            A01.A1G(R.attr.selectableItemBackground);
        }
        String str = r02.A05;
        if (str != null) {
            A01.A0F(str);
        }
        CharSequence charSequence = r02.A04;
        if (charSequence != null) {
            A01.A2S(charSequence);
        }
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1351902487:
                1Is r0 = r302.A00.A01;
                View view = ((3xC) obj).A00;
                55J r02 = ((C5wz) r0).A01;
                11T.A0F(r02, 1);
                11T.A0F(view, 2);
                C5ww c5ww = r02.A02;
                if (c5ww == null) {
                    return null;
                }
                c5ww.onClick(view);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 71235917:
                1Is r03 = r302.A00.A01;
                View view2 = ((C03173xD) obj).A00;
                55J r04 = ((C5wz) r03).A01;
                11T.A0F(r04, 1);
                11T.A0F(view2, 2);
                C5wx c5wx = r04.A03;
                return Boolean.valueOf(c5wx != null ? c5wx.onLongClick(view2) : false);
            case 466811311:
                F5R f5r = (F5R) obj;
                1Is r05 = r302.A00.A01;
                View view3 = f5r.A00;
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
                0Cs r06 = f5r.A01;
                55J r07 = ((C5wz) r05).A01;
                11T.A0F(r07, 1);
                11T.A0F(view3, 2);
                11T.A0F(accessibilityNodeInfoCompat, 3);
                11T.A0F(r06, 4);
                r06.A0a(view3, accessibilityNodeInfoCompat);
                boolean z = r07.A06;
                accessibilityNodeInfoCompat.A0A(z);
                if (!z) {
                    return null;
                }
                accessibilityNodeInfoCompat.A0B(r07.A07);
                return null;
            default:
                return null;
        }
    }
}

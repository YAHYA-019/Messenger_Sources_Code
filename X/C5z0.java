package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.5z0, reason: invalid class name */
/* loaded from: 5z0.class */
public final class C5z0 extends C1rj {
    public int A00;
    public int A01;
    public Drawable A02;
    public AnonymousClass553 A03;
    public AnonymousClass553 A04;
    public MigColorScheme A05;
    public CharSequence A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public C5z0() {
        super("MigTitleBarButtonComponent");
        this.A08 = true;
    }

    public static C83t A00(1Iw r301) {
        return new C83t(r301, new C5z0());
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A05, this.A06, Boolean.valueOf(this.A07), this.A02, Boolean.valueOf(this.A08), null, this.A04, Boolean.valueOf(this.A09), Boolean.valueOf(this.A0A), Integer.valueOf(this.A00), Integer.valueOf(this.A01)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int AYw;
        C5z4 c5z4 = (C5z4) r302.A06().A00();
        MigColorScheme migColorScheme = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        Drawable drawable = this.A02;
        CharSequence charSequence = this.A06;
        boolean z = this.A08;
        AnonymousClass553 anonymousClass553 = this.A03;
        AnonymousClass553 anonymousClass5532 = this.A04;
        boolean z2 = this.A09;
        boolean z3 = this.A07;
        boolean z4 = c5z4.A01;
        C2iw c2iw = c5z4.A00;
        int i3 = 0;
        11T.A0F(migColorScheme, 1);
        11T.A0F(c2iw, 12);
        if (z2 && !z4 && r302.A02 != null) {
            r302.A0G(new C2l4(4YU.A1b(true), 0), "updateState:MigTitleBarButtonComponent.updateInitializedState");
        }
        C2cm A00 = C2cl.A00(r302);
        A00.A2K("title_bar_icon");
        A00.A2c(ImageView.ScaleType.CENTER);
        A00.A0C(i);
        A00.A1L(i);
        A00.A2b(drawable);
        float f = i / 2.0f;
        if (z3) {
            i3 = migColorScheme.B9I();
            AYw = migColorScheme.B9I();
        } else {
            AYw = migColorScheme.AYw();
        }
        A00.A0D(C2cn.A00(f, i3, AYw));
        int Ahu = ((C1pD) 1Bi.A03(66708)).A00() ? migColorScheme.Ahu() : migColorScheme.AqM();
        if (!z) {
            i2 = Ahu;
        }
        A00.A2X(i2);
        A00.A0F("android.widget.Button");
        A00.A2S(charSequence);
        A00.A2Q(z4);
        1Im r322 = null;
        A00.A2T(anonymousClass553 != null ? 1LI.A02(r302, C5z0.class, 0S2.A01, "MigTitleBarButtonComponent", new Object[]{anonymousClass553}, -1351902487) : null);
        if (anonymousClass5532 != null) {
            r322 = 1LI.A02(r302, C5z0.class, 0S2.A01, "MigTitleBarButtonComponent", (Object[]) null, 71235917);
        }
        A00.A1q(r322);
        Integer num = 0S2.A01;
        A00.A1v(1LI.A02(r302, C5z0.class, num, "MigTitleBarButtonComponent", (Object[]) null, 1803022739));
        A00.A1r(1LI.A02(r302, C5z0.class, num, "MigTitleBarButtonComponent", (Object[]) null, -1933296085));
        A00.A1w(c2iw);
        A00.A0J();
        C2cl c2cl = A00.A00;
        11T.A0A(c2cl);
        return c2cl;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1933296085:
                F5R f5r = (F5R) obj;
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                0Cs r04 = f5r.A01;
                View view = f5r.A00;
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
                C5z0 c5z0 = (C5z0) r02;
                C5z4 c5z4 = (C5z4) r03.A06().A00();
                boolean z = c5z0.A0A;
                boolean z2 = c5z4.A01;
                11T.A0F(r04, 2);
                11T.A0F(view, 3);
                11T.A0F(accessibilityNodeInfoCompat, 4);
                r04.A0a(view, accessibilityNodeInfoCompat);
                if (!z2 || !z || !AnonymousClass524.A01(r03.A0D, true)) {
                    return null;
                }
                view.performAccessibilityAction(64, null);
                if (r03.A02 == null) {
                    return null;
                }
                r03.A0G(new C2l4(new Object[]{false}, 0), "updateState:MigTitleBarButtonComponent.updateInitializedState");
                return null;
            case -1351902487:
                View view2 = ((3xC) obj).A00;
                AnonymousClass553 anonymousClass553 = (AnonymousClass553) r302.A03[0];
                11T.A0F(view2, 1);
                11T.A0F(anonymousClass553, 2);
                anonymousClass553.onClick(view2);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 71235917:
                1Is r05 = r302.A00.A01;
                View view3 = ((C03173xD) obj).A00;
                AnonymousClass553 anonymousClass5532 = ((C5z0) r05).A04;
                11T.A0F(view3, 2);
                if (anonymousClass5532 != null) {
                    anonymousClass5532.onClick(view3);
                }
                return AnonymousClass001.A0K();
            case 1803022739:
                11T.A0F(((C5z4) r302.A00.A00.A06().A00()).A00, 2);
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2iw, java.lang.Object] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C5z4 c5z4 = (C5z4) r303;
        ?? obj = new Object();
        c5z4.A01 = true;
        c5z4.A00 = obj;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}

package X;

import android.graphics.drawable.Drawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.5yu, reason: invalid class name */
/* loaded from: 5yu.class */
public abstract class C5yu {
    public static final int A00 = 2RH.A04.A00();

    public 1LI A01(1Iw r302, int i, int i2) {
        if (this instanceof C5z2) {
            C5z2 c5z2 = (C5z2) this;
            11T.A0F(r302, 0);
            AwM awM = new AwM(r302, new B0E());
            CharSequence charSequence = c5z2.A03;
            B0E b0e = awM.A01;
            b0e.A03 = charSequence;
            BitSet bitSet = awM.A02;
            bitSet.set(1);
            b0e.A02 = c5z2.A04;
            awM.A2W(c5z2.A06);
            b0e.A00 = c5z2.A00;
            b0e.A01 = c5z2.A01;
            bitSet.set(0);
            awM.A2S(c5z2.A02);
            awM.A2K(c5z2.A05);
            C1rs.A05(bitSet, awM.A03, 2);
            awM.A0J();
            return b0e;
        }
        if (this instanceof C5z1) {
            C5z1 c5z1 = (C5z1) this;
            11T.A0F(r302, 0);
            2QC r0 = c5z1.A00;
            if (r0 == null) {
                return C5z1.A00(r302, c5z1, i, i2);
            }
            2zC A002 = 2cT.A00(r302);
            A002.A2a(C5z1.A00(r302, c5z1, i, i2));
            A002.A2b(r0);
            A002.A2c(c5z1.A01);
            A002.A2Y(i2);
            A002.A0k(0.0f);
            A002.A2X(4.0f);
            return A002.A2W();
        }
        if (this instanceof 6lR) {
            11T.A0F(r302, 0);
            return ((6lR) this).A00.A01(r302, i, i2);
        }
        C5z3 c5z3 = (C5z3) this;
        11T.A0F(r302, 0);
        C83t A003 = C5z0.A00(r302);
        float f = i2;
        A003.A2X(f);
        int i3 = c5z3.A00;
        A003.A2Y(i3);
        A003.A2Z(i);
        A003.A2b(c5z3.A05);
        AnonymousClass553 anonymousClass553 = c5z3.A03;
        C5z0 c5z0 = A003.A01;
        c5z0.A03 = anonymousClass553;
        A003.A2K(c5z3.A06);
        A003.A0E(null);
        MigColorScheme migColorScheme = c5z3.A04;
        A003.A2a(migColorScheme);
        A003.A2c(c5z3.A07);
        A003.A0F("android.widget.Button");
        Drawable A0B = r302.A0E.A0B(i3);
        2QC r02 = c5z3.A01;
        C7f2 c7f2 = c5z3.A02;
        if (A0B != null && r02 != null) {
            int i4 = i2 / 2;
            int i5 = (-i2) / 8;
            if (c7f2 != null) {
                i4 = (int) (c7f2.A00 * f);
                i5 = (int) (f * c7f2.A01);
            }
            Drawable A004 = 2dG.A00(r302.A0D, r02, new 2Rg(A0B, i4, i5, 0, 0, false), migColorScheme);
            11T.A0A(A004);
            c5z0.A02 = A004;
        }
        return A003.A2V();
    }

    public String A02() {
        String str;
        String str2;
        if (this instanceof C5z2) {
            str = "MigTitleBarActionTextButton(testKey=";
            str2 = ((C5z2) this).A05;
        } else if (this instanceof C5z1) {
            str = "MigTitleBarActionButton(testKey=";
            str2 = ((C5z1) this).A02;
        } else if (this instanceof 6lR) {
            str = "MigTitleBarThreadDecorator(delegate=";
            str2 = ((6lR) this).A00.A02();
        } else {
            str = "TitleBarActionWithBadgeButton(testKey=";
            str2 = ((C5z3) this).A06;
        }
        return 0Pz.A0X(str, str2, ')');
    }
}

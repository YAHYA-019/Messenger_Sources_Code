package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.Ax1, reason: case insensitive filesystem */
/* loaded from: Ax1.class */
public final class C1936Ax1 extends 1LH {
    public final C1786AsK A00;
    public final 9Ab A01;
    public final MigColorScheme A02;

    public C1936Ax1(C1786AsK c1786AsK, 9Ab r303, MigColorScheme migColorScheme) {
        1BL.A1F(migColorScheme, c1786AsK);
        this.A02 = migColorScheme;
        this.A00 = c1786AsK;
        this.A01 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1786AsK c1786AsK = this.A00;
        Object obj = c1786AsK.A05;
        Integer num = 0S2.A00;
        if (obj == num) {
            2lQ r0 = 2lO.A02;
            2lO A0h = 7zS.A0h(num, C1ro.CENTER, 0);
            long doubleToRawLongBits = Double.doubleToRawLongBits(120.0d);
            2lO A0Y = 7zT.A0Y(A0h, new C02963wp(0S2.A15, doubleToRawLongBits), doubleToRawLongBits);
            C2sn A0L = 7zR.A0L(c2k5);
            return 7zM.A0l(8Tj.A06(C8m4.A00(A0L.A00), this.A02), A0L, c2k5, A0Y);
        }
        8Tn A00 = C8nn.A00(c2k5.A05);
        A00.A2a(this.A02);
        9Ab r02 = this.A01;
        String str = c1786AsK.A06;
        if (str == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        CZE cze = new CZE(r02, c1786AsK, 4);
        String str2 = c1786AsK.A00;
        if (str2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        8Lf r03 = new 8Lf(cze, new CZE(r02, c1786AsK, 5), str, str2);
        String str3 = c1786AsK.A02;
        if (str3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String str4 = c1786AsK.A01;
        if (str4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        9Di r04 = (9Di) c1786AsK.A04;
        if (r04 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A00.A2Y(new 8NJ(r03, r04, str4, (CharSequence) null, str3, (List) null, true));
        A00.A2X();
        return A00.A2W();
    }
}

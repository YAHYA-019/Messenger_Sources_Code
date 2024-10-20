package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Arrays;

/* renamed from: X.5z1, reason: invalid class name */
/* loaded from: 5z1.class */
public final class C5z1 extends C5yu {
    public final 2QC A00;
    public final MigColorScheme A01;
    public final String A02;
    public final int A03;
    public final int A04;
    public final 1Im A05;
    public final AnonymousClass553 A06;
    public final AnonymousClass553 A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public C5z1(6T0 r302) {
        this.A03 = r302.A00;
        this.A04 = r302.A01;
        this.A08 = r302.A07;
        this.A06 = r302.A04;
        this.A07 = r302.A05;
        this.A05 = r302.A02;
        this.A09 = r302.A08;
        this.A02 = r302.A09;
        MigColorScheme migColorScheme = r302.A06;
        if (migColorScheme == null) {
            11T.A0L("colorScheme");
            throw 0Q8.createAndThrow();
        }
        this.A01 = migColorScheme;
        this.A0B = r302.A0B;
        this.A0A = r302.A0A;
        this.A00 = r302.A03;
    }

    public static final C5z0 A00(1Iw r301, C5z1 c5z1, int i, int i2) {
        C83t A00 = C5z0.A00(r301);
        A00.A2X(i2);
        A00.A2Y(c5z1.A03);
        A00.A2Z(i);
        A00.A2b(c5z1.A08);
        AnonymousClass553 anonymousClass553 = c5z1.A06;
        C5z0 c5z0 = A00.A01;
        c5z0.A03 = anonymousClass553;
        c5z0.A04 = c5z1.A07;
        A00.A1v(c5z1.A05);
        A00.A2J(c5z1.A09);
        A00.A2K(c5z1.A02);
        A00.A0E(null);
        c5z0.A0A = c5z1.A0B;
        A00.A2a(c5z1.A01);
        A00.A2c(c5z1.A0A);
        A00.A0F("android.widget.Button");
        return A00.A2V();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof C5z1)) {
                return false;
            }
            C5z1 c5z1 = (C5z1) obj;
            if (this.A03 == c5z1.A03 && this.A04 == c5z1.A04 && C2qv.A01(this.A08, c5z1.A08) && C2qv.A01(this.A09, c5z1.A09) && C2qv.A01(this.A02, c5z1.A02) && this.A0B == c5z1.A0B && this.A0A == c5z1.A0A && this.A01 == c5z1.A01) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A03), Integer.valueOf(this.A04), this.A08, this.A09, this.A02, null});
    }
}

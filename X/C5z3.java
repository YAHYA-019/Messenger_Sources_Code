package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Arrays;

/* renamed from: X.5z3, reason: invalid class name */
/* loaded from: 5z3.class */
public final class C5z3 extends C5yu {
    public final int A00;
    public final 2QC A01;
    public final C7f2 A02;
    public final AnonymousClass553 A03;
    public final MigColorScheme A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C5z3(2QC r302, C7f2 c7f2, AnonymousClass553 anonymousClass553, MigColorScheme migColorScheme, String str, int i) {
        11T.A0F(migColorScheme, 7);
        this.A00 = i;
        this.A05 = str;
        this.A06 = "buyer_view_catalog_button";
        this.A03 = anonymousClass553;
        this.A04 = migColorScheme;
        this.A07 = true;
        this.A02 = c7f2;
        this.A01 = r302;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof C5z3)) {
                return false;
            }
            C5z3 c5z3 = (C5z3) obj;
            if (this.A00 == c5z3.A00 && C2qv.A01(this.A05, c5z3.A05) && C2qv.A01(this.A06, c5z3.A06) && this.A07 == c5z3.A07 && this.A04 == c5z3.A04) {
                2QC r0 = this.A01;
                if (C2qv.A01(r0, r0)) {
                    C7f2 c7f2 = this.A02;
                    if (C2qv.A01(c7f2, c7f2)) {
                        return true;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), 0, this.A05, this.A06, null});
    }
}

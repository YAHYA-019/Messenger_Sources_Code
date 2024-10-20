package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Arrays;

/* renamed from: X.2cf, reason: invalid class name */
/* loaded from: 2cf.class */
public final class C2cf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final 2QC A03;
    public final C1p7 A04;
    public final MigColorScheme A05;
    public final String A06;

    public C2cf(2QC r302, C1p7 c1p7, MigColorScheme migColorScheme, String str, int i, int i2, int i3) {
        this.A06 = str;
        this.A03 = r302;
        this.A05 = migColorScheme;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = c1p7;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C2cf)) {
                return false;
            }
            C2cf c2cf = (C2cf) obj;
            if (!11T.A0O(this.A06, c2cf.A06)) {
                return false;
            }
            2QC r0 = this.A03;
            2QC r02 = c2cf.A03;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            MigColorScheme migColorScheme = this.A05;
            MigColorScheme migColorScheme2 = c2cf.A05;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            if (this.A02 != c2cf.A02 || this.A01 != c2cf.A01) {
                return false;
            }
            C1p7 c1p7 = this.A04;
            C1p7 c1p72 = c2cf.A04;
            if (c1p7 != null) {
                if (!c1p7.equals(c1p72)) {
                    return false;
                }
            } else if (c1p72 != null) {
                return false;
            }
            if (this.A00 != c2cf.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A03, this.A05, Integer.valueOf(this.A02), Integer.valueOf(this.A01), this.A04, Integer.valueOf(this.A00), getClass()});
    }
}

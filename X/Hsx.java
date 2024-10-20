package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Arrays;

/* loaded from: Hsx.class */
public final class Hsx {
    public final int A00;
    public final ThreadKey A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public Hsx(ThreadKey threadKey, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A02 = z;
        this.A0A = z9;
        this.A09 = z8;
        this.A08 = z7;
        this.A07 = z6;
        this.A0B = z10;
        this.A00 = i;
        this.A03 = z2;
        this.A04 = z3;
        this.A06 = z5;
        this.A0C = z11;
        this.A05 = z4;
        this.A0D = z12;
        this.A01 = threadKey;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof Hsx)) {
            Hsx hsx = (Hsx) obj;
            if (this.A02 == hsx.A02 && this.A00 == hsx.A00 && this.A03 == hsx.A03 && this.A0A == hsx.A0A && this.A09 == hsx.A09 && this.A08 == hsx.A08 && this.A07 == hsx.A07 && this.A0B == hsx.A0B && this.A04 == hsx.A04 && this.A06 == hsx.A06 && this.A0C == hsx.A0C && this.A05 == hsx.A05 && this.A0D == hsx.A0D) {
                z = 4YV.A1Z(this.A01, hsx.A01);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A02), Integer.valueOf(this.A00), Boolean.valueOf(this.A03), Boolean.valueOf(this.A0A), Boolean.valueOf(this.A09), Boolean.valueOf(this.A08), Boolean.valueOf(this.A07), Boolean.valueOf(this.A0B), Boolean.valueOf(this.A04), Boolean.valueOf(this.A0C), Boolean.valueOf(this.A05), 1BK.A0d(), Boolean.valueOf(this.A06), Boolean.valueOf(this.A0D), this.A01});
    }
}

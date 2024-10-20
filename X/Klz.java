package X;

import com.google.common.base.Preconditions;

/* loaded from: Klz.class */
public final class Klz {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public Klz(String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2) {
        boolean z3 = true;
        Preconditions.checkArgument(AnonymousClass001.A1Q(str.length(), 24));
        Preconditions.checkArgument(AnonymousClass001.A1Q(str2.length(), 24));
        Preconditions.checkArgument(1BL.A1S(str.compareTo(str2)));
        Preconditions.checkArgument(i < 0 ? false : z3);
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A07 = z;
        this.A06 = z2;
        this.A00 = i;
        this.A01 = j;
    }
}

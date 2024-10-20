package X;

import java.util.Arrays;

/* renamed from: X.3yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3yt.class */
public final class C03703yt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final long A0D;
    public final String A0E;

    public C03703yt(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j) {
        this.A0D = j;
        this.A0E = str;
        this.A04 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A09 = i5;
        this.A0A = i6;
        this.A0B = i7;
        this.A05 = i8;
        this.A06 = i9;
        this.A08 = i10;
        this.A07 = i11;
        this.A00 = i12;
        this.A0C = i13;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof C03703yt)) {
                return false;
            }
            C03703yt c03703yt = (C03703yt) obj;
            if (this.A0E.equals(c03703yt.A0E) && this.A04 == c03703yt.A04 && this.A01 == c03703yt.A01 && this.A02 == c03703yt.A02 && this.A03 == c03703yt.A03 && this.A09 == c03703yt.A09 && this.A0A == c03703yt.A0A && this.A0B == c03703yt.A0B && this.A05 == c03703yt.A05 && this.A06 == c03703yt.A06 && this.A08 == c03703yt.A08 && this.A07 == c03703yt.A07 && this.A00 == c03703yt.A00 && this.A0C == c03703yt.A0C) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0E, Integer.valueOf(this.A04), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A09), Integer.valueOf(this.A0A), Integer.valueOf(this.A0B), Integer.valueOf(this.A05), Integer.valueOf(this.A06), Integer.valueOf(this.A08), Integer.valueOf(this.A07), Integer.valueOf(this.A00), Integer.valueOf(this.A0C)});
    }
}

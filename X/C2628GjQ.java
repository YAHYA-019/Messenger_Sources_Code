package X;

import java.util.Iterator;

/* renamed from: X.GjQ, reason: case insensitive filesystem */
/* loaded from: GjQ.class */
public final class C2628GjQ extends C04v {
    public final int A00;
    public final long A01;
    public final C2626GjK A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;

    public C2628GjQ(C2626GjK c2626GjK, Integer num, Integer num2, int i, long j, boolean z) {
        this.A01 = j;
        this.A02 = c2626GjK;
        this.A03 = num;
        this.A05 = z;
        this.A04 = num2;
        this.A00 = i;
    }

    public static C2626GjK A00(Iterator it) {
        return ((C2628GjQ) it.next()).A02;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2628GjQ)) {
                return false;
            }
            C2628GjQ c2628GjQ = (C2628GjQ) obj;
            if (this.A01 != c2628GjQ.A01 || !11T.A0O(this.A02, c2628GjQ.A02) || this.A03 != c2628GjQ.A03 || this.A05 != c2628GjQ.A05 || this.A04 != c2628GjQ.A04 || this.A00 != c2628GjQ.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A05 = AnonymousClass002.A05(this.A02, 7zQ.A02(this.A01));
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "TOP";
                break;
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "BOTTOM";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "SCALE";
                break;
            case 6:
                str = "FADE";
                break;
            default:
                str = "NONE";
                break;
        }
        return (((((7zR.A07(str, intValue, A05) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31) + Hwa.A00(this.A04)) * 31) + this.A00;
    }
}

package X;

import java.util.List;

/* renamed from: X.AsJ, reason: case insensitive filesystem */
/* loaded from: AsJ.class */
public final class C1785AsJ extends C04v {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public C1785AsJ(BO5 bo5, Long l, String str, long j) {
        this.A00 = 0;
        11T.A0F(bo5, 5);
        this.A04 = "community_member_list";
        this.A01 = j;
        this.A05 = str;
        this.A03 = l;
        this.A02 = bo5;
    }

    public C1785AsJ(Integer num, String str, String str2, List list, int i, long j) {
        this.A00 = 1;
        list = (i & 8) != 0 ? null : list;
        str2 = (i & 16) != 0 ? null : str2;
        this.A00 = 1;
        this.A02 = num;
        this.A01 = j;
        this.A05 = str;
        this.A03 = list;
        this.A04 = str2;
    }

    public boolean equals(Object obj) {
        if (this.A00 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785AsJ)) {
            return false;
        }
        C1785AsJ c1785AsJ = (C1785AsJ) obj;
        return c1785AsJ.A00 == 0 && 11T.A0O(this.A04, c1785AsJ.A04) && this.A01 == c1785AsJ.A01 && 11T.A0O(this.A05, c1785AsJ.A05) && 11T.A0O(this.A03, c1785AsJ.A03) && this.A02 == c1785AsJ.A02;
    }

    public int hashCode() {
        if (this.A00 != 0) {
            return super.hashCode();
        }
        return 1BK.A03(this.A02, (AnonymousClass002.A07(this.A05, AnonymousClass002.A02(this.A01, 4YV.A02(this.A04))) + AnonymousClass001.A02(this.A03)) * 31);
    }
}

package X;

import java.util.List;

/* renamed from: X.AsM, reason: case insensitive filesystem */
/* loaded from: AsM.class */
public final class C1788AsM extends C04v {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C1788AsM(2MQ r302, Integer num, Integer num2, String str, String str2, int i, boolean z) {
        this.A00 = 1;
        str2 = (i & 4) != 0 ? null : str2;
        r302 = (i & 8) != 0 ? null : r302;
        z = (i & 16) != 0 ? false : z;
        num2 = (i & 32) != 0 ? null : num2;
        this.A00 = 1;
        this.A05 = str;
        this.A03 = num;
        this.A04 = str2;
        this.A02 = r302;
        this.A06 = z;
        this.A01 = num2;
    }

    public C1788AsM(C1790AsO c1790AsO, String str, String str2, List list, List list2, boolean z) {
        this.A00 = 0;
        11T.A0F(list2, 5);
        this.A05 = str;
        this.A04 = str2;
        this.A01 = list;
        this.A06 = z;
        this.A02 = list2;
        this.A03 = c1790AsO;
    }

    public boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1788AsM)) {
                return false;
            }
            C1788AsM c1788AsM = (C1788AsM) obj;
            if (c1788AsM.A00 != 1 || !11T.A0O(this.A05, c1788AsM.A05) || this.A03 != c1788AsM.A03 || !11T.A0O(this.A04, c1788AsM.A04) || this.A02 != c1788AsM.A02 || this.A06 != c1788AsM.A06) {
                return false;
            }
            obj2 = this.A01;
            obj3 = c1788AsM.A01;
        } else {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1788AsM)) {
                return false;
            }
            C1788AsM c1788AsM2 = (C1788AsM) obj;
            if (c1788AsM2.A00 != 0 || !11T.A0O(this.A05, c1788AsM2.A05) || !11T.A0O(this.A04, c1788AsM2.A04) || !11T.A0O(this.A01, c1788AsM2.A01) || this.A06 != c1788AsM2.A06 || !11T.A0O(this.A02, c1788AsM2.A02)) {
                return false;
            }
            obj2 = this.A03;
            obj3 = c1788AsM2.A03;
        }
        return 11T.A0O(obj2, obj3);
    }

    public int hashCode() {
        int A05;
        int A02;
        int i = this.A00;
        String str = this.A05;
        if (i != 0) {
            int A022 = 4YV.A02(str);
            Integer num = (Integer) this.A03;
            A02 = (((((7zV.A03(num, BVH.A00(num), A022) + 1BL.A05(this.A04)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31;
            A05 = 4YU.A03(this.A01);
        } else {
            A05 = AnonymousClass002.A05(this.A02, (AnonymousClass002.A05(this.A01, AnonymousClass002.A07(this.A04, 4YV.A02(str))) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31);
            A02 = AnonymousClass001.A02(this.A03);
        }
        return A05 + A02;
    }

    public String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ItemModel(title=");
        A0k.append(this.A05);
        A0k.append(", itemType=");
        Integer num = (Integer) this.A03;
        A0k.append(num != null ? BVH.A00(num) : "null");
        A0k.append(", subtitle=");
        A0k.append(this.A04);
        A0k.append(7zK.A00(15));
        A0k.append(this.A02);
        A0k.append(", accessoryOn=");
        A0k.append(this.A06);
        A0k.append(AbstractC00603o4.A00(92));
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}

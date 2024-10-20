package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jlt, reason: case insensitive filesystem */
/* loaded from: Jlt.class */
public final class C3188Jlt extends KpC {
    public final int A00;
    public final List A01;

    public C3188Jlt(List list, int i) {
        super(list, (java.util.Map) null);
        this.A00 = i;
        this.A01 = list;
    }

    public C3188Jlt(List list, java.util.Map map, int i) {
        super(list, map);
        this.A00 = i;
        this.A01 = list;
    }

    public int A00(1IJ r302) {
        List list = this.A01;
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((Ku1) list.get(i)).A00(r302);
        }
        r302.A0D(4, size, 4);
        int i2 = size;
        while (true) {
            int i3 = i2 - 1;
            if (i3 < 0) {
                break;
            }
            r302.A07(iArr[i3]);
            i2 = i3;
        }
        int A03 = r302.A03();
        java.util.Map map = ((KpC) this).A01;
        int size2 = map.size();
        int[] iArr2 = new int[size2];
        Iterator A0y = AnonymousClass001.A0y(map);
        for (int i4 = 0; i4 < size2; i4++) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            int A04 = r302.A04(AnonymousClass001.A0j(A0z));
            int A042 = r302.A04(1BK.A16(A0z));
            r302.A09(2);
            r302.A0B(0, A04);
            r302.A0B(1, A042);
            iArr2[i4] = r302.A02();
        }
        r302.A0D(4, size2, 4);
        int i5 = size2;
        while (true) {
            int i6 = i5 - 1;
            if (i6 < 0) {
                int A032 = r302.A03();
                r302.A09(4);
                r302.A0A(0, this.A00);
                r302.A0B(2, A03);
                r302.A0B(3, A032);
                return r302.A02();
            }
            r302.A07(iArr2[i6]);
            i5 = i6;
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C3188Jlt)) {
                return false;
            }
            C3188Jlt c3188Jlt = (C3188Jlt) obj;
            if (this.A00 == c3188Jlt.A00 && this.A01.equals(c3188Jlt.A01)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(this.A00) + this.A01.hashCode();
    }
}

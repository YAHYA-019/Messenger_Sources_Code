package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2hp, reason: invalid class name */
/* loaded from: 2hp.class */
public final class C2hp {
    public static final List A08 = new ArrayList();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C2hn A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public C2hp(C2hn c2hn, List list, List list2, List list3, int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A04 = c2hn == null ? C2hl.A00() : c2hn;
        if (list != null) {
            int size = list.size();
            this.A07 = new ArrayList(size);
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 >= size) {
                    break;
                }
                Object obj = list.get(i6);
                List list4 = this.A07;
                if (obj == null) {
                    obj = C2hl.A00();
                }
                list4.add(obj);
                i5 = i6 + 1;
            }
        } else {
            this.A07 = A08;
        }
        List list5 = null;
        this.A06 = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.A05 = list3 != null ? Collections.unmodifiableList(list3) : list5;
    }

    public static C2hp A00(C2hn c2hn, Object obj, Object obj2, int i, int i2) {
        List list = null;
        List singletonList = obj != null ? Collections.singletonList(obj) : null;
        if (obj2 != null) {
            list = Collections.singletonList(obj2);
        }
        return new C2hp(c2hn, null, singletonList, list, i, i2, -1, 1);
    }
}

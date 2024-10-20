package X;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8q8, reason: invalid class name */
/* loaded from: 8q8.class */
public final class C8q8 extends 2Yf {
    public List A00;

    public C8q8() {
        super("ListItemSection");
        this.A00 = Collections.emptyList();
    }

    public 2Ys A0d(C1qb c1qb) {
        List<ImmutableList> list = this.A00;
        2Yr A0l = 7zL.A0l();
        2hP A0I = 2hO.A0I(c1qb);
        C83f A00 = C2hd.A00(c1qb);
        int i = 0;
        A00.A2Z(0);
        A00.A2Y(0);
        A00.A00.A02 = 1;
        A0I.A04(A00);
        A0l.A00(A0I);
        for (ImmutableList immutableList : list) {
            5P3 r0 = new 5P3();
            r0.A00 = immutableList;
            ((2Yf) r0).A07 = Integer.toString(i);
            A0l.A01(r0);
            i++;
        }
        return A0l.A00;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            List list = this.A00;
            List list2 = ((C8q8) r302).A00;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
        }
        return true;
    }
}

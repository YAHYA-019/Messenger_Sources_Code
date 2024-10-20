package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.6zx, reason: invalid class name */
/* loaded from: 6zx.class */
public final class C6zx implements C6zy {
    public int A00;
    public final boolean A01;
    public final boolean A02;

    public C6zx(boolean z, boolean z2) {
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // X.C6zy
    public C6zq AVR(C77n c77n, C77r c77r) {
        11T.A0F(c77r, 1);
        return c77r.A02;
    }

    @Override // X.C6zy
    public int Ah5(C77n c77n) {
        ImmutableList immutableList = ((C77u) c77n.AUP(C77u.class)).A01;
        11T.A0A(immutableList);
        C77v c77v = (C77v) c77n.AUP(C77v.class);
        int i = 0;
        if ((this.A01 && c77v.A03) || this.A02) {
            Iterator it = immutableList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!11T.A0O(((C77r) it.next()).A02.getClass(), C6zp.class)) {
                    i2++;
                } else if (i2 != -1) {
                    return i2;
                }
            }
        }
        Iterator it2 = immutableList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!11T.A0O(((C77r) it2.next()).A02.getClass(), C6zu.class)) {
                i++;
            } else if (i != -1) {
                this.A00 = i;
            }
        }
        return this.A00;
    }

    @Override // X.C6zy
    public void Bdr(C77n c77n, 7BV r303) {
    }
}

package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.47v, reason: invalid class name */
/* loaded from: 47v.class */
public final class C47v {
    public static final C47w A01 = new Object();
    public static volatile C47v A02;
    public final Set A00 = new LinkedHashSet();

    private final Set A00() {
        Set A0f;
        Set set = this.A00;
        synchronized (set) {
            A0f = set.isEmpty() ? null : 0QD.A0f(set);
        }
        return A0f;
    }

    public void A01(int i, int i2) {
        Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47v) it.next()).A01(i, i2);
            }
        }
    }

    public void A02(int i, int i2, long j) {
        Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47v) it.next()).A02(i, i2, j);
            }
        }
    }

    public void A03(int i, int i2, long j, long j2, short s) {
        Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47v) it.next()).A03(i, i2, j, j2, s);
            }
        }
    }

    public void A04(int i, int i2, String str, double d) {
        Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47v) it.next()).A04(i, i2, str, d);
            }
        }
    }

    public void A05(int i, int i2, String str, int i3) {
        Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47v) it.next()).A05(i, i2, str, i3);
            }
        }
    }

    public void A06(int i, int i2, String str, long j) {
        Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47v) it.next()).A06(i, i2, str, j);
            }
        }
    }

    public void A07(int i, int i2, String str, String str2) {
        Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47v) it.next()).A07(i, i2, str, str2);
            }
        }
    }

    public void A08(int i, int i2, String str, String str2, long j) {
        Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47v) it.next()).A08(i, i2, str, str2, j);
            }
        }
    }

    public void A09(int i, int i2, String str, boolean z) {
        Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47v) it.next()).A09(i, i2, str, z);
            }
        }
    }

    public void A0A(int i, int i2, String str, String[] strArr) {
        Set A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47v) it.next()).A0A(i, i2, str, strArr);
            }
        }
    }
}

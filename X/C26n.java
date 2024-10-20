package X;

/* renamed from: X.26n, reason: invalid class name */
/* loaded from: 26n.class */
public final class C26n {
    public final Object[] A01 = new Object[5];
    public short A00 = 0;

    public static String A00(int i) {
        if (i == 0) {
            return "CONTENT";
        }
        if (i == 1) {
            return "BACKGROUND";
        }
        if (i == 2) {
            return "FOREGROUND";
        }
        if (i == 3) {
            return "HOST";
        }
        if (i != 4) {
            return null;
        }
        return "BORDER";
    }

    public int A01(int i) {
        if (i < 0 || i >= this.A00) {
            throw new IndexOutOfBoundsException(0Pz.A0C(i, this.A00, "index=", ", size="));
        }
        int i2 = 0;
        int i3 = 0;
        do {
            if (this.A01[i3] != null) {
                i2++;
            }
            i3++;
        } while (i2 <= i);
        return i3 - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object A02() {
        Object[] objArr = this.A01;
        byte b = 3;
        if (objArr[3] == null) {
            b = false;
            if (objArr[0] == null) {
                b = true;
                if (objArr[1] == null) {
                    b = 2;
                    if (objArr[2] == null) {
                        b = 4;
                    }
                }
            }
        }
        return objArr[b == true ? 1 : 0];
    }

    public void A03(int i, Object obj) {
        Object[] objArr = this.A01;
        if (objArr[i] != null) {
            throw 0Pz.A08("Already contains unit for type ", A00(i));
        }
        if (objArr[3] != null || (i == 3 && this.A00 > 0)) {
            throw AnonymousClass001.A0T("OutputUnitType.HOST unit should be the only member of an OutputUnitsAffinityGroup");
        }
        objArr[i] = obj;
        this.A00 = (short) (this.A00 + 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C26n c26n = (C26n) obj;
            if (this.A00 != c26n.A00) {
                return false;
            }
            int i = 0;
            while (true) {
                int i2 = i;
                Object[] objArr = this.A01;
                if (i2 >= 5) {
                    break;
                }
                if (objArr[i2] != c26n.A01[i2]) {
                    return false;
                }
                i = i2 + 1;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.A00) {
                return sb.toString();
            }
            int A01 = A01(i2);
            Object obj = this.A01[A01(i2)];
            sb.append("\n\t");
            sb.append(A00(A01));
            sb.append(": ");
            1BK.A1R(sb, obj);
            i = i2 + 1;
        }
    }
}

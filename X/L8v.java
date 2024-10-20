package X;

import java.lang.reflect.Array;
import java.util.List;

/* loaded from: L8v.class */
public final class L8v {
    public int A00;
    public Object[] A01;
    public C00993pc A02;
    public C00993pc A03;

    public static void A00(L8v l8v) {
        C00993pc c00993pc = l8v.A03;
        if (c00993pc != null) {
            l8v.A01 = (Object[]) c00993pc.A01;
        }
        l8v.A03 = null;
        l8v.A02 = null;
        l8v.A00 = 0;
    }

    public static final void A01(L8v l8v, Object obj, Object[] objArr, int i, int i2) {
        int i3 = 0;
        for (C00993pc c00993pc = l8v.A02; c00993pc != null; c00993pc = c00993pc.A00) {
            Object[] objArr2 = (Object[]) c00993pc.A01;
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 != i) {
            throw AnonymousClass001.A0N(0Pz.A0C(i, i4, "Should have gotten ", " entries, got "));
        }
    }

    public void A02(List list, Object[] objArr, int i) {
        int i2;
        C00993pc c00993pc = this.A02;
        while (true) {
            C00993pc c00993pc2 = c00993pc;
            i2 = 0;
            if (c00993pc2 == null) {
                break;
            }
            Object[] objArr2 = (Object[]) c00993pc2.A01;
            int length = objArr2.length;
            while (i2 < length) {
                list.add(objArr2[i2]);
                i2++;
            }
            c00993pc = c00993pc2.A00;
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        A00(this);
    }

    public Object[] A03() {
        A00(this);
        Object[] objArr = this.A01;
        if (objArr == null) {
            objArr = new Object[12];
            this.A01 = objArr;
        }
        return objArr;
    }

    public Object[] A04(Object[] objArr) {
        C00993pc c00993pc = new C00993pc(null, objArr);
        if (this.A02 == null) {
            this.A03 = c00993pc;
            this.A02 = c00993pc;
        } else {
            C00993pc c00993pc2 = this.A03;
            if (c00993pc2.A00 != null) {
                throw JQx.A0o();
            }
            c00993pc2.A00 = c00993pc;
            this.A03 = c00993pc;
        }
        int length = objArr.length;
        this.A00 += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public Object[] A05(Object[] objArr, int i) {
        A00(this);
        Object[] objArr2 = this.A01;
        if (objArr2 == null || objArr2.length < i) {
            objArr2 = new Object[Math.max(12, i)];
            this.A01 = objArr2;
        }
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return this.A01;
    }

    public Object[] A06(Object[] objArr, int i, Class cls) {
        int i2 = this.A00 + i;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) cls, i2);
        A01(this, objArr2, objArr, i2, i);
        A00(this);
        return objArr2;
    }
}

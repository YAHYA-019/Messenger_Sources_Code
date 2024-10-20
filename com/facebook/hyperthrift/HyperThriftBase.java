package com.facebook.hyperthrift;

import X.0Pz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import java.util.Arrays;

/* loaded from: HyperThriftBase.class */
public abstract class HyperThriftBase {
    public static final Object A02 = AnonymousClass001.A0R();
    public String A00;
    public Object[] A01;

    public Object A00(int i) {
        Object obj = this.A01[i];
        if (obj == A02 || obj == null) {
            obj = null;
        }
        return obj;
    }

    public void A01() {
        Object[] objArr = this.A01;
        int length = objArr.length;
        int i = -1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                return;
            }
            Object obj = objArr[i3];
            if (obj != null && obj != A02) {
                if (i >= 0) {
                    StringBuilder A1D = 0Pz.A1D("Multiple eligible values for union field: ", ", ", i);
                    A1D.append(i3);
                    throw AnonymousClass001.A0N(A1D.toString());
                }
                i = i3;
            }
            i2 = i3 + 1;
        }
    }

    public void A02(String str, Object[] objArr) {
        this.A00 = str;
        this.A01 = objArr;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HyperThriftBase)) {
            return false;
        }
        HyperThriftBase hyperThriftBase = (HyperThriftBase) obj;
        if (this.A00.equals(hyperThriftBase.A00)) {
            return Arrays.deepEquals(this.A01, hyperThriftBase.A01);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.A00.hashCode();
        Object[] objArr = this.A01;
        int length = objArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return hashCode;
            }
            hashCode = (hashCode * 31) + AnonymousClass002.A04(objArr[i2]);
            i = i2 + 1;
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A00);
        A0k.append('{');
        int length = this.A01.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return AnonymousClass001.A0f(A0k);
            }
            Object obj = this.A01[i2];
            if (obj != null) {
                if (i2 > 0) {
                    A0k.append(',');
                }
                A0k.append(i2);
                A0k.append(':');
                A0k.append(obj == A02 ? "null" : obj.toString());
            }
            i = i2 + 1;
        }
    }
}

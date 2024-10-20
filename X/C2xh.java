package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.2xh, reason: invalid class name */
/* loaded from: 2xh.class */
public final class C2xh extends C04v {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;

    public C2xh(ImmutableList immutableList, String str) {
        11T.A0F(immutableList, 2);
        this.A02 = str;
        this.A01 = immutableList;
    }

    public C2xh(String str, Long l) {
        this.A02 = str;
        this.A01 = l;
    }

    public boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else {
            if (this == obj) {
                return true;
            }
            i = 0;
        }
        if (!(obj instanceof C2xh)) {
            return false;
        }
        C2xh c2xh = (C2xh) obj;
        return c2xh.A00 == i && 11T.A0O(this.A02, c2xh.A02) && 11T.A0O(this.A01, c2xh.A01);
    }

    public int hashCode() {
        int hashCode;
        Object obj;
        int hashCode2;
        int i = this.A00;
        String str = this.A02;
        if (i != 0) {
            hashCode = str.hashCode() * 31;
            obj = this.A01;
            if (obj == null) {
                hashCode2 = 0;
                return hashCode + hashCode2;
            }
        } else {
            hashCode = (str == null ? 0 : str.hashCode()) * 31;
            obj = this.A01;
        }
        hashCode2 = obj.hashCode();
        return hashCode + hashCode2;
    }
}

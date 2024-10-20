package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.2xe, reason: invalid class name */
/* loaded from: 2xe.class */
public final class C2xe extends C04v {
    public final int A00 = 0;
    public final Object A01;
    public final boolean A02;

    public C2xe(ThreadKey threadKey, boolean z) {
        this.A01 = threadKey;
        this.A02 = z;
    }

    public C2xe(boolean z, Integer num) {
        this.A02 = z;
        this.A01 = num;
    }

    public boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2xe)) {
                return false;
            }
            C2xe c2xe = (C2xe) obj;
            return c2xe.A00 == 1 && this.A02 == c2xe.A02 && this.A01 == c2xe.A01;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2xe)) {
            return false;
        }
        C2xe c2xe2 = (C2xe) obj;
        return c2xe2.A00 == 0 && 11T.A0O(this.A01, c2xe2.A01) && this.A02 == c2xe2.A02;
    }

    public int hashCode() {
        int hashCode;
        int A00;
        if (this.A00 != 0) {
            int i = 1237;
            if (this.A02) {
                i = 1231;
            }
            hashCode = i * 31;
            int A03 = AnonymousClass001.A03(this.A01);
            A00 = (1 != A03 ? "DEFAULT" : "CUSTOM").hashCode() + A03;
        } else {
            Object obj = this.A01;
            hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            A00 = AnonymousClass002.A00(this.A02 ? 1 : 0);
        }
        return hashCode + A00;
    }
}

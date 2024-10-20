package X;

import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.2xg, reason: invalid class name */
/* loaded from: 2xg.class */
public final class C2xg extends C04v {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2xg() {
        this((96K) null, (Long) null, false);
        this.A00 = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2xg(int i) {
        this((96K) null, (Long) null, false);
        this.A00 = i;
        this.A00 = 1;
    }

    public C2xg(96K r302, Long l, boolean z) {
        this.A00 = 1;
        this.A01 = r302;
        this.A03 = z;
        this.A02 = l;
    }

    public C2xg(LifecycleOwner lifecycleOwner, 9Ve r303, boolean z) {
        this.A00 = 0;
        this.A02 = lifecycleOwner;
        this.A01 = r303;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2xg)) {
                    return false;
                }
                C2xg c2xg = (C2xg) obj;
                return c2xg.A00 == 0 && 11T.A0O(this.A02, c2xg.A02) && 11T.A0O(this.A01, c2xg.A01) && this.A03 == c2xg.A03;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2xg)) {
                    return false;
                }
                C2xg c2xg2 = (C2xg) obj;
                return c2xg2.A00 == 1 && this.A01 == c2xg2.A01 && this.A03 == c2xg2.A03 && 11T.A0O(this.A02, c2xg2.A02);
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        int hashCode;
        int A00;
        switch (this.A00) {
            case 0:
                int hashCode2 = this.A02.hashCode() * 31;
                Object obj = this.A01;
                hashCode = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
                A00 = AnonymousClass002.A00(this.A03 ? 1 : 0);
                break;
            case 1:
                Object obj2 = this.A01;
                hashCode = 0;
                A00 = (((obj2 == null ? 0 : obj2.hashCode()) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31;
                Object obj3 = this.A02;
                if (obj3 != null) {
                    hashCode = obj3.hashCode();
                    break;
                }
                break;
            default:
                return super.hashCode();
        }
        return A00 + hashCode;
    }
}

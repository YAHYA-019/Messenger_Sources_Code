package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Gjl, reason: case insensitive filesystem */
/* loaded from: Gjl.class */
public final class C2633Gjl extends C04v {
    public Object A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2633Gjl() {
        this(null, null, 1, false, true);
        this.A04 = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2633Gjl(int i) {
        this(null, null, 2, false, true);
        this.A04 = i;
        switch (i) {
            case 0:
                this.A04 = 0;
                C0ty c0ty = C0ty.A00;
                this.A04 = 0;
                11T.A0F(c0ty, 3);
                this.A02 = false;
                this.A03 = false;
                this.A00 = c0ty;
                this.A01 = null;
                return;
            case 1:
                this.A04 = 1;
                this(null, null, 1, false, true);
                return;
            default:
                this.A04 = 2;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2633Gjl(Number number, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2) {
        this(null, null, 2, false, true);
        this.A04 = 2;
    }

    public C2633Gjl(Object obj, String str, int i, boolean z, boolean z2) {
        this.A04 = i;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = obj;
        this.A01 = str;
    }

    public C2633Gjl(List list, int i, boolean z, boolean z2) {
        this.A04 = 0;
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        list = (i & 4) != 0 ? C0ty.A00 : list;
        this.A04 = 0;
        11T.A0F(list, 3);
        this.A02 = z;
        this.A03 = z2;
        this.A00 = list;
        this.A01 = null;
    }

    public boolean equals(Object obj) {
        if (this.A04 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2633Gjl)) {
            return false;
        }
        C2633Gjl c2633Gjl = (C2633Gjl) obj;
        return c2633Gjl.A04 == 0 && this.A02 == c2633Gjl.A02 && this.A03 == c2633Gjl.A03 && 11T.A0O(this.A00, c2633Gjl.A00) && 11T.A0O(this.A01, c2633Gjl.A01);
    }

    public int hashCode() {
        if (this.A04 != 0) {
            return super.hashCode();
        }
        return AnonymousClass002.A05(this.A00, ((AnonymousClass002.A00(this.A02 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + 1BL.A05(this.A01);
    }
}

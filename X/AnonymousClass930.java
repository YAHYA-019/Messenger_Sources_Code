package X;

/* renamed from: X.930, reason: invalid class name */
/* loaded from: 930.class */
public final class AnonymousClass930 extends C99i {
    public final int A00;
    public final 8K7 A01;

    public AnonymousClass930(8K7 r302, int i) {
        11T.A0F(r302, 1);
        this.A01 = r302;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass930)) {
                return false;
            }
            AnonymousClass930 anonymousClass930 = (AnonymousClass930) obj;
            if (!11T.A0O(this.A01, anonymousClass930.A01) || this.A00 != anonymousClass930.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A01) + this.A00;
    }
}

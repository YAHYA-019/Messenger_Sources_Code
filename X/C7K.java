package X;

/* loaded from: C7K.class */
public final class C7K {
    public final AnonymousClass580 A00;
    public final String A01;

    public C7K(AnonymousClass580 anonymousClass580, String str) {
        this.A01 = str;
        this.A00 = anonymousClass580;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C7K)) {
                return false;
            }
            C7K c7k = (C7K) obj;
            if (!11T.A0O(this.A01, c7k.A01)) {
                return false;
            }
            AnonymousClass580 anonymousClass580 = this.A00;
            AnonymousClass580 anonymousClass5802 = c7k.A00;
            if (anonymousClass580 != null) {
                if (!anonymousClass580.equals(anonymousClass5802)) {
                    return false;
                }
            } else if (anonymousClass5802 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zS.A04(this, this.A01, this.A00);
    }
}

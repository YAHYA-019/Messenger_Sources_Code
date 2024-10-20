package X;

/* loaded from: L37.class */
public final class L37 {
    public final L5H A00;
    public final L5H A01;
    public final L5H A02;
    public final L5H A03;

    public L37() {
        this(null, null, null, null);
    }

    public L37(L5H l5h, L5H l5h2, L5H l5h3, L5H l5h4) {
        this.A03 = l5h;
        this.A00 = l5h2;
        this.A01 = l5h3;
        this.A02 = l5h4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof L37)) {
                return false;
            }
            L37 l37 = (L37) obj;
            if (!11T.A0O(this.A03, l37.A03) || !11T.A0O(this.A00, l37.A00) || !11T.A0O(this.A01, l37.A01) || !11T.A0O(this.A02, l37.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass002.A04(this.A03) * 31) + AnonymousClass002.A04(this.A00)) * 31) + AnonymousClass002.A04(this.A01)) * 31) + JQz.A0E(this.A02, 0);
    }
}

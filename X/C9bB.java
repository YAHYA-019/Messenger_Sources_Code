package X;

/* renamed from: X.9bB, reason: invalid class name */
/* loaded from: 9bB.class */
public final class C9bB {
    public final AaO A00;
    public final AnonymousClass690 A01;
    public final String A02;

    public C9bB(AaO aaO, AnonymousClass690 anonymousClass690, String str) {
        this.A02 = str;
        this.A01 = anonymousClass690;
        this.A00 = aaO;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9bB)) {
                return false;
            }
            C9bB c9bB = (C9bB) obj;
            if (!11T.A0O(this.A02, c9bB.A02)) {
                return false;
            }
            AnonymousClass690 anonymousClass690 = this.A01;
            AnonymousClass690 anonymousClass6902 = c9bB.A01;
            if (anonymousClass690 != null) {
                if (!anonymousClass690.equals(anonymousClass6902)) {
                    return false;
                }
            } else if (anonymousClass6902 != null) {
                return false;
            }
            AaO aaO = this.A00;
            AaO aaO2 = c9bB.A00;
            if (aaO != null) {
                if (!aaO.equals(aaO2)) {
                    return false;
                }
            } else if (aaO2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zR.A06(this, this.A02, this.A01, this.A00);
    }
}

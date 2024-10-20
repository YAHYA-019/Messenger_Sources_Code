package X;

import com.facebook.wearable.airshield.security.Hash;

/* loaded from: Ksv.class */
public final class Ksv {
    public final Hash A00;
    public final Hash A01;

    public Ksv(Hash hash, Hash hash2) {
        this.A01 = hash;
        this.A00 = hash2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ksv)) {
                return false;
            }
            Ksv ksv = (Ksv) obj;
            if (!11T.A0O(this.A01, ksv.A01) || !11T.A0O(this.A00, ksv.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 1BL.A03(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Challenges(tx=");
        A0k.append(this.A01);
        A0k.append(", rx=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}

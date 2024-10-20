package X;

/* loaded from: Exu.class */
public final class Exu {
    public final GJy A00;
    public final String A01;

    public Exu(GJy gJy, String str) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = gJy;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Exu)) {
                return false;
            }
            Exu exu = (Exu) obj;
            if (!11T.A0O(this.A01, exu.A01) || !11T.A0O(this.A00, exu.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A01) + AnonymousClass001.A02(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BloksStackFrame(offset=");
        A0k.append(this.A01);
        A0k.append(", nextFrame=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}

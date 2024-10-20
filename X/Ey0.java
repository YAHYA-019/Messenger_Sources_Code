package X;

/* loaded from: Ey0.class */
public final class Ey0 {
    public final FGo A00;
    public final FEq A01;

    public Ey0(FGo fGo, FEq fEq) {
        this.A00 = fGo;
        this.A01 = fEq;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ey0)) {
                return false;
            }
            Ey0 ey0 = (Ey0) obj;
            if (!11T.A0O(this.A00, ey0.A00) || !11T.A0O(this.A01, ey0.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AnonymousClass001.A02(this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CardPttRequest(authTicket=");
        A0k.append(this.A00);
        A0k.append(", pttRequestParam=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}

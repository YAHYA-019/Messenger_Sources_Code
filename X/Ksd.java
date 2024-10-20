package X;

/* loaded from: Ksd.class */
public final class Ksd {
    public final KuM A00;
    public final ME0 A01;

    public Ksd(KuM kuM, ME0 me0) {
        this.A00 = kuM;
        this.A01 = me0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ksd)) {
                return false;
            }
            Ksd ksd = (Ksd) obj;
            if (!11T.A0O(this.A00, ksd.A00) || !11T.A0O(this.A01, ksd.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A01, 1BL.A03(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VectorizedKeyframeSpecElementInfo(vectorValue=");
        A0k.append(this.A00);
        A0k.append(", easing=");
        A0k.append(this.A01);
        A0k.append(", arcMode=");
        A0k.append((Object) 0Pz.A0O("ArcMode(value=", ')', 0));
        return AnonymousClass001.A0g(A0k, ')');
    }
}

package X;

/* loaded from: Eyu.class */
public final class Eyu {
    public final int A00;
    public final DLQ A01;
    public final GJj A02;
    public final Object A03;

    public Eyu(DLQ dlq, GJj gJj, Object obj, int i) {
        this.A00 = i;
        this.A01 = dlq;
        this.A02 = gJj;
        this.A03 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyu)) {
                return false;
            }
            Eyu eyu = (Eyu) obj;
            if (this.A00 != eyu.A00 || !11T.A0O(this.A01, eyu.A01) || !11T.A0O(this.A02, eyu.A02) || !11T.A0O(this.A03, eyu.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A01, this.A00 * 31)) + AnonymousClass001.A02(this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AttributeBindingArgs(attributeKey=");
        A0k.append(this.A00);
        A0k.append(", model=");
        A0k.append(this.A01);
        A0k.append(", script=");
        A0k.append(this.A02);
        A0k.append(", defaultValue=");
        return AnonymousClass002.A0K(this.A03, A0k);
    }
}

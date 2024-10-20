package X;

/* loaded from: Ksf.class */
public final class Ksf {
    public float A00 = 0.0f;
    public boolean A01 = true;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ksf)) {
                return false;
            }
            Ksf ksf = (Ksf) obj;
            if (Float.compare(this.A00, ksf.A00) != 0 || this.A01 != ksf.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (JQz.A04(this.A00) + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31 * 31;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RowColumnParentData(weight=");
        A0k.append(this.A00);
        A0k.append(", fill=");
        A0k.append(this.A01);
        A0k.append(", crossAxisAlignment=");
        A0k.append((Object) null);
        A0k.append(", flowLayoutData=");
        return AnonymousClass002.A0K(null, A0k);
    }
}

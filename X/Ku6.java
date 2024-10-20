package X;

/* loaded from: Ku6.class */
public final class Ku6 {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public Ku6(Object obj, String str, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }

    public final L8b A00(int i) {
        int i2 = this.A00;
        int i3 = (-1) << (-1);
        if (i2 != i3) {
            i = i2;
        } else if (i == i3) {
            throw AnonymousClass001.A0N("Item.end should be set first");
        }
        return new L8b(this.A02, this.A03, this.A01, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ku6)) {
                return false;
            }
            Ku6 ku6 = (Ku6) obj;
            if (!11T.A0O(this.A02, ku6.A02) || this.A01 != ku6.A01 || this.A00 != ku6.A00 || !11T.A0O(this.A03, ku6.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A03, ((((AnonymousClass001.A02(this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MutableRange(item=");
        A0k.append(this.A02);
        A0k.append(", start=");
        A0k.append(this.A01);
        A0k.append(", end=");
        A0k.append(this.A00);
        A0k.append(", tag=");
        return DKH.A0o(this.A03, A0k);
    }
}

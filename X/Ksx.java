package X;

/* loaded from: Ksx.class */
public final class Ksx {
    public final MQK A00;
    public final String A01;

    public Ksx(MQK mqk, String str) {
        this.A01 = str;
        this.A00 = mqk;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ksx)) {
                return false;
            }
            Ksx ksx = (Ksx) obj;
            if (!11T.A0O(this.A01, ksx.A01) || !11T.A0O(this.A00, ksx.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 1BL.A05(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FBPayFullNameComponent(payerName=");
        A0k.append(this.A01);
        A0k.append(", fullNameFieldConfig=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}

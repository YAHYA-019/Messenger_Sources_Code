package X;

/* loaded from: Eyt.class */
public final class Eyt {
    public final long A00;
    public final ELh A01;
    public final String A02;
    public final java.util.Map A03;

    public Eyt(ELh eLh, String str, java.util.Map map, long j) {
        this.A02 = str;
        this.A03 = map;
        this.A00 = j;
        this.A01 = eLh;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyt)) {
                return false;
            }
            Eyt eyt = (Eyt) obj;
            if (!11T.A0O(this.A02, eyt.A02) || !11T.A0O(this.A03, eyt.A03) || this.A00 != eyt.A00 || this.A01 != eyt.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, AnonymousClass002.A02(this.A00, AnonymousClass002.A05(this.A03, 4YV.A02(this.A02))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ComponentQueryStoreRequest(appId=");
        A0k.append(this.A02);
        A0k.append(", params=");
        A0k.append(this.A03);
        A0k.append(", cacheTtlSeconds=");
        A0k.append(this.A00);
        A0k.append(", queryPurpose=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}

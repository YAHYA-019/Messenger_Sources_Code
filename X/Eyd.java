package X;

import java.util.List;

/* loaded from: Eyd.class */
public final class Eyd {
    public final int A00;
    public final String A01;
    public final List A02;

    public Eyd(String str, List list, int i) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyd)) {
                return false;
            }
            Eyd eyd = (Eyd) obj;
            if (!11T.A0O(this.A01, eyd.A01) || this.A00 != eyd.A00 || !11T.A0O(this.A02, eyd.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, (4YV.A02(this.A01) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AsyncComponentContainerTargetInfo(serverId=");
        A0k.append(this.A01);
        A0k.append(", clientId=");
        A0k.append(this.A00);
        A0k.append(", keyPath=");
        return AnonymousClass002.A0K(this.A02, A0k);
    }
}

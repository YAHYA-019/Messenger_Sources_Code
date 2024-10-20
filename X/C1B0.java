package X;

import java.util.List;

/* renamed from: X.1B0, reason: invalid class name */
/* loaded from: 1B0.class */
public final class C1B0 {
    public String A00;
    public List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1B0)) {
                return false;
            }
            C1B0 c1b0 = (C1B0) obj;
            if (!11T.A0O(this.A00, c1b0.A00) || !11T.A0O(this.A01, c1b0.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BackupDataEntry(userId=");
        A0k.append(this.A00);
        A0k.append(", features=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}

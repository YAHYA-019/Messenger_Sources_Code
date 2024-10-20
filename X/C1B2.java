package X;

import java.util.Arrays;

/* renamed from: X.1B2, reason: invalid class name */
/* loaded from: 1B2.class */
public final class C1B2 {
    public String A00;
    public byte[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1B2)) {
                return false;
            }
            C1B2 c1b2 = (C1B2) obj;
            if (!11T.A0O(this.A00, c1b2.A00) || !11T.A0O(this.A01, c1b2.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + Arrays.hashCode(this.A01);
    }

    public String toString() {
        return 0Pz.A0w("BackupDataFeatureEntry(feature=", this.A00, ", backupData=", Arrays.toString(this.A01), ')');
    }
}

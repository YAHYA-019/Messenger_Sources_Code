package X;

/* loaded from: Ktc.class */
public final class Ktc {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final java.util.Map A04;
    public final java.util.Map A05;

    public Ktc(String str, String str2, String str3, java.util.Map map, java.util.Map map2, int i) {
        this.A01 = str;
        this.A04 = map;
        this.A03 = str2;
        this.A05 = map2;
        this.A02 = str3;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ktc)) {
                return false;
            }
            Ktc ktc = (Ktc) obj;
            if (!11T.A0O(this.A01, ktc.A01) || !11T.A0O(this.A04, ktc.A04) || !11T.A0O(this.A03, ktc.A03) || !11T.A0O(this.A05, ktc.A05) || !11T.A0O(this.A02, ktc.A02) || this.A00 != ktc.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A02, AnonymousClass002.A05(this.A05, AnonymousClass002.A07(this.A03, AnonymousClass002.A05(this.A04, 4YV.A02(this.A01))))) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FetchVirtualDeviceInfoResponse(epochId=");
        A0k.append(this.A01);
        A0k.append(", encryptedSecretValues=");
        A0k.append(this.A04);
        A0k.append(", lastEpochId=");
        A0k.append(this.A03);
        A0k.append(", syncEpochs=");
        A0k.append(this.A05);
        A0k.append(", epochStoragePublicKey=");
        A0k.append(this.A02);
        A0k.append(", backupTenancy=");
        return DKH.A0p(A0k, this.A00);
    }
}

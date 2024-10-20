package X;

import java.util.UUID;

/* loaded from: Htw.class */
public final class Htw {
    public UUID A06 = null;
    public MFl A02 = null;
    public HCo A04 = null;
    public UUID A05 = null;
    public MFl A01 = null;
    public HCo A03 = null;
    public KpQ A00 = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Htw)) {
                return false;
            }
            Htw htw = (Htw) obj;
            if (!11T.A0O(this.A06, htw.A06) || !11T.A0O(this.A02, htw.A02) || this.A04 != htw.A04 || !11T.A0O(this.A05, htw.A05) || !11T.A0O(this.A01, htw.A01) || this.A03 != htw.A03 || !11T.A0O(this.A00, htw.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass001.A02(this.A06) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + 4YU.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PendingLinkSetupValues(txId=");
        A0k.append(this.A06);
        A0k.append(", txTransformer=");
        A0k.append(this.A02);
        A0k.append(", txTargetState=");
        A0k.append(this.A04);
        A0k.append(", rxId=");
        A0k.append(this.A05);
        A0k.append(", rxTransformer=");
        A0k.append(this.A01);
        A0k.append(", rxTargetState=");
        A0k.append(this.A03);
        A0k.append(", rollover=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}

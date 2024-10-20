package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9c2, reason: invalid class name */
/* loaded from: 9c2.class */
public final class C9c2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AYf A04;
    public final MfU A05;
    public final 7Tm A06;

    public C9c2(9Zq r302) {
        this.A06 = r302.A06;
        this.A00 = r302.A00;
        this.A01 = r302.A01;
        this.A02 = r302.A02;
        AYf aYf = r302.A04;
        C1pq.A08("listener", aYf);
        this.A04 = aYf;
        this.A03 = r302.A03;
        MfU mfU = r302.A05;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, mfU);
        this.A05 = mfU;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9c2)) {
                return false;
            }
            C9c2 c9c2 = (C9c2) obj;
            if (!11T.A0O(this.A06, c9c2.A06) || this.A00 != c9c2.A00 || this.A01 != c9c2.A01 || this.A02 != c9c2.A02 || !11T.A0O(this.A04, c9c2.A04) || this.A03 != c9c2.A03 || this.A05 != c9c2.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = (C1pq.A04(this.A04, (((((C1pq.A03(this.A06) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03;
        return (A04 * 31) + C3o5.A03(this.A05);
    }
}

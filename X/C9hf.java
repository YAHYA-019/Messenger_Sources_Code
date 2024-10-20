package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9hf, reason: invalid class name */
/* loaded from: 9hf.class */
public final class C9hf {
    public final C1u3 A00;
    public final CharSequence A01;

    public C9hf(C1u3 c1u3, CharSequence charSequence) {
        this.A01 = charSequence;
        this.A00 = c1u3;
    }

    public C9hf(9PJ r302) {
        CharSequence charSequence = r302.A01;
        C1pq.A08("contentDescription", charSequence);
        this.A01 = charSequence;
        C1u3 c1u3 = r302.A00;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, c1u3);
        this.A00 = c1u3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9hf)) {
                return false;
            }
            C9hf c9hf = (C9hf) obj;
            if (!11T.A0O(this.A01, c9hf.A01) || this.A00 != c9hf.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A01);
        return (A03 * 31) + C3o5.A03(this.A00);
    }
}

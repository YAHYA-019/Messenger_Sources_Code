package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Set;

/* loaded from: C9T.class */
public final class C9T {
    public static volatile C1u3 A07;
    public static volatile CharSequence A08;
    public final int A00;
    public final Bpf A01;
    public final String A02;
    public final String A03;
    public final C1u3 A04;
    public final CharSequence A05;
    public final Set A06;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0073, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9T(X.CQE r302) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9T.<init>(X.CQE):void");
    }

    public C1u3 A00() {
        if (this.A06.contains(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
            return this.A04;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = C1u3.A3u;
                }
            }
        }
        return A07;
    }

    public CharSequence A01() {
        if (this.A06.contains("title")) {
            return this.A05;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = "";
                }
            }
        }
        return A08;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9T)) {
                return false;
            }
            C9T c9t = (C9T) obj;
            if (!11T.A0O(this.A02, c9t.A02) || !11T.A0O(this.A03, c9t.A03) || A00() != c9t.A00() || this.A00 != c9t.A00 || !11T.A0O(this.A01, c9t.A01) || !11T.A0O(A01(), c9t.A01())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A03(this.A02));
        return C1pq.A04(A01(), C1pq.A04(this.A01, (((A04 * 31) + C3o5.A03(A00())) * 31 * 31) + this.A00));
    }
}

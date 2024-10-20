package X;

import android.util.Base64;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.0T4, reason: invalid class name */
/* loaded from: 0T4.class */
public final class C0T4 {
    public final boolean A00;
    public final byte[] A01;

    public C0T4(byte[] bArr, boolean z) {
        11T.A0F(bArr, 1);
        this.A01 = bArr;
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C0T4) {
            C0T4 c0t4 = (C0T4) obj;
            if (MessageDigest.isEqual(this.A01, c0t4.A01) && this.A00 == c0t4.A00) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.A01)), Boolean.valueOf(this.A00)});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ExpectedAppCertificateHash(sha256=");
        A0k.append(Base64.encodeToString(this.A01, 10));
        A0k.append(", required=");
        A0k.append(this.A00);
        return AnonymousClass001.A0g(A0k, ')');
    }
}

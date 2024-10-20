package X;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: X.05F, reason: invalid class name */
/* loaded from: 05F.class */
public final class C05F extends C05G implements C05H {
    public final X509TrustManagerExtensions A00;

    public C05F(0EQ r302, long j) {
        super(r302, j);
        this.A00 = new X509TrustManagerExtensions(this.A02);
    }

    @Override // X.C05I
    public void AEx(String str, String str2, X509Certificate[] x509CertificateArr) {
        A01(this.A00.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA", str2));
    }

    @Override // X.C05H
    public void AEy(String str, String str2, X509Certificate[] x509CertificateArr, boolean z) {
        List<X509Certificate> checkServerTrusted = this.A00.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA", str2);
        if (z) {
            A01(checkServerTrusted);
        }
    }
}

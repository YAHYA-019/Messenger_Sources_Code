package X;

import android.security.keystore.StrongBoxUnavailableException;
import android.util.Base64;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.List;

/* loaded from: G5c.class */
public final class G5c implements Runnable {
    public static final String __redex_internal_original_name = "CaaAppAttestationHelper$maybeGenerateKeyPair$1";
    public final /* synthetic */ F68 A00;
    public final /* synthetic */ FHh A01;
    public final /* synthetic */ GJj A02;
    public final /* synthetic */ 0CL A03;
    public final /* synthetic */ byte[] A04;

    public G5c(F68 f68, FHh fHh, GJj gJj, 0CL r305, byte[] bArr) {
        this.A00 = f68;
        this.A04 = bArr;
        this.A03 = r305;
        this.A01 = fHh;
        this.A02 = gJj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        List<Certificate> asList;
        StringBuilder A0k;
        try {
            F68 f68 = this.A00;
            C00i c00i = f68.A03.A00;
            C1A6 c1a6 = (C1A6) c00i.get();
            byte[] bArr = this.A04;
            C1A8 c1a8 = C1A8.EC;
            boolean z = c1a6.A01;
            try {
                0uY.A01(c1a8, bArr, true, z);
            } catch (ProviderException e) {
                if (e instanceof StrongBoxUnavailableException) {
                    try {
                        0uY.A01(c1a8, bArr, false, z);
                    } catch (ProviderException e2) {
                        new Exception("Unable to generate attested key", e2);
                        throw th;
                    }
                } else {
                    new Exception("Unable to generate attested key", e);
                }
                throw th;
            }
            0CL r0 = this.A03;
            String A00 = ((C1A6) c00i.get()).A00();
            11T.A0A(A00);
            r0.element = A00;
            try {
                asList = Arrays.asList(((C1A6) c00i.get()).A00.A00.getCertificateChain("w6CmevIyM/PL6Q5uUDw="));
                A0k = AnonymousClass001.A0k();
            } catch (NullPointerException | GeneralSecurityException e3) {
                new Exception("Unable to get certificate chain", e3);
            }
            try {
                for (Certificate certificate : asList) {
                    A0k.append("-----BEGIN CERTIFICATE-----\n");
                    A0k.append(Base64.encodeToString(certificate.getEncoded(), 0));
                    A0k.append("-----END CERTIFICATE-----\n");
                }
                f68.A00.post(new G5b(f68, this.A01, this.A02, A0k.toString().trim(), r0));
            } catch (CertificateEncodingException e4) {
                new Exception("Unable to encode attestation certificates", e4);
                throw th;
            }
        } catch (C1A7 e5) {
            F68 f682 = this.A00;
            f682.A00.post(new G4u(f682, e5, this.A01, this.A02));
        } catch (Exception e6) {
            F68.A00(this.A01, this.A02, 0Pz.A1B("Exception: ", e6));
        }
    }
}

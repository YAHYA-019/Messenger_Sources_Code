package com.facebook.mobilenetwork.internal.certificateverifier;

import X.05K;
import X.0Pz;
import X.3jF;
import X.AnonymousClass000;
import X.C05D;
import X.C05G;
import X.C05H;
import X.C05I;
import X.C1d2;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.X509TrustManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: CertificateVerifier.class */
public class CertificateVerifier {
    public static final byte[] CRL_PUBLIC_KEY_BYTES = {48, -126, 1, 34, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, -126, 1, 15, 0, 48, -126, 1, 10, 2, -126, 1, 1, 0, -69, 110, 57, -95, 80, -27, 35, 65, -65, -55, 5, 75, -31, 6, 19, 113, -119, -19, -80, 120, 45, 54, 79, -46, -86, -93, 50, 63, 47, 53, 105, -28, 35, -69, -120, 103, -72, -17, -9, -106, 2, 117, 126, -15, -115, 86, 3, -109, -11, -4, 76, -104, -92, -31, -7, 44, 49, 101, -79, -13, 64, -22, -59, -90, 20, 20, -90, -126, 38, 12, 53, -108, -113, 39, -80, Byte.MAX_VALUE, 125, 42, 70, -70, -108, -90, 121, 3, 78, -103, -82, 75, 6, 111, -106, 124, 68, -23, -69, 62, -114, 14, 100, -95, 84, 36, -109, -68, 43, 105, -95, 44, -126, 60, -76, 26, -50, 39, 54, 70, 27, -109, 89, 111, 126, 111, 94, -68, 126, -61, 101, -27, 105, 85, 46, -2, -59, 55, 64, 70, 5, 22, -54, 114, -110, -97, 87, 83, 5, -103, -60, -84, 77, 113, 120, 25, -88, -88, 102, -110, -69, -66, -89, 125, -40, -125, -122, 8, 84, -80, -65, 64, -98, 31, -48, 27, -8, 28, -42, -62, 122, 45, 111, -69, 47, -56, -12, -20, 19, -13, Byte.MAX_VALUE, -104, 85, 71, -14, 28, -63, 31, 86, -70, -99, -116, 74, Byte.MAX_VALUE, 72, -65, 66, -3, -19, -20, 99, -60, 111, -56, 24, 76, 87, -25, -81, 100, 8, 16, 41, -20, -19, -91, -1, 72, -96, -99, -58, -92, -64, -56, 87, 116, -20, -104, 96, 9, 88, -34, -113, 5, -75, -52, 1, 13, 3, 100, -120, -81, -36, 95, -93, -55, -100, 110, -110, -67, 2, 3, 1, 0, 1};
    public final 05K mFbHostnameVerifier;
    public final C1d2 mFbPinningSSLContextFactory;
    public Set revokedCertificateSerials = new HashSet();

    /* JADX WARN: Type inference failed for: r0v4, types: [X.05D, X.1d2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.05K] */
    public CertificateVerifier(long j, boolean z) {
        ?? c05d = new C05D(j, false);
        if (z) {
            X509TrustManager[] x509TrustManagerArr = c05d.A00;
            x509TrustManagerArr[0] = new 3jF((C05I) x509TrustManagerArr[0]);
        }
        this.mFbPinningSSLContextFactory = c05d;
        this.mFbHostnameVerifier = new Object();
    }

    public void setCertificateRevocationList(String str) {
        Boolean bool;
        Throwable th;
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
            boolean equalsIgnoreCase = jSONObject.getJSONObject("signature_algorithm").getString(AnonymousClass000.A00(ActionId.VIEW_DID_APPEAR_BEGIN)).equalsIgnoreCase("sha256_rsa");
            if (!equalsIgnoreCase || string.length() == 512) {
                for (char c : string.toCharArray()) {
                    if (c < '0' || (c > '9' && (c < 'A' || (c > 'F' && (c < 'a' || c > 'f'))))) {
                        bool = false;
                        break;
                    }
                }
                bool = true;
                if (bool.booleanValue()) {
                    String string2 = jSONObject.getString("tbs_cert_list");
                    if (equalsIgnoreCase) {
                        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(CRL_PUBLIC_KEY_BYTES));
                        Signature signature = Signature.getInstance(AnonymousClass000.A00(237));
                        signature.initVerify(generatePublic);
                        signature.update(string2.getBytes(StandardCharsets.UTF_8));
                        int length = string.length();
                        byte[] bArr = new byte[length / 2];
                        for (int i = 0; i < length; i += 2) {
                            bArr[i / 2] = (byte) ((Character.digit(string.charAt(i), 16) << 4) + Character.digit(string.charAt(i + 1), 16));
                        }
                        if (signature.verify(bArr)) {
                            JSONArray jSONArray = new JSONObject(string2).getJSONArray("revoked_certificates");
                            int i2 = 0;
                            while (true) {
                                if (i2 >= jSONArray.length()) {
                                    return;
                                }
                                String string3 = jSONArray.getJSONObject(i2).getString("user_certificate");
                                if (!string3.substring(0, 2).equalsIgnoreCase("0x")) {
                                    new Exception("Invalid CRL serial number format.");
                                    break;
                                } else if (string3.substring(2).length() > 40) {
                                    new Exception("Invalid CRL serial number length.");
                                    break;
                                } else {
                                    this.revokedCertificateSerials.add(new BigInteger(string3.substring(2), 16));
                                    i2++;
                                }
                            }
                        }
                    }
                    new Exception("CRL signature validation failed.");
                } else {
                    new Exception("Invalid CRL signature format.");
                }
            } else {
                new Exception("Invalid CRL signature length.");
            }
            throw th;
        } catch (Exception e) {
            throw new CertificateException(0Pz.A1B("Invalid CRL: ", e));
        }
    }

    public void verify(byte[][] bArr, String str) {
        verify(bArr, str, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void verify(byte[][] bArr, String str, boolean z) {
        int length = bArr.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
        for (int i = 0; i < length; i++) {
            x509CertificateArr[i] = certificateFactory.generateCertificate(new ByteArrayInputStream(bArr[i]));
        }
        BigInteger serialNumber = x509CertificateArr[0].getSerialNumber();
        if (serialNumber != null && this.revokedCertificateSerials.contains(serialNumber)) {
            throw new CertificateException(0Pz.A0V("Certificate is revoked. Serial=", serialNumber));
        }
        X509TrustManager x509TrustManager = this.mFbPinningSSLContextFactory.A00[0];
        if (x509TrustManager instanceof C05H) {
            ((C05H) x509TrustManager).AEy("ECDHE_ECDSA", str, x509CertificateArr, z);
        } else if (x509TrustManager instanceof C05G) {
            C05G c05g = (C05G) x509TrustManager;
            c05g.A02.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA");
            if (z) {
                c05g.A02(x509CertificateArr);
            }
        } else if (x509TrustManager instanceof C05I) {
            ((C05I) x509TrustManager).AEx("ECDHE_ECDSA", str, x509CertificateArr);
        } else {
            x509TrustManager.checkServerTrusted(x509CertificateArr, "ECDHE_ECDSA");
        }
        if (!this.mFbHostnameVerifier.A01(str, x509CertificateArr[0])) {
            throw new CertificateException("Hostname verification failed.");
        }
    }
}

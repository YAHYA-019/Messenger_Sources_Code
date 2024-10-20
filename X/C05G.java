package X;

import android.content.res.AssetManager;
import android.util.Base64;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.05G, reason: invalid class name */
/* loaded from: 05G.class */
public abstract class C05G implements X509TrustManager {
    public 0EQ A00;
    public final Set A01 = new HashSet();
    public final X509TrustManager A02;
    public final long A03;
    public final boolean A04;

    public C05G(0EQ r302, long j) {
        X509TrustManager A00;
        this.A00 = r302;
        try {
            A00 = A00();
        } catch (NullPointerException unused) {
            try {
                AssetManager.class.getMethod("getSystem", new Class[0]).invoke(null, new Object[0]);
                A00 = A00();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new IllegalStateException("Failure reinitializing TrustManager", e);
            }
        }
        this.A02 = A00;
        this.A04 = j > 0;
        this.A03 = j + 31536000000L;
        String[] strArr = 05J.A00;
        int i = 0;
        do {
            this.A01.add(ByteBuffer.wrap(Base64.decode(strArr[i], 0)));
            i++;
        } while (i < 18);
    }

    public static X509TrustManager A00() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new CertificateException("Unable to create system TrustManger");
        } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            throw new IllegalStateException("Failure initializing TrustManager", e);
        }
    }

    public void A01(List list) {
        if (!this.A04 || System.currentTimeMillis() <= this.A03) {
            if (list.isEmpty()) {
                throw new CertificateException("pinning error: certificate chain empty");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    if (this.A01.contains(ByteBuffer.wrap(MessageDigest.getInstance("SHA-256").digest(((Certificate) it.next()).getPublicKey().getEncoded())))) {
                        return;
                    }
                } catch (NoSuchAlgorithmException e) {
                    throw new CertificateException(e);
                }
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("pinning error, trusted chain: ");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnonymousClass001.A1I(A0k, Base64.encodeToString(((Certificate) it2.next()).getEncoded(), 0));
            }
            throw new CertificateException(A0k.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0051, code lost:
    
        if (r0.getPublicKey().equals(r0.getPublicKey()) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(java.security.cert.X509Certificate[] r302) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05G.A02(java.security.cert.X509Certificate[]):void");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.A02.checkServerTrusted(x509CertificateArr, str);
        A02(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.A02.getAcceptedIssuers();
    }
}

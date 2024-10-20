package X;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.5Hk, reason: invalid class name */
/* loaded from: 5Hk.class */
public final class C5Hk extends 1kL {
    public final /* synthetic */ 5Hj A00;

    public C5Hk(5Hj r302) {
        this.A00 = r302;
    }

    public /* bridge */ /* synthetic */ Object A00(Object obj) {
        File A03;
        String str;
        5Hj r0 = this.A00;
        Uri uri = ((81I) obj).A04;
        synchronized (r0) {
            A03 = ((I4g) r0.A00.get()).A03(uri);
        }
        if (A03 == null) {
            0fH.A0T(5Hj.class, "Couldn't resolve backing file for media resource: %s", new Object[]{uri});
            return "";
        }
        String BCz = 1BK.A0N(r0.A01).BCz(36873415222624295L, 1BJ.A00(727));
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(BCz.getBytes(), "HmacSHA256"));
            long length = A03.length();
            boolean z = true;
            long j = 0;
            C05344dj c05344dj = new C05344dj(A03);
            C05364dl c05364dl = new C05364dl(C05364dl.A03);
            try {
                FileInputStream fileInputStream = new FileInputStream(c05344dj.A00);
                c05364dl.A00(fileInputStream);
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    int i = 0;
                    while (true) {
                        boolean z2 = true;
                        if (!z || i >= read) {
                            break;
                        }
                        if (bArr[i] != 0) {
                            z2 = false;
                        }
                        z = z2;
                        i++;
                    }
                    j += read;
                    mac.update(bArr, 0, read);
                }
                if (z || j != length) {
                    0fH.A0T(5Hj.class, "Read bytes failed. IsAllBytesZero: %b, TotalBytesRead: %d, FileSize: %d", new Object[]{Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(length)});
                    str = "";
                } else {
                    str = C0B9.A00(mac.doFinal(), false).toLowerCase(Locale.US);
                }
                c05364dl.close();
                return str;
            } finally {
            }
        } catch (Exception e) {
            0fH.A0P(5Hj.class, "Couldn't generate sha256 hash of file: %s with salt: %s", e, new Object[]{uri, BCz});
            return "";
        }
    }
}

package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: I83.class */
public final class I83 {
    public final HOZ A00;

    public I83(HOZ hoz) {
        this.A00 = hoz;
    }

    public static File A00(I83 i83) {
        File A0D = AnonymousClass001.A0D(i83.A00.A00.getCacheDir(), "lottie_network_cache");
        if (A0D.isFile()) {
            A0D.delete();
        }
        if (!A0D.exists()) {
            A0D.mkdirs();
        }
        return A0D;
    }

    public static String A01(HBd hBd, String str, boolean z) {
        String A0W = z ? 0Pz.A0W(".temp", hBd.extension) : hBd.extension;
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - A0W.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder A0k = AnonymousClass001.A0k();
                for (byte b : digest) {
                    A0k.append(String.format("%02x", Byte.valueOf(b)));
                }
                replaceAll = A0k.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return 0Pz.A0j("lottie_cache_", replaceAll, A0W);
    }

    public File A02(HBd hBd, InputStream inputStream, String str) {
        File A0D = AnonymousClass001.A0D(A00(this), A01(hBd, str, true));
        try {
            FileOutputStream A14 = GOn.A14(A0D);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        A14.flush();
                        return A0D;
                    }
                    A14.write(bArr, 0, read);
                }
            } finally {
                A14.close();
            }
        } finally {
            inputStream.close();
        }
    }
}

package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.Closeables;
import com.google.common.io.FileWriteMode;
import com.google.common.io.Files;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.regex.Pattern;

/* renamed from: X.66f, reason: invalid class name */
/* loaded from: 66f.class */
public final class C66f implements 1Tu {
    public static final Pattern A0C = Pattern.compile("\\.|:");
    public static final ImmutableSet A0D;
    public final Context A00;
    public final 2Ca A04;
    public final C66p A06;
    public final C00i A03 = new 1BQ(16511);
    public final C00i A0B = new 1BQ(65669);
    public final C2tx A02 = (C2tx) 1Bi.A03(17131);
    public final AnonymousClass536 A01 = (AnonymousClass536) 1Bi.A03(49473);
    public final 5Hl A07 = (5Hl) 1Bn.A0A(116210);
    public final 66X A05 = (66X) 1Bi.A03(49958);
    public final File A09 = (File) 1Bn.A0A(99993);
    public final File A0A = (File) 1Bn.A0A(99994);
    public final 1CO A08 = (1CO) 1Bi.A03(16385);

    static {
        1I0 r0 = new 1I0(4);
        for (2GE r02 : AbstractC05294de.A0C) {
            try {
                r0.A05(r02.A00);
            } catch (UnsupportedOperationException e) {
                0fH.A12("MediaDownloadServiceHandler", "Unknown image format %s", e, new Object[]{r02.A01});
            }
        }
        A0D = r0.A07();
    }

    public C66f(Context context) {
        this.A00 = context;
        this.A06 = (C66p) 1Bn.A0E(context, (1BY) null, 49960);
        this.A04 = (2Ca) 1Bn.A0E(context, (1BY) null, 16942);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.messaging.media.download.params.response.DownloadedMedia A00(com.facebook.messaging.media.download.params.SaveMediaParams r302) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66f.A00(com.facebook.messaging.media.download.params.SaveMediaParams):com.facebook.messaging.media.download.params.response.DownloadedMedia");
    }

    private File A01(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            2GE A01 = ((2GX) 2GX.A04.getValue()).A01(fileInputStream);
            fileInputStream.close();
            String str = null;
            try {
                str = A01.A00;
            } catch (UnsupportedOperationException e) {
                0fH.A12("MediaDownloadServiceHandler", "Unknown image format %s", e, new Object[]{A01.A01});
            }
            return A02(file, str);
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public static File A02(File file, String str) {
        if (Files.A02(file.getName()).equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
            return file;
        }
        File file2 = new File(file.getParentFile(), 0Pz.A0j(Files.A03(file.getName()), ".", str));
        if (file.renameTo(file2)) {
            return file2;
        }
        0fH.A17("MediaDownloadServiceHandler", "Could not rename file %s to %s", new Object[]{file.getAbsolutePath(), file2.getAbsolutePath()});
        return file;
    }

    private File A03(Integer num, String str, String str2) {
        StringBuilder sb = new StringBuilder(256);
        sb.append("received");
        sb.append("_");
        sb.append(str);
        int intValue = num.intValue();
        File file = null;
        if (intValue != 0) {
            if (intValue == 1) {
                file = this.A01.A0C(AnonymousClass001.A0d("_", sb), 0Pz.A0W(".", str2));
            }
            return file;
        }
        File file2 = this.A09;
        if (!file2.exists() && !file2.mkdirs()) {
            0fH.A0n("MediaDownloadServiceHandler", "Failed to create directory to save photos.");
            return null;
        }
        sb.append(".");
        sb.append(str2);
        return new File(file2, sb.toString());
    }

    private void A04(Uri uri, C00X c00x, File file) {
        InputStream openInputStream;
        IllegalArgumentException th;
        InputStream inputStream = null;
        try {
            if (69J.A02(uri)) {
                openInputStream = new URL(uri.toString()).openStream();
            } else {
                if (uri.getPath() != null) {
                    String scheme = uri.getScheme();
                    if (scheme != null && scheme.equalsIgnoreCase("file")) {
                        String path = uri.getPath();
                        if (path == null) {
                            th = AnonymousClass001.A0L("Invalid file Uri. Unable to get file path");
                            throw th;
                        }
                        if (c00x != null) {
                            new 0Zj(c00x, path);
                        } else {
                            new FileInputStream(path);
                        }
                    }
                }
                openInputStream = this.A00.getContentResolver().openInputStream(uri);
            }
            inputStream = openInputStream;
            if (openInputStream != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            fileOutputStream.close();
                            Closeables.A01(openInputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        7kF.A00(th, th3);
                    }
                }
            } else {
                th = AnonymousClass001.A0L("InputStream cannot be null");
            }
            throw th;
        } catch (Throwable th4) {
            if (inputStream != null) {
                Closeables.A01(inputStream);
            }
            throw th4;
        }
    }

    public static void A05(C66f c66f, BufferedInputStream bufferedInputStream, File file, boolean z) {
        if (z) {
            ((C6q4) c66f.A0B.get()).A01(bufferedInputStream, file, 0S2.A00);
            return;
        }
        file.getClass();
        ImmutableSet A08 = ImmutableSet.A08(new FileWriteMode[0]);
        bufferedInputStream.getClass();
        C05364dl c05364dl = new C05364dl(C05364dl.A03);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, A08.contains(FileWriteMode.A01));
            c05364dl.A00(fileOutputStream);
            1SB.A00(bufferedInputStream, fileOutputStream);
            fileOutputStream.flush();
        } finally {
        }
    }

    public File A06(Integer num, String str) {
        if (num == 0S2.A01) {
            num = 0S2.A00;
        }
        1Du it = A0D.iterator();
        while (it.hasNext()) {
            File A03 = A03(num, str, (String) it.next());
            if (A03 != null && A03.exists()) {
                return A03;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x040b, code lost:
    
        if (r0 == X.AbstractC05294de.A07) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x06a6, code lost:
    
        if (r0.mkdirs() != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06da, code lost:
    
        if (r317.exists() != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0858, code lost:
    
        if (r0.mkdirs() != false) goto L311;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.fbservice.service.OperationResult BMQ(X.1TC r302) {
        /*
            Method dump skipped, instructions count: 2591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66f.BMQ(X.1TC):com.facebook.fbservice.service.OperationResult");
    }
}

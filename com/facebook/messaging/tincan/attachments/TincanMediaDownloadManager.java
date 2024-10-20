package com.facebook.messaging.tincan.attachments;

import X.0Pz;
import X.0fH;
import X.1BK;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Lo;
import X.1MC;
import X.1MV;
import X.1UN;
import X.1UP;
import X.1Uj;
import X.2Ij;
import X.2L6;
import X.2LB;
import X.2yD;
import X.9rO;
import X.AnonymousClass001;
import X.C00i;
import X.C0A2;
import X.C3b7;
import X.I8E;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.tincan.attachments.utils.MsysTincanVideoThumbnailHelper;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: TincanMediaDownloadManager.class */
public final class TincanMediaDownloadManager implements 1UN {
    public 1BY A00;
    public File A01;
    public final FbUserSession A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final AtomicBoolean A0C;
    public volatile SettableFuture mMediaManager;

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public TincanMediaDownloadManager(1BO r302, FbUserSession fbUserSession) {
        this.A0A = new 1BV(this.A00, 99908);
        1BV r0 = new 1BV(this.A00, 16942);
        this.A03 = r0;
        this.A06 = new 1BV(this.A00, 67600);
        this.A04 = new 1BV(this.A00, 66496);
        1BQ r02 = new 1BQ(16385);
        this.A09 = r02;
        1BQ r03 = new 1BQ(98404);
        this.A07 = r03;
        1BQ r04 = new 1BQ(16957);
        this.A05 = r04;
        this.A0B = new 1BV(this.A00, 84650);
        this.mMediaManager = new Object();
        this.A0C = new AtomicBoolean(false);
        this.A00 = new 1BY(r302);
        this.A02 = fbUserSession;
        if (!((2yD) r02.get()).AZk(36324797575286845L)) {
            r0.get();
            r04.get();
            r03.get();
        }
        Integer num = 1Lo.A05;
        this.A08 = new 1MV(fbUserSession, (1BY) null, 16686);
        ((1UP) 1Bi.A03(66348)).A01(this);
        this.A01 = ((1MC) r03.get()).BKr(1409070501);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x05df, code lost:
    
        if (r309.intValue() != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0561, code lost:
    
        if (r0.equals("v") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x05e2, code lost:
    
        r309 = "video";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0577, code lost:
    
        if (r0.equals("i") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x05ea, code lost:
    
        r309 = "photo";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    /* JADX WARN: Type inference failed for: r0v229, types: [java.util.concurrent.Future] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File A00(java.lang.String r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 1626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.tincan.attachments.TincanMediaDownloadManager.A00(java.lang.String, java.lang.String):java.io.File");
    }

    public File A01(Uri uri) {
        File A00;
        List<String> pathSegments = uri.getPathSegments();
        String str = (String) 1BK.A0r(pathSegments);
        String A14 = 1BK.A14(pathSegments, 1);
        A02();
        try {
            if (Boolean.parseBoolean(uri.getQueryParameter("needThumbnail"))) {
                A00 = AnonymousClass001.A0D(MsysTincanVideoThumbnailHelper.A01(this.A02, (MsysTincanVideoThumbnailHelper) this.A0A.get()), 0Pz.A0j("THUMBNAIL_", A14, ".jpg"));
                if (!A00.exists()) {
                    File A002 = A00(str, A14);
                    9rO r0 = (9rO) this.A06.get();
                    String replace = 0Pz.A0W("file://", A002.getCanonicalPath()).replace(" ", "%20");
                    try {
                        I8E i8e = (I8E) r0.A03.get();
                        Uri uri2 = null;
                        try {
                            uri2 = C0A2.A03(replace);
                        } catch (SecurityException unused) {
                        }
                        uri2.getClass();
                        Bitmap A02 = i8e.A02(uri2);
                        FileOutputStream fileOutputStream = new FileOutputStream(A00);
                        try {
                            A02.getClass();
                            A02.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                            fileOutputStream.flush();
                            return A00;
                        } finally {
                            fileOutputStream.close();
                        }
                    } catch (IOException e) {
                        0fH.A0r("tincan_attachmentHelper_VideoThumbnailException", "Couldn't get video video thumbnail", e);
                        return A00;
                    }
                }
            } else {
                A00 = A00(str, A14);
            }
            return A00;
        } catch (IOException | InterruptedException | ExecutionException | 2L6 | 2LB e2) {
            0fH.A0r("com.facebook.messaging.tincan.attachments.TincanMediaDownloadManager", "Error during file download or decryption", e2);
            ((2Ij) this.A05.get()).A01(e2, str);
            throw e2;
        }
    }

    public void A02() {
        if (this.A0C.getAndSet(true)) {
            return;
        }
        ((1Uj) this.A08.get()).A06(new C3b7(this, 32));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public void AFz() {
        this.mMediaManager = new Object();
        this.A0C.set(false);
        File file = this.A01;
        if (file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
        }
    }
}

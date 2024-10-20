package com.facebook.errorreporting.lacrima.sender.resumable.uploader;

import X.0Pz;
import X.0fH;
import X.1BO;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1EZ;
import X.5DD;
import X.AnonymousClass001;
import X.C00i;
import X.C0iy;
import X.C11674xI;
import X.C11684xK;
import X.EPR;
import X.HkU;
import X.I7G;
import X.ICY;
import X.IE4;
import X.JLb;
import com.facebook.acra.util.AttachmentUtil;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.inject.FbInjector;
import java.io.File;
import java.util.HashMap;

/* loaded from: LacrimaReportUploader.class */
public final class LacrimaReportUploader {
    public 1BY A00;
    public final C11674xI A03 = (C11674xI) 1Bi.A03(49373);
    public final C00i A01 = FbInjector.A03();
    public final 1EZ A02 = (1EZ) 1Bn.A0G((1BY) null, 16428);

    public LacrimaReportUploader(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static final LacrimaReportUploader A00(1BO r301) {
        return new LacrimaReportUploader(r301);
    }

    public static void A01(final LacrimaReportUploader lacrimaReportUploader, File[] fileArr) {
        int length;
        if (fileArr == null || (length = fileArr.length) == 0) {
            return;
        }
        0fH.A0g(Integer.valueOf(length), "lacrima", "Uploading %d files");
        C11674xI c11674xI = (C11674xI) 1Bi.A03(49373);
        ViewerContext BKF = lacrimaReportUploader.A02.BKF();
        if (BKF == null || BKF.A00() == null) {
            0fH.A0k("lacrima", "Could not get auth token, aborting");
            return;
        }
        C11684xK A00 = c11674xI.A00();
        AttachmentUtil.sortPruneOldFiles(fileArr, 10);
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("Authorization", 0Pz.A0W("OAuth ", BKF.A00()));
        ICY icy = new ICY(EPR.A18);
        icy.A05(A0u);
        icy.A02(I7G.A00());
        HkU A01 = icy.A01();
        int i = 0;
        do {
            final File file = fileArr[i];
            if (file != null) {
                if (AttachmentUtil.validateGzip(file)) {
                    IE4 ie4 = new IE4(file, "application/gzip");
                    try {
                        0fH.A0g(file.getName(), "lacrima", "Uploading %s");
                        A00.A01(A01, ie4, new JLb() { // from class: X.0jD
                            @Override // X.JLb
                            public void Bn2() {
                            }

                            @Override // X.JLb
                            public void Bq4(ICS ics) {
                                File file2 = file;
                                0fH.A0g(file2.getName(), "lacrima", "Completed %s");
                                file2.delete();
                            }

                            @Override // X.JLb
                            public void BxZ(5DD r302) {
                                0fH.A11("lacrima", "onFailure %s", r302, new Object[]{file.getName()});
                            }

                            @Override // X.JLb
                            public void CEI(float f) {
                                0fH.A0f(Float.valueOf(f), file.getName(), "lacrima", "onProgress %f %s");
                            }

                            @Override // X.JLb
                            public void onStart() {
                                0fH.A0i(file.getName(), "lacrima", "onStart %s");
                            }
                        });
                    } catch (5DD e) {
                        0fH.A0z("lacrima", "Failed to upload %s", e, new Object[]{file.getName()});
                        C0iy.A00().Bwu("ReportUpload", e, null);
                    }
                } else {
                    0fH.A17("lacrima", "Bad gzip file %s", new Object[]{file.getName()});
                    file.delete();
                }
            }
            i++;
        } while (i < length);
    }
}

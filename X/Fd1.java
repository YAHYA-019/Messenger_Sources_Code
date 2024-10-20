package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.DexStoreUtils;
import com.facebook.inject.FbInjector;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: Fd1.class */
public final class Fd1 implements C4Av {
    public 1BY A00;
    public final FcR A03 = (FcR) 1Bn.A0B(99662);
    public final C00i A02 = FbInjector.A00;
    public final C00i A01 = 1BQ.A02(98404);

    public Fd1(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        File[] listFiles;
        File BKr = ((1MC) this.A01.get()).BKr(1906458943);
        if (!BKr.exists() || (listFiles = BKr.listFiles()) == null) {
            return true;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return true;
            }
            File file = listFiles[i2];
            FcR fcR = this.A03;
            String string = 1BK.A04(this.A02).getString(2131964841);
            AbG.A0B(fcR.A01).AAq();
            ArrayList A0s = AnonymousClass001.A0s();
            HashMap A0u = AnonymousClass001.A0u();
            File[] listFiles2 = BKr.listFiles();
            0RZ.A03(listFiles2, "null when directory is invalid or I/O error");
            int length2 = listFiles2.length;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= length2) {
                    break;
                }
                File file2 = listFiles2[i4];
                File A0D = AnonymousClass001.A0D(file2, "screenshot.png");
                if (A0D.exists()) {
                    A0s.add(Uri.fromFile(A0D));
                }
                String A0W = 0Pz.A0W(FcR.A00(AnonymousClass001.A0D(file2, DexStoreUtils.SECONDARY_DEX_MANIFEST)), "__");
                File[] listFiles3 = file2.listFiles();
                0RZ.A03(listFiles3, "null when directory is invalid or I/O error");
                for (File file3 : listFiles3) {
                    if (!file3.getName().equals("screenshot.png")) {
                        A0u.put(0Pz.A0W(A0W, file3.getName()), Uri.fromFile(file3));
                    }
                }
                i3 = i4 + 1;
            }
            try {
                String str = ((RGA) ((1Rl) fcR.A03.get()).A07(CallerContext.A06(FcR.class), DKC.A0S(fcR.A04), (C04033zm) null, new RLP(string, A0s, A0u))).A00;
                if (str.equals("N/A")) {
                    FEs.A01(file);
                    0fH.A0k("BugReporterConditionalWorker", "Error when attempting to submit report from retry manager. Deleting report.");
                } else {
                    FEs.A01(file);
                    0fH.A0g(str, "BugReporterUploader", "Successfully create a bug report which can be located at this ID: %s");
                    ((C4m) fcR.A02.get()).A00(string, str);
                }
            } catch (Exception e) {
                FEs.A01(file);
                0fH.A0k("BugReporterConditionalWorker", "Error when attempting to submit report from retry manager. Deleting report.");
                0fH.A0r("BugReporterUploader", "Error when trying to do API request to flytrap: %s", e);
            }
            i = i2 + 1;
        }
    }
}

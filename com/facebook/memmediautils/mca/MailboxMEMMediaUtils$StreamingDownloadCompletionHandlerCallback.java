package com.facebook.memmediautils.mca;

import X.0fH;
import X.1BL;
import X.AnonymousClass001;
import X.C7uM;
import X.GmK;
import X.J04;
import X.J05;
import android.net.Uri;
import com.facebook.msys.mcf.MsysError;

/* loaded from: MailboxMEMMediaUtils$StreamingDownloadCompletionHandlerCallback.class */
public abstract class MailboxMEMMediaUtils$StreamingDownloadCompletionHandlerCallback {
    private void callbackJNI(String str, Uri uri, MsysError msysError, int i) {
        GmK gmK = (GmK) this;
        if ((msysError != null && msysError.getCode() != 28) || str == null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("streaming download media error: ");
            A0k.append(msysError);
            0fH.A0k("[MP] ArmadilloMediaDownloader", 1BL.A0u(", downloadIdentifier: ", str, A0k));
            gmK.A05.execute(new J05(gmK.A03, msysError, i));
            return;
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append("streaming download media url: ");
        A0k2.append(uri);
        A0k2.append(", downloadIdentifier: ");
        A0k2.append(str);
        A0k2.append(", errorCode: ");
        0fH.A0j("[MP] ArmadilloMediaDownloader", AnonymousClass001.A0a(msysError != null ? Integer.valueOf(msysError.getCode()) : null, A0k2));
        gmK.A05.execute(new J04(uri, gmK.A03, str));
        C7uM.A02(gmK.A00, gmK.A02, gmK.A01, gmK.A04);
    }
}

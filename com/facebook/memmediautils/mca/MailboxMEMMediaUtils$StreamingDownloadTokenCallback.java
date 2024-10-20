package com.facebook.memmediautils.mca;

import X.0Pz;
import X.0fH;
import X.11T;
import X.GmL;
import X.J03;

/* loaded from: MailboxMEMMediaUtils$StreamingDownloadTokenCallback.class */
public abstract class MailboxMEMMediaUtils$StreamingDownloadTokenCallback {
    private void callbackJNI(String str, String str2) {
        GmL gmL = (GmL) this;
        11T.A0F(str2, 1);
        0fH.A0j("[MP] ArmadilloMediaDownloader", 0Pz.A0v("downloadToken: ", str, ", downloadIdentifier: ", str2));
        gmL.A01.execute(new J03(gmL.A00, str, str2));
    }
}

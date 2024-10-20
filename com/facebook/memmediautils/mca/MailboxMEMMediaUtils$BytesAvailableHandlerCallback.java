package com.facebook.memmediautils.mca;

import X.0fH;
import X.11T;
import X.AnonymousClass001;
import X.GmJ;
import X.J3h;

/* loaded from: MailboxMEMMediaUtils$BytesAvailableHandlerCallback.class */
public abstract class MailboxMEMMediaUtils$BytesAvailableHandlerCallback {
    private void callbackJNI(String str, byte[] bArr, long j, long j2, long j3, boolean z) {
        GmJ gmJ = (GmJ) this;
        11T.A0H(str, bArr);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("streaming download total bytes: ");
        A0k.append(j2);
        A0k.append(", bytes.size: ");
        A0k.append(bArr.length);
        A0k.append(", offset = ");
        0fH.A0j("[MP] ArmadilloMediaDownloader", AnonymousClass001.A0h(A0k, j));
        gmJ.A01.execute(new J3h(gmJ.A00, str, bArr, j, j2, j3, z));
    }
}

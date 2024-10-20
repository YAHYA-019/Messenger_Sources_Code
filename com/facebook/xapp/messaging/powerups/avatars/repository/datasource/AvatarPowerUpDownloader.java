package com.facebook.xapp.messaging.powerups.avatars.repository.datasource;

import X.0DR;
import X.0fH;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2Zo;
import X.2aK;
import X.9MM;
import X.9Rm;
import X.ACe;
import X.AQY;
import X.C01g;
import X.C01i;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import java.io.File;

/* loaded from: AvatarPowerUpDownloader.class */
public final class AvatarPowerUpDownloader {
    public final 1Br A00;
    public final 1Br A01;
    public final C01i A02;

    public AvatarPowerUpDownloader(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = 1Bu.A00(363);
        this.A02 = C01g.A01(new AQY(fbUserSession, 8));
        this.A00 = 1Bq.A00(46);
    }

    private final Object A00(9Rm r302, 0DR r303) {
        C01i c01i = this.A02;
        File file = new File((File) ((9MM) c01i.getValue()).A00.getValue(), r302.A01);
        if (!file.exists()) {
            file = null;
        }
        if (file != null && file.length() > 1) {
            return Uri.fromFile(file);
        }
        9MM r0 = (9MM) c01i.getValue();
        String str = r302.A02;
        11T.A0F(str, 0);
        File[] listFiles = ((File) r0.A00.getValue()).listFiles(new ACe(str, 2));
        if (listFiles == null) {
            listFiles = new File[0];
        }
        for (File file2 : listFiles) {
            try {
                file2.delete();
            } catch (SecurityException e) {
                0fH.A0t("AvatarPowerUpFileManager", "could not remove old power up image", e);
            }
        }
        return 2aK.A00(r303, 2Zo.A00(), new AvatarPowerUpDownloader$downloadAsset$2(r302, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e8 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(X.C92u r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.xapp.messaging.powerups.avatars.repository.datasource.AvatarPowerUpDownloader.A01(X.92u, X.0DR):java.lang.Object");
    }
}

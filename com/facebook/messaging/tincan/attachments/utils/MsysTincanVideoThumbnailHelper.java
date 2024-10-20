package com.facebook.messaging.tincan.attachments.utils;

import X.0Pz;
import X.1BQ;
import X.1Lo;
import X.1MC;
import X.1Zj;
import X.2Jm;
import X.C00i;
import X.HnB;
import com.facebook.auth.usersession.FbUserSession;
import java.io.File;
import java.util.Map;

/* loaded from: MsysTincanVideoThumbnailHelper.class */
public final class MsysTincanVideoThumbnailHelper {
    public final C00i A00 = 1BQ.A02(49642);
    public final C00i A01 = 1BQ.A02(98404);

    public static final MsysTincanVideoThumbnailHelper A00() {
        return new MsysTincanVideoThumbnailHelper();
    }

    public static File A01(FbUserSession fbUserSession, MsysTincanVideoThumbnailHelper msysTincanVideoThumbnailHelper) {
        return ((1MC) msysTincanVideoThumbnailHelper.A01.get()).AUq(new 2Jm((1Zj) null, 0Pz.A02("USER_SCOPED_TEMP_FOLDER_", "TINCAN_MSYS_VIDEO_THUMBNAIL", ((HnB) 1Lo.A06(fbUserSession, 99907)).A00.getCacheDir()), (Map) null, (Map) null), 1827072884);
    }
}

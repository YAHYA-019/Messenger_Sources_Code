package com.facebook.advancedcryptotransport;

import X.AnonymousClass001;
import X.C1z8;
import X.GOn;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: PreviewGenerator.class */
public class PreviewGenerator {
    static {
        C1z8.A00();
    }

    public static boolean generatePreviewFromFullVideoContent(String str, String str2) {
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 1);
        if (createVideoThumbnail == null) {
            return false;
        }
        OutputStream outputStream = null;
        try {
            File A0E = AnonymousClass001.A0E(str2);
            A0E.createNewFile();
            FileOutputStream A14 = GOn.A14(A0E);
            createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 70, A14);
            A14.flush();
            createVideoThumbnail.recycle();
            try {
                A14.close();
            } catch (Exception unused) {
            }
            return true;
        } catch (Exception unused2) {
            createVideoThumbnail.recycle();
            if (0 == 0) {
                return false;
            }
            try {
                outputStream.close();
                return false;
            } catch (Exception unused3) {
                return false;
            }
        } catch (Throwable th) {
            createVideoThumbnail.recycle();
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }
}

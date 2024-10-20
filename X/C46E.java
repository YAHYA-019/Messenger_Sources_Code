package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* renamed from: X.46E, reason: invalid class name */
/* loaded from: 46E.class */
public final class C46E {
    public 1BY A00;
    public final AudioManager A01;
    public final C45a A02;
    public final Context A03;

    public C46E(1BO r302) {
        Context context = (Context) 1Bn.A0G((1BY) null, 83719);
        this.A03 = context;
        this.A01 = (AudioManager) 1Hv.A02(context, 100191);
        this.A02 = (C45a) 1Bi.A03(83227);
        this.A00 = new 1BY(r302);
    }

    public static Uri A00(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null || scheme.equals("file")) {
            if (!new File(uri.getPath()).exists()) {
                return null;
            }
        } else if (!uri.toString().contains("system")) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor == null) {
                    return null;
                }
                try {
                    openAssetFileDescriptor.close();
                } catch (IOException unused) {
                }
                return uri;
            } catch (Throwable unused2) {
                return null;
            }
        }
        return uri;
    }
}

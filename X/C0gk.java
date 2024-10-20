package X;

import android.content.Context;
import android.provider.Settings;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.0gk, reason: invalid class name */
/* loaded from: 0gk.class */
public abstract class C0gk {
    public static String A00(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string != null) {
                return string;
            }
        } catch (Exception e) {
            C0iy.A00().Bwu("GetAndroidID", e, null);
            0fH.A0r("lacrima", "Failed to fetch the constant field ANDROID_ID", e);
        }
        return ConstantsKt.CAMERA_ID_FRONT;
    }
}

package X;

import android.media.MediaFormat;
import android.os.Build;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: HLe.class */
public abstract class HLe {
    public static MediaFormat A00(HBJ hbj, Qxw qxw, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(hbj.value, i9, i3);
        createVideoFormat.setInteger("color-format", 2130708361);
        if (i7 > 0) {
            createVideoFormat.setInteger(TraceFieldType.Bitrate, i7);
        }
        if (i8 > 0) {
            createVideoFormat.setInteger("frame-rate", i8);
        }
        if (i4 > -1) {
            createVideoFormat.setInteger("i-frame-interval", i4);
        }
        if (z2) {
            createVideoFormat.setInteger("profile", i6);
            createVideoFormat.setInteger("level", i5);
            if (Build.VERSION.SDK_INT >= 29) {
                if (z) {
                    createVideoFormat.setInteger("max-bframes", i);
                    if ("qualcomm".equals(new C0eq().A01)) {
                        createVideoFormat.setString("ts-schema", "android.generic.1+2");
                    }
                }
            } else if (z) {
                createVideoFormat.setInteger("latency", 2);
            }
        }
        if (qxw != null) {
            createVideoFormat.setInteger("color-transfer", qxw.A02);
            createVideoFormat.setInteger("color-standard", qxw.A01);
            createVideoFormat.setInteger("color-range", qxw.A00);
            if (Build.VERSION.SDK_INT >= 33) {
                createVideoFormat.setFeatureEnabled("hdr-editing", true);
            }
        }
        if (i2 != -1) {
            createVideoFormat.setInteger("bitrate-mode", i2);
        }
        return createVideoFormat;
    }
}

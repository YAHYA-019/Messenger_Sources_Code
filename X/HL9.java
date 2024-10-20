package X;

import com.facebook.smartcapture.flow.IdCaptureConfig;

/* loaded from: HL9.class */
public abstract class HL9 {
    public static final String A00(H9j h9j, IdCaptureConfig idCaptureConfig) {
        String str;
        if (h9j != null) {
            int ordinal = h9j.ordinal();
            if (ordinal == 0) {
                str = idCaptureConfig.A0B;
            } else if (ordinal == 1) {
                str = idCaptureConfig.A0A;
            }
            if (str != null) {
                return str;
            }
            throw AnonymousClass001.A0N("Required path not passed to IdCaptureConfig");
        }
        throw AnonymousClass001.A0q("Unsupported CaptureStage");
    }
}

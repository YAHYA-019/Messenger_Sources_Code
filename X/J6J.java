package X;

import android.media.MediaCodecInfo;
import org.webrtc.HardwareVideoDecoderFactory;
import org.webrtc.Logging;

/* loaded from: J6J.class */
public final class J6J implements JHR {
    public final int A00;

    public J6J(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ boolean test(Object obj) {
        switch (this.A00) {
            case 0:
                return IDz.A01((MediaCodecInfo) obj);
            case 1:
                String name = ((MediaCodecInfo) obj).getName();
                if (name.startsWith("OMX.qcom.") || name.startsWith("c2.qti.")) {
                    return true;
                }
                Logging.d(HardwareVideoDecoderFactory.TAG, 0Pz.A0W(name, " dropped due to qcom soc targeting"));
                return false;
            case 2:
                return IDz.A02((MediaCodecInfo) obj);
            default:
                return false;
        }
    }
}

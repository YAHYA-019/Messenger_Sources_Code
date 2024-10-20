package X;

import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.wearable.common.comms.hera.shared.p000native.rsys.LegacyWebrtcVideoRenderer;
import org.webrtc.VideoSink;

/* loaded from: Gyi.class */
public abstract class Gyi extends GyZ implements JDf {
    public C0Bd A00;
    public final java.util.Map A01 = 1BK.A1C();
    public final C01i A02 = C01g.A00(C03i.A02, SHm.A00);

    public void renderFrame(RSVideoFrame rSVideoFrame, Object obj, int i) {
        11T.A0H(rSVideoFrame, obj);
        if ((obj instanceof VideoSink) || (obj instanceof RHT)) {
            super.renderFrame(rSVideoFrame, obj, i);
            return;
        }
        LegacyWebrtcVideoRenderer legacyWebrtcVideoRenderer = (LegacyWebrtcVideoRenderer) ((H42) this).A00.get(obj);
        if (legacyWebrtcVideoRenderer != null) {
            legacyWebrtcVideoRenderer.renderFrame(rSVideoFrame);
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Cannot render frame on unknown target type: ");
        android.util.Log.e("Hera.VideoRenderProxy", AnonymousClass001.A0a(7zL.A18(obj.getClass()), A0k));
    }
}

package X;

import com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener;

/* loaded from: Ika.class */
public final class Ika implements IHeraCallEngineStateListener.IPeerVideoStreamListener {
    public final /* synthetic */ HeraMessengerPluginImplementation A00;

    public Ika(HeraMessengerPluginImplementation heraMessengerPluginImplementation) {
        this.A00 = heraMessengerPluginImplementation;
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener.IPeerVideoStreamListener
    public void onPeerVideoStarted(String str) {
        11T.A0F(str, 0);
        0fH.A0j("Hera.MsgrPluginImpl", 0Pz.A0W("Peer video started: ", str));
        H42 h42 = this.A00.A01.A00;
        11T.A0I(h42, "null cannot be cast to non-null type com.facebook.messaging.wearable.plugins.hera.video.HeraMessengerVideoRenderProxy");
        java.util.Map map = ((Gyi) h42).A01;
        Object obj = map.get(str);
        if (obj == null) {
            obj = new RHT(h42);
            map.put(str, obj);
        }
        if (h42.A01) {
            VideoRenderApi videoRenderApi = ((GyZ) h42).A00;
            02W.A03("VideoRenderProxy setApi must be called", videoRenderApi);
            if (videoRenderApi != null) {
                videoRenderApi.setRenderTarget(str, obj, new StreamInfo(1, null));
                return;
            }
        }
        0fH.A0n("Hera.MsgrPluginImpl", "Not setting renderTarget: Missing videoRenderApi.");
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener.IPeerVideoStreamListener
    public void onPeerVideoStopped(String str) {
        11T.A0F(str, 0);
        0fH.A0j("Hera.MsgrPluginImpl", 0Pz.A0W("Peer video stopped: ", str));
        H42 h42 = this.A00.A01.A00;
        11T.A0I(h42, "null cannot be cast to non-null type com.facebook.messaging.wearable.plugins.hera.video.HeraMessengerVideoRenderProxy");
        Object obj = ((Gyi) h42).A01.get(str);
        if (obj != null) {
            if (h42.A01) {
                VideoRenderApi videoRenderApi = ((GyZ) h42).A00;
                02W.A03("VideoRenderProxy setApi must be called", videoRenderApi);
                if (videoRenderApi != null) {
                    videoRenderApi.removeRenderTarget(str, obj, new StreamInfo(1, null));
                    return;
                }
            }
            0fH.A0n("Hera.MsgrPluginImpl", "Not removing renderTarget: Missing videoRenderApi.");
        }
    }
}

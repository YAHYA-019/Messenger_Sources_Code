package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioDeviceModule;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import java.util.ArrayList;

/* loaded from: Gvx.class */
public final class Gvx extends Gw1 {
    public AudioApi A00;

    public Gvx() {
        if (this.A00 != null) {
            throw 1BK.A0g();
        }
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public ArrayList createAvailableAudioInputRoutes() {
        return 1BK.A17(11T.A03(AudioInputRoute.DEFAULT));
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public ArrayList createAvailableAudioOutputRoutes() {
        return 1BK.A17(C0s8.A14(AudioOutputRoute.UNKNOWN, AudioOutputRoute.EARPIECE, AudioOutputRoute.SPEAKER, AudioOutputRoute.HEADSET, AudioOutputRoute.BLUETOOTH));
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setApi(AudioApi audioApi) {
        11T.A0F(audioApi, 0);
        this.A00 = audioApi;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioInputRoute(AudioInputRoute audioInputRoute) {
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioOn(boolean z, boolean z2) {
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2) {
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setIsCallActive(boolean z) {
    }
}

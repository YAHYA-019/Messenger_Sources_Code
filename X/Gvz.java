package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioDeviceModule;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import com.facebook.rsys.audio.gen.AudioProxy;
import java.util.ArrayList;

/* loaded from: Gvz.class */
public final class Gvz extends Gw1 {
    public AudioApi A00;
    public final AudioProxy A01;

    public Gvz(AudioProxy audioProxy) {
        this.A01 = audioProxy;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public ArrayList createAvailableAudioInputRoutes() {
        ArrayList createAvailableAudioInputRoutes = this.A01.createAvailableAudioInputRoutes();
        11T.A0A(createAvailableAudioInputRoutes);
        return createAvailableAudioInputRoutes;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public ArrayList createAvailableAudioOutputRoutes() {
        ArrayList createAvailableAudioOutputRoutes = this.A01.createAvailableAudioOutputRoutes();
        11T.A0A(createAvailableAudioOutputRoutes);
        return createAvailableAudioOutputRoutes;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setApi(AudioApi audioApi) {
        11T.A0F(audioApi, 0);
        this.A00 = audioApi;
        this.A01.setApi(audioApi);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        11T.A0F(audioDeviceModule, 0);
        this.A01.setAudioDeviceModule(audioDeviceModule);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioInputRoute(AudioInputRoute audioInputRoute) {
        11T.A0F(audioInputRoute, 0);
        this.A01.setAudioInputRoute(audioInputRoute);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioOn(boolean z, boolean z2) {
        this.A01.setAudioOn(z, z2);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2) {
        11T.A0F(audioOutputRoute, 0);
        this.A01.setAudioOutputRoute(audioOutputRoute, z, z2);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setIsCallActive(boolean z) {
        this.A01.setIsCallActive(z);
    }
}

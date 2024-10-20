package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioDeviceModule;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import com.facebook.rsys.audio.gen.AudioProxy;
import java.util.ArrayList;

/* loaded from: Gvy.class */
public final class Gvy extends Gw1 {
    public final AudioProxy A00;

    public Gvy(AudioProxy audioProxy) {
        this.A00 = audioProxy;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public ArrayList createAvailableAudioInputRoutes() {
        ArrayList createAvailableAudioInputRoutes = this.A00.createAvailableAudioInputRoutes();
        11T.A0A(createAvailableAudioInputRoutes);
        return createAvailableAudioInputRoutes;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public ArrayList createAvailableAudioOutputRoutes() {
        ArrayList createAvailableAudioOutputRoutes = this.A00.createAvailableAudioOutputRoutes();
        11T.A0A(createAvailableAudioOutputRoutes);
        return createAvailableAudioOutputRoutes;
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setApi(AudioApi audioApi) {
        11T.A0F(audioApi, 0);
        this.A00.setApi(audioApi);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        11T.A0F(audioDeviceModule, 0);
        this.A00.setAudioDeviceModule(audioDeviceModule);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioInputRoute(AudioInputRoute audioInputRoute) {
        11T.A0F(audioInputRoute, 0);
        this.A00.setAudioInputRoute(audioInputRoute);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioOn(boolean z, boolean z2) {
        this.A00.setAudioOn(z, z2);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setAudioOutputRoute(AudioOutputRoute audioOutputRoute, boolean z, boolean z2) {
        11T.A0F(audioOutputRoute, 0);
        this.A00.setAudioOutputRoute(audioOutputRoute, z, z2);
    }

    @Override // com.facebook.rsys.audio.gen.AudioProxy
    public void setIsCallActive(boolean z) {
        this.A00.setIsCallActive(z);
    }
}

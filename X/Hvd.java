package X;

import com.facebook.rsys.audio.gen.AudioPipelineContext;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;

/* loaded from: Hvd.class */
public final class Hvd {
    public static final AudioModule A00(EnvironmentVariablesProxy environmentVariablesProxy, OverlayConfigManagerHolder overlayConfigManagerHolder) {
        11T.A0F(overlayConfigManagerHolder, 1);
        AudioModule createImp = AudioModule.CProxy.createImp(new AudioPipelineContext(null, null, null, null, null, environmentVariablesProxy.copyValue(16), environmentVariablesProxy.copyValue(12)), overlayConfigManagerHolder);
        11T.A0A(createImp);
        return createImp;
    }
}

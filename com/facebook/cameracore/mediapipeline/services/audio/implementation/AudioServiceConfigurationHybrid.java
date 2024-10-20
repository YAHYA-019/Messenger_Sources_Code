package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import X.7zL;
import X.Hh4;
import X.IPK;
import X.IPO;
import X.JEU;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;

/* loaded from: AudioServiceConfigurationHybrid.class */
public class AudioServiceConfigurationHybrid extends ServiceConfiguration {
    public final Hh4 mConfiguration;
    public final JEU mPlatformReleaser = new IPO(this);

    public AudioServiceConfigurationHybrid(Hh4 hh4) {
        this.mHybridData = initHybrid(hh4.A04);
        this.mConfiguration = hh4;
    }

    private native HybridData initHybrid(boolean z);

    public Reference createAudioPlatform() {
        AudioPlatformComponentHostImpl audioPlatformComponentHostImpl = new AudioPlatformComponentHostImpl(this.mConfiguration.A03, null);
        Hh4 hh4 = this.mConfiguration;
        audioPlatformComponentHostImpl.setMuted(false);
        audioPlatformComponentHostImpl.mAudioLogger = hh4.A01;
        hh4.A02 = 7zL.A14(audioPlatformComponentHostImpl);
        return new IPK(this.mPlatformReleaser, audioPlatformComponentHostImpl);
    }

    public AudioGraphClientProvider getAudioGraphClientProvider() {
        return this.mConfiguration.A00;
    }

    public AudioServiceConfigurationAnnouncer getAudioServiceConfigurationAnnouncer() {
        return null;
    }
}

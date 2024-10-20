package com.facebook.spectrum.plugins;

import X.Hwb;
import com.facebook.jni.HybridData;

/* loaded from: SpectrumPluginWebp.class */
public class SpectrumPluginWebp extends SpectrumPlugin {
    public static SpectrumPluginWebp sInstance;
    public HybridData mHybridData;

    private native HybridData initHybrid();

    private native long nativeCreatePlugin();

    @Override // com.facebook.spectrum.plugins.SpectrumPlugin
    public long createPlugin() {
        return nativeCreatePlugin();
    }

    @Override // com.facebook.spectrum.plugins.SpectrumPlugin
    public void ensureLoadedAndInitialized() {
        synchronized (this) {
            HybridData hybridData = this.mHybridData;
            if (hybridData == null || !hybridData.isValid()) {
                Hwb.A00("spectrumpluginwebp");
                this.mHybridData = initHybrid();
            }
        }
    }
}

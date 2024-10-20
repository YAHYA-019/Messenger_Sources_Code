package com.facebook.spectrum.plugins;

import X.Hwb;
import com.facebook.jni.HybridData;

/* loaded from: SpectrumPluginPng.class */
public class SpectrumPluginPng extends SpectrumPlugin {
    public static SpectrumPluginPng sInstance;
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
                Hwb.A00("spectrumpluginpng");
                this.mHybridData = initHybrid();
            }
        }
    }
}

package com.facebook.spectrum.plugins;

import X.Hwb;
import com.facebook.jni.HybridData;

/* loaded from: SpectrumPluginJpeg.class */
public class SpectrumPluginJpeg extends SpectrumPlugin {
    public static SpectrumPluginJpeg sInstance;
    public HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v8, types: [com.facebook.spectrum.plugins.SpectrumPluginJpeg, java.lang.Object] */
    public static SpectrumPluginJpeg get() {
        SpectrumPluginJpeg spectrumPluginJpeg;
        synchronized (SpectrumPluginJpeg.class) {
            spectrumPluginJpeg = sInstance;
            if (spectrumPluginJpeg == null) {
                ?? obj = new Object();
                sInstance = obj;
                obj.ensureLoadedAndInitialized();
                spectrumPluginJpeg = sInstance;
            }
        }
        return spectrumPluginJpeg;
    }

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
                Hwb.A00("spectrumpluginjpeg");
                this.mHybridData = initHybrid();
            }
        }
    }
}

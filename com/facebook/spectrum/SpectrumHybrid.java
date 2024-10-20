package com.facebook.spectrum;

import X.Hwb;
import android.graphics.Bitmap;
import com.facebook.jni.HybridData;
import com.facebook.spectrum.options.DecodeOptions;
import com.facebook.spectrum.options.EncodeOptions;
import com.facebook.spectrum.options.TranscodeOptions;
import com.facebook.spectrum.options.TransformOptions;
import com.facebook.spectrum.plugins.SpectrumPlugin;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: SpectrumHybrid.class */
public class SpectrumHybrid {
    public final Configuration mConfiguration;
    public HybridData mHybridData;
    public final SpectrumPlugin[] mPlugins;

    public SpectrumHybrid(Configuration configuration, SpectrumPlugin[] spectrumPluginArr) {
        configuration.getClass();
        this.mConfiguration = configuration;
        spectrumPluginArr.getClass();
        this.mPlugins = spectrumPluginArr;
    }

    private native HybridData initHybrid(Configuration configuration, SpectrumPlugin[] spectrumPluginArr);

    private native SpectrumResult nativeDecode(InputStream inputStream, BitmapTarget bitmapTarget, DecodeOptions decodeOptions);

    private native SpectrumResult nativeEncode(Bitmap bitmap, OutputStream outputStream, EncodeOptions encodeOptions);

    private native SpectrumResult nativeTranscode(InputStream inputStream, OutputStream outputStream, TranscodeOptions transcodeOptions);

    private native SpectrumResult nativeTransform(Bitmap bitmap, BitmapTarget bitmapTarget, TransformOptions transformOptions);

    public SpectrumResult decode(InputStream inputStream, BitmapTarget bitmapTarget, DecodeOptions decodeOptions) {
        ensureNativeLibraryInitialized();
        return nativeDecode(inputStream, bitmapTarget, decodeOptions);
    }

    public SpectrumResult encode(Bitmap bitmap, OutputStream outputStream, EncodeOptions encodeOptions) {
        ensureNativeLibraryInitialized();
        return nativeEncode(bitmap, outputStream, encodeOptions);
    }

    public void ensureNativeLibraryInitialized() {
        synchronized (this) {
            HybridData hybridData = this.mHybridData;
            if (hybridData == null || !hybridData.isValid()) {
                Hwb.A00("spectrum");
                this.mHybridData = initHybrid(this.mConfiguration, this.mPlugins);
            }
        }
    }

    public SpectrumResult transcode(InputStream inputStream, OutputStream outputStream, TranscodeOptions transcodeOptions) {
        ensureNativeLibraryInitialized();
        return nativeTranscode(inputStream, outputStream, transcodeOptions);
    }
}

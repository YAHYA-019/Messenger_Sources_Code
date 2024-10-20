package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.1BK;
import X.AnonymousClass001;
import X.H96;
import X.HGi;
import X.Hh4;
import X.HpG;
import X.I2f;
import X.Lu0;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: EffectServiceHost.class */
public abstract class EffectServiceHost {
    public final HpG mArExperimentUtil;
    public EffectAttribution mAttribution;
    public final Context mContext;
    public final EffectServiceHostConfig mEffectServiceHostConfig;
    public HybridData mHybridData;
    public String mProductSessionId;
    public final HGi mServiceConfigurationHybridBuilder;
    public final List mServiceModules;
    public I2f mServicesHostConfiguration;
    public List mServiceConfigurations = AnonymousClass001.A0s();
    public EffectManifest mEffectManifest = new EffectManifest();
    public boolean mDestroyed = false;

    public EffectServiceHost(Context context, EffectServiceHostConfig effectServiceHostConfig, HGi hGi, Collection collection, String str, HpG hpG) {
        this.mContext = context;
        this.mEffectServiceHostConfig = effectServiceHostConfig;
        this.mServiceConfigurationHybridBuilder = hGi;
        this.mServiceModules = 1BK.A17(collection);
        this.mProductSessionId = str;
        this.mArExperimentUtil = hpG;
    }

    private native void nativeSetCameraSensorRotation(int i);

    private native void nativeSetCurrentOptimizationMode(int i);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, byte[] bArr, long j, boolean z2, float[] fArr, float[] fArr2, float f, double d, double d2, Reference reference);

    public static ScheduledExecutorService newSingleBackgroundThreadScheduledExecutor(String str) {
        return Executors.newSingleThreadScheduledExecutor(new Lu0(str, 1));
    }

    public native void cleanupServices();

    public void destroy() {
        synchronized (this) {
            if (!this.mDestroyed) {
                this.mHybridData.resetNative();
                Iterator it = this.mServiceConfigurations.iterator();
                while (it.hasNext()) {
                    ((ServiceConfiguration) it.next()).destroy();
                }
                this.mServiceConfigurations.clear();
                Iterator it2 = this.mServiceModules.iterator();
                while (it2.hasNext()) {
                    ((ServiceModule) it2.next()).mHybridData.resetNative();
                }
                this.mServiceModules.clear();
                this.mDestroyed = true;
            }
        }
    }

    public AudioPlatformComponentHost getAudioPlatformComponentHost() {
        Hh4 hh4;
        WeakReference weakReference;
        I2f i2f = this.mServicesHostConfiguration;
        if (i2f == null || (hh4 = i2f.A06) == null || (weakReference = hh4.A02) == null) {
            return null;
        }
        return (AudioPlatformComponentHost) weakReference.get();
    }

    public native void resetServices();

    public void setAttribution(EffectAttribution effectAttribution) {
        this.mAttribution = effectAttribution;
    }

    public void setCameraSensorRotation(int i) {
        nativeSetCameraSensorRotation(i);
    }

    public void setCurrentOptimizationMode(H96 h96) {
        nativeSetCurrentOptimizationMode(h96.mCppValue);
    }

    public void setManifest(EffectManifest effectManifest) {
        this.mEffectManifest = effectManifest;
    }

    public native void stopEffect();

    /* JADX WARN: Removed duplicated region for block: B:29:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateFrame(X.IPK r302, int r303, boolean r304) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost.updateFrame(X.IPK, int, boolean):void");
    }
}

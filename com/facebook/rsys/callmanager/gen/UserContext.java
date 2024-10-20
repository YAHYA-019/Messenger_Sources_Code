package com.facebook.rsys.callmanager.gen;

import X.2JQ;
import X.7zP;
import X.HMo;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.RedactedString;
import com.facebook.rsys.audio.gen.AudioPipelineContext;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;
import com.facebook.simplejni.NativeHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.ArrayList;

/* loaded from: UserContext.class */
public class UserContext {
    public static 2JQ CONVERTER = IR0.A00(44);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMo.A00();
    }

    public UserContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public UserContext(String str, RedactedString redactedString, AppInfo appInfo, CryptoContextHolder cryptoContextHolder, SignalingTransportProxy signalingTransportProxy, AudioPipelineContext audioPipelineContext, LogPersistenceProxy logPersistenceProxy, LargeLogUploadProxy largeLogUploadProxy, byte[] bArr, OverlayConfigManagerHolder overlayConfigManagerHolder, TurnAllocationProxy turnAllocationProxy, String str2, ArrayList arrayList, XAnalyticsHolder xAnalyticsHolder, PerfLoggerHolder perfLoggerHolder) {
        7zP.A1S(str, appInfo, logPersistenceProxy);
        7zP.A1S(overlayConfigManagerHolder, turnAllocationProxy, xAnalyticsHolder);
        this.mNativeHolder = initNativeHolder(str, redactedString, appInfo, cryptoContextHolder, signalingTransportProxy, audioPipelineContext, logPersistenceProxy, largeLogUploadProxy, bArr, overlayConfigManagerHolder, turnAllocationProxy, str2, arrayList, xAnalyticsHolder, perfLoggerHolder);
    }

    public static native UserContext createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, RedactedString redactedString, AppInfo appInfo, CryptoContextHolder cryptoContextHolder, SignalingTransportProxy signalingTransportProxy, AudioPipelineContext audioPipelineContext, LogPersistenceProxy logPersistenceProxy, LargeLogUploadProxy largeLogUploadProxy, byte[] bArr, OverlayConfigManagerHolder overlayConfigManagerHolder, TurnAllocationProxy turnAllocationProxy, String str2, ArrayList arrayList, XAnalyticsHolder xAnalyticsHolder, PerfLoggerHolder perfLoggerHolder);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UserContext)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native AppInfo getAppInfo();

    public native AudioPipelineContext getAudioPipelineContext();

    public native RedactedString getAuthDataAccessToken();

    public native byte[] getCapabilities();

    public native CryptoContextHolder getCryptoContext();

    public native LargeLogUploadProxy getLargeLogUploader();

    public native String getLogDirectory();

    public native LogPersistenceProxy getLogPersister();

    public native OverlayConfigManagerHolder getOverlayConfigManager();

    public native PerfLoggerHolder getPerfLogger();

    public native SignalingTransportProxy getSignalingTransport();

    public native XAnalyticsHolder getStructuredlogger();

    public native ArrayList getSupportedCodecs();

    public native TurnAllocationProxy getTurnAllocationProxy();

    public native String getUserId();

    public native int hashCode();

    public native String toString();
}

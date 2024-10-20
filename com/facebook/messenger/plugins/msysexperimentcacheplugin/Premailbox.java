package com.facebook.messenger.plugins.msysexperimentcacheplugin;

import X.0Q8;
import X.C14m;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mci.PrivacyContext;
import java.util.Map;

/* loaded from: Premailbox.class */
public abstract class Premailbox {
    public MessengerSessionedMCPContext mAppContext;

    public Premailbox(MessengerSessionedMCPContext messengerSessionedMCPContext) {
        this.mAppContext = messengerSessionedMCPContext;
    }

    private byte[] MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheCopyGKCacheJNI() {
        MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheCopyGKCache();
        throw 0Q8.createAndThrow();
    }

    private void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheCreateJNI(byte[] bArr, Map map, Map map2) {
    }

    private void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheCreateWithExistingCacheJNI(Object obj) {
    }

    private int MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetGKValueJNI(int i, PrivacyContext privacyContext) {
        if (privacyContext == null) {
            privacyContext = null;
        }
        MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetGKValue(i, privacyContext);
        throw 0Q8.createAndThrow();
    }

    private Object MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetInternalObject_DO_NOT_USEJNI() {
        MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetInternalObject_DO_NOT_USE();
        throw 0Q8.createAndThrow();
    }

    private boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigBooleanJNI(long j, boolean z, boolean z2) {
        return MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigBoolean(j, z, z2);
    }

    private boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigBoolean__DEPRECATEDJNI(String str, String str2, boolean z, boolean z2) {
        throw new IllegalAccessError("Deprecated method should not be used.");
    }

    private boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigCacheIsSetJNI() {
        MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigCacheIsSet();
        throw 0Q8.createAndThrow();
    }

    private double MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigDoubleJNI(long j, double d, boolean z) {
        return MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigDouble(j, d, z);
    }

    private double MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigDouble__DEPRECATEDJNI(String str, String str2, double d, boolean z) {
        throw new IllegalAccessError("Deprecated method should not be used.");
    }

    private int MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt32JNI(long j, int i, boolean z) {
        return MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt32(j, i, z);
    }

    private int MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt32__DEPRECATEDJNI(String str, String str2, int i, boolean z) {
        throw new IllegalAccessError("Deprecated method should not be used.");
    }

    private long MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt64JNI(long j, long j2, boolean z) {
        return MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt64(j, j2, z);
    }

    private long MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt64__DEPRECATEDJNI(String str, String str2, long j, boolean z) {
        throw new IllegalAccessError("Deprecated method should not be used.");
    }

    private String MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigStringJNI(long j, String str, boolean z) {
        if (str == null) {
            str = null;
        }
        String MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigString = MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigString(j, str, z);
        if (MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigString != null) {
            return MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigString;
        }
        return null;
    }

    private String MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigString__DEPRECATEDJNI(String str, String str2, String str3, boolean z) {
        throw new IllegalAccessError("Deprecated method should not be used.");
    }

    private void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogExperimentExposureJNI(String str) {
        MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogExperimentExposure(str);
        throw 0Q8.createAndThrow();
    }

    private void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogMobileConfigExposureJNI(long j) {
        MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogMobileConfigExposure(j);
        throw 0Q8.createAndThrow();
    }

    private void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogMobileConfigExposure__DEPRECATEDJNI(String str, String str2) {
        MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogMobileConfigExposure__DEPRECATED(str, str2);
        throw 0Q8.createAndThrow();
    }

    private void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheSetGKCacheJNI(byte[] bArr, PrivacyContext privacyContext) {
        if (bArr == null) {
            bArr = null;
        }
        if (privacyContext == null) {
            privacyContext = null;
        }
        MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheSetGKCache(bArr, privacyContext);
        throw 0Q8.createAndThrow();
    }

    private boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheSetMobileConfigCacheJNI(Map map, Map map2, PrivacyContext privacyContext) {
        throw new C14m("This is not supposed to be used on Android.");
    }

    public abstract byte[] MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheCopyGKCache();

    public abstract void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheCreate(byte[] bArr, Map map, Map map2);

    public abstract void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheCreateWithExistingCache(Object obj);

    public abstract int MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetGKValue(int i, PrivacyContext privacyContext);

    public abstract Object MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetInternalObject_DO_NOT_USE();

    public abstract boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigBoolean(long j, boolean z, boolean z2);

    public abstract boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigBoolean__DEPRECATED(String str, String str2, boolean z, boolean z2);

    public abstract boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigCacheIsSet();

    public abstract double MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigDouble(long j, double d, boolean z);

    public abstract double MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigDouble__DEPRECATED(String str, String str2, double d, boolean z);

    public abstract int MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt32(long j, int i, boolean z);

    public abstract int MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt32__DEPRECATED(String str, String str2, int i, boolean z);

    public abstract long MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt64(long j, long j2, boolean z);

    public abstract long MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt64__DEPRECATED(String str, String str2, long j, boolean z);

    public abstract String MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigString(long j, String str, boolean z);

    public abstract String MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigString__DEPRECATED(String str, String str2, String str3, boolean z);

    public abstract void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogExperimentExposure(String str);

    public abstract void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogMobileConfigExposure(long j);

    public abstract void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogMobileConfigExposure__DEPRECATED(String str, String str2);

    public abstract void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheSetGKCache(byte[] bArr, PrivacyContext privacyContext);

    public abstract boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheSetMobileConfigCache(Map map, Map map2, PrivacyContext privacyContext);

    public abstract void MsysExperimentCachePluginPremailboxExtensionsDestroy();
}

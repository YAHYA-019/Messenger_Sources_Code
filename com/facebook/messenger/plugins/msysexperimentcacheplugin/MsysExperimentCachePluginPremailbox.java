package com.facebook.messenger.plugins.msysexperimentcacheplugin;

import X.11T;
import X.1GD;
import X.C14m;
import X.JQw;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.msys.mci.PrivacyContext;
import java.util.Map;

/* loaded from: MsysExperimentCachePluginPremailbox.class */
public final class MsysExperimentCachePluginPremailbox extends Premailbox {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysExperimentCachePluginPremailbox(MessengerSessionedMCPContext messengerSessionedMCPContext) {
        super(messengerSessionedMCPContext);
        11T.A0F(messengerSessionedMCPContext, 1);
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public byte[] MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheCopyGKCache() {
        throw new C14m("This is not supposed to be used on Android.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheCreate(byte[] bArr, Map map, Map map2) {
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheCreateWithExistingCache(Object obj) {
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public int MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetGKValue(int i, PrivacyContext privacyContext) {
        throw new C14m("This is not supposed to be used on Android.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public Object MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetInternalObject_DO_NOT_USE() {
        throw new C14m(JQw.A00(91));
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigBoolean(long j, boolean z, boolean z2) {
        return this.mAppContext.getMobileConfig().AZs(z2 ? 1GD.A06 : 1GD.A07, j, z);
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigBoolean__DEPRECATED(String str, String str2, boolean z, boolean z2) {
        throw new IllegalAccessError("Deprecated method should not be used.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigCacheIsSet() {
        throw new C14m("This is not supposed to be used on Android.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public double MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigDouble(long j, double d, boolean z) {
        return this.mAppContext.getMobileConfig().AiG(z ? 1GD.A06 : 1GD.A07, d, j);
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public double MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigDouble__DEPRECATED(String str, String str2, double d, boolean z) {
        throw new IllegalAccessError("Deprecated method should not be used.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public int MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt32(long j, int i, boolean z) {
        return (int) this.mAppContext.getMobileConfig().Av8(z ? 1GD.A06 : 1GD.A07, j, i);
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public int MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt32__DEPRECATED(String str, String str2, int i, boolean z) {
        throw new IllegalAccessError("Deprecated method should not be used.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public long MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt64(long j, long j2, boolean z) {
        return this.mAppContext.getMobileConfig().Av8(z ? 1GD.A06 : 1GD.A07, j, j2);
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public long MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigInt64__DEPRECATED(String str, String str2, long j, boolean z) {
        throw new IllegalAccessError("Deprecated method should not be used.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public String MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigString(long j, String str, boolean z) {
        String BDC = this.mAppContext.getMobileConfig().BDC(z ? 1GD.A06 : 1GD.A07, "9&ITur@o#MI3uv38", j);
        11T.A0D(BDC);
        return !11T.A0O(BDC, "9&ITur@o#MI3uv38") ? BDC : str;
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public String MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheGetMobileConfigString__DEPRECATED(String str, String str2, String str3, boolean z) {
        throw new IllegalAccessError("Deprecated method should not be used.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogExperimentExposure(String str) {
        throw new C14m("This is not supposed to be used on Android.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogMobileConfigExposure(long j) {
        throw new C14m("This is not supposed to be used on Android.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheLogMobileConfigExposure__DEPRECATED(String str, String str2) {
        throw new C14m("This is not supposed to be used on Android.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public void MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheSetGKCache(byte[] bArr, PrivacyContext privacyContext) {
        throw new C14m("This is not supposed to be used on Android.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public boolean MCIExtensionExperimentCacheImpl_MCIExtensionExperimentCacheSetMobileConfigCache(Map map, Map map2, PrivacyContext privacyContext) {
        throw new C14m("This is not supposed to be used on Android.");
    }

    @Override // com.facebook.messenger.plugins.msysexperimentcacheplugin.Premailbox
    public void MsysExperimentCachePluginPremailboxExtensionsDestroy() {
    }
}

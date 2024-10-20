package com.facebook.msys.mci;

import X.3PV;
import X.AnonymousClass001;
import com.facebook.msys.util.Provider;

/* loaded from: ProxyProvider.class */
public final class ProxyProvider {
    public final Provider mAnalyticsProvider;
    public final Provider mCryptoProvider;
    public final Provider mDeviceBackupProvider;
    public final Provider mExecutionIdleProvider;
    public final Provider mMediaTranscoderProvider;

    public ProxyProvider(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.mAnalyticsProvider = provider;
        this.mCryptoProvider = provider2;
        this.mMediaTranscoderProvider = provider5;
        this.mDeviceBackupProvider = provider3;
        this.mExecutionIdleProvider = provider4;
    }

    private Analytics getAnalytics() {
        Provider provider = this.mAnalyticsProvider;
        if (provider == null) {
            return null;
        }
        Object obj = provider.get();
        if (obj != null) {
            return (Analytics) obj;
        }
        throw AnonymousClass001.A0L("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }

    private Crypto getCrypto() {
        Object obj = this.mCryptoProvider.get();
        if (obj != null) {
            return (Crypto) obj;
        }
        throw AnonymousClass001.A0L("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }

    private DeviceBackup getDeviceBackup() {
        Provider provider = this.mDeviceBackupProvider;
        if (provider == null) {
            return null;
        }
        Object obj = provider.get();
        if (obj != null) {
            return (DeviceBackup) obj;
        }
        throw AnonymousClass001.A0L("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }

    private 3PV getExecutionIdle() {
        Object obj = this.mExecutionIdleProvider.get();
        if (obj != null) {
            return (3PV) obj;
        }
        throw AnonymousClass001.A0L("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }

    public MediaTranscoder getMediaTranscoder() {
        Object obj = this.mMediaTranscoderProvider.get();
        if (obj != null) {
            return (MediaTranscoder) obj;
        }
        throw AnonymousClass001.A0L("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }
}

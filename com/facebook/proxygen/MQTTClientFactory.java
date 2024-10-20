package com.facebook.proxygen;

import X.0FI;
import java.util.concurrent.Executor;

/* loaded from: MQTTClientFactory.class */
public class MQTTClientFactory extends NativeHandleImpl {
    public final Executor mAppExecutor;
    public Executor mDnsResolverExecutor;
    public boolean mEnableLargePayload;
    public final EventBase mEventbase;
    public FizzSettings mFizzSettings;
    public HTTPClient mHttpClient;
    public Executor mPersistentCachesExecutor;
    public PersistentSSLCacheSettings mPersistentDNSCacheSettings;
    public PersistentSSLCacheSettings mPersistentSSLCacheSettings;
    public RootCACallbacks mRootCACallbacks;
    public SPDYTransportSettings mSPDYTransportSettings;
    public final MQTTClientSettings mSettings;
    public boolean mTopicExtensionSupported;

    public MQTTClientFactory(EventBase eventBase, Executor executor, MQTTClientSettings mQTTClientSettings, RootCACallbacks rootCACallbacks) {
        this.mSettings = mQTTClientSettings;
        this.mEventbase = eventBase;
        this.mAppExecutor = executor;
        this.mRootCACallbacks = rootCACallbacks;
    }

    private native void init(EventBase eventBase, Executor executor, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, PersistentSSLCacheSettings persistentSSLCacheSettings, PersistentSSLCacheSettings persistentSSLCacheSettings2, FizzSettings fizzSettings, SPDYTransportSettings sPDYTransportSettings, HTTPClient hTTPClient, String str, int i3, String str2, int i4, String str3, String str4, boolean z5, boolean z6, RootCACallbacks rootCACallbacks, Executor executor2, Executor executor3);

    public native void close();

    public MQTTClientFactory enableLargePayload(boolean z) {
        this.mEnableLargePayload = z;
        return this;
    }

    public void finalize() {
        int A03 = 0FI.A03(1430334678);
        try {
            close();
            0FI.A09(-159180373, A03);
        } catch (Throwable th) {
            0FI.A09(-924334434, A03);
            throw th;
        }
    }

    public void init() {
        EventBase eventBase = this.mEventbase;
        Executor executor = this.mAppExecutor;
        MQTTClientSettings mQTTClientSettings = this.mSettings;
        init(eventBase, executor, mQTTClientSettings.connectTimeout, mQTTClientSettings.pingRespTimeout, mQTTClientSettings.verifyCertificates, mQTTClientSettings.zlibCompression, this.mEnableLargePayload, this.mTopicExtensionSupported, this.mPersistentSSLCacheSettings, this.mPersistentDNSCacheSettings, this.mFizzSettings, this.mSPDYTransportSettings, this.mHttpClient, mQTTClientSettings.proxyAddress, mQTTClientSettings.proxyPort, mQTTClientSettings.secureProxyAddress, mQTTClientSettings.secureProxyPort, mQTTClientSettings.bypassProxyDomains, mQTTClientSettings.proxyUserAgent, mQTTClientSettings.proxyFallbackEnabled, false, this.mRootCACallbacks, this.mPersistentCachesExecutor, this.mDnsResolverExecutor);
    }

    public native void networkReset();

    public MQTTClientFactory setDnsResolverExecutor(Executor executor) {
        this.mDnsResolverExecutor = executor;
        return this;
    }

    public MQTTClientFactory setFizzSettings(FizzSettings fizzSettings) {
        this.mFizzSettings = fizzSettings;
        return this;
    }

    public MQTTClientFactory setHTTPClient(HTTPClient hTTPClient) {
        this.mHttpClient = hTTPClient;
        return this;
    }

    public MQTTClientFactory setPersistentCachesExecutor(Executor executor) {
        this.mPersistentCachesExecutor = executor;
        return this;
    }

    public MQTTClientFactory setPersistentDNSCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
        this.mPersistentDNSCacheSettings = persistentSSLCacheSettings;
        return this;
    }

    public MQTTClientFactory setPersistentSSLCacheSettings(PersistentSSLCacheSettings persistentSSLCacheSettings) {
        this.mPersistentSSLCacheSettings = persistentSSLCacheSettings;
        return this;
    }

    public MQTTClientFactory setSPDYTransportSettings(SPDYTransportSettings sPDYTransportSettings) {
        this.mSPDYTransportSettings = sPDYTransportSettings;
        return this;
    }

    public MQTTClientFactory setTopicExtensionSupported(boolean z) {
        this.mTopicExtensionSupported = z;
        return this;
    }
}

package com.facebook.omnistore.mqtt;

import X.0fH;
import X.1BK;
import X.1BO;
import X.1BQ;
import X.1Bi;
import X.1Bn;
import X.1KE;
import X.1Kd;
import X.4WZ;
import X.C00i;
import X.C15h;
import X.InterfaceC01363qv;
import com.facebook.omnistore.MqttProtocolProvider;
import com.facebook.omnistore.OmnistoreMqtt;
import com.facebook.omnistore.mqtt.FacebookOmnistoreMqtt;

/* loaded from: FacebookOmnistoreMqtt.class */
public class FacebookOmnistoreMqtt implements InterfaceC01363qv, OmnistoreMqtt.Publisher {
    public static final String TAG = "OmnistoreMqttJniHandler";
    public MqttProtocolProvider mMqttProtocolProviderInstance;
    public final OmnistoreMqtt mOmnistoreMqtt;
    public final 1KE mExecutorService = (1KE) 1Bn.A0A(16480);
    public final ConnectionStarter mConnectionStarter = (ConnectionStarter) 1Bi.A03(32792);
    public final MessagePublisher mMessagePublisher = (MessagePublisher) 1Bn.A0A(32793);
    public final C00i mFbErrorReporter = new 1BQ(16511);
    public final C00i mDefaultExecutor = new 1BQ(16449);
    public final C15h mViewerContextUserIdProvider = new C15h() { // from class: X.3qy
        @Override // X.C15h
        public /* bridge */ /* synthetic */ Object get() {
            return 1Bn.A0A(83433);
        }
    };
    public volatile boolean mIsOnConnectionEstablishedJobScheduled = false;
    public String mUserIdWhenOpened = null;

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, com.facebook.omnistore.OmnistoreCustomLogger] */
    public FacebookOmnistoreMqtt() {
        OmnistoreMqtt omnistoreMqtt = OmnistoreMqtt.$redex_init_class;
        this.mOmnistoreMqtt = new OmnistoreMqtt(this, new Object());
    }

    public static final FacebookOmnistoreMqtt _UL__ULSEP_com_facebook_omnistore_mqtt_FacebookOmnistoreMqtt_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new FacebookOmnistoreMqtt();
    }

    private void ensureInitialized() {
        synchronized (this) {
            if (this.mMqttProtocolProviderInstance == null) {
                this.mMqttProtocolProviderInstance = this.mOmnistoreMqtt.getProtocolProvider();
            }
        }
    }

    @Override // X.InterfaceC01363qv
    public void connectionEstablished() {
        if (this.mIsOnConnectionEstablishedJobScheduled) {
            return;
        }
        1BK.A1E(this.mDefaultExecutor).execute(new Runnable() { // from class: X.4Wu
            public static final String __redex_internal_original_name = "FacebookOmnistoreMqtt$2";

            @Override // java.lang.Runnable
            public void run() {
                try {
                    FacebookOmnistoreMqtt facebookOmnistoreMqtt = FacebookOmnistoreMqtt.this;
                    facebookOmnistoreMqtt.mOmnistoreMqtt.onConnectionEstablished();
                    facebookOmnistoreMqtt.mIsOnConnectionEstablishedJobScheduled = false;
                } catch (Throwable th) {
                    FacebookOmnistoreMqtt.this.mIsOnConnectionEstablishedJobScheduled = false;
                    throw th;
                }
            }
        });
        this.mIsOnConnectionEstablishedJobScheduled = true;
    }

    @Override // com.facebook.omnistore.OmnistoreMqtt.Publisher
    public void ensureConnection() {
        this.mConnectionStarter.startConnection(this);
    }

    public MqttProtocolProvider getProtocolProvider() {
        this.mUserIdWhenOpened = (String) this.mViewerContextUserIdProvider.get();
        ensureInitialized();
        return this.mMqttProtocolProviderInstance;
    }

    public void handleOmnistoreSyncMessage(byte[] bArr) {
        ensureInitialized();
        this.mOmnistoreMqtt.handleOmnistoreSyncMessage(bArr);
    }

    @Override // com.facebook.omnistore.OmnistoreMqtt.Publisher
    public void publishMessage(String str, byte[] bArr, OmnistoreMqtt.PublishCallback publishCallback) {
        String str2 = (String) this.mViewerContextUserIdProvider.get();
        if (str2 == null || !str2.equals(this.mUserIdWhenOpened)) {
            0fH.A18(TAG, "Omnistore expected user ID to still be %s, but it was %s", new Object[]{this.mUserIdWhenOpened, str2});
        }
        0fH.A0g(str, TAG, "Publishing to topic %s");
        1Kd.A0F(new 4WZ(publishCallback, this, str), this.mExecutorService.D3C(this.mMessagePublisher.makePublishMessageRunnable(str, bArr)), this.mExecutorService);
    }
}

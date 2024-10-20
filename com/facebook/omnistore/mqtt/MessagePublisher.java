package com.facebook.omnistore.mqtt;

import X.1BO;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Hv;
import X.C0dr;
import X.C1oE;
import X.C4Xd;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: MessagePublisher.class */
public class MessagePublisher {
    public static final long PUBLISH_TIMEOUT_MS = 60000;
    public final C1oE mMqttPushServiceClientManager = (C1oE) 1Hv.A02((Context) 1Bn.A0G((1BY) null, 83719), 66156);
    public final C0dr mMonotonicClock = (C0dr) 1Bi.A03(84489);

    public MessagePublisher(1BO r302) {
    }

    public static final MessagePublisher _UL__ULSEP_com_facebook_omnistore_mqtt_MessagePublisher_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new MessagePublisher(r302);
    }

    public Callable makePublishMessageRunnable(String str, byte[] bArr) {
        return new C4Xd(this, bArr, str, 1);
    }
}

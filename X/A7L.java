package X;

import com.facebook.messaging.aibot.handlers.initparams.OnWelcomeMessageReceivedSendMessageParamsMetadata;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.events.common.threadview.OnMessageListDataRendered;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: A7L.class */
public final class A7L implements 1Vf {
    public final ThreadKey A00;
    public final 2Of A01;
    public final HeterogeneousMap A02;

    public A7L(ThreadKey threadKey, 2Of r303, HeterogeneousMap heterogeneousMap) {
        this.A01 = r303;
        this.A00 = threadKey;
        this.A02 = heterogeneousMap;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.5fq, X.5qu] */
    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnMessageListDataRendered")) {
            throw 4YV.A0f(str);
        }
        OnMessageListDataRendered onMessageListDataRendered = (OnMessageListDataRendered) r302;
        11T.A0F(onMessageListDataRendered, 0);
        OnWelcomeMessageReceivedSendMessageParamsMetadata onWelcomeMessageReceivedSendMessageParamsMetadata = (OnWelcomeMessageReceivedSendMessageParamsMetadata) this.A02.A00(OnWelcomeMessageReceivedSendMessageParamsMetadata.A01);
        String str2 = onWelcomeMessageReceivedSendMessageParamsMetadata != null ? onWelcomeMessageReceivedSendMessageParamsMetadata.A00 : null;
        Integer num = onMessageListDataRendered.A00;
        if (num == null || num.intValue() != 2 || !this.A00.A0y() || str2 == null || str2.length() == 0) {
            return;
        }
        2Of r0 = this.A01;
        ?? c5fq = new C5fq();
        c5fq.A02 = str2;
        r0.AQN(new 7Ad((C5fq) c5fq, "unknown", (String) null));
    }
}

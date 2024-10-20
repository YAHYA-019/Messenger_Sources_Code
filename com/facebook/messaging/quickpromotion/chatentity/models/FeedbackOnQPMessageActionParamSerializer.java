package com.facebook.messaging.quickpromotion.chatentity.models;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: FeedbackOnQPMessageActionParamSerializer.class */
public class FeedbackOnQPMessageActionParamSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), FeedbackOnQPMessageActionParam.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        FeedbackOnQPMessageActionParam feedbackOnQPMessageActionParam = (FeedbackOnQPMessageActionParam) obj;
        if (feedbackOnQPMessageActionParam == null) {
            r302.A0Z();
        }
        r302.A0b();
        boolean z = feedbackOnQPMessageActionParam.positiveFeedback;
        r302.A0o("positive_feedback");
        r302.A0v(z);
        AbstractC11224vw.A0D(r302, "qp_id", feedbackOnQPMessageActionParam.qpId);
        r302.A0Y();
    }
}

package com.facebook.common.fury.reliability.sapienz;

import X.0eA;
import X.28Q;
import X.AnonymousClass001;
import X.C0jk;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fury.context.ReqContext;
import com.facebook.fury.props.Prop;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: CustomEventSerializer.class */
public class CustomEventSerializer extends StdSerializer {
    public CustomEventSerializer() {
        super(C0jk.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        C0jk c0jk = (C0jk) obj;
        r302.A0b();
        int i = c0jk.A00;
        r302.A0o("reason");
        r302.A0f(i);
        String str = c0jk.A05;
        if (str != null) {
            r302.A0o("threadName");
            r302.A0r(str);
        }
        long j = c0jk.A02;
        r302.A0o("threadId");
        r302.A0g(j);
        long j2 = c0jk.A03;
        r302.A0o("time");
        r302.A0g(j2);
        int i2 = c0jk.A01;
        r302.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        r302.A0f(i2);
        Throwable th = c0jk.A06;
        if (th != null) {
            r302.A0o("throwable");
            r302.A0P(th);
        }
        ReqContext reqContext = c0jk.A04;
        long currentTid = reqContext.getCurrentTid();
        int currentSeqId = reqContext.getCurrentSeqId();
        long parentTid = reqContext.getParentTid();
        int parentSeqId = reqContext.getParentSeqId();
        String tag = reqContext.getTag();
        int type = reqContext.getType();
        HashMap A0u = AnonymousClass001.A0u();
        Iterator globalProps = reqContext.globalProps();
        while (globalProps.hasNext()) {
            Prop prop = (Prop) globalProps.next();
            A0u.put(Integer.valueOf(prop.key()), prop.value());
        }
        HashMap A0u2 = AnonymousClass001.A0u();
        Iterator localProps = reqContext.localProps();
        while (localProps.hasNext()) {
            Prop prop2 = (Prop) localProps.next();
            A0u2.put(Integer.valueOf(prop2.key()), prop2.value());
        }
        0eA r0 = new 0eA(tag, A0u, A0u2, currentSeqId, parentSeqId, type, currentTid, parentTid);
        r302.A0o("reqContext");
        r302.A0P(r0);
        r302.A0Y();
    }
}

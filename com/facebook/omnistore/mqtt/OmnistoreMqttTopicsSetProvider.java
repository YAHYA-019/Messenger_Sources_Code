package com.facebook.omnistore.mqtt;

import X.1BO;
import X.1mY;
import X.C1md;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.google.common.collect.ImmutableMap;

/* loaded from: OmnistoreMqttTopicsSetProvider.class */
public class OmnistoreMqttTopicsSetProvider implements 1mY {
    public static final String OMNISTORE_SYNC_LOW_PRI_TOPIC = "/t_omnistore_sync_low_pri";
    public static final String OMNISTORE_SYNC_TOPIC = "/t_omnistore_sync";

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.omnistore.mqtt.OmnistoreMqttTopicsSetProvider, java.lang.Object] */
    public static final OmnistoreMqttTopicsSetProvider _UL__ULSEP_com_facebook_omnistore_mqtt_OmnistoreMqttTopicsSetProvider_ULSEP_FACTORY_METHOD(int i, 1BO r302, Object obj) {
        return new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (com.facebook.omnistore.mqtt.OmnistoreMqttTopicsSetProvider.OMNISTORE_SYNC_LOW_PRI_TOPIC.equals(r301) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isOmnistoreTopic(java.lang.String r301) {
        /*
            java.lang.String r0 = "/t_omnistore_sync"
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1c
            java.lang.String r0 = "/t_omnistore_sync_low_pri"
            r1 = r301
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            r303 = r0
        L1e:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.omnistore.mqtt.OmnistoreMqttTopicsSetProvider.isOmnistoreTopic(java.lang.String):boolean");
    }

    public ImmutableMap get() {
        SubscribeTopic subscribeTopic = new SubscribeTopic(OMNISTORE_SYNC_TOPIC, 1);
        C1md c1md = C1md.A02;
        return ImmutableMap.of((Object) subscribeTopic, (Object) c1md, (Object) new SubscribeTopic(OMNISTORE_SYNC_LOW_PRI_TOPIC, 1), (Object) c1md);
    }
}

package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.1mh, reason: invalid class name */
/* loaded from: 1mh.class */
public final class C1mh implements 1mY {
    public ImmutableMap get() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(new SubscribeTopic("/get_media_resp", 0), C1md.A02);
        return builder.build();
    }
}

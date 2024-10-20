package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.1mm, reason: invalid class name */
/* loaded from: 1mm.class */
public final class C1mm implements 1mY {
    public ImmutableMap get() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(new SubscribeTopic(09V.A00(179), 1), C1md.A02);
        ImmutableMap build = builder.build();
        11T.A0A(build);
        return build;
    }
}

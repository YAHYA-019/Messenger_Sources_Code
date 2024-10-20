package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.1mi, reason: invalid class name */
/* loaded from: 1mi.class */
public final class C1mi implements 1mY {
    public ImmutableMap get() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(new SubscribeTopic("/video_rt_pipe_res", 0), C1md.A02);
        ImmutableMap build = builder.build();
        11T.A0A(build);
        return build;
    }
}

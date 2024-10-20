package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* renamed from: X.1mk, reason: invalid class name */
/* loaded from: 1mk.class */
public final class C1mk implements 1mY {
    public ImmutableMap get() {
        HashMap hashMap = new HashMap();
        hashMap.put(new SubscribeTopic("/pp", 0), C1md.A02);
        return ImmutableMap.copyOf((java.util.Map) hashMap);
    }
}

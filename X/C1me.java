package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1me, reason: invalid class name */
/* loaded from: 1me.class */
public final class C1me implements 1mY {
    public static final HashSet A00 = new HashSet(Arrays.asList("/br_sr", "/rs_req"));
    public static final HashSet A01 = new HashSet(Arrays.asList("/sr_res", "/rs_resp"));

    public ImmutableMap get() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            builder.put(new SubscribeTopic((String) it.next(), 1), C1md.A02);
        }
        return builder.build();
    }
}

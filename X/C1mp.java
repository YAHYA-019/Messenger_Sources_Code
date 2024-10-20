package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* renamed from: X.1mp, reason: invalid class name */
/* loaded from: 1mp.class */
public final class C1mp implements 1mY {
    public final C15h A00;
    public final C15h A01;
    public final C15h A02;

    public C1mp() {
        3jD r0 = new 3jD(this, 16);
        3jD r02 = new 3jD(this, 17);
        3jD r03 = new 3jD(this, 18);
        this.A00 = r0;
        this.A01 = r02;
        this.A02 = r03;
    }

    public ImmutableMap get() {
        C1md c1md;
        HashMap hashMap = new HashMap();
        if (((Boolean) this.A00.get()).booleanValue()) {
            SubscribeTopic subscribeTopic = new SubscribeTopic("/t_ms", 0);
            c1md = C1md.A02;
            hashMap.put(subscribeTopic, c1md);
        } else {
            SubscribeTopic subscribeTopic2 = new SubscribeTopic("/mercury", 0);
            C1md c1md2 = C1md.A02;
            c1md = c1md2;
            hashMap.put(subscribeTopic2, c1md2);
            hashMap.put(new SubscribeTopic("/orca_message_notifications", 0), c1md2);
            hashMap.put(new SubscribeTopic("/delete_messages_notification", 0), c1md2);
        }
        if (((Boolean) this.A02.get()).booleanValue()) {
            hashMap.put(new SubscribeTopic("/t_ps", 0), c1md);
        }
        if (!((Boolean) this.A01.get()).booleanValue()) {
            hashMap.put(new SubscribeTopic("/t_tn", 0), C1md.A03);
        }
        if (C1mr.A00((C1mr) 1Bi.A03(65816)).AZr(1GD.A07, 36310512514695480L)) {
            hashMap.put(new SubscribeTopic("/t_thread_typing", 0), C1md.A03);
        }
        hashMap.put(new SubscribeTopic("/t_dr_response", 0), c1md);
        hashMap.put(new SubscribeTopic("/t_rtc_log", 0), c1md);
        hashMap.put(new SubscribeTopic("/t_trace", 0), c1md);
        return ImmutableMap.copyOf((java.util.Map) hashMap);
    }
}

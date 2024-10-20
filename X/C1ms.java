package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* renamed from: X.1ms, reason: invalid class name */
/* loaded from: 1ms.class */
public final class C1ms implements 1mY {
    public final C15h A01 = new C3j6(14);
    public final 1Br A00 = 1Bq.A00(16385);

    public ImmutableMap get() {
        boolean z;
        HashMap hashMap = new HashMap();
        C00i c00i = this.A00.A00;
        if (((2yD) c00i.get()).AZk(36316967849700061L) && 1BK.A0M(c00i).AZk(36316967849831135L)) {
            z = true;
            hashMap.put(new SubscribeTopic(09V.A00(275), 0), C1md.A02);
        } else {
            z = false;
        }
        if (!((Boolean) this.A01.get()).booleanValue() && !z) {
            hashMap.put(new SubscribeTopic(09V.A00(98), 0), C1md.A02);
        }
        SubscribeTopic subscribeTopic = new SubscribeTopic(09V.A00(62), 0);
        C1md c1md = C1md.A02;
        hashMap.put(subscribeTopic, c1md);
        hashMap.put(new SubscribeTopic(09V.A00(72), 0), c1md);
        hashMap.put(new SubscribeTopic(09V.A00(63), 0), c1md);
        ImmutableMap copyOf = ImmutableMap.copyOf((java.util.Map) hashMap);
        11T.A0A(copyOf);
        return copyOf;
    }
}

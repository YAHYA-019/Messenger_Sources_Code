package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* renamed from: X.1mf, reason: invalid class name */
/* loaded from: 1mf.class */
public final class C1mf implements 1mY {
    public final 1Br A01 = 1Bq.A00(66115);
    public final 1Br A00 = 1Bq.A00(66303);

    public ImmutableMap get() {
        ImmutableMap of = (((C1Y1) this.A01.A00.get()).A00() != 0S2.A00 || ((C1mg) this.A00.A00.get()).A00()) ? RegularImmutableMap.A03 : ImmutableMap.of((Object) new SubscribeTopic("/t_sp", 0), (Object) C1md.A03);
        11T.A0D(of);
        return of;
    }
}

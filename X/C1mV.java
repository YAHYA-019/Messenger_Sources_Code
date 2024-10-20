package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps$EntryFunction;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.1mV, reason: invalid class name */
/* loaded from: 1mV.class */
public final class C1mV {
    public ImmutableList A00;
    public final C00i A01 = ((C1mW) 1Bi.A03(66309)).A00;

    public ImmutableList A00() {
        ImmutableList immutableList;
        synchronized (this) {
            immutableList = this.A00;
            if (immutableList == null) {
                immutableList = ImmutableList.copyOf(C1my.A04(new Predicates.CompositionPredicate(new 3dW(C1md.A02, 3), Maps$EntryFunction.A01), A01()).keySet());
                this.A00 = immutableList;
            }
        }
        return immutableList;
    }

    public ImmutableMap A01() {
        HashMap hashMap = new HashMap();
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        for (1mY r0 : (Set) this.A01.get()) {
            ImmutableMap immutableMap = r0.get();
            1Du it = immutableMap.keySet().iterator();
            while (it.hasNext()) {
                SubscribeTopic subscribeTopic = (SubscribeTopic) it.next();
                String str = subscribeTopic.A01;
                Object put = hashMap.put(str, r0);
                if (put != null) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    String A0t = 1BL.A0t("Duplicate topics not allowed at this time: ", str, A0k);
                    A0k.append(put);
                    throw 1BL.A0h(r0, A0t, A0k);
                }
                builder.put(subscribeTopic, immutableMap.get(subscribeTopic));
            }
        }
        return builder.build();
    }
}

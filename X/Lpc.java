package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Lpc.class */
public final class Lpc implements Runnable {
    public static final String __redex_internal_original_name = "ClientSubscriptionManager$3";
    public final /* synthetic */ KkG A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ ImmutableList A02;

    public Lpc(KkG kkG, ImmutableList immutableList, ImmutableList immutableList2) {
        this.A00 = kkG;
        this.A01 = immutableList;
        this.A02 = immutableList2;
    }

    @Override // java.lang.Runnable
    public void run() {
        KkG kkG = this.A00;
        ImmutableList immutableList = this.A01;
        ImmutableList immutableList2 = this.A02;
        List list = kkG.A02;
        list.addAll(immutableList);
        Iterator it = immutableList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!list.remove(next)) {
                0fH.A17("multiuser.ClientSubscriptionManager", 1BJ.A00(897), new Object[]{next});
            }
        }
        KfN kfN = kkG.A01;
        0fH.A0d(immutableList, immutableList2, "UserMqttConnection", "updateAppForegroundAndSubscription, toSubscribe: %s, toUnsubscribe: %s");
        kfN.A00.A0C.A0X(immutableList, immutableList2, true);
    }
}

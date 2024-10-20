package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: Kom.class */
public final class Kom {
    public final /* synthetic */ KkG A00;

    public Kom(KkG kkG) {
        this.A00 = kkG;
    }

    public void A00(Collection collection, Collection collection2) {
        0fH.A0d(collection, collection2, "multiuser.ClientSubscriptionManager", "onSubscriptionCollected %s : %s");
        KkG kkG = this.A00;
        ImmutableList copyOf = ImmutableList.copyOf(collection);
        ImmutableList copyOf2 = ImmutableList.copyOf(collection2);
        0fH.A0d(collection, collection2, "multiuser.ClientSubscriptionManager", "updateForegroundAndSubscriptionSync %s : %s");
        kkG.A00.execute(new Lpc(kkG, copyOf, copyOf2));
    }
}

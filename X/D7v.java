package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: D7v.class */
public final class D7v implements Runnable {
    public static final String __redex_internal_original_name = "DeleteThreadsHelper$4";
    public final /* synthetic */ C5P A00;
    public final /* synthetic */ ImmutableList A01;

    public D7v(C5P c5p, ImmutableList immutableList) {
        this.A00 = c5p;
        this.A01 = immutableList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = this.A01.iterator();
        while (it.hasNext()) {
            ThreadKey A0k = AbG.A0k(it);
            if (A0k.A06 == C1yg.GROUP || A0k.A1I()) {
                builder.m11011add((Object) 1BK.A0w(A0k));
            }
        }
        ((AcZ) this.A00.A03.get()).A02(builder.build());
    }
}

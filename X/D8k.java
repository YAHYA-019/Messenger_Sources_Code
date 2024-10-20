package X;

import java.util.List;

/* loaded from: D8k.class */
public final class D8k implements Runnable {
    public static final String __redex_internal_original_name = "LegacyCallLogsHandler$deleteCallLogsForThreads$1";
    public final /* synthetic */ D0H A00;
    public final /* synthetic */ List A01;

    public D8k(D0H d0h, List list) {
        this.A00 = d0h;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Cbj.A02(new 4sQ("thread_key", this.A01), (Cbj) 1Br.A0B(this.A00.A01));
    }
}

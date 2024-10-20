package X;

import java.util.List;

/* loaded from: AGb.class */
public final class AGb implements Runnable {
    public static final String __redex_internal_original_name = "TextStreamingComponent$updateText$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2lh A01;
    public final /* synthetic */ C2lh A02;

    public AGb(C2lh c2lh, C2lh c2lh2, int i) {
        this.A01 = c2lh;
        this.A02 = c2lh2;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A02(((List) this.A02.A02).get(this.A00));
    }
}

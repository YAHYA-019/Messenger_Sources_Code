package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AEw.class */
public final class AEw implements Runnable {
    public static final String __redex_internal_original_name = "MontageThreadSessionUtil$activateThread$1";
    public final /* synthetic */ ThreadKey A00;
    public final /* synthetic */ 9Yg A01;

    public AEw(ThreadKey threadKey, 9Yg r303) {
        this.A01 = r303;
        this.A00 = threadKey;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((22C) 1Br.A0B(this.A01.A00)).A0K(A1I.A00, (String) null, this.A00.A01);
    }
}

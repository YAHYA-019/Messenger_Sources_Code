package X;

import android.os.Handler;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Lrb.class */
public final class Lrb implements Runnable {
    public static Handler A05;
    public static final String __redex_internal_original_name = "AsyncTaskLoader$LoadTask";
    public final FutureTask A00;
    public final AtomicBoolean A01;
    public final AtomicBoolean A02;
    public volatile Integer A03;
    public final /* synthetic */ AbstractC3042Jh7 A04;

    public Lrb() {
        this.A03 = 0S2.A00;
        this.A01 = new AtomicBoolean();
        this.A02 = new AtomicBoolean();
        this.A00 = new Lyr(this, new LtW(this, 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Lrb(AbstractC3042Jh7 abstractC3042Jh7) {
        this();
        this.A04 = abstractC3042Jh7;
    }

    public void A00(Object obj) {
        Handler handler;
        synchronized (Lrb.class) {
            handler = A05;
            if (handler == null) {
                handler = AnonymousClass001.A07();
                A05 = handler;
            }
        }
        handler.post(new Lmc(this, obj));
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A04.A07();
    }
}

package X;

import java.util.concurrent.Callable;

/* loaded from: Lof.class */
public final class Lof implements Runnable {
    public static final String __redex_internal_original_name = "zzz";
    public final /* synthetic */ C4Ez A00;
    public final /* synthetic */ Callable A01;

    public Lof(C4Ez c4Ez, Callable callable) {
        this.A00 = c4Ez;
        this.A01 = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.A0C(this.A01.call());
        } catch (Exception e) {
            this.A00.A0B(e);
        } catch (Throwable th) {
            this.A00.A0B(AnonymousClass001.A0U(th));
        }
    }
}

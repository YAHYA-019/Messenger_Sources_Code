package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Ev8.class */
public final class Ev8 {
    public AtomicBoolean A00 = 7zO.A15();
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ FFK A04;
    public final /* synthetic */ List A05;

    public Ev8(FFK ffk, List list, int i, int i2, int i3) {
        this.A04 = ffk;
        this.A05 = list;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
    }

    public void A00(int i, Throwable th) {
        if (!this.A00.compareAndSet(false, true)) {
            throw AnonymousClass001.A0T("HttpRequest already handled");
        }
        this.A04.A02(i, th);
    }
}

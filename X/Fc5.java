package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Fc5.class */
public final class Fc5 implements GHd {
    public final /* synthetic */ FEZ A00;
    public final /* synthetic */ FEf A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ AtomicInteger A04;
    public final /* synthetic */ boolean A05;

    public Fc5(FEZ fez, FEf fEf, SettableFuture settableFuture, String str, AtomicInteger atomicInteger, boolean z) {
        this.A00 = fez;
        this.A03 = str;
        this.A01 = fEf;
        this.A04 = atomicInteger;
        this.A02 = settableFuture;
        this.A05 = z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.Eti] */
    @Override // X.GHd
    public void Bxi(Throwable th, boolean z) {
        if (this.A05) {
            FEZ fez = this.A00;
            ScheduledExecutorService scheduledExecutorService = fez.A04;
            1CO r0 = ((C2051Daa) fez.A01).A01;
            1GD r02 = 1GD.A07;
            if (r0.AZr(r02, 36322259249808648L) && (z || r0.AZr(r02, 36322259249677575L))) {
                scheduledExecutorService.schedule((Runnable) new SET(this, this.A01, this.A02, this.A03, this.A04), (int) r0.Av9(r02, 36603734226442571L), TimeUnit.MILLISECONDS);
                return;
            }
        }
        ?? obj = new Object();
        obj.A00 = ENM.A0Q;
        obj.A02 = th;
        ERn A00 = obj.A00();
        this.A00.A00.A00(this.A01, this.A03, false);
        SettableFuture settableFuture = this.A02;
        settableFuture.setException(A00);
        AbG.A1W(settableFuture, false);
    }

    @Override // X.GHd
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.A00.A00(this.A01, this.A03, true);
        if (this.A04.decrementAndGet() == 0) {
            this.A02.A04();
        }
    }
}

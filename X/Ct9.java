package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* loaded from: Ct9.class */
public final class Ct9 implements DHX {
    public final DJZ A00;
    public final SettableFuture A01 = 4YU.A0j();
    public final SettableFuture A02 = 4YU.A0j();
    public final C00i A03;
    public final 1K9 A04;

    public Ct9(DHY dhy, DJZ djz) {
        D4q A00 = D4q.A00(this, 86);
        this.A04 = A00;
        1BQ A0F = AbH.A0F();
        this.A03 = A0F;
        this.A00 = djz;
        1Kd.A0F(A00, dhy.Adj(), (Executor) A0F.get());
    }

    public SettableFuture ApN() {
        return this.A01;
    }

    public SettableFuture Cyh() {
        return this.A02;
    }
}

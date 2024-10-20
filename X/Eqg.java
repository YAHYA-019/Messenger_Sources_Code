package X;

import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Eqg.class */
public final class Eqg {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A07;
    public final Set A09 = new 1Xn(10);
    public final Set A08 = new 1Xn(10);
    public final Set A04 = new 1Xn(10);
    public final Set A03 = new 1Xn(10);
    public final Queue A02 = new ConcurrentLinkedQueue();
    public final AtomicInteger A06 = new AtomicInteger(0);
    public final AtomicBoolean A05 = DKC.A1E(false);

    public Eqg() {
        1Br A00 = 1Bu.A00(98312);
        this.A01 = A00;
        EmI emI = (EmI) 1Br.A0B(A00);
        Integer num = emI.A01;
        if (num == null) {
            num = 7zQ.A10(1Br.A07(emI.A02), 36592777765258191L);
            emI.A01 = num;
        }
        11T.A0D(num);
        EmI emI2 = (EmI) 1Br.A0B(this.A01);
        Integer num2 = emI2.A00;
        if (num2 == null) {
            num2 = 7zQ.A10(1Br.A07(emI2.A02), 36592777765323728L);
            emI2.A00 = num2;
        }
        11T.A0D(num2);
        this.A07 = AbG.A0N();
        this.A00 = 7zM.A0d();
    }
}

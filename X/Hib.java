package X;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: Hib.class */
public final class Hib {
    public ByteBuffer A00 = GOq.A17(0);
    public final JN3 A01;
    public final JMI A02;
    public final RfG A03;
    public final Hkg A04;
    public final ByteBuffer[] A05;

    public Hib(JN3 jn3, JMI jmi, RfG rfG, Hkg hkg) {
        HashMap A08;
        int i = 0;
        this.A01 = jn3;
        this.A02 = jmi;
        this.A04 = hkg;
        I9d i9d = hkg.A08;
        if (i9d != null && (A08 = i9d.A08(HAy.A01)) != null) {
            i = A08.size();
        }
        this.A05 = new ByteBuffer[i];
        this.A03 = rfG;
    }
}

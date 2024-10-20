package X;

/* loaded from: Icq.class */
public final class Icq implements JFz {
    @Override // X.JFz
    public JMg AJn(HsT hsT, JMu jMu, int i, int i2, boolean z) {
        boolean z2 = false;
        if ((jMu.Aig().A00 & 32) != 0) {
            z2 = true;
        }
        Icb icb = new Icb(i, i2, z2);
        if (z) {
            icb.A00.A00();
        }
        return icb;
    }
}

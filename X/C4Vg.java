package X;

import com.google.common.collect.ImmutableSet;

/* renamed from: X.4Vg, reason: invalid class name */
/* loaded from: 4Vg.class */
public final class C4Vg implements 5G3 {
    public final C00i A00 = 1BQ.A02(32933);
    public final C00i A01 = 1BQ.A02(32901);
    public final C00i A02 = 1BQ.A02(131221);

    public void Bni(1ID r302, 1ID r303, 4RY r304, String str) {
        ImmutableSet A07;
        0fH.A0V(r302.A01, C4Vg.class, "Re-registering push token due to device id changing from %s to %s", r303.A01);
        C4U9 c4u9 = (C4U9) this.A02.get();
        synchronized (c4u9) {
            A07 = ImmutableSet.A07(c4u9.A00);
        }
        1Du it = A07.iterator();
        while (it.hasNext()) {
            4AG r0 = (4AG) it.next();
            1OZ BAD = r0.BAD();
            if (((45J) this.A01.get()).A05(BAD)) {
                ((4AX) this.A00.get()).A07(1Fw.A00(), r0.Aax(), BAD);
            }
        }
    }
}

package X;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: Hpy.class */
public final class Hpy {
    public HAy A00;
    public Huc A01;
    public JLS A02;
    public Iterator A03;
    public final I9d A04;
    public final boolean A05;

    public Hpy(I9d i9d, boolean z) {
        this.A04 = i9d;
        this.A05 = z;
    }

    public long A00(long j, TimeUnit timeUnit) {
        IFX.A07(AnonymousClass001.A1T(this.A00), "No track is selected");
        while (true) {
            JLS jls = this.A02;
            if (jls == null || j < jls.BBm().A03(timeUnit)) {
                break;
            }
            if (this.A02.BBm().A06(timeUnit, j, this.A05)) {
                j = this.A02.A8x(j, timeUnit);
                break;
            }
            Iterator it = this.A03;
            this.A02 = (it == null || !it.hasNext()) ? null : (JLS) this.A03.next();
        }
        return j;
    }
}

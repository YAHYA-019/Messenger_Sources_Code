package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function1;

/* loaded from: L56.class */
public abstract class L56 {
    public int A00;
    public int A01;
    public long A03 = 0 << 32;
    public long A04 = Kbe.A00;
    public long A02 = 0;

    private final void A0G() {
        long j = this.A03;
        int A0C = JQz.A0C(j);
        long j2 = this.A04;
        int A05 = Constraints.A05(j2, A0C);
        this.A01 = A05;
        int A0I = JR0.A0I(j);
        int A04 = Constraints.A04(j2, A0I);
        this.A00 = A04;
        this.A02 = JR1.A0S((A05 - A0C) / 2, (A04 - A0I) / 2);
    }

    public final void A0H(long j) {
        if (this.A03 != j) {
            this.A03 = j;
            A0G();
        }
    }

    public final void A0I(long j) {
        if (this.A04 != j) {
            this.A04 = j;
            A0G();
        }
    }

    public void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        A0K(null, f, j);
    }

    public abstract void A0K(Function1 function1, float f, long j);

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
    
        if (r313 == 1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ java.lang.Object B1J() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L56.B1J():java.lang.Object");
    }
}

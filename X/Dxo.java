package X;

import java.util.Collections;
import java.util.List;

/* loaded from: Dxo.class */
public final class Dxo extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dxo() {
        super("NTTypeaheadResultsComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0148, code lost:
    
        if (r0.isEmpty() != false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
    /* JADX WARN: Type inference failed for: r313v0 */
    /* JADX WARN: Type inference failed for: r313v1 */
    /* JADX WARN: Type inference failed for: r313v2 */
    /* JADX WARN: Type inference failed for: r313v8 */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dxo.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        String A04;
        QOD qod = (QOD) r303;
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        EeX eeX = (EeX) 1Hv.A02(r302.A0D, 99494);
        List emptyList = Collections.emptyList();
        GL7 Ay2 = gl7.Ay2(57);
        if (Ay2 != null && (A04 = GL7.A04(Ay2)) != null) {
            eeX.A00.put(A04, new Rst(r302));
        }
        qod.A02 = true;
        qod.A03 = false;
        qod.A01 = emptyList;
        qod.A00 = fyG;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}

package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Cku.class */
public final class Cku implements DF8 {
    public final /* synthetic */ D4H A00;

    public Cku(D4H d4h) {
        this.A00 = d4h;
    }

    @Override // X.DF8
    public void AJs(ImmutableList immutableList) {
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            AlM.A0A((AlM) this.A00.A01, AbG.A0t(it));
        }
        AlM alM = (AlM) this.A00.A01;
        if (AlM.A0H(alM)) {
            AlM.A08(alM);
        }
    }
}

package X;

import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Iwt.class */
public final class Iwt implements Runnable {
    public static final String __redex_internal_original_name = "SidebarPresenter$mediaStreamSharedStateListener$2$1$onStreamStarted$1$1";
    public final /* synthetic */ IaC A00;
    public final /* synthetic */ GrD A01;

    public Iwt(IaC iaC, GrD grD) {
        this.A01 = grD;
        this.A00 = iaC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GrD grD = this.A01;
        1Br r0 = grD.A0P;
        if (GOp.A0F(r0).A0C()) {
            this.A00.A01.add(GOp.A0F(r0).A01);
            GrD.A03(I5A.A03.A01(), grD);
        }
        if (GOp.A0F(r0).A0B()) {
            EffectItem effectItem = GOp.A0F(r0).A00;
            if (effectItem == null || !effectItem.A06()) {
                GrD.A03(I5A.A04.A01(), grD);
            } else {
                1Br r02 = grD.A0G;
                if (((I45) 1Br.A0B(GOp.A0T(r02).A0E)).A09) {
                    this.A00.A00 = ((I45) 1Br.A0B(GOp.A0T(r02).A0E)).A02;
                    ((I45) 1Br.A0B(GOp.A0T(r02).A0E)).A02(null);
                }
                GOp.A0T(r02).A07();
            }
            this.A00.A01.add(effectItem);
        }
        if (GOp.A0F(r0).A0D()) {
            this.A00.A01.add(GOp.A0F(r0).A06);
            GrD.A03(I5A.A05.A01(), grD);
        }
        GOp.A0W(grD.A0R).A0H(HAU.A07);
        GrD.A09(grD, false);
    }
}

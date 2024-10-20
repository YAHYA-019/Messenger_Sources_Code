package X;

import java.util.Iterator;

/* loaded from: Irc.class */
public final class Irc implements Runnable {
    public static final String __redex_internal_original_name = "EffectViewSharedStateImpl$maybeUpdateAndNotifyEffectTrayContentsChange$2";
    public final /* synthetic */ IML A00;

    public Irc(IML iml) {
        this.A00 = iml;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HeR A00;
        Integer num;
        Iterator it = this.A00.A0q.iterator();
        while (it.hasNext()) {
            Gpt gpt = (Gpt) ((HFZ) it.next());
            switch (gpt.A00) {
                case 2:
                    Gqu.A00((Gqu) gpt.A01);
                    break;
                case 3:
                    Gr8.A02((Gr8) gpt.A01);
                    break;
                case 4:
                    Gqr gqr = (Gqr) gpt.A01;
                    if (IEo.A05(gqr.A01)) {
                        C00i c00i = gqr.A02.A00;
                        if (GOo.A0U(c00i).A0D() == HCR.A01) {
                            num = GOo.A0U(c00i).A0F(((I45) 1Br.A0B(gqr.A00)).A02);
                            A00 = Gqr.A00(gqr);
                            A00.A01 = num;
                            gqr.A0Z(new IZn(A00));
                            break;
                        }
                    }
                    C00i c00i2 = gqr.A02.A00;
                    boolean z = !GOo.A0U(c00i2).A09;
                    A00 = Gqr.A00(gqr);
                    if (z) {
                        IML A0U = GOo.A0U(c00i2);
                        num = Integer.valueOf(A0U.A09(A0U.A0B()));
                    } else {
                        num = null;
                    }
                    A00.A01 = num;
                    gqr.A0Z(new IZn(A00));
                case 7:
                    GWo gWo = (GWo) gpt.A01;
                    GWo.A04(gWo);
                    IML A0H = AbstractC2327GOs.A0H(gWo);
                    Integer A0F = A0H.A0D().ordinal() == 7 ? A0H.A0F(((I45) 1Br.A0B(A0H.A0L)).A02) : Integer.valueOf(A0H.A09(A0H.A0B()));
                    if (A0F == null) {
                        break;
                    } else {
                        gWo.A08(A0F.intValue());
                        break;
                    }
            }
        }
    }
}

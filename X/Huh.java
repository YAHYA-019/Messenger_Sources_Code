package X;

import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.model.art.BaseItem;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: Huh.class */
public abstract class Huh {
    public final I98 A00;
    public final 5WA A01;

    public Huh(I98 i98, 5WA r303) {
        1BL.A1F(i98, r303);
        this.A00 = i98;
        this.A01 = r303;
    }

    public final void A00(HAu hAu, JIU jiu, EffectItem effectItem, String str) {
        String str2 = str;
        11T.A0F(effectItem, 0);
        I98 i98 = this.A00;
        if (str == null) {
            str2 = this.A01.A01;
        }
        i98.A03(null, null, hAu, jiu, effectItem, str2);
    }

    public final void A01(JF3 jf3, EffectItem effectItem) {
        11T.A0F(effectItem, 0);
        I98 i98 = this.A00;
        if (!effectItem.A14) {
            jf3.Bua();
            return;
        }
        11T.A0A(FbInjector.A03);
        RR1 rr1 = new RR1();
        ((Eyn) 1Br.A0B(i98.A00)).A01(((BaseItem) effectItem).A09);
        rr1.A00(new IOg(jf3, i98, effectItem));
    }

    public final void A02(JF4 jf4) {
        Hq5 hq5 = (Hq5) 1Br.A0B(this.A00.A04);
        synchronized (hq5) {
            if (hq5.A06 != null) {
                jf4.Bzy();
            } else {
                hq5.A03.add(jf4);
            }
        }
    }

    public final void A03(String str) {
        11T.A0F(str, 0);
        HfW hfW = ((Hq5) 1Br.A0B(this.A00.A04)).A06;
        if (hfW == null) {
            throw 1BK.A0h();
        }
        hfW.A02.A03(str);
    }

    public final boolean A04(JCf jCf, JIT jit, EffectItem effectItem, boolean z) {
        return this.A00.A04(jCf, jit, effectItem, this.A01.A01, z);
    }

    public final boolean A05(EffectItem effectItem) {
        return AnonymousClass001.A1W(this.A00.A02(effectItem), HAR.A02);
    }
}

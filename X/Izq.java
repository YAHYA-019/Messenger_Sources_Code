package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: Izq.class */
public final class Izq implements Runnable {
    public static final String __redex_internal_original_name = "EffectActivity$5";
    public final /* synthetic */ GzJ A00;
    public final /* synthetic */ HZt A01;
    public final /* synthetic */ ImmutableList A02;

    public Izq(GzJ gzJ, HZt hZt, ImmutableList immutableList) {
        this.A00 = gzJ;
        this.A01 = hZt;
        this.A02 = immutableList;
    }

    @Override // java.lang.Runnable
    public void run() {
        HZt hZt = this.A01;
        ImmutableList immutableList = this.A02;
        11T.A0F(immutableList, 0);
        Iterator it = hZt.A01.iterator();
        while (it.hasNext()) {
            C2523Gg7 c2523Gg7 = (C2523Gg7) ((HFU) it.next());
            switch (c2523Gg7.A00) {
                case 1:
                    ((IMH) c2523Gg7.A01).A01 = immutableList;
                    break;
                case 3:
                    GWo gWo = (GWo) c2523Gg7.A01;
                    IML A0H = AbstractC2327GOs.A0H(gWo);
                    gWo.A0A(A0H.A09(A0H.A0B()), HAS.A03);
                    break;
            }
        }
    }
}

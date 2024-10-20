package X;

import com.facebook.messaging.montage.model.art.EffectItem;
import java.util.Iterator;
import java.util.List;

/* loaded from: Iwu.class */
public final class Iwu implements Runnable {
    public static final String __redex_internal_original_name = "SidebarPresenter$mediaStreamSharedStateListener$2$1$onStreamStopped$1$1";
    public final /* synthetic */ IaC A00;
    public final /* synthetic */ GrD A01;

    public Iwu(IaC iaC, GrD grD) {
        this.A00 = iaC;
        this.A01 = grD;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IaC iaC = this.A00;
        List list = iaC.A01;
        List A0T = 0QD.A0T(list);
        GrD grD = this.A01;
        Iterator it = A0T.iterator();
        while (it.hasNext()) {
            GrD.A03((EffectItem) it.next(), grD);
        }
        list.clear();
        if (iaC.A00 != null) {
            ((I45) 1Br.A0B(GOp.A0T(grD.A0G).A0E)).A02(iaC.A00);
            iaC.A00 = null;
        }
        GrD.A09(grD, Boolean.valueOf(GrD.A0C(grD)));
    }
}

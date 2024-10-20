package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.selfremediation.block.user.BlockUserFragment;
import com.facebook.user.model.User;

/* loaded from: Ck0.class */
public final class Ck0 implements 7Yx {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Ck0(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [com.facebook.messaging.wellbeing.selfremediation.block.user.BlockUserFragment, androidx.fragment.app.Fragment] */
    public final void CHY(User user) {
        if (this.A00 == 0) {
            if (user != null) {
                7EN r0 = (7EN) 1Bu.A06((Context) this.A02, 50188);
                BNT bnt = BNT.A0C;
                Fwk fwk = (Fwk) this.A01;
                r0.A06(((C2050DaD) fwk).A02, (ThreadSummary) this.A03, bnt, (DGC) null, fwk.A01.A01, (C1ph) null, user);
                return;
            }
            return;
        }
        AmG amG = (AmG) this.A03;
        1Br r02 = (1Br) this.A01;
        int i = AmG.A07;
        1Br.A0C(r02);
        if (user == null) {
            throw 1BK.A0h();
        }
        ?? A05 = BlockUserFragment.A05((ThreadSummary) this.A02, BNT.A0b, null, user);
        A05.A07 = null;
        AbI.A1I(AbJ.A09(amG), (Fragment) A05, AmG.A07);
    }
}

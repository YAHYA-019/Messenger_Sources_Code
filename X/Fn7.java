package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: Fn7.class */
public final class Fn7 implements GFk {
    public 1BY A01;
    public Context A00 = 7zP.A0J();
    public final C15h A04 = G7K.A01(this, ActionId.ON_VIEW_CREATED_END);
    public final FEI A03 = (FEI) 1Bn.A0B(98897);
    public final 6Gx A02 = DKD.A0Z();

    public Fn7(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
    }

    @Override // X.GFk
    public void AC8(1pK r302, FFY ffy) {
        FbFragmentActivity fbFragmentActivity = (FbFragmentActivity) r302.A1P();
        2JX A02 = ffy.A02();
        if (r302 instanceof DYy) {
            ((DYy) r302).A02 = new RuX(this, ffy);
            return;
        }
        if (r302 instanceof DZt) {
            ((DZt) r302).A09 = new RLn(A02, this, ffy);
            return;
        }
        if (r302 instanceof Q4f) {
            Q4f q4f = (Q4f) r302;
            RJs rJs = new RJs(this, ffy);
            q4f.A00 = rJs;
            if (q4f.A01) {
                rJs.A01.A03();
                return;
            }
            return;
        }
        if (r302 instanceof DZX) {
            DZX dzx = (DZX) r302;
            dzx.A02 = new RuW(dzx, this, ffy);
            return;
        }
        if (r302 instanceof Q4j) {
            ((Q4j) r302).A04 = new RvV(fbFragmentActivity, A02, this, ffy);
        } else if (r302 instanceof DZd) {
            ((DZd) r302).A0D = new Rug(fbFragmentActivity, this, ffy);
        } else if (r302 instanceof DYz) {
            ((DYz) r302).A00 = new RJr(this, ffy);
        }
    }
}

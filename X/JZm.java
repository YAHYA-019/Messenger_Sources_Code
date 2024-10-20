package X;

import android.content.Context;
import android.view.MenuItem;
import java.lang.ref.WeakReference;

/* loaded from: JZm.class */
public final class JZm extends KTL implements C53n {
    public MJu A00;
    public WeakReference A01;
    public final Context A02;
    public final LQD A03;
    public final /* synthetic */ LLe A04;

    public JZm(Context context, LLe lLe, MJu mJu) {
        this.A04 = lLe;
        this.A02 = context;
        this.A00 = mJu;
        LQD lqd = new LQD(context);
        lqd.A00 = 1;
        this.A03 = lqd;
        lqd.A03 = this;
    }

    @Override // X.C53n
    public boolean C6d(MenuItem menuItem, LQD lqd) {
        MJu mJu = this.A00;
        if (mJu != null) {
            return mJu.BhW(menuItem, this);
        }
        return false;
    }

    @Override // X.C53n
    public void C6h(LQD lqd) {
        if (this.A00 != null) {
            A01();
            LLc lLc = this.A04.A08.A04;
            if (lLc != null) {
                lLc.A03();
            }
        }
    }
}

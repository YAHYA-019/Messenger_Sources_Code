package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;

/* renamed from: X.4Ty, reason: invalid class name */
/* loaded from: 4Ty.class */
public final class C4Ty {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final Context A07;
    public final C15h A06 = new DBe(this, ActionId.CONNECTIVITY_CHANGED);
    public final C15h A05 = new DBe(this, ActionId.ASYNC_ACTION_FAIL);

    public C4Ty(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A01 = 1Bu.A03(r0, 65938);
        this.A04 = 1Bu.A03(r0, 99982);
        Context context = (Context) 1Bn.A0G(r0, 83719);
        this.A07 = context;
        this.A02 = 1HG.A00(context, 67720);
        this.A03 = 1Bu.A03(r0, 84232);
    }
}

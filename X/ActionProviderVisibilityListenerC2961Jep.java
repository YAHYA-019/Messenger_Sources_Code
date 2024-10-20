package X;

import android.content.Context;
import android.view.ActionProvider;

/* renamed from: X.Jep, reason: case insensitive filesystem */
/* loaded from: Jep.class */
public final class ActionProviderVisibilityListenerC2961Jep extends 0Rc implements ActionProvider.VisibilityListener {
    public 0Rb A00;
    public final ActionProvider A01;
    public final /* synthetic */ JZq A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionProviderVisibilityListenerC2961Jep(Context context, ActionProvider actionProvider, JZq jZq) {
        super(context);
        this.A02 = jZq;
        this.A01 = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public void onActionProviderVisibilityChanged(boolean z) {
        LQJ lqj = this.A00;
        if (lqj != null) {
            LQD lqd = lqj.A00.A0B;
            lqd.A0B = true;
            lqd.A0D(true);
        }
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.List;

/* renamed from: X.50x, reason: invalid class name */
/* loaded from: 50x.class */
public final class C50x implements C50u {
    public final InAppPurchaseControllerCoro A00;
    public final Context A01;

    public C50x(Context context, InAppPurchaseControllerCoro inAppPurchaseControllerCoro) {
        this.A01 = context;
        this.A00 = inAppPurchaseControllerCoro;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    public void A00(X.C05004ck r302, X.7yH r303, X.Dq0 r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50x.A00(X.4ck, X.7yH, X.Dq0, boolean):void");
    }

    public void A01(7yG r302, String str, List list, List list2) {
        this.A00.A0M(r302, str, list, list2, false);
    }

    @Override // X.C50u
    public void BY1(Activity activity, DqC dqC, GCx gCx, AZb aZb) {
        11T.A0F(activity, 0);
        this.A00.BY1(activity, dqC, null, aZb);
    }

    @Override // X.C50u
    public boolean CaZ(7yI r302, List list, List list2, boolean z) {
        return this.A00.CaZ(r302, list, list2, false);
    }

    @Override // X.C50u
    public boolean isEnabled() {
        return this.A00.isEnabled();
    }

    @Override // X.C50u
    public void onDestroy() {
        this.A00.onDestroy();
    }
}

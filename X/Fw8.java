package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* loaded from: Fw8.class */
public final class Fw8 implements 1K9 {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ 04J A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public Fw8(Intent intent, Bundle bundle, FragmentActivity fragmentActivity, 04J r305, boolean z, boolean z2) {
        this.A02 = fragmentActivity;
        this.A03 = r305;
        this.A01 = bundle;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = intent;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        FragmentActivity fragmentActivity = this.A02;
        fragmentActivity.setResult(0, AbF.A05().putExtra(AbE.A00(2), "new_token").putExtra("error", th.getMessage()));
        fragmentActivity.finish();
        FEz fEz = FEz.A00;
        04J r0 = this.A03;
        Integer num = 0S2.A0j;
        Bundle bundle = this.A01;
        String message = th.getMessage();
        Class<?> cls = th.getClass();
        java.util.Map map = 0BY.A03;
        11T.A0F(cls, 1);
        fEz.A01(bundle, r0, num, message, C0Bx.A01(cls), C0ra.A00(th));
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
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fw8.onSuccess(java.lang.Object):void");
    }
}

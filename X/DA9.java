package X;

import android.content.Context;
import com.facebook.messaging.profile.launcher.ProfileFragmentParams;

/* loaded from: DA9.class */
public final class DA9 implements Runnable {
    public static final String __redex_internal_original_name = "MessengerProfileFragmentLauncher$launchProfile$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 06Z A01;
    public final /* synthetic */ 1pI A02;
    public final /* synthetic */ ProfileFragmentParams A03;
    public final /* synthetic */ CoV A04;

    public DA9(Context context, 06Z r303, 1pI r304, ProfileFragmentParams profileFragmentParams, CoV coV) {
        this.A04 = coV;
        this.A00 = context;
        this.A01 = r303;
        this.A02 = r304;
        this.A03 = profileFragmentParams;
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
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DA9.run():void");
    }
}

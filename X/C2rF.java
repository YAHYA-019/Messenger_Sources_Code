package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.user.model.UserKey;
import java.util.concurrent.Callable;

/* renamed from: X.2rF, reason: invalid class name */
/* loaded from: 2rF.class */
public final class C2rF implements Callable {
    public final /* synthetic */ CallerContext A00;
    public final /* synthetic */ 2Dp A01;
    public final /* synthetic */ 2rE A02;
    public final /* synthetic */ UserKey A03;

    public C2rF(CallerContext callerContext, 2Dp r303, 2rE r304, UserKey userKey) {
        this.A02 = r304;
        this.A01 = r303;
        this.A03 = userKey;
        this.A00 = callerContext;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v7 ??, still in use, count: 2, list:
          (r310v7 ??) from 0x02d9: PHI (r310v4 ??) = (r310v3 ??), (r310v7 ??) binds: [B:170:0x02d5, B:101:0x01cf] A[DONT_GENERATE, DONT_INLINE]
          (r310v7 ?? I:X.66q) from 0x01d1: INVOKE (r310v7 ?? I:X.66q), (r1v22 ?? I:java.lang.Object) VIRTUAL call: X.66q.A0A(java.lang.Object):void A[Catch: all -> 0x02de, MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2rF.call():java.lang.Object");
    }
}

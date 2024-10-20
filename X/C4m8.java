package X;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;

/* renamed from: X.4m8, reason: invalid class name */
/* loaded from: 4m8.class */
public final class C4m8 implements ViewTreeObserver.OnPreDrawListener {
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final Runnable A02 = new Runnable() { // from class: X.4m9
        public static final String __redex_internal_original_name = "DrawTimerOnPreDrawListener$1";

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
        
            if (r314 == r0.A03) goto L59;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC08204m9.run():void");
        }
    };
    public int A00 = -1;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v2 ??, still in use, count: 2, list:
          (r310v2 ??) from 0x008f: PHI (r310v1 ??) = (r310v0 ??), (r310v2 ??) binds: [B:22:0x007b, B:26:0x008c] A[DONT_GENERATE, DONT_INLINE]
          (r310v2 ?? I:??[OBJECT, ARRAY]) from 0x008e: APUT (r0v37 ?? I:??[OBJECT, ARRAY][]), (r309v2 ?? I:??[int, short, byte, char]), (r310v2 ?? I:??[OBJECT, ARRAY]) A[Catch: all -> 0x00d0]
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
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4m8.onPreDraw():boolean");
    }
}

package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.1dz, reason: invalid class name */
/* loaded from: 1dz.class */
public final class C1dz implements C1e1 {
    public static C1dz A04;
    public final C1e3 A01;
    public final Queue A03 = new ConcurrentLinkedQueue();
    public boolean A00 = false;
    public final List A02 = new ArrayList();

    public C1dz(C1e3 c1e3) {
        this.A01 = c1e3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v2 ??, still in use, count: 2, list:
          (r302v2 ??) from 0x001e: PHI (r302v1 ??) = (r302v0 ??), (r302v2 ??) binds: [B:6:0x000a, B:12:0x001b] A[DONT_GENERATE, DONT_INLINE]
          (r302v2 ?? I:X.1dz) from 0x001b: SPUT (r302v2 ?? I:X.1dz) A[Catch: all -> 0x0022] X.1dz.A04 X.1dz
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
    public static X.C1dz A00() {
        /*
            java.lang.Class<X.1dz> r0 = X.C1dz.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            X.1dz r0 = X.C1dz.A04     // Catch: java.lang.Throwable -> L22
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1e
            X.1e3 r0 = X.C1e3.A01     // Catch: java.lang.Throwable -> L22
            r303 = r0
            X.1dz r0 = new X.1dz     // Catch: java.lang.Throwable -> L22
            r302 = r0
            r0 = r302
            r1 = r303
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            r0 = r302
            X.C1dz.A04 = r0     // Catch: java.lang.Throwable -> L22
        L1e:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L22:
            r303 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1dz.A00():X.1dz");
    }

    public static void A01(C1f3 c1f3, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C1e1) it.next()).Ba6(c1f3);
        }
    }

    @Override // X.C1e1
    public void Ba6(C1f3 c1f3) {
        if (this.A00) {
            Set set = C1fv.A00;
            boolean z = !set.isEmpty();
            Queue queue = this.A03;
            boolean z2 = false;
            if (queue.size() < 50) {
                z2 = true;
            }
            if (!z || z2) {
                queue.add(c1f3);
            } else {
                A01(c1f3, set);
                while (!queue.isEmpty()) {
                    C1f3 c1f32 = (C1f3) queue.poll();
                    if (c1f32 != null) {
                        A01(c1f32, set);
                    }
                }
            }
            if (c1f3.A03) {
                int i = c1f3.A00;
                if (i == 2 || i == 4) {
                    A01(c1f3, C1fv.A01);
                }
            }
        }
    }
}

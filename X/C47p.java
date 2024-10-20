package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.47p, reason: invalid class name */
/* loaded from: 47p.class */
public final class C47p implements C47q {
    public final HashSet A00 = new HashSet();

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v1 ??, still in use, count: 2, list:
          (r304v1 ??) from 0x0025: PHI (r304v2 ??) = (r304v1 ??), (r304v3 ??) binds: [B:16:0x0020, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]
          (r304v1 ?? I:java.util.AbstractCollection) from 0x0021: INVOKE (r304v1 ?? I:java.util.AbstractCollection), (r0v1 ?? I:java.util.Collection) VIRTUAL call: java.util.AbstractCollection.addAll(java.util.Collection):boolean A[Catch: all -> 0x0029, MD:(java.util.Collection<? extends E>):boolean (c)]
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
    private java.util.HashSet A00() {
        /*
            r301 = this;
            r0 = r301
            java.util.HashSet r0 = r0.A00
            r302 = r0
            r0 = r302
            monitor-enter(r0)
            r0 = r302
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L29
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L17
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            goto L25
        L17:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L29
            r304 = r0
            r0 = r304
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            r0 = r304
            r1 = r302
            boolean r0 = r0.addAll(r1)     // Catch: java.lang.Throwable -> L29
        L25:
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            r0 = r304
            return r0
        L29:
            r304 = move-exception
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47p.A00():java.util.HashSet");
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, double d) {
        HashSet A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47q) it.next()).onMarkerAnnotate(i, i2, str, d);
            }
        }
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, int i3) {
        HashSet A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47q) it.next()).onMarkerAnnotate(i, i2, str, i3);
            }
        }
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, long j) {
        HashSet A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47q) it.next()).onMarkerAnnotate(i, i2, str, j);
            }
        }
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, String str2) {
        HashSet A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47q) it.next()).onMarkerAnnotate(i, i2, str, str2);
            }
        }
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, boolean z) {
        HashSet A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47q) it.next()).onMarkerAnnotate(i, i2, str, z);
            }
        }
    }

    @Override // X.C47q
    public void onMarkerAnnotate(int i, int i2, String str, String[] strArr) {
        HashSet A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47q) it.next()).onMarkerAnnotate(i, i2, str, strArr);
            }
        }
    }

    @Override // X.C47q
    public void onMarkerEnd(int i, int i2, long j, long j2, short s) {
        HashSet A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47q) it.next()).onMarkerEnd(i, i2, j, j2, s);
            }
        }
    }

    @Override // X.C47q
    public void onMarkerPoint(int i, int i2, String str, String str2, long j) {
        HashSet A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47q) it.next()).onMarkerPoint(i, i2, str, str2, j);
            }
        }
    }

    @Override // X.C47q
    public void onMarkerStart(int i, int i2, long j) {
        HashSet A00 = A00();
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C47q) it.next()).onMarkerStart(i, i2, j);
            }
        }
    }
}

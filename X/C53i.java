package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.53i, reason: invalid class name */
/* loaded from: 53i.class */
public final class C53i {
    public static C53i A01;
    public static final PorterDuff.Mode A02 = PorterDuff.Mode.SRC_IN;
    public C53b A00;

    public static PorterDuffColorFilter A00(PorterDuff.Mode mode, int i) {
        PorterDuffColorFilter A00;
        synchronized (C53i.class) {
            A00 = C53b.A00(mode, i);
        }
        return A00;
    }

    public static C53i A01() {
        C53i c53i;
        synchronized (C53i.class) {
            if (A01 == null) {
                A02();
            }
            c53i = A01;
        }
        return c53i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v7 ??, still in use, count: 2, list:
          (r302v7 ??) from 0x0032: PHI (r302v4 ??) = (r302v3 ??), (r302v7 ??) binds: [B:18:0x0023, B:22:0x002f] A[DONT_GENERATE, DONT_INLINE]
          (r302v7 ?? I:X.53b) from 0x002f: SPUT (r302v7 ?? I:X.53b) A[Catch: all -> 0x0056] X.53b.A05 X.53b
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
    public static void A02() {
        /*
            java.lang.Class<X.53i> r0 = X.C53i.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            X.53i r0 = X.C53i.A01     // Catch: java.lang.Throwable -> L5e
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L5b
            X.53i r0 = new X.53i     // Catch: java.lang.Throwable -> L5e
            r303 = r0
            r0 = r303
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            r0 = r303
            X.C53i.A01 = r0     // Catch: java.lang.Throwable -> L5e
            java.lang.Class<X.53b> r0 = X.C53b.class
            r304 = r0
            r0 = r304
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L5e
            X.53b r0 = X.C53b.A05     // Catch: java.lang.Throwable -> L56 java.lang.Throwable -> L5e
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L32
            X.53b r0 = new X.53b     // Catch: java.lang.Throwable -> L56
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            r0 = r302
            X.C53b.A05 = r0     // Catch: java.lang.Throwable -> L56
        L32:
            r0 = r304
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            r0 = r303
            r1 = r302
            r0.A00 = r1     // Catch: java.lang.Throwable -> L5e
            X.53i r0 = X.C53i.A01     // Catch: java.lang.Throwable -> L5e java.lang.Throwable -> L5e
            r302 = r0
            r0 = r302
            X.53b r0 = r0.A00     // Catch: java.lang.Throwable -> L5e
            r304 = r0
            X.53j r0 = new X.53j     // Catch: java.lang.Throwable -> L5e
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L5e
            r0 = r304
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L5e
            r0 = r304
            r1 = r302
            r0.A01 = r1     // Catch: java.lang.Throwable -> L56
            r0 = r304
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            goto L5b
        L56:
            r302 = move-exception
            r0 = r304
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            r0 = r302
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5b:
            r0 = r301
            monitor-exit(r0)
            return
        L5e:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53i.A02():void");
    }

    public ColorStateList A03(Context context, int i) {
        ColorStateList A03;
        synchronized (this) {
            A03 = this.A00.A03(context, i);
        }
        return A03;
    }

    public Drawable A04(Context context, int i) {
        Drawable A04;
        synchronized (this) {
            A04 = this.A00.A04(context, i);
        }
        return A04;
    }
}

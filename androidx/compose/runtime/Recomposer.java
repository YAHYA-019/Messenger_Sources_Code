package androidx.compose.runtime;

import X.0DE;
import X.0Du;
import X.0Ro;
import X.0Xs;
import X.1BK;
import X.AIN;
import X.AnonymousClass001;
import X.C0ty;
import X.C2820Jac;
import X.C2874Jbr;
import X.C2875Jbs;
import X.C2a0;
import X.C2a2;
import X.C2a3;
import X.C2s8;
import X.GOn;
import X.KN2;
import X.Kdd;
import X.Kde;
import X.Kue;
import X.LNf;
import X.LtK;
import X.M3K;
import X.M6n;
import X.MMw;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Recomposer.class */
public final class Recomposer extends Kue {
    public long A00;
    public C2820Jac A01;
    public Throwable A02;
    public List A03;
    public Set A04;
    public C2s8 A05;
    public C2a2 A06;
    public boolean A07;
    public Kdd A08;
    public List A09;
    public final LNf A0A;
    public final Kde A0B;
    public final LtK A0C;
    public final Object A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final Map A0H;
    public final Map A0I;
    public final 0DE A0J;
    public final 0Xs A0K;
    public final C2a3 A0L;
    public static final 0Xs A0N = 0Du.A00(AIN.A03);
    public static final AtomicReference A0M = GOn.A1L(1BK.A0d());

    public Recomposer(0DE r302) {
        LNf lNf = new LNf(M3K.A00(this, 29));
        this.A0A = lNf;
        this.A0D = AnonymousClass001.A0R();
        this.A0E = AnonymousClass001.A0s();
        this.A01 = C2820Jac.A02();
        this.A0C = LtK.A02(new MMw[16]);
        this.A0G = AnonymousClass001.A0s();
        this.A0F = AnonymousClass001.A0s();
        this.A0I = 1BK.A1C();
        this.A0H = 1BK.A1C();
        this.A0K = new 0Ro(KN2.Inactive);
        C2a0 c2a0 = new C2a0((C2a2) r302.get(C2a2.A00));
        c2a0.BQH(M6n.A00(this, 44));
        this.A0L = c2a0;
        this.A0J = r302.plus(lNf).plus(c2a0);
        this.A0B = new Kde(this);
    }

    public static final List A00(Recomposer recomposer) {
        List list = recomposer.A03;
        if (list == null) {
            List list2 = recomposer.A0E;
            list = list2.isEmpty() ? C0ty.A00 : 1BK.A17(list2);
            recomposer.A03 = list;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C2s8 A01(androidx.compose.runtime.Recomposer r301) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A01(androidx.compose.runtime.Recomposer):X.2s8");
    }

    public static final void A02(MMw mMw, Recomposer recomposer) {
        List list = recomposer.A09;
        if (list == null) {
            list = AnonymousClass001.A0s();
            recomposer.A09 = list;
        }
        if (!list.contains(mMw)) {
            list.add(mMw);
        }
        recomposer.A0E.remove(mMw);
        recomposer.A03 = null;
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 306, insn: 0x00cc: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r306 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:60:0x00cc */
    public static final void A03(X.MMw r301, androidx.compose.runtime.Recomposer r302, java.lang.Exception r303) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A03(X.MMw, androidx.compose.runtime.Recomposer, java.lang.Exception):void");
    }

    public static final void A04(C2874Jbr c2874Jbr) {
        try {
            if (c2874Jbr.A0N() instanceof C2875Jbs) {
                throw AnonymousClass001.A0N("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c2874Jbr.A0B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r301.A0A.A03.get() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A05(androidx.compose.runtime.Recomposer r301) {
        /*
            r0 = r301
            boolean r0 = r0.A07
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1c
            r0 = r301
            X.LNf r0 = r0.A0A
            X.Lyv r0 = r0.A03
            r303 = r0
            r0 = r303
            int r0 = r0.get()
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L20
        L1c:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L20:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A05(androidx.compose.runtime.Recomposer):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (A05(r301) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A06(androidx.compose.runtime.Recomposer r301) {
        /*
            r0 = r301
            java.lang.Object r0 = r0.A0D
            r302 = r0
            r0 = r302
            monitor-enter(r0)
            r0 = r301
            X.Jac r0 = r0.A01     // Catch: java.lang.Throwable -> L38
            r303 = r0
            r0 = r303
            int r0 = r0.A01     // Catch: java.lang.Throwable -> L38
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L32
            r0 = r301
            X.LtK r0 = r0.A0C     // Catch: java.lang.Throwable -> L38
            r303 = r0
            r0 = r303
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L38
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L32
            r0 = r301
            boolean r0 = A05(r0)     // Catch: java.lang.Throwable -> L38
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L34
        L32:
            r0 = 1
            r304 = r0
        L34:
            r0 = r302
            monitor-exit(r0)
            r0 = r304
            return r0
        L38:
            r303 = move-exception
            r0 = r302
            monitor-exit(r0)
            r0 = r303
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A06(androidx.compose.runtime.Recomposer):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x018d, code lost:
    
        if (A05(r301) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (A05(r301) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0193, code lost:
    
        r304 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0129, code lost:
    
        if (r0 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012c, code lost:
    
        r0 = r0.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0133, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        X.LNU.A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013a, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014d, code lost:
    
        r305 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0141, code lost:
    
        if (X.Kue.A08(r301) <= 0) goto L149;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r305v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A07(androidx.compose.runtime.Recomposer r301) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A07(androidx.compose.runtime.Recomposer):boolean");
    }

    public final void A0F() {
        synchronized (this.A0D) {
            0Xs r0 = this.A0K;
            if (((KN2) r0.getValue()).compareTo(KN2.Idle) >= 0) {
                r0.Cvx(KN2.ShuttingDown);
            }
        }
        this.A0L.AE0(null);
    }
}

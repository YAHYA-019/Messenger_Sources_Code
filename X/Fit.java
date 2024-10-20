package X;

/* loaded from: Fit.class */
public final class Fit implements 3lQ {
    public final 1LI A00;
    public final Fim A01;
    public final int A02;
    public final Ejb A03;

    public Fit(1LI r302, Ejb ejb, Fim fim, int i) {
        this.A02 = i;
        this.A03 = ejb;
        this.A01 = fim;
        this.A00 = r302;
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
    /* JADX WARN: Not initialized variable reg: 304, insn: 0x009e: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r304 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:32:0x009e */
    public void Cgh(X.EzD r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0.A04
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L22
            r0 = r301
            X.Fim r0 = r0.A01
            r304 = r0
            r0 = r304
            monitor-enter(r0)
            r0 = r304
            java.util.List r0 = r0.A07     // Catch: java.lang.Throwable -> L9c
            r305 = r0
            r0 = r305
            r1 = r302
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L9c
            r0 = r304
            monitor-exit(r0)
            return
        L22:
            r0 = r301
            X.Ejb r0 = r0.A03
            r306 = r0
            r0 = r306
            java.lang.Object r0 = r0.A01
            r307 = r0
            r0 = r307
            if (r0 == 0) goto La3
            r0 = r301
            X.Fim r0 = r0.A01
            r304 = r0
            r0 = r304
            monitor-enter(r0)
            r0 = r304
            java.util.List r0 = r0.A07     // Catch: java.lang.Throwable -> L9c
            r305 = r0
            r0 = r305
            r1 = r302
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L9c
            r0 = r305
            java.util.ArrayList r0 = X.1BK.A17(r0)     // Catch: java.lang.Throwable -> L9c
            r308 = r0
            r0 = r304
            monitor-exit(r0)
            r0 = r301
            int r0 = r0.A02
            r309 = r0
            r0 = 3
            r310 = r0
            X.FYi r0 = new X.FYi
            r305 = r0
            r0 = r305
            r1 = r310
            r2 = r307
            r3 = r308
            r4 = r301
            r0.<init>(r1, r2, r3, r4)
            X.Fr9 r0 = new X.Fr9
            r308 = r0
            r0 = r308
            r1 = r305
            r2 = r309
            r0.<init>(r1, r2)
            r0 = r306
            X.GId r0 = r0.A00
            r304 = r0
            r0 = r302
            boolean r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L93
            r0 = r304
            r1 = r308
            r0.AQP(r1)
            return
        L93:
            r0 = r304
            r1 = r308
            r0.AQO(r1)
            return
        L9c:
            r305 = move-exception
            r0 = r304
            monitor-exit(r0)
            r0 = r305
            throw r0
        La3:
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fit.Cgh(X.EzD):void");
    }
}

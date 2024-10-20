package X;

/* renamed from: X.De0, reason: case insensitive filesystem */
/* loaded from: De0.class */
public final class C2114De0 extends C2115De1 {
    public final 1GS A00;
    public final 5Ou A01;
    public final FyG A02;

    public C2114De0(1GS r302, 5Ou r303, FyG fyG, CharSequence charSequence) {
        super(charSequence);
        this.A02 = fyG;
        this.A01 = r303;
        this.A00 = r302;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r330v6 int, still in use, count: 2, list:
          (r330v6 int) from 0x014e: PHI (r330v7 int) = (r330v6 int), (r330v8 int) binds: [B:24:0x02f3, B:21:0x0147] A[DONT_GENERATE, DONT_INLINE]
          (r330v6 int) from 0x02f3: IF  (r330v6 int) != (0 int)  -> B:22:0x014e A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static void A00(android.text.SpannableStringBuilder r301, X.GL7 r302, X.FyG r303, java.lang.CharSequence r304, int r305, int r306, int r307, int r308, int r309, int r310, int r311, int r312, int r313, int r314, int r315, int r316, int r317, int r318, boolean r319) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2114De0.A00(android.text.SpannableStringBuilder, X.GL7, X.FyG, java.lang.CharSequence, int, int, int, int, int, int, int, int, int, int, int, int, int, int, boolean):void");
    }
}

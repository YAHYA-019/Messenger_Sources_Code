package X;

import android.graphics.drawable.Drawable;

/* loaded from: Jvr.class */
public final class Jvr extends C1pl {
    public final int A00;
    public final Object A01;

    public Jvr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static float A00(KTA kta) {
        return (Math.max(((Drawable) kta.A07.A0B.get(0)).getIntrinsicWidth(), ((Drawable) kta.A07.A0B.get(0)).getIntrinsicHeight()) / 2) * kta.A03;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:123:0x05b4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v355, types: [X.KTA] */
    /* JADX WARN: Type inference failed for: r319v1, types: [java.lang.Object, X.Juf] */
    @Override // X.C1pl
    public void A03(long r302) {
        /*
            Method dump skipped, instructions count: 1464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jvr.A03(long):void");
    }
}

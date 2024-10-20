package X;

import java.util.concurrent.FutureTask;

/* loaded from: Ivu.class */
public final class Ivu implements Runnable {
    public static final String __redex_internal_original_name = "ThreadUtil$1";
    public final /* synthetic */ JIA A00;
    public final /* synthetic */ FutureTask A01;

    public Ivu(JIA jia, FutureTask futureTask) {
        this.A01 = futureTask;
        this.A00 = jia;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:60:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ivu.run():void");
    }
}

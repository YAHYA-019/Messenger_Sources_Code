package X;

/* loaded from: Ea6.class */
public abstract /* synthetic */ class Ea6 {
    public static final /* synthetic */ int[] A00;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:10:0x0022
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    static {
        /*
            android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
            r301 = r0
            r0 = r301
            int r0 = r0.length
            r302 = r0
            r0 = r302
            int[] r0 = new int[r0]
            r303 = r0
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L22
            r301 = r0
            r0 = r301
            r1 = r303
            X.DKD.A1M(r0, r1)     // Catch: java.lang.NoSuchFieldError -> L22
        L14:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L22 java.lang.NoSuchFieldError -> L26
            r301 = r0
            r0 = r301
            r1 = r303
            X.DKD.A1N(r0, r1)     // Catch: java.lang.NoSuchFieldError -> L26
        L1d:
            r0 = r303
            X.Ea6.A00 = r0
            return
        L22:
            goto L14
        L26:
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ea6.m3219clinit():void");
    }
}

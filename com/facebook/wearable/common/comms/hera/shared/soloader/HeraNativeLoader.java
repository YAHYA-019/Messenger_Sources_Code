package com.facebook.wearable.common.comms.hera.shared.soloader;

import X.11T;
import X.1BK;
import X.C0il;

/* loaded from: HeraNativeLoader.class */
public final class HeraNativeLoader {
    public static final HeraNativeLoader INSTANCE = new Object();
    public static HeraNativeFlavor flavor;

    /* loaded from: HeraNativeLoader$WhenMappings.class */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x003d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeFlavor[] r0 = com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeFlavor.values()
                r301 = r0
                r0 = r301
                int r0 = r0.length
                r302 = r0
                r0 = r302
                int[] r0 = new int[r0]
                r303 = r0
                com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeFlavor r0 = com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeFlavor.LATEST     // Catch: java.lang.NoSuchFieldError -> L3d
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r304 = r0
                r0 = 1
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
            L1a:
                com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeFlavor r0 = com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeFlavor.STAGING     // Catch: java.lang.NoSuchFieldError -> L3d java.lang.NoSuchFieldError -> L41
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L41
                r304 = r0
                r0 = 2
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L41
            L29:
                com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeFlavor r0 = com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeFlavor.STABLE     // Catch: java.lang.NoSuchFieldError -> L41 java.lang.NoSuchFieldError -> L45
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L45
                r304 = r0
                r0 = 3
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L45
            L38:
                r0 = r303
                com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader.WhenMappings.$EnumSwitchMapping$0 = r0
                return
            L3d:
                goto L1a
            L41:
                goto L29
            L45:
                goto L38
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.soloader.HeraNativeLoader.WhenMappings.m10296clinit():void");
        }
    }

    public static final void load() {
        String str;
        HeraNativeFlavor heraNativeFlavor = flavor;
        if (heraNativeFlavor == null) {
            throw new RuntimeException("Flavor must be set before loading native library!");
        }
        int ordinal = heraNativeFlavor.ordinal();
        if (ordinal == 0) {
            str = "heraRsysLatest";
        } else if (ordinal == 1) {
            str = "heraRsysStaging";
        } else {
            if (ordinal != 2) {
                throw 1BK.A1F();
            }
            str = "heraRsysStable";
        }
        C0il.A0B(str);
    }

    public final void setFlavor(HeraNativeFlavor heraNativeFlavor) {
        11T.A0F(heraNativeFlavor, 0);
        flavor = heraNativeFlavor;
    }
}

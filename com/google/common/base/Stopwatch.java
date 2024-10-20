package com.google.common.base;

import java.util.concurrent.TimeUnit;

/* loaded from: Stopwatch.class */
public final class Stopwatch {
    public boolean isRunning;
    public long startTick;
    public final Ticker ticker = Ticker.SYSTEM_TICKER;

    /* renamed from: com.google.common.base.Stopwatch$1, reason: invalid class name */
    /* loaded from: Stopwatch$1.class */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:61:0x008f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                r301 = r0
                r0 = r301
                int r0 = r0.length
                r302 = r0
                r0 = r302
                int[] r0 = new int[r0]
                r303 = r0
                r0 = r303
                com.google.common.base.Stopwatch.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit = r0
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.NoSuchFieldError -> L7b
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7b
                r304 = r0
                r0 = 1
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7b
            L1e:
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.NoSuchFieldError -> L7b java.lang.NoSuchFieldError -> L7f
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r304 = r0
                r0 = 2
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7f
            L2d:
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.NoSuchFieldError -> L7f java.lang.NoSuchFieldError -> L83
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r304 = r0
                r0 = 3
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L3c:
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.NoSuchFieldError -> L83 java.lang.NoSuchFieldError -> L87
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L87
                r304 = r0
                r0 = 4
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L87
            L4b:
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.NoSuchFieldError -> L87 java.lang.NoSuchFieldError -> L8b
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8b
                r304 = r0
                r0 = 5
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8b
            L5a:
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS     // Catch: java.lang.NoSuchFieldError -> L8b java.lang.NoSuchFieldError -> L8f
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                r304 = r0
                r0 = 6
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8f
            L6a:
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.NoSuchFieldError -> L8f java.lang.NoSuchFieldError -> L93
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L93
                r304 = r0
                r0 = 7
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L93
            L7a:
                return
            L7b:
                goto L1e
            L7f:
                goto L2d
            L83:
                goto L3c
            L87:
                goto L4b
            L8b:
                goto L5a
            L8f:
                goto L6a
            L93:
                goto L7a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Stopwatch.AnonymousClass1.m10996clinit():void");
        }
    }

    public static Stopwatch createStarted() {
        Stopwatch stopwatch = new Stopwatch();
        Preconditions.checkState(!stopwatch.isRunning, "This stopwatch is already running.");
        stopwatch.isRunning = true;
        stopwatch.startTick = stopwatch.ticker.read();
        return stopwatch;
    }

    public long elapsed(TimeUnit timeUnit) {
        return timeUnit.convert(this.isRunning ? this.ticker.read() - this.startTick : 0L, TimeUnit.NANOSECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
    
        if (r308.convert(r304, r0) > 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Stopwatch.toString():java.lang.String");
    }
}

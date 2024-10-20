package com.facebook.common.dextricks;

import X.AnonymousClass001;

/* loaded from: CorruptedApplicationStateException.class */
public class CorruptedApplicationStateException extends RuntimeException {
    public final Remedy mRemedy;

    /* renamed from: com.facebook.common.dextricks.CorruptedApplicationStateException$1, reason: invalid class name */
    /* loaded from: CorruptedApplicationStateException$1.class */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$common$dextricks$CorruptedApplicationStateException$Remedy;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x002e
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.facebook.common.dextricks.CorruptedApplicationStateException$Remedy[] r0 = com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.values()
                r301 = r0
                r0 = r301
                int r0 = r0.length
                r302 = r0
                r0 = r302
                int[] r0 = new int[r0]
                r303 = r0
                r0 = r303
                com.facebook.common.dextricks.CorruptedApplicationStateException.AnonymousClass1.$SwitchMap$com$facebook$common$dextricks$CorruptedApplicationStateException$Remedy = r0
                com.facebook.common.dextricks.CorruptedApplicationStateException$Remedy r0 = com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.REBOOT     // Catch: java.lang.NoSuchFieldError -> L2e
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r304 = r0
                r0 = 1
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2e
            L1e:
                com.facebook.common.dextricks.CorruptedApplicationStateException$Remedy r0 = com.facebook.common.dextricks.CorruptedApplicationStateException.Remedy.REINSTALL     // Catch: java.lang.NoSuchFieldError -> L2e java.lang.NoSuchFieldError -> L32
                r301 = r0
                r0 = r301
                int r0 = r0.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                r304 = r0
                r0 = 2
                r302 = r0
                r0 = r303
                r1 = r304
                r2 = r302
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
            L2d:
                return
            L2e:
                goto L1e
            L32:
                goto L2d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.CorruptedApplicationStateException.AnonymousClass1.m5851clinit():void");
        }
    }

    /* loaded from: CorruptedApplicationStateException$Remedy.class */
    public enum Remedy {
        REINSTALL,
        REBOOT,
        UNKNOWN
    }

    public CorruptedApplicationStateException(Throwable th) {
        this(th, Remedy.UNKNOWN);
    }

    public CorruptedApplicationStateException(Throwable th, Remedy remedy) {
        super(th);
        this.mRemedy = remedy;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Application is in corrupt state. ");
        Remedy remedy = this.mRemedy;
        int ordinal = remedy.ordinal();
        if (ordinal != 1) {
            str = ordinal == 0 ? "Reinstall application." : "Reboot device. ";
            A0k.append("[ mRemedy = ");
            A0k.append(remedy);
            return AnonymousClass001.A0d(" ]", A0k);
        }
        A0k.append(str);
        A0k.append("[ mRemedy = ");
        A0k.append(remedy);
        return AnonymousClass001.A0d(" ]", A0k);
    }

    public Remedy getRemedy() {
        return this.mRemedy;
    }
}

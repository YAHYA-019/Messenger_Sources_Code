package com.facebook.common.dextricks;

import X.0Pz;
import com.facebook.common.dextricks.SuperpackInputDexIterator;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: DexIteratorFactory.class */
public class DexIteratorFactory {
    public static final String SECONDARY_XZS_FILENAME = "secondary.dex.jar.xzs";
    public static final String XZS_EXTENSION = ".dex.jar.xzs";
    public final ResProvider mResProvider;

    public DexIteratorFactory(ResProvider resProvider) {
        this.mResProvider = resProvider;
    }

    private SuperpackInputDexIterator openSuperpackDexIterator(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        SuperpackInputDexIterator.Builder builder = new SuperpackInputDexIterator.Builder(dexManifest, lightweightQuickPerformanceLogger);
        String archiveExtension = SuperpackInputDexIterator.getArchiveExtension(builder);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= dexManifest.superpackFiles) {
                break;
            }
            builder.addRawArchive(this.mResProvider.open(0Pz.A0d("store-", archiveExtension, i2)));
            i = i2 + 1;
        }
        for (int i3 = 0; i3 < dexManifest.dexes.length; i3++) {
            builder.assignDexToArchive(i3, i3 % dexManifest.superpackFiles);
        }
        return builder.build();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:6|(5:8|9|10|11|(18:13|14|15|16|17|18|19|(10:21|22|23|24|25|26|27|28|29|30)|31|32|33|34|35|36|37|38|39|40))|51|15|16|17|18|19|(0)|31|32|33|34|35|36|37|38|39|40) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.common.dextricks.InputDexIterator openDexIterator(java.lang.String r302, com.facebook.common.dextricks.DexManifest r303, com.facebook.quicklog.LightweightQuickPerformanceLogger r304, android.content.Context r305) {
        /*
            r301 = this;
            r0 = r303
            int r0 = r0.superpackFiles
            r306 = r0
            r0 = r306
            if (r0 <= 0) goto L12
            r0 = r301
            r1 = r303
            r2 = r304
            com.facebook.common.dextricks.SuperpackInputDexIterator r0 = r0.openSuperpackDexIterator(r1, r2)
            return r0
        L12:
            r0 = 0
            r307 = r0
            r0 = r302
            if (r0 == 0) goto L39
            java.lang.String r0 = "dex"
            r308 = r0
            r0 = r308
            r1 = r302
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lbc
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L39
            java.lang.String r0 = ".dex.jar.xzs"
            r308 = r0
            r0 = r302
            r1 = r308
            java.lang.String r0 = r0.concat(r1)     // Catch: java.lang.Throwable -> Lbc
            r309 = r0
            goto L3d
        L39:
            java.lang.String r0 = "secondary.dex.jar.xzs"
            r309 = r0
        L3d:
            r0 = r301
            com.facebook.common.dextricks.ResProvider r0 = r0.mResProvider     // Catch: java.io.FileNotFoundException -> L80 java.lang.Throwable -> Lbc
            r308 = r0
            r0 = r308
            r1 = r309
            java.io.InputStream r0 = r0.open(r1)     // Catch: java.io.FileNotFoundException -> L80 java.lang.Throwable -> Lbc
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L81
            java.lang.String r0 = "using solid xz dex store at %s"
            r310 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lad
            r1 = r0
            r2 = 0
            r3 = r309
            r1[r2] = r3     // Catch: java.lang.Throwable -> Lad
            r308 = r0
            r0 = r310
            r1 = r308
            com.facebook.common.dextricks.Mlog.v(r0, r1)     // Catch: java.lang.Throwable -> Lad
            r0 = r301
            com.facebook.common.dextricks.ResProvider r0 = r0.mResProvider     // Catch: java.lang.Throwable -> Lad
            r308 = r0
            com.facebook.common.dextricks.SolidXzInputDexIterator r0 = new com.facebook.common.dextricks.SolidXzInputDexIterator     // Catch: java.lang.Throwable -> Lad
            r310 = r0
            r0 = r310
            r1 = r303
            r2 = r304
            r3 = r308
            r4 = r307
            r0.<init>(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lad
            r0 = r310
            return r0
        L80:
        L81:
            java.lang.String r0 = "using discrete file inputs for store, no file at %s"
            r310 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lad
            r1 = r0
            r2 = 0
            r3 = r309
            r1[r2] = r3     // Catch: java.lang.Throwable -> Lad
            r308 = r0
            r0 = r310
            r1 = r308
            com.facebook.common.dextricks.Mlog.v(r0, r1)     // Catch: java.lang.Throwable -> Lad
            r0 = r301
            com.facebook.common.dextricks.ResProvider r0 = r0.mResProvider     // Catch: java.lang.Throwable -> Lad
            r308 = r0
            com.facebook.common.dextricks.DiscreteFileInputDexIterator r0 = new com.facebook.common.dextricks.DiscreteFileInputDexIterator     // Catch: java.lang.Throwable -> Lad
            r310 = r0
            r0 = r310
            r1 = r303
            r2 = r308
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lad
            r0 = r310
            return r0
        Lad:
            r308 = move-exception
            r0 = r307
            if (r0 == 0) goto Lbe
            r0 = r307
            com.facebook.common.dextricks.Fs.safeClose(r0)
            r0 = r308
            throw r0
        Lbc:
            r308 = move-exception
        Lbe:
            r0 = r308
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexIteratorFactory.openDexIterator(java.lang.String, com.facebook.common.dextricks.DexManifest, com.facebook.quicklog.LightweightQuickPerformanceLogger, android.content.Context):com.facebook.common.dextricks.InputDexIterator");
    }
}

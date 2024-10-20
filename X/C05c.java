package X;

import android.app.ActivityManager;
import android.content.Context;
import java.io.File;
import java.io.FileFilter;

/* renamed from: X.05c, reason: invalid class name */
/* loaded from: 05c.class */
public abstract class C05c {
    public static final FileFilter A00;

    static {
        final int i = 0;
        A00 = new FileFilter(i) { // from class: X.0oy
            public final int A00;

            {
                this.A00 = i;
            }

            @Override // java.io.FileFilter
            public boolean accept(File file) {
                switch (this.A00) {
                    case 0:
                        String name = file.getName();
                        if (!name.startsWith("cpu")) {
                            return false;
                        }
                        int i2 = 3;
                        while (true) {
                            int i3 = i2;
                            if (i3 >= name.length()) {
                                return true;
                            }
                            if (!Character.isDigit(name.charAt(i3))) {
                                return false;
                            }
                            i2 = i3 + 1;
                        }
                    case 1:
                        return file.getName().endsWith(".dmp");
                    default:
                        return false;
                }
            }
        };
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v2 ??, still in use, count: 3, list:
          (r309v2 ??) from 0x01ca: PHI (r309v1 ??) = (r309v0 ??), (r309v2 ??) binds: [B:123:?, B:23:0x005a] A[DONT_GENERATE, DONT_INLINE]
          (r309v2 ?? I:java.io.InputStream) from 0x005c: INVOKE (r309v2 ?? I:java.io.InputStream), (r0v95 ?? I:byte[]) VIRTUAL call: java.io.InputStream.read(byte[]):int A[Catch: all -> 0x01ca, NumberFormatException -> 0x01d9, MD:(byte[]):int throws java.io.IOException (c)]
          (r309v2 ?? I:java.io.InputStream) from 0x00a3: INVOKE (r309v2 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: IOException -> 0x01d6, MD:():void throws java.io.IOException (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static int A00() {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05c.A00():int");
    }

    public static int A01() {
        try {
            int A02 = A02("/sys/devices/system/cpu/possible");
            if (A02 == -1) {
                A02 = A02("/sys/devices/system/cpu/present");
            }
            if (A02 == -1) {
                A02 = AnonymousClass001.A0E("/sys/devices/system/cpu/").listFiles(A00).length;
            }
            return A02;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:41:0x0080
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static int A02(java.lang.String r301) {
        /*
            r0 = 0
            r302 = r0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L7c
            r303 = r0
            r0 = r303
            r1 = r301
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L7c
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L64 java.io.IOException -> L67 java.io.IOException -> L7c
            r302 = r0
            r0 = r302
            r1 = r303
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L67
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5d java.lang.Throwable -> L5d java.io.IOException -> L67 java.io.IOException -> L67
            r304 = r0
            r0 = r304
            r1 = r302
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L67
            r0 = r304
            java.lang.String r0 = r0.readLine()     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L67
            r302 = r0
            r0 = r304
            r0.close()     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L67
            r0 = r302
            if (r0 == 0) goto L53
            java.lang.String r0 = "0-[\\d]+$"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.matches(r1)     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L67
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L53
            r0 = 2
            r305 = r0
            r0 = r302
            r1 = r305
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L67
            r304 = r0
            r0 = r304
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L67
            r304 = r0
            r0 = r304
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L67
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            goto L56
        L53:
            r0 = -1
            r305 = r0
        L56:
            r0 = r303
            r0.close()     // Catch: java.io.IOException -> L80
            r0 = r305
            return r0
        L5d:
            r304 = move-exception
            r0 = r303
            r0.close()     // Catch: java.io.IOException -> L78
            r0 = r304
            throw r0
        L64:
            r304 = move-exception
        L65:
            r0 = r304
            throw r0
        L67:
            r0 = r303
            r302 = r0
        L6a:
            r0 = -1
            r305 = r0
            r0 = r302
            if (r0 == 0) goto L75
            r0 = r302
            r0.close()     // Catch: java.io.IOException -> L80
        L75:
            r0 = r305
            return r0
        L78:
            goto L65
        L7c:
            goto L6a
        L80:
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05c.A02(java.lang.String):int");
    }

    public static long A03(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}

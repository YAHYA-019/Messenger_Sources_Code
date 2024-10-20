package X;

import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* loaded from: Lrj.class */
public abstract class Lrj implements Runnable, Delayed {
    public static final String __redex_internal_original_name = "GrandCentralDispatch$Dispatchable";
    public long A00;
    public long A01;
    public String A02;

    public void A00() {
        if (this instanceof JlU) {
            ((JlU) this).A05.A04();
        } else if (this instanceof JlV) {
            C41z.A0B.release();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v4 long, still in use, count: 2, list:
          (r304v4 long) from 0x005d: PHI (r304v2 long) = (r304v1 long), (r304v4 long) binds: [B:15:0x0057, B:6:0x0043] A[DONT_GENERATE, DONT_INLINE]
          (r304v4 long) from 0x0040: CMP_L (r304v4 long), (0 long) A[WRAPPED]
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
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed r302) {
        /*
            r301 = this;
            r0 = r302
            java.util.concurrent.Delayed r0 = (java.util.concurrent.Delayed) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0 instanceof X.Lrj
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L68
            r0 = r302
            X.Lrj r0 = (X.Lrj) r0
            r302 = r0
            r0 = r301
            long r0 = r0.A01
            r304 = r0
            r0 = r302
            long r0 = r0.A01
            r306 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r309 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4c
            r0 = r301
            long r0 = r0.A00
            r304 = r0
            r0 = r302
            long r0 = r0.A00
            r306 = r0
            r0 = r304
            r1 = r306
            long r0 = r0 - r1
            r304 = r0
            r0 = r304
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = r303
            if (r0 <= 0) goto L5d
        L46:
            r0 = -1
            r308 = r0
        L49:
            r0 = r308
            return r0
        L4c:
            r0 = r304
            r1 = r306
            long r0 = r0 - r1
            r304 = r0
            r0 = r304
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = r303
            if (r0 >= 0) goto L5d
            goto L46
        L5d:
            r0 = r304
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L49
            r0 = 1
            return r0
        L68:
            java.lang.String r0 = "Comparing a Dispatchable to a non-Dispatchable."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0L(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lrj.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof Lrj)) {
                return false;
            }
            Lrj lrj = (Lrj) obj;
            if (this.A00 == lrj.A00) {
                String str = this.A02;
                String str2 = lrj.A02;
                if (str != null ? str.equals(str2) : str2 == null) {
                    if (this.A01 == lrj.A01) {
                        return true;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01 - SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v0 ??, still in use, count: 15, list:
          (r304v0 ??) from 0x09e3: PHI (r304v1 ??) = (r304v0 ??), (r304v2 ??) binds: [B:389:0x092f, B:169:0x09e0] A[DONT_GENERATE, DONT_INLINE]
          (r304v0 ?? I:X.Li6) from 0x05c2: IGET (r0v170 ?? I:java.io.File) = (r304v0 ?? I:X.Li6) A[Catch: IOException -> 0x0a19] X.Li6.A08 java.io.File
          (r304v0 ?? I:X.Li6) from 0x0613: INVOKE (r0v200 ?? I:X.Li1), (r304v0 ?? I:X.Li6), (r0v197 ?? I:java.io.InputStream), (r0v199 ?? I:java.nio.charset.Charset) DIRECT call: X.Li1.<init>(X.Li6, java.io.InputStream, java.nio.charset.Charset):void A[Catch: IOException -> 0x096c, MD:(X.Li6, java.io.InputStream, java.nio.charset.Charset):void (m)]
          (r304v0 ?? I:X.Li6) from 0x06f4: IGET (r0v394 ?? I:java.util.LinkedHashMap) = (r304v0 ?? I:X.Li6) A[Catch: all -> 0x0962, EOFException -> 0x0a6d] X.Li6.A0A java.util.LinkedHashMap
          (r304v0 ?? I:X.Li6) from 0x070f: IGET (r0v315 ?? I:java.util.LinkedHashMap) = (r304v0 ?? I:X.Li6) A[Catch: all -> 0x0962, EOFException -> 0x0a6d] X.Li6.A0A java.util.LinkedHashMap
          (r304v0 ?? I:X.Li6) from 0x0733: INVOKE (r329v5 ?? I:X.Kro), (r304v0 ?? I:X.Li6), (r2v10 ?? I:java.lang.String) DIRECT call: X.Kro.<init>(X.Li6, java.lang.String):void A[Catch: all -> 0x0962, EOFException -> 0x0a6d, MD:(X.Li6, java.lang.String):void (m)]
          (r304v0 ?? I:X.Li6) from 0x07ee: INVOKE (r0v334 ?? I:X.KqF), (r1v56 ?? I:X.Kro), (r304v0 ?? I:X.Li6) DIRECT call: X.KqF.<init>(X.Kro, X.Li6):void A[Catch: all -> 0x0962, EOFException -> 0x0a6d]
          (r304v0 ?? I:X.Li6) from 0x085d: IGET (r0v247 ?? I:java.util.LinkedHashMap) = (r304v0 ?? I:X.Li6) A[Catch: all -> 0x0962] X.Li6.A0A java.util.LinkedHashMap
          (r304v0 ?? I:X.Li6) from 0x0871: IPUT (r0v251 ?? I:int), (r304v0 ?? I:X.Li6) A[Catch: all -> 0x0962] X.Li6.A00 int
          (r304v0 ?? I:X.Li6) from 0x087a: IGET (r0v255 ?? I:java.io.File) = (r304v0 ?? I:X.Li6) A[Catch: IOException -> 0x096c] X.Li6.A09 java.io.File
          (r304v0 ?? I:X.Li6) from 0x08b7: IGET (r0v278 ?? I:long) = (r304v0 ?? I:X.Li6) A[Catch: IOException -> 0x096c] X.Li6.A02 long
          (r304v0 ?? I:X.Li6) from 0x08d3: IPUT (r0v284 ?? I:long), (r304v0 ?? I:X.Li6) A[Catch: IOException -> 0x096c] X.Li6.A02 long
          (r304v0 ?? I:X.Li6) from 0x0931: IPUT (r0v266 ?? I:java.io.Writer), (r304v0 ?? I:X.Li6) A[Catch: IOException -> 0x096c] X.Li6.A03 java.io.Writer
          (r304v0 ?? I:X.Li6) from 0x09bf: INVOKE (r304v0 ?? I:X.Li6) VIRTUAL call: X.Li6.close():void A[Catch: IOException -> 0x0a19, MD:():void (m)]
          (r304v0 ?? I:X.Li6) from 0x09c3: IGET (r0v195 ?? I:java.io.File) = (r304v0 ?? I:X.Li6) A[Catch: IOException -> 0x0a19] X.Li6.A07 java.io.File
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
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 2677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lrj.run():void");
    }
}

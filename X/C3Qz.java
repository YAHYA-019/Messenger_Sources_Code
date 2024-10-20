package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.3Qz, reason: invalid class name */
/* loaded from: 3Qz.class */
public final class C3Qz {
    public Context A00;
    public 3Mi A01;
    public C2tt A02;
    public String A03;
    public HashMap A05 = AnonymousClass001.A0u();
    public HashMap A04 = AnonymousClass001.A0u();

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v58 java.lang.Integer, still in use, count: 2, list:
          (r303v58 java.lang.Integer) from 0x063b: PHI (r303v56 java.lang.Integer) = (r303v58 java.lang.Integer) binds: [B:100:0x0638] A[DONT_GENERATE, DONT_INLINE]
          (r303v58 java.lang.Integer) from 0x0638: IF  (r303v58 java.lang.Integer) != (null java.lang.Integer)  -> B:101:0x063b A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
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
    public C3Qz(android.content.Context r302) {
        /*
            Method dump skipped, instructions count: 1910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Qz.<init>(android.content.Context):void");
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "FACEBOOK_PRELOAD_PROGRAM";
            case 2:
                return "DEPRECATED_FACEBOOK_DEVICE_OWNER";
            case 3:
                return "OCULUS";
            case 4:
                return "TRITIUM";
            default:
                return "NONE";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r305 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r0.A01 < 6) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A01() {
        /*
            r301 = this;
            r0 = 6
            r302 = r0
            r0 = r301
            java.lang.String r0 = r0.A03
            r303 = r0
            r0 = r303
            if (r0 != 0) goto Lc7
            r0 = r301
            X.2tt r0 = r0.A02
            r304 = r0
            r0 = r304
            X.2tp r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L38
            r0 = r305
            boolean r0 = r0.A07
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L38
            r0 = r305
            int r0 = r0.A01
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            r1 = r302
            if (r0 >= r1) goto L3d
        L38:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L3d:
            r0 = 0
            r303 = r0
            r0 = r306
            if (r0 == 0) goto Lc7
            r0 = r301
            android.content.Context r0 = r0.A00
            r304 = r0
            r0 = r304
            android.content.ContentResolver r0 = r0.getContentResolver()
            r305 = r0
            android.net.Uri r0 = X.3IO.A01     // Catch: java.lang.Throwable -> L9b java.lang.SecurityException -> Lb4
            r308 = r0
            r0 = 1273245501(0x4be42f3d, float:2.9908602E7)
            r309 = r0
            r0 = r305
            r1 = r308
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r309
            android.database.Cursor r0 = X.0L0.A01(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9b java.lang.SecurityException -> Lb4
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lc7
            r0 = r305
            boolean r0 = r0.moveToFirst()     // Catch: java.lang.Throwable -> La5 java.lang.SecurityException -> Lc9
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lc0
            java.lang.String r0 = "attribution_json"
            r304 = r0
            r0 = r305
            r1 = r304
            int r0 = r0.getColumnIndex(r1)     // Catch: java.lang.Throwable -> La5 java.lang.SecurityException -> Lc9
            r306 = r0
            r0 = r306
            if (r0 < 0) goto Lc0
            r0 = r305
            r1 = r306
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> La5 java.lang.SecurityException -> Lc9
            r303 = r0
            goto Lc0
        L9b:
            r304 = move-exception
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
            goto La6
        La5:
            r304 = move-exception
        La6:
            r0 = r305
            if (r0 == 0) goto Lb2
            r0 = r305
            r0.close()
        Lb2:
            r0 = r304
            throw r0
        Lb4:
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
        Lbb:
            r0 = r305
            if (r0 == 0) goto Lc7
        Lc0:
            r0 = r305
            r0.close()
        Lc7:
            r0 = r303
            return r0
        Lc9:
            goto Lbb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Qz.A01():java.lang.String");
    }
}

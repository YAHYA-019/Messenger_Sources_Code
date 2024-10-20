package com.facebook.http.historical;

import X.0Pz;
import X.5Me;
import X.5Mf;
import X.AnonymousClass001;
import android.os.SystemClock;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: NetworkInfoMap.class */
public final class NetworkInfoMap {
    public static final NetworkInfoMap A08 = new NetworkInfoMap();
    public 5Mf A02;
    public boolean A03;
    public boolean A05;
    public String A06;
    public 5Me A01 = null;
    public final LruCache A07 = new LruCache(20);
    public long A00 = 0;
    public boolean A04 = false;

    public NetworkInfoMap() {
        if (this.A01 != null) {
            A01();
        }
    }

    private ArrayList A00() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            Iterator it = this.A07.snapshot().entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((5Mf) ((Map.Entry) it.next()).getValue()).toString());
            }
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v12 ??, still in use, count: 8, list:
          (r310v12 ??) from 0x00ce: PHI (r310v3 ??) = (r310v0 ??), (r310v12 ??), (r310v12 ??) binds: [B:202:0x00c2, B:183:0x00a0, B:172:0x008f] A[DONT_GENERATE, DONT_INLINE]
          (r310v12 ??) from 0x010c: PHI (r310v4 ??) = (r310v1 ??), (r310v12 ??), (r310v12 ??) binds: [B:200:0x0100, B:181:0x00b6, B:169:0x0099] A[DONT_GENERATE, DONT_INLINE]
          (r310v12 ??) from 0x00ed: PHI (r310v6 ??) = (r310v2 ??), (r310v12 ??), (r310v12 ??) binds: [B:198:0x00e1, B:179:0x00ab, B:164:0x0094] A[DONT_GENERATE, DONT_INLINE]
          (r310v12 ??) from 0x00ce: PHI (r310v3 ??) = (r310v0 ??), (r310v12 ??), (r310v12 ??) binds: [B:202:0x00c2, B:183:0x00a0, B:172:0x008f] A[DONT_GENERATE, DONT_INLINE]
          (r310v12 ??) from 0x010c: PHI (r310v4 ??) = (r310v1 ??), (r310v12 ??), (r310v12 ??) binds: [B:200:0x0100, B:181:0x00b6, B:169:0x0099] A[DONT_GENERATE, DONT_INLINE]
          (r310v12 ??) from 0x00ed: PHI (r310v6 ??) = (r310v2 ??), (r310v12 ??), (r310v12 ??) binds: [B:198:0x00e1, B:179:0x00ab, B:164:0x0094] A[DONT_GENERATE, DONT_INLINE]
          (r310v12 ??) from 0x011f: PHI (r310v9 ??) = (r310v5 ??), (r310v12 ??) binds: [B:168:0x011c, B:27:0x0081] A[DONT_GENERATE, DONT_INLINE]
          (r310v12 ?? I:java.util.AbstractCollection) from 0x0088: INVOKE (r310v12 ?? I:java.util.AbstractCollection), (r0v259 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: SecurityException -> 0x008f, IOException -> 0x0094, NullPointerException -> 0x0099, all -> 0x045f, MD:(E):boolean (c)]
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
    /* JADX WARN: Not initialized variable reg: 313, insn: 0x0461: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r313 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:186:0x0461 */
    private void A01() {
        /*
            Method dump skipped, instructions count: 1149
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.http.historical.NetworkInfoMap.A01():void");
    }

    public void A02(long j, long j2, long j3) {
        synchronized (this) {
            String str = this.A06;
            if (str != null) {
                5Mf r0 = new 5Mf(str, j, j2, SystemClock.elapsedRealtime(), j3);
                this.A02 = r0;
                this.A07.put(str, r0);
                5Me r02 = this.A01;
                if (r02 != null && (this.A04 || SystemClock.elapsedRealtime() - this.A00 >= 120000)) {
                    r02.A00(A00());
                    this.A00 = SystemClock.elapsedRealtime();
                    if (this.A03) {
                        AnonymousClass001.A1G("Writing cached bwe to disk: %s for network: %s", "com.facebook.http.historical.NetworkInfoMap", new Object[]{this.A02, this.A06});
                    }
                    this.A04 = false;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r0) >= 120000) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.http.historical.NetworkInfoMap.A03(java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.5Me] */
    public void A04(String str, String str2) {
        synchronized (this) {
            if (this.A01 == null) {
                String A0W = 0Pz.A0W(str, "/http/historical/");
                ?? obj = new Object();
                ((5Me) obj).A00 = A0W;
                ((5Me) obj).A01 = str2;
                this.A01 = obj;
                if (this.A03) {
                    AnonymousClass001.A1G("Initializing NetworkInfoMap with dir: %s filename: %s", "com.facebook.http.historical.NetworkInfoMap", new Object[]{str, str2});
                }
                A01();
            }
        }
    }
}

package com.facebook.storage.bigfoot.apps.fbapps;

import X.1BQ;
import X.1BV;
import X.1G0;
import X.1G2;
import X.1Ql;
import X.2HT;
import X.4rQ;
import X.C00i;
import X.C09934rx;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.prefs.shared.FbSharedPreferences;
import org.json.JSONException;

/* loaded from: FBAppsAvailableSpaceMonitor.class */
public final class FBAppsAvailableSpaceMonitor implements 4rQ, 2HT {
    public static final 1G2 A04 = 1G0.A00.A0D("bigfoot/available_space_monitor/device_data.v1");
    public C09934rx A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;

    public FBAppsAvailableSpaceMonitor() {
        this.A02 = new 1BQ(16657);
        this.A03 = new 1BQ(33013);
        this.A01 = new 1BV(33253);
    }

    public FBAppsAvailableSpaceMonitor(int i) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v4 ??, still in use, count: 11, list:
          (r308v4 ??) from 0x0130: PHI (r308v3 ??) = (r308v2 ??), (r308v4 ??) binds: [B:60:0x0125, B:50:0x011e] A[DONT_GENERATE, DONT_INLINE]
          (r308v4 ?? I:X.4rx) from 0x0070: IPUT (r0v44 ?? I:long), (r308v4 ?? I:X.4rx) A[Catch: JSONException -> 0x0125] X.4rx.A07 long
          (r308v4 ?? I:X.4rx) from 0x0082: IPUT (r0v48 ?? I:long), (r308v4 ?? I:X.4rx) A[Catch: JSONException -> 0x0125] X.4rx.A00 long
          (r308v4 ?? I:X.4rx) from 0x009a: IPUT (r0v54 ?? I:long), (r308v4 ?? I:X.4rx) A[Catch: JSONException -> 0x0125] X.4rx.A08 long
          (r308v4 ?? I:X.4rx) from 0x00af: IPUT (r0v58 ?? I:long), (r308v4 ?? I:X.4rx) A[Catch: JSONException -> 0x0125] X.4rx.A06 long
          (r308v4 ?? I:X.4rx) from 0x00c4: IPUT (r0v62 ?? I:long), (r308v4 ?? I:X.4rx) A[Catch: JSONException -> 0x0125] X.4rx.A02 long
          (r308v4 ?? I:X.4rx) from 0x00d7: IPUT (r0v66 ?? I:long), (r308v4 ?? I:X.4rx) A[Catch: JSONException -> 0x0125] X.4rx.A01 long
          (r308v4 ?? I:X.4rx) from 0x00e9: IPUT (r0v70 ?? I:long), (r308v4 ?? I:X.4rx) A[Catch: JSONException -> 0x0125] X.4rx.A09 long
          (r308v4 ?? I:X.4rx) from 0x00fb: IPUT (r0v74 ?? I:long), (r308v4 ?? I:X.4rx) A[Catch: JSONException -> 0x0125] X.4rx.A04 long
          (r308v4 ?? I:X.4rx) from 0x010d: IPUT (r0v78 ?? I:long), (r308v4 ?? I:X.4rx) A[Catch: JSONException -> 0x0125] X.4rx.A05 long
          (r308v4 ?? I:X.4rx) from 0x011f: IPUT (r0v82 ?? I:long), (r308v4 ?? I:X.4rx) A[Catch: JSONException -> 0x0125] X.4rx.A03 long
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
    private X.C09934rx A00() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.storage.bigfoot.apps.fbapps.FBAppsAvailableSpaceMonitor.A00():X.4rx");
    }

    private void A01() {
        1Ql edit = ((FbSharedPreferences) this.A03.get()).edit();
        edit.Cdj(A04);
        edit.commit();
    }

    public String BXf() {
        return "asm";
    }

    public void CSW(long j) {
        synchronized (this) {
            C09934rx c09934rx = this.A00;
            if (c09934rx == null) {
                c09934rx = A00();
            }
            this.A00 = c09934rx;
            long j2 = c09934rx.A00;
            long j3 = c09934rx.A07;
            long j4 = j2 * j3;
            long j5 = 1;
            long j6 = j3 + 1;
            c09934rx.A07 = j6;
            c09934rx.A00 = (j4 + j) / j6;
            long j7 = c09934rx.A08;
            c09934rx.A08 = j7 < 0 ? j : Math.min(j7, j);
            long j8 = c09934rx.A06;
            c09934rx.A06 = j8 < 0 ? j : Math.max(j8, j);
            long j9 = c09934rx.A02;
            if (j9 < 0) {
                j9 = System.currentTimeMillis();
            }
            c09934rx.A02 = j9;
            long j10 = c09934rx.A01;
            if (j10 < 0) {
                j10 = j;
            }
            c09934rx.A01 = j10;
            c09934rx.A09 = j;
            c09934rx.A04 += j < 209715200 ? 1L : 0L;
            c09934rx.A05 += j < OdexSchemeArtXdex.MIN_DISK_FREE_FOR_MIXED_MODE ? 1L : 0L;
            long j11 = c09934rx.A03;
            if (j >= 1073741824) {
                j5 = 0;
            }
            c09934rx.A03 = j11 + j5;
            try {
                1Ql edit = ((FbSharedPreferences) this.A03.get()).edit();
                edit.CaL(A04, c09934rx.D4Q().toString());
                edit.commit();
            } catch (JSONException unused) {
                A01();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v2 ??, still in use, count: 2, list:
          (r309v2 ??) from 0x004e: PHI (r309v1 ??) = (r309v0 ??), (r309v2 ??) binds: [B:24:0x004b, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]
          (r309v2 ?? I:java.util.AbstractMap) from 0x0044: INVOKE (r309v2 ?? I:java.util.AbstractMap), (r0v20 ?? I:java.lang.Object), (r0v4 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0053, MD:(K, V):V (c)]
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
    public java.util.HashMap CZY() {
        /*
            r301 = this;
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            X.4rx r0 = r0.A00()     // Catch: java.lang.Throwable -> L53
            r302 = r0
            r0 = r302
            long r0 = r0.A07     // Catch: java.lang.Throwable -> L53
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = r307
            if (r0 > 0) goto L1d
            goto L4b
        L1d:
            X.4rx r0 = new X.4rx     // Catch: java.lang.Throwable -> L53
            r308 = r0
            r0 = r308
            r0.<init>()     // Catch: java.lang.Throwable -> L53
            r0 = r301
            r1 = r308
            r0.A00 = r1     // Catch: java.lang.Throwable -> L53
            r0 = r301
            r0.A01()     // Catch: java.lang.Throwable -> L53
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L53 java.lang.Throwable -> L53
            r309 = r0
            r0 = r309
            r0.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = "device"
            r308 = r0
            r0 = r309
            r1 = r308
            r2 = r302
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L53
            goto L4e
        L4b:
            r0 = 0
            r309 = r0
        L4e:
            r0 = r301
            monitor-exit(r0)
            r0 = r309
            return r0
        L53:
            r308 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r308
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.storage.bigfoot.apps.fbapps.FBAppsAvailableSpaceMonitor.CZY():java.util.HashMap");
    }
}

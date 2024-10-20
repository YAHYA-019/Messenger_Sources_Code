package com.facebook.browser.lite;

import X.0FI;
import X.11T;
import X.1BK;
import X.4YW;
import X.C00m;
import X.GOq;
import X.GjM;
import X.I7O;
import X.L0U;
import X.LDF;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.litho.LithoView;
import com.facebook.privacy.zone.policy.ZonePolicy;
import kotlin.jvm.functions.Function1;

/* loaded from: RecentTabsActivity.class */
public final class RecentTabsActivity extends FbFragmentActivity {
    public RecyclerView A00;
    public LithoView A01;
    public String A02;
    public String A03;
    public final L0U A04;
    public final I7O A05;
    public final C00m A06;
    public final Function1 A07;
    public final Function1 A08;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v8 ??, still in use, count: 2, list:
          (r302v8 ??) from 0x004c: PHI (r302v3 ??) = (r302v2 ??), (r302v8 ??) binds: [B:6:0x0038, B:11:0x0049] A[DONT_GENERATE, DONT_INLINE]
          (r302v8 ?? I:X.I7O) from 0x0049: SPUT (r302v8 ?? I:X.I7O) A[Catch: all -> 0x0093] X.I7O.A04 X.I7O
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
    public RecentTabsActivity() {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            java.lang.String r0 = ""
            r302 = r0
            r0 = r301
            r1 = r302
            r0.A02 = r1
            r0 = r301
            r1 = r302
            r0.A03 = r1
            X.HGU r0 = X.I7O.A05
            r303 = r0
            X.LAK r0 = new X.LAK
            r304 = r0
            r0 = r304
            r0.<init>()
            X.LDF r0 = X.LDF.A00()
            r305 = r0
            X.J92 r0 = X.J92.A00
            r306 = r0
            r0 = 2
            r307 = r0
            r0 = r306
            r1 = r307
            X.11T.A0F(r0, r1)
            r0 = r303
            monitor-enter(r0)
            X.I7O r0 = X.I7O.A04     // Catch: java.lang.Throwable -> L93
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L4c
            X.I7O r0 = new X.I7O     // Catch: java.lang.Throwable -> L93
            r302 = r0
            r0 = r302
            r1 = r305
            r2 = r304
            r3 = r306
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L93
            r0 = r302
            X.I7O.A04 = r0     // Catch: java.lang.Throwable -> L93
        L4c:
            r0 = r303
            monitor-exit(r0)
            r0 = r301
            r1 = r302
            r0.A05 = r1
            X.L0U r0 = new X.L0U
            r302 = r0
            r0 = r302
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r302
            r0.A04 = r1
            X.M6z r0 = new X.M6z
            r302 = r0
            r0 = r302
            r1 = r301
            r2 = 48
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r302
            r0.A08 = r1
            X.J8q r0 = new X.J8q
            r302 = r0
            r0 = r302
            r1 = r301
            r2 = 5
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r302
            r0.A06 = r1
            X.M6z r0 = new X.M6z
            r302 = r0
            r0 = r302
            r1 = r301
            r2 = 45
            r0.<init>(r1, r2)
            r0 = r301
            r1 = r302
            r0.A07 = r1
            return
        L93:
            r302 = move-exception
            r0 = r303
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.RecentTabsActivity.<init>():void");
    }

    public static final void A12(RecentTabsActivity recentTabsActivity) {
        I7O i7o = recentTabsActivity.A05;
        int A04 = GOq.A04();
        String str = recentTabsActivity.A02;
        11T.A0F(str, 1);
        String[] strArr = {"IABTabs.recentTabs.backPress", "IABTabs.recentTabs.End"};
        int i = 0;
        do {
            i7o.A02.A03(strArr[i]);
            i++;
        } while (i < 2);
        I7O.A00(i7o, new GjM(A04, "", str), "ACTION_CLOSE_TAB_SWITCHER", "CALL_EXTENSION_BROWSER_TABS_CLOSE", true);
        recentTabsActivity.finish();
    }

    public static final void A15(RecentTabsActivity recentTabsActivity, String str, String str2) {
        LDF.A00().A0A(1BK.A05(), ZonePolicy.A03, str2, 4YW.A0A("iaw_session_id", recentTabsActivity.A02, 1BK.A1G("action", str)));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0544  */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.RecentTabsActivity.A2y(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r0.equals("RECENT_TABS_AUTO_CLOSE_ALL") == false) goto L6;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void finish() {
        /*
            r301 = this;
            r0 = r301
            r302 = r0
            r0 = r301
            android.content.Intent r0 = r0.getIntent()
            r303 = r0
            java.lang.String r0 = "RECENT_TABS_AUTO_CLOSE_ALL"
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.String r0 = r0.getStringExtra(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L23
            r0 = r303
            r1 = r304
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L84
        L23:
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
            X.LEJ r0 = X.LEJ.A00()
            r303 = r0
            r0 = r303
            X.Jt1 r0 = r0.A01
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L84
            r0 = r308
            java.lang.String r0 = r0.A05
            r304 = r0
            r0 = r301
            java.lang.String r0 = r0.A03
            r303 = r0
            r0 = r304
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L84
            X.LEJ r0 = X.LEJ.A00()
            r309 = r0
            java.lang.Integer r0 = X.0S2.A00
            r310 = r0
            r0 = r308
            java.lang.String r0 = r0.A0A
            r311 = r0
            r0 = r301
            java.lang.String r0 = r0.A02
            r312 = r0
            r0 = r308
            java.lang.String r0 = r0.A05
            r313 = r0
            r0 = r308
            java.lang.String r0 = r0.A09
            r314 = r0
            r0 = r309
            r1 = r302
            r2 = r310
            r3 = r311
            r4 = r312
            r5 = r313
            r6 = r314
            r0.A0H(r1, r2, r3, r4, r5, r6)
        L84:
            android.os.Bundle r0 = X.1BK.A05()
            r309 = r0
            int r0 = X.GOq.A04()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r304 = r0
            java.lang.String r0 = "tab_count"
            r1 = r304
            X.03Y r0 = X.1BK.A1G(r0, r1)
            r308 = r0
            r0 = r306
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r304 = r0
            java.lang.String r0 = "tabs_close_browser_on_back"
            r1 = r304
            r2 = r308
            X.03Y[] r0 = X.7zO.A1b(r0, r1, r2)
            java.util.HashMap r0 = X.04R.A05(r0)
            r307 = r0
            X.LDF r0 = X.LDF.A00()
            r308 = r0
            com.facebook.privacy.zone.policy.ZonePolicy r0 = com.facebook.privacy.zone.policy.ZonePolicy.A03
            r304 = r0
            r0 = r308
            r1 = r309
            r2 = r304
            java.lang.String r3 = "BROWSER_TABS_CLOSE"
            r4 = r307
            r0.A09(r1, r2, r3, r4)
            r0 = r301
            super.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.RecentTabsActivity.finish():void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(-1990199963);
        super.onResume();
        this.A05.A02.A03(new String[]{"IABTabs.recentTabs.Resume"}[0]);
        0FI.A07(-551133519, A00);
    }
}

package com.facebook.messaging.auth;

import X.0FI;
import X.0S2;
import X.1BJ;
import X.1BQ;
import X.1BV;
import X.1G0;
import X.1G2;
import X.1G3;
import X.1iF;
import X.1lN;
import X.AbH;
import X.AbJ;
import X.AbK;
import X.C00i;
import X.C1io;
import X.C1kx;
import X.C1xf;
import android.os.Bundle;
import com.facebook.auth.login.ui.LogoutFragment;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: LaunchScreenActivity.class */
public class LaunchScreenActivity extends FbFragmentActivity implements 1lN, C1xf, C1io, C1kx {
    public static final 1G2 A08 = 1G3.A01(1G0.A04, "reached_neue_activity/");
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public boolean A05;
    public final C00i A06 = 1BQ.A02(100109);
    public final C00i A07 = 1BV.A00(16749);
    public boolean A04 = false;

    private boolean A12() {
        getIntent();
        boolean z = false;
        String stringExtra = getIntent().getStringExtra(1BJ.A00(208));
        if (stringExtra != null && LogoutFragment.class.getName().equals(stringExtra)) {
            z = true;
        }
        return z;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbK.A0F();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A01 = AbH.A0S();
        this.A03 = AbH.A0P();
        this.A00 = AbH.A0a();
        this.A02 = 1BV.A00(32994);
        if (bundle != null) {
            this.A05 = bundle.getBoolean("launch_completed");
        }
        if (this.A05) {
            finish();
        }
    }

    public String AWg() {
        return "start_screen_config";
    }

    @Override // X.C1xf
    public Integer Ac6() {
        return 0S2.A0N;
    }

    public Long Am7() {
        return AbJ.A0v();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("launch_completed", this.A05);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v45 ??, still in use, count: 2, list:
          (r307v45 ??) from 0x03df: PHI (r307v43 ??) = (r307v42 ??), (r307v45 ??) binds: [B:73:0x03bc, B:79:0x03da] A[DONT_GENERATE, DONT_INLINE]
          (r307v45 ?? I:X.15h) from 0x03dc: IPUT (r307v45 ?? I:X.15h), (r0v206 ?? I:X.CEi) A[Catch: Exception -> 0x0716, all -> 0x0730] X.CEi.A03 X.15h
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
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        /*
            Method dump skipped, instructions count: 1944
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.auth.LaunchScreenActivity.onStart():void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(-292122177);
        super.onStop();
        if (this.A05) {
            finish();
        }
        0FI.A07(-663932020, A00);
    }
}

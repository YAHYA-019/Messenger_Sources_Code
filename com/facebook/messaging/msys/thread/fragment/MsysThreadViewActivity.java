package com.facebook.messaging.msys.thread.fragment;

import X.04R;
import X.06Z;
import X.0Gm;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Fv;
import X.1Kd;
import X.1Lm;
import X.1pH;
import X.2LI;
import X.2LK;
import X.2M3;
import X.2Oe;
import X.2Of;
import X.2Oi;
import X.4YT;
import X.4YU;
import X.4aS;
import X.5SW;
import X.6Sh;
import X.70G;
import X.7hZ;
import X.7zK;
import X.7zM;
import X.7zU;
import X.AbF;
import X.AnonymousClass001;
import X.AnonymousClass046;
import X.C06c;
import X.C1lM;
import X.C3Qg;
import X.C6rh;
import X.C81n;
import X.CfA;
import X.CfB;
import X.D4H;
import X.InterfaceC00633oW;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.util.Either;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.bubbles.activity.StaxThreadViewBubblesActivity;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.RegularImmutableMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: MsysThreadViewActivity.class */
public class MsysThreadViewActivity extends FbFragmentActivity implements 2Of, 2LI, C1lM, 2LK, 2Oi {
    public static final C3Qg A00 = new Object();
    public 1pH contentViewManager;
    public ThreadKey threadKey;
    public 5SW threadViewSource;
    public final InterfaceC00633oW handleNoMoreContentViews = new CfA(this, 6);
    public final 1Br analyticsDataProvider$delegate = 1Bu.A00(66967);
    public final 1Br unexpectedEventReporter$delegate = 1Bu.A00(16669);
    public final 1Br mobileConfig$delegate = 1BK.A0C();
    public HeterogeneousMap threadInitParamsMetadata = AbF.A0z();
    public final 2M3 cvmViewProvider = new CfB(this, 1);
    public final 1Br fbUserSessionManager$delegate = 7zM.A0Y();

    public static final void A12(Intent intent, MsysThreadViewActivity msysThreadViewActivity) {
        ArrayList arrayList;
        Either either;
        long longExtra = intent.getLongExtra("anchored_message_pk", -1);
        String stringExtra = intent.getStringExtra(7zK.A00(81));
        Serializable serializableExtra = intent.getSerializableExtra(1BJ.A00(1541));
        Either either2 = null;
        if (serializableExtra instanceof ArrayList) {
            arrayList = (ArrayList) serializableExtra;
            if (arrayList != null) {
                if (longExtra > 0) {
                    either = new Either(null, Long.valueOf(longExtra), false);
                } else {
                    if (stringExtra == null) {
                        throw AnonymousClass001.A0L("Matched ranges provided for anchored message but no message ID or PK");
                    }
                    either = new Either(stringExtra, null, true);
                }
                either2 = either;
            }
        } else {
            arrayList = null;
        }
        Fragment A002 = C6rh.A00(either2, msysThreadViewActivity.threadKey, msysThreadViewActivity.threadViewSource, msysThreadViewActivity.threadInitParamsMetadata, arrayList, R.id.content);
        if (intent.getBooleanExtra(7zK.A00(302), false)) {
            A002.AQN(70G.A00);
        }
        String A003 = 4YT.A00(47);
        if (intent.getBooleanExtra(A003, false)) {
            Bundle bundle = A002.mArguments;
            if (bundle == null) {
                bundle = 1BK.A05();
            }
            bundle.putBoolean(A003, true);
            A002.setArguments(bundle);
        }
        if (msysThreadViewActivity instanceof StaxThreadViewBubblesActivity) {
            StaxThreadViewBubblesActivity staxThreadViewBubblesActivity = (StaxThreadViewBubblesActivity) msysThreadViewActivity;
            ((2Oe) A002).dismissibleFragmentDelegate = staxThreadViewBubblesActivity.dismissibleFragmentDelegate;
            C06c A0D = 7zU.A0D(staxThreadViewBubblesActivity);
            A0D.A0L(A002, R.id.content);
            A0D.A06();
            return;
        }
        try {
            1pH r0 = msysThreadViewActivity.contentViewManager;
            if (r0 == null) {
                11T.A0L("contentViewManager");
                throw 0Q8.createAndThrow();
            }
            r0.Cfr(A002, 1BJ.A00(494));
        } catch (IllegalStateException e) {
            0fH.A0r("MsysThreadViewActivity", "Fragment update error: ", e);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1pH r0 = this.contentViewManager;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        r0.A06();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        06Z BDe = BDe();
        View AUH = this.cvmViewProvider.AUH();
        11T.A0I(AUH, 7zK.A00(0));
        this.contentViewManager = 1pH.A02((ViewGroup) AUH, BDe(), this.handleNoMoreContentViews, false);
        if (BDe.A0Y(R.id.content) == null) {
            if (1Br.A07(this.mobileConfig$delegate).AZk(36320592805641783L) && this.threadKey == null) {
                0fH.A0k("MsysThreadViewActivity", "Exiting because MTV activity launched without thread key");
                ((AnonymousClass046) 1Br.A0B(this.unexpectedEventReporter$delegate)).ACu("no thread key", 408162302).report();
                Context A0B = 7zM.A0B(this);
                String A0t = 4YU.A0t(A0B.getResources(), 2131967562);
                0fH.A0b(Boolean.valueOf(new 4aS(A0B).A00.areNotificationsEnabled()), (Object) null, A0t, "ToastMigration", "Notifications Enabled: [%b]\tToast Source: %s\tToast contents: %s");
                Toast.makeText(A0B, A0t, 1).show();
            } else {
                ThreadKey threadKey = this.threadKey;
                if (threadKey == null) {
                    throw AnonymousClass001.A0N("No ThreadKey available from intent nor saved state");
                }
                Intent intent = getIntent();
                if (threadKey.A01 != -1 || !ThreadKey.A0U(threadKey)) {
                    A12(intent, this);
                    return;
                } else if (1Br.A07(this.mobileConfig$delegate).AZk(36317745255493403L)) {
                    1Lm.A05(this, ((1Fv) 1Br.A0B(this.fbUserSessionManager$delegate)).A05(this), 147782);
                    1Kd.A0F(new D4H(10, intent, threadKey, this), new 7hZ(AnonymousClass001.A0T("getThreadPkForThreadId not implemented")), ((C81n) 1Bq.A00(65564).get()).A01);
                    return;
                }
            }
            this.handleNoMoreContentViews.C9W();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        if (r306 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fb, code lost:
    
        if (r308 == null) goto L30;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2z(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.thread.fragment.MsysThreadViewActivity.A2z(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return !(this instanceof StaxThreadViewBubblesActivity);
    }

    public final 2Oe A3B() {
        2Oe A0Y = BDe().A0Y(R.id.content);
        if (A0Y instanceof 2Oe) {
            return A0Y;
        }
        return null;
    }

    public boolean ADk() {
        return false;
    }

    public void AQN(6Sh r302) {
        11T.A0F(r302, 0);
        2Oe A3B = A3B();
        if (A3B != null) {
            A3B.AQN(r302);
        }
    }

    @Override // X.C1lM
    public Map AWe() {
        2Oe A3B = A3B();
        if (A3B != null) {
            return A3B.AWe();
        }
        1Br.A0C(this.analyticsDataProvider$delegate);
        ThreadKey threadKey = this.threadKey;
        return threadKey != null ? 1BK.A1D("thread_key", threadKey.toString()) : 04R.A0G();
    }

    public String AWg() {
        2Oe A3B = A3B();
        return A3B != null ? A3B.AWg() : "thread";
    }

    public ThreadKey Afy() {
        return this.threadKey;
    }

    public Map Agf() {
        2Oe r0;
        2Oe A0Y = BDe().A0Y(R.id.content);
        return ((A0Y instanceof 2Oe) && (r0 = A0Y) != null && r0.isVisible()) ? r0.Agf() : RegularImmutableMap.A03;
    }

    public Long Am7() {
        2Oe A3B = A3B();
        if (A3B != null) {
            return A3B.Am7();
        }
        return null;
    }

    public int BBX() {
        2Oe A3B = A3B();
        if (A3B == null) {
            return 0;
        }
        return A3B.BBX();
    }

    public boolean BTe() {
        2Oe A3B = A3B();
        return A3B != null && A3B.BTe();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        2Oe A3B = A3B();
        if (A3B != null) {
            A3B.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        1pH r0 = this.contentViewManager;
        if (r0 == null) {
            11T.A0L("contentViewManager");
            throw 0Q8.createAndThrow();
        }
        if (r0.A07()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        if (1Br.A07(this.mobileConfig$delegate).AZk(36320592805510710L)) {
            AbF.A1J(bundle, 0Gm.A00(this.threadKey));
        }
        super.onSaveInstanceState(bundle);
    }
}

package com.facebook.resources.impl;

import X.02E;
import X.08O;
import X.0EW;
import X.0Pz;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BQ;
import X.1Bi;
import X.1FS;
import X.1Ih;
import X.1JF;
import X.1Jt;
import X.1Kd;
import X.1PA;
import X.1ZE;
import X.1Zl;
import X.1hM;
import X.1iF;
import X.1yM;
import X.3Jz;
import X.3UK;
import X.3jD;
import X.AbE;
import X.C00i;
import X.C08f;
import X.C15h;
import X.C1lF;
import X.C1xo;
import X.C3Om;
import X.C3e4;
import X.C4Ep;
import X.DKB;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.resources.impl.WaitingForStringsActivity;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: WaitingForStringsActivity.class */
public class WaitingForStringsActivity extends FbFragmentActivity implements C1xo {
    public static final String A0P = 0Pz.A0W("i18n", WaitingForStringsActivity.class.getName());
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public 1Ih A06;
    public 1FS A07;
    public 1ZE A08;
    public 3Jz A09;
    public 0EW A0A;
    public Locale A0B;
    public C15h A0C;
    public Intent A0E;
    public 1PA A0F;
    public C4Ep A0G;
    public C1lF A0H;
    public 08O A0I;
    public ScheduledExecutorService A0J;
    public final C00i A0M = new 1BQ(16885);
    public final C00i A0K = new 1BQ(66189);
    public volatile boolean A0O = false;
    public volatile boolean A0N = false;
    public boolean A0D = false;
    public final View.OnClickListener A0L = new 3UK(this, 6);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a9, code lost:
    
        if ("com.facebook.stories.ADD_TO_STORY".equals(r0.getAction()) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A12(com.facebook.resources.impl.WaitingForStringsActivity r301) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.resources.impl.WaitingForStringsActivity.A12(com.facebook.resources.impl.WaitingForStringsActivity):void");
    }

    public static void A15(WaitingForStringsActivity waitingForStringsActivity, boolean z) {
        waitingForStringsActivity.A01.setVisibility(0);
        waitingForStringsActivity.A00.setVisibility(8);
        3Jz r0 = waitingForStringsActivity.A09;
        Locale locale = waitingForStringsActivity.A0B;
        Locale locale2 = waitingForStringsActivity.A07.A0H;
        1FS r02 = waitingForStringsActivity.A07;
        Integer num = r02.A0F != null ? r02.A0F : 0S2.A0N;
        11T.A0F(locale, 1);
        11T.A0F(num, 3);
        C00i c00i = r0.A00.A00;
        ((LightweightQuickPerformanceLogger) c00i.get()).markerStart(4456452);
        MarkerEditor withMarker = ((LightweightQuickPerformanceLogger) c00i.get()).withMarker(4456452);
        withMarker.annotate("is_manual_retry", z);
        withMarker.annotate(AbE.A00(481), locale.toString());
        if (locale2 != null) {
            withMarker.annotate("requested_locale", locale2.toString());
        }
        withMarker.annotate("language_file_format", 1Jt.A00(num));
        withMarker.markerEditingCompleted();
        ListenableFuture listenableFuture = new 1hM(new 1Zl(true, (Throwable) null));
        1FS r03 = waitingForStringsActivity.A07;
        1FS.A02(r03, "listenForInit");
        1hM r303 = r03.A0D;
        if (r303 == null) {
            r303 = new 1hM(new 1Zl(true, (Throwable) null));
        }
        1Kd.A0F(new C3e4(waitingForStringsActivity, 10), 1Kd.A03(new ListenableFuture[]{(ListenableFuture) r303, listenableFuture}), waitingForStringsActivity.A0J);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(460411949512836L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        1PA r0 = this.A0F;
        if (r0 != null) {
            r0.A01();
            this.A0F = null;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        Intent intent = (Intent) getIntent().getParcelableExtra("return_intent");
        this.A0E = intent;
        if (intent != null) {
            ClassLoader classLoader = getClass().getClassLoader();
            0fH.A0h(classLoader, A0P, "Set return intent extras CL to %s");
            this.A0E.setExtrasClassLoader(classLoader);
        }
        setContentView(2132543573);
        this.A00 = requireViewById(2131365321);
        this.A01 = requireViewById(2131365322);
        1FS r0 = this.A07;
        1FS.A02(r0, "getLocale");
        Locale locale = r0.A0G;
        this.A0B = locale;
        11T.A0F(locale, 0);
        Locale A01 = 02E.A01(locale);
        String obj = A01.toString();
        11T.A0A(obj);
        String displayName = A01.getDisplayName(A01);
        if ("fb".equals(obj)) {
            displayName = "FB Hash";
        } else if ("qz".equals(obj)) {
            Locale locale2 = new Locale("my");
            String displayName2 = locale2.getDisplayName(locale2);
            displayName = 0Pz.A0W((displayName2 == null || displayName2.length() == 0 || displayName2.equals("မြန်မာ")) ? "ျမန္မာ" : "ဗမာ", " (Zawgyi)");
        } else if ("mp".equalsIgnoreCase(obj)) {
            displayName = "ꯃꯅꯤꯄꯨꯔꯤ";
        }
        String A04 = 1JF.A04(displayName);
        11T.A0A(A04);
        1Ih r02 = this.A06;
        ((TextView) requireViewById(2131365156)).setText(r02.getString(2131958536, A04));
        ((TextView) requireViewById(2131365155)).setText(r02.getString(2131958535, A04, C3Om.A01(this, (1yM) this.A0M.get())));
        View requireViewById = requireViewById(2131368290);
        this.A04 = requireViewById;
        View.OnClickListener onClickListener = this.A0L;
        requireViewById.setOnClickListener(onClickListener);
        View requireViewById2 = requireViewById(2131368291);
        this.A05 = requireViewById2;
        requireViewById2.setOnClickListener(onClickListener);
        View requireViewById3 = requireViewById(2131366943);
        this.A02 = requireViewById3;
        requireViewById3.setOnClickListener(new 3UK(this, 4));
        View requireViewById4 = requireViewById(2131366944);
        this.A03 = requireViewById4;
        requireViewById4.setOnClickListener(new 3UK(this, 5));
        A15(this, false);
        this.A0F = this.A0G.A00(new Runnable() { // from class: X.3fv
            public static final String __redex_internal_original_name = "WaitingForStringsActivity$$ExternalSyntheticLambda2";

            @Override // java.lang.Runnable
            public final void run() {
                WaitingForStringsActivity waitingForStringsActivity = WaitingForStringsActivity.this;
                if (waitingForStringsActivity.A0O || waitingForStringsActivity.A0N) {
                    1UG.A07(1Br.A02(waitingForStringsActivity.A08.A00), "fbresources_auto_retry_loading");
                    if (waitingForStringsActivity.A0O) {
                        waitingForStringsActivity.A0O = false;
                        waitingForStringsActivity.A07.A05(0S2.A0Y);
                    }
                    if (waitingForStringsActivity.A0N) {
                        waitingForStringsActivity.A0N = false;
                    }
                    WaitingForStringsActivity.A15(waitingForStringsActivity, false);
                }
            }
        });
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.A07 = (1FS) 1Bi.A03(67197);
        this.A0J = (ScheduledExecutorService) 1Bi.A03(16461);
        this.A08 = (1ZE) 1Bi.A03(66160);
        this.A09 = (3Jz) 1Bi.A03(66161);
        this.A0I = (08O) 1Bi.A03(6);
        this.A0G = (C4Ep) 1Bi.A03(33196);
        this.A0C = new 3jD(this, 69);
        this.A0H = (C1lF) 1Bi.A03(33034);
        this.A06 = (1Ih) 1Bi.A03(67196);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.A06;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory(DKB.A00(21));
        intent.setFlags(268435456);
        ((C08f) this.A0I.A06.get()).A0A(this, intent);
    }
}

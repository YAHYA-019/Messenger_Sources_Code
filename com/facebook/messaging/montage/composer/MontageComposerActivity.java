package com.facebook.messaging.montage.composer;

import X.06Z;
import X.0Gm;
import X.11T;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1EK;
import X.1JU;
import X.1Kd;
import X.1VX;
import X.1YC;
import X.1iF;
import X.1tJ;
import X.4YV;
import X.53U;
import X.5Q1;
import X.ABj;
import X.AbE;
import X.AbstractC05414dq;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C00i;
import X.C03713yu;
import X.C06c;
import X.C1254Abw;
import X.C1F6;
import X.C1Y6;
import X.C2yk;
import X.C30G;
import X.C3sa;
import X.C6r6;
import X.C6x1;
import X.C6x9;
import X.C6za;
import X.C7pa;
import X.C7y3;
import X.CJn;
import X.F7R;
import X.GOm;
import X.GfB;
import X.HSm;
import X.HeA;
import X.Hip;
import X.HnU;
import X.HrZ;
import X.HxA;
import X.I4S;
import X.I7T;
import X.I9K;
import X.IQ1;
import X.IQM;
import X.IQS;
import X.IQT;
import X.IVv;
import X.IVy;
import X.Ine;
import android.R;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: MontageComposerActivity.class */
public class MontageComposerActivity extends FbFragmentActivity implements C6za {
    public static Runnable A0L;
    public FbUserSession A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;
    public MontageComposerFragment A09;
    public HnU A0A;
    public Hip A0B;
    public MontageComposerFragmentParams A0C;
    public NavigationTrigger A0D;
    public 53U A0E;
    public boolean A0F;
    public C00i A0G;
    public C00i A0H;
    public C00i A0I;
    public C00i A0J;
    public final C00i A0K = new 1BQ(67262);

    public static Intent A12(Context context, MontageComposerFragmentParams montageComposerFragmentParams, NavigationTrigger navigationTrigger) {
        Intent intent = new Intent(context, (Class<?>) MontageComposerActivity.class);
        intent.setExtrasClassLoader(MontageComposerActivity.class.getClassLoader());
        intent.putExtra("trigger2", navigationTrigger);
        intent.putExtra("fragment_thread_key_param", montageComposerFragmentParams.A04);
        intent.putExtra("fragment_params", new OpaqueParcelable(montageComposerFragmentParams));
        int i = 67108864;
        if (montageComposerFragmentParams.A0U) {
            i = 335544320;
        }
        intent.setFlags(i);
        return intent;
    }

    public static void A15(MontageComposerActivity montageComposerActivity) {
        C6r6 c6r6 = C6r6.A0Q;
        C6r6 c6r62 = montageComposerActivity.A0C.A0D;
        if (!c6r6.equals(c6r62) && !C6r6.A0P.equals(c6r62) && !C6r6.A04.equals(c6r62) && !C6r6.A0n.equals(c6r62) && !C6r6.A0X.equals(c6r62) && !C6x9.A03(c6r62)) {
            montageComposerActivity.setResult(0);
        }
        A1D(montageComposerActivity);
        montageComposerActivity.finish();
        ((F7R) montageComposerActivity.A02.get()).A00(montageComposerActivity, montageComposerActivity.A00);
    }

    public static void A16(MontageComposerActivity montageComposerActivity) {
        if (((5Q1) montageComposerActivity.A04.get()).A01() && montageComposerActivity.A0C.A0I.contains(C6x1.A02)) {
            montageComposerActivity.setRequestedOrientation(1);
        }
        if (montageComposerActivity.A0F) {
            String stringExtra = montageComposerActivity.getIntent().getStringExtra("art_picker_section_id");
            long longExtra = montageComposerActivity.getIntent().getLongExtra("composition_id", 0L);
            if (stringExtra != null && !Objects.equal(stringExtra, ConstantsKt.CAMERA_ID_FRONT) && longExtra != 0) {
                ((IQS) montageComposerActivity.A01.get()).A00 = new GfB(montageComposerActivity, 1);
                IQS iqs = (IQS) montageComposerActivity.A01.get();
                C7pa c7pa = new C7pa(stringExtra, longExtra);
                if (iqs.A00 == null) {
                    throw AnonymousClass001.A0N("Must call setCallback() first");
                }
                FbUserSession A03 = 1Br.A03(iqs.A06);
                C30G c30g = new C30G(67);
                c30g.A03("sectionId", c7pa.A01);
                c30g.A03("compositionId", String.valueOf(c7pa.A00));
                c30g.A07(GOm.A00(91), IQS.A09);
                C3sa A00 = C3sa.A00(c30g);
                long j = IQS.A08;
                A00.A0A(j);
                A00.A09(j);
                AbstractC05414dq A04 = 1VX.A04(iqs.A02, A03);
                A00.A05 = new 1iF(1EK.A01(), 0L);
                C03713yu A032 = A04.A03(A00);
                iqs.A01 = A032;
                1Br.A0D(iqs.A03, new Ine(c7pa, iqs, 0), A032);
            }
        }
        String stringExtra2 = montageComposerActivity.getIntent().getStringExtra("montage_media_effect_id");
        if (stringExtra2 != null) {
            HeA heA = new HeA(montageComposerActivity, new HSm(montageComposerActivity));
            FbUserSession fbUserSession = montageComposerActivity.A00;
            if (fbUserSession != null) {
                IQT iqt = (IQT) 1Bn.A0E(heA.A00, (1BY) null, 115504);
                I4S i4s = (I4S) 1Bn.A0A(115503);
                iqt.A00 = new IQM(fbUserSession, heA, 0);
                iqt.A08(i4s.A02(ImmutableList.of((Object) stringExtra2)));
            }
        }
        06Z BDe = montageComposerActivity.BDe();
        MontageComposerFragment montageComposerFragment = (MontageComposerFragment) BDe.A0b("montage_composer");
        montageComposerActivity.A09 = montageComposerFragment;
        if (montageComposerFragment == null) {
            NavigationTrigger navigationTrigger = montageComposerActivity.A0D;
            if (navigationTrigger == null) {
                navigationTrigger = NavigationTrigger.A03("unknown");
            }
            montageComposerActivity.A09 = MontageComposerFragment.A05(montageComposerActivity.A0C, navigationTrigger);
            C06c c06c = new C06c(BDe);
            c06c.A0Q(montageComposerActivity.A09, "montage_composer", R.id.content);
            c06c.A05();
        }
        MontageComposerFragment montageComposerFragment2 = montageComposerActivity.A09;
        montageComposerFragment2.A05 = new IVv(montageComposerActivity);
        montageComposerFragment2.A06 = new IVy(montageComposerActivity, montageComposerActivity.A0C, montageComposerActivity.A0F);
        C1F6 c1f6 = (C1F6) montageComposerActivity.A0J.get();
        Resources resources = montageComposerActivity.getResources();
        MontageComposerFragmentParams montageComposerFragmentParams = montageComposerActivity.A0C;
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            Hip hip = new Hip(montageComposerActivity, resources, c1f6, montageComposerFragmentParams);
            1Bn.A0K();
            FbInjector.A04(A01);
            montageComposerActivity.A0B = hip;
            C1F6 c1f62 = (C1F6) montageComposerActivity.A0I.get();
            NavigationTrigger navigationTrigger2 = montageComposerActivity.A0D;
            if (navigationTrigger2 == null) {
                navigationTrigger2 = NavigationTrigger.A03("unknown");
            }
            A01 = FbInjector.A01();
            FbInjector.A04(c1f62.B92().Aqm());
            1Bn.A0M(c1f62);
            HnU hnU = new HnU(montageComposerActivity, navigationTrigger2);
            1Bn.A0K();
            FbInjector.A04(A01);
            montageComposerActivity.A0A = hnU;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public static void A1D(MontageComposerActivity montageComposerActivity) {
        MontageComposerFragmentParams montageComposerFragmentParams = montageComposerActivity.A0C;
        if (!montageComposerFragmentParams.A0U || montageComposerFragmentParams.A05 == null) {
            return;
        }
        1Kd.A0F(new ABj(montageComposerActivity, 5), ((C1254Abw) montageComposerActivity.A0G.get()).A09(montageComposerActivity, montageComposerActivity.A0C.A05), 1JU.A01);
    }

    public static boolean A1F(Context context, MontageComposerActivity montageComposerActivity) {
        Uri uri;
        Intent intent = montageComposerActivity.getIntent();
        String A00 = AnonymousClass000.A00(14);
        boolean z = false;
        if (intent.hasExtra(A00) && (uri = (Uri) montageComposerActivity.getIntent().getParcelableExtra(A00)) != null && Build.VERSION.SDK_INT >= 34 && montageComposerActivity.A0E.BNJ(AbE.A00(0))) {
            ContentResolver contentResolver = context.getContentResolver();
            11T.A0F(contentResolver, 0);
            ArrayList A002 = CJn.A00(contentResolver);
            ArrayList A01 = CJn.A01(contentResolver, uri);
            if (!(A01 instanceof Collection) || !A01.isEmpty()) {
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    if (!A002.contains(Long.valueOf(AnonymousClass001.A05(it.next())))) {
                        return false;
                    }
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(366696498039554L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        MontageComposerFragment montageComposerFragment = this.A09;
        if (montageComposerFragment != null) {
            montageComposerFragment.A06 = null;
        }
        C00i c00i = this.A01;
        if (c00i != null && c00i.get() != null) {
            ((IQS) this.A01.get()).AEC();
        }
        Runnable runnable = A0L;
        if (runnable != null) {
            runnable.run();
            A0L = null;
        }
        super.A2l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0156, code lost:
    
        if (r0 == X.C6x5.A06) goto L16;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A01 = new 1BV(this, 115511);
        this.A02 = new 1BV(99423);
        this.A04 = new 1BV(115935);
        this.A0J = new 1BV(this, 575);
        this.A0I = new 1BV(574);
        this.A03 = new 1BV(this, 85042);
        this.A07 = new 1BV(67674);
        this.A08 = new 1BQ(16456);
        this.A05 = new 1BV(49262);
        this.A0G = new 1BV(this, 82531);
        this.A0H = new 1BV(114702);
        this.A06 = new 1BV(this, 49478);
    }

    @Override // X.C6za
    public void AT6() {
        HrZ hrZ = (HrZ) this.A0H.get();
        MontageComposerFragmentParams montageComposerFragmentParams = this.A0C;
        hrZ.A00(montageComposerFragmentParams.A0D, montageComposerFragmentParams.A0Q, "exit_montage");
        A15(this);
    }

    @Override // X.C6za
    public void BY2(Object obj, int i) {
        MontageComposerFragment montageComposerFragment = this.A09;
        if (montageComposerFragment != null) {
            IQ1 iq1 = montageComposerFragment.A03;
            long j = iq1.A00;
            long A08 = 1BL.A08(iq1.A0Q);
            iq1.A00 = A08;
            if (A08 - j > 500) {
                HxA hxA = iq1.A1T;
                if (hxA == null) {
                    throw AnonymousClass001.A0N("An FB homebase handler must be defined.");
                }
                Context context = iq1.A0I;
                I9K i9k = iq1.A1M;
                I7T i7t = hxA.A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                int andIncrement = atomicInteger.getAndIncrement();
                1YC r0 = i7t.A04;
                r0.A08("com.facebook.messaging.montage.composer.plugins.interfaces.fbhomebase.MontageFbHomebaseLauncherSpec", "messaging.montage.composer.fbhomebase.MontageFbHomebaseLauncherSpec", "handleFbHomebaseCallback", andIncrement);
                try {
                    I7T.A00(i7t);
                    if (I7T.A01(i7t)) {
                        int andIncrement2 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.montage.composer.plugins.fbhomebase.impl.MontageFbHomebaseLauncherImpl", "messaging.montage.composer.fbhomebase.impl.MontageFbHomebaseLauncherImpl", "com.facebook.messaging.montage.composer.plugins.interfaces.fbhomebase.MontageFbHomebaseLauncherSpec", andIncrement2, "messaging.montage.composer.fbhomebase.MontageFbHomebaseLauncherSpec", "com.facebook.messaging.montage.composer.plugins.fbhomebase.MontageFbHomebaseKillSwitch", "handleFbHomebaseCallback");
                        try {
                            try {
                                4YV.A1N(context, i9k);
                                ((C7y3) 1Bn.A0A(196613)).BM4(context, i9k, obj, i);
                                r0.A09("messaging.montage.composer.fbhomebase.impl.MontageFbHomebaseLauncherImpl", "messaging.montage.composer.fbhomebase.MontageFbHomebaseLauncherSpec", "handleFbHomebaseCallback", andIncrement2);
                            } catch (Exception e) {
                                throw e;
                            }
                        } catch (Throwable th) {
                            r0.A04((Exception) null, "messaging.montage.composer.fbhomebase.impl.MontageFbHomebaseLauncherImpl", "messaging.montage.composer.fbhomebase.MontageFbHomebaseLauncherSpec", "handleFbHomebaseCallback", andIncrement2);
                            throw th;
                        }
                    }
                    r0.A02((Exception) null, "messaging.montage.composer.fbhomebase.MontageFbHomebaseLauncherSpec", "handleFbHomebaseCallback", andIncrement);
                } catch (Throwable th2) {
                    r0.A02((Exception) null, "messaging.montage.composer.fbhomebase.MontageFbHomebaseLauncherSpec", "handleFbHomebaseCallback", andIncrement);
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (X.C6r6.A03.equals(r0.A0A) == false) goto L6;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r302, int r303, android.content.Intent r304) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            super.onActivityResult(r1, r2, r3)
            r0 = r301
            com.facebook.messaging.montage.composer.MontageComposerFragment r0 = r0.A09
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2f
            X.6r6 r0 = X.C6r6.A03
            r306 = r0
            r0 = r305
            X.6r6 r0 = r0.A0A
            r305 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.equals(r1)
            r307 = r0
            r0 = 1
            r308 = r0
            r0 = r307
            if (r0 != 0) goto L35
        L2f:
            r0 = 0
            r308 = r0
            r0 = 0
            r306 = r0
        L35:
            r0 = 1
            r307 = r0
            r0 = -1
            r309 = r0
            r0 = r308
            if (r0 == 0) goto L79
            r0 = r302
            r1 = r307
            if (r0 != r1) goto L79
            r0 = r304
            if (r0 == 0) goto L78
            r0 = r304
            android.os.Bundle r0 = r0.getExtras()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L78
            r0 = 0
            r308 = r0
            r0 = 0
            r306 = r0
            java.lang.String r0 = "extra_bcf_media_shared"
            r305 = r0
            r0 = r304
            r1 = r305
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L78
        L6e:
            r0 = r301
            r1 = r309
            r0.setResult(r1)
            r0 = r301
            r0.finish()
        L78:
            return
        L79:
            r0 = r302
            r1 = r307
            if (r0 != r1) goto L78
            r0 = r303
            r1 = r309
            if (r0 != r1) goto L78
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        MontageComposerFragment montageComposerFragment = this.A09;
        if (montageComposerFragment == null || !montageComposerFragment.Bkd()) {
            A1D(this);
            super.onBackPressed();
            ((F7R) this.A02.get()).A00(this, this.A00);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        MontageComposerFragment montageComposerFragment = this.A09;
        if (montageComposerFragment == null || !montageComposerFragment.A1G(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0175, code lost:
    
        if (r0.A02 != false) goto L49;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyUp(int r302, android.view.KeyEvent r303) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.MontageComposerActivity.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        A15(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (Build.VERSION.SDK_INT < 35 || getApplicationInfo().targetSdkVersion < 35 || getWindow() == null) {
            return;
        }
        1tJ.A06(getWindow(), -16777216);
        C2yk.A00(getWindow(), -16777216);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("fragment_params", 0Gm.A00(this.A0C));
        super.onSaveInstanceState(bundle);
    }
}

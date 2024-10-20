package com.facebook.messaging.rtc.incall.activity;

import X.0D2;
import X.0FI;
import X.0Pz;
import X.0Q8;
import X.0S2;
import X.0Zi;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Fw;
import X.1HG;
import X.1Hv;
import X.1Lm;
import X.1Lo;
import X.1SG;
import X.1gF;
import X.1gM;
import X.1hN;
import X.1iF;
import X.1pH;
import X.1pK;
import X.2JS;
import X.2QN;
import X.2QO;
import X.2Qb;
import X.2yD;
import X.4YU;
import X.4zI;
import X.4zJ;
import X.5Vt;
import X.5Zt;
import X.7zM;
import X.7zP;
import X.7zU;
import X.9hD;
import X.AR2;
import X.AbF;
import X.AbG;
import X.AbM;
import X.AbstractC2402Gc4;
import X.AnonymousClass001;
import X.C00i;
import X.C00m;
import X.C01i;
import X.C03933zc;
import X.C03i;
import X.C06c;
import X.C1fj;
import X.C1lM;
import X.C1m5;
import X.C1xf;
import X.C81;
import X.C9lt;
import X.CNb;
import X.D09;
import X.DKE;
import X.DKH;
import X.EtU;
import X.GE5;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GOq;
import X.GQy;
import X.GR1;
import X.GS2;
import X.GTp;
import X.GeK;
import X.GrS;
import X.HAU;
import X.HIt;
import X.HKu;
import X.HXc;
import X.HbH;
import X.HeM;
import X.HeN;
import X.Hhf;
import X.HmY;
import X.I4l;
import X.I6E;
import X.IAA;
import X.IEA;
import X.IFc;
import X.IRF;
import X.IRW;
import X.IZI;
import X.Iey;
import X.InterfaceC03733yw;
import X.Iwl;
import X.Iwn;
import X.J9u;
import X.JAN;
import X.JD5;
import X.JDJ;
import X.JDK;
import X.JFq;
import X.JGP;
import X.JGS;
import X.JI8;
import X.JLm;
import X.JMS;
import X.JOJ;
import X.JOL;
import X.JOY;
import X.QqA;
import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.rsys.state.gen.State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: InCallActivity.class */
public final class InCallActivity extends FbFragmentActivity implements C1lM, C1xf, JI8, JD5, JGS, GE5, JGP, C1m5, 1gF, InterfaceC03733yw, JDJ, JDK {
    public 0D2 A00;
    public FbUserSession A01;
    public 1pH A02;
    public C00i A03;
    public C00i A04;
    public HeN A05;
    public HIt A06;
    public AbstractC2402Gc4 A07;
    public HKu A08;
    public C00m A09;
    public LayoutInflater A0A;
    public C00i A0B;
    public C00i A0C;
    public C00i A0D;
    public C00i A0E;
    public C00i A0F;
    public C00i A0G;
    public C00i A0H;
    public C00i A0I;
    public C00i A0J;
    public C00i A0K;
    public C00i A0L;
    public C00i A0M;
    public C00i A0N;
    public GeK A0O;
    public boolean A0P;
    public final 1Br A0T;
    public final C01i A0V;
    public final C01i A0W;
    public final C01i A0X;
    public final HmY A0Z;
    public final Function1 A0a;
    public final 1Br A0Q = 1Bq.A00(66591);
    public final 1Br A0U = 1Bq.A00(66441);
    public final 1Br A0S = 1Bq.A00(85050);
    public final 1Br A0R = 1Bq.A00(16754);
    public final C01i A0Y = J9u.A01(this, 16);

    public InCallActivity() {
        C03i c03i = C03i.A02;
        this.A0X = J9u.A00(this, c03i, 15);
        this.A0V = J9u.A00(this, c03i, 12);
        this.A0Z = new HmY(this);
        this.A0a = new AR2(this, 46);
        this.A0T = 1BK.A0C();
        this.A0W = J9u.A00(this, c03i, 13);
    }

    private final void A12() {
        State A0m;
        C00m c00m = this.A09;
        if (c00m != null) {
            c00m.invoke();
        }
        String stringExtra = getIntent().getStringExtra("LOCAL_CALL_ID");
        if (stringExtra == null) {
            A16(getIntent(), "restart_store_subscription");
            return;
        }
        5Vt A00 = C9lt.A00(stringExtra);
        2JS r0 = GOn.A0v(A00).A00;
        if (r0 == null || (A0m = GOq.A0m(r0)) == null || A0m.callState == 0) {
            this.A09 = A00.A00(new Iey(this.A0a, 0), JAN.A00, true);
        }
    }

    private final void A15(Intent intent) {
        if (this.A06 == null) {
            throw 1BK.A0h();
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = 1BK.A05();
            intent.putExtras(extras);
        }
        boolean z = extras.getBoolean("END_CALL");
        boolean z2 = extras.getBoolean("AUTO_ACCEPT");
        boolean z3 = extras.getBoolean("ACCEPT_WITHOUT_UI");
        String string = extras.getString("LOCAL_CALL_ID");
        boolean z4 = extras.getBoolean("STOP_SCREEN_SHARING");
        if (string == null && !AbG.A1b(1BL.A0Q(), 36320232024849579L)) {
            throw AnonymousClass001.A0N("localCallId == null when creating instance of RootCallFragment");
        }
        GQy gQy = new GQy();
        Bundle A05 = 1BK.A05();
        A05.putBoolean("autoEndCall", z);
        A05.putBoolean("autoAcceptCall", z2);
        A05.putBoolean("acceptWithoutUi", z3);
        A05.putBoolean("stopScreenSharing", z4);
        A05.putString("localCallId", string);
        gQy.setArguments(A05);
        this.A07 = gQy;
        4zI.A03.A05("InCallActivity", 0Pz.A0W("Creating new call screen with local call ID: ", intent.getStringExtra("LOCAL_CALL_ID")), new Object[0]);
        C06c A0D = 7zU.A0D(this);
        A0D.A0P(gQy, "voip_webrtc_incall_fragment", R.id.content);
        A0D.A04();
        A12();
        if (1Br.A07(((HbH) this.A0W.getValue()).A00).AZk(36323521970195086L)) {
            C01i c01i = this.A0V;
            HeM heM = (HeM) c01i.getValue();
            HmY hmY = this.A0Z;
            11T.A0F(hmY, 0);
            heM.A01.remove(hmY);
            HeM heM2 = (HeM) c01i.getValue();
            heM2.A01.add(hmY);
            String str = heM2.A02;
            if (str != null) {
                7zP.A0N(heM2.A00).CY3(new Iwl(hmY, str));
            }
        }
    }

    public static final void A16(Intent intent, String str) {
        State A0m;
        5Vt A0u = GOn.A0u();
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(str);
        LinkedHashMap A1C = 1BK.A1C();
        if (A0u != null) {
            A0s.add("has_active_call");
            2JS r0 = GOn.A0v(A0u).A00;
            A1C.put("call_state", String.valueOf((r0 == null || (A0m = GOq.A0m(r0)) == null) ? -1 : A0m.callState));
            A1C.put("local_call_id", A0u.A02);
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = 1BK.A05();
            intent.putExtras(extras);
        }
        Iterator<String> it = extras.keySet().iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            String A0W = 0Pz.A0W("IntentKey:  ", A0i);
            Object obj = extras.get(A0i);
            if (obj == null) {
                obj = "null";
            }
            A1C.put(A0W, String.valueOf(obj));
        }
        I6E.A01("local_call_id_ui_binding", A0u != null ? A0u.A02 : null, null, A0s, A1C, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A1D(Intent intent, InCallActivity inCallActivity, AbstractC2402Gc4 abstractC2402Gc4, String str) {
        boolean z = false;
        if (!11T.A0O(str, ((GQy) abstractC2402Gc4).A1E.getValue())) {
            4zI.A03.A05("InCallActivity", "Local call ID changed. Recreating CallScreen.", new Object[0]);
            Bundle bundle = abstractC2402Gc4.mArguments;
            if (bundle == null) {
                bundle = 1BK.A05();
                abstractC2402Gc4.setArguments(bundle);
            }
            z = true;
            bundle.putBoolean("replaced_due_to_local_call_id_change", true);
            inCallActivity.AN5();
            inCallActivity.A15(intent);
            C00i c00i = inCallActivity.A0D;
            if (c00i == null) {
                throw 1BK.A0h();
            }
            JOY.A01((IEA) c00i.get()).Bcv("InCallActivity_newIntent", (String) null);
        }
        return z;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return GOq.A0U();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        4zJ r0 = 4zI.A03;
        r0.A05("InCallActivity", "Call activity destroy", new Object[0]);
        if (!this.A0P) {
            r0.A05("InCallActivity", "onDestroy skipped because onActivityCreate not called", new Object[0]);
            return;
        }
        C00i c00i = this.A0G;
        if (c00i == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Object obj = c00i.get();
        11T.A0A(obj);
        Cdt((1gM) obj);
        C00i c00i2 = this.A0F;
        if (c00i2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Object obj2 = c00i2.get();
        11T.A0A(obj2);
        Cdt((1gM) obj2);
        C00i c00i3 = this.A0N;
        if (c00i3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (((D09) c00i3.get()).A01()) {
            GeK geK = this.A0O;
            if (geK == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            Cdt(geK);
        }
        C00i c00i4 = this.A0H;
        if (c00i4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ((EtU) c00i4.get()).A00(this);
        Iterator it = ((HXc) 1Hv.A02(this, 115652)).A00.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("tearDownLogging");
        }
        FbUserSession fbUserSession = this.A01;
        if (fbUserSession == null) {
            throw AnonymousClass001.A0N("getUserSession called before InCallActivity onBeforeSuperOnCreate");
        }
        ((JOJ) 1Lo.A04(this, fbUserSession, (1BY) null, 83902)).AQG("CALL_UI_FINISHED");
        1pH r02 = this.A02;
        if (r02 != null) {
            r02.A06();
        }
        this.A02 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x02c0, code lost:
    
        if (((com.facebook.rsys.state.gen.State) r0).callState == 2) goto L60;
     */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2x(android.content.Intent r302) {
        /*
            Method dump skipped, instructions count: 1983
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.activity.InCallActivity.A2x(android.content.Intent):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x013a, code lost:
    
        if (X.1Br.A07(r301.A0T).AZk(36323418890586673L) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    @Override // com.facebook.base.activity.FbFragmentActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2y(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.activity.InCallActivity.A2y(android.os.Bundle):void");
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A31(Bundle bundle) {
        super.A31(bundle);
        FbUserSession A0H = DKH.A0H(this);
        this.A01 = A0H;
        this.A0E = GOo.A0L();
        this.A0I = GOn.A0Z(this, A0H);
        this.A0B = GOn.A0a(this, A0H);
        this.A0G = 1Bu.A01(this, 85149);
        this.A0F = 1Bu.A00(85148);
        this.A06 = (HIt) 1Bn.A0A(114983);
        this.A08 = (HKu) 1Bn.A0A(115653);
        this.A0K = 1Bu.A00(115092);
        this.A0J = 1Bu.A01(this, 115647);
        1Bn.A0A(147900);
        this.A0O = new GeK(this, A0H);
        this.A04 = 1HG.A00(this, 115672);
        this.A03 = 1Bu.A01(this, 83156);
        this.A0M = 1Lm.A00(this, A0H, 67965);
        this.A0D = 1Lm.A00(this, A0H, 115612);
        this.A0L = GOn.A0T(this, A0H);
        this.A0H = 1Lm.A00(this, A0H, 98493);
        this.A0N = 1Lm.A00(this, A0H, 83954);
        this.A0C = 1Lm.A00(this, A0H, 81979);
        C00i c00i = this.A0G;
        if (c00i == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Object obj = c00i.get();
        11T.A0A(obj);
        A5D((1gM) obj);
        C00i c00i2 = this.A0F;
        if (c00i2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Object obj2 = c00i2.get();
        11T.A0A(obj2);
        A5D((1gM) obj2);
        C00i c00i3 = this.A0N;
        if (c00i3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (((D09) c00i3.get()).A01()) {
            4zI.A03.A05("InCallActivity", "Picture in Picture mode enabled; registering activity listener", AnonymousClass001.A1Z());
            GeK geK = this.A0O;
            if (geK != null && GeK.A07(geK)) {
                setPictureInPictureParams(GeK.A00(geK, 4YU.A0B(this).orientation));
            }
            GeK geK2 = this.A0O;
            if (geK2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            A5D(geK2);
        }
    }

    public void AN5() {
        1pK r0 = this.A07;
        if (r0 != null) {
            DKE.A1J(r0, BDe());
            BDe().A0t();
            this.A07 = null;
            C00i c00i = this.A0H;
            if (c00i == null) {
                throw 1BK.A0h();
            }
            Iterator it = ((EtU) c00i.get()).A01.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // X.GE5
    public boolean ANL() {
        return true;
    }

    @Override // X.C1lM
    public Map AWe() {
        HashMap A0u = AnonymousClass001.A0u();
        C00i c00i = this.A0I;
        if (c00i == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A0u.put("is_meetup", Boolean.valueOf(GOp.A0q(c00i).A0V));
        C00i c00i2 = this.A0I;
        if (c00i2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A0u.put("is_video", Boolean.valueOf(GOp.A0q(c00i2).A0a));
        C00i c00i3 = this.A0L;
        if (c00i3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        int A07 = GOn.A0t(c00i3).A07();
        boolean z = true;
        if (A07 != 1 && A07 != 2 && A07 != 3) {
            z = false;
        }
        A0u.put("in_lobby", Boolean.valueOf(z));
        C00i c00i4 = this.A0M;
        if (c00i4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A0u.put("room_fsi", ((IFc) c00i4.get()).A07.A03());
        C00i c00i5 = this.A0B;
        if (c00i5 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (((IRF) c00i5.get()).A0O.second != null) {
            C00i c00i6 = this.A0B;
            if (c00i6 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            Object obj = ((IRF) c00i6.get()).A0O.second;
            11T.A09(obj);
            A0u.put("pip_last_hidden_timestamp", obj);
        }
        return A0u;
    }

    public String AWg() {
        C00i c00i = this.A0J;
        if (c00i == null) {
            throw 1BK.A0h();
        }
        IAA iaa = (IAA) c00i.get();
        String A00 = IAA.A00(iaa);
        iaa.A01 = A00;
        return 0Pz.A0W("rtc_incall_fragment_host_activity:", A00);
    }

    @Override // X.C1xf
    public Integer Ac6() {
        return 0S2.A00;
    }

    public Long Am7() {
        return 594492937905231L;
    }

    public JMS BDy() {
        AbstractC2402Gc4 abstractC2402Gc4 = this.A07;
        if (abstractC2402Gc4 != null) {
            return abstractC2402Gc4.BDy();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (X.I4l.A00(r0).A03 == false) goto L8;
     */
    @Override // X.JI8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean CyZ() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4f
            r0 = r302
            java.lang.Object r0 = r0.get()
            X.I4l r0 = (X.I4l) r0
            r303 = r0
            r0 = r303
            X.ExQ r0 = X.I4l.A00(r0)
            X.1Br r0 = r0.A0A
            r302 = r0
            r0 = r302
            X.2yD r0 = X.1Br.A07(r0)
            r304 = r0
            r0 = 36319321491781498(0x81083b0000377a, double:3.031823385347177E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L47
            r0 = r303
            X.ExQ r0 = X.I4l.A00(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0.A03
            r308 = r0
            r0 = 1
            r307 = r0
            r0 = r308
            if (r0 != 0) goto L4c
        L47:
            r0 = 0
            r307 = r0
            r0 = 0
            r302 = r0
        L4c:
            r0 = r307
            return r0
        L4f:
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.activity.InCallActivity.CyZ():boolean");
    }

    @Override // X.JI8
    public void Czx(QqA qqA, Runnable runnable, Runnable runnable2) {
        this.A05 = new HeN(qqA, runnable, runnable2);
        C00i c00i = this.A03;
        if (c00i == null) {
            throw 1BK.A0h();
        }
        this.A00 = ((I4l) c00i.get()).A01(this, new IRW(this, runnable, runnable2), qqA, true);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        super.finish();
        4zJ r0 = 4zI.A03;
        r0.A05("InCallActivity", "Call activity finish", new Object[0]);
        if (!this.A0P) {
            r0.A05("InCallActivity", "finish skipped because onActivityCreate not called", new Object[0]);
            return;
        }
        overridePendingTransition(0, 0);
        C00i c00i = this.A0H;
        if (c00i == null) {
            throw 1BK.A0h();
        }
        ((EtU) c00i.get()).A00(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        LayoutInflater layoutInflater;
        11T.A0F(str, 0);
        if (!((2yD) this.A0T.A00.get()).AZk(36326369533449739L) || !"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        LayoutInflater layoutInflater2 = this.A0A;
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        Object systemService = super.getSystemService(str);
        if (!(systemService instanceof LayoutInflater) || (layoutInflater = (LayoutInflater) systemService) == null) {
            return null;
        }
        GTp gTp = new GTp(this, layoutInflater);
        this.A0A = gTp;
        return gTp;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        String str;
        Activity A1P;
        Resources resources;
        Configuration configuration;
        if (9hD.A00((9hD) this.A0X.getValue())) {
            return;
        }
        1pH r0 = this.A02;
        if (r0 == null || !r0.A07()) {
            GQy gQy = this.A07;
            if (gQy != null) {
                GQy gQy2 = gQy;
                if (gQy2.getContext() != null) {
                    GrS grS = gQy2.A0I;
                    if (grS == null) {
                        AbF.A1H();
                        throw 0Q8.createAndThrow();
                    }
                    GR1 gr1 = (GR1) 1Br.A0B(grS.A08);
                    if (gr1.A04 == 4 || gr1.A06 == 4) {
                        GR1 gr12 = (GR1) 1Br.A0B(grS.A08);
                        JOL jol = gr12.A08;
                        if (jol != null && jol.Cxh(gr12.A0G)) {
                            Iterator A01 = GR1.A01(gr12);
                            while (A01.hasNext()) {
                                ((JLm) A01.next()).CJk();
                            }
                            return;
                        } else if (gr12.A06 == 4) {
                            if (jol != null) {
                                jol.CCg(gr12.A0G);
                            }
                            gr12.ChU("back");
                            return;
                        } else {
                            if (gr12.A04 == 4) {
                                Iterator A012 = GR1.A01(gr12);
                                while (A012.hasNext()) {
                                    A012.next();
                                }
                                return;
                            }
                            return;
                        }
                    }
                    C00i c00i = grS.A0S.A00;
                    HAU hau = GOo.A0U(c00i).A02;
                    HAU hau2 = HAU.A07;
                    if (hau != hau2) {
                        GOo.A0U(c00i).A0M("ANDROID_BACK");
                        GOo.A0U(c00i).A0H(hau2);
                        return;
                    }
                    FbUserSession fbUserSession = grS.A06;
                    2QN r02 = (2QO) 1Lm.A05(grS.A05, fbUserSession, 99977);
                    if (r02.A0V) {
                        ((C81) 1Br.A0B(grS.A0c)).A00();
                        return;
                    }
                    if (((CNb) 1Br.A0B(grS.A0o)).A04() && ((str = r02.A0C) == null || str.length() == 0 || !5Zt.A00((5Zt) 1Br.A0B(grS.A0E)).AZk(36313939899260185L))) {
                        JFq jFq = ((GS2) grS).A00;
                        if (!AbM.A1a(jFq) || (A1P = ((1pK) AbM.A0r(jFq)).A1P()) == null || (resources = A1P.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) {
                            ((C81) 1Br.A0B(grS.A0c)).A01(fbUserSession);
                            return;
                        }
                    }
                }
            }
            C00i c00i2 = this.A0N;
            if (c00i2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            if (((D09) c00i2.get()).A01()) {
                GeK geK = this.A0O;
                if (geK == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                if (!GeK.A07(geK) && GeK.A06(this, geK)) {
                    return;
                }
            }
            super.onBackPressed();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        11T.A0F(configuration, 1);
        super.onMultiWindowModeChanged(z, configuration);
        FbUserSession fbUserSession = this.A01;
        if (fbUserSession == null) {
            throw AnonymousClass001.A0N("getUserSession called before InCallActivity onBeforeSuperOnCreate");
        }
        IZI.A02((JOJ) 1Lo.A04(this, fbUserSession, (1BY) null, 83902), "WINDOW_MODE", z ? "WINDOW_MODE_MULTI_WINDOW" : "WINDOW_MODE_FULLSCREEN", (Map) null);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IllegalStateException A0N;
        int i;
        int A00 = 0FI.A00(936560202);
        super.onPause();
        C00i c00i = this.A04;
        if (c00i != null) {
            Hhf hhf = (Hhf) c00i.get();
            hhf.A00 = null;
            hhf.A02 = false;
            C00i c00i2 = this.A0J;
            if (c00i2 != null) {
                IAA iaa = (IAA) c00i2.get();
                iaa.A02 = false;
                iaa.A01 = null;
                FbUserSession A04 = 1Fw.A04(iaa.A03);
                1BY r0 = iaa.A04.A00;
                ((2QO) 1Lm.A07(A04, r0, 99977)).Cf7(iaa.A07);
                ((2Qb) 1Lm.A07(A04, r0, 17016)).A0V.remove(iaa.A06);
                C00i c00i3 = this.A0C;
                if (c00i3 != null) {
                    ((C03933zc) c00i3.get()).A04 = true;
                    0FI.A07(-2140597604, A00);
                    return;
                } else {
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = -950807502;
                }
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -432231406;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -692516307;
        }
        0FI.A07(i, A00);
        throw A0N;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        if (z) {
            0D2 r0 = this.A00;
            if (r0 != null && r0.isVisible()) {
                r0.A0o();
            }
            9hD.A00((9hD) this.A0X.getValue());
            return;
        }
        HeN heN = this.A05;
        if (heN != null) {
            Czx(heN.A00, heN.A01, heN.A02);
            this.A05 = null;
        }
        Window window = getWindow();
        if (window == null) {
            throw 1BK.A0h();
        }
        View decorView = window.getDecorView();
        11T.A0A(decorView);
        decorView.postDelayed(new Iwn(decorView, this), 300L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C00i c00i = this.A0K;
        if (c00i == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        c00i.get();
        C00i c00i2 = this.A0J;
        if (c00i2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        IAA iaa = (IAA) c00i2.get();
        if (iaa.A00 != null) {
            throw AnonymousClass001.A0q("Cannot set more than one analytics activity");
        }
        iaa.A00 = this;
        IAA.A02(iaa);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IllegalStateException A0N;
        int i;
        int A00 = 0FI.A00(-1419069840);
        super.onResume();
        C00i c00i = this.A0J;
        if (c00i != null) {
            IAA iaa = (IAA) c00i.get();
            iaa.A02 = true;
            IAA.A02(iaa);
            setShowWhenLocked(true);
            C00i c00i2 = this.A04;
            if (c00i2 != null) {
                Hhf hhf = (Hhf) c00i2.get();
                hhf.A00 = this;
                hhf.A02 = true;
                C00i c00i3 = this.A0C;
                if (c00i3 != null) {
                    ((C03933zc) c00i3.get()).A04 = false;
                    4zI.A03.A05("InCallActivity", "onResume", new Object[0]);
                    synchronized (1Br.A0B(this.A0S)) {
                    }
                    ((1SG) 1Br.A0B(this.A0Q)).A0I("join_rtc_call");
                    ((1hN) 1Br.A0B(this.A0U)).A01("InCallActivity");
                    0FI.A07(588693236, A00);
                    return;
                }
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 362496027;
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -17896239;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -1124816831;
        }
        0FI.A07(i, A00);
        throw A0N;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        0Zi.A01(7zM.A0B(this));
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(-65419504);
        Object A0R = AnonymousClass001.A0R();
        C00i c00i = this.A0R.A00;
        ((C1fj) c00i.get()).A01(0S2.A02, A0R);
        super.onStart();
        ((C1fj) c00i.get()).A02(A0R);
        A12();
        if (1Br.A07(((HbH) this.A0W.getValue()).A00).AZk(36323521970195086L)) {
            HeM heM = (HeM) this.A0V.getValue();
            HmY hmY = this.A0Z;
            11T.A0F(hmY, 0);
            heM.A01.add(hmY);
            String str = heM.A02;
            if (str != null) {
                7zP.A0N(heM.A00).CY3(new Iwl(hmY, str));
            }
        }
        0FI.A07(-1411024018, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(1589211518);
        if (1Br.A07(((HbH) this.A0W.getValue()).A00).AZk(36323521970195086L)) {
            HeM heM = (HeM) this.A0V.getValue();
            HmY hmY = this.A0Z;
            11T.A0F(hmY, 0);
            heM.A01.remove(hmY);
        }
        super.onStop();
        C00m c00m = this.A09;
        if (c00m != null) {
            c00m.invoke();
        }
        this.A09 = null;
        9hD.A00((9hD) this.A0X.getValue());
        0FI.A07(-1924248469, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        AbstractC2402Gc4 abstractC2402Gc4 = this.A07;
        if (abstractC2402Gc4 == null || !abstractC2402Gc4.A1X()) {
            return;
        }
        finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}

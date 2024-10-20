package com.facebook.privacy.consent.bloks.messenger;

import X.0FI;
import X.0Pz;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Lm;
import X.1iF;
import X.4YV;
import X.7zM;
import X.7zO;
import X.7zP;
import X.7zS;
import X.7zU;
import X.AbF;
import X.AbG;
import X.AnonymousClass001;
import X.C06c;
import X.C0A2;
import X.C1io;
import X.C1oi;
import X.C2yk;
import X.C9mq;
import X.DKE;
import X.DKc;
import X.DLQ;
import X.DaI;
import X.EXO;
import X.Eax;
import X.Efe;
import X.EhI;
import X.EhJ;
import X.Etz;
import X.F3s;
import X.F6M;
import X.F7B;
import X.FEK;
import X.FIu;
import X.G0Z;
import X.G6L;
import X.GBC;
import X.GJj;
import X.PzJ;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;

/* loaded from: MessengerPrivacyFlowBloksActivity.class */
public final class MessengerPrivacyFlowBloksActivity extends FbFragmentActivity implements C1io {
    public PzJ A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final 1Br A08 = AbG.A0M();
    public final 1Br A09 = 7zM.A0Y();

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(792133868405948L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        EhI ehI;
        GJj gJj;
        ((Etz) 1Lm.A06(7zS.A0E(this.A09), 99803)).A00();
        String str = this.A04;
        if (str != null) {
            synchronized (F7B.A00) {
                F7B.A01.remove(str);
            }
            if (isFinishing()) {
                String str2 = this.A04;
                if (str2 != null) {
                    ReentrantReadWriteLock.WriteLock writeLock = C9mq.A02.writeLock();
                    11T.A0A(writeLock);
                    writeLock.lock();
                    try {
                        C9mq.A00.remove(str2);
                        Efe efe = (Efe) C9mq.A01.remove(str2);
                        if (efe != null && (ehI = efe.A00) != null && (gJj = ehI.A01) != null) {
                            FEK.A00(ehI.A00, DKc.A01, gJj);
                        }
                        String str3 = this.A04;
                        if (str3 != null) {
                            AbstractCollection abstractCollection = (AbstractCollection) F3s.A00.remove(str3);
                            if (abstractCollection != null) {
                                Iterator it = abstractCollection.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    11T.A0D(next);
                                    F3s.A01.remove(next);
                                }
                            }
                        }
                    } finally {
                        writeLock.unlock();
                    }
                }
                11T.A0L("flowInstanceId");
                throw 0Q8.createAndThrow();
            }
        }
        super.A2l();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        11T.A0F(intent, 0);
        super.A2x(intent);
        String stringExtra = intent.getStringExtra("redirect_url");
        if (stringExtra != null) {
            int i = PzJ.A02;
            PzJ pzJ = new PzJ(this, GBC.A00, Color.argb(192, 255, 255, 255));
            this.A00 = pzJ;
            pzJ.show();
            this.A07 = true;
            this.A05 = intent.getStringExtra("callback_key");
            ((FIu) 1Bn.A0E(this, (1BY) null, 100011)).A08(this, C0A2.A03(stringExtra));
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String str;
        String str2;
        super.A2y(bundle);
        C1oi.A00(this, 1);
        setContentView(2132541762);
        Window window = getWindow();
        if (window != null) {
            C2yk.A00(window, EXO.A00(this, (DLQ) null));
        }
        Bundle A0H = 7zO.A0H(this);
        if (A0H == null) {
            0fH.A0j("MessengerPrivacyFlowBloksActivity", "intent extras was null for Messenger Android Classic");
        } else {
            String string = A0H.getString("flow_name");
            if (string == null) {
                str2 = "No flow name provided";
            } else {
                this.A03 = string;
                String string2 = A0H.getString("experience_id");
                if (string2 == null) {
                    str2 = "No experience ID provided";
                } else {
                    this.A02 = string2;
                    String string3 = A0H.getString("app_id");
                    if (string3 != null) {
                        this.A01 = string3;
                        String A0Y = 0Pz.A0Y(string2, string, '$');
                        this.A04 = A0Y;
                        F7B f7b = F7B.A00;
                        if (A0Y == null) {
                            str = "flowInstanceId";
                        } else {
                            synchronized (f7b) {
                                F7B.A01.put(A0Y, this);
                            }
                            if (bundle != null) {
                                this.A07 = bundle.getBoolean("in_app_browser_opening");
                                this.A06 = bundle.getBoolean("in_app_browser_opened");
                                this.A05 = bundle.getString("in_app_browser_callback");
                                return;
                            }
                            F6M f6m = (F6M) 1Lm.A05(this, 7zS.A0E(this.A09), 98523);
                            String stringExtra = getIntent().getStringExtra(Property.SYMBOL_Z_ORDER_SOURCE);
                            String stringExtra2 = getIntent().getStringExtra("device_id");
                            String stringExtra3 = getIntent().getStringExtra("extra_params_json");
                            PzJ pzJ = new PzJ(this, (Function1) null, PzJ.A02);
                            this.A00 = pzJ;
                            pzJ.show();
                            String str3 = this.A03;
                            if (str3 == null) {
                                str = "flowName";
                            } else {
                                String str4 = this.A01;
                                if (str4 == null) {
                                    str = "appId";
                                } else {
                                    String str5 = this.A02;
                                    if (str5 != null) {
                                        4YV.A11(f6m.A00).execute(new G6L(this, new DaI(this), f6m, str3, str5, stringExtra, stringExtra2, stringExtra3, str4));
                                        return;
                                    }
                                    str = "experienceId";
                                }
                            }
                        }
                        11T.A0L(str);
                        throw 0Q8.createAndThrow();
                    }
                    str2 = "No app ID provided";
                }
            }
            0fH.A0k("MessengerPrivacyFlowBloksActivity", str2);
        }
        finish();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, android.app.Activity
    public void finish() {
        if (DKE.A15(this).size() < 1) {
            super.finish();
            return;
        }
        C06c A0D = 7zU.A0D(this);
        Iterator it = 7zP.A0x(BDe()).iterator();
        while (it.hasNext()) {
            A0D.A0I((Fragment) it.next());
        }
        G0Z g0z = new G0Z(this);
        A0D.A08();
        ArrayList arrayList = A0D.A0B;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
            A0D.A0B = arrayList;
        }
        arrayList.add(g0z);
        A0D.A05();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        String str = this.A04;
        if (str == null) {
            11T.A0L("flowInstanceId");
            throw 0Q8.createAndThrow();
        }
        C9mq.A04(str);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(-1378663103);
        super.onPause();
        if (this.A07) {
            this.A07 = false;
            this.A06 = true;
        }
        0FI.A07(1261700540, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1929048687);
        super.onResume();
        if (this.A06) {
            PzJ pzJ = this.A00;
            if (pzJ != null && pzJ.isShowing()) {
                PzJ pzJ2 = this.A00;
                if (pzJ2 == null) {
                    11T.A0L("loadingDialog");
                    throw 0Q8.createAndThrow();
                }
                pzJ2.dismiss();
            }
            this.A06 = false;
            String str = this.A05;
            if (str != null) {
                ReentrantLock reentrantLock = Eax.A01;
                reentrantLock.lock();
                try {
                    EhJ ehJ = (EhJ) Eax.A00.remove(str);
                    if (ehJ != null) {
                        GJj gJj = ehJ.A01;
                        FEK.A00(ehJ.A00, DKc.A01, gJj);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        0FI.A07(-1832955070, A00);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        boolean z = this.A07;
        if (z || this.A06) {
            bundle.putBoolean("in_app_browser_opening", z);
            bundle.putBoolean("in_app_browser_opened", this.A06);
            bundle.putString("in_app_browser_callback", this.A05);
        }
    }
}

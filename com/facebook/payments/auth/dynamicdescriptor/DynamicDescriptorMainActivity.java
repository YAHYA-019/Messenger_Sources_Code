package com.facebook.payments.auth.dynamicdescriptor;

import X.0Pz;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1Iw;
import X.1iF;
import X.7zL;
import X.7zU;
import X.AbF;
import X.AbL;
import X.AnonymousClass001;
import X.C00i;
import X.C06c;
import X.C1F6;
import X.C1rs;
import X.DKD;
import X.DKG;
import X.DKH;
import X.DLP;
import X.E4u;
import X.E4v;
import X.E4w;
import X.E4x;
import X.Eeh;
import X.F6A;
import X.F9s;
import X.FI2;
import X.FWn;
import X.FXq;
import X.GJe;
import X.InterfaceC07034in;
import X.QDk;
import X.QKL;
import X.QKM;
import X.QMC;
import X.Qoq;
import X.Qyd;
import X.Ra6;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.payments.auth.dynamicdescriptor.components.StepProgressIndicator;
import com.facebook.payments.auth.dynamicdescriptor.params.DynamicDescriptorParams;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.text.BetterTextView;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Map;

/* loaded from: DynamicDescriptorMainActivity.class */
public class DynamicDescriptorMainActivity extends FbFragmentActivity implements GJe, CallerContextable {
    public static final CallerContext A0N = CallerContext.A06(DynamicDescriptorMainActivity.class);
    public FbDraweeView A00;
    public C00i A01;
    public C00i A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public C00i A06;
    public C00i A07;
    public LithoView A08;
    public LithoView A09;
    public StepProgressIndicator A0A;
    public DynamicDescriptorParams A0B;
    public FbTextView A0D;
    public FbTextView A0E;
    public DLP A0F;
    public BetterTextView A0G;
    public LithoView A0J;
    public final C00i A0L = 1BQ.A01();
    public boolean A0I = false;
    public String A0H = "unknown";
    public Qoq A0C = Qoq.A03;
    public final Map A0M = AnonymousClass001.A0u();
    public final TextWatcher A0K = new FWn(this, 20);

    public static void A12(DynamicDescriptorMainActivity dynamicDescriptorMainActivity) {
        Map map = dynamicDescriptorMainActivity.A0M;
        if (map.containsKey(dynamicDescriptorMainActivity.A0C)) {
            C06c A0D = 7zU.A0D(dynamicDescriptorMainActivity);
            A0D.A0M(((F9s) map.get(dynamicDescriptorMainActivity.A0C)).A04(), 2131363550);
            A0D.A06 = 4097;
            A0D.A05();
        }
    }

    public static void A15(DynamicDescriptorMainActivity dynamicDescriptorMainActivity) {
        Map map = dynamicDescriptorMainActivity.A0M;
        int i = 8;
        if (map.containsKey(dynamicDescriptorMainActivity.A0C) && !dynamicDescriptorMainActivity.A0I) {
            F9s f9s = (F9s) map.get(dynamicDescriptorMainActivity.A0C);
            i = ((f9s instanceof E4v) || !((f9s instanceof E4u) || (f9s instanceof E4w))) ? 0 : 8;
        }
        dynamicDescriptorMainActivity.A00.setVisibility(i);
        dynamicDescriptorMainActivity.A0D.setVisibility(i);
        dynamicDescriptorMainActivity.A0E.setVisibility(i);
    }

    public static void A16(DynamicDescriptorMainActivity dynamicDescriptorMainActivity) {
        int i;
        Map map = dynamicDescriptorMainActivity.A0M;
        if (map.containsKey(dynamicDescriptorMainActivity.A0C)) {
            F9s f9s = (F9s) map.get(dynamicDescriptorMainActivity.A0C);
            i = ((f9s instanceof E4v) || (f9s instanceof E4u) || !(f9s instanceof E4w)) ? 0 : 4;
        } else {
            i = 8;
        }
        dynamicDescriptorMainActivity.A09.setVisibility(i);
    }

    public static void A1D(DynamicDescriptorMainActivity dynamicDescriptorMainActivity) {
        StepProgressIndicator stepProgressIndicator = dynamicDescriptorMainActivity.A0A;
        int length = Qoq.values().length;
        if (length > 0) {
            stepProgressIndicator.A01 = length;
        }
        StepProgressIndicator stepProgressIndicator2 = dynamicDescriptorMainActivity.A0A;
        int ordinal = dynamicDescriptorMainActivity.A0C.ordinal() + 1;
        if (stepProgressIndicator2.A01 > 0) {
            stepProgressIndicator2.A00 = ordinal;
            stepProgressIndicator2.invalidate();
        }
    }

    public static void A1F(DynamicDescriptorMainActivity dynamicDescriptorMainActivity, boolean z) {
        LithoView lithoView = dynamicDescriptorMainActivity.A0J;
        QDk qDk = new QDk(lithoView.A09, new QMC());
        Qoq qoq = dynamicDescriptorMainActivity.A0C;
        QMC qmc = qDk.A01;
        qmc.A00 = qoq;
        BitSet bitSet = qDk.A02;
        bitSet.set(2);
        qmc.A01 = dynamicDescriptorMainActivity.A0M;
        bitSet.set(0);
        qmc.A02 = z;
        bitSet.set(1);
        C1rs.A03(bitSet, qDk.A03);
        qDk.A0J();
        lithoView.A0y(qmc);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbF.A0C(412873616736935L);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2l() {
        super.A2l();
        int i = 0;
        if (((F6A) this.A07.get()).A02) {
            i = -1;
        }
        setResult(i);
        DLP dlp = this.A0F;
        if (dlp != null) {
            dlp.A03(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v116, types: [X.1rs, X.Drc] */
    /* JADX WARN: Type inference failed for: r0v99, types: [X.Drb, X.1rs] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String[] split;
        super.A2y(bundle);
        setContentView(2132541824);
        Window window = getWindow();
        View decorView = window.getDecorView();
        window.setStatusBarColor(getColor(2132213994));
        decorView.setSystemUiVisibility(8192);
        DynamicDescriptorParams dynamicDescriptorParams = (DynamicDescriptorParams) getIntent().getParcelableExtra("dynamic_descriptor_params");
        this.A0B = dynamicDescriptorParams;
        if (dynamicDescriptorParams == null) {
            finish();
            return;
        }
        String stringExtra = getIntent().getStringExtra("dynamic_descriptor_entry_point");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.A0H = stringExtra;
        }
        String str = (String) getIntent().getSerializableExtra("dynamic_descriptor_step");
        Qoq qoq = Qoq.A03;
        if (str != null) {
            switch (str.hashCode()) {
                case -604548089:
                    if (str.equals("IN_PROGRESS")) {
                        qoq = Qoq.A04;
                        break;
                    }
                    break;
                case 758319692:
                    if (str.equals("RETRIES_EXCEEDED")) {
                        qoq = Qoq.A02;
                        ((F6A) this.A07.get()).A01 = true;
                        ((F6A) this.A07.get()).A02 = false;
                        break;
                    }
                    break;
            }
            DynamicDescriptorParams dynamicDescriptorParams2 = this.A0B;
            if (dynamicDescriptorParams2 != null && (split = dynamicDescriptorParams2.A05.split("/")) != null && split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int i = Calendar.getInstance().get(1);
                    int i2 = Calendar.getInstance().get(2);
                    if (parseInt2 < i || (parseInt2 == i && parseInt < i2)) {
                        qoq = Qoq.A02;
                        ((F6A) this.A07.get()).A01 = true;
                        ((F6A) this.A07.get()).A02 = false;
                    }
                } catch (NumberFormatException e) {
                    0fH.A0r("DynamicDescriptorMainActivity", "Could not parse date: ", e);
                }
            }
        }
        this.A0C = qoq;
        if (this.A0B != null) {
            Map map = this.A0M;
            C1F6 A0P = AbF.A0P(this.A03);
            DynamicDescriptorParams dynamicDescriptorParams3 = this.A0B;
            String str2 = this.A0H;
            Context A01 = FbInjector.A01();
            AbL.A0y(A0P);
            try {
                F9s f9s = new F9s(dynamicDescriptorParams3, str2);
                1Bn.A0K();
                FbInjector.A04(A01);
                map.put(qoq, f9s);
                Qoq qoq2 = Qoq.A01;
                C1F6 A0P2 = AbF.A0P(this.A01);
                DynamicDescriptorParams dynamicDescriptorParams4 = this.A0B;
                String str3 = this.A0H;
                Context A012 = FbInjector.A01();
                AbL.A0y(A0P2);
                E4x e4x = new E4x(dynamicDescriptorParams4, str3);
                1Bn.A0K();
                FbInjector.A04(A012);
                map.put(qoq2, e4x);
                Qoq qoq3 = Qoq.A04;
                C1F6 A0P3 = AbF.A0P(this.A04);
                DynamicDescriptorParams dynamicDescriptorParams5 = this.A0B;
                String str4 = this.A0H;
                Context A013 = FbInjector.A01();
                AbL.A0y(A0P3);
                E4v e4v = new E4v(A0P3, dynamicDescriptorParams5, str4);
                1Bn.A0K();
                FbInjector.A04(A013);
                map.put(qoq3, e4v);
                Qoq qoq4 = Qoq.A02;
                C1F6 A0P4 = AbF.A0P(this.A02);
                DynamicDescriptorParams dynamicDescriptorParams6 = this.A0B;
                String str5 = this.A0H;
                A01 = FbInjector.A01();
                AbL.A0y(A0P4);
                E4w e4w = new E4w(A0P4, dynamicDescriptorParams6, str5);
                1Bn.A0K();
                FbInjector.A04(A01);
                map.put(qoq4, e4w);
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A01);
                throw th;
            }
        }
        this.A0J = (LithoView) findViewById(2131363548);
        this.A08 = (LithoView) findViewById(2131363545);
        this.A0A = findViewById(2131363555);
        this.A0D = (FbTextView) findViewById(2131363542);
        this.A0E = (FbTextView) findViewById(2131363543);
        this.A00 = (FbDraweeView) findViewById(2131363544);
        this.A0G = (BetterTextView) findViewById(2131363549);
        this.A09 = (LithoView) findViewById(2131363551);
        Ra6 A00 = Ra6.A00();
        A00.A01(this.A0C);
        A00.A01.add(new Eeh(this));
        View A002 = Qyd.A00(this);
        if (A002 != null) {
            DLP dlp = new DLP(A002, false);
            this.A0F = dlp;
            dlp.A02(this);
        }
        Qoq qoq5 = this.A0C;
        Qoq qoq6 = Qoq.A04;
        A1F(this, 1BK.A1V(qoq5, qoq6));
        LithoView lithoView = this.A08;
        1Iw r0 = lithoView.A09;
        QKL qkl = new QKL();
        ?? c1rs = new C1rs(qkl, r0, 0, 0);
        c1rs.A01 = qkl;
        c1rs.A00 = r0;
        qkl.A00 = FXq.A00(this, 9);
        c1rs.A0J();
        lithoView.A0y(c1rs.A01);
        LithoView lithoView2 = this.A09;
        1Iw r02 = lithoView2.A09;
        QKM qkm = new QKM();
        ?? c1rs2 = new C1rs(qkm, r02, 0, 0);
        c1rs2.A01 = qkm;
        c1rs2.A00 = r02;
        qkm.A00 = FXq.A00(this, 8);
        c1rs2.A0J();
        lithoView2.A0y(c1rs2.A01);
        A16(this);
        StepProgressIndicator stepProgressIndicator = this.A0A;
        int length = Qoq.values().length;
        if (length > 0) {
            stepProgressIndicator.A01 = length;
        }
        A1D(this);
        DynamicDescriptorParams dynamicDescriptorParams7 = this.A0B;
        if (dynamicDescriptorParams7 != null) {
            this.A0E.setText(0Pz.A0j(dynamicDescriptorParams7.A04, " ", dynamicDescriptorParams7.A0B.equalsIgnoreCase("p2p_send") ? "" : dynamicDescriptorParams7.A0C));
            DKH.A0v(this, this.A0D, this.A0B.A05, 2131953844);
            if (!TextUtils.isEmpty(this.A0B.A06)) {
                this.A00.A0G(DKH.A0A(this.A0L, this.A0B.A06), A0N);
                this.A00.A0M(InterfaceC07034in.A04);
            }
            A15(this);
        }
        this.A0G.setVisibility(DKG.A00(FI2.A02(this.A06) ? 1 : 0));
        Map map2 = this.A0M;
        if (map2.get(qoq6) != null) {
            ((E4v) map2.get(qoq6)).A00 = this.A0K;
        }
        A12(this);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A03 = 1BV.A00(727);
        this.A01 = 1BV.A00(725);
        this.A04 = 7zL.A0R(this, 728);
        this.A05 = 1BV.A00(98470);
        this.A06 = DKD.A0V();
        this.A02 = 7zL.A0R(this, 726);
        this.A07 = AbF.A0Q(this, 99424);
    }

    @Override // X.GJe
    public void CM7() {
        this.A0I = false;
        A15(this);
    }

    @Override // X.GJe
    public void CM8(int i) {
    }

    @Override // X.GJe
    public void CM9(int i) {
        this.A0I = true;
        A15(this);
    }
}

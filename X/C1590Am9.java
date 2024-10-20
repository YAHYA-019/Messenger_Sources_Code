package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Am9, reason: case insensitive filesystem */
/* loaded from: Am9.class */
public final class C1590Am9 extends 1pK implements DHT, DFl {
    public static final String __redex_internal_original_name = "MessageSearchM4MessageListFragment";
    public LithoView A00;
    public ThreadKey A01;
    public ThreadSummary A02;
    public CIH A03;
    public FbUserSession A04;
    public C00i A05;
    public C1qb A06;
    public 2YJ A07;
    public CMo A08;
    public C9Z A09;
    public String A0A;
    public final C00i A0D = AbH.A0X();
    public final C00i A0C = AbH.A0c(this);
    public final 1Hz A0B = AbF.A10();
    public final DEO A0E = new CsC(this, 5);

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(C1590Am9 c1590Am9) {
        B0t b0t;
        if (c1590Am9.A0A == null || c1590Am9.A02 == null || c1590Am9.A09 == null || c1590Am9.A00 == null || c1590Am9.A07 == null || c1590Am9.A06 == null) {
            return;
        }
        boolean A1W = AbK.A1W(c1590Am9.A05);
        LithoView lithoView = c1590Am9.A00;
        C2ki A00 = C2kV.A00(c1590Am9.A06);
        B2K b2k = new B2K();
        C00i c00i = c1590Am9.A0C;
        b2k.A05 = AbF.A0p(c00i);
        b2k.A07 = c1590Am9.A0A;
        ThreadSummary threadSummary = c1590Am9.A02;
        b2k.A02 = threadSummary;
        b2k.A08 = AbK.A17(threadSummary);
        C00i c00i2 = c1590Am9.A0D;
        b2k.A0A = C1gb.A01(c00i2).AZk(36316684383496637L);
        b2k.A09 = A1W;
        DEO deo = c1590Am9.A0E;
        b2k.A04 = deo;
        b2k.A03 = c1590Am9.A09;
        b2k.A01 = c1590Am9.A07;
        b2k.A06 = c1590Am9.A0B;
        b2k.A00 = c1590Am9.A04;
        A00.A2d(b2k);
        A00.A2j(true);
        C2kV c2kV = A00.A01;
        c2kV.A0a = true;
        8TA A002 = C8nk.A00(c1590Am9.A06);
        A002.A2Y((MigColorScheme) 7zO.A0l(c1590Am9, 16979));
        A00.A2c(A002.A2W());
        2cM A0e = AbG.A0e(c1590Am9.A06);
        2KD A0Y = 7zN.A0Y(c1590Am9.A06, false);
        7zP.A1K(A0Y, 2131954898);
        A0Y.A2x((MigColorScheme) 7zO.A0l(c1590Am9, 16979));
        A0Y.A2X();
        A0Y.A0L();
        A0e.A2d(A0Y);
        c2kV.A0B = A0e.A2V();
        if (C1gb.A01(c00i2).AZk(36316684383496637L)) {
            C1qb c1qb = c1590Am9.A06;
            String str = c1590Am9.A0A;
            C1911Awc A06 = C1911Awc.A06(c1qb, AbF.A0p(c00i), true);
            b0t = A06.A01;
            b0t.A07 = deo;
            int i = 2131965542;
            if (A1W) {
                i = 2131965525;
            }
            A06.A2W(i);
            b0t.A09 = str;
            C1rs.A03(A06.A02, A06.A03);
            A06.A0J();
        } else {
            b0t = null;
        }
        A00.A2b(b0t);
        A00.A0R();
        lithoView.A0x(A00.A2W());
    }

    public 1iF A1R() {
        return AbL.A0A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A05 = 1BQ.A02(33196);
        this.A04 = 1BL.A0G(this);
        if (bundle != null) {
            this.A0A = bundle.getString("query_key");
            ThreadKey A0k = AbH.A0k(bundle);
            this.A01 = A0k;
            if (A0k != null) {
                LiveData ASY = ((C5xl) 1Bi.A03(67528)).ASY(this.A01);
                ASY.observe(this, new CaD(this, ASY, 40));
            }
        }
    }

    public ImmutableList AqG() {
        ImmutableList A01;
        if (this.A03 == null) {
            A01 = ImmutableList.of();
        } else {
            A01 = this.A03.A01(this.A0B.A07().asList());
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = A01.iterator();
        while (it.hasNext()) {
            AbL.A17(builder, it);
        }
        return builder.build();
    }

    @Override // X.DFl
    public void BOx(CMo cMo, C8o c8o, C9Z c9z) {
        this.A09 = c9z;
        c9z.A02 = this;
        this.A08 = cMo;
        this.A07 = CMo.A01(cMo, __redex_internal_original_name).A00;
        CIH cih = CMo.A01(this.A08, __redex_internal_original_name).A01;
        this.A03 = cih;
        cih.A02();
        this.A08.A02(__redex_internal_original_name, true);
    }

    public void Cta(ThreadSummary threadSummary, String str, int i) {
        this.A0A = str;
        this.A02 = threadSummary;
        this.A01 = threadSummary.A0n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1191214342);
        LithoView A0O = AbK.A0O(this);
        this.A00 = A0O;
        this.A06 = new C1qb(A0O.A09);
        A03(this);
        C9Z c9z = this.A09;
        if (c9z != null) {
            c9z.A02 = this;
        }
        LithoView lithoView = this.A00;
        0FI.A08(-950600345, A02);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(48774223);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        C9Z c9z = this.A09;
        if (c9z != null) {
            c9z.A02 = null;
        }
        CMo cMo = this.A08;
        if (cMo != null) {
            cMo.A02(__redex_internal_original_name, false);
        }
        this.A00 = null;
        0FI.A08(224009500, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.A0A;
        if (str != null) {
            bundle.putString("query_key", str);
        }
        ThreadKey threadKey = this.A01;
        if (threadKey != null) {
            AbF.A1J(bundle, threadKey);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View view2 = this.mView;
        if (view2 != null) {
            MigColorScheme.A00(view2, AbK.A0h(this));
        }
        CxA.A00(this, AbJ.A0d(), 18);
    }
}

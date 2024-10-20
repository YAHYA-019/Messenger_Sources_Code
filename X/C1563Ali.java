package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.fb.fragment.LoggingConfiguration;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Ali, reason: case insensitive filesystem */
/* loaded from: Ali.class */
public final class C1563Ali extends 1pK implements 1pN {
    public static final String __redex_internal_original_name = "PreviewPhotoProfilePictureFragment";
    public FbUserSession A00;
    public CfG A01;
    public AfV A02;
    public boolean A03;
    public final C01i A04;
    public final C01i A05;
    public final C01i A06;
    public final C01i A07;
    public final C01i A08;
    public final C01i A09;
    public final C01i A0A;

    public C1563Ali() {
        this(0);
        this.A05 = DCx.A00(this, 4);
        this.A06 = DCx.A00(this, 5);
    }

    public C1563Ali(int i) {
        this.A07 = DCx.A00(this, 0);
        this.A08 = DCx.A00(this, 1);
        this.A0A = DCx.A00(this, 3);
        this.A09 = DCx.A00(this, 2);
        this.A04 = C01g.A01(DCO.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(C1563Ali c1563Ali, int i) {
        Context context = c1563Ali.getContext();
        if (context != null) {
            c1563Ali.A04.getValue();
            DR6 A01 = C5ic.A01(context, (MigColorScheme) c1563Ali.A08.getValue());
            A01.A00(i);
            A01.A06(2131963911);
            A01.A0D(CRV.A00, 2131963907);
            A01.A05();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(C1563Ali c1563Ali, boolean z) {
        if (c1563Ali.getContext() != null) {
            7zQ.A0Q().CY3(new D7F(c1563Ali, z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1B(Bundle bundle) {
        super.A1B(bundle);
        AfV afV = new ViewModelProvider((ViewModelStoreOwner) this, (ViewModelProvider.Factory) 7zO.A0l(this, 83377)).get(AfV.class);
        this.A02 = afV;
        if (afV == null) {
            11T.A0L("viewModel");
            throw 0Q8.createAndThrow();
        }
        afV.A00.observe(this, new CaF(this));
        6tW r0 = (6tW) this.A05.getValue();
        Context context = getContext();
        EA8 ea8 = new EA8();
        ((5TY) ea8).A00 = context.getApplicationContext();
        r0.A05(this, LoggingConfiguration.A00(__redex_internal_original_name).A00(), ea8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        FbUserSession A01 = 1BM.A01(this);
        11T.A0F(A01, 0);
        this.A00 = A01;
    }

    public 2cL A1X(1Iw r302) {
        2cM A00 = 2cK.A00(r302);
        C5yw A002 = C5yv.A00(r302);
        A002.A2a(2131954791);
        C01i c01i = this.A08;
        A002.A2b((MigColorScheme) c01i.getValue());
        A002.A2i(false);
        A002.A2Y();
        CxE.A01(A002, this, 9);
        A002.A0N();
        AbH.A1Q(A00, A002);
        A00.A2e(new AxL((Uri) this.A06.getValue(), r302, (MigColorScheme) c01i.getValue(), new DCx(this, 7)));
        A00.A2N(true);
        return A00.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        DCx dCx = new DCx(this, 8);
        this.A04.getValue();
        DR6 A01 = C5ic.A01(requireContext(), (MigColorScheme) this.A08.getValue());
        A01.A00(2131955813);
        A01.A06(2131955810);
        CSG.A05(A01, dCx, 22, 2131955812);
        A01.A0B(CRW.A00, 2131955811);
        A01.A05();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(2070695032);
        1Iw A0T = 7zP.A0T(this);
        C01i c01i = this.A07;
        if (((LithoView) c01i.getValue()).A00 == null) {
            ((LithoView) c01i.getValue()).A0x(A1X(A0T));
        }
        MigColorScheme.A00((View) c01i.getValue(), (MigColorScheme) this.A08.getValue());
        7zR.A11((View) c01i.getValue());
        View view = (View) c01i.getValue();
        0FI.A08(1771500014, A02);
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1891385199);
        super/*androidx.fragment.app.Fragment*/.onResume();
        View view = this.mView;
        if (view != null) {
            view.requestLayout();
        }
        0FI.A08(856168423, A02);
    }
}

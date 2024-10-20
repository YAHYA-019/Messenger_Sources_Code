package X;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.util.colors.MontageBackgroundColor;
import com.facebook.widget.CustomFrameLayout;

/* renamed from: X.Gbv, reason: case insensitive filesystem */
/* loaded from: Gbv.class */
public final class C2393Gbv extends 1pK implements JOH {
    public static final String __redex_internal_original_name = "CanvasBasePaletteFragment";
    public FbUserSession A00;
    public I9K A01;
    public MontageBackgroundColor A02;
    public View A03;
    public final 1Br A05 = 1Bq.A00(115988);
    public final 1Br A04 = 1BK.A0E();
    public final 1Br A06 = 1Bu.A00(115510);

    public 1iF A1R() {
        return AbF.A0C(366696498039554L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = 1BM.A01(this);
    }

    public final MontageBackgroundColor A1X() {
        MontageBackgroundColor montageBackgroundColor = this.A02;
        if (montageBackgroundColor == null) {
            montageBackgroundColor = ((I2E) 1Br.A0B(this.A05)).A01;
            this.A02 = montageBackgroundColor;
            if (montageBackgroundColor == null) {
                11T.A0L("currentBackgroundColor");
                throw 0Q8.createAndThrow();
            }
        }
        return montageBackgroundColor;
    }

    public final void A1Y(MontageBackgroundColor montageBackgroundColor) {
        11T.A0F(montageBackgroundColor, 0);
        this.A02 = montageBackgroundColor;
        View view = this.A03;
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, montageBackgroundColor.A01);
            gradientDrawable.setShape(0);
            view.setBackground(gradientDrawable);
        }
    }

    public C6x7 AbZ() {
        return C6x7.A03;
    }

    public C6x1 Aba() {
        return C6x1.A06;
    }

    public boolean Bkd() {
        return false;
    }

    public void Bn9() {
        I9K i9k = this.A01;
        if (i9k != null) {
            IQ1 iq1 = i9k.A00;
            CallerContext callerContext = IQ1.A1m;
            GOp.A0m(iq1).markerEnd(5505156, (short) 4);
            Hyv.A00(iq1.A1I);
            IFl iFl = iq1.A1C;
            DKG.A1J(iFl.A0C);
            IWN iwn = iq1.A1Q;
            iwn.CWr();
            iwn.CzY();
            iFl.A0Q();
        }
        MontageBackgroundColor montageBackgroundColor = this.A02;
        if (montageBackgroundColor != null) {
            C00i c00i = this.A05.A00;
            if (montageBackgroundColor.equals(((I2E) c00i.get()).A01)) {
                return;
            }
            A1Y(((I2E) c00i.get()).A01);
        }
    }

    public void BqH(H9e h9e) {
    }

    public void BqI(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1097710563);
        CustomFrameLayout customFrameLayout = new CustomFrameLayout(getContext());
        this.A03 = customFrameLayout;
        7zR.A11(customFrameLayout);
        4tA r0 = (4tA) 1Br.A0B(this.A06);
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        4tA.A00(fbUserSession, r0, Ini.A01(new IWF(this), 23));
        View view = this.A03;
        if (view == null) {
            view = new View(getContext());
        }
        0FI.A08(-1965856313, A02);
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(33858883);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A03 = null;
        0FI.A08(1538828870, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        MontageBackgroundColor montageBackgroundColor = this.A02;
        if (montageBackgroundColor != null) {
            bundle.putParcelable("bg_color", montageBackgroundColor);
        }
        super.onSaveInstanceState(bundle);
    }
}

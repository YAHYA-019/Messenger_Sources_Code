package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Akj, reason: case insensitive filesystem */
/* loaded from: Akj.class */
public final class C1530Akj extends 1pK {
    public static final String __redex_internal_original_name = "SafeWebsiteBrowsingFragment";
    public 1pI A00;
    public CFA A01;
    public final 1Br A02 = 1Bu.A00(84194);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A01 = new CFA(7zM.A0C(this, 147777), 1BM.A01(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1X() {
        String str;
        BtR btR = (BtR) 1Br.A0B(this.A02);
        CFA cfa = this.A01;
        if (cfa == null) {
            str = "presenter";
        } else {
            Context requireContext = requireContext();
            Cvm cvm = new Cvm(requireContext, cfa, 39);
            QAG qag = new QAG(new CZE(requireContext, cfa, 55), cvm, CxE.A00(cfa, 95), ((C3J) 1Br.A0B(cfa.A04)).A00());
            LithoView lithoView = btR.A00;
            str = "lithoView";
            if (lithoView != null) {
                11T.A0A(lithoView.getContext());
                MigColorScheme migColorScheme = btR.A01;
                if (migColorScheme != null) {
                    C00i c00i = btR.A03.A00;
                    String A0t = 4YU.A0t(AbG.A06(c00i), 2131963824);
                    View.OnClickListener onClickListener = qag.A00;
                    CFx cFx = (CFx) 1Br.A0B(btR.A02);
                    LithoView lithoView2 = btR.A00;
                    if (lithoView2 != null) {
                        Context A08 = 4YU.A08(lithoView2);
                        MigColorScheme migColorScheme2 = btR.A01;
                        if (migColorScheme2 != null) {
                            EC2 A01 = cFx.A01(A08, onClickListener, migColorScheme2);
                            0Dc r0 = new 0Dc(AbG.A06(c00i));
                            r0.A01(2131965412);
                            r0.A05(A01, "%1$s", 4YU.A0t(AbG.A06(c00i), 2131968131), 33);
                            1LI qhh = new QHH(7zM.A0E(r0), qag, migColorScheme, A0t);
                            LithoView lithoView3 = btR.A00;
                            if (lithoView3 != null) {
                                lithoView3.A0y(qhh);
                                return;
                            }
                        }
                    }
                }
                str = "colorScheme";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1325643682);
        MigColorScheme A0S = 7zV.A0S(this);
        LithoView A0O = AbK.A0O(this);
        BtR btR = (BtR) 1Br.A0B(this.A02);
        11T.A0F(A0S, 1);
        btR.A00 = A0O;
        btR.A01 = A0S;
        0FI.A08(210711334, A02);
        return A0O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-2017726176);
        CFA cfa = this.A01;
        if (cfa == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        cfa.A00 = null;
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        0FI.A08(125159196, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-348809290);
        CFA cfa = this.A01;
        if (cfa == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        C3J c3j = (C3J) 1Br.A0B(cfa.A04);
        1G9 r0 = 1NK.A67;
        1HO r02 = cfa.A05;
        11T.A0F(r02, 1);
        1Br.A09(c3j.A01).D63(r02, 1G9.A05(r0, c3j.A00.A05));
        super/*androidx.fragment.app.Fragment*/.onPause();
        0FI.A08(-2136390317, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-176188216);
        super/*androidx.fragment.app.Fragment*/.onResume();
        CFA cfa = this.A01;
        if (cfa == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        C3J c3j = (C3J) 1Br.A0B(cfa.A04);
        1G9 r0 = 1NK.A67;
        1HO r02 = cfa.A05;
        11T.A0F(r02, 1);
        1Br.A09(c3j.A01).CcV(r02, 1G9.A05(r0, c3j.A00.A05));
        C1530Akj c1530Akj = cfa.A00;
        if (c1530Akj != null) {
            c1530Akj.A1X();
        }
        0FI.A08(-1172715871, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = 1vD.A00(view);
        CFA cfa = this.A01;
        if (cfa == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        cfa.A00 = this;
    }
}

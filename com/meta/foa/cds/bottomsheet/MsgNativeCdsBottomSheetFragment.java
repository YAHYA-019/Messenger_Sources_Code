package com.meta.foa.cds.bottomsheet;

import X.03Y;
import X.06Z;
import X.0D2;
import X.0FI;
import X.0Q8;
import X.0S2;
import X.0SG;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1iF;
import X.1lN;
import X.1pN;
import X.2Ov;
import X.2jQ;
import X.4YU;
import X.AbF;
import X.AnonymousClass001;
import X.DKF;
import X.DMU;
import X.DMz;
import X.DOi;
import X.DPv;
import X.DQE;
import X.EIm;
import X.EIn;
import X.EIo;
import X.EIp;
import X.EIq;
import X.EIr;
import X.EIs;
import X.EL9;
import X.EP2;
import X.EU5;
import X.EZa;
import X.Eki;
import X.EoS;
import X.Ey8;
import X.F6E;
import X.FIX;
import X.FJ1;
import X.FZd;
import X.FZt;
import X.FyF;
import X.G1Y;
import X.G1Z;
import X.GDy;
import X.GE0;
import X.GHH;
import X.GHK;
import X.GHO;
import X.GL4;
import X.GLd;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.dsp.core.ColorData;
import java.util.Iterator;

/* loaded from: MsgNativeCdsBottomSheetFragment.class */
public final class MsgNativeCdsBottomSheetFragment extends 2Ov implements 1lN, GLd, GHO, 2jQ, 1pN, GE0 {
    public F6E A00;
    public FZt A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public int A05;
    public FJ1 A06;
    public boolean A08;
    public final 1Br A09 = 1Bu.A00(16838);
    public final GDy A0A = new FZd(this);
    public Integer A07 = 0S2.A0C;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(MsgNativeCdsBottomSheetFragment msgNativeCdsBottomSheetFragment) {
        06Z parentFragmentManager = msgNativeCdsBottomSheetFragment.getParentFragmentManager();
        if (msgNativeCdsBottomSheetFragment.A08 && parentFragmentManager.A0U() == 1) {
            FragmentActivity activity = msgNativeCdsBottomSheetFragment.getActivity();
            if (activity != null) {
                activity.finishAfterTransition();
                return;
            }
            return;
        }
        if (parentFragmentManager.A0U() > 0 && !parentFragmentManager.A0B) {
            parentFragmentManager.A0w();
            return;
        }
        FragmentActivity activity2 = msgNativeCdsBottomSheetFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
            activity2.overridePendingTransition(2130771994, 2130771997);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        String str;
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            str = "bottomSheetDelegate";
        } else {
            Context requireContext = requireContext();
            FZt fZt = this.A01;
            if (fZt != null) {
                DMU A0B = fj1.A0B(requireContext, this, fZt);
                11T.A0A(A0B);
                return A0B;
            }
            str = "openScreenConfig";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void A0w() {
        super.A0w();
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        EoS eoS = (EoS) fj1.A0G.peek();
        if (eoS != null) {
            eoS.A03.resume();
        }
    }

    public void A0z() {
        super.A0z();
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        EoS eoS = (EoS) fj1.A0G.peek();
        if (eoS != null) {
            eoS.A03.pause();
        }
    }

    public 1iF A17() {
        return AbF.A0C(170859388332670L);
    }

    @Override // X.GLd
    public boolean AHn(String str) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        Iterator it = fj1.A0G.iterator();
        while (it.hasNext()) {
            if (GL4.A00((EoS) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.GLd
    public void ANk(EIn eIn, Runnable runnable) {
        String str;
        FZt fZt = this.A01;
        if (fZt == null) {
            str = "openScreenConfig";
        } else {
            if (fZt.A0D == EP2.A05) {
                A05(this);
            }
            FJ1 fj1 = this.A06;
            if (fj1 != null) {
                fj1.A0O(eIn, runnable);
                return;
            }
            str = "bottomSheetDelegate";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.GLd
    public View ASl(String str) {
        11T.A0F(str, 0);
        FJ1 fj1 = this.A06;
        if (fj1 != null) {
            return fj1.A08(str);
        }
        DKF.A0z();
        throw 0Q8.createAndThrow();
    }

    public String AWg() {
        String str;
        F6E f6e = this.A00;
        if (f6e == null) {
            str = "platformBehaviorManager";
        } else {
            GHH ghh = f6e.A01;
            if (ghh != null) {
                Ey8 AWb = ghh.AWb();
                return AWb != null ? AWb.A00 : "";
            }
            str = "behavior";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public Long Am7() {
        String str;
        F6E f6e = this.A00;
        if (f6e == null) {
            str = "platformBehaviorManager";
        } else {
            GHH ghh = f6e.A01;
            if (ghh != null) {
                return ghh.AWb() != null ? 170859388332670L : null;
            }
            str = "behavior";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.GLd
    public EP2 Ay0() {
        FZt fZt = this.A01;
        if (fZt != null) {
            return fZt.A0D;
        }
        11T.A0L("openScreenConfig");
        throw 0Q8.createAndThrow();
    }

    public String AyB() {
        String str;
        F6E f6e = this.A00;
        if (f6e == null) {
            str = "platformBehaviorManager";
        } else {
            GHH ghh = f6e.A01;
            if (ghh != null) {
                Ey8 AWb = ghh.AWb();
                return AWb != null ? AWb.A01 : "";
            }
            str = "behavior";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.GLd
    public GHH B39(EL9 el9) {
        11T.A0F(el9, 0);
        F6E f6e = this.A00;
        if (f6e == null) {
            11T.A0L("platformBehaviorManager");
            throw 0Q8.createAndThrow();
        }
        03Y r303 = (03Y) f6e.A04.get(el9);
        if (r303 == null) {
            r303 = F6E.A00((Bundle) null, f6e, el9);
        }
        return (GHH) r303.first;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public Window BKo() {
        FJ1 fj1 = this.A06;
        if (fj1 != null) {
            return fj1.A09(requireContext());
        }
        DKF.A0z();
        throw 0Q8.createAndThrow();
    }

    @Override // X.GLd
    public void BPf(GL4 gl4, EIr eIr, String str) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0N(gl4, eIr, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0F(requireContext());
        return true;
    }

    public void CAV(float f) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0D(f);
    }

    @Override // X.GE0
    public void CGY(int i) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0E(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void CVS(GL4 gl4, EIs eIs) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        Context requireContext = requireContext();
        Integer num = 0S2.A00;
        int i = eIs.A00;
        FJ1.A01(requireContext, fj1, gl4, eIs.A00, eIs.A01, num, i, eIs.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CWY(ColorData colorData) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        requireContext();
        fj1.A0K(colorData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void CXk(EIo eIo) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0J(requireContext(), eIo, (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void CXm(String str) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0J(requireContext(), new EIo((Integer) null), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void CZs(GL4 gl4, EIm eIm) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0H(requireContext(), gl4, eIm);
    }

    @Override // X.GLd
    public void Cdo(String str) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0R(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void Cfp(GL4 gl4, EIp eIp, String str) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0I(requireContext(), gl4, eIp, str);
    }

    @Override // X.GLd
    public void Cnj(Drawable drawable) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        DPv dPv = fj1.A04;
        if (dPv != null) {
            if (drawable == null) {
                DOi dOi = dPv.A06;
                if (dOi != null) {
                    dOi.setVisibility(0);
                }
                DOi dOi2 = dPv.A06;
                if (dOi2 != null) {
                    Drawable drawable2 = dOi2.A00;
                    if (drawable2 instanceof DMz) {
                        drawable2.setVisible(true, true);
                    }
                }
                DQE dqe = dPv.A09;
                if (dqe != null) {
                    dqe.setImageDrawable(null);
                    dqe.setVisibility(8);
                    return;
                }
                return;
            }
            DQE dqe2 = dPv.A09;
            if (dqe2 != null) {
                dqe2.setImageDrawable(drawable);
            }
            DQE dqe3 = dPv.A09;
            if (dqe3 != null) {
                dqe3.setVisibility(0);
            }
            DOi dOi3 = dPv.A06;
            if (dOi3 != null) {
                dOi3.setVisibility(8);
                Drawable drawable3 = dOi3.A00;
                if (drawable3 instanceof DMz) {
                    drawable3.setVisible(false, true);
                }
            }
        }
    }

    @Override // X.GLd
    public void CqN(boolean z) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        DMU dmu = fj1.A08;
        if (dmu != null) {
            dmu.A09.A0B = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void D6J(EIq eIq, String str) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        Context requireContext = requireContext();
        if (fj1.A0G.size() != 1) {
            FJ1.A02(requireContext, fj1, eIq.A00, str);
        }
    }

    @Override // X.GLd
    public void D6b(GHK ghk) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        EoS eoS = (EoS) fj1.A0G.peek();
        if (eoS != null) {
            eoS.A01 = ghk;
        }
    }

    @Override // X.GLd
    public void D6e(ColorData colorData, EP2 ep2) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0L(colorData, ep2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void D7O(ColorData colorData, float f) {
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        requireContext();
        fj1.A0M(colorData, Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(-1294137964);
        super.onCreate(bundle);
        if (bundle == null) {
            Bundle requireArguments = requireArguments();
            this.A08 = requireArguments.getBoolean("shared_element_enabled", false);
            Bundle bundle2 = requireArguments.getBundle("open_sheet_config");
            if (bundle2 == null) {
                IllegalStateException A0N = AnonymousClass001.A0N("Open sheet config should be present in the bundle with 'open_sheet_config' key");
                0FI.A08(-1691366929, A02);
                throw A0N;
            }
            FZt A00 = FZt.A0N.A00(bundle2);
            this.A01 = A00;
            String str = "openScreenConfig";
            this.A07 = A00.A0E;
            this.A06 = new FJ1((Eki) null);
            F6E f6e = new F6E(this);
            this.A00 = f6e;
            FJ1 fj1 = this.A06;
            if (fj1 == null) {
                str = "bottomSheetDelegate";
            } else {
                fj1.A05 = f6e;
                if (requireArguments.getBoolean("new_full_screen_activity")) {
                    FZt fZt = this.A01;
                    if (fZt != null) {
                        if (fZt.A0D == EP2.A05) {
                            String string = requireArguments.getString("renders_in_unsafe_area", "none");
                            11T.A0A(string);
                            this.A04 = EU5.A00(string);
                        }
                    }
                }
                i = 76255261;
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        A0o();
        this.A01 = FIX.A03();
        this.A06 = new FJ1((Eki) null);
        i = 1213263748;
        0FI.A08(i, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = 0FI.A02(1353717453);
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            str = "bottomSheetDelegate";
        } else {
            Context requireContext = requireContext();
            FZt fZt = this.A01;
            if (fZt != null) {
                Context context = getContext();
                boolean z = false;
                if (context != null && (4YU.A0B(context).screenLayout & 15) >= 3) {
                    z = true;
                }
                DPv A0A = fj1.A0A(requireContext, this.A0A, fZt, z);
                11T.A0A(A0A);
                if (this.A08) {
                    0SG.A00(A0A, new G1Y(this));
                }
                0FI.A08(1025763175, A02);
                return A0A;
            }
            str = "openScreenConfig";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(626698938);
        super.onDestroy();
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0G(requireContext());
        0FI.A08(1189585149, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        Window window;
        Window window2;
        int A02 = 0FI.A02(1036129312);
        super.onDestroyView();
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            DKF.A0z();
            throw 0Q8.createAndThrow();
        }
        fj1.A0C();
        FragmentActivity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            window2.setSoftInputMode(this.A05);
        }
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(this.A05);
        }
        0FI.A08(1217551031, A02);
    }

    public void onDetach() {
        String str;
        int A02 = 0FI.A02(1025882701);
        super/*X.0D2*/.onDetach();
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            str = "bottomSheetDelegate";
        } else {
            FZt fZt = this.A01;
            if (fZt != null) {
                fj1.A0P(fZt);
                0FI.A08(1572003299, A02);
                return;
            }
            str = "openScreenConfig";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void onStart() {
        String str;
        int A02 = 0FI.A02(-912133232);
        super/*X.0D2*/.onStart();
        FJ1 fj1 = this.A06;
        if (fj1 == null) {
            str = "bottomSheetDelegate";
        } else {
            FZt fZt = this.A01;
            if (fZt != null) {
                fj1.A0Q(fZt);
                EZa.A00.post(new G1Z(this));
                0FI.A08(-577110625, A02);
                return;
            }
            str = "openScreenConfig";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        Window window;
        Integer num;
        int A02 = 0FI.A02(-537297796);
        super/*X.0D2*/.onStop();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && ((num = this.A04) == 0S2.A00 || num == 0S2.A0C)) {
            FZt fZt = this.A01;
            if (fZt == null) {
                11T.A0L("openScreenConfig");
                throw 0Q8.createAndThrow();
            }
            if (fZt.A0D == EP2.A05) {
                Integer num2 = this.A03;
                if (num2 != null) {
                    window.getDecorView().setVisibility(num2.intValue());
                }
                Integer num3 = this.A02;
                if (num3 != null) {
                    window.setStatusBarColor(num3.intValue());
                }
            }
        }
        0FI.A08(-333985509, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        Window window2;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            this.A05 = window2.getAttributes().softInputMode;
            FZt fZt = this.A01;
            if (fZt != null) {
                if (fZt.A0D == EP2.A05 && getContext() != null) {
                    View decorView = window2.getDecorView();
                    Context requireContext = requireContext();
                    Integer num = this.A07;
                    11T.A0F(num, 1);
                    int i = 15463421;
                    if (new FyF(requireContext, num).BRZ()) {
                        i = 925742;
                    }
                    decorView.setBackgroundColor(i);
                }
            }
            11T.A0L("openScreenConfig");
            throw 0Q8.createAndThrow();
        }
        Dialog dialog = ((0D2) this).A01;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        this.A05 = window.getAttributes().softInputMode;
        FZt fZt2 = this.A01;
        if (fZt2 != null) {
            Integer num2 = fZt2.A0F;
            if (num2 != null) {
                window.setSoftInputMode(num2.intValue());
                return;
            }
            return;
        }
        11T.A0L("openScreenConfig");
        throw 0Q8.createAndThrow();
    }
}

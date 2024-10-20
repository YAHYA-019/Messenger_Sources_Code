package com.facebook.bloks.messenger.hosting.screens;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.1CO;
import X.1iF;
import X.1lN;
import X.1pI;
import X.1pN;
import X.2Od;
import X.2Ov;
import X.2jQ;
import X.AnonymousClass001;
import X.C2050DaD;
import X.DKD;
import X.DKE;
import X.DLQ;
import X.DMU;
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
import X.EUa;
import X.EZa;
import X.Ebt;
import X.Eki;
import X.EoS;
import X.ErQ;
import X.Exk;
import X.F0E;
import X.F6y;
import X.FFj;
import X.FGX;
import X.FIw;
import X.FJ1;
import X.FZc;
import X.FZf;
import X.FZo;
import X.FZt;
import X.FxJ;
import X.FyF;
import X.FzT;
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
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.bloks.foa.cds.bottomsheet.intf.CDSBloksBottomSheet;
import com.facebook.dsp.core.ColorData;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: MsgCdsBottomSheetFragment.class */
public final class MsgCdsBottomSheetFragment extends 2Ov implements 1lN, GLd, GHO, 2jQ, 1pN, GE0, 2Od {
    public static final 1CO A0H = (1CO) 1Bi.A03(16386);
    public FZt A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public int A04;
    public int A05;
    public FJ1 A06;
    public DLQ A07;
    public GL4 A08;
    public GHK A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public final 1Br A0E = 1Bu.A00(99780);
    public final 1Br A0D = 1Bu.A00(16838);
    public final GDy A0F = new FZc(this);
    public final FZf A0G = new FZf(this);

    private final FJ1 A05() {
        FJ1 fj1 = this.A06;
        if (fj1 != null) {
            return fj1;
        }
        throw AnonymousClass001.A0N("Must initialize bottom sheet delegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(MsgCdsBottomSheetFragment msgCdsBottomSheetFragment) {
        if (msgCdsBottomSheetFragment.getParentFragmentManager().A0U() <= 1) {
            FragmentActivity activity = msgCdsBottomSheetFragment.getActivity();
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(2130771994, 2130771997);
                return;
            }
            return;
        }
        String str = msgCdsBottomSheetFragment.A0B;
        if (str != null) {
            C2050DaD A1C = msgCdsBottomSheetFragment.A1C();
            11T.A0I(A1C, "null cannot be cast to non-null type com.facebook.bloks.messenger.hosting.host.MSGBloksFragmentHost");
            1pI A02 = A1C.A02();
            if (A02 != null) {
                A02.CeH(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        FJ1 A05 = A05();
        Context requireContext = requireContext();
        FZt fZt = this.A00;
        if (fZt == null) {
            11T.A0L("openScreenConfig");
            throw 0Q8.createAndThrow();
        }
        DMU A0B = A05.A0B(requireContext, this, fZt);
        11T.A0A(A0B);
        return A0B;
    }

    public 1iF A17() {
        return DKE.A0Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2050DaD A1C() {
        int i;
        Ebt ebt = (Ebt) 1Br.A0B(this.A0E);
        FZt fZt = this.A00;
        if (fZt == null) {
            11T.A0L("openScreenConfig");
            throw 0Q8.createAndThrow();
        }
        int intValue = fZt.A0E.intValue();
        if (intValue == 0) {
            i = 16980;
        } else if (intValue == 1) {
            i = 16981;
        } else {
            if (intValue != 2) {
                throw 1BK.A1F();
            }
            i = 16979;
        }
        return EUa.A00(this, ebt, (MigColorScheme) 1Bu.A02(this, i).get(), (Exk) null, (FFj) null, 24);
    }

    @Override // X.GLd
    public boolean AHn(String str) {
        Iterator it = A05().A0G.iterator();
        while (it.hasNext()) {
            if (GL4.A00((EoS) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.GLd
    public void ANk(EIn eIn, Runnable runnable) {
        FZt fZt = this.A00;
        if (fZt == null) {
            11T.A0L("openScreenConfig");
            throw 0Q8.createAndThrow();
        }
        if (fZt.A0D == EP2.A05) {
            A06(this);
        }
        A05().A0O(eIn, runnable);
    }

    @Override // X.GLd
    public View ASl(String str) {
        11T.A0F(str, 0);
        return A05().A08(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r305 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String AWg() {
        /*
            r301 = this;
            r0 = r301
            X.FJ1 r0 = r0.A05()
            r302 = r0
            r0 = r302
            java.util.Deque r0 = r0.A0G
            r303 = r0
            r0 = r303
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L35
            r0 = r303
            java.lang.Object r0 = r0.peek()
            X.EoS r0 = (X.EoS) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L35
            r0 = r302
            X.GL4 r0 = r0.A03
            r302 = r0
            r0 = r302
            java.lang.String r0 = r0.AWf()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L64
        L35:
            r0 = r301
            X.DLQ r0 = r0.A07
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L6f
            r0 = r302
            java.lang.String r0 = X.FIv.A05(r0)
            r305 = r0
        L44:
            r0 = r301
            java.lang.String r0 = r0.A0A
            r303 = r0
            r0 = r305
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5f
            r0 = r303
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L67
            r0 = r303
            r305 = r0
        L5f:
            r0 = r305
            X.11T.A0A(r0)
        L64:
            r0 = r305
            return r0
        L67:
            java.lang.String r0 = "bloks_unknown"
            r305 = r0
            goto L5f
        L6f:
            r0 = 0
            r305 = r0
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bloks.messenger.hosting.screens.MsgCdsBottomSheetFragment.AWg():java.lang.String");
    }

    public Map Agf() {
        HashMap A0u = AnonymousClass001.A0u();
        String str = this.A0A;
        if (str == null) {
            str = "null";
        }
        A0u.put("bloks_app_id", str);
        return A0u;
    }

    public Long Am7() {
        return 453586272481763L;
    }

    @Override // X.GLd
    public EP2 Ay0() {
        FZt fZt = this.A00;
        if (fZt != null) {
            return fZt.A0D;
        }
        11T.A0L("openScreenConfig");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r303 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String AyB() {
        /*
            r301 = this;
            r0 = r301
            X.FJ1 r0 = r0.A05()
            r302 = r0
            r0 = r302
            java.util.Deque r0 = r0.A0G
            r303 = r0
            r0 = r303
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L33
            r0 = r303
            java.lang.Object r0 = r0.peek()
            X.EoS r0 = (X.EoS) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L33
            r0 = r302
            X.GL4 r0 = r0.A03
            r302 = r0
            r0 = r302
            java.lang.String r0 = r0.AWf()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L49
        L33:
            r0 = r301
            java.lang.String r0 = r0.A0A
            r303 = r0
            r0 = r303
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L45
            java.lang.String r0 = "bloks_unknown_class"
            r303 = r0
        L45:
            r0 = r303
            X.11T.A0A(r0)
        L49:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bloks.messenger.hosting.screens.MsgCdsBottomSheetFragment.AyB():java.lang.String");
    }

    @Override // X.GLd
    public GHH B39(EL9 el9) {
        11T.A0F(el9, 0);
        if (el9 == EL9.A02) {
            return this.A0G;
        }
        throw AnonymousClass001.A0q("Only bloks platform is supported by this fragment!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public Window BKo() {
        return A05().A09(requireContext());
    }

    @Override // X.GLd
    public void BPf(GL4 gl4, EIr eIr, String str) {
        A05().A0N(gl4, eIr, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        A05().A0F(requireContext());
        return true;
    }

    public void CAV(float f) {
        A05().A0D(f);
    }

    @Override // X.GE0
    public void CGY(int i) {
        A05().A0E(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void CVS(GL4 gl4, EIs eIs) {
        FJ1 A05 = A05();
        Context requireContext = requireContext();
        Integer num = 0S2.A00;
        int i = eIs.A00;
        FJ1.A01(requireContext, A05, gl4, eIs.A00, eIs.A01, num, i, eIs.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CWY(ColorData colorData) {
        FJ1 A05 = A05();
        requireContext();
        A05.A0K(colorData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void CXk(EIo eIo) {
        A05().A0J(requireContext(), eIo, (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void CXm(String str) {
        A05().A0J(requireContext(), new EIo((Integer) null), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void CZs(GL4 gl4, EIm eIm) {
        A05().A0H(requireContext(), gl4, eIm);
    }

    @Override // X.GLd
    public void Cdo(String str) {
        A05().A0R(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void Cfp(GL4 gl4, EIp eIp, String str) {
        A05().A0I(requireContext(), gl4, eIp, str);
    }

    @Override // X.GLd
    public void Cnj(Drawable drawable) {
        CDSBloksBottomSheet.DefaultImpls.setCustomBackgroundDrawable(this, drawable);
    }

    @Override // X.GLd
    public void CqN(boolean z) {
        DMU dmu = A05().A08;
        if (dmu != null) {
            dmu.A09.A0B = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void D6J(EIq eIq, String str) {
        FJ1 A05 = A05();
        Context requireContext = requireContext();
        if (A05.A0G.size() != 1) {
            FJ1.A02(requireContext, A05, eIq.A00, str);
        }
    }

    @Override // X.GLd
    public void D6b(GHK ghk) {
        EoS eoS = (EoS) A05().A0G.peek();
        if (eoS != null) {
            eoS.A01 = ghk;
        }
    }

    @Override // X.GLd
    public void D6e(ColorData colorData, EP2 ep2) {
        A05().A0L(colorData, ep2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GLd
    public void D7O(ColorData colorData, float f) {
        FJ1 A05 = A05();
        requireContext();
        A05.A0M(colorData, Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        FZo A00;
        int A02 = 0FI.A02(-2008158723);
        super.onCreate(bundle);
        if (bundle != null) {
            A0o();
        }
        Bundle requireArguments = requireArguments();
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = requireArguments;
        }
        Bundle bundle3 = bundle2.getBundle("open_sheet_config");
        Bundle bundle4 = bundle;
        if (bundle == null) {
            bundle4 = requireArguments;
        }
        this.A0A = bundle4.getString("app_id");
        Bundle bundle5 = requireArguments.getBundle("app_data_config");
        if (bundle5 != null) {
            FxJ A002 = F0E.A00(bundle5);
            this.A07 = A002.A06;
            ErQ erQ = FZt.A0N;
            if (bundle3 != null) {
                this.A00 = erQ.A00(bundle3);
                this.A06 = new FJ1(new Eki());
                if (requireArguments.getBoolean("new_full_screen_activity")) {
                    FZt fZt = this.A00;
                    if (fZt == null) {
                        11T.A0L("openScreenConfig");
                        throw 0Q8.createAndThrow();
                    }
                    if (fZt.A0D == EP2.A05) {
                        String string = requireArguments.getString("bloks_model_screen_id");
                        if (string != null) {
                            this.A0B = string;
                            String string2 = requireArguments.getString("__nav_data_type");
                            if (string2 != null) {
                                boolean equals = string2.equals("screen_query");
                                if (!equals && !string2.equals("legacy_screen")) {
                                    throw 1BK.A0i("No bundler found to create navigation data of type: ", string2);
                                }
                                if (equals) {
                                    A00 = F6y.A00(requireArguments);
                                } else {
                                    if (!string2.equals("legacy_screen")) {
                                        throw 1BK.A0f("No implementation bound to key: %s", new Object[]{string2});
                                    }
                                    A00 = FZo.A02(requireArguments);
                                }
                                if (A00 != null) {
                                    this.A04 = requireArguments.getInt("initial_keyboard_soft_input_mode");
                                    this.A09 = (GHK) FGX.A02(GHK.class, DKD.A0l(requireArguments, "back_button_override"));
                                    String string3 = requireArguments.getString("renders_in_unsafe_area", "none");
                                    11T.A0A(string3);
                                    this.A03 = EU5.A00(string3);
                                    this.A0C = requireArguments.getBoolean("is_limited_theme");
                                    this.A08 = FIw.A02(requireContext(), this.A0G, A00, A002.A04, A002, this.A0B);
                                    0FI.A08(-859012008, A02);
                                    return;
                                }
                            }
                            A0N = AnonymousClass001.A0N("Required value was null.");
                            i = 1944733726;
                        } else {
                            A0N = AnonymousClass001.A0N("Required value was null.");
                            i = 1126161954;
                        }
                    }
                }
                this.A08 = null;
                String string4 = bundle == null ? requireArguments.getString("screen_id") : bundle.getString("screen_id");
                if (string4 != null) {
                    this.A0B = string4;
                    0FI.A08(-859012008, A02);
                    return;
                } else {
                    A0N = AnonymousClass001.A0N("Required value was null.");
                    i = -1132690744;
                }
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 1940005679;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -413666019;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        if (com.facebook.bloks.messenger.hosting.screens.MsgCdsBottomSheetFragment.A0H.AZk(2324150908608333113L) == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            r301 = this;
            r0 = 111450140(0x6a4981c, float:6.191345E-35)
            r305 = r0
            r0 = r305
            int r0 = X.0FI.A02(r0)
            r306 = r0
            r0 = r301
            X.FJ1 r0 = r0.A05()
            r307 = r0
            r0 = r301
            android.content.Context r0 = r0.requireContext()
            r308 = r0
            r0 = r301
            X.FZt r0 = r0.A00
            r309 = r0
            r0 = r309
            if (r0 != 0) goto L2c
            java.lang.String r0 = "openScreenConfig"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L2c:
            r0 = r301
            android.content.Context r0 = r0.getContext()
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L6f
            r0 = r310
            android.content.res.Configuration r0 = X.4YU.A0B(r0)
            r310 = r0
            r0 = r310
            int r0 = r0.screenLayout
            r1 = 15
            r0 = r0 & r1
            r311 = r0
            r0 = 3
            r305 = r0
            r0 = r311
            r1 = r305
            if (r0 < r1) goto L6f
            X.1CO r0 = com.facebook.bloks.messenger.hosting.screens.MsgCdsBottomSheetFragment.A0H
            r312 = r0
            r0 = 2324150908608333113(0x20410af000004539, double:2.542208942503985E-153)
            r313 = r0
            r0 = r312
            r1 = r313
            boolean r0 = r0.AZk(r1)
            r305 = r0
            r0 = 1
            r311 = r0
            r0 = r305
            if (r0 != 0) goto L75
        L6f:
            r0 = 0
            r311 = r0
            r0 = 0
            r315 = r0
        L75:
            r0 = r301
            X.GDy r0 = r0.A0F
            r310 = r0
            r0 = r307
            r1 = r308
            r2 = r310
            r3 = r309
            r4 = r311
            X.DPv r0 = r0.A0A(r1, r2, r3, r4)
            r315 = r0
            r0 = r315
            X.11T.A0A(r0)
            r0 = 1617472470(0x6068abd6, float:6.7062917E19)
            r1 = r306
            X.0FI.A08(r0, r1)
            r0 = r315
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bloks.messenger.hosting.screens.MsgCdsBottomSheetFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(55413529);
        super.onDestroy();
        FJ1 fj1 = this.A06;
        if (fj1 != null) {
            fj1.A0G(requireContext());
        }
        0FI.A08(-50787316, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        Window window;
        Window window2;
        int A02 = 0FI.A02(1485380352);
        super.onDestroyView();
        FJ1 fj1 = this.A06;
        if (fj1 != null) {
            fj1.A0C();
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            window2.setSoftInputMode(this.A05);
        }
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(this.A05);
        }
        0FI.A08(-791098676, A02);
    }

    public void onDetach() {
        int A02 = 0FI.A02(924460566);
        super/*X.0D2*/.onDetach();
        FJ1 fj1 = this.A06;
        if (fj1 != null) {
            FZt fZt = this.A00;
            if (fZt == null) {
                11T.A0L("openScreenConfig");
                throw 0Q8.createAndThrow();
            }
            fj1.A0P(fZt);
        }
        0FI.A08(1965048583, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        FZt fZt = this.A00;
        if (fZt == null) {
            11T.A0L("openScreenConfig");
            throw 0Q8.createAndThrow();
        }
        bundle.putBundle("open_sheet_config", fZt.A00());
        bundle.putString("app_id", this.A0A);
        bundle.putString("screen_id", this.A0B);
        super/*X.0D2*/.onSaveInstanceState(bundle);
    }

    public void onStart() {
        int A02 = 0FI.A02(848238374);
        super/*X.0D2*/.onStart();
        FJ1 A05 = A05();
        FZt fZt = this.A00;
        if (fZt == null) {
            11T.A0L("openScreenConfig");
            throw 0Q8.createAndThrow();
        }
        A05.A0Q(fZt);
        EZa.A00.post(new FzT(this));
        0FI.A08(1534250123, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        Window window;
        Integer num;
        int A02 = 0FI.A02(-955340324);
        super/*X.0D2*/.onStop();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && ((num = this.A03) == 0S2.A00 || num == 0S2.A0C)) {
            FZt fZt = this.A00;
            if (fZt == null) {
                11T.A0L("openScreenConfig");
                throw 0Q8.createAndThrow();
            }
            if (fZt.A0D == EP2.A05) {
                Integer num2 = this.A02;
                if (num2 != null) {
                    window.getDecorView().setVisibility(num2.intValue());
                }
                Integer num3 = this.A01;
                if (num3 != null) {
                    window.setStatusBarColor(num3.intValue());
                }
            }
        }
        0FI.A08(429524547, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        Window window2;
        Context context;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        GL4 gl4 = this.A08;
        if (gl4 != null) {
            CVS(gl4, new EIs(this.A09, this.A04, this.A0C));
            this.A08 = null;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            this.A05 = window2.getAttributes().softInputMode;
            FZt fZt = this.A00;
            if (fZt != null) {
                if (fZt.A0D == EP2.A05 && (context = getContext()) != null) {
                    View decorView = window2.getDecorView();
                    FZt fZt2 = this.A00;
                    if (fZt2 != null) {
                        int i = 15463421;
                        if (new FyF(context, fZt2.A0E).BRZ()) {
                            i = 925742;
                        }
                        decorView.setBackgroundColor(i);
                    }
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
        FZt fZt3 = this.A00;
        if (fZt3 != null) {
            Integer num = fZt3.A0F;
            if (num != null) {
                window.setSoftInputMode(num.intValue());
                return;
            }
            return;
        }
        11T.A0L("openScreenConfig");
        throw 0Q8.createAndThrow();
    }
}

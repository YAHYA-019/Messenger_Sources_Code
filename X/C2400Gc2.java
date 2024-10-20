package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;

/* renamed from: X.Gc2, reason: case insensitive filesystem */
/* loaded from: Gc2.class */
public final class C2400Gc2 extends 1pK implements JFq {
    public static final String __redex_internal_original_name = "ActiveCallFragment";
    public View A00;
    public ViewStub A01;
    public ViewStub A02;
    public ViewStub A03;
    public ViewTreeObserver.OnGlobalLayoutListener A04;
    public 2PP A05;
    public C00i A06;
    public C00i A07;
    public 2PW A08;
    public IEA A09;
    public C00i A0A;
    public C00i A0B;
    public IMK A0C;
    public IDo A0D;
    public C2475GeW A0E;
    public GSP A0F;
    public final C01i A0J = J9u.A01(this, 28);
    public final 1Br A0H = 1BK.A0C();
    public final Runnable A0I = new IrJ(this);
    public final 1Br A0G = 1Bq.A00(115033);
    public final 2Pu A0K = new IPS(this);
    public final JLm A0L = GpZ.A00(this, 4);
    public final 2Qn A0M = IYv.A00(this, 9);

    /* JADX WARN: Multi-variable type inference failed */
    private final GSP A03() {
        GSP gsp = this.A0F;
        if (gsp == null) {
            Context context = super/*androidx.fragment.app.Fragment*/.getContext();
            if (context != null) {
                String string = requireArguments().getString("local_call_id");
                if (string == null) {
                    throw 1BK.A0h();
                }
                gsp = GSP.A00(context, 1Br.A07(this.A0H), string);
            } else {
                gsp = null;
            }
            this.A0F = gsp;
        }
        return gsp;
    }

    public static final void A06(C2400Gc2 c2400Gc2) {
        Rect A0C = DKC.A0C();
        View view = c2400Gc2.A00;
        if (view != null) {
            A0C.top += view.getHeight();
        }
        IMK imk = c2400Gc2.A0C;
        if (imk == null) {
            throw 1BK.A0h();
        }
        if (A0C.equals(imk.A03)) {
            return;
        }
        imk.A03 = A0C;
        IMK.A03(imk);
        Iterator it = imk.A0W.iterator();
        while (it.hasNext()) {
            ((HGB) it.next()).A00();
        }
        IMK.A02(imk);
    }

    public static final void A07(C2400Gc2 c2400Gc2) {
        ViewStub viewStub;
        int i;
        String str;
        if (c2400Gc2.A02 != null) {
            C00i c00i = c2400Gc2.A0A;
            if (c00i != null) {
                if (!((JOS) c00i.get()).A9B()) {
                    C00i c00i2 = c2400Gc2.A0B;
                    if (c00i2 == null) {
                        str = "lobbySharedState";
                    } else if (!((HbN) c00i2.get()).A00) {
                        viewStub = c2400Gc2.A02;
                        if (viewStub != null) {
                            i = 0;
                            viewStub.setVisibility(i);
                            return;
                        }
                        return;
                    }
                }
                viewStub = c2400Gc2.A02;
                if (viewStub != null) {
                    i = 8;
                    viewStub.setVisibility(i);
                    return;
                }
                return;
            }
            str = "activeDrawerSharedState";
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutInflater A17() {
        return AbstractC2326GOr.A0C(this, 1Br.A07(this.A0H));
    }

    public void A19() {
        super.A19();
        C2475GeW c2475GeW = this.A0E;
        if (c2475GeW == null) {
            throw 1BK.A0h();
        }
        A1U(c2475GeW);
    }

    public 1iF A1R() {
        return GOq.A0U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        GSP A03;
        FbUserSession A01 = 1BM.A01(this);
        this.A05 = (2PP) 7zO.A0l(this, 17001);
        this.A0B = 1Lm.A00(requireContext(), A01, 82190);
        this.A08 = (2PW) 7zO.A0l(this, 67728);
        1Bn.A0A(115590);
        this.A0E = new C2475GeW(A01, requireContext());
        this.A0C = (IMK) 7zN.A0n(this, A01, 98492);
        this.A09 = (IEA) 7zN.A0n(this, A01, 115612);
        this.A0D = (IDo) 7zN.A0n(this, A01, 115519);
        this.A0A = 1Lm.A02(A01, this, 99475);
        this.A06 = 1Lm.A02(A01, this, 114856);
        this.A07 = 1Lm.A02(A01, this, 33089);
        IEA iea = this.A09;
        if (iea == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        JOY.A01(iea).Bcw("ActiveCallFragment_create", (String) null);
        IEA iea2 = this.A09;
        if (iea2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        7zP.A0e(iea2.A07).markerPoint(16252929, AnonymousClass000.A00(ActionId.END_START_ACTIVITY));
        C2475GeW c2475GeW = this.A0E;
        if (c2475GeW == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        A1T(c2475GeW);
        2PV r0 = (2PV) 1Bi.A03(99986);
        1Bn.A0A(147741);
        GeM geM = new GeM(A01, requireContext());
        2PP r02 = this.A05;
        if (r02 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ImmutableSet A02 = ImmutableSet.A02(geM, geM);
        if (r0 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        r02.A05(r0, A02);
        IEA iea3 = this.A09;
        if (iea3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        JOY.A01(iea3).Bcv("ActiveCallFragment_create", (String) null);
        if (!1Br.A07(this.A0H).AZk(36326369533449739L) || (A03 = A03()) == null || A03() == null) {
            return;
        }
        1Lm.A05(A03, A01, 115621);
        4zI.A03.A05("RtcPreInflateHelper", "onIncomingCallFragmentShown", AnonymousClass001.A1Z());
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        ViewStub viewStub;
        ViewStub viewStub2;
        View inflate;
        TextView A0F;
        ViewStub viewStub3;
        IZa iZa = (IZa) jdb;
        int i = 0;
        11T.A0F(iZa, 0);
        IEA iea = this.A09;
        if (iea == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        JOY.A01(iea).Bcw("ActiveCallFragment_render", (String) null);
        if (iZa.A01) {
            1Br.A0C(this.A0G);
            7zQ.A19(this.A02);
            ViewStub viewStub4 = this.A03;
            if (viewStub4 != null) {
                viewStub4.setLayoutResource(2132542442);
            }
            ViewStub viewStub5 = this.A03;
            if (viewStub5 != null && viewStub5.getParent() != null && (viewStub3 = this.A03) != null) {
                viewStub3.inflate();
            }
        } else {
            7zQ.A19(this.A03);
            C00i c00i = this.A06;
            if (c00i == null) {
                11T.A0L("multiParticipantSharedState");
                throw 0Q8.createAndThrow();
            }
            if (((JOM) c00i.get()).A02 != 3 && (viewStub = this.A02) != null) {
                viewStub.setVisibility(0);
            }
        }
        ViewStub viewStub6 = this.A01;
        boolean A1U = AnonymousClass001.A1U(viewStub6 != null ? viewStub6.getParent() : null);
        boolean z = iZa.A00;
        if (z && !A1U && (viewStub2 = this.A01) != null && (inflate = viewStub2.inflate()) != null && (A0F = DKF.A0F(inflate, 2131363572)) != null) {
            ((JNe) 1Br.A0B(((Gr2) this.A0J.getValue()).A05)).ClT(A0F);
        }
        ViewStub viewStub7 = this.A01;
        if (viewStub7 != null) {
            if (!z) {
                i = 8;
            }
            viewStub7.setVisibility(i);
        }
        IEA iea2 = this.A09;
        if (iea2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        JOY.A01(iea2).Bcv("ActiveCallFragment_render", (String) null);
    }

    public Context getContext() {
        return A03();
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(2003618696);
        11T.A0F(layoutInflater, 0);
        IEA iea = this.A09;
        if (iea != null) {
            JOY.A01(iea).Bcw("ActiveCallFragment_onCreateView", (String) null);
            View inflate = layoutInflater.inflate(2132541477, viewGroup, false);
            11T.A0I(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) DKG.A0B(inflate, 2131361912);
            this.A02 = (ViewStub) inflate.requireViewById(2131361911);
            this.A03 = (ViewStub) inflate.requireViewById(2131365331);
            this.A01 = (ViewStub) inflate.requireViewById(2131362825);
            2PP r0 = this.A05;
            if (r0 != null) {
                r0.A01 = viewGroup2;
                r0.A08.add(this.A0K);
                inflate.getViewTreeObserver().addOnGlobalLayoutListener(new IKv(inflate, this, 1));
                IEA iea2 = this.A09;
                if (iea2 != null) {
                    JOY.A01(iea2).Bcv("ActiveCallFragment_onCreateView", (String) null);
                    0FI.A08(1925705532, A02);
                    return inflate;
                }
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 1901521534;
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 1708061452;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = -1385141740;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        String str;
        int A02 = 0FI.A02(1552619990);
        C00i c00i = this.A0A;
        if (c00i == null) {
            str = "activeDrawerSharedState";
        } else {
            ((JOS) c00i.get()).CeV(this.A0L);
            C00i c00i2 = this.A07;
            if (c00i2 != null) {
                ((2Qa) c00i2.get()).A03(this.A0M);
                this.A02 = null;
                this.A03 = null;
                this.A01 = null;
                AbI.A1X(this.A0J);
                super/*androidx.fragment.app.Fragment*/.onDestroyView();
                0FI.A08(462758063, A02);
                return;
            }
            str = "pictureInPictureSharedState";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void onDetach() {
        int A02 = 0FI.A02(1140366400);
        super.onDetach();
        this.A0F = null;
        0FI.A08(2015703889, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(2123678340);
        super/*androidx.fragment.app.Fragment*/.onPause();
        2PP r0 = this.A05;
        if (r0 != null) {
            r0.A02();
            0FI.A08(-352504174, A02);
        } else {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(278980208, A02);
            throw A0h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(719965724);
        super/*androidx.fragment.app.Fragment*/.onResume();
        2PP r0 = this.A05;
        if (r0 != null) {
            r0.A03();
            IDo iDo = this.A0D;
            if (iDo != null) {
                iDo.A09(false);
                0FI.A08(1447467720, A02);
                return;
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 1804394497;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 323771257;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(1221411455);
        super/*androidx.fragment.app.Fragment*/.onStart();
        IMK imk = this.A0C;
        if (imk == null) {
            IllegalStateException A0h = 1BK.A0h();
            0FI.A08(-221021736, A02);
            throw A0h;
        }
        int i = imk.A01 + 1;
        imk.A01 = i;
        if (i == 1) {
            IMK.A05(imk, true);
        }
        C48 c48 = (C48) ((Gr2) this.A0J.getValue()).A0C.get();
        c48.A00 = 1Br.A01(c48.A02) + 700;
        0FI.A08(953850532, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(-1953646726);
        super/*androidx.fragment.app.Fragment*/.onStop();
        IMK imk = this.A0C;
        if (imk != null) {
            int i2 = imk.A01 - 1;
            imk.A01 = i2;
            if (i2 == 0) {
                IMK.A05(imk, false);
            }
            IDo iDo = this.A0D;
            if (iDo != null) {
                iDo.A09(true);
                0FI.A08(1245865065, A02);
                return;
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -184947604;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 1851093770;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        IEA iea = this.A09;
        if (iea == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        JOY.A01(iea).Bcw("ActiveCallFragment_onViewCreated", (String) null);
        super.onViewCreated(view, bundle);
        AbI.A1S(this, this.A0J);
        C00i c00i = this.A0A;
        if (c00i == null) {
            str = "activeDrawerSharedState";
        } else {
            ((JOS) c00i.get()).A60(this.A0L);
            C00i c00i2 = this.A07;
            if (c00i2 != null) {
                2Qa r0 = (2Qa) c00i2.get();
                2Qn r02 = this.A0M;
                r0.A02(r02);
                r02.CBi();
                IEA iea2 = this.A09;
                if (iea2 == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
                JOY.A01(iea2).Bcv("ActiveCallFragment_onViewCreated", (String) null);
                return;
            }
            str = "pictureInPictureSharedState";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}

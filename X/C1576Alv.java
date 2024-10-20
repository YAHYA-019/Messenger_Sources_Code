package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.location.model.NearbyPlace;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Calendar;

/* renamed from: X.Alv, reason: case insensitive filesystem */
/* loaded from: Alv.class */
public final class C1576Alv extends 1pK implements DEr, DEt {
    public static final String __redex_internal_original_name = "EventCreationEmbeddedFragment";
    public LithoView A00;
    public DGi A01;
    public CNk A02;
    public CNk A03;
    public FbUserSession A04;
    public 2S3 A05;
    public String A06;
    public boolean A07;
    public final C2iw A0C = new Object();
    public final C2iw A0B = new Object();
    public final 1Br A08 = 7zN.A0I(this);
    public final 1Br A09 = 1Bq.A00(83384);
    public final Bd1 A0D = new Bd1(this);
    public final 0KB A0A = new AfK(this, 2);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A03(C1576Alv c1576Alv) {
        LithoView lithoView = c1576Alv.A00;
        if (lithoView != null) {
            MigColorScheme A0m = 7zQ.A0m(c1576Alv.A08);
            boolean z = c1576Alv.A07;
            CNk cNk = c1576Alv.A03;
            if (cNk != null) {
                String str = cNk.A02().A03;
                CNk cNk2 = c1576Alv.A03;
                String str2 = null;
                if (cNk2 != null) {
                    String str3 = cNk2.A02().A03;
                    11T.A0F(str3, 0);
                    if (str3.length() > 100) {
                        str2 = c1576Alv.getString(2131962021);
                    }
                    CNk cNk3 = c1576Alv.A03;
                    if (cNk3 != null) {
                        Calendar calendar = cNk3.A02().A08;
                        CNk cNk4 = c1576Alv.A03;
                        if (cNk4 != null) {
                            Calendar calendar2 = cNk4.A02().A07;
                            C00i c00i = c1576Alv.A09.A00;
                            Calendar A00 = CIV.A00((CIV) c00i.get());
                            A00.add(1, 2);
                            CIV civ = (CIV) c00i.get();
                            CNk cNk5 = c1576Alv.A03;
                            if (cNk5 != null) {
                                String A02 = civ.A02(c1576Alv.requireContext(), cNk5.A02().A08);
                                C2iw c2iw = c1576Alv.A0C;
                                CNk cNk6 = c1576Alv.A03;
                                if (cNk6 != null) {
                                    Integer num = cNk6.A02().A01;
                                    CNk cNk7 = c1576Alv.A03;
                                    if (cNk7 != null) {
                                        Calendar calendar3 = cNk7.A02().A06;
                                        CNk cNk8 = c1576Alv.A03;
                                        if (cNk8 != null) {
                                            Calendar calendar4 = cNk8.A02().A05;
                                            CIV civ2 = (CIV) c00i.get();
                                            CNk cNk9 = c1576Alv.A03;
                                            if (cNk9 != null) {
                                                Calendar calendar5 = cNk9.A02().A08;
                                                CNk cNk10 = c1576Alv.A03;
                                                if (cNk10 != null) {
                                                    String A03 = civ2.A03(c1576Alv.requireContext(), calendar5, cNk10.A02().A06);
                                                    C2iw c2iw2 = c1576Alv.A0B;
                                                    CNk cNk11 = c1576Alv.A03;
                                                    if (cNk11 != null) {
                                                        String str4 = cNk11.A02().A02;
                                                        CNk cNk12 = c1576Alv.A03;
                                                        if (cNk12 != null) {
                                                            boolean A002 = R0S.A00(c1576Alv.requireContext(), cNk12.A02());
                                                            CNk cNk13 = c1576Alv.A03;
                                                            if (cNk13 != null) {
                                                                boolean z2 = cNk13.A02().A0B;
                                                                CNk cNk14 = c1576Alv.A03;
                                                                if (cNk14 != null) {
                                                                    boolean z3 = cNk14.A02().A09;
                                                                    CNk cNk15 = c1576Alv.A03;
                                                                    if (cNk15 != null) {
                                                                        boolean z4 = cNk15.A02().A0A;
                                                                        Bd1 bd1 = c1576Alv.A0D;
                                                                        CNk cNk16 = c1576Alv.A02;
                                                                        String str5 = null;
                                                                        if (cNk16 != null) {
                                                                            String str6 = cNk16.A02().A04;
                                                                            CNk cNk17 = c1576Alv.A02;
                                                                            if (cNk17 != null) {
                                                                                NearbyPlace nearbyPlace = cNk17.A02().A00;
                                                                                if (str6 != null) {
                                                                                    str5 = str6;
                                                                                } else if (nearbyPlace != null) {
                                                                                    str5 = nearbyPlace.name;
                                                                                }
                                                                                06Z r0 = c1576Alv.mFragmentManager;
                                                                                11T.A0A(r0);
                                                                                LithoView lithoView2 = c1576Alv.A00;
                                                                                if (lithoView2 != null) {
                                                                                    lithoView.A0y(new C1977Ay6(r0, c2iw, c2iw2, lithoView2, bd1, A0m, num, str, str2, A02, A03, str4, str5, calendar, calendar2, A00, calendar3, calendar4, z, A002, z2, z3, z4));
                                                                                    return;
                                                                                }
                                                                            }
                                                                        }
                                                                        11T.A0L("eventCreationLocationViewData");
                                                                        throw 0Q8.createAndThrow();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            11T.A0L("eventCreationUiModel");
            throw 0Q8.createAndThrow();
        }
        11T.A0L("lithoView");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A04 = 1BM.A01(this);
        Bundle requireArguments = requireArguments();
        this.mFragmentManager.A1K(this.A0A, false);
        this.A06 = requireArguments.getString("arg_thread_id");
        String string = requireArguments.getString("arg_event_thread_type");
        if (string == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (R0e.A00(string) == 0S2.A00 && this.A06 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A07 = requireArguments.getBoolean("arg_is_standalone_community_event_creation", false);
        2S3 r0 = this.A05;
        if (r0 != null) {
            requireContext();
            this.A03 = (CNk) r0.A00(83383);
            2S3 r02 = this.A05;
            if (r02 != null) {
                this.A02 = (CNk) r02.A00(83385);
                return;
            }
        }
        11T.A0L("fragmentSurface");
        throw 0Q8.createAndThrow();
    }

    @Override // X.DEr
    public void CmT(DGi dGi) {
        11T.A0F(dGi, 0);
        this.A01 = dGi;
    }

    @Override // X.DEt
    public void Cp6(2S3 r302) {
        11T.A0F(r302, 0);
        this.A05 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(551315422);
        LithoView A0M = 7zR.A0M(this);
        this.A00 = A0M;
        0FI.A08(513688927, A02);
        return A0M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-1025969557);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        this.mFragmentManager.A1J(this.A0A);
        0FI.A08(-969060514, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(1026395920);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A03(this);
        0FI.A08(-370909454, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        DGi dGi = this.A01;
        if (dGi == null) {
            str = "eventCreationContentCallback";
        } else {
            dGi.CvW(getString(2131955282));
            CNk cNk = this.A03;
            if (cNk != null) {
                CaE.A03(getViewLifecycleOwner(), cNk.A00, new DCw(this, 49), 36);
                return;
            }
            str = "eventCreationUiModel";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}

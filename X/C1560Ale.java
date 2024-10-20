package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.sharing.contentdiscovery.bottomsheet.LifeEventsBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Ale, reason: case insensitive filesystem */
/* loaded from: Ale.class */
public final class C1560Ale extends 1pK implements 1pN {
    public static final String __redex_internal_original_name = "LifeEventsFragment";
    public FbUserSession A00;
    public 1fF A01;
    public Bv2 A02;
    public N4B A03;
    public CJ7 A04;
    public MigColorScheme A05;
    public 1pI A06;
    public LithoView A07;
    public Bv3 A08;
    public final 1Br A09 = 1Bq.A00(84183);
    public final C5xv A0C = CxE.A00(this, 89);
    public final DJb A0A = new Ctq(this);
    public final NAL A0B = new Ctr(this);

    public static final void A03(C1560Ale c1560Ale, ImmutableList immutableList) {
        String str;
        LithoView lithoView = c1560Ale.A07;
        if (lithoView != null) {
            1Iw A0U = AbF.A0U(lithoView);
            D08 d08 = null;
            2cM A00 = 2cK.A00(A0U);
            MigColorScheme migColorScheme = c1560Ale.A05;
            if (migColorScheme != null) {
                7zM.A1O(A00, migColorScheme);
                C5yw A002 = C5yv.A00(A0U);
                MigColorScheme migColorScheme2 = c1560Ale.A05;
                if (migColorScheme2 != null) {
                    A002.A2b(migColorScheme2);
                    1fF r0 = c1560Ale.A01;
                    if (r0 == null) {
                        str = "sharingConfig";
                    } else {
                        int i = 2131958629;
                        if (r0.A04()) {
                            i = 2131957047;
                        }
                        A002.A2a(i);
                        A002.A2Y();
                        A002.A2d(c1560Ale.A0C);
                        AbH.A1Q(A00, A002);
                        FbUserSession fbUserSession = c1560Ale.A00;
                        if (fbUserSession == null) {
                            str = "fbUserSession";
                        } else {
                            MigColorScheme migColorScheme3 = c1560Ale.A05;
                            if (migColorScheme3 != null) {
                                DJb dJb = c1560Ale.A0A;
                                N4B n4b = c1560Ale.A03;
                                if (n4b != null) {
                                    C95p c95p = n4b.A03;
                                    Bv2 bv2 = c1560Ale.A02;
                                    if (bv2 != null) {
                                        d08 = bv2.A00;
                                    }
                                    AbH.A1P(A00, new QHP(fbUserSession, dJb, c95p, migColorScheme3, d08, immutableList), lithoView);
                                    return;
                                }
                                str = "lifeEventsLoader";
                            }
                        }
                    }
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
            }
            str = "colorScheme";
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }

    public void A1H() {
        super.A1H();
        N4B n4b = this.A03;
        if (n4b == null) {
            11T.A0L("lifeEventsLoader");
            throw 0Q8.createAndThrow();
        }
        n4b.A02 = null;
    }

    public 1iF A1R() {
        return AbF.A0C(245371884248188L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = 1BM.A01(this);
        this.A05 = 7zS.A0j(this);
        this.A01 = AbK.A0c();
        Context A0C = 7zM.A0C(this, 84354);
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        this.A03 = new N4B(A0C, fbUserSession);
        this.A08 = (Bv3) 7zO.A0l(this, 84185);
        this.A04 = AbM.A0d().A00(getContext());
    }

    public boolean Bkd() {
        1pI r0 = this.A06;
        if (r0 == null) {
            return true;
        }
        r0.CeH(__redex_internal_original_name);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        LifeEventsBottomSheetDialogFragment lifeEventsBottomSheetDialogFragment;
        String str;
        DIZ cto;
        11T.A0F(fragment, 0);
        if (!(fragment instanceof LifeEventsBottomSheetDialogFragment) || (lifeEventsBottomSheetDialogFragment = (LifeEventsBottomSheetDialogFragment) fragment) == null) {
            return;
        }
        1fF r0 = this.A01;
        if (r0 == null) {
            str = "sharingConfig";
        } else {
            boolean A04 = r0.A04();
            str = "fbUserSession";
            Context requireContext = requireContext();
            FbUserSession fbUserSession = this.A00;
            if (A04) {
                if (fbUserSession != null) {
                    cto = new Ctn(requireContext, fbUserSession);
                    lifeEventsBottomSheetDialogFragment.A01 = cto;
                    return;
                }
            } else if (fbUserSession != null) {
                cto = new Cto(requireContext, fbUserSession);
                lifeEventsBottomSheetDialogFragment.A01 = cto;
                return;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-939264860);
        LithoView lithoView = new LithoView(7zP.A0T(this));
        7zR.A11(lithoView);
        this.A07 = lithoView;
        0FI.A08(1677465102, A02);
        return lithoView;
    }

    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A06 = 1vD.A00(view);
        N4B n4b = this.A03;
        String str = "lifeEventsLoader";
        if (n4b != null) {
            n4b.A02 = this.A0B;
            1fF r0 = this.A01;
            str = "sharingConfig";
            if (r0 != null) {
                int A00 = 2yD.A00(1fF.A00(r0), 36598146475691934L);
                1fF r02 = this.A01;
                if (r02 != null) {
                    n4b.A05(A00, r02.A04(), 3);
                    A03(this, 1BK.A0b());
                    return;
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}

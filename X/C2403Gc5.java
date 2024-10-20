package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import com.facebook.widget.RoundedCornersFrameLayout;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Gc5, reason: case insensitive filesystem */
/* loaded from: Gc5.class */
public final class C2403Gc5 extends 1pK implements 2Ob {
    public static final String __redex_internal_original_name = "MontageListFragment";
    public ProgressBar A00;
    public Toolbar A01;
    public RecyclerView A02;
    public FbUserSession A03;
    public GWf A04;
    public JIa A05;
    public ImmutableList A06;
    public boolean A07;
    public RoundedCornersFrameLayout A08;
    public final C00i A0B = 1BV.A00(115056);
    public final C00i A0E = 1BV.A00(68367);
    public final C00i A0C = GOo.A0K();
    public final C00i A0D = 1BQ.A02(84065);
    public final C00i A0K = new 1HH(this, 67720);
    public final C00i A0H = AbF.A0S(this, 116039);
    public final C00i A0F = AbF.A0S(this, 50185);
    public final C00i A09 = AbH.A0K();
    public final C00i A0A = 1BV.A00(68559);
    public final C00i A0G = AbH.A0L();
    public final GfN A0L = new GfN(this);
    public final C00i A0J = AbF.A0S(this, 67973);
    public final HDf A0I = new Grn(this);
    public final C1sy A0M = new CxA(this, 6);

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(C2403Gc5 c2403Gc5) {
        IKE ike;
        Toolbar toolbar;
        c2403Gc5.A01.setElevation(DKC.A04(7zO.A0D(c2403Gc5)));
        c2403Gc5.A01.A0M(2131960894);
        boolean z = c2403Gc5.A07;
        Toolbar toolbar2 = c2403Gc5.A01;
        if (z) {
            toolbar2.A0P((Drawable) 0NA.A09(c2403Gc5.getContext(), 2130970576).orNull());
            c2403Gc5.A01.A0L(2131962042);
            toolbar = c2403Gc5.A01;
            ike = IKE.A00(c2403Gc5, 90);
        } else {
            ike = null;
            toolbar2.A0P(null);
            toolbar = c2403Gc5.A01;
        }
        toolbar.A0Q(ike);
    }

    public static void A06(C2403Gc5 c2403Gc5) {
        C00i c00i = c2403Gc5.A0J;
        ((2SQ) c00i.get()).CmR(c2403Gc5.A0L);
        2SQ r0 = (2SQ) c00i.get();
        FbUserSession fbUserSession = c2403Gc5.A03;
        fbUserSession.getClass();
        r0.D1t(new 5rA(fbUserSession, C5ah.PREFETCH_STORIES_AND_WARMUP_VIDEO_PLAYER, false, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A07(C2403Gc5 c2403Gc5) {
        MigColorScheme A0h = AbK.A0h(c2403Gc5);
        AbG.A1H(c2403Gc5.A01, A0h);
        c2403Gc5.A01.A0N(A0h.B4i());
        2Xd r0 = c2403Gc5.A04;
        ((GWf) r0).A01 = A0h;
        c2403Gc5.A02.A16(r0);
        AbG.A1H(c2403Gc5.A02, A0h);
        AbG.A1H(c2403Gc5.A08, A0h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A08(C2403Gc5 c2403Gc5, UserKey userKey) {
        4iI r0 = (4iI) c2403Gc5.A0K.get();
        11T.A0F(userKey, 0);
        ThreadKey A00 = 4iI.A00(r0, userKey);
        if (A00 == null) {
            0fH.A0k(__redex_internal_original_name, "Other user ThreadKey is null!");
        } else {
            ((AnonymousClass472) AbF.A0S(c2403Gc5, 67579).get()).A00(userKey).A01(new IUq(0, AbF.A0S(c2403Gc5, 82461), A00, c2403Gc5));
        }
    }

    public 1iF A1R() {
        return AbF.A0C(651556545429224L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A03 = 1BL.A0G(this);
        ((C1sx) 1Bi.A03(33085)).A00(this, this.A0M);
    }

    public boolean ADo(MotionEvent motionEvent) {
        RecyclerView recyclerView = this.A02;
        boolean z = true;
        if (recyclerView != null) {
            2XA r0 = recyclerView.A0F;
            if (!(r0 instanceof LinearLayoutManager)) {
                return false;
            }
            if (((LinearLayoutManager) r0).A1i() != recyclerView.A0C.getItemCount() - 1) {
                z = false;
            }
        }
        return z;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-758067452);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542702);
        0FI.A08(1282613646, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(894827841);
        super/*androidx.fragment.app.Fragment*/.onPause();
        ((2SQ) this.A0J.get()).AEC();
        C00i c00i = this.A0H;
        if (c00i.get() != null) {
            I23 i23 = (I23) c00i.get();
            i23.A02.A00.clear();
            1PA r0 = i23.A00;
            if (r0 != null) {
                r0.A01();
                i23.A00 = null;
            }
        }
        0FI.A08(649378851, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-893845002);
        super/*androidx.fragment.app.Fragment*/.onResume();
        boolean A1U = AnonymousClass001.A1U(this.A06);
        RecyclerView recyclerView = this.A02;
        int i = 8;
        int i2 = 0;
        if (A1U) {
            i2 = 8;
        }
        recyclerView.setVisibility(i2);
        ProgressBar progressBar = this.A00;
        if (A1U) {
            i = 0;
        }
        progressBar.setVisibility(i);
        A06(this);
        C00i c00i = this.A0H;
        I23 i23 = (I23) c00i.get();
        1F9 r0 = 1F9.A0M;
        HDf hDf = this.A0I;
        Preconditions.checkState(I23.A03.contains(r0), "Observing folder '%s' is not supported yet", r0);
        HxL hxL = i23.A02;
        HtT htT = new HtT(r0, hDf);
        HxL.A00(hxL, 4).add(htT);
        HxL.A00(hxL, 2).add(htT);
        HxL.A00(hxL, 1).add(htT);
        I23 i232 = (I23) c00i.get();
        1PA r307 = i232.A00;
        if (r307 == null) {
            1P9 r02 = new 1P9(DKD.A0H(AbF.A04(i232.A01)));
            r02.A05(new Grm(i232, 4), 1BJ.A00(6));
            r02.A05(new Grm(i232, 3), 1BJ.A00(3));
            r02.A05(new Grm(i232, 2), AnonymousClass000.A00(53));
            r02.A05(new Grm(i232, 1), 1BJ.A00(ActionId.ASYNC_ACTION_SUCCESS));
            r307 = 1P9.A01(r02, new Grm(i232, 0), AnonymousClass000.A00(100));
            i232.A00 = r307;
        }
        r307.A00();
        0FI.A08(594747205, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = (Toolbar) 7zL.A0F(this, 2131368112);
        this.A02 = (RecyclerView) 7zL.A0F(this, 2131366869);
        this.A00 = (ProgressBar) 7zL.A0F(this, 2131365306);
        this.A08 = (RoundedCornersFrameLayout) 7zL.A0F(this, 2131367028);
        A03(this);
        2Xd gWf = new GWf(this.A03, AbG.A0B(this.A09), new HmJ(this));
        this.A04 = gWf;
        this.A02.A16(gWf);
        this.A02.A1D(new LinearLayoutManager(getContext()));
        A07(this);
    }
}

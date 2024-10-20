package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.messaging.groups.create.model.CreateGroupFragmentParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: X.AlG, reason: case insensitive filesystem */
/* loaded from: AlG.class */
public final class C1555AlG extends 1pK {
    public static final String __redex_internal_original_name = "GroupCreateListFragment";
    public AbR A00;
    public AbR A01;
    public LithoView A02;
    public 2TP A03;
    public Be3 A04;
    public Be4 A05;
    public Bxx A06;
    public C3q A07;
    public BuS A08;
    public C6i A09;
    public String A0C;
    public FbUserSession A0D;
    public final C0i A0F = new C0i(this);
    public final Be5 A0G = new Be5(this);
    public final Be6 A0H = new Be6(this);
    public final ViewTreeObserver.OnPreDrawListener A0K = new CZQ(this, 0);
    public final ViewTreeObserver.OnPreDrawListener A0E = new CZQ(this, 1);
    public final Be7 A0I = new Be7(this);
    public final Be8 A0L = new Be8(this);
    public ImmutableList A0A = ImmutableList.of();
    public ImmutableList A0B = ImmutableList.of();
    public final ArrayList A0J = AnonymousClass001.A0s();

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.Fragment, X.AlG] */
    public static C1555AlG A03(2TP r301, CreateGroupFragmentParams createGroupFragmentParams, ImmutableList immutableList, String str) {
        ?? c1555AlG = new C1555AlG();
        Bundle A05 = 1BK.A05();
        A05.putParcelableArrayList("preselected_contact_list", 1BK.A17(immutableList));
        if (r301 == null) {
            r301 = 2TP.A0K;
        }
        A05.putSerializable("main_friend_list_type", r301);
        A05.putSerializable("suggested_friend_list_type", null);
        A05.putString("optional_header", createGroupFragmentParams.A0E);
        A05.putString("optional_fb_group_id", str);
        A05.putString("optional_entry_point", createGroupFragmentParams.A0D);
        c1555AlG.setArguments(A05);
        return c1555AlG;
    }

    public static void A06(C1555AlG c1555AlG) {
        2TR A00;
        c1555AlG.A0A = ImmutableList.of();
        BuS buS = c1555AlG.A08;
        buS.getClass();
        2TP r0 = c1555AlG.A03;
        Be8 be8 = c1555AlG.A0L;
        ImmutableList.of();
        buS.A00 = r0;
        buS.A02 = be8;
        2TN A0T = AbM.A0T();
        int ordinal = r0.ordinal();
        if (ordinal == 0) {
            A00 = 2TN.A00(30);
        } else {
            if (ordinal != 17) {
                throw AnonymousClass002.A0C(r0, "Unsupported friend list type: ", AnonymousClass001.A0k());
            }
            A00 = A0T.A03(buS.A03);
        }
        buS.A01 = A00;
        A00.A01 = new Cbt(buS, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A07(C1555AlG c1555AlG) {
        Executor A1D = AbJ.A1D();
        String string = c1555AlG.requireArguments().getString("optional_header");
        C3q c3q = c1555AlG.A07;
        FbUserSession fbUserSession = c1555AlG.A0D;
        fbUserSession.getClass();
        ImmutableList immutableList = c1555AlG.A0B;
        D4q.A02(c3q.A02.D3C(new DB7(fbUserSession, ImmutableList.copyOf((Collection) c1555AlG.A0J), immutableList, c3q, string, 1)), c1555AlG, A1D, 36);
    }

    public static void A08(C1555AlG c1555AlG, ImmutableList immutableList) {
        1Iw r0 = c1555AlG.A02.A09;
        2cM A01 = 2cK.A01(r0, (String) null, 0);
        8T0 A00 = 8mB.A00(r0);
        A00.A2Y(immutableList);
        A00.A0R();
        A00.A0J();
        1LI A0V = 7zL.A0V(A01, A00.A01);
        LithoView lithoView = c1555AlG.A02;
        ComponentTree componentTree = lithoView.A00;
        if (componentTree == null) {
            AbN.A19(A0V, lithoView.A09, lithoView);
        } else {
            componentTree.A0P(A0V);
        }
    }

    public 1iF A1R() {
        return AbJ.A0D();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        String str;
        this.A0D = 1BL.A0G(this);
        this.A08 = (BuS) 1Bn.A0A(84225);
        this.A09 = (C6i) 1Bn.A0A(84144);
        this.A01 = (AbR) 7zO.A0l(this, 638);
        this.A00 = (AbR) 1Bn.A0A(637);
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("loaded_users_list");
            this.A0B = parcelableArrayList != null ? ImmutableList.copyOf((Collection) parcelableArrayList) : ImmutableList.of();
            str = "selected_contact_list";
        } else {
            bundle = requireArguments();
            str = "preselected_contact_list";
        }
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(str);
        if (parcelableArrayList2 != null) {
            this.A0J.addAll(parcelableArrayList2);
        }
        this.A03 = requireArguments().getSerializable("main_friend_list_type");
        requireArguments().getSerializable("suggested_friend_list_type");
        this.A0C = requireArguments().getString("optional_fb_group_id");
        requireArguments().getString("optional_entry_point");
        A06(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1055572759);
        ContextThemeWrapper A06 = 0NA.A06(getContext(), 2130969365, 2132607922);
        FbUserSession A0G = 1BL.A0G(this);
        AbR abR = this.A00;
        abR.getClass();
        Context context = getContext();
        2TP r0 = this.A03;
        C0i c0i = this.A0F;
        Be5 be5 = this.A0G;
        Be6 be6 = this.A0H;
        String str = this.A0C;
        ImmutableList of = ImmutableList.of();
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            Bxx bxx = new Bxx(context, A0G, r0, c0i, be5, be6, of, str);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A06 = bxx;
            this.A02 = 7zO.A0V(A06);
            this.A02.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
            AbR abR2 = this.A01;
            abR2.getClass();
            A01 = FbInjector.A01();
            AbL.A0y(abR2);
            C3q c3q = new C3q(abR2, be5);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A07 = c3q;
            A07(this);
            LithoView lithoView = this.A02;
            0FI.A08(-414993192, A02);
            return lithoView;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("loaded_users_list", 1BK.A17(this.A0B));
        bundle.putParcelableArrayList("selected_contact_list", this.A0J);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(-1968892062);
        super/*androidx.fragment.app.Fragment*/.onStart();
        if (this.A0B.isEmpty()) {
            BuS buS = this.A08;
            buS.getClass();
            buS.A01.A08();
        }
        0FI.A08(545985687, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(1064033602);
        super/*androidx.fragment.app.Fragment*/.onStop();
        BuS buS = this.A08;
        buS.getClass();
        buS.A01.AEC();
        0FI.A08(1094634700, A02);
    }
}

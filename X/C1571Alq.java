package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.communitylistmanagement.model.CommunityItem;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingCommunityType;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.Alq, reason: case insensitive filesystem */
/* loaded from: Alq.class */
public final class C1571Alq extends 1pK implements 1pN, 2Op {
    public static final BzN A0H = new Object();
    public static final String __redex_internal_original_name = "CommunityListManagementFragment";
    public JZj A00;
    public JZj A01;
    public LiveData A02;
    public FbUserSession A03;
    public 1WY A04;
    public MigColorScheme A05;
    public boolean A08;
    public 1pI A09;
    public LithoView A0A;
    public CommunityMessagingCommunityType A0B;
    public 2MX A0C;
    public final 1Br A0F = 1Bu.A02(this, 81983);
    public ImmutableList A06 = 1BK.A0b();
    public ImmutableList A07 = 1BK.A0b();
    public final 1Br A0E = 1Bu.A00(83325);
    public final Bcv A0G = new Bcv(this);
    public final Observer A0D = CaE.A00(this, 32);

    public static final void A03(C1571Alq c1571Alq) {
        1pI r0 = c1571Alq.A09;
        if (r0 != null) {
            if (!r0.BVa()) {
                return;
            }
            1pI r02 = c1571Alq.A09;
            if (r02 != null) {
                r02.CeH(__redex_internal_original_name);
                return;
            }
        }
        11T.A0L("contentViewManager");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(C1571Alq c1571Alq) {
        String str;
        if (!c1571Alq.A08) {
            LithoView lithoView = c1571Alq.A0A;
            str = "lithoView";
            if (lithoView != null) {
                1Iw A0U = AbF.A0U(lithoView);
                CxE A00 = CxE.A00(c1571Alq, 28);
                LithoView lithoView2 = c1571Alq.A0A;
                if (lithoView2 != null) {
                    MigColorScheme migColorScheme = c1571Alq.A05;
                    if (migColorScheme != null) {
                        Bcv bcv = c1571Alq.A0G;
                        ImmutableList immutableList = c1571Alq.A06;
                        A07(c1571Alq);
                        lithoView2.A0x(new C1978Ay7(A0U, bcv, migColorScheme, A00, immutableList));
                        return;
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        if (c1571Alq.A01 != null) {
            return;
        }
        Context requireContext = c1571Alq.requireContext();
        1Bn.A0A(67527);
        String A0u = 1BK.A0u(requireContext, 2131957583);
        String A0u2 = 1BK.A0u(requireContext, 2131957582);
        String A0u3 = 1BK.A0u(requireContext, 2131957581);
        String A0u4 = 1BK.A0u(requireContext, 2131957580);
        MigColorScheme migColorScheme2 = c1571Alq.A05;
        if (migColorScheme2 != null) {
            DR6 dr6 = new DR6(requireContext, migColorScheme2);
            dr6.A03(A0u);
            dr6.A0J(A0u2);
            dr6.A0K(true);
            CQx.A00(dr6, c1571Alq, 1);
            CSG.A02(dr6, A0u3, c1571Alq, 41);
            CSG.A01(dr6, A0u4, c1571Alq, 42);
            JZj A04 = dr6.A04();
            A04.show();
            c1571Alq.A01 = A04;
            return;
        }
        str = "colorScheme";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final boolean A07(C1571Alq c1571Alq) {
        Iterator it = c1571Alq.A06.iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            if (!((CommunityItem) it.next()).A00) {
                i++;
            }
        }
        1WY r0 = c1571Alq.A04;
        if (r0 == null) {
            11T.A0L("communityMessagingGatingUtil");
            throw 0Q8.createAndThrow();
        }
        if (i >= 2yD.A00(1WY.A01(r0), 36599855870710535L)) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A08(C1571Alq c1571Alq, boolean z) {
        if (z || c1571Alq.A07.containsAll(c1571Alq.A06)) {
            AbJ.A0O(((C0K) 1Br.A0B(c1571Alq.A0E)).A00).A04(new CommunityMessagingLoggerModel(null, null, null, null, null, null, "ia_inbox", "messenger", "manage_communities_cancel", null, null, null));
            A03(c1571Alq);
            return true;
        }
        Context requireContext = c1571Alq.requireContext();
        1Bn.A0A(67527);
        String A0u = 1BK.A0u(requireContext, 2131953790);
        String A0u2 = 1BK.A0u(requireContext, 2131953789);
        String A0u3 = 1BK.A0u(requireContext, 2131953788);
        String A0u4 = 1BK.A0u(requireContext, 2131953787);
        MigColorScheme migColorScheme = c1571Alq.A05;
        if (migColorScheme != null) {
            DR6 dr6 = new DR6(requireContext, migColorScheme);
            dr6.A03(A0u);
            dr6.A0J(A0u2);
            CSG.A02(dr6, A0u3, c1571Alq, 39);
            CSG.A01(dr6, A0u4, c1571Alq, 40);
            JZj A04 = dr6.A04();
            A04.show();
            c1571Alq.A00 = A04;
            Button button = A04.A00.A0H;
            MigColorScheme migColorScheme2 = c1571Alq.A05;
            if (migColorScheme2 != null) {
                button.setTextColor(migColorScheme2.B6U());
                return false;
            }
        }
        11T.A0L("colorScheme");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1S(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1571Alq.A1S(android.os.Bundle):void");
    }

    public boolean Bkd() {
        return !A08(this, false);
    }

    public void CpV(2MX r302) {
        this.A0C = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(606267692);
        Context requireContext = requireContext();
        this.A05 = 7zR.A0c(requireContext);
        1Iw A0W = 7zL.A0W(requireContext);
        LithoView lithoView = new LithoView(A0W);
        this.A0A = lithoView;
        AbL.A11(A0W, lithoView);
        LithoView lithoView2 = this.A0A;
        if (lithoView2 == null) {
            AbF.A1G();
            throw 0Q8.createAndThrow();
        }
        0FI.A08(1614130613, A02);
        return lithoView2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("BUNDLE_SHOW_HIDDEN_COMMUNITY_WARNING", this.A08);
        bundle.putParcelableArray("BUNDLE_COMMUNITY_ITEM_LIST", (Parcelable[]) this.A06.toArray(new CommunityItem[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(2114543104);
        super/*androidx.fragment.app.Fragment*/.onStart();
        LiveData liveData = this.A02;
        if (liveData == null) {
            11T.A0L("communityListResource");
            throw 0Q8.createAndThrow();
        }
        liveData.observeForever(this.A0D);
        0FI.A08(1303976613, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(-1651472086);
        super/*androidx.fragment.app.Fragment*/.onStop();
        LiveData liveData = this.A02;
        if (liveData == null) {
            11T.A0L("communityListResource");
            throw 0Q8.createAndThrow();
        }
        liveData.removeObserver(this.A0D);
        0FI.A08(-214469111, A02);
    }

    public void onViewCreated(View view, Bundle bundle) {
        LinkedHashMap linkedHashMap;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A09 = 1vD.A00(view);
        A06(this);
        C0K c0k = (C0K) 1Br.A0B(this.A0E);
        CommunityMessagingCommunityType communityMessagingCommunityType = this.A0B;
        if (communityMessagingCommunityType != null) {
            int ordinal = communityMessagingCommunityType.ordinal();
            linkedHashMap = 04R.A0A(7zQ.A1b("section", ordinal != 1 ? ordinal != 0 ? "" : "facebook_groups" : "messenger_standalone_communities"));
        } else {
            linkedHashMap = null;
        }
        AbJ.A0O(c0k.A00).A03(new CommunityMessagingLoggerModel(null, null, null, null, null, null, null, "messenger", "manage_communities_list_rendered", "ia_inbox", null, linkedHashMap));
    }
}

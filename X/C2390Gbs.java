package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.facebook.litho.LithoView;
import com.facebook.messaging.polling.PollingInputParams;
import com.facebook.messaging.polling.plugins.interfaces.pollmutation.PollMutationHandlerInterfaceSpec$MutationHandlerOverride;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Gbs, reason: case insensitive filesystem */
/* loaded from: Gbs.class */
public final class C2390Gbs extends 1pK implements DF4, DF3 {
    public static final String __redex_internal_original_name = "PollVotingLithoFragment";
    public C00i A00;
    public LithoView A01;
    public 6Je A02;
    public BgM A03;
    public HmV A04;
    public HjR A05;
    public MigColorScheme A06;
    public Runnable A07;
    public C15h A08;
    public final C00i A09 = AbF.A0S(this, 114929);
    public final C00i A0A = 1BQ.A00();
    public final HUa A0C = new HUa(this);
    public final HUb A0B = new HUb(this);

    public 1iF A1R() {
        return AbF.A0C(303710824046315L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [com.facebook.mig.scheme.interfaces.MigColorScheme] */
    /* JADX WARN: Type inference failed for: r301v0, types: [androidx.fragment.app.Fragment, java.lang.Object, X.Gbs, X.00g] */
    public void A1S(Bundle bundle) {
        this.A00 = 1Lo.A02(1BL.A0G((Fragment) this), (C00g) this, 116271);
        this.mArguments.getClass();
        IAZ A0K = AbstractC2326GOr.A0K(this);
        Bundle bundle2 = bundle != null ? bundle : this.mArguments;
        PollingInputParams pollingInputParams = (PollingInputParams) AbG.A07(bundle2, "polling_params");
        A0K.A04 = pollingInputParams;
        pollingInputParams.A03.getClass();
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("thread_participants");
        if (parcelableArrayList != null) {
            A0K.A07 = ImmutableList.copyOf((Collection) parcelableArrayList);
        }
        String string = bundle2.getString("poll_question");
        A0K.A08 = string;
        if (TextUtils.isEmpty(string)) {
            A0K.A08 = A0K.A04.A04;
        }
        List list = A0K.A0K;
        list.clear();
        ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList("poll_published_options");
        if (parcelableArrayList2 != null) {
            list.addAll(parcelableArrayList2);
        }
        A0K.A0A = bundle2.getBoolean("disable_draft_options", false);
        List list2 = A0K.A0J;
        list2.clear();
        ArrayList parcelableArrayList3 = bundle2.getParcelableArrayList("poll_draft_options");
        if (parcelableArrayList3 != null) {
            list2.addAll(parcelableArrayList3);
        } else if (!A0K.A0A) {
            IAZ.A00(A0K);
        }
        A0K.A0B = bundle2.getBoolean("is_community_thread", false);
        A0K.A09 = bundle2.getBoolean("poll_data_loaded", false);
        A0K.A0E = bundle2.getBoolean("is_polls_v2_enabled", false);
        Capabilities capabilities = (Capabilities) bundle2.getParcelable("capabilities");
        if (capabilities != null) {
            A0K.A06 = capabilities;
        }
        if (this.A06 == null) {
            this.A06 = bundle != null ? (MigColorScheme) bundle.getParcelable("color_scheme") : LightColorScheme.A00();
        }
        this.A08 = J5u.A03(this, 38);
        this.mArguments.getParcelable("thread_key").getClass();
        this.A04 = new HmV((HPT) C1Y6.A00(null, "com_facebook_messaging_polling_plugins_interfaces_pollmutation_PollMutationHandlerInterfaceSpec", "All", new Object[]{requireContext(), this.mArguments.getBoolean(AbE.A00(180)) ? PollMutationHandlerInterfaceSpec$MutationHandlerOverride.A03 : PollMutationHandlerInterfaceSpec$MutationHandlerOverride.A02, this.mArguments.getParcelable("thread_key")}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1X(String str, String str2) {
        if (getContext() != null) {
            if (str == null) {
                str = getString(2131963439);
                str2 = getString(2131963441);
            }
            HoR hoR = (HoR) this.A09.get();
            Context context = getContext();
            11T.A0F(context, 0);
            hoR.A00(context, (HUb) null, str, str2);
        }
    }

    @Override // X.DF4
    public void CQW(ThreadViewColorScheme threadViewColorScheme) {
        MigColorScheme migColorScheme = threadViewColorScheme.A0F;
        if (Objects.equal(this.A06, migColorScheme)) {
            return;
        }
        this.A06 = migColorScheme;
        C00i c00i = this.A00;
        if (c00i == null || c00i.get() == null) {
            return;
        }
        AbstractC2326GOr.A0K(this).A03();
    }

    @Override // X.DF3
    public void CmU(6Je r302) {
        this.A02 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1748296075);
        1Iw A0P = AbI.A0P(this);
        this.A01 = new LithoView(A0P);
        IAZ A0K = AbstractC2326GOr.A0K(this);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Context context = this.A01.getContext();
        A0K.A05 = this;
        A0K.A01 = viewLifecycleOwner;
        A0K.A00 = context;
        this.A05 = new HjR(A0P, this.A0C);
        LithoView lithoView = this.A01;
        0FI.A08(2103802198, A02);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int andIncrement;
        String str;
        int A02 = 0FI.A02(-1656878015);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        IAZ A0K = AbstractC2326GOr.A0K(this);
        DKF.A0h(((HgC) A0K.A0G.get()).A03).A06("task_key_load_poll");
        DKF.A0h(((HgD) A0K.A0I.get()).A03).A06("task_key_update_vote_batch");
        LiveData liveData = A0K.A02;
        if (liveData != null) {
            liveData.removeObservers(A0K.A01);
        }
        A0K.A05 = null;
        IAD iad = this.A04.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = iad.A06;
        r0.A08("com.facebook.messaging.polling.plugins.interfaces.pollmutation.PollMutationHandlerInterfaceSpec", "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelUpdatePoll", andIncrement2);
        try {
            if (IAD.A02(iad)) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.polling.core.tammutation.PollMutationTamImplementation";
                r0.A0A("com.facebook.messaging.polling.plugins.core.tammutation.PollMutationTamImplementation", str, "com.facebook.messaging.polling.plugins.interfaces.pollmutation.PollMutationHandlerInterfaceSpec", andIncrement, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "com.facebook.messaging.polling.plugins.core.PollingCoreKillSwitch", "cancelUpdatePoll");
            } else if (IAD.A01(iad)) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.polling.core.msysmutation.PollMutationMsysImplementation";
                r0.A0A("com.facebook.messaging.polling.plugins.core.msysmutation.PollMutationMsysImplementation", str, "com.facebook.messaging.polling.plugins.interfaces.pollmutation.PollMutationHandlerInterfaceSpec", andIncrement, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "com.facebook.messaging.polling.plugins.core.PollingCoreKillSwitch", "cancelUpdatePoll");
            } else {
                if (!IAD.A00(iad)) {
                    r0.A02((Exception) null, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelUpdatePoll", andIncrement2);
                    0FI.A08(260828593, A02);
                }
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.polling.core.graphqlmutation.PollMutationGraphQLImplementation";
                try {
                    r0.A0A("com.facebook.messaging.polling.plugins.core.graphqlmutation.PollMutationGraphQLImplementation", str, "com.facebook.messaging.polling.plugins.interfaces.pollmutation.PollMutationHandlerInterfaceSpec", andIncrement, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "com.facebook.messaging.polling.plugins.core.PollingCoreKillSwitch", "cancelUpdatePoll");
                    try {
                        DKF.A0h(((HgD) 1Br.A0B(iad.A00.A03)).A03).A06("task_key_update_vote_batch");
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, str, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelUpdatePoll", andIncrement);
                    throw th;
                }
            }
            r0.A09(str, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelUpdatePoll", andIncrement);
            r0.A02((Exception) null, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelUpdatePoll", andIncrement2);
            0FI.A08(260828593, A02);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelUpdatePoll", andIncrement2);
            throw th2;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        IAZ A0K = AbstractC2326GOr.A0K(this);
        bundle.putParcelable("polling_params", A0K.A04);
        bundle.putString("poll_question", A0K.A08);
        bundle.putParcelableArrayList("poll_published_options", 1BK.A17(A0K.A0K));
        bundle.putParcelableArrayList("poll_draft_options", 1BK.A17(A0K.A0J));
        bundle.putParcelableArrayList("thread_participants", 1BK.A17(A0K.A07));
        bundle.putBoolean("is_community_thread", A0K.A0B);
        bundle.putBoolean("disable_draft_options", A0K.A0A);
        bundle.putBoolean("poll_data_loaded", A0K.A09);
        bundle.putBoolean("is_polls_v2_enabled", A0K.A0E);
        bundle.putParcelable("color_scheme", this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025e A[Catch: Exception -> 0x02ee, all -> 0x0308, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x02ee, blocks: (B:20:0x0229, B:21:0x022e, B:24:0x023a, B:27:0x0244, B:30:0x025e, B:32:0x0267, B:33:0x026b, B:33:0x026b, B:37:0x0277, B:39:0x0282, B:41:0x028d, B:42:0x0294, B:43:0x029b, B:44:0x02a2, B:46:0x02bd, B:47:0x02c4, B:48:0x02c9, B:48:0x02c9, B:51:0x02d8, B:52:0x02dd, B:58:0x02d1, B:60:0x0252), top: B:19:0x0229, outer: #5 }] */
    /* JADX WARN: Type inference failed for: r0v195, types: [java.util.concurrent.atomic.AtomicInteger, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Throwable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 2341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2390Gbs.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}

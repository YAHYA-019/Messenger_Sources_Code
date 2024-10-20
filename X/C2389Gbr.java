package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.polling.plugins.interfaces.pollmutation.PollMutationHandlerInterfaceSpec$MutationHandlerOverride;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Gbr, reason: case insensitive filesystem */
/* loaded from: Gbr.class */
public final class C2389Gbr extends 1pK implements DF4, DF3 {
    public static final String __redex_internal_original_name = "PollCreationLithoFragment";
    public C00i A00;
    public LithoView A01;
    public 6Je A02;
    public HzU A03;
    public HmV A04;
    public final C00i A06 = AbF.A0S(this, 114929);
    public final C00i A07 = 1BV.A00(68020);
    public MigColorScheme A05 = LightColorScheme.A00();
    public final RG2 A08 = new RG2(this);

    public 1iF A1R() {
        return AbF.A0C(303710824046315L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A00 = 1Lo.A02(1BL.A0G(this), this, 116272);
        this.mArguments.getClass();
        ICJ A0J = AbstractC2326GOr.A0J(this);
        if (bundle == null) {
            bundle = this.mArguments;
        }
        A0J.A01 = (ThreadKey) AbG.A07(bundle, "thread_key");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("thread_participants");
        parcelableArrayList.getClass();
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            A0J.A0C.put(it.next(), AnonymousClass001.A0K());
        }
        A0J.A03 = bundle.getString("poll_question");
        A0J.A04 = bundle.getString("most_likely_to_question");
        int i = 0;
        A0J.A05 = bundle.getBoolean(AbE.A00(564), false);
        long j = bundle.getLong(AbE.A00(669));
        BOT[] values = BOT.values();
        int length = values.length;
        while (true) {
            if (i >= length) {
                break;
            }
            BOT bot = values[i];
            if (bot.mValue == j) {
                A0J.A00 = bot;
                break;
            }
            i++;
        }
        if (TextUtils.isEmpty(A0J.A04) && 61N.A00((61N) A0J.A0A.get()).AZk(36316018661992068L)) {
            A0J.A04((Hb9) null);
        }
        List list = A0J.A0B;
        list.clear();
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("poll_draft_options");
        if (parcelableArrayList2 != null) {
            list.addAll(parcelableArrayList2);
        } else {
            ICJ.A00(A0J);
        }
        A0J.A06 = ICJ.A02(A0J);
        this.mArguments.getParcelable("thread_key").getClass();
        this.A04 = new HmV((HPT) C1Y6.A00(null, "com_facebook_messaging_polling_plugins_interfaces_pollmutation_PollMutationHandlerInterfaceSpec", "All", new Object[]{requireContext(), this.mArguments.getBoolean(AbE.A00(180)) ? PollMutationHandlerInterfaceSpec$MutationHandlerOverride.A03 : PollMutationHandlerInterfaceSpec$MutationHandlerOverride.A02, this.mArguments.getParcelable("thread_key")}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1X(String str, String str2) {
        if (getContext() != null) {
            if (str == null) {
                str = getString(2131963439);
                str2 = getString(2131963438);
            }
            HoR hoR = (HoR) this.A06.get();
            Context context = getContext();
            11T.A0F(context, 0);
            hoR.A00(context, (HUb) null, str, str2);
        }
    }

    @Override // X.DF4
    public void CQW(ThreadViewColorScheme threadViewColorScheme) {
        MigColorScheme migColorScheme = threadViewColorScheme.A0F;
        if (Objects.equal(this.A05, migColorScheme)) {
            return;
        }
        this.A05 = migColorScheme;
        C00i c00i = this.A00;
        if (c00i == null || c00i.get() == null) {
            return;
        }
        AbstractC2326GOr.A0J(this).A03();
    }

    @Override // X.DF3
    public void CmU(6Je r302) {
        this.A02 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(193470815);
        1Iw A0P = AbI.A0P(this);
        this.A01 = new LithoView(A0P);
        AbstractC2326GOr.A0J(this).A02 = this;
        this.A03 = new HzU(A0P, this.A08, (61N) this.A07.get());
        LithoView lithoView = this.A01;
        0FI.A08(2041437426, A02);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int andIncrement;
        String str;
        int A02 = 0FI.A02(1976473547);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        ICJ A0J = AbstractC2326GOr.A0J(this);
        A0J.A0C.clear();
        A0J.A02 = null;
        IAD iad = this.A04.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = iad.A06;
        r0.A08("com.facebook.messaging.polling.plugins.interfaces.pollmutation.PollMutationHandlerInterfaceSpec", "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelCreatePoll", andIncrement2);
        try {
            if (IAD.A02(iad)) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.polling.core.tammutation.PollMutationTamImplementation";
                r0.A0A("com.facebook.messaging.polling.plugins.core.tammutation.PollMutationTamImplementation", str, "com.facebook.messaging.polling.plugins.interfaces.pollmutation.PollMutationHandlerInterfaceSpec", andIncrement, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "com.facebook.messaging.polling.plugins.core.PollingCoreKillSwitch", "cancelCreatePoll");
            } else if (IAD.A01(iad)) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.polling.core.msysmutation.PollMutationMsysImplementation";
                r0.A0A("com.facebook.messaging.polling.plugins.core.msysmutation.PollMutationMsysImplementation", str, "com.facebook.messaging.polling.plugins.interfaces.pollmutation.PollMutationHandlerInterfaceSpec", andIncrement, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "com.facebook.messaging.polling.plugins.core.PollingCoreKillSwitch", "cancelCreatePoll");
            } else {
                if (!IAD.A00(iad)) {
                    r0.A02((Exception) null, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelCreatePoll", andIncrement2);
                    0FI.A08(-526241617, A02);
                }
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.polling.core.graphqlmutation.PollMutationGraphQLImplementation";
                try {
                    r0.A0A("com.facebook.messaging.polling.plugins.core.graphqlmutation.PollMutationGraphQLImplementation", str, "com.facebook.messaging.polling.plugins.interfaces.pollmutation.PollMutationHandlerInterfaceSpec", andIncrement, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "com.facebook.messaging.polling.plugins.core.PollingCoreKillSwitch", "cancelCreatePoll");
                    try {
                        DKF.A0h(((HgD) 1Br.A0B(iad.A00.A03)).A03).A06("task_key_create_poll");
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, str, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelCreatePoll", andIncrement);
                    throw th;
                }
            }
            r0.A09(str, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelCreatePoll", andIncrement);
            r0.A02((Exception) null, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelCreatePoll", andIncrement2);
            0FI.A08(-526241617, A02);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.polling.pollmutation.PollMutationHandlerInterfaceSpec", "cancelCreatePoll", andIncrement2);
            throw th2;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ICJ A0J = AbstractC2326GOr.A0J(this);
        bundle.putParcelable("thread_key", A0J.A01);
        bundle.putString("poll_question", A0J.A03);
        if (!TextUtils.isEmpty(A0J.A04) && TextUtils.isGraphic(A0J.A04)) {
            bundle.putString("most_likely_to_question", A0J.A04);
        }
        bundle.putParcelableArrayList("poll_draft_options", 1BK.A17(A0J.A0B));
        bundle.putParcelableArrayList("thread_participants", 1BK.A17(A0J.A0C.keySet()));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if ((!TextUtils.isEmpty(AbstractC2326GOr.A0J(this).A04)) || !AbstractC2326GOr.A0J(this).A05) {
            AbstractC2326GOr.A0J(this).A03();
        } else {
            AbstractC2326GOr.A0J(this).A04((Hb9) null);
        }
    }
}

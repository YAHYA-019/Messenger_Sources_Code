package X;

import androidx.fragment.app.Fragment;
import com.facebook.messaging.customthreads.name.dialog.ThreadNameSettingDialogFragment;
import com.facebook.messaging.lockchat.auth.AuthLockChatState;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: DBg.class */
public final class DBg implements C00l, C00m {
    public final int A00;
    public final Object A01;

    public DBg(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C00m
    public final Object invoke() {
        int andIncrement;
        String str;
        switch (this.A00) {
            case 0:
                final ThreadNameSettingDialogFragment threadNameSettingDialogFragment = (ThreadNameSettingDialogFragment) this.A01;
                AnonymousClass001.A07().post(new Runnable() { // from class: X.D5c
                    public static final String __redex_internal_original_name = "ThreadNameSettingDialogFragment$$ExternalSyntheticLambda0";

                    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.messaging.customthreads.name.dialog.ThreadNameSettingDialogFragment, androidx.fragment.app.Fragment, java.lang.Object] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ?? r0 = ThreadNameSettingDialogFragment.this;
                        6HM r02 = r0.A04;
                        C8S c8s = new C8S(7zO.A0D((Fragment) r0));
                        c8s.A05 = AbK.A12(r0.requireContext());
                        c8s.A00(2131957310);
                        c8s.A02 = CSG.A00((Object) r0, 60);
                        COW.A01(c8s, r02);
                    }
                });
                return null;
            case 1:
                C1557Alb c1557Alb = (C1557Alb) this.A01;
                ((AuthLockChatState) c1557Alb.A0o.get()).A01.set(false);
                C1557Alb.A0N(c1557Alb, 0S2.A00);
                return null;
            default:
                CMd cMd = ((BgO) this.A01).A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                int andIncrement2 = atomicInteger.getAndIncrement();
                1YC r0 = cMd.A04;
                r0.A08("com.facebook.messaging.polling.plugins.interfaces.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec", "messaging.polling.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec", "loadMoreItems", andIncrement2);
                Exception e = null;
                try {
                    if (!CMd.A00(cMd)) {
                        if (CMd.A01(cMd)) {
                            andIncrement = atomicInteger.getAndIncrement();
                            str = "messaging.polling.core.voterslistdataprovider.PollVotersListDataProviderImplementation";
                            r0.A0A("com.facebook.messaging.polling.plugins.core.voterslistdataprovider.PollVotersListDataProviderImplementation", str, "com.facebook.messaging.polling.plugins.interfaces.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec", andIncrement, "messaging.polling.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec", 4YT.A00(57), "loadMoreItems");
                        }
                        r0.A02((Exception) null, "messaging.polling.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec", "loadMoreItems", andIncrement2);
                        return 04S.A00;
                    }
                    andIncrement = atomicInteger.getAndIncrement();
                    str = "messaging.communitymessaging.polls.votersdataprovider.CommunityMessagingVotersDataProviderImplementation";
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.polls.votersdataprovider.CommunityMessagingVotersDataProviderImplementation", str, "com.facebook.messaging.polling.plugins.interfaces.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec", andIncrement, "messaging.polling.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.polls.CommunitymessagingPollsKillSwitch", "loadMoreItems");
                    try {
                        try {
                            Bx8 bx8 = cMd.A00.A00;
                            if (bx8 != null) {
                                C2633Gjl c2633Gjl = bx8.A00;
                                boolean z = c2633Gjl.A03;
                                boolean z2 = c2633Gjl.A02;
                                String str2 = c2633Gjl.A01;
                                if (!z && z2) {
                                    bx8.A04.A0N(str2, bx8.A02, bx8.A01);
                                }
                            }
                        } catch (Throwable th) {
                            r0.A04(e, str, "messaging.polling.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec", "loadMoreItems", andIncrement);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                    r0.A09(str, "messaging.polling.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec", "loadMoreItems", andIncrement);
                    r0.A02((Exception) null, "messaging.polling.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec", "loadMoreItems", andIncrement2);
                    return 04S.A00;
                } catch (Throwable th2) {
                    r0.A02(e, "messaging.polling.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec", "loadMoreItems", andIncrement2);
                    throw th2;
                }
        }
    }
}

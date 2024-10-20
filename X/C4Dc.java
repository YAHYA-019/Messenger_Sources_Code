package X;

import com.facebook.messaging.msys.lifecycle.plugins.lifecycle.inboxtray.closeconnections.CloseConnectionsLoaderPluginImplementation;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.4Dc, reason: invalid class name */
/* loaded from: 4Dc.class */
public final class C4Dc implements Runnable {
    public static final String __redex_internal_original_name = "CloseConnectionsLoaderPluginImplementation$onMailboxBootstrapCompletion$1";
    public final /* synthetic */ CloseConnectionsLoaderPluginImplementation A00;

    public C4Dc(CloseConnectionsLoaderPluginImplementation closeConnectionsLoaderPluginImplementation) {
        this.A00 = closeConnectionsLoaderPluginImplementation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final 3yY r0 = (3yY) this.A00.A00.A00.get();
        C00j.A05("CloseConnectionsPrefetcher.prefetchCloseConnections", 1213122077);
        try {
            0fH.A0j("CloseConnectionsPrefetcher", "Prefetch close connections");
            2TR A03 = ((2TN) 1Bi.A03(17024)).A03(ImmutableList.of());
            A03.A01 = new 2UY() { // from class: X.4Dd
                public /* bridge */ /* synthetic */ void C4X(Object obj, Object obj2) {
                    2TS r02 = (2TS) obj2;
                    11T.A0F(r02, 1);
                    3yY r03 = r0;
                    List list = r02.A09;
                    if (list == null) {
                        list = C0ty.A00;
                    }
                    r03.A01 = list;
                    ((1SG) r03.A05.A00.get()).A0K(0Pz.A0T("inbox_tray/fetch_cc/end/", r03.A01.size()));
                    0fH.A0j("CloseConnectionsPrefetcher", 0Pz.A0d("Successfully fetched ", " contacts from ContactsLoader", r03.A01.size()));
                    3yZ r04 = r03.A00;
                    if (r04 != null) {
                        0fH.A0j("CloseConnectionsLoader", "Using close connections returned by prefetcher");
                        2Te r05 = r04.A00;
                        2Tt r06 = r05.A01;
                        if (r06 != null) {
                            r06.BpO(2Te.A00(r05, 2Te.A01(((3yY) r05.A06.A00.get()).A01)));
                        }
                    }
                }
            };
            if (r0.A02.isEmpty()) {
                ((1Wc) r0.A05.A00.get()).A0K("inbox_tray/fetch_cc_start/fetch_rs_start");
                2Tn r02 = (2Tn) r0.A04.A00.get();
                ListenableFuture D3C = ((1ED) r02.A01.get()).D3C(new C3ix(r02, 2));
                11T.A0A(D3C);
                1Kd.A0F(new C3dr(A03, r0, 2), D3C, (Executor) 1Bi.A03(16449));
            } else {
                ((1Wc) r0.A05.A00.get()).A0K("inbox_tray/fetch_cc/start");
                A03.A0A(ImmutableList.copyOf((Collection) r0.A02));
                A03.A09(r0.A03);
                0fH.A0j("CloseConnectionsPrefetcher", "rankingScores list is already populated, directly fetching contacts");
            }
            C00j.A01(-113469621);
        } catch (Throwable th) {
            C00j.A01(542676372);
            throw th;
        }
    }
}

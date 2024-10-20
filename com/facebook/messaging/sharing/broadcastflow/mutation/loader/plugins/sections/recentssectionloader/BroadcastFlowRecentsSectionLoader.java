package com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.recentssectionloader;

import X.0fH;
import X.11T;
import X.1BL;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1SG;
import X.1fF;
import X.2yD;
import X.4YU;
import X.7zP;
import X.7zR;
import X.AnonymousClass001;
import X.Bhq;
import X.BzA;
import X.C00j;
import X.C6r;
import X.CBr;
import X.CLz;
import X.Cbf;
import X.Cst;
import X.DAO;
import X.DHX;
import X.DJZ;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: BroadcastFlowRecentsSectionLoader.class */
public final class BroadcastFlowRecentsSectionLoader {
    public final Context A00;
    public final FbUserSession A01;
    public final DHX A02;
    public final DJZ A03;
    public final C6r A04;
    public final ImmutableList.Builder A05;
    public final Set A06;

    public BroadcastFlowRecentsSectionLoader(Context context, FbUserSession fbUserSession, DHX dhx, DJZ djz, C6r c6r, ImmutableList.Builder builder, Set set) {
        1BL.A1H(dhx, djz, set);
        1BL.A1G(builder, c6r);
        7zR.A1P(context, fbUserSession);
        this.A02 = dhx;
        this.A03 = djz;
        this.A06 = set;
        this.A05 = builder;
        this.A04 = c6r;
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    /* JADX WARN: Type inference failed for: r0v97, types: [java.util.concurrent.Future, com.google.common.util.concurrent.SettableFuture] */
    public final void A00() {
        int i;
        int size;
        Object obj;
        1Bn.A0A(147750);
        1Bn.A0A(147751);
        Bhq bhq = (Bhq) 1Bi.A03(83165);
        1SG r0 = (1SG) 1Bi.A03(83798);
        1fF r02 = (1fF) 1Bi.A03(66655);
        BzA Ay1 = this.A03.Ay1();
        try {
            try {
                C00j.A05("BroadcastFlowRecentsSectionLoader.addSectionModel", -214358892);
                1Br r03 = bhq.A00;
                7zP.A0e(r03).markerPoint(276892616, "start_recents_section_load");
                r0.A0O("recent_section");
                Context context = this.A00;
                FbUserSession fbUserSession = this.A01;
                11T.A0D(Ay1);
                1fF r04 = (1fF) 1Bi.A03(66655);
                int A00 = (1fF.A00(r04).AZk(36325222776852951L) || 1fF.A00(r04).AZk(36325222778229221L)) ? 2yD.A00(1fF.A00(r04), 36606697753615888L) : 2;
                Set set = this.A06;
                String string = r02.A05() ? null : 1fF.A00(r02).AZk(36325222776852951L) ? context.getString(2131957029) : context.getString(2131964225);
                boolean A1O = AnonymousClass001.A1O(Ay1.A0s ? 1 : 0);
                1Bn.A0A(84078);
                Cbf cbf = new Cbf(context, fbUserSession);
                boolean z = Ay1.A0p;
                boolean z2 = Ay1.A0t;
                ThreadKey threadKey = Ay1.A05;
                ?? A0j = 4YU.A0j();
                ((ExecutorService) 1Br.A0B(cbf.A02)).execute(new DAO(threadKey, cbf, (SettableFuture) A0j, A00, A1O, z, z2));
                ImmutableList immutableList = Ay1.A0O;
                11T.A09(immutableList);
                ImmutableList immutableList2 = (ImmutableList) A0j.get();
                ImmutableList.Builder builder = ImmutableList.builder();
                if (immutableList.size() > A00) {
                    builder.addAll(immutableList.subList(0, A00));
                    size = A00;
                } else {
                    builder.addAll(immutableList);
                    size = immutableList.size();
                }
                if (immutableList2 != null && !immutableList2.isEmpty()) {
                    int i2 = A00 - size;
                    if (immutableList2.size() <= i2) {
                        builder.addAll(immutableList2);
                    } else {
                        builder.addAll(immutableList2.subList(0, i2));
                    }
                }
                ImmutableList build = builder.build();
                if (build.isEmpty()) {
                    new CLz("recents");
                } else {
                    Cst cst = null;
                    if (string != null) {
                        new Cst(string, null, "recents");
                    }
                    new CLz(cst, CBr.A00(build, set, -1), "recents");
                }
                ImmutableList.Builder builder2 = this.A05;
                builder2.m11011add(obj);
                this.A04.A00(builder2.build());
                7zP.A0e(r03).markerPoint(276892616, "loaded_recents_section");
                r0.A0L("recent_section");
                i = 495738732;
            } catch (Exception e) {
                0fH.A0w("BroadcastFlowRecentsSectionLoader", "BroadcastFlowSectionsLoader failure", e);
                this.A04.A01(e);
                i = -253035264;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(-1036287603);
            throw th;
        }
    }
}

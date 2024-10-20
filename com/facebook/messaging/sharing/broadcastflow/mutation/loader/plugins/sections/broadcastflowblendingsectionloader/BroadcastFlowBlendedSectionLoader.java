package com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.broadcastflowblendingsectionloader;

import X.0Q8;
import X.0QD;
import X.0fH;
import X.11T;
import X.1BL;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Fj;
import X.1fF;
import X.7zP;
import X.7zT;
import X.AbK;
import X.B3p;
import X.Bhq;
import X.Bz9;
import X.BzA;
import X.C00j;
import X.C1j;
import X.C6L;
import X.C6r;
import X.C7E;
import X.CLz;
import X.DJZ;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.sharing.broadcastflow.model.LoadMoreState;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: BroadcastFlowBlendedSectionLoader.class */
public final class BroadcastFlowBlendedSectionLoader {
    public Set A00;
    public final 1Br A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1fF A04;
    public final Bhq A05;
    public final B3p A06;
    public final DJZ A07;
    public final C6L A08;
    public final C6r A09;
    public final C7E A0A;
    public final ImmutableList.Builder A0B;
    public final ImmutableList.Builder A0C;
    public final String A0D;
    public final Set A0E;
    public final boolean A0F;

    public BroadcastFlowBlendedSectionLoader(Context context, FbUserSession fbUserSession, DJZ djz, C6r c6r, ImmutableList.Builder builder, ImmutableList.Builder builder2, Set set, boolean z) {
        7zT.A1W(djz, fbUserSession, set, builder);
        1BL.A1G(builder2, c6r);
        11T.A0F(context, 8);
        this.A07 = djz;
        this.A03 = fbUserSession;
        this.A0E = set;
        this.A0C = builder;
        this.A0B = builder2;
        this.A09 = c6r;
        this.A0F = z;
        this.A02 = context;
        1fF A0c = AbK.A0c();
        this.A04 = A0c;
        1Bn.A0A(84079);
        this.A08 = new C6L(context, fbUserSession);
        this.A0D = A0c.A05() ? null : context.getString(2131966526);
        this.A0A = (C7E) 1Bn.A0E(context, (1BY) null, 84179);
        this.A01 = 1Bq.A00(83794);
        this.A05 = (Bhq) 1Bi.A03(83165);
        this.A06 = (B3p) 1Bi.A03(83798);
    }

    public final void A00() {
        int i;
        try {
            try {
                C00j.A05("BroadcastFlowBlendedSectionLoader.addSectionModel", 1942577049);
                1Br r0 = this.A05.A00;
                7zP.A0e(r0).markerPoint(276892616, "start_suggested_section_load");
                B3p b3p = this.A06;
                b3p.A0O("suggested_section");
                Set set = this.A0E;
                this.A00 = 0QD.A0e(set);
                C6L c6l = this.A08;
                Context context = this.A02;
                BzA Ay1 = this.A07.Ay1();
                11T.A0A(Ay1);
                String str = this.A0D;
                int i2 = 100;
                if (this.A0F) {
                    i2 = 300;
                }
                CLz A00 = c6l.A00(context, Ay1, this.A0A, this.A0B, str, set, i2, false, false);
                ImmutableList.Builder builder = this.A0C;
                builder.m11011add((Object) A00);
                this.A09.A00(builder.build());
                7zP.A0e(r0).markerPoint(276892616, "loaded_suggested_section");
                b3p.A0L("suggested_section");
                C1j c1j = (C1j) 1Br.A0B(this.A01);
                if (c1j.A00() && 1Br.A06(c1j.A00).AZk(36325385986069175L) && A00.A01.isEmpty()) {
                    A01();
                    i = -1151077106;
                } else {
                    i = 1648117725;
                }
            } catch (InterruptedException e) {
                0fH.A0w("BroadcastFlowBlendedSectionLoader", "BroadcastFlowBlendedSectionLoader failure", e);
                this.A09.A01(e);
                i = 1180798601;
            } catch (ExecutionException e2) {
                0fH.A0w("BroadcastFlowBlendedSectionLoader", "BroadcastFlowBlendedSectionLoader failure", e2);
                this.A09.A01(e2);
                i = -1331541069;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(1837347958);
            throw th;
        }
    }

    public final void A01() {
        int i;
        B3p b3p;
        1Br r0;
        C6L c6l;
        Context context;
        BzA Ay1;
        String str;
        Set set;
        try {
            try {
                C00j.A05("BroadcastFlowBlendedSectionLoader.startLoadMore", -967655031);
                b3p = this.A06;
                b3p.A0T("suggested_section", 2, 1L);
                r0 = this.A05.A00;
                7zP.A0e(r0).markerPoint(276892616, "load_more_suggested_start");
                b3p.A0O("suggested_section");
                DJZ djz = this.A07;
                Bz9 Ay4 = djz.Ay4();
                Ay4.A0D = LoadMoreState.LOADING;
                DJZ.A00(Ay4, djz);
                c6l = this.A08;
                context = this.A02;
                Ay1 = djz.Ay1();
                11T.A0A(Ay1);
                str = this.A0D;
                set = this.A00;
            } catch (InterruptedException e) {
                0fH.A0w("BroadcastFlowBlendedSectionLoader", "BroadcastFlowBlendedSectionLoader failure", e);
                this.A09.A01(e);
                i = -1959946935;
            } catch (ExecutionException e2) {
                0fH.A0w("BroadcastFlowBlendedSectionLoader", "BroadcastFlowBlendedSectionLoader failure", e2);
                this.A09.A01(e2);
                i = 188933341;
            }
            if (set == null) {
                11T.A0L("addedThreadIdsForLoadMore");
                throw 0Q8.createAndThrow();
            }
            int i2 = 100;
            if (this.A0F) {
                i2 = 300;
            }
            CLz A00 = c6l.A00(context, Ay1, this.A0A, this.A0B, str, set, i2, false, true);
            ImmutableList.Builder builder = ImmutableList.builder();
            Iterator it = 1Fj.A01(this.A0C).iterator();
            while (it.hasNext()) {
                CLz cLz = (CLz) it.next();
                if (11T.A0O(cLz.A02, "suggested_top")) {
                    builder.m11011add((Object) A00);
                } else {
                    builder.m11011add((Object) cLz);
                }
            }
            C6r c6r = this.A09;
            ImmutableList build = builder.build();
            11T.A0F(build, 0);
            DJZ djz2 = c6r.A00.A07;
            Bz9 Ay42 = djz2.Ay4();
            Ay42.A0P = build;
            Ay42.A0D = LoadMoreState.LOADED;
            DJZ.A00(Ay42, djz2);
            7zP.A0e(r0).markerPoint(276892616, "load_more_suggested_end");
            b3p.A0L("suggested_section");
            i = -1414656925;
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(-1286666814);
            throw th;
        }
    }
}

package com.facebook.messaging.sharing.broadcastflow.mutation.loader.plugins.sections.hoistedthreads;

import X.0Q8;
import X.0fH;
import X.11T;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1FV;
import X.4YU;
import X.4YV;
import X.7zM;
import X.7zT;
import X.C00j;
import X.C6r;
import X.CBr;
import X.CLz;
import X.Cay;
import X.D9O;
import X.DHX;
import X.DJZ;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collection;
import java.util.Set;

/* loaded from: BroadcastFlowHoistedThreadsSectionLoader.class */
public final class BroadcastFlowHoistedThreadsSectionLoader {
    public final 1Br A00;
    public final Set A01;
    public final Context A02;
    public final DHX A03;
    public final DJZ A04;
    public final C6r A05;
    public final ImmutableList.Builder A06;

    public BroadcastFlowHoistedThreadsSectionLoader(Context context, DHX dhx, DJZ djz, C6r c6r, ImmutableList.Builder builder, Set set) {
        7zT.A1W(dhx, djz, set, builder);
        1BL.A1G(c6r, context);
        this.A03 = dhx;
        this.A04 = djz;
        this.A01 = set;
        this.A06 = builder;
        this.A05 = c6r;
        this.A02 = context;
        this.A00 = 7zM.A0e(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.concurrent.Future] */
    public final void A00() {
        int i;
        C00j.A05("BroadcastFlowHoistedThreadsSectionLoader.addSectionModel", 1884302437);
        Cay cay = (Cay) 1Bu.A06(this.A02, 84080);
        FbUserSession A03 = 1Br.A03(this.A00);
        1FV ApN = this.A03.ApN();
        11T.A0A(ApN);
        11T.A0F(A03, 0);
        SettableFuture settableFuture = cay.A00;
        if (settableFuture == null) {
            cay.A00 = 4YU.A0j();
            4YV.A11(cay.A01).execute(new D9O(A03, cay, ApN));
            settableFuture = cay.A00;
            if (settableFuture == null) {
                11T.A0L("resultFuture");
                throw 0Q8.createAndThrow();
            }
        }
        try {
            try {
                ImmutableList copyOf = ImmutableList.copyOf((Collection) settableFuture.get());
                if (!copyOf.isEmpty()) {
                    CLz cLz = new CLz(CBr.A00(copyOf, this.A01, -1), "hoisted_threads");
                    ImmutableList.Builder builder = this.A06;
                    builder.m11011add((Object) cLz);
                    this.A05.A00(builder.build());
                }
                i = -1423980063;
            } catch (Exception e) {
                0fH.A0w("BroadcastFlowHoistedThreadsSectionLoader", "BroadcastFlowSectionsLoader failure", e);
                this.A05.A01(e);
                i = -131456709;
            }
            C00j.A01(i);
        } catch (Throwable th) {
            C00j.A01(-1838515411);
            throw th;
        }
    }
}

package X;

import android.net.Uri;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* loaded from: G40.class */
public final class G40 implements Runnable {
    public static final String __redex_internal_original_name = "PaymentsIdvProtocol$1";
    public final /* synthetic */ DgU A00;
    public final /* synthetic */ RTQ A01;
    public final /* synthetic */ FcL A02;

    public G40(DgU dgU, RTQ rtq, FcL fcL) {
        this.A02 = fcL;
        this.A01 = rtq;
        this.A00 = dgU;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.concurrent.Future, com.google.common.util.concurrent.SettableFuture] */
    @Override // java.lang.Runnable
    public void run() {
        ImmutableMap immutableMap = this.A01.A00;
        if (!immutableMap.containsKey("identity_document")) {
            SettableFuture settableFuture = this.A02.A01;
            if (settableFuture != null) {
                settableFuture.set((Object) null);
                return;
            }
            return;
        }
        File A0E = AnonymousClass001.A0E(((Uri) immutableMap.get("identity_document")).getPath());
        FcL fcL = this.A02;
        C11684xK c11684xK = ((C11674xI) fcL.A04.get()).A00;
        ?? A0j = 4YU.A0j();
        AbG.A1D(fcL.A03).execute(new J32(c11684xK, fcL, A0j, A0E, C5f6.A00(A0E.getPath())));
        try {
            ICS ics = (ICS) A0j.get();
            GraphQlCallInput graphQlCallInput = this.A00;
            graphQlCallInput.A09("identity_document_handle", ics.A05);
            fcL.A00 = graphQlCallInput;
            GraphQlQueryParamSet A0M = 7zL.A0M();
            A0M.A01(graphQlCallInput, "input");
            C01643sd c01643sd = new C01643sd(Q8z.class, "UserVerificationMutation", null, "input", "fbandroid", 2016830107, 192, 2054436059L, 2054436059L, false, true);
            ((2Jf) c01643sd).A00 = A0M;
            1Hz r0 = new 1Hz();
            AbH.A1W(r0, 109250890);
            AbH.A1W(r0, 1735518709);
            AbH.A1W(r0, -338181066);
            r0.A07();
            5Dh r02 = new 5Dh(c01643sd);
            AbstractC05414dq A08 = 1VX.A08(1BK.A04(fcL.A05), fcL.A02);
            4YV.A1B(r02);
            2FT A00 = Fvf.A00(A08.A06(r02), this, 20);
            SettableFuture settableFuture2 = fcL.A01;
            if (settableFuture2 != null) {
                settableFuture2.setFuture(A00);
            }
        } catch (InterruptedException | ExecutionException e) {
            SettableFuture settableFuture3 = fcL.A01;
            if (settableFuture3 != null) {
                settableFuture3.setException(e);
            }
        }
    }
}

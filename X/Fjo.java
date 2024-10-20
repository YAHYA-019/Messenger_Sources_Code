package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.google.common.base.Preconditions;

/* loaded from: Fjo.class */
public final class Fjo implements JFd {
    public final /* synthetic */ FAb A00;

    public Fjo(FAb fAb) {
        this.A00 = fAb;
    }

    @Override // X.JFd
    public void CNA(D11 d11) {
        ERK erk;
        D1B d1b;
        4zJ r0 = 4zI.A03;
        FAb fAb = this.A00;
        r0.A05("CoplayPlayerSharedState", "onStateReceived. currentState: %s,\n newState: %s", new Object[]{fAb.A02, d11});
        D11 d112 = fAb.A02;
        if (d112 == null || !d112.equals(d11)) {
            D11 d113 = fAb.A02;
            D1B d1b2 = d11.matchState;
            if (d1b2 != null && (erk = d1b2.matchStatus) != null && erk != ERK.A01 && erk != ERK.A02 && (d113 == null || (d1b = d113.matchState) == null || (!11T.A0O(d1b2.matchId, d1b.matchId)))) {
                r0.A05("CoplayPlayerSharedState", "Fetch new match info from server side", new Object[0]);
                GraphQlQueryParamSet A0M = 7zL.A0M();
                Preconditions.checkArgument(DKE.A1W(A0M, PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(d11.matchState.matchId)));
                1Br.A0D(fAb.A0D, FwJ.A00(this, fAb, 16), 7zR.A0n(FbInjector.A03, 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "CoplayMatchInfoQuery", (String) null, "fbandroid", 730369937, 0, 1715104030L, 1715104030L, false, true))));
            }
        }
        7zP.A0N(fAb.A0B).Ciz(new G3s(d11, this, fAb));
    }
}

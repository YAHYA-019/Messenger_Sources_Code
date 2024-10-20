package com.facebook.messenger.plugins.mediareceiverfetchplugin;

import X.11T;
import X.AZ9;
import X.GOo;
import X.Hdh;
import X.IU4;
import X.L9o;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.facebook.messenger.mcp.sessionedcontext.MessengerSessionedMCPContext;
import com.facebook.messenger.plugins.mediareceiverfetchplugin.OrcaMediaReceiverFetchPluginCallbacks;

/* loaded from: OrcaMediaReceiverFetchPluginPremailbox.class */
public final class OrcaMediaReceiverFetchPluginPremailbox extends Premailbox {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrcaMediaReceiverFetchPluginPremailbox(MessengerSessionedMCPContext messengerSessionedMCPContext) {
        super(messengerSessionedMCPContext);
        11T.A0F(messengerSessionedMCPContext, 1);
    }

    @Override // com.facebook.messenger.plugins.mediareceiverfetchplugin.Premailbox
    public void OrcaMediaReceiverFetchPluginPremailboxExtensionsDestroy() {
    }

    @Override // com.facebook.messenger.plugins.mediareceiverfetchplugin.Premailbox
    public void OrcaMediaReceiverFetchPlugin_MediaReceiverFetchExecute(final String str, OrcaMediaReceiverFetchPluginCallbacks.MediaReceiverFetchExecutionCallback mediaReceiverFetchExecutionCallback) {
        11T.A0H(str, mediaReceiverFetchExecutionCallback);
        final Hdh hdh = (Hdh) GOo.A0n(FbInjector.A03, this.mAppContext.fbUserSession, 116393);
        final IU4 iu4 = new IU4(mediaReceiverFetchExecutionCallback);
        L9o.A00(hdh.A01, new AZ9() { // from class: X.9rp
            @Override // X.AZ9
            public void COU(RI9 ri9) {
                GraphQlQueryParamSet A0M = 7zL.A0M();
                String str2 = str;
                A0M.A05(GOm.A00(333), str2);
                C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MSGRMediaReceiverFetchDeidentifiedQuery", (String) null, "fbandroid", -126794847, 1536, 456395311L, 456395311L, false, true));
                C4Tn c4Tn = ri9.A00;
                2Jf r0 = A0L.A0K;
                r0.A0C = c4Tn;
                r0.A0D = ri9.A01;
                1Vd A0K = 7zM.A0K(FbInjector.A00());
                AZD azd = iu4;
                A0K.ARI(new 9sR(azd, 0), new 9sT(azd, str2), A0L);
            }

            @Override // X.AZ9
            public void onFailure(Throwable th) {
                0fH.A0r("MediaReceiverFetchGraphQLFetcher", "Fetching deidentified request params failed", th);
                iu4.onFailure(th);
            }
        }, "LS_MediaReceiverFetch");
    }
}

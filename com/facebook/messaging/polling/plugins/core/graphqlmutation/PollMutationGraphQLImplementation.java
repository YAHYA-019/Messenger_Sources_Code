package com.facebook.messaging.polling.plugins.core.graphqlmutation;

import X.09K;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.1Du;
import X.1JF;
import X.1VX;
import X.2JX;
import X.2JY;
import X.2JZ;
import X.2Jd;
import X.2Jf;
import X.2tS;
import X.4YV;
import X.5Dh;
import X.5iG;
import X.6As;
import X.7zL;
import X.AbE;
import X.AbF;
import X.AbI;
import X.AbK;
import X.AbM;
import X.AeR;
import X.AnonymousClass001;
import X.C2487Gei;
import X.C28p;
import X.DKB;
import X.DKF;
import X.DgU;
import X.HIT;
import X.HgD;
import X.JKC;
import X.MRk;
import X.Q6u;
import X.Rqy;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.polling.datamodels.PollingDraftOption;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: PollMutationGraphQLImplementation.class */
public final class PollMutationGraphQLImplementation {
    public long A00;
    public long A01;
    public final Context A02;
    public final 1Br A03;

    public PollMutationGraphQLImplementation(Context context) {
        11T.A0F(context, 1);
        this.A02 = context;
        this.A03 = 1Bu.A01(context, 115273);
    }

    public static 2JX A00(String str, String str2) {
        Object obj = 2JZ.A01;
        TreeBuilderJNI A0N = AbF.A0N(2tS.A00(), 6As.class, "TextWithEntities", 802898961);
        A0N.setString("text", str);
        TreeBuilderJNI A0N2 = AbF.A0N(2tS.A00(), 6As.class, MRk.A00(45), -389748053);
        A0N2.setTree(DKB.A00(60), A0N.getResult(2JX.class, 802898961));
        if (str2 != null) {
            TreeBuilderJNI A0N3 = AbF.A0N(2tS.A00(), 6As.class, AbE.A00(309), -860530864);
            A0N3.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
            A0N2.setTree("associated_thread_participant", A0N3.getResult(2JX.class, -860530864));
        }
        return A0N2.getResult(2JX.class, -389748053);
    }

    public static final void A01(PollMutationGraphQLImplementation pollMutationGraphQLImplementation, JKC jkc, ImmutableList immutableList, ImmutableMap immutableMap, String str, String str2, boolean z) {
        ImmutableList A0a;
        Object obj = 2JZ.A01;
        TreeBuilderJNI A0N = AbF.A0N(2tS.A00(), 6As.class, "Question", -1863968103);
        if (str2 != null) {
            A0N.setString("text", str2);
            ImmutableList A00 = HIT.A00(immutableList, ImmutableList.of());
            if (09K.A00(A00)) {
                TreeBuilderJNI A0N2 = AbF.A0N(2tS.A00(), 6As.class, MRk.A00(10), -156769861);
                ImmutableList.Builder builder = ImmutableList.builder();
                1Du it = A00.iterator();
                while (it.hasNext()) {
                    String str3 = ((PollingDraftOption) it.next()).A05;
                    if (!1JF.A0B(str3)) {
                        builder.m11011add((Object) A00(str3, null));
                    }
                }
                A0N2.setTreeList("nodes", (Iterable) builder.build());
                A0N.setTree("options", A0N2.getResult(2JX.class, -156769861));
            }
            if (z && immutableMap.size() > 0) {
                TreeBuilderJNI A0N3 = AbF.A0N(2tS.A00(), 6As.class, MRk.A00(10), -156769861);
                ImmutableList.Builder builder2 = ImmutableList.builder();
                Iterator A14 = AbM.A14(immutableMap);
                while (A14.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A14);
                    String A02 = C28p.A02((ThreadParticipant) A0z.getKey());
                    if (!1JF.A0B(A02) && AnonymousClass001.A1V(A0z.getValue())) {
                        builder2.m11011add((Object) A00(A02, C28p.A03((ThreadParticipant) A0z.getKey())));
                    }
                }
                A0N3.setTreeList("nodes", (Iterable) builder2.build());
                A0N.setTree("options", A0N3.getResult(2JX.class, -156769861));
            }
        }
        2JY result = A0N.getResult(2JX.class, -1863968103);
        11T.A0A(result);
        2JY A0B = 1BK.A0B(result, 2JX.class, -1249474914, -156769861);
        pollMutationGraphQLImplementation.A01 = (A0B == null || (A0a = A0B.A0a(-389748053, 2JX.class)) == null) ? 0L : A0a.size();
        FbUserSession A0F = 4YV.A0F(pollMutationGraphQLImplementation.A02);
        HgD hgD = (HgD) 1Br.A0B(pollMutationGraphQLImplementation.A03);
        Rqy rqy = new Rqy(jkc);
        5iG A0h = DKF.A0h(hgD.A03);
        Q6u q6u = new Q6u();
        GraphQlCallInput dgU = new DgU(12);
        dgU.A09("target_id", str);
        dgU.A09("answers_state", "OPEN");
        dgU.A09(DKB.A00(ActionId.APP_DID_ENTER_BACKGROUND), z ? "MOST_LIKELY_TO" : "CHOOSE_MULTIPLE");
        dgU.A09("question_text", result.A0i());
        2JY A0B2 = 1BK.A0B(result, 2JX.class, -1249474914, -156769861);
        ArrayList A0s = AnonymousClass001.A0s();
        if (A0B2 != null) {
            1Du A0u = AbI.A0u(A0B2, 2JX.class, -389748053);
            while (A0u.hasNext()) {
                2JY A0P = 7zL.A0P(A0u);
                2JY A0B3 = 1BK.A0B(A0P, 2JX.class, 1854819208, 802898961);
                if (A0B3 != null) {
                    2JY A0B4 = 1BK.A0B(A0P, 2JX.class, 987100247, -860530864);
                    String A0k = A0B4 != null ? A0B4.A0k() : null;
                    2Jd r0 = new 2Jd(72);
                    r0.A09("option_text", A0B3.A0i());
                    r0.A09("option_user_id", A0k);
                    r0.A06(AbE.A00(181), Boolean.valueOf(A0P.getBooleanValue(-768777496)));
                    A0s.add(r0);
                }
            }
        }
        dgU.A0A("options", A0s);
        ((2Jf) q6u).A00.A01(dgU, "input");
        A0h.A04(new C2487Gei(rqy, hgD, 10), AeR.A01(AbK.A0z(1VX.A07(hgD.A01, A0F), new 5Dh(q6u), 303710824046315L)), "task_key_create_poll");
    }
}

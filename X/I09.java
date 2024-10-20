package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.messages.ReactionMetaData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: I09.class */
public final class I09 {
    public 1BY A00;
    public final Context A01 = AbF.A04((1BY) null);
    public final C00i A08 = AbH.A0F();
    public final C00i A02 = AbH.A0E();
    public final C00i A04 = 1BQ.A02(148131);
    public final C00i A07 = 1BV.A01((1BY) null, 84849);
    public final C15h A09 = J5u.A03(this, 43);
    public final C00i A0A = 1BQ.A02(66266);
    public final C00i A06 = 1BQ.A02(68549);
    public final C00i A05 = 1BQ.A02(67773);
    public final C00i A03 = 7zN.A0D(67527);

    public I09(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static void A00(Context context, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, I09 i09, Capabilities capabilities, Integer num, Integer num2, String str, String str2, long j) {
        String str3;
        MailboxFutureImpl A0P;
        String str4 = str;
        if (!((2rT) i09.A0A.get()).A02(threadKey)) {
            07S A0J = 4YU.A0J(GraphQlCallInput.A02, str2, "message_id");
            if (str != null) {
                07S.A00(A0J, str, "reaction");
                07S.A00(A0J, "ADD_REACTION", "action");
                if (!num.equals(0S2.A00)) {
                    07S.A00(A0J, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 4YT.A00(1408));
                }
                if (num.equals(0S2.A01)) {
                    7Wb r0 = (7Wb) 1Lo.A04(context, fbUserSession, (1BY) null, 50211);
                    Long A0j = 4YV.A0j();
                    UserKey userKey = (UserKey) i09.A09.get();
                    C1pq.A08("userKey", userKey);
                    r0.A00.put(str2, new ReactionMetaData(userKey, num, A0j, str4));
                }
            } else {
                07S.A00(A0J, "REMOVE_REACTION", "action");
            }
            GraphQlQueryParamSet A0M = 7zL.A0M();
            4YV.A1A(A0J, A0M, "input");
            5Dh A00 = 5Dh.A00(A0M, new C01643sd(Q8c.class, "MessageReactionMutation", null, "input", "fbandroid", 640614266, 384, 305992796L, 305992796L, false, true));
            AbstractC05414dq A09 = 1VX.A09(i09.A01, fbUserSession);
            4YU.A1J(A00, 3815554831804296L);
            ListenableFuture A04 = A09.A04(A00, 5Dj.A02);
            65V r02 = (65V) 1Lo.A04(context, fbUserSession, (1BY) null, 49953);
            1Kd.A0D(i09.A02, new C2486Geh(context, i09, r02.A01(str4, str2), r02, str4, str2), A04);
            return;
        }
        if (threadKey != null) {
            long A0s = threadKey.A0s();
            65V r03 = (65V) 1Lo.A04((Context) null, fbUserSession, i09.A00, 49953);
            Ibc ibc = new Ibc(context, null, i09, r03.A01(str, str2), r03, str2, str, 0);
            Ibv ibv = !2oI.A06(threadSummary) ? null : new Ibv(2, i09, 1Bi.A03(82689), threadSummary);
            long parseLong = Long.parseLong(AbI.A1F(i09.A09));
            C5pl c5pl = (C5pl) i09.A06.get();
            if (C5pl.A00(c5pl, threadSummary, capabilities, AbG.A1b(1Br.A07(c5pl.A02), 36321395961119050L))) {
                boolean A01 = ((5lO) i09.A05.get()).A01(threadKey);
                GsM gsM = (GsM) 1Lo.A04(context, fbUserSession, (1BY) null, 84159);
                C3o5.A0k(str2, 2, gsM);
                if (str != null) {
                    if (num2 != null) {
                        if (num2 != 0S2.A01 && num2 != 0S2.A0C) {
                            if (num2 == 0S2.A00) {
                                gsM.A00(new Ibk(ibc, ibv, gsM, str2, str4, A0s, j, parseLong, A01), str4);
                                return;
                            }
                        }
                    }
                    HLq.A00(new Rsh(ibc, ibv, gsM, str2, str4, parseLong, A0s, j, A01), ibv, gsM, (Integer) null, str2, (String) null, parseLong, A0s, j, A01);
                    return;
                }
                HLq.A00(ibc, ibv, gsM, num2, str2, str4, parseLong, A0s, j, A01);
                return;
            }
            str3 = "";
            if (1BK.A0K().AZk(36316619962460470L)) {
                MailboxFeature mailboxFeature = (MailboxFeature) 1Lo.A04(context, fbUserSession, (1BY) null, 67407);
                if (str == null) {
                    str4 = str3;
                }
                1Um A0O = 1BK.A0O(mailboxFeature, 0);
                A0P = 1BK.A0P(A0O);
                1Um.A02(A0O, new N7R(A0P, mailboxFeature, str2, str4, 0, A0s, j, parseLong), A0P, false);
            } else {
                5P8 r04 = (5P8) 1Lo.A04(context, fbUserSession, (1BY) null, 65961);
                str3 = str != null ? str4 : "";
                Long valueOf = Long.valueOf(j);
                1Um A0O2 = 1BK.A0O(r04, 0);
                A0P = 1BK.A0P(A0O2);
                int A002 = 4uZ.A00(A0P, (1X9) null);
                TraceInfo A02 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxSDK", "reactToMessage");
                LoggingOption A012 = 4uZ.A01((LoggingOption) null, A02);
                4uZ.A04(A0P, new LoggingOption[]{A012});
                if (!A0O2.Cj2(new Ibe(A0P, A012, r04, valueOf, str3, str2, A002, A0s))) {
                    A0P.cancel(false);
                    4uZ.A03(A002);
                    4uZ.A05((LoggingOption) null, A02, "MailboxSDK", "reactToMessage");
                }
                PlatformLogger.platformEventLog(5);
            }
            A0P.addResultCallback(ibc);
        }
    }
}

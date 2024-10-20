package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.messaging.montage.model.montageattribution.MontageAttributionData;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: D4i.class */
public final class D4i implements 1K9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Message A01;
    public final /* synthetic */ 5T0 A02;
    public final /* synthetic */ UserKey A03;
    public final /* synthetic */ ImmutableMap A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public D4i(Context context, Message message, 5T0 r304, UserKey userKey, ImmutableMap immutableMap, String str, String str2, String str3, String str4) {
        this.A02 = r304;
        this.A00 = context;
        this.A05 = str;
        this.A01 = message;
        this.A04 = immutableMap;
        this.A07 = str2;
        this.A08 = str3;
        this.A06 = str4;
        this.A03 = userKey;
    }

    public void onFailure(Throwable th) {
        0fH.A0u("MontageMentionSendReceiver", AbstractC00603o4.A00(ActionId.RTMP_CONNECTION_REQUESTED), th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        ThreadKey threadKey = (ThreadKey) obj;
        if (threadKey != null) {
            Context context = this.A00;
            CQl cQl = (CQl) 1Hv.A02(context, 65898);
            5T0 r0 = this.A02;
            FbUserSession fbUserSession = r0.A01;
            Message A0K = cQl.A0K(fbUserSession, threadKey, "");
            5PI A0d = AbF.A0d(A0K);
            String str2 = this.A05;
            Message message = this.A01;
            48J r314 = 48J.A02;
            MontageMetadata montageMetadata = message.A0X;
            if (montageMetadata != null && (str = montageMetadata.A0K) != null) {
                r314 = 48J.valueOf(str);
            }
            60V r02 = (60V) 1Hv.A02(context, 66579);
            String str3 = null;
            ThreadKey threadKey2 = message.A0V;
            threadKey2.getClass();
            long A0r = threadKey2.A0r();
            long j = message.A05;
            ImmutableMultimap immutableMultimap = message.A0A().A00;
            String str4 = message.A1c;
            ImmutableList immutableList = message.A0w;
            MontageAttributionData montageAttributionData = message.A0W;
            ImmutableList immutableList2 = message.A0r;
            ImmutableList immutableList3 = message.A0z;
            String str5 = message.A1g;
            String str6 = message.A1X;
            C1q8 A04 = message.A04();
            7lF r03 = 7lF.$redex_init_class;
            int ordinal = A04.ordinal();
            int i = 1;
            if (ordinal != 28) {
                i = 3;
                if (ordinal != 29) {
                    i = ordinal != 1 ? 0 : 2;
                }
            }
            Long l = message.A1L;
            String str7 = message.A1m;
            ContentAppAttribution contentAppAttribution = message.A09;
            long A06 = r02.A06(message);
            ImmutableMap immutableMap = message.A14;
            MontageUser A01 = 60V.A01(message);
            String A0x = 4YU.A0x(message);
            if (A0x != null) {
                str3 = A0x;
            }
            MontageCard montageCard = new MontageCard(contentAppAttribution, message, r314, A01, montageAttributionData, null, immutableList, immutableList2, immutableList3, null, immutableMap, immutableMultimap, l, str2, str4, null, str5, str6, str3, str7, i, 0, A0r, j, A06, false, true, false, false);
            5Pz r04 = 5Pz.A0e;
            String obj2 = r04.toString();
            ImmutableMap immutableMap2 = this.A04;
            String str8 = this.A07;
            String str9 = this.A08;
            String str10 = this.A06;
            1BK.A1K(context, 3, obj2);
            11T.A0F(str8, 6);
            HvS.A00(context, A0d, A0K, montageCard, obj2, str8, str9, str10, immutableMap2, true);
            Message A0U = 4YU.A0U(A0d);
            UserKey userKey = this.A03;
            CmW cmW = new CmW(context, A0U, new CmX(r04, A0U, r0, (C5Pr) 1Lo.A04(context, fbUserSession, (1BY) null, 49712), (ScheduledExecutorService) 1Bi.A03(16461)), r0);
            Executor executor = (Executor) 1Bi.A03(16461);
            C7c c7c = (C7c) 1Bn.A0E(context, (1BY) null, 82653);
            Blj blj = new Blj(4iI.A00(AbI.A0Z(context), userKey), null);
            1Js r05 = userKey.type;
            1Js r06 = 1Js.A03;
            Preconditions.checkArgument(AnonymousClass001.A1W(r05, r06));
            1Kh A0y = AbF.A0y();
            A0y.A02(r06, userKey.id);
            User A0w = AbF.A0w(A0y);
            fbUserSession.getClass();
            1Kd.A0F(new D4H(8, r0, cmW, blj), c7c.A01(fbUserSession, A0w), executor);
        }
    }
}

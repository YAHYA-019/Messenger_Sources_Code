package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.util.TriState;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.groups.create.model.CreateCustomizableGroupParams;
import com.facebook.messaging.groups.create.model.LoggingParams;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Platform;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: CaP.class */
public final class CaP implements 1UN, CallerContextable {
    public static final String __redex_internal_original_name = "SendMessageToPendingThreadManager";
    public final 1GU A00;
    public final BlueServiceOperationFactory A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final 1Uv A06;
    public final 2zS A07;
    public final 5HO A08;
    public final C00653oY A09;
    public final C4Ni A0A;
    public final CaO A0B;
    public final BhQ A0C;
    public final CN5 A0D;
    public final 53F A0E;
    public final C1kw A0J;
    public final 1PA A0K;
    public final 1I7 A0L;
    public final C00i A0M;
    public final BW7 A0N;
    public final java.util.Map A0I = AnonymousClass001.A0u();
    public final java.util.Map A0H = AnonymousClass001.A0u();
    public final List A0F = AbF.A1F();
    public final java.util.Map A0G = AnonymousClass001.A0u();

    public CaP(FbUserSession fbUserSession) {
        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0E((Context) null, (1BY) null, 33031);
        1BQ A02 = 1BQ.A02(16461);
        1BQ A022 = 1BQ.A02(16476);
        1GU A0A = AbI.A0A();
        C1kw c1kw = (C1kw) 1Bi.A03(16772);
        C00653oY c00653oY = (C00653oY) 1Bi.A03(32769);
        1I6 r0 = (1I7) 1Hv.A02(FbInjector.A00(), 65728);
        1BQ A01 = 1BQ.A01();
        BW7 bw7 = (BW7) 1Bn.A0E((Context) null, (1BY) null, 83968);
        53F A0a = AbJ.A0a();
        1Uv A0M = AbJ.A0M();
        BhQ bhQ = (BhQ) 1Bi.A03(84552);
        1BQ A023 = 1BQ.A02(84666);
        1UP r02 = (1UP) 1Bi.A03(66348);
        1MV A0B = AbF.A0B(fbUserSession, (1BY) null, 84584);
        CaO caO = (CaO) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84535);
        CN5 cn5 = (CN5) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 83581);
        5HO r03 = (5HO) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 82477);
        C4Ni c4Ni = (C4Ni) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 68275);
        2zS r04 = (2zS) 1Bi.A03(67724);
        r02.A01(this);
        this.A01 = blueServiceOperationFactory;
        this.A05 = A02;
        this.A03 = A022;
        this.A00 = A0A;
        this.A0D = cn5;
        this.A07 = r04;
        this.A0J = c1kw;
        this.A08 = r03;
        this.A09 = c00653oY;
        this.A0L = r0;
        this.A0M = A01;
        this.A04 = A0B;
        this.A0B = caO;
        this.A0N = bw7;
        this.A0E = A0a;
        this.A06 = A0M;
        this.A0C = bhQ;
        this.A0A = c4Ni;
        this.A02 = A023;
        1I6 r05 = r0;
        new 1P9(r05).A05(new D0U(this, 28), 1BJ.A00(ActionId.ASYNC_ACTION_FAIL));
        1PA A012 = 1P9.A01(new 1P9(r05), new D0U(this, 29), 4YT.A00(61));
        this.A0K = A012;
        A012.A00();
    }

    public static CreateCustomizableGroupParams A00(Message message, CaP caP, String str, long j) {
        ThreadKey threadKey = message.A0V;
        threadKey.getClass();
        Preconditions.checkArgument(ThreadKey.A0m(threadKey));
        CN5 cn5 = caP.A0D;
        ImmutableList immutableList = CN5.A01(threadKey, cn5).A01;
        ImmutableList.Builder A0h = 4YU.A0h();
        int size = immutableList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                HashSet A0v = AnonymousClass001.A0v();
                ImmutableList build = A0h.build();
                HashSet A07 = C1pq.A07(build, "participants", A0v, A0v);
                String str2 = CN5.A01(threadKey, cn5).A02;
                TriState valueOf = TriState.valueOf(false);
                C1pq.A08("isPendingMontageThread", valueOf);
                return new CreateCustomizableGroupParams(null, null, null, null, null, null, new LoggingParams(valueOf, message.A04().name()), null, null, build, str2, str, null, null, null, null, null, A07, j, false, false, AnonymousClass001.A1W(threadKey.A06, C1yg.PENDING_GENERAL_THREAD), true);
            }
            ParticipantInfo participantInfo = (ParticipantInfo) immutableList.get(i2);
            if (Platform.stringIsNullOrEmpty(participantInfo.A00())) {
                1BK.A09(caP.A0M).D0v("optimistic-groups-null-user-id", 0Pz.A0V("Null user id passed: ", participantInfo.A0F));
            } else {
                A0h.m11011add((Object) 7zN.A0d(AbF.A0y(), participantInfo.A00()));
            }
            i = i2 + 1;
        }
    }

    public static void A01(Message message, 2LC r302, CaP caP) {
        C01s A09 = 1BK.A09(caP.A0M);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PendingThreadsManager doesn't have pending thread key: ");
        A09.softReport(__redex_internal_original_name, AnonymousClass001.A0a(message.A0V, A0k), r302);
    }

    public static void A02(CaP caP) {
        caP.A00.AAs();
        boolean A05 = caP.A07.A05();
        Iterator A0y = AnonymousClass001.A0y(caP.A0I);
        if (A0y.hasNext()) {
            AnonymousClass001.A0z(A0y).getValue();
            if (!A05) {
                throw new NullPointerException("mRetryCount");
            }
            throw new NullPointerException("mMessagesToSend");
        }
    }

    public void AFz() {
        this.A0K.A01();
        1BK.A1E(this.A05).execute(new D6b(this));
    }
}

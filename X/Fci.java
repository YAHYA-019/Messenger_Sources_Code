package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.reactions.model.ReactionsSet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.BitSet;
import java.util.HashSet;

/* loaded from: Fci.class */
public final class Fci implements CallerContextable {
    public static final CallerContext A0f = CallerContext.A06(Fci.class);
    public static final String __redex_internal_original_name = "CustomReactionsController";
    public int A00;
    public int A01;
    public ViewGroup A02;
    public 2eS A03;
    public 1BY A04;
    public LithoView A05;
    public LithoView A06;
    public 9Z7 A07;
    public Message A08;
    public EKz A09;
    public 6qV A0A;
    public EeE A0B;
    public 7Y0 A0C;
    public MigColorScheme A0D;
    public 6qY A0E;
    public BottomSheetBehavior A0F;
    public Integer A0H;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final GraphQLMessengerGroupThreadSubType A0S;
    public final ReactionsSet A0X;
    public final Capabilities A0Y;
    public final ImmutableSet A0Z;
    public final Boolean A0a;
    public final C00i A0T = 1BV.A01((1BY) null, 33031);
    public final C00i A0W = AbH.A0I();
    public final C00i A0b = 1BV.A01((1BY) null, 100039);
    public final C00i A0U = 1BQ.A02(100038);
    public final C00i A0V = 1BQ.A02(67773);
    public String[] A0O = new String[0];
    public String[] A0P = new String[0];
    public String A0I = null;
    public boolean[] A0Q = new boolean[0];
    public EMe[] A0N = new EMe[0];
    public ImmutableList A0G = ImmutableList.of();
    public boolean A0J = false;
    public final EeF A0e = new EeF(this);
    public final ViewTreeObserver.OnGlobalLayoutListener A0R = new FYE(this, 3);
    public final DF1 A0c = new C9ue(this, 2);
    public final DGr A0d = new FjT(this);

    public Fci(GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType, 1BO r303, Message message, EKz eKz, 6qV r306, 7Y0 r307, ReactionsSet reactionsSet, MigColorScheme migColorScheme, Capabilities capabilities, 6qY r311, ImmutableSet immutableSet, Boolean bool, Integer num, int i) {
        this.A04 = 7zL.A0Q(r303);
        this.A08 = message;
        this.A00 = i;
        this.A09 = eKz;
        this.A0E = r311;
        this.A0C = r307;
        this.A0D = migColorScheme;
        this.A0X = reactionsSet;
        this.A0A = r306;
        this.A0H = num;
        this.A0Z = immutableSet;
        this.A0Y = capabilities;
        this.A0a = bool;
        this.A0S = graphQLMessengerGroupThreadSubType;
    }

    public static B0y A00(FbUserSession fbUserSession, LithoView lithoView, 9Z7 r303, Fci fci, int i, boolean z) {
        ReactionsSet reactionsSet = fci.A09 == EKz.A02 ? new ReactionsSet() : fci.A0X;
        AwW A00 = B0y.A00(lithoView.A09);
        A00.A2X(fbUserSession);
        A00.A2Z(fci.A0D);
        C00i c00i = fci.A0b;
        c00i.get();
        B0y b0y = A00.A01;
        b0y.A0B = true;
        b0y.A0C = z;
        b0y.A04 = fci.A0e;
        b0y.A05 = reactionsSet;
        b0y.A06 = new Fjv(fci);
        A00.A2Y(fci.A0c);
        ImmutableList immutableList = fci.A0G;
        c00i.get();
        EKz eKz = fci.A09;
        11T.A0F(eKz, 0);
        A00.A2a(r303.A00(immutableList, ImmutableList.of(), fci.A02(), AnonymousClass001.A1W(eKz, EKz.A03)));
        b0y.A00 = i;
        b0y.A03 = fci.A0d;
        b0y.A09 = fci.A02();
        return A00.A2W();
    }

    public static String A01(Fci fci) {
        ParticipantInfo participantInfo = fci.A08.A0K;
        if (participantInfo != null) {
            return participantInfo.A00();
        }
        return null;
    }

    private HashSet A02() {
        1BQ A02 = 1BQ.A02(68470);
        if (this.A0S == GraphQLMessengerGroupThreadSubType.A07 && 1Wi.A00((1Wi) A02.get()).AZk(36320279274011893L)) {
            return AnonymousClass001.A0w(2yD.A02(1Wi.A00((1Wi) A02.get()), 36883229227353452L).split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1));
        }
        return null;
    }

    public static void A03(FbUserSession fbUserSession, Fci fci) {
        LithoView lithoView = fci.A05;
        if (lithoView != null) {
            1Iw r0 = lithoView.A09;
            2cM A01 = 2cK.A01(r0, (String) null, 0);
            A01.A2c();
            Dt2 dt2 = new Dt2(r0, new Dwf());
            dt2.A0j(0.0f);
            FkD fkD = new FkD(fbUserSession, fci, 3);
            Dwf dwf = dt2.A01;
            dwf.A01 = fkD;
            BitSet bitSet = dt2.A02;
            bitSet.set(1);
            dwf.A00 = new FkE(fci, 8);
            bitSet.set(0);
            C1rs.A05(bitSet, dt2.A03, 2);
            dt2.A0J();
            A01.A2e(dwf);
            Dt3 dt3 = new Dt3(r0, new C8jh());
            C8jh c8jh = dt3.A01;
            c8jh.A01 = fbUserSession;
            BitSet bitSet2 = dt3.A02;
            bitSet2.set(1);
            dt3.A0R();
            c8jh.A03 = fci.A0D;
            bitSet2.set(0);
            c8jh.A04 = fci.A0O;
            bitSet2.set(3);
            c8jh.A00 = fci.A00;
            bitSet2.set(4);
            c8jh.A02 = new 9KF(fci);
            bitSet2.set(2);
            C1rs.A04(bitSet2, dt3.A03);
            dt3.A0J();
            lithoView.A0y(7zL.A0V(A01, c8jh));
        }
    }

    public void A04(LithoView lithoView, 9Z7 r303, int i, boolean z) {
        this.A06 = lithoView;
        this.A0M = z;
        this.A07 = r303;
        this.A01 = i;
        1BY r0 = this.A04;
        FbUserSession A05 = 1Fw.A05(r0);
        if (1Br.A07(((6qW) 1Br.A0B(this.A0A.A00)).A00).AZk(36313415913183801L)) {
            ImmutableList immutableList = ((7JL) 1Lo.A04((Context) null, A05, r0, 68068)).A00;
            if (immutableList == null) {
                1IB A0M = 4YU.A0M(1BK.A05(), A0f, 4YU.A0L(this.A0T), 1BJ.A00(416), true);
                C2078Db3 c2078Db3 = new C2078Db3(A05, lithoView, r303, this, i, z);
                this.A03 = new 2eS(c2078Db3, A0M);
                1Kd.A0D(this.A0W, c2078Db3, A0M);
                return;
            }
            if (immutableList.size() > 18) {
                immutableList = immutableList.subList(0, 18);
            }
            this.A0G = immutableList;
        }
        lithoView.A0y(A00(A05, lithoView, r303, this, i, z));
    }
}

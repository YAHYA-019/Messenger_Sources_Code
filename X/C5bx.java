package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* renamed from: X.5bx, reason: invalid class name */
/* loaded from: 5bx.class */
public final class C5bx {
    public static final ImmutableList A0M;
    public static final List A0N = C0s8.A14("highlights_tab_feed", "highlights_tab_feed_child_attachment_list", "highlights_tab_feed_child_reaction_list", "highlights_tab_feed_child_reply_message_list");
    public static final ImmutableList A0O;
    public static final ImmutableList A0P;
    public 7yU A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public String A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public C1qM A08;
    public boolean A09;
    public final FbUserSession A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final C5c1 A0J;
    public final 1BP A0K;
    public final 1Br A0L;

    static {
        0OI A1B = C13m.A1B();
        C1ub c1ub = C1ub.A03;
        if (C1ub.A00().AZk(2342164645697765966L)) {
            A1B.add(Integer.valueOf(C5by.A09.value));
        }
        if (C1ub.A00().AZk(2342164645697897040L)) {
            A1B.add(Integer.valueOf(C5by.A02.value));
        }
        if (C1ub.A00().AZk(2342164645705761399L)) {
            A1B.add(Integer.valueOf(C5by.A06.value));
        }
        if (C1ub.A00().AZk(2342164645705826936L)) {
            A1B.add(Integer.valueOf(C5by.A08.value));
        }
        if (!C5bz.A01() && ((2yD) 1Bi.A03(16385)).AZk(2342168768861590469L)) {
            A1B.add(Integer.valueOf(C5by.A0J.value));
        }
        if (((2yD) 1Bi.A03(16385)).AZk(36325759648945104L)) {
            AnonymousClass001.A1J(A1B, C5by.A0C.value);
        }
        if (((2yD) 1Bi.A03(16385)).AZk(36325759649993693L) && 1BK.A0L(16385).AZk(36325759649928156L)) {
            AnonymousClass001.A1J(A1B, C5by.A0B.value);
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) C13m.A1C(A1B));
        11T.A0A(copyOf);
        A0P = copyOf;
        0OI A1B2 = C13m.A1B();
        if (C1ub.A00().AZk(2342164645697765966L)) {
            A1B2.add(Integer.valueOf(C5by.A09.value));
        }
        if (C1ub.A00().AZk(2342164645697831503L)) {
            A1B2.add(Integer.valueOf(C5by.A03.value));
        }
        if (C1ub.A00().AZk(2342164645697897040L)) {
            A1B2.add(Integer.valueOf(C5by.A02.value));
        }
        if (c1ub.A0J()) {
            AnonymousClass001.A1J(A1B2, C5by.A0H.value);
        }
        if (c1ub.A0I()) {
            A1B2.add(Integer.valueOf(C5by.A0C.value));
        }
        if (C1ub.A00().AZk(36321636490691182L) && ((1yK) 1Br.A0B(C1ub.A01)).A00(C1ub.A00().BCy(36884586444162534L))) {
            AnonymousClass001.A1J(A1B2, C5by.A0A.value);
        }
        if (c1ub.A0K()) {
            A1B2.add(Integer.valueOf(C5by.A0K.value));
        }
        if (((1yK) C1ub.A01.A00.get()).A00(C1ub.A00().BCy(36884586443638245L)) && C1ub.A00().AZk(36321636490166892L)) {
            A1B2.add(Integer.valueOf(C5by.A07.value));
        }
        if (c1ub.A0E()) {
            A1B2.add(Integer.valueOf(C5by.A0G.value));
        }
        if (C1ub.A00().AZk(36321636495016587L) && C1ub.A00().AZk(36321636494951050L)) {
            AnonymousClass001.A1J(A1B2, C5by.A0B.value);
        }
        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) C13m.A1C(A1B2));
        11T.A0A(copyOf2);
        A0O = copyOf2;
        if (c1ub.A08() != C1yN.A03) {
            copyOf = copyOf2;
        }
        A0M = copyOf;
    }

    public C5bx(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A0A = fbUserSession;
        this.A0K = FbInjector.A00;
        this.A0D = 1Lm.A01(fbUserSession, 67248);
        this.A0E = 1Lm.A01(fbUserSession, 16686);
        this.A0G = 1Lm.A01(fbUserSession, 68353);
        this.A0B = 1Bu.A00(68109);
        1Br A00 = 1Bu.A00(65584);
        this.A0H = A00;
        this.A0J = ((82O) A00.A00.get()).A0B((C5c0) 1Bi.A03(67494));
        this.A0I = 1Bq.A00(16456);
        this.A0F = 1Bq.A00(66774);
        this.A03 = 0S2.A00;
        this.A0C = 1Bu.A00(16430);
        this.A0L = 1Bq.A00(68561);
        this.A02 = false;
    }

    public static final C5c5 A00(C5bx c5bx) {
        return (C5c5) c5bx.A0L.A00.get();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static final SettableFuture A01(C5bx c5bx, Integer num) {
        0fH.A0j("HighlightsTabFeedLoader", 0Pz.A0X("[loadHighlightsTabFeed][", R0j.A00(num), ']'));
        ?? obj = new Object();
        C1ub c1ub = C1ub.A03;
        if (c1ub.A0M()) {
            A00(c5bx).A02();
        }
        1yI r0 = (1yI) c5bx.A0D.A00.get();
        boolean AZk = C1ub.A00().AZk(2342164645693768249L);
        ImmutableList immutableList = A0M;
        11T.A0I(immutableList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Number>");
        boolean z = false;
        if (c1ub.A08() == C1yN.A03) {
            z = true;
        }
        r0.A01(immutableList, AZk, z).addResultCallback(new A1T(5, num, c5bx, (Object) obj));
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0228, code lost:
    
        if (X.C1ub.A00().AZk(36321636479418932L) == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A02(final X.C5bx r301, final X.C5c2 r302, final X.C00m r303, final kotlin.jvm.functions.Function1 r304) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5bx.A02(X.5bx, X.5c2, X.00m, kotlin.jvm.functions.Function1):void");
    }

    public final void A03() {
        List<HighlightsFeedContent> list;
        if (!C1ub.A00().AZk(2342164645693571640L) || (list = this.A05) == null) {
            return;
        }
        int A00 = 02J.A00(C1A3.A1D(list, 10));
        if (A00 < 16) {
            A00 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A00);
        for (HighlightsFeedContent highlightsFeedContent : list) {
            linkedHashMap.put(highlightsFeedContent.A0P, Integer.valueOf(highlightsFeedContent.A05));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("issueVerifyContentExist TotalFeedItems=");
        sb.append(linkedHashMap.size());
        sb.append(", FeedItems=");
        sb.append(linkedHashMap);
        0fH.A0j("HighlightsTabFeedLoader", sb.toString());
        MailboxFeature mailboxFeature = (MailboxFeature) this.A0D.A00.get();
        C0ty c0ty = C0ty.A00;
        PrivacyContext A002 = ((AnonymousClass224) this.A0F.A00.get()).A00("1299289207322385");
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(AQV);
        if (AQV.Cj2(new A0i(0, mailboxFeature, mailboxFutureImpl2, mailboxFutureImpl, A002, c0ty, linkedHashMap))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
        mailboxFutureImpl2.cancel(false);
    }

    public final void A04() {
        0fH.A0j("HighlightsTabFeedLoader", "[registerMsysListener]");
        if (this.A08 == null) {
            this.A08 = new C9zw(this, 0);
        }
        1Uj r0 = (1Uj) this.A0E.A00.get();
        C1qM c1qM = this.A08;
        if (c1qM == null) {
            11T.A0L("highlightsTabFeedStoredProcedureChangedListener");
            throw 0Q8.createAndThrow();
        }
        C21S.A00(c1qM, r0);
    }

    public final void A05() {
        0fH.A0j("HighlightsTabFeedLoader", "[removeMsysListener]");
        if (this.A08 != null) {
            1Uj r0 = (1Uj) this.A0E.A00.get();
            C1qM c1qM = this.A08;
            if (c1qM == null) {
                11T.A0L("highlightsTabFeedStoredProcedureChangedListener");
                throw 0Q8.createAndThrow();
            }
            C21S.A01(c1qM, r0);
        }
    }

    public final void A06() {
        0fH.A0j("HighlightsTabFeedLoader", "[startPaginatedLoad]");
        C5c2 c5c2 = C5c2.A06;
        if (C1ub.A03.A0M()) {
            A00(this).A08(c5c2, true);
        }
        A02(this, c5c2, null, null);
    }

    public final void A07() {
        if (C1ub.A03.A0M()) {
            A00(this).A08(C5c2.A05, true);
        }
        A02(this, C5c2.A05, null, null);
    }

    public final void A08() {
        C5c1 c5c1 = this.A0J;
        C5c2 c5c2 = C5c2.A02;
        boolean A01 = c5c1.A01(c5c2);
        if (C1ub.A03.A0M()) {
            A00(this).A08(c5c2, A01);
        }
        if (!A01) {
            0fH.A0j("HighlightsTabFeedLoader", "[startInitialLoad] Throttled ⏸️");
        } else {
            0fH.A0j("HighlightsTabFeedLoader", "[startInitialLoad]");
            A02(this, c5c2, null, null);
        }
    }

    public final void A09(Function1 function1) {
        0fH.A0j("HighlightsTabFeedLoader", "[loadHighlightsLatestFeedCache]");
        A0A(null);
        Integer num = 0S2.A0N;
        5cB r0 = new 5cB(this, C5c2.A07, num);
        1Kd.A0F(new ABn(function1, r0, 2), A01(this, num), (Executor) this.A0I.A00.get());
    }

    public final void A0A(Function1 function1) {
        0fH.A0j("HighlightsTabFeedLoader", "[loadHighlightsTabRanges] Begin");
        ((1yI) this.A0D.A00.get()).A00().addResultCallback(new A1c(function1, this, 7));
    }

    public final void A0B(boolean z) {
        if (this.A09 != z) {
            this.A09 = z;
            0fH.A0j("HighlightsTabFeedLoader", "cleanupFeed");
            MailboxFeature mailboxFeature = (MailboxFeature) 1Br.A0B(this.A0D);
            PrivacyContext A00 = ((AnonymousClass224) 1Br.A0B(this.A0F)).A00("1299289207322385");
            1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
            MailboxFutureImpl A0P2 = 1BK.A0P(AQV);
            1Um.A02(AQV, new A1T(2, mailboxFeature, A00, A0P2), A0P2, false);
            A02(this, C5c2.A05, null, null);
        }
    }
}

package X;

import android.content.Context;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: Dz9.class */
public final class Dz9 extends C1rj {
    public static final CallerContext A09 = CallerContext.A0B("MarketplaceBannerLabelChatBottomSheetComponentSpec");
    public View.OnClickListener A00;
    public 06Z A01;
    public FbUserSession A02;
    public 2JX A03;
    public 2JX A04;
    public Eom A05;
    public ENs A06;
    public ThreadSummary A07;
    public String A08;

    public Dz9() {
        super("MarketplaceBannerLabelChatBottomSheetComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A05, this.A00, this.A02, this.A03, this.A01, this.A06, this.A04, this.A08, this.A07};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        if (r0.equals(r312) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a9 A[EDGE_INSN: B:30:0x01a9->B:31:0x01a9 BREAK  A[LOOP:1: B:20:0x00ed->B:27:0x013b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02db  */
    /* JADX WARN: Type inference failed for: r0v123, types: [X.Dg6, X.Dfr] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dz9.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v179, types: [java.lang.Object, X.Ete] */
    /* JADX WARN: Type inference failed for: r0v238, types: [java.lang.Object, X.Ete] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        6Ii r304;
        Integer num;
        2JY A0B;
        2JX A1l;
        switch (r302.A01) {
            case -1786875001:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                1Iw r03 = r0.A00;
                2JX r04 = ((Dz9) r02).A03;
                6Ii r05 = (6Ii) 1Bn.A0A(68165);
                String str = null;
                if (r03.A02 != null) {
                    r03.A0G(7zS.A0N((Object) null), "updateState:MarketplaceBannerLabelChatBottomSheetComponent.onUpdateSelectedStatusLabel");
                }
                if (r04 != null) {
                    str = r04.A0k();
                }
                r05.A01(0S2.A0O, str);
                return null;
            case -1264488601:
                1Iw r06 = r302.A00.A00;
                Object obj2 = r302.A03[0];
                if (r06.A02 == null) {
                    return null;
                }
                r06.A0G(7zQ.A0V(obj2, 0), "updateState:MarketplaceBannerLabelChatBottomSheetComponent.onUpdateSelectedStatusLabel");
                return null;
            case -1232159686:
                1Iv r07 = r302.A00;
                1Is r08 = r07.A01;
                1Iw r09 = r07.A00;
                Dz9 dz9 = (Dz9) r08;
                E0Q A0P = 4YU.A0P(r09);
                FbUserSession fbUserSession = dz9.A02;
                View.OnClickListener onClickListener = dz9.A00;
                Eom eom = dz9.A05;
                2JX r010 = dz9.A03;
                2JX r011 = dz9.A04;
                ThreadSummary threadSummary = dz9.A07;
                06Z r012 = dz9.A01;
                String str2 = dz9.A08;
                ElO elO = A0P.A00;
                ElP elP = A0P.A01;
                ENs eNs = A0P.A02;
                6Ii r013 = (6Ii) 1Bn.A0A(68165);
                2yD A0K = 1BK.A0K();
                onClickListener.onClick(null);
                6JG r014 = eom.A02;
                FbUserSession fbUserSession2 = eom.A00;
                1Iw r015 = eom.A01;
                String str3 = eom.A03;
                String str4 = eom.A04;
                String A07 = CQi.A07(r014.A02);
                if (A07 != null && str3 != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    ImmutableList.Builder builder = ImmutableList.builder();
                    if (eNs != null) {
                        String string = r015.A0D.getString(eNs.mStatusLabelId);
                        2Jd A0Q = DKC.A0Q();
                        String A00 = 4YT.A00(1211);
                        A0Q.A09(A00, string);
                        A0Q.A09("label_type", eNs.mLabelType);
                        A0s.add(A0Q);
                        Object obj3 = 2JZ.A01;
                        6As newTreeBuilder = 2tS.A00().newTreeBuilder("MarketplaceThreadLabel", 6As.class, -624998696);
                        newTreeBuilder.setString(A00, string);
                        newTreeBuilder.A0A(GraphQLStringDefUtil.A00().ATw("GraphQLMarketplaceThreadLabelTypeStringDef", eNs.mLabelType), "label_type");
                        builder.m11011add((Object) newTreeBuilder.getResult(2JX.class, -624998696));
                    }
                    GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
                    graphQlCallInput.A0A("labels", A0s);
                    graphQlCallInput.A09("message_thread_id", A07);
                    graphQlCallInput.A09("surface", "MESSENGER_BANNER");
                    graphQlCallInput.A09(4YT.A00(178), 4YT.A00(99));
                    Q6r q6r = new Q6r();
                    DKC.A1S(graphQlCallInput, q6r, "input");
                    Object obj4 = 2JZ.A01;
                    TreeBuilderJNI A0N = AbF.A0N(2tS.A00(), 6As.class, "Mutation", 1016017862);
                    TreeBuilderJNI A0N2 = AbF.A0N(2tS.A00(), 6As.class, "MarketplaceThreadAddLabelsResponsePayload", -1707090895);
                    TreeBuilderJNI A0N3 = AbF.A0N(2tS.A00(), 6As.class, "MessageThread", 277029264);
                    A0N3.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3);
                    TreeBuilderJNI A0N4 = AbF.A0N(2tS.A00(), 6As.class, "MarketplaceThreadData", -1954663034);
                    A0N4.setTreeList(4YT.A00(1461), (Iterable) builder.build());
                    A0N3.setTree("marketplace_thread_data", A0N4.getResult(2JX.class, -1954663034));
                    A0N2.setTree(1BJ.A00(1573), A0N3.getResult(2JX.class, 277029264));
                    A0N.setTree("marketplace_thread_add_labels", A0N2.getResult(2JX.class, -1707090895));
                    2JY result = A0N.getResult(2JX.class, 1016017862);
                    AbstractC05414dq A072 = 1VX.A07(r014.A05, fbUserSession2);
                    5Dh r016 = new 5Dh(q6r);
                    r016.A08(result);
                    4YV.A1B(r016);
                    1Kd.A0D(r014.A08, new FwG(r014, r015, str4, 3), A072.A06(r016));
                }
                String A0k = r010.A0k();
                r013.A01(0S2.A0P, A0k);
                if (eNs == null) {
                    return null;
                }
                String A0k2 = r011.A0k();
                String A073 = CQi.A07(threadSummary);
                String A06 = CQi.A06(threadSummary);
                if (A0k == null || A0k2 == null || A073 == null || A06 == null) {
                    return null;
                }
                if (eNs == ENs.A0E && (A1l = r011.A1l()) != null && A1l.A0L(-1416854638, 2JX.class, 739436124) == null) {
                    Dsy dsy = new Dsy(r09, new Dz1());
                    Dz1 dz1 = dsy.A01;
                    dz1.A01 = fbUserSession;
                    BitSet bitSet = dsy.A02;
                    bitSet.set(2);
                    dz1.A03 = A0k2;
                    bitSet.set(3);
                    dz1.A04 = A073;
                    bitSet.set(4);
                    dz1.A05 = A0k;
                    bitSet.set(5);
                    dz1.A02 = A06;
                    bitSet.set(0);
                    dz1.A00 = elO.A01;
                    bitSet.set(1);
                    7zP.A15(dsy, bitSet, dsy.A03);
                    Context context = r09.A0D;
                    ?? obj5 = new Object();
                    obj5.A00 = context;
                    elO.A00 = obj5;
                    obj5.A00(dz1, 2131959116);
                    r304 = (6Ii) elO.A02.get();
                    num = 0S2.A04;
                } else {
                    if (eNs != ENs.A0F || !CQi.A09(r011) || !A0K.AZk(36311156763068898L)) {
                        return null;
                    }
                    String A04 = CQi.A04(r011);
                    String A05 = CQi.A05(r011);
                    2JX A1l2 = r011.A1l();
                    String A0k3 = (A1l2 == null || (A0B = 1BK.A0B(A1l2, 2JX.class, -1416854638, 739436124)) == null) ? null : A0B.A0k();
                    if (A04 == null || A05 == null || r012 == null || str2 == null) {
                        return null;
                    }
                    QCY qcy = new QCY(r09, new QM3());
                    QM3 qm3 = qcy.A01;
                    qm3.A02 = r011;
                    BitSet bitSet2 = qcy.A02;
                    bitSet2.set(6);
                    qm3.A07 = A073;
                    bitSet2.set(7);
                    qm3.A08 = A0k;
                    bitSet2.set(8);
                    qm3.A05 = A04;
                    bitSet2.set(2);
                    qm3.A04 = A06;
                    bitSet2.set(1);
                    qm3.A06 = A05;
                    bitSet2.set(5);
                    qm3.A03 = A0k3;
                    bitSet2.set(0);
                    qm3.A01 = r012;
                    bitSet2.set(4);
                    qm3.A00 = elP.A01;
                    bitSet2.set(3);
                    qm3.A09 = str2;
                    bitSet2.set(9);
                    C1rs.A05(bitSet2, qcy.A03, 10);
                    qcy.A0J();
                    Context context2 = r09.A0D;
                    ?? obj6 = new Object();
                    obj6.A00 = context2;
                    elP.A00 = obj6;
                    obj6.A00(qm3, 2131959125);
                    r304 = (6Ii) elP.A02.get();
                    num = 0S2.A0B;
                }
                r304.A02(num, A0k);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E0Q e0q = (E0Q) r303;
        ENs eNs = this.A06;
        Object A0A = 1Bn.A0A(99481);
        Object A0A2 = 1Bn.A0A(99480);
        e0q.A02 = eNs;
        e0q.A00 = (ElO) A0A;
        e0q.A01 = (ElP) A0A2;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}

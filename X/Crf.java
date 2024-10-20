package X;

import android.content.Context;
import android.text.Layout;
import com.facebook.graphql.enums.GraphQLXFBMessagingSearchMetaAISnippetStatus;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.google.common.collect.ImmutableList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: Crf.class */
public final class Crf implements DIv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ ByH A04;
    public final /* synthetic */ C1301Ade A05;
    public final /* synthetic */ BhF A06;
    public final /* synthetic */ CqU A07;
    public final /* synthetic */ C1317Adv A08;
    public final /* synthetic */ boolean A09;

    public Crf(ByH byH, C1301Ade c1301Ade, BhF bhF, CqU cqU, C1317Adv c1317Adv, int i, int i2, int i3, int i4, boolean z) {
        this.A07 = cqU;
        this.A04 = byH;
        this.A06 = bhF;
        this.A05 = c1301Ade;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A08 = c1317Adv;
        this.A09 = z;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9K(Btt btt, Object obj) {
        return null;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9M(PlatformSearchGameData platformSearchGameData, Object obj) {
        AcX acX = (AcX) obj;
        if (acX == null) {
            return null;
        }
        CqU cqU = this.A07;
        return CqU.A00(platformSearchGameData, this.A05.A00, acX, cqU, this.A08, this.A00, this.A02, this.A01, this.A03);
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9O(PlatformSearchUserData platformSearchUserData, Object obj) {
        AcX acX = (AcX) obj;
        if (acX == null) {
            return null;
        }
        CqU cqU = this.A07;
        return CqU.A00(platformSearchUserData, this.A05.A00, acX, cqU, this.A08, this.A00, this.A02, this.A01, this.A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016b  */
    @Override // X.DIv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object D9X(com.facebook.messaging.model.threads.ThreadSummary r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Crf.D9X(com.facebook.messaging.model.threads.ThreadSummary, java.lang.Object):java.lang.Object");
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9Z(C1772As6 c1772As6, Object obj) {
        AcX acX = (AcX) obj;
        if (acX == null) {
            return null;
        }
        CqU cqU = this.A07;
        Cvl cvl = new Cvl(this.A05.A00, acX, cqU, this.A08, this.A00, this.A02, this.A01, this.A03, 9);
        11T.A0F(c1772As6, 0);
        return AbJ.A0b(new C55x(c1772As6, cvl), ImmutableList.of((Object) cvl));
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9a(Bt5 bt5, Object obj) {
        CqU cqU = this.A07;
        int i = this.A01;
        int i2 = this.A02;
        DK4 dk4 = this.A05.A00;
        AeL aeL = cqU.A0D;
        CvT cvT = new CvT(bt5, dk4, cqU, i, i2);
        11T.A0F(bt5, 0);
        ImmutableList.Builder builder = ImmutableList.builder();
        58B r0 = 58B.A0A;
        LinkedList A1F = AbF.A1F();
        long j = bt5.A00;
        59C A00 = 5OL.A00(bt5.A03);
        C58z c58z = new C58z(AbstractC02503vN.A00.A02(C1u3.A3S, C1u4.SIZE_32), 0.6f);
        47Q r02 = 47Q.A02;
        58D r03 = 58D.A05;
        Context context = aeL.A00;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2132279364);
        int A01 = 7zM.A01();
        int A03 = 7zL.A03();
        58C r04 = new 58C(2KQ.A03.A00(context), Layout.Alignment.ALIGN_NORMAL, 16, aeL.A05.B4i(), 1, true);
        11T.A09(r03);
        58B r05 = new 58B(r04, r03, r02, dimensionPixelSize, A03, A03, 0, 0, A01, 0);
        A1F.add(55J.A00(cvT, (C5wx) null));
        AnonymousClass544 A002 = 55L.A00(new 55U(A00, (55B) null, c58z, r05, 1Fj.A01(builder), (CharSequence) null, j, true), A1F);
        11T.A0A(A002);
        return A002;
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9b(8KN r302, Object obj) {
        CqU cqU = this.A07;
        int i = this.A02;
        int i2 = this.A01;
        9Yl r0 = new 9Yl(r302, cqU, i);
        Bmv bmv = new Bmv(cqU, i2);
        11T.A0F(r302, 0);
        GraphQLXFBMessagingSearchMetaAISnippetStatus graphQLXFBMessagingSearchMetaAISnippetStatus = r302.A00;
        String str = r302.A03;
        String str2 = r302.A06;
        List list = r302.A0C;
        return new C55p(new 8KN(graphQLXFBMessagingSearchMetaAISnippetStatus, r0, bmv, str, str2, r302.A05, r302.A04, r302.A08, r302.A09, r302.A07, list, r302.A0B, r302.A0A, r302.A0D));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030c  */
    /* JADX WARN: Type inference failed for: r323v0 */
    /* JADX WARN: Type inference failed for: r323v1, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r323v2 */
    /* JADX WARN: Type inference failed for: r323v7 */
    @Override // X.DIv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object D9h(com.facebook.messaging.search.lists.model.MessageSearchMessageModel r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Crf.D9h(com.facebook.messaging.search.lists.model.MessageSearchMessageModel, java.lang.Object):java.lang.Object");
    }

    @Override // X.DIv
    public /* bridge */ /* synthetic */ Object D9j(MessageSearchThreadModel messageSearchThreadModel, Object obj) {
        AnonymousClass557 A0p;
        6BC r317;
        AnonymousClass544 A00;
        AcX acX = (AcX) obj;
        if (acX == null) {
            return null;
        }
        CqU cqU = this.A07;
        DK4 dk4 = this.A05.A00;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A01;
        int i4 = this.A03;
        C1317Adv c1317Adv = this.A08;
        AeL aeL = cqU.A0D;
        1BL.A1F(aeL, messageSearchThreadModel);
        ThreadSummary threadSummary = messageSearchThreadModel.A02;
        long A0r = threadSummary.A0n.A0r();
        AdZ adZ = aeL.A04;
        55D A06 = AdZ.A06(adZ, AdZ.A05(adZ), AdZ.A01(threadSummary, adZ));
        55A A0C = adZ.A0C(threadSummary);
        String str = messageSearchThreadModel.A07;
        if (str == null) {
            str = 4YV.A0o(aeL.A00.getResources(), messageSearchThreadModel.A00, 2131820656);
        }
        1BL.A1E(str);
        5ON A002 = 5OM.A00(str);
        if (AbJ.A1Z(cqU.A06)) {
            r317 = new 6BC();
            r317.A03(aeL.A05);
            r317.A00 = A0r;
            r317.A02(A06);
            r317.A01(A0C);
            r317.A05 = A002;
            A0p = null;
        } else {
            A0p = 7zL.A0p();
            A0p.A05(aeL.A05);
            A0p.A00 = A0r;
            A0p.A05 = A06;
            A0p.A03(A0C);
            A0p.A04 = A002;
            r317 = null;
        }
        Cvl cvl = new Cvl(dk4, acX, cqU, c1317Adv, i, i2, i3, i4, 7);
        if (r317 != null) {
            r317.A01 = cvl;
        } else if (A0p != null) {
            A0p.A01 = cvl;
        }
        if (!cqU.A0H) {
            if (r317 == null) {
                if (A0p == null) {
                    return null;
                }
                A00 = A0p.A00();
            }
            A00 = r317.A00();
        } else if (r317 != null) {
            CqU.A04(acX, cqU, r317, i);
            A00 = r317.A00();
        } else {
            if (A0p == null) {
                return null;
            }
            CqU.A05(acX, cqU, A0p, i);
            A00 = A0p.A00();
        }
        return AbJ.A0b(A00, cvl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x048a, code lost:
    
        if (r0 != X.53N.A0Q) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bd, code lost:
    
        if (r0 != 5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0148, code lost:
    
        if (r326 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017f, code lost:
    
        if (X.BW6.A00(X.AbF.A0n(r0.A06), r319, r302.A1N) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x032d, code lost:
    
        if (r0 != X.53M.A01) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0472  */
    /* JADX WARN: Type inference failed for: r0v150, types: [com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.Throwable] */
    @Override // X.DIv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object D9p(com.facebook.user.model.User r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Crf.D9p(com.facebook.user.model.User, java.lang.Object):java.lang.Object");
    }
}

package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLPageCommPlatform;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionSettingModel;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9cj, reason: invalid class name */
/* loaded from: 9cj.class */
public final class C9cj {
    public String A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final AC8 A04;
    public final String A05;
    public final FbUserSession A06;
    public final 1BP A07;
    public final 1De A08;

    public C9cj(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        this.A06 = fbUserSession;
        this.A01 = 7zM.A0P();
        this.A05 = ((1G1) fbUserSession).A02;
        1BY r0 = r303.A00;
        this.A02 = 1Bu.A03(r0, 68325);
        this.A03 = 1Bu.A03(r0, 68329);
        this.A04 = AC8.A00(this, 36);
        this.A07 = FbInjector.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01db, code lost:
    
        if (r302.getBooleanValue(-1083124733) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionModel A00(X.2JX r302, int r303) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9cj.A00(X.2JX, int):com.facebook.messaging.nativepagereply.faq.data.model.AutomatedResponseCustomQuestionModel");
    }

    public final AutomatedResponseCustomQuestionSettingModel A01(2JX r302) {
        ImmutableList.of();
        ImmutableList A0e = r302.A0e(GraphQLPageCommPlatform.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, -2014337440);
        11T.A0A(A0e);
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = A0e.iterator();
        while (it.hasNext()) {
            builder.m11011add((Object) it.next().toString());
        }
        return new AutomatedResponseCustomQuestionSettingModel(1Fj.A01(builder), r302.A0k(), A0e.contains(GraphQLPageCommPlatform.MESSENGER));
    }

    public final void A02(String str) {
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("page_id", this.A05);
        C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "BusinessInboxCustomFAQsQuery", (String) null, "fbandroid", 1943526481, 0, 4174542395L, 4174542395L, false, true));
        1Vd A0K = 7zM.A0K(FbInjector.A03);
        4YU.A1J(A0L, 367103207806489L);
        1FV A09 = A0K.A09(A0L);
        this.A00 = JQw.A00(84);
        1Br.A0D(this.A01, new ABq(str, this, 2), A09);
    }
}

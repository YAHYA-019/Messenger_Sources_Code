package X;

import com.facebook.graphql.calls.GraphQlCallInput;

/* loaded from: D03.class */
public final class D03 implements GOX {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public D03(String str, Integer num, String str2) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.GOX
    public 2Jd ALF() {
        2Jd r0 = new 2Jd(83);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, this.A00, 4YT.A00(62));
        07S.A00(A0J, this.A01, "page_id");
        07S.A00(A0J, this.A02, "customer_id");
        7zN.A17(A0J, r0, "messenger_p2b_thread_context");
        return r0;
    }

    @Override // X.GOX
    public Long AaZ() {
        return null;
    }

    @Override // X.GG6
    public String BH8() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("type:MarketingMessageOptIn|conversationDepth:");
        A0k.append(this.A00);
        A0k.append("|customerId:");
        A0k.append(this.A02);
        A0k.append("|pageId:");
        return AnonymousClass001.A0d(this.A01, A0k);
    }
}

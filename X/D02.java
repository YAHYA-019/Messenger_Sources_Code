package X;

import com.facebook.graphql.calls.GraphQlCallInput;

/* loaded from: D02.class */
public final class D02 implements GOX {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public D02(String str, Integer num, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
    }

    @Override // X.GOX
    public 2Jd ALF() {
        2Jd r0 = new 2Jd(83);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, this.A01, "customer_id");
        07S.A00(A0J, this.A02, "page_id");
        07S.A00(A0J, this.A00, 4YT.A00(62));
        7zN.A17(A0J, r0, "messenger_p2b_thread_context");
        return r0;
    }

    @Override // X.GOX
    public Long AaZ() {
        return Long.valueOf(1WY.A01(7zQ.A0e()).Auy(36596815039302855L));
    }

    @Override // X.GG6
    public String BH8() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("type:ConversationFeedback|pageId:");
        A0k.append(this.A02);
        A0k.append("|customerId:");
        A0k.append(this.A01);
        A0k.append("|conversationDepth:");
        return AnonymousClass001.A0a(this.A00, A0k);
    }
}

package X;

import com.facebook.graphql.calls.GraphQlCallInput;

/* loaded from: A29.class */
public final class A29 implements GOX {
    public final String A00;
    public final String A01;
    public final String A02;

    public A29(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    @Override // X.GOX
    public 2Jd ALF() {
        2Jd r0 = new 2Jd(83);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, this.A01, "community_id");
        07S.A00(A0J, this.A02, "fb_group_id");
        07S.A00(A0J, this.A00, "thread_id");
        7zN.A17(A0J, r0, "community_messaging_context");
        return r0;
    }

    @Override // X.GOX
    public Long AaZ() {
        return Long.valueOf(1WY.A01(7zQ.A0e()).Auy(36596815039302855L));
    }

    @Override // X.GG6
    public String BH8() {
        return 0Pz.A10("type:CommunityMessaging|communityId:", this.A01, "|fbGroupId:", this.A02, "|threadId:", this.A00);
    }
}

package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* renamed from: X.92w, reason: invalid class name */
/* loaded from: 92w.class */
public final class C92w extends 7H8 {
    public final /* synthetic */ C6rO A00;
    public final /* synthetic */ 6tF A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92w(FbUserSession fbUserSession, 1pK r303, ThreadKey threadKey, C6rO c6rO, 2Of r306, 6tF r307) {
        super(fbUserSession, r303, threadKey, r306, r307);
        this.A01 = r307;
        this.A00 = c6rO;
    }

    public void A00(ImmutableList.Builder builder) {
        C6rO c6rO = this.A00;
        Context AWp = c6rO.AWp();
        11T.A0F(AWp, 0);
        6tF r0 = this.A01;
        11T.A0F(r0, 0);
        1pK Alf = c6rO.Alf();
        11T.A0F(Alf, 0);
        ThreadKey BF7 = c6rO.BF7();
        11T.A0F(BF7, 0);
        FbUserSession Alj = c6rO.Alj();
        11T.A0F(Alj, 0);
        builder.m11011add((Object) new D1m(AWp, Alj, Alf, BF7, r0));
        builder.m11011add((Object) new A4a(Alj, BF7));
        builder.m11011add((Object) new A4S(Alj));
        super.A00(builder);
    }
}

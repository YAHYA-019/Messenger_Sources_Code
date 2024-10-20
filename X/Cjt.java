package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.chatheads.service.ChatHeadService;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableSet;

/* loaded from: Cjt.class */
public final class Cjt implements AnonymousClass477 {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ ChatHeadService A02;
    public final /* synthetic */ String A03;

    public Cjt(Intent intent, FbUserSession fbUserSession, ChatHeadService chatHeadService, String str) {
        this.A02 = chatHeadService;
        this.A03 = str;
        this.A00 = intent;
        this.A01 = fbUserSession;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, com.facebook.messaging.chatheads.service.ChatHeadService, java.lang.Object] */
    @Override // X.AnonymousClass477
    public void COj(User user) {
        ?? r0 = this.A02;
        String str = this.A03;
        Intent intent = this.A00;
        FbUserSession fbUserSession = this.A01;
        ImmutableSet immutableSet = ChatHeadService.A10;
        C75 c75 = (C75) 1Lo.A04((Context) r0, fbUserSession, (1BY) null, 82162);
        Object A04 = 1Lo.A04((Context) r0, fbUserSession, (1BY) null, 49711);
        1FV A00 = c75.A00(user, false);
        1Kd.A0D(r0.A0g, new D4c(fbUserSession, intent, r0, user, A04, str, 0), A00);
    }

    @Override // X.AnonymousClass477
    public void onFailure(Throwable th) {
        ImmutableSet immutableSet = ChatHeadService.A10;
        0fH.A0j("ChatHeadService", "fetch user key failure");
        ChatHeadService chatHeadService = this.A02;
        ChatHeadService.A0P(this.A00, this.A01, chatHeadService, this.A03);
        chatHeadService.A08 = false;
    }
}

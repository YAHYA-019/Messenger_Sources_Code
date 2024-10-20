package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;

/* renamed from: X.819, reason: invalid class name */
/* loaded from: 819.class */
public final /* synthetic */ class AnonymousClass819 implements Runnable {
    public static final String __redex_internal_original_name = "XMAAttachmentCache$$ExternalSyntheticLambda0";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ 6Cd A03;
    public final /* synthetic */ Message A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ AnonymousClass819(FbUserSession fbUserSession, 6Cd r303, Message message, Integer num, String str, int i, int i2) {
        this.A03 = r303;
        this.A02 = fbUserSession;
        this.A05 = num;
        this.A04 = message;
        this.A06 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6Cd r0 = this.A03;
        6Cd.A01(this.A02, r0, this.A04, this.A05, this.A06, this.A00, this.A01);
    }
}

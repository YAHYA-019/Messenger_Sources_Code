package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.avatar.avatardetail.usecases.SendAvatarDetailMessage;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.stickers.model.Sticker;
import kotlin.jvm.functions.Function2;

/* loaded from: AJc.class */
public final class AJc extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJc(FbUserSession fbUserSession, 8Lu r303, SendAvatarDetailMessage sendAvatarDetailMessage, Message message, String str, String str2, 0DR r308) {
        super(2, r308);
        this.A03 = 1;
        this.A04 = fbUserSession;
        this.A06 = sendAvatarDetailMessage;
        this.A01 = r303;
        this.A05 = message;
        this.A08 = str;
        this.A07 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJc(FbUserSession fbUserSession, JHv jHv, C9hm c9hm, String str, String str2, 0DR r307) {
        super(2, r307);
        this.A03 = 0;
        this.A07 = str;
        this.A06 = c9hm;
        this.A08 = str2;
        this.A05 = fbUserSession;
        this.A04 = jHv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJc(ThreadKey threadKey, Sticker sticker, 7TA r304, C5fv c5fv, String str, String str2, 0DR r308) {
        super(2, r308);
        this.A03 = 2;
        this.A06 = null;
        this.A01 = sticker;
        this.A04 = c5fv;
        this.A02 = threadKey;
        this.A05 = r304;
        this.A08 = str;
        this.A07 = str2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        switch (this.A03) {
            case 0:
                String str = this.A07;
                AJc aJc = new AJc((FbUserSession) this.A05, (JHv) this.A04, (C9hm) this.A06, str, this.A08, r303);
                aJc.A01 = obj;
                return aJc;
            case 1:
                return new AJc((FbUserSession) this.A04, (8Lu) this.A01, (SendAvatarDetailMessage) this.A06, (Message) this.A05, this.A08, this.A07, r303);
            default:
                return new AJc((ThreadKey) this.A02, (Sticker) this.A01, (7TA) this.A05, (C5fv) this.A04, this.A08, this.A07, r303);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0321, code lost:
    
        if (r0.A0z() != true) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0478  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.facebook.messaging.avatar.avatardetail.repository.datasource;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Dt;
import X.1BK;
import X.1Um;
import X.AnonymousClass001;
import X.C6ku;
import X.C9ft;
import X.CyG;
import com.facebook.msys.mca.MailboxFutureImpl;
import kotlin.jvm.functions.Function2;

/* loaded from: AvatarDetailMsys$setConfig$2.class */
public final class AvatarDetailMsys$setConfig$2 extends 0DO implements Function2 {
    public final /* synthetic */ String $key;
    public final /* synthetic */ String $value;
    public int label;
    public final /* synthetic */ C9ft this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarDetailMsys$setConfig$2(C9ft c9ft, String str, String str2, 0DR r305) {
        super(2, r305);
        this.this$0 = c9ft;
        this.$key = str;
        this.$value = str2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new AvatarDetailMsys$setConfig$2(this.this$0, this.$key, this.$value, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        C6ku c6ku = this.this$0.A00;
        String str = this.$key;
        String str2 = this.$value;
        1Um AQV = c6ku.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        MailboxFutureImpl A0P2 = 1BK.A0P(AQV);
        1Um.A01(AQV, new CyG(c6ku, A0P, A0P2, str, str2, 0), A0P, A0P2);
        C9ft.A00(A0P2, 10000L);
        return 04S.A00;
    }
}

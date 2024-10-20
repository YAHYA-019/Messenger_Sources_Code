package X;

import com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi;

/* loaded from: Lzj.class */
public final class Lzj extends 0DP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EbPasskeyRestoreApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lzj(EbPasskeyRestoreApi ebPasskeyRestoreApi, 0DR r303) {
        super(r303);
        this.this$0 = ebPasskeyRestoreApi;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.A07(null, null, null, this);
    }
}

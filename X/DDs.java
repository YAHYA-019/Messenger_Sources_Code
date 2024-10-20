package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.presence.api.model.RichStatus;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: DDs.class */
public final class DDs extends C00q implements Function2 {
    public final /* synthetic */ List $contactPks;
    public final /* synthetic */ Message $message;
    public final /* synthetic */ 1Br $msysAdvancedCryptoStickerForwardHelper$delegate;
    public final /* synthetic */ String $sendAttributionRaw;
    public final /* synthetic */ 5Q3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DDs(1Br r302, Message message, 5Q3 r304, String str, List list) {
        super(2);
        this.this$0 = r304;
        this.$message = message;
        this.$contactPks = list;
        this.$sendAttributionRaw = str;
        this.$msysAdvancedCryptoStickerForwardHelper$delegate = r302;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        RichStatus richStatus = (RichStatus) obj;
        long A05 = AnonymousClass001.A05(obj2);
        11T.A0F(richStatus, 0);
        String A03 = 5Q3.A03(richStatus);
        CbZ cbZ = (CbZ) 1Br.A0B(this.$msysAdvancedCryptoStickerForwardHelper$delegate);
        Message message = this.$message;
        List list = this.$contactPks;
        CbZ.A00(this.this$0.A00, (5oV) null, message, cbZ, Long.valueOf(A05), this.$sendAttributionRaw, A03, list);
        return 04S.A00;
    }
}

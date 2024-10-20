package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.presence.api.model.RichStatus;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: DDt.class */
public final class DDt extends C00q implements Function2 {
    public final /* synthetic */ C01i $advancedCryptoAttachmentForwardHelper$delegate;
    public final /* synthetic */ List $contactPks;
    public final /* synthetic */ Message $message;
    public final /* synthetic */ MailboxNullable $result;
    public final /* synthetic */ String $sendAttributionRaw;
    public final /* synthetic */ 5Q3 this$0;
    public final /* synthetic */ Czd this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DDt(Message message, Czd czd, 5Q3 r304, MailboxNullable mailboxNullable, String str, List list, C01i c01i) {
        super(2);
        this.this$0 = r304;
        this.$result = mailboxNullable;
        this.$message = message;
        this.$sendAttributionRaw = str;
        this.$advancedCryptoAttachmentForwardHelper$delegate = c01i;
        this.this$1 = czd;
        this.$contactPks = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        RichStatus richStatus = (RichStatus) obj;
        long A05 = AnonymousClass001.A05(obj2);
        11T.A0F(richStatus, 0);
        String A03 = 5Q3.A03(richStatus);
        Bys bys = (Bys) this.$advancedCryptoAttachmentForwardHelper$delegate.getValue();
        MailboxNullable mailboxNullable = this.$result;
        Message message = this.$message;
        String str = this.$sendAttributionRaw;
        Cmh cmh = new Cmh(message, this.this$1, str, this.$contactPks);
        Long valueOf = Long.valueOf(A05);
        1BK.A1M(mailboxNullable, message);
        bys.A0C.execute(new DAb(null, message, cmh, bys, null, mailboxNullable, valueOf, A03, str));
        return 04S.A00;
    }
}

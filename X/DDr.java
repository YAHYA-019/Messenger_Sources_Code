package X;

import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.presence.api.model.RichStatus;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: DDr.class */
public final class DDr extends C00q implements Function2 {
    public final /* synthetic */ List $contactPks;
    public final /* synthetic */ 5qJ $customThreadsEmojiLike;
    public final /* synthetic */ Message $message;
    public final /* synthetic */ String $sendAttributionRaw;
    public final /* synthetic */ 5Q3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DDr(5qJ r302, Message message, 5Q3 r304, String str, List list) {
        super(2);
        this.this$0 = r304;
        this.$message = message;
        this.$contactPks = list;
        this.$customThreadsEmojiLike = r302;
        this.$sendAttributionRaw = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ThreadKey threadKey;
        String A0x;
        RichStatus richStatus = (RichStatus) obj;
        long A05 = AnonymousClass001.A05(obj2);
        11T.A0F(richStatus, 0);
        5Q3 r0 = this.this$0;
        String A03 = 5Q3.A03(richStatus);
        CIT A02 = 5Q3.A02(r0);
        Message message = this.$message;
        List list = this.$contactPks;
        int A00 = 5Q3.A00(5qJ.A00(this.$customThreadsEmojiLike, message.A13));
        String str = this.$sendAttributionRaw;
        if (list != null && !list.isEmpty() && (threadKey = message.A0V) != null && (A0x = 4YU.A0x(message)) != null) {
            22C r02 = (22C) A02.A06.get();
            long j = threadKey.A01;
            long A08 = AbK.A08(list, 0);
            String str2 = message.A1h;
            1Um A0O = 1BK.A0O(r02, 0);
            MailboxFutureImpl A0P = 1BK.A0P(A0O);
            int A002 = 4uZ.A00(A0P, (1X9) null);
            TraceInfo A022 = 4uZ.A02(A0P, (LoggingOption) null, "MailboxTam", "runTamClientNoteReply");
            if (!A0O.Cj2(new N7e(A0P, r02, str2, str, A03, A0x, A002, A00, j, A08, A05))) {
                A0P.cancel(false);
                4uZ.A03(A002);
                4uZ.A05((LoggingOption) null, A022, "MailboxTam", "runTamClientNoteReply");
            }
            PlatformLogger.platformEventLog(5);
        }
        return 04S.A00;
    }
}

package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.FetchMessagesContextResult;
import com.google.common.base.Platform;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3h.class */
public final class D3h implements 2eF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ Cba A02;
    public final /* synthetic */ String A03;

    public D3h(ThreadKey threadKey, Cba cba, String str, long j) {
        this.A02 = cba;
        this.A03 = str;
        this.A00 = j;
        this.A01 = threadKey;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        OperationResult operationResult = (OperationResult) obj;
        operationResult.getClass();
        FetchMessagesContextResult fetchMessagesContextResult = (FetchMessagesContextResult) operationResult.A07();
        MessagesCollection messagesCollection = fetchMessagesContextResult.A02;
        String str = this.A03;
        long j = this.A00;
        if (!C1q7.A0s(messagesCollection, str, j)) {
            if (!Platform.stringIsNullOrEmpty(str)) {
                throw ServiceException.A00(new Exception(StringFormatUtil.formatStrLocaleSafe("FETCH_MESSAGES_CONTEXT operation could not found message id: %s, in thread %s", str, this.A01)));
            }
            if (j > 0 && messagesCollection.A01.isEmpty()) {
                throw ServiceException.A00(new Exception(StringFormatUtil.formatStrLocaleSafe("FETCH_MESSAGES_CONTEXT operation could not find timestamp: %s, in thread %s", Long.valueOf(j), this.A01)));
            }
        }
        return C3o5.A0J(fetchMessagesContextResult);
    }
}

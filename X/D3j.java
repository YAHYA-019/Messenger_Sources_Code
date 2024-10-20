package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messaging.groups.create.model.CreateCustomizableGroupParams;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.FetchThreadResult;
import com.facebook.ui.media.attachments.model.MediaUploadResult;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Files;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: D3j.class */
public final class D3j implements 2eF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public D3j(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v78, types: [X.1FX, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        1FV A03;
        MessagesCollection messagesCollection;
        switch (this.A00) {
            case 0:
                ThreadSummary threadSummary = (ThreadSummary) obj;
                C1254Abw c1254Abw = (C1254Abw) this.A03;
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                Context context = (Context) this.A01;
                11T.A0D(context);
                if (threadSummary == null) {
                    throw AnonymousClass001.A0N("ThreadSummary is null or empty");
                }
                A03 = c1254Abw.A03(context, fbUserSession, threadSummary);
                return A03;
            case 1:
                MediaUploadResult mediaUploadResult = (MediaUploadResult) obj;
                Files.A05(new File(((Uri) this.A02).getPath()), 2Ik.A02(1BK.A04(((5HZ) this.A01).A05), (ThreadKey) this.A03, mediaUploadResult.A0G));
                return C3o5.A0J(mediaUploadResult);
            case 2:
                IXv iXv = (JNm) obj;
                if (iXv == null) {
                    return new 7hZ(AnonymousClass001.A0N("Cannot approve or deny participant on an ended ConferenceCall"));
                }
                Collection collection = (Collection) this.A02;
                Integer num = (Integer) this.A01;
                11T.A0H(collection, num);
                iXv.A00.A99(num, 1BK.A17(collection));
                ListenableFuture listenableFuture = 1hM.A01;
                11T.A0A(listenableFuture);
                return listenableFuture;
            case 3:
                OperationResult operationResult = (OperationResult) obj;
                operationResult.getClass();
                FetchThreadResult A0c = AbM.A0c(operationResult);
                if (operationResult.success && A0c != null && A0c != FetchThreadResult.A0C && (messagesCollection = A0c.A03) != null && !messagesCollection.A01.isEmpty()) {
                    Bqs bqs = (Bqs) this.A02;
                    String str = bqs.A02;
                    long j = bqs.A00;
                    if (!C1q7.A0s(messagesCollection, str, j)) {
                        Cba cba = (Cba) this.A01;
                        return AbJ.A0t(cba.A01, new D2q(this, A0c, 16), Cba.A00((ThreadKey) this.A03, cba, str, j));
                    }
                }
                ?? obj2 = new Object();
                obj2.set(operationResult);
                return obj2;
            default:
                if (obj != null) {
                    return C3o5.A0J(obj);
                }
                BFG bfg = (BFG) this.A01;
                FbUserSession fbUserSession2 = (FbUserSession) this.A02;
                List list = (List) this.A03;
                HashSet A0v = AnonymousClass001.A0v();
                ArrayList A1B = AbJ.A1B(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A1B.add(7zN.A0d(AbF.A0y(), AnonymousClass001.A0i(it)));
                }
                ImmutableList copyOf = ImmutableList.copyOf((Collection) A1B);
                return ((CIz) bfg.A02.get()).A02(fbUserSession2, new CreateCustomizableGroupParams(null, null, null, null, null, null, null, null, null, copyOf, null, null, null, null, null, null, null, C1pq.A07(copyOf, "participants", A0v, A0v), 0L, false, false, false, false), false);
        }
    }
}

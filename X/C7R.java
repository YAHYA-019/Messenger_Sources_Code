package X;

import android.content.Context;
import android.util.ArrayMap;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.share.SentShareAttachment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceLogger;
import java.util.ArrayList;

/* loaded from: C7R.class */
public final class C7R {
    public final Context A00;
    public final 1CO A02 = AbJ.A0e();
    public final C00i A01 = 1BV.A00(116182);

    public C7R(Context context) {
        this.A00 = context;
    }

    public Integer A00(Message message) {
        int i;
        SentShareAttachment sentShareAttachment;
        ThreadKey threadKey = message.A0V;
        if (threadKey == null) {
            return null;
        }
        boolean A0z = threadKey.A0z();
        boolean z = C1q7.A0B(message) || C1q7.A0A(message) || !(message.A1m == null || C1q7.A0W(message)) || C1q7.A09(message) || ((sentShareAttachment = message.A0R) != null && sentShareAttachment.A01 == BM7.A03);
        if (A0z) {
            i = 13;
            if (z) {
                i = 15;
            }
        } else {
            i = 1;
            if (z) {
                i = 4;
            }
        }
        return Integer.valueOf(i);
    }

    public String A01(Message message) {
        String A02;
        Integer A00 = A00(message);
        if (A00 == null) {
            A02 = null;
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            ThreadKey threadKey = message.A0V;
            4YU.A1W(A0s, 5Pp.A00(threadKey).intValue());
            C00i c00i = this.A01;
            5Et r0 = (5Et) c00i.get();
            int intValue = A00.intValue();
            A02 = r0.A02(message.A1g, A0s, intValue);
            if (A02 != null) {
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put(Long.valueOf(4), Long.valueOf(threadKey != null ? threadKey.A01 : 0L));
                c00i.get();
                TraceLogger.logWithLabeledTags(null, intValue, null, 2222, A02, null, 0, 5Pq.A01(this.A00, 0S2.A0Y), arrayMap, null);
                if (intValue == 13 && !this.A02.AZk(36326416777762404L)) {
                    PlatformLogger.platformEventStartS2STrace(A02);
                    PlatformLogger.platformEventLogS2STraceStartPointAnnotation(A02, "NotificationOneTraceIdSendLogger");
                    PlatformLogger.platformEventStructuredLoggerAdd1TidTraceIdWithAliasId(A02, A02);
                    if (threadKey != null) {
                        PlatformLogger.platformEventStructuredLoggerFBNS2SEventThreadTypeAnnotation(A02, threadKey.A06.toString());
                        return A02;
                    }
                }
            }
        }
        return A02;
    }
}

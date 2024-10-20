package X;

import android.content.Context;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.fury.reliability.sapienz.SapienzStacktraceFlowCollector;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.fury.context.ReqContext;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.3NZ, reason: invalid class name */
/* loaded from: 3NZ.class */
public final class C3NZ {
    public final Context A00;

    public C3NZ(Context context) {
        this.A00 = context;
    }

    public void A00(String str) {
        String str2;
        String A0g;
        String str3;
        synchronized (this) {
            if (SapienzStacktraceFlowCollector.A08 && SapienzStacktraceFlowCollector.A09) {
                ReqContext A00 = AnonymousClass018.A00();
                String str4 = "[no active furyContext]";
                if (A00 != null) {
                    str2 = "RFTGraphQLStackTraceCollector";
                    1BK.A1Q("Active reqContext found for ", str, str2);
                    long currentTid = A00.getCurrentTid();
                    int currentSeqId = A00.getCurrentSeqId();
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append(currentTid);
                    A0g = 0Pz.A0j(str, "_", AnonymousClass001.A0e(":", A0k, currentSeqId));
                    str4 = StringFormatUtil.formatStrLocaleSafe("%x", Long.valueOf(1EU.A00(A00)));
                } else {
                    str2 = "RFTGraphQLStackTraceCollector";
                    1BK.A1Q("Active reqContext not found for ", str, str2);
                    A0g = 0Pz.A0g(str, "_", System.currentTimeMillis());
                }
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder A0k2 = AnonymousClass001.A0k();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    A0k2.append(stackTraceElement);
                    A0k2.append(" ");
                }
                String A10 = 0Pz.A10(A0g, "\n", str4, "\n", A0k2.toString(), "\n\n");
                0fH.A0j(str2, "Async stacktrace data is serialized successfully");
                Context context = this.A00;
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(context.openFileOutput(AnonymousClass001.A0D(context.getFilesDir(), "graphql_stacktraces.txt").getName(), Constants.LOAD_RESULT_PGO));
                    try {
                        0fH.A0k(str2, A10);
                        bufferedOutputStream.write(A10.getBytes());
                        0fH.A0j(str2, "Async stacktrace data is written to file successfully");
                        bufferedOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable th2) {
                            7kF.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e) {
                    e = e;
                    str3 = "graphql_stacktraces.txt file not found";
                    0fH.A0r(str2, str3, e);
                } catch (IOException e2) {
                    e = e2;
                    str3 = "Can't write contents to graphql_stacktraces.txtfile";
                    0fH.A0r(str2, str3, e);
                }
            }
        }
    }
}

package X;

import com.facebook.bugreporter.core.BugReportRetryManager;
import com.facebook.privacy.acs.falco.FalcoACSProvider;
import java.util.HashMap;

/* loaded from: G8X.class */
public final class G8X extends HashMap {
    public final /* synthetic */ BugReportRetryManager this$0;
    public final /* synthetic */ String val$clientServerJoinKey;
    public final /* synthetic */ String val$configId;
    public final /* synthetic */ String val$filePath;
    public final /* synthetic */ String val$filename;
    public final /* synthetic */ boolean val$isSessionless;
    public final /* synthetic */ boolean val$isUserGenerated;
    public final /* synthetic */ String val$reportId;
    public final /* synthetic */ int val$retryNum;

    public G8X(BugReportRetryManager bugReportRetryManager, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2) {
        this.this$0 = bugReportRetryManager;
        this.val$reportId = str;
        this.val$filename = str2;
        this.val$filePath = str3;
        this.val$configId = str4;
        this.val$isSessionless = z;
        this.val$retryNum = i;
        this.val$isUserGenerated = z2;
        this.val$clientServerJoinKey = str5;
        put("report_id", str);
        put("file_name", str2);
        put("file_path", str3);
        put(FalcoACSProvider.CONFIG_ID, str4);
        put("is_sessionless", String.valueOf(z));
        put("retry_num", String.valueOf(i));
        put("is_user_generated", String.valueOf(z2));
        put("client_server_join_key", str5);
    }
}

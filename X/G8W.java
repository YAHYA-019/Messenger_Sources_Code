package X;

import com.facebook.bugreporter.core.BugReportRetryManager;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: G8W.class */
public final class G8W extends HashMap {
    public final /* synthetic */ BugReportRetryManager this$0;
    public final /* synthetic */ long val$finalMiscInfoSize;
    public final /* synthetic */ long val$finalTotalSyncAttachmentSize;
    public final /* synthetic */ JSONObject val$jsonSyncAttachments;

    public G8W(BugReportRetryManager bugReportRetryManager, JSONObject jSONObject, long j, long j2) {
        this.this$0 = bugReportRetryManager;
        this.val$jsonSyncAttachments = jSONObject;
        this.val$finalTotalSyncAttachmentSize = j;
        this.val$finalMiscInfoSize = j2;
        put("sync_attachments", jSONObject.toString());
        put("total_sync_attachment_size", String.valueOf(j));
        put("total_misc_info_size", String.valueOf(j2));
    }
}

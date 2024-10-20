package X;

import java.util.HashMap;

/* loaded from: G8U.class */
public final class G8U extends HashMap {
    public final /* synthetic */ FIL this$0;
    public final /* synthetic */ HashMap val$finalAsyncDebugAttachments;
    public final /* synthetic */ HashMap val$finalDebugAttachments;

    public G8U(FIL fil, HashMap hashMap, HashMap hashMap2) {
        this.this$0 = fil;
        this.val$finalDebugAttachments = hashMap;
        this.val$finalAsyncDebugAttachments = hashMap2;
        put("attachments_size_sync", String.valueOf(FIL.A00(hashMap)));
        put("attachments_size_async", String.valueOf(FIL.A00(hashMap2)));
    }
}

package X;

import com.facebook.messaging.encryptedbackups.gdrive.viewdata.GoogleDriveViewData;

/* loaded from: AIV.class */
public final class AIV extends 0DP {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GoogleDriveViewData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIV(GoogleDriveViewData googleDriveViewData, 0DR r303) {
        super(r303);
        this.this$0 = googleDriveViewData;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.A0C(null, this, false);
    }
}

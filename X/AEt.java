package X;

import android.os.Bundle;
import com.facebook.messaging.model.messages.Message;

/* loaded from: AEt.class */
public final class AEt implements Runnable {
    public static final String __redex_internal_original_name = "MediaGridViewFragment$Companion$getMediaGridViewFragment$2$1";
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ Message A01;

    public AEt(Bundle bundle, Message message) {
        this.A00 = bundle;
        this.A01 = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.putParcelable("message_key", 0Gm.A00(this.A01));
    }
}

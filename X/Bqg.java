package X;

import android.content.Context;
import android.view.View;
import com.facebook.messaging.sharing.broadcastflow.model.SendState;

/* loaded from: Bqg.class */
public final class Bqg {
    public final Context A00;
    public final View A01;
    public final SendState A02;

    public Bqg(View view, SendState sendState) {
        this.A00 = view.getContext();
        this.A01 = view;
        this.A02 = sendState;
    }
}

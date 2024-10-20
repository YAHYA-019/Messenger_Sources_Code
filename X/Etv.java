package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.messaging.neue.nux.webview.NeueNuxWebViewActivity;

/* loaded from: Etv.class */
public final class Etv {
    public final Context A00;
    public final 1De A01;
    public final C15h A02 = G7K.A01(this, 42);

    public Etv(1De r302) {
        this.A01 = r302;
        this.A00 = AbK.A0A(r302);
    }

    public final void A00() {
        Context context = this.A00;
        String A0u = 1BK.A0u(context, 2131959020);
        Intent A0D = C3o5.A0D(context, NeueNuxWebViewActivity.class);
        A0D.putExtra("title_arg", A0u);
        A0D.putExtra("uri_arg", this.A02.get().toString());
        0LS.A0A(context, A0D);
    }
}

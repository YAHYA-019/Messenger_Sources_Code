package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.stickers.keyboardls.stickergrid.StickerGridView;

/* loaded from: H0G.class */
public final class H0G extends HGH {
    public 06Z A00;
    public MigColorScheme A01;
    public StickerGridView A02;
    public final Context A03;
    public final JMq A04;
    public final C6xe A05;
    public final String A06;

    public H0G(Context context, JMq jMq, String str) {
        11T.A0F(str, 1);
        this.A06 = str;
        this.A04 = jMq;
        this.A03 = context;
        this.A05 = new C6xe(context, null);
    }

    public void A05() {
        ((HGH) this).A00 = false;
        StickerGridView stickerGridView = this.A02;
        if (stickerGridView != null) {
            stickerGridView.A0Y();
        }
    }
}

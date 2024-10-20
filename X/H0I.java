package X;

import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.stickers.keyboardls.stickergrid.StickerGridView;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: H0I.class */
public final class H0I extends HGH {
    public 06Z A00;
    public LifecycleOwner A01;
    public ThreadKey A02;
    public MigColorScheme A03;
    public StickerGridView A04;
    public Capabilities A05;
    public final JMq A08;
    public final String A0A;
    public final C00i A06 = 1BQ.A02(68416);
    public final C00i A07 = 1BV.A00(67799);
    public final GGS A09 = new Igk(this);

    public H0I(JMq jMq, String str) {
        this.A0A = str;
        this.A08 = jMq;
    }

    public void A05() {
        ((HGH) this).A00 = false;
        StickerGridView stickerGridView = this.A04;
        if (stickerGridView != null) {
            stickerGridView.A0Y();
        }
    }
}

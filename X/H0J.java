package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.stickers.keyboardls.stickergrid.StickerGridView;

/* loaded from: H0J.class */
public final class H0J extends HGH {
    public 06Z A00;
    public LifecycleOwner A01;
    public MigColorScheme A02;
    public StickerGridView A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final JMq A08;
    public final GGS A09;
    public final String A0A;
    public final Context A0B;

    public H0J(Context context, JMq jMq, String str) {
        11T.A0F(str, 1);
        this.A0A = str;
        this.A08 = jMq;
        this.A0B = context;
        this.A07 = 7zM.A0e(context);
        this.A04 = 1Bu.A01(context, 83914);
        this.A06 = 1Bu.A00(67799);
        this.A05 = 1Bq.A00(68416);
        this.A09 = new Igj(this);
    }

    public void A05() {
        ((HGH) this).A00 = false;
        StickerGridView stickerGridView = this.A03;
        if (stickerGridView != null) {
            stickerGridView.A0Y();
        }
    }
}

package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.stickers.keyboardls.stickergrid.StickerGridView;
import com.google.common.collect.ImmutableList;

/* loaded from: H0K.class */
public final class H0K extends HGH {
    public 06Z A00;
    public MigColorScheme A01;
    public StickerGridView A02;
    public ImmutableList A03;
    public final Context A04;
    public final Uri A05;
    public final C00i A06;
    public final JMq A07;
    public final C5es A08;
    public final ImmutableList A09;
    public final String A0A;
    public final String A0B;

    public H0K(Context context, Uri uri, JMq jMq, C5es c5es, ImmutableList immutableList, String str, String str2) {
        this.A06 = 7zL.A0R(context, 49779);
        this.A04 = context;
        this.A0A = str;
        this.A09 = immutableList;
        this.A0B = str2;
        this.A07 = jMq;
        this.A08 = c5es;
        this.A05 = uri;
    }

    public void A05() {
        ((HGH) this).A00 = false;
        StickerGridView stickerGridView = this.A02;
        if (stickerGridView != null) {
            stickerGridView.A0Y();
        }
    }
}

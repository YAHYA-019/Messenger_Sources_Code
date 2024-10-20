package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.messaging.storagemanagement.mediamanager.model.MediaItem;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.video.engine.api.VideoPlayerParams;

/* renamed from: X.8W0, reason: invalid class name */
/* loaded from: 8W0.class */
public final class C8W0 extends 1LH {
    public final C2630Gjf A00;
    public final MediaItem A01;

    public C8W0(C2630Gjf c2630Gjf, MediaItem mediaItem) {
        this.A01 = mediaItem;
        this.A00 = c2630Gjf;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        Drawable A08 = 3yH.A08(c2k5, 2132410906);
        MediaItem mediaItem = this.A01;
        C2630Gjf c2630Gjf = this.A00;
        6A9 r0 = new 6A9();
        String str = mediaItem.A07;
        11T.A0A(str);
        r0.A03 = Uri.parse(str);
        r0.A04 = 6AB.A03;
        VideoDataSource videoDataSource = new VideoDataSource(r0);
        6TA r02 = new 6TA();
        r02.A0U = videoDataSource;
        r02.A0M = c2630Gjf.A00;
        r02.A0N = c2630Gjf.A01;
        r02.A03(mediaItem.A06);
        Long l = mediaItem.A05;
        r02.A0L = l != null ? (int) l.longValue() : 0;
        r02.A02(6Ut.A02, TraceFieldType.TransportType);
        VideoPlayerParams videoPlayerParams = new VideoPlayerParams(r02);
        6TF r03 = new 6TF();
        r03.A03 = videoPlayerParams;
        6TI A01 = r03.A01();
        1Iw r04 = c2k5.A05;
        GR6 A00 = GR5.A00(r04);
        A00.A0D(A08);
        A00.A2P(true);
        A00.A2a(92R.A01);
        A00.A2Z(PlayerOrigin.A0J);
        A00.A1L(c2630Gjf.A00);
        A00.A0C(c2630Gjf.A01);
        A00.A2c(false);
        GR5 gr5 = A00.A01;
        gr5.A0N = true;
        A00.A0L();
        gr5.A0J = 11T.A03(new A3c(7zL.A0A(r04)));
        A00.A2Y(6TN.A09);
        A00.A2b(A01);
        A00.A2X(c2630Gjf.A01 / c2630Gjf.A00);
        return A00.A2W();
    }
}

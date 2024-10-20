package X;

import android.content.Context;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.widget.FbImageView;

/* loaded from: H2v.class */
public final class H2v extends C6d6 {
    public C00i A00;
    public C00i A01;
    public VideoPlayerParams A02;
    public 5Kt A03;
    public final GPl A04;
    public final GPl A05;
    public final FbImageView A06;

    /* JADX WARN: Multi-variable type inference failed */
    public H2v(Context context) {
        super(context, null, 0);
        this.A01 = 1BQ.A02(17034);
        this.A00 = 1BQ.A02(16465);
        this.A03 = (5Kt) 1Bi.A03(49694);
        A0C(2132542157);
        FbImageView fbImageView = (FbImageView) C09s.A01(this, 2131367492);
        this.A06 = fbImageView;
        6TJ A00 = GPl.A00(this, 10);
        this.A05 = A00;
        A0h(A00);
        6TJ A002 = GPl.A00(this, 9);
        this.A04 = A002;
        A0h(A002);
        IKE.A01(fbImageView, this, 18);
    }

    public static void A00(H2v h2v, boolean z) {
        h2v.A06.setImageDrawable(7zP.A0R().A07(z ? C1u3.A0b : C1u3.A0c));
    }

    public static boolean A01(H2v h2v) {
        VideoPlayerParams videoPlayerParams;
        String str;
        PlayerOrigin playerOrigin;
        6cT r0 = h2v.A07;
        if (r0 != null) {
            return r0.BUR();
        }
        GRX grx = h2v.A09;
        if (grx != null && (videoPlayerParams = h2v.A02) != null && (str = videoPlayerParams.A0k) != null && (playerOrigin = ((C6d6) h2v).A03) != null) {
            return grx.A0A(playerOrigin, str);
        }
        ((2UZ) h2v.A01.get()).A08("", 0S2.A15, "Can not determine mute status.");
        return false;
    }

    @Override // X.C6d6
    public String A0H() {
        return "InboxAdsPostClickVideoSoundTogglePlugin";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6d6
    public void A0M() {
        this.A02 = null;
        setVisibility(8);
    }

    @Override // X.C6d6
    public void A0U(6TN r302, PlayerOrigin playerOrigin, GRD grd, 6TI r305, 6U2 r306, C6ce c6ce, GRX grx) {
        super.A0U(r302, playerOrigin, grd, r305, r306, c6ce, grx);
        A00(this, A01(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        this.A02 = r302.A03;
        setVisibility(0);
    }
}

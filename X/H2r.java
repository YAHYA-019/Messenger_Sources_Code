package X;

import android.content.Context;
import com.facebook.gif.AnimatedImagePlayButtonView;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;

/* loaded from: H2r.class */
public final class H2r extends C6d6 {
    public final AnimatedImagePlayButtonView A00;
    public final 1Br A01;

    /* JADX WARN: Multi-variable type inference failed */
    public H2r(Context context) {
        super(context, null, 7zP.A1X(context) ? 1 : 0);
        this.A01 = 1Bq.A00(115824);
        A0C(2132541507);
        this.A00 = (AnimatedImagePlayButtonView) C09s.A01(this, 2131362040);
        GPl.A02(this, 74);
    }

    public static final GRS A00(H2r h2r) {
        6Tb r0 = (6Tb) 1Br.A0B(h2r.A01);
        6TI r02 = h2r.A05;
        String A03 = r02 != null ? r02.A03() : null;
        PlayerOrigin playerOrigin = h2r.A03;
        if (playerOrigin == null) {
            playerOrigin = PlayerOrigin.A0g;
        }
        return r0.A07(playerOrigin, A03).A04();
    }

    @Override // X.C6d6
    public String A0H() {
        return "AnimatedGifPlayButtonPlugin";
    }

    @Override // X.C6d6
    public void A0M() {
        VideoPlayerParams videoPlayerParams;
        this.A00.A0V(0S2.A0N);
        6TI r0 = this.A05;
        if (r0 == null || (videoPlayerParams = r0.A03) == null || !videoPlayerParams.A1k) {
            return;
        }
        this.A05 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[RETURN] */
    @Override // X.C6d6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0e(X.6TI r302, boolean r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            com.facebook.video.engine.api.VideoPlayerParams r0 = r0.A03
            r304 = r0
            r0 = r304
            boolean r0 = r0.A1k
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L1a
            r0 = r301
            r1 = r302
            r0.A05 = r1
        L1a:
            r0 = r301
            boolean r0 = r0.A0B
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L3f
            r0 = r301
            X.GRS r0 = A00(r0)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L53
            r0 = r304
            boolean r0 = r0.isPlaying()
            r305 = r0
        L37:
            r0 = r305
            r1 = r306
            if (r0 != r1) goto L53
            return
        L3f:
            r0 = r301
            X.6cT r0 = r0.A07
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L53
            r0 = r304
            boolean r0 = r0.isPlaying()
            r305 = r0
            goto L37
        L53:
            r0 = r301
            com.facebook.gif.AnimatedImagePlayButtonView r0 = r0.A00
            r307 = r0
            java.lang.Integer r0 = X.0S2.A00
            r304 = r0
            r0 = r307
            r1 = r304
            r0.A0V(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2r.A0e(X.6TI, boolean):void");
    }
}

package X;

import android.content.Context;
import com.facebook.messaging.rtc.incall.impl.mediasync.seekbarview.MediaSyncSeekBarView;
import com.facebook.video.player.RichVideoPlayer;

/* loaded from: H2n.class */
public final class H2n extends C6d6 {
    public final 1Br A00;

    public H2n(Context context) {
        super(context, null, 0);
        this.A00 = 1Bq.A00(115795);
        GPl.A02(this, 30);
    }

    @Override // X.C6d6
    public String A0H() {
        return "MediaSyncExternalPlugin";
    }

    @Override // X.C6d6
    public void A0M() {
        HgM hgM = (HgM) 1Br.A0B(this.A00);
        for (HDb hDb : hgM.A03) {
            if (hDb instanceof Gq3) {
                MediaSyncSeekBarView mediaSyncSeekBarView = ((Gq3) hDb).A00;
                6dM.A00((6U2) null, mediaSyncSeekBarView.A00, mediaSyncSeekBarView.A0B);
                mediaSyncSeekBarView.A00 = null;
                1Br r0 = mediaSyncSeekBarView.A07;
                GeJ geJ = (GeJ) 1Br.A0B(r0);
                6dM.A00((6U2) null, geJ.A06, geJ.A0I);
                geJ.A06 = null;
                ((GeJ) 1Br.A0B(r0)).A06();
                mediaSyncSeekBarView.A01 = null;
                mediaSyncSeekBarView.A02 = null;
            }
        }
        hgM.A00 = null;
        hgM.A01 = null;
        hgM.A02 = false;
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        GeJ geJ;
        11T.A0F(r302, 0);
        HgM hgM = (HgM) 1Br.A0B(this.A00);
        6cT r0 = this.A07;
        GRX grx = this.A09;
        C6ce c6ce = this.A08;
        hgM.A00 = r302;
        hgM.A01 = r0;
        for (HDb hDb : hgM.A03) {
            if (hDb instanceof Gq3) {
                MediaSyncSeekBarView mediaSyncSeekBarView = ((Gq3) hDb).A00;
                mediaSyncSeekBarView.A01 = r0;
                mediaSyncSeekBarView.A04 = r302.A03();
                mediaSyncSeekBarView.A02 = c6ce;
                mediaSyncSeekBarView.A03 = grx;
                ((GrE) 1Br.A0B(mediaSyncSeekBarView.A08)).A0d(r302);
                MediaSyncSeekBarView.A01(mediaSyncSeekBarView);
                6U2 r305 = null;
                if (mediaSyncSeekBarView.A03 != null && mediaSyncSeekBarView.A04 != null) {
                    1Br r02 = mediaSyncSeekBarView.A07;
                    ((GeJ) 1Br.A0B(r02)).A09(mediaSyncSeekBarView.A01, mediaSyncSeekBarView.A03);
                    GRX grx2 = mediaSyncSeekBarView.A03;
                    if (grx2 != null) {
                        String str = mediaSyncSeekBarView.A04;
                        if (str == null) {
                            str = "";
                        }
                        r305 = grx2.A07(I9A.A0F, str);
                        if (r305 != null) {
                            geJ = (GeJ) 1Br.A0B(r02);
                        }
                    }
                    throw 1BK.A0h();
                }
                if (mediaSyncSeekBarView.A01 != null) {
                    1Br r03 = mediaSyncSeekBarView.A07;
                    ((GeJ) 1Br.A0B(r03)).A09(mediaSyncSeekBarView.A01, (GRX) null);
                    geJ = (GeJ) 1Br.A0B(r03);
                    6cT r04 = mediaSyncSeekBarView.A01;
                    if (r04 != null) {
                        r305 = ((RichVideoPlayer) r04).A0I;
                    }
                }
                ((GeJ) 1Br.A0B(mediaSyncSeekBarView.A07)).A07();
                6U2 r05 = geJ.A06;
                if (r305 != r05) {
                    6dM.A00(r305, r05, geJ.A0I);
                    geJ.A06 = r305;
                }
                ((GeJ) 1Br.A0B(mediaSyncSeekBarView.A07)).A07();
            }
        }
    }
}

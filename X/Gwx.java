package X;

import com.facebook.rsys.cowatchad.gen.AdInfo;
import com.facebook.rsys.cowatchad.gen.CowatchAdPlayerApi;
import com.facebook.rsys.cowatchad.gen.CowatchAdPlayerProxy;

/* loaded from: Gwx.class */
public final class Gwx extends CowatchAdPlayerProxy {
    public CowatchAdPlayerApi A00;
    public final 1Br A01 = 1Bu.A00(115905);

    @Override // com.facebook.rsys.cowatchad.gen.CowatchAdPlayerProxy
    public void loadAd(String str, String str2) {
        11T.A0H(str, str2);
        1Br.A0C(this.A01);
        Hql A00 = HvP.A00();
        if (A00 != null) {
            6U2 r0 = A00.A07;
            if (r0 == null) {
                11T.A0L("hostRichVideoPlayerEventBus");
                throw 0Q8.createAndThrow();
            }
            H9X h9x = H9X.A02;
            r0.A06(new H2Q(h9x, A00.A01));
            A00.A01 = h9x;
        }
    }

    @Override // com.facebook.rsys.cowatchad.gen.CowatchAdPlayerProxy
    public void playAd(AdInfo adInfo) {
        11T.A0F(adInfo, 0);
        1Br.A0C(this.A01);
        String str = adInfo.clientToken;
        11T.A09(str);
        String str2 = adInfo.videoId;
        11T.A09(str2);
        String str3 = adInfo.playbackUrl;
        11T.A09(str3);
        int i = adInfo.durationMs;
        int i2 = adInfo.adIndex;
        int i3 = adInfo.totalAdCount;
        float f = adInfo.aspectRatio;
        Hql A00 = HvP.A00();
        if (A00 != null) {
            A00.A08 = str;
            A00.A00 = f;
            A00.A02 = new QUp(i2, i3, str2, i, str3);
            H9X h9x = A00.A01;
            if (h9x == H9X.A03) {
                6U2 r0 = A00.A07;
                if (r0 == null) {
                    11T.A0L("hostRichVideoPlayerEventBus");
                    throw 0Q8.createAndThrow();
                }
                H9X h9x2 = H9X.A02;
                r0.A06(new H2Q(h9x2, h9x));
                A00.A01 = h9x2;
            }
        }
    }

    @Override // com.facebook.rsys.cowatchad.gen.CowatchAdPlayerProxy
    public void setApi(CowatchAdPlayerApi cowatchAdPlayerApi) {
        11T.A0F(cowatchAdPlayerApi, 0);
        this.A00 = cowatchAdPlayerApi;
    }

    @Override // com.facebook.rsys.cowatchad.gen.CowatchAdPlayerProxy
    public void stopAdBreak() {
        1Br.A0C(this.A01);
        Hql A00 = HvP.A00();
        if (A00 != null) {
            A00.A00();
        }
    }
}

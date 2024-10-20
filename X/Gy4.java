package X;

import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import com.facebook.rsys.screenshare.gen.ScreenShareProxy;

/* loaded from: Gy4.class */
public final class Gy4 extends ScreenShareProxy {
    public int A00;
    public Hif A01;
    public ScreenShareApi A02;
    public final 1De A03;
    public final 1Br A05;
    public final IY8 A06 = IY8.A01(this, 2);
    public final 1Br A04 = 1Bq.A00(16485);

    public Gy4(1De r302) {
        this.A03 = r302;
        this.A05 = GOp.A0J(r302);
    }

    @Override // com.facebook.rsys.screenshare.gen.ScreenShareProxy
    public void setApi(ScreenShareApi screenShareApi) {
        11T.A0F(screenShareApi, 0);
        this.A02 = screenShareApi;
    }

    @Override // com.facebook.rsys.screenshare.gen.ScreenShareProxy
    public void setScreenShareAvailability(int i) {
        Integer num;
        if (i == 0 || i == 1) {
            return;
        }
        IRo iRo = (JOA) 4YU.A0n(1Br.A03(this.A05), this.A03, 114911);
        if (i != 5) {
            if (i != 11 && i != 12) {
                switch (i) {
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        break;
                    default:
                        num = 0S2.A0u;
                        break;
                }
            }
            num = 0S2.A0Y;
        } else {
            num = 0S2.A0j;
        }
        11T.A0F(num, 0);
        iRo.A02 = num;
        4YV.A11(this.A04).execute(new IpR(this));
    }

    @Override // com.facebook.rsys.screenshare.gen.ScreenShareProxy
    public void setScreenShareFrameCaptureRate(int i) {
        Hif hif = this.A01;
        if (hif == null) {
            4zI.A03.A08("ScreenShareControllerImpl", "Media Capture is null while it is expected to be non-null", AnonymousClass001.A1Z());
        } else {
            hif.A02.D3S(i);
        }
    }

    @Override // com.facebook.rsys.screenshare.gen.ScreenShareProxy
    public void setScreenShareStopSharing() {
        IRo iRo = (JOA) 4YU.A0n(1Br.A03(this.A05), this.A03, 114911);
        Integer num = 0S2.A0Y;
        11T.A0F(num, 0);
        iRo.A02 = num;
        4YV.A11(this.A04).execute(new IpR(this));
    }
}

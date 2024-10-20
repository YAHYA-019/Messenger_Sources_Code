package X;

import android.net.Uri;
import android.view.View;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.screensharing.ScreenSharingImplementation;
import com.facebook.rtc.plugins.calllifecycle.rooms2live.Rooms2LiveCallLifecycle;
import com.facebook.user.model.UserKey;

/* loaded from: Ix1.class */
public final class Ix1 implements Runnable {
    public static final String __redex_internal_original_name = "PeerScreenSharingSharedStateImpl$onPeerScreenSharingMessageReceived$1";
    public final /* synthetic */ IZ0 A00;
    public final /* synthetic */ String A01;

    public Ix1(IZ0 iz0, String str) {
        this.A01 = str;
        this.A00 = iz0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A01;
        if (str != null) {
            this.A00.A0G.add(str);
        }
        IZ0 iz0 = this.A00;
        for (IYz iYz : iz0.A0F) {
            switch (iYz.A00) {
                case 0:
                    I7Z i7z = (I7Z) 1Br.A0B(((Hu8) iYz.A01).A0A);
                    I7Z.A01(i7z, new J8q(i7z, 36));
                    break;
                case 1:
                    IE5.A04((IE5) iYz.A01, str, true);
                    break;
                case 2:
                    break;
                case 3:
                    GrU.A09((GrU) iYz.A01);
                    break;
                case 4:
                    GrT grT = (GrT) iYz.A01;
                    GrT.A03(grT);
                    HkG A00 = GrT.A00(grT);
                    A00.A06 = GrT.A0B(grT);
                    IZw.A00(A00, grT);
                    break;
                case 5:
                    if (str == null) {
                        ScreenSharingImplementation screenSharingImplementation = (ScreenSharingImplementation) iYz.A01;
                        I8a i8a = ((HEt) screenSharingImplementation).A00;
                        if (i8a != null) {
                            i8a.A02(new GjI((Uri) null, (View.OnClickListener) null, (View.OnClickListener) null, (C1u3) null, C1u4.SIZE_32, (Hre) null, (Hre) null, HBr.A0r, 4YU.A0t(screenSharingImplementation.A00.getResources(), 2131965253), (CharSequence) null, C0ty.A00, 0, 0, 0, 3000L, false, false));
                            break;
                        } else {
                            break;
                        }
                    } else {
                        UserKey A0X = 1BK.A0X(str);
                        ScreenSharingImplementation screenSharingImplementation2 = (ScreenSharingImplementation) iYz.A01;
                        AnonymousClass472 anonymousClass472 = (AnonymousClass472) 1Br.A0B(screenSharingImplementation2.A01);
                        11T.A0D(A0X);
                        anonymousClass472.A00(A0X).A02(new IUs(screenSharingImplementation2, iYz, 2));
                        break;
                    }
                default:
                    ((RQx) ((Rooms2LiveCallLifecycle) iYz.A01).A0C.getValue()).A00();
                    break;
            }
        }
        1Br.A0C(iz0.A09);
        GOp.A0O(iz0.A0B).A04(HAp.A0O);
        if (iz0.A0G.size() == 1) {
            iz0.A01 = 1Br.A01(iz0.A06);
        }
    }
}

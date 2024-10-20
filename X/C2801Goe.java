package X;

import android.content.Intent;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.viewer.MontageViewerActivity;
import com.facebook.user.model.UserKey;

/* renamed from: X.Goe, reason: case insensitive filesystem */
/* loaded from: Goe.class */
public final class C2801Goe extends HGG {
    public boolean A00 = false;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ MontageViewerActivity A02;

    public C2801Goe(Intent intent, MontageViewerActivity montageViewerActivity) {
        this.A02 = montageViewerActivity;
        this.A01 = intent;
    }

    public void A09() {
        if (!this.A00 && this.A01.getBooleanExtra(7zK.A00(ActionId.RTMP_PACKET_RECEIVED), false)) {
            MontageViewerActivity montageViewerActivity = this.A02;
            C2j4 c2j4 = (C2j4) montageViewerActivity.A00.get();
            06Z BDe = montageViewerActivity.BDe();
            if (((1Rv) 1Br.A0B(c2j4.A07)).A0B()) {
                C2j4.A01(c2j4);
            } else {
                c2j4.A00 = new Iq4(c2j4);
                C2j4.A00(BDe);
            }
        }
        this.A02.finish();
    }

    public void A0A(UserKey userKey, String str, java.util.Map map) {
        this.A00 = true;
        MontageViewerActivity montageViewerActivity = this.A02;
        6HS r0 = (6HS) montageViewerActivity.A02.get();
        4iI r02 = (4iI) montageViewerActivity.A01.get();
        11T.A0F(userKey, 0);
        ThreadKey A00 = 4iI.A00(r02, userKey);
        A00.getClass();
        r0.A07(A00, "messenger_montage_viewer");
    }
}

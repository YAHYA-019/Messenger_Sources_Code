package X;

import android.os.Bundle;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;

/* renamed from: X.3Yg, reason: invalid class name */
/* loaded from: 3Yg.class */
public final class C3Yg implements 67O {
    public static final String __redex_internal_original_name = "ComposeFragment$18";
    public final /* synthetic */ 6QS A00;
    public final /* synthetic */ String A01;

    public C3Yg(6QS r302, String str) {
        this.A00 = r302;
        this.A01 = str;
    }

    public void Bml(Object obj) {
        this.A00.A0X = 0S2.A00;
    }

    public void BqY(Object obj) {
        6QS r0 = this.A00;
        C00i c00i = r0.A19;
        2BQ r02 = (2BQ) c00i.get();
        String str = this.A01;
        r02.A01(str);
        if (str.equals("free_messenger_open_camera_interstitial")) {
            ((2BQ) c00i.get()).A01("send_media_file_interstitial");
        }
        r0.A0X = 0S2.A00;
        Bundle bundle = (Bundle) obj;
        6QS.A0O(r0, (C6r6) bundle.get(4YT.A00(1366)), (MontageComposerFragmentParams.Builder) bundle.getParcelable(4YT.A00(1365)));
    }
}

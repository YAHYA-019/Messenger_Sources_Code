package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.media.download.params.SaveMediaParams;
import com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment;
import java.io.IOException;

/* loaded from: Cou.class */
public final class Cou implements AaZ {
    public final /* synthetic */ QrCodeBottomSheetFragment A00;

    public Cou(QrCodeBottomSheetFragment qrCodeBottomSheetFragment) {
        this.A00 = qrCodeBottomSheetFragment;
    }

    public void BpM() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0136, code lost:
    
        r310 = "invite_link_settings";
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CHA() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cou.CHA():void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment, androidx.fragment.app.Fragment] */
    public void CIa() {
        C10y A05;
        ?? r0 = this.A00;
        Uri uri = null;
        try {
            A05 = QrCodeBottomSheetFragment.A05(r0);
        } catch (IOException unused) {
        }
        if (A05 != null) {
            uri = C10n.A00(r0.requireContext(), A05, new 0Tw());
            if (uri != null) {
                6Ro r02 = (6Ro) 1Bi.A03(50098);
                53T A00 = ((53S) 7zO.A0l((Fragment) r0, 49478)).A00(r0.getContext());
                CallerContext callerContext = r0.A0A;
                Context context = r0.getContext();
                String string = r0.requireContext().getString(2131964036);
                String string2 = r0.requireContext().getString(2131964029);
                6Ro.A03(uri, callerContext, r02);
                6Ro.A02(context, callerContext, r02, new SaveMediaParams(uri, 0S2.A00, string2, string, false, false), A00);
                QrCodeBottomSheetFragment.A0G(r0, "save_qr_code");
            }
        }
    }

    public void CIq() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0072, code lost:
    
        if (r306 == null) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment, androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CL9() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment r0 = r0.A00
            r302 = r0
            r0 = r302
            X.10y r0 = com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment.A05(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L9e
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r0 = X.4YU.A0A(r0)
            r304 = r0
            X.0Tw r0 = new X.0Tw
            r305 = r0
            r0 = r305
            r0.<init>()
            r0 = r302
            android.content.Context r0 = r0.requireContext()
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r306
            r1 = r303
            r2 = r305
            android.net.Uri r0 = X.C10n.A00(r0, r1, r2)
            r306 = r0
            r0 = 1
            android.net.Uri[] r0 = new android.net.Uri[r0]
            r1 = r0
            r2 = 0
            r3 = r306
            r1[r2] = r3
            r306 = r0
            r0 = r304
            r1 = r306
            r2 = 0
            X.AnonymousClass106.A01(r0, r1, r2)
            r0 = r304
            java.lang.String r1 = "image/*"
            android.content.Intent r0 = r0.setType(r1)
            r0 = r302
            android.content.Context r0 = r0.getContext()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L75
            r0 = r306
            android.content.res.Resources r0 = r0.getResources()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L75
            r0 = 2131965846(0x7f133796, float:1.9568513E38)
            r308 = r0
            r0 = r307
            r1 = r308
            java.lang.String r0 = r0.getString(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L7a
        L75:
            java.lang.String r0 = ""
            r306 = r0
        L7a:
            r0 = r304
            r1 = r306
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r1)
            r307 = r0
            r0 = r302
            android.content.Context r0 = r0.getContext()
            r1 = r307
            boolean r0 = X.0LS.A0C(r0, r1)
            r0 = 553(0x229, float:7.75E-43)
            r308 = r0
            r0 = r308
            java.lang.String r0 = X.1BJ.A00(r0)
            r306 = r0
            r0 = r302
            r1 = r306
            com.facebook.messaging.qrcode.fragments.bottomsheetfragment.QrCodeBottomSheetFragment.A0G(r0, r1)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cou.CL9():void");
    }
}

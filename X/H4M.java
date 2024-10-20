package X;

import android.content.Context;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.FacebookProgressCircleView;
import java.util.concurrent.Future;

/* loaded from: H4M.class */
public final class H4M extends CustomFrameLayout {
    public 1PA A00;
    public MediaResource A01;
    public FacebookProgressCircleView A02;
    public Future A03;
    public final 1Br A04;
    public final 1Br A05;

    public H4M(Context context) {
        super(context);
        this.A05 = GOn.A0P();
        this.A04 = 1HG.A00(4YU.A08(this), 16598);
        A0U(2132542853);
        this.A02 = (FacebookProgressCircleView) 7zM.A0H(this, 2131362042);
        IgR igR = new IgR(this, 14);
        IgR igR2 = new IgR(this, 15);
        1P9 r0 = new 1P9((1I6) 1Br.A0B(this.A04));
        r0.A05(igR, "com.facebook.orca.media.upload.MEDIA_TRANSCODE_PROGRESS");
        1PA A01 = 1P9.A01(r0, igR2, "com.facebook.orca.media.upload.MEDIA_UPLOAD_PROGRESS");
        this.A00 = A01;
        A01.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (X.11T.A0O(r0.A0E, r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(android.content.Intent r301, X.H4M r302) {
        /*
            r0 = r301
            java.lang.String r1 = "resource"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.facebook.ui.media.attachments.model.MediaResource r0 = (com.facebook.ui.media.attachments.model.MediaResource) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3d
            r0 = r303
            com.facebook.ui.media.attachments.model.MediaResource r0 = r0.A0R
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L3d
            r0 = r302
            com.facebook.ui.media.attachments.model.MediaResource r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3d
            r0 = r303
            android.net.Uri r0 = r0.A0E
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3d
            r0 = r301
            android.net.Uri r0 = r0.A0E
            r303 = r0
            r0 = r303
            r1 = r304
            boolean r0 = X.11T.A0O(r0, r1)
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 != 0) goto L42
        L3d:
            r0 = 0
            r306 = r0
            r0 = 0
            r303 = r0
        L42:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4M.A00(android.content.Intent, X.H4M):boolean");
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(843424270);
        super.onAttachedToWindow();
        1PA r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        0FI.A0C(896278954, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(105367765);
        super.onDetachedFromWindow();
        1PA r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        0FI.A0C(-610927115, A06);
    }
}

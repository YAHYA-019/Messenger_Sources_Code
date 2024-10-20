package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.common.bitmaps.BitmapUtil;
import com.facebook.ui.media.attachments.model.AnimatedMediaPreprocessData;
import com.facebook.ui.media.attachments.source.MediaResourceCameraPosition;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: J45.class */
public final class J45 implements Runnable {
    public static final String __redex_internal_original_name = "MontageMediaDownloader$2$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Uri A03;
    public final /* synthetic */ 2EU A04;
    public final /* synthetic */ Hox A05;
    public final /* synthetic */ AnimatedMediaPreprocessData A06;
    public final /* synthetic */ C5eq A07;
    public final /* synthetic */ String A08;

    public J45(Uri uri, 2EU r303, Hox hox, AnimatedMediaPreprocessData animatedMediaPreprocessData, C5eq c5eq, String str, int i, int i2, int i3) {
        this.A05 = hox;
        this.A03 = uri;
        this.A04 = r303;
        this.A00 = i;
        this.A07 = c5eq;
        this.A08 = str;
        this.A02 = i2;
        this.A01 = i3;
        this.A06 = animatedMediaPreprocessData;
    }

    @Override // java.lang.Runnable
    public void run() {
        2EU r322;
        try {
            Hox hox = this.A05;
            I0C i0c = hox.A01;
            FbUserSession fbUserSession = hox.A00;
            Uri uri = this.A03;
            2EU r0 = this.A04;
            int i = this.A00;
            MediaResourceSendSource A0t = GOq.A0t(i0c.A04, (String) null, i, AnonymousClass001.A1T(r0));
            MediaResourceCameraPosition A00 = 7uO.A00(i);
            C5eq c5eq = this.A07;
            boolean z = hox.A03;
            String str = this.A08;
            int i2 = this.A02;
            int i3 = this.A01;
            AnimatedMediaPreprocessData animatedMediaPreprocessData = this.A06;
            if (r0 != null) {
                Bitmap A0C = 7zL.A0C(r0);
                int i4 = 0;
                if (c5eq == C5eq.CAMERA_CORE && A0C.getHeight() > A0C.getWidth()) {
                    i4 = 270;
                }
                r322 = ((BitmapUtil) i0c.A06.get()).A04(r0, i4);
            } else {
                r322 = null;
            }
            try {
                ListenableFuture A0A = 1Kd.A0A(uri);
                Hz6 hz6 = (Hz6) i0c.A09.get();
                2FT A0t2 = AbJ.A0t(i0c.A07, new Imq(r322, (HnB) 1Lo.A04((Context) null, fbUserSession, hz6.A00, 99907), hz6, animatedMediaPreprocessData, c5eq, A00, A0t, i2, i3, z), A0A);
                C00i c00i = i0c.A08;
                6Ro r02 = (6Ro) c00i.get();
                CallerContext callerContext = i0c.A01;
                Context context = i0c.A00;
                ((6Ro) c00i.get()).A0A(context, 2FP.A00(new In8(context, callerContext, r02, i0c.A05, str), A0t2, 1BK.A1E(r02.A02)), (String) null);
                2EU.A04(r0);
            } finally {
                2EU.A04(r322);
            }
        } catch (Throwable th) {
            2EU.A04(this.A04);
            throw th;
        }
    }
}

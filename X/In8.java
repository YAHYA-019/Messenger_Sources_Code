package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.media.download.params.SaveMediaParams;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: In8.class */
public final class In8 implements 2eF {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CallerContext A01;
    public final /* synthetic */ 6Ro A02;
    public final /* synthetic */ 53U A03;
    public final /* synthetic */ String A04;

    public In8(Context context, CallerContext callerContext, 6Ro r304, 53U r305, String str) {
        this.A02 = r304;
        this.A01 = callerContext;
        this.A00 = context;
        this.A03 = r305;
        this.A04 = str;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        MediaResource mediaResource = (MediaResource) obj;
        if (mediaResource == null) {
            throw AnonymousClass001.A0T("Downloading media failed");
        }
        5HP r0 = 5HP.A0F;
        5HP r02 = mediaResource.A0Q;
        if (r0.equals(r02)) {
            6Ro r03 = this.A02;
            CallerContext callerContext = this.A01;
            Context context = this.A00;
            53U r04 = this.A03;
            Uri uri = mediaResource.A0E;
            Integer num = 0S2.A00;
            11T.A0F(uri, 0);
            return 6Ro.A02(context, callerContext, r03, new SaveMediaParams(uri, num, null, null, false, false), r04);
        }
        if (!5HP.A0H.equals(r02)) {
            throw AnonymousClass001.A0T(AnonymousClass001.A0Z(r02, "Unknown media resource type: ", AnonymousClass001.A0k()));
        }
        boolean A04 = 5HV.A04(mediaResource);
        6Ro r05 = this.A02;
        if (!A04) {
            return r05.A04(mediaResource.A0E, this.A01, this.A04);
        }
        CallerContext callerContext2 = this.A01;
        String str = this.A04;
        1hM r06 = new 1hM(mediaResource);
        Imf imf = new Imf(callerContext2, r05, 0);
        C00i c00i = r05.A02;
        return 2FP.A00(new D3k(r05, callerContext2, str, 1), AbJ.A0t(c00i, imf, r06), 1BK.A1E(c00i));
    }
}

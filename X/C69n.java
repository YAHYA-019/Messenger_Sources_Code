package X;

import android.net.Uri;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.attachments.ImageAttachmentUris;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.ArrayList;

/* renamed from: X.69n, reason: invalid class name */
/* loaded from: 69n.class */
public abstract class C69n {
    public static final 2Dp A00(ImageAttachmentData imageAttachmentData) {
        Uri uri;
        ImageAttachmentUris imageAttachmentUris = imageAttachmentData.A05;
        2Dp r303 = null;
        if (imageAttachmentUris != null && (uri = imageAttachmentUris.A04) != null && imageAttachmentData.A07 != C66a.MP4) {
            2IA A01 = 2IA.A01(uri);
            4YV.A1C(new 2rA(), A01);
            r303 = A01.A04();
        }
        return r303;
    }

    public static final 2Dp[] A01(ImageAttachmentData imageAttachmentData) {
        Uri uri;
        2Dp A00;
        11T.A0F(imageAttachmentData, 0);
        ArrayList arrayList = new ArrayList();
        MediaResource mediaResource = imageAttachmentData.A09;
        if (mediaResource != null) {
            2Dp A002 = 2Dp.A00(mediaResource.A0E);
            if (A002 != null) {
                arrayList.add(A002);
            }
            MediaResource mediaResource2 = mediaResource.A0R;
            if (mediaResource2 != null && (A00 = 2Dp.A00(mediaResource2.A0E)) != null) {
                arrayList.add(A00);
            }
        }
        ImageAttachmentUris imageAttachmentUris = imageAttachmentData.A05;
        if (imageAttachmentUris != null && (uri = imageAttachmentUris.A02) != null && imageAttachmentData.A07 != C66a.MP4) {
            2IA A01 = 2IA.A01(uri);
            4YV.A1C(new 2rA(), A01);
            arrayList.add(A01.A04());
        }
        ImageAttachmentUris imageAttachmentUris2 = imageAttachmentData.A06;
        if (imageAttachmentUris2 != null) {
            arrayList.add(2IA.A01(imageAttachmentUris2.A02).A04());
        }
        return (2Dp[]) arrayList.toArray(new 2Dp[0]);
    }
}

package X;

import android.content.Context;
import com.facebook.messaging.storagemanagement.mediamanager.activity.MediaManagerActivity;
import com.facebook.messaging.storagemanagement.mediamanager.model.MediaItem;

/* renamed from: X.9xk, reason: invalid class name */
/* loaded from: 9xk.class */
public final class C9xk implements AYE {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 8fZ A01;

    public C9xk(Context context, 8fZ r303) {
        this.A01 = r303;
        this.A00 = context;
    }

    public void C69(MediaItem mediaItem) {
        C9a7 c9a7 = this.A01.A01;
        Context context = this.A00;
        11T.A0F(context, 0);
        ((C9aj) 1Br.A0B(c9a7.A0B)).A00("MEDIA_GALLERY_SEE_ALL_CLICK");
        7zT.A12(context, C3o5.A0D(context, MediaManagerActivity.class), c9a7.A08);
    }
}

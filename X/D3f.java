package X;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D3f.class */
public final class D3f implements 2eF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ D54 A01;
    public final /* synthetic */ 5Hv A02;
    public final /* synthetic */ MediaResource A03;

    public D3f(D54 d54, 5Hv r303, MediaResource mediaResource, long j) {
        this.A02 = r303;
        this.A03 = mediaResource;
        this.A01 = d54;
        this.A00 = j;
    }

    public /* bridge */ /* synthetic */ ListenableFuture A8b(Object obj) {
        String str;
        Uri uri = (Uri) obj;
        5Hv r0 = this.A02;
        5HZ r02 = r0.A0I;
        MediaResource mediaResource = this.A03;
        MediaResource A01 = r02.A01(mediaResource);
        if (uri != null) {
            C5en A00 = C5en.A00();
            A00.A01(A01);
            A00.A0E = uri;
            A00.A0q = AnonymousClass000.A00(2);
            A01 = 4YU.A0Y(A00);
        }
        D54 d54 = this.A01;
        long j = this.A00;
        r02.A08(r0.A04, mediaResource, 0S2.A0N);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("mediaResource", A01);
        A05.putLong("attempt_id", j);
        A05.putSerializable("resumableUploadConfig", d54);
        if (mediaResource.A0Q == 5HP.A0F) {
            boolean z = r02.A03;
            str = z ? GOm.A00(10) : 1BJ.A00(1917);
            r02.A03 = !z;
        } else {
            str = "media_upload";
        }
        ListenableFuture A002 = 5Hv.A00(A05, r0, mediaResource, str);
        if (uri != null) {
            A002 = 4YV.A0b(r0.A07, new D3j(1, r02, uri, mediaResource.A0J), A002);
        }
        return A002;
    }
}

package X;

import android.content.Intent;
import android.net.Uri;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.Set;

/* loaded from: Fje.class */
public final class Fje implements JNG {
    public final /* synthetic */ E96 A00;

    public Fje(E96 e96) {
        this.A00 = e96;
    }

    public void AHS(JKS jks, String[] strArr) {
    }

    public void BhC() {
    }

    public void BmZ() {
    }

    public void BxC(Intent intent) {
    }

    public void BzM() {
    }

    public void BzN() {
    }

    public void C2k(MediaResource mediaResource) {
        if (mediaResource != null) {
            String valueOf = String.valueOf(mediaResource.A09);
            Uri uri = mediaResource.A0D;
            String path = uri != null ? uri.getPath() : null;
            Uri uri2 = mediaResource.A0E;
            11T.A09(uri2);
            9cW r0 = new 9cW(uri2, valueOf, path);
            E96 e96 = this.A00;
            Set set = e96.A03;
            if (set.contains(r0)) {
                set.remove(r0);
            } else if (set.size() < e96.A00) {
                set.add(r0);
            }
            Egs egs = e96.A02;
            if (egs != null) {
                egs.A00.A04(GBr.A01(0QD.A0V(set), 24));
            }
        }
    }

    public /* bridge */ /* synthetic */ void C6G(Boolean bool) {
    }

    public void C6H(Boolean bool) {
    }

    public void CFa(MediaResource mediaResource, String str) {
    }

    public void CKH(boolean z) {
    }

    public void CLe(Hio hio, MediaResource mediaResource) {
    }

    public void CPy() {
    }
}

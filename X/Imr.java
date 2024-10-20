package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.attachments.source.MediaResourceCameraPosition;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.google.common.base.Function;
import java.io.File;

/* loaded from: Imr.class */
public final class Imr implements Function {
    public 2EU A00;
    public final HnB A01;
    public final ThreadKey A02;
    public final C5eq A03;
    public final 5HP A04;
    public final MediaResourceCameraPosition A05;
    public final MediaResourceSendSource A06;
    public final String A07;
    public final boolean A08;
    public final /* synthetic */ Hz6 A09;

    public Imr(2EU r302, HnB hnB, Hz6 hz6, ThreadKey threadKey, C5eq c5eq, 5HP r307, MediaResourceCameraPosition mediaResourceCameraPosition, MediaResourceSendSource mediaResourceSendSource, String str, boolean z) {
        this.A09 = hz6;
        this.A00 = r302 == null ? null : r302.A07();
        this.A03 = c5eq;
        this.A04 = r307;
        this.A07 = str;
        this.A06 = mediaResourceSendSource;
        this.A05 = mediaResourceCameraPosition;
        this.A08 = z;
        this.A02 = threadKey;
        this.A01 = hnB;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        MediaResource mediaResource = (MediaResource) obj;
        boolean z = false;
        Uri uri = null;
        if (this.A00 != null) {
            File A00 = this.A01.A00("orca-overlay-", ".png");
            try {
                try {
                    2EU r0 = this.A00;
                    IDI.A02(Bitmap.CompressFormat.PNG, r0 == null ? null : 7zL.A0C(r0), A00, 0);
                    2EU r02 = this.A00;
                    if (r02 != null) {
                        r02.close();
                        this.A00 = null;
                    }
                    uri = Uri.fromFile(A00);
                } catch (HD3 e) {
                    throw AnonymousClass001.A0U(e);
                }
            } catch (Throwable th) {
                2EU r03 = this.A00;
                if (r03 != null) {
                    r03.close();
                    this.A00 = null;
                }
                throw th;
            }
        }
        C5eq c5eq = this.A03;
        if (c5eq == C5eq.QUICK_CAM && this.A05.A00 == C5ev.FRONT_FACING) {
            z = true;
        }
        RectF rectF = MediaResource.A18;
        C5en A0p = AbI.A0p(mediaResource);
        A0p.A0C = uri;
        A0p.A0P = this.A04;
        A0p.A0V = this.A06;
        A0p.A0U = this.A05;
        A0p.A0M = c5eq;
        A0p.A0h = this.A07;
        A0p.A0z = this.A08;
        A0p.A0y = z;
        A0p.A0J = this.A02;
        this.A09.A03.A0B(A0p);
        return 4YU.A0Y(A0p);
    }
}

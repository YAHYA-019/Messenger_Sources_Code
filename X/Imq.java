package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.ui.media.attachments.model.AnimatedMediaPreprocessData;
import com.facebook.ui.media.attachments.source.MediaResourceCameraPosition;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.google.common.base.Function;
import java.io.File;

/* loaded from: Imq.class */
public final class Imq implements Function {
    public 2EU A00;
    public final int A01;
    public final int A02;
    public final HnB A03;
    public final AnimatedMediaPreprocessData A04;
    public final C5eq A05;
    public final MediaResourceCameraPosition A06;
    public final MediaResourceSendSource A07;
    public final boolean A08;
    public final /* synthetic */ Hz6 A09;

    public Imq(2EU r302, HnB hnB, Hz6 hz6, AnimatedMediaPreprocessData animatedMediaPreprocessData, C5eq c5eq, MediaResourceCameraPosition mediaResourceCameraPosition, MediaResourceSendSource mediaResourceSendSource, int i, int i2, boolean z) {
        this.A09 = hz6;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = r302 != null ? r302.A07() : null;
        this.A05 = c5eq;
        this.A07 = mediaResourceSendSource;
        this.A06 = mediaResourceCameraPosition;
        this.A08 = z;
        this.A04 = animatedMediaPreprocessData;
        this.A03 = hnB;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        Uri uri = (Uri) obj;
        boolean z = false;
        Uri uri2 = null;
        if (this.A00 != null) {
            File A00 = this.A03.A00("orca-overlay-", ".png");
            try {
                try {
                    IDI.A02(Bitmap.CompressFormat.PNG, 7zL.A0C(this.A00), A00, 0);
                    uri2 = Uri.fromFile(A00);
                } catch (HD3 e) {
                    throw AnonymousClass001.A0U(e);
                }
            } finally {
                2EU r0 = this.A00;
                if (r0 != null) {
                    r0.close();
                    this.A00 = null;
                }
            }
        }
        C5eq c5eq = this.A05;
        if (c5eq == C5eq.QUICK_CAM && this.A06.A00 == C5ev.FRONT_FACING) {
            z = true;
        }
        C5en A002 = C5en.A00();
        A002.A0E = uri;
        A002.A02 = this.A02;
        A002.A01 = this.A01;
        A002.A0C = uri2;
        A002.A0P = 5HP.A0H;
        A002.A0V = this.A07;
        A002.A0U = this.A06;
        A002.A0M = c5eq;
        A002.A0h = null;
        A002.A16 = true;
        A002.A0L = this.A04;
        A002.A0z = this.A08;
        A002.A0y = z;
        A002.A0J = null;
        this.A09.A03.A0B(A002);
        return 4YU.A0Y(A002);
    }
}

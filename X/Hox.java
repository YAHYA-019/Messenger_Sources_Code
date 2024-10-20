package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.util.colors.MontageBackgroundColor;
import com.facebook.ui.media.attachments.model.AnimatedMediaPreprocessData;
import java.util.concurrent.Executor;

/* loaded from: Hox.class */
public final class Hox {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ I0C A01;
    public final /* synthetic */ MontageBackgroundColor A02;
    public final /* synthetic */ boolean A03;

    public Hox(FbUserSession fbUserSession, I0C i0c, MontageBackgroundColor montageBackgroundColor, boolean z) {
        this.A01 = i0c;
        this.A02 = montageBackgroundColor;
        this.A03 = z;
        this.A00 = fbUserSession;
    }

    public void A00(Uri uri, 2EU r303, AnimatedMediaPreprocessData animatedMediaPreprocessData, C5eq c5eq, int i, int i2, int i3) {
        if (this.A02 != null) {
            I0C.A00(this.A01);
        }
        Bitmap bitmap = null;
        2EU A07 = r303 == null ? null : r303.A07();
        String A15 = 4YU.A15(uri);
        if (r303 != null) {
            bitmap = 7zL.A0C(A07);
        }
        boolean z = this.A03;
        StringBuilder A0o = AnonymousClass001.A0o(A15);
        if (bitmap != null) {
            int A00 = HIG.A00(bitmap);
            A0o.append("_edit");
            A0o.append(String.valueOf(A00));
        }
        if (z) {
            A0o.append("_muted");
        }
        ((Executor) this.A01.A07.get()).execute(new J45(uri, A07, this, animatedMediaPreprocessData, c5eq, 11T.A02(A0o), i, i2, i3));
    }
}

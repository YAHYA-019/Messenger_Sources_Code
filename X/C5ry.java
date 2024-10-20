package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import java.io.File;
import java.io.IOException;

/* renamed from: X.5ry, reason: invalid class name */
/* loaded from: 5ry.class */
public final class C5ry {
    public final 1Br A03 = 1Bq.A00(49797);
    public final 1Br A05 = 1Bq.A00(83564);
    public final 1Br A01 = 1Bq.A00(116076);
    public final 1Br A04 = 1Bq.A00(66934);
    public final 1Br A00 = 1Bq.A00(66481);
    public final 1Br A02 = 1Bq.A00(16457);

    public static final Uri A00(Context context, C5ry c5ry, File file) {
        try {
            1Br.A0C(c5ry.A05);
            11I r0 = new 11I();
            r0.A04 = file;
            return C10n.A00(context, r0.A08(), new 0SI());
        } catch (IOException e) {
            0fH.A0s("MediaPreviewLoader", AnonymousClass001.A0Z(file, "error when retrieving uri for file: ", AnonymousClass001.A0k()), e);
            return null;
        }
    }

    public static final File A01(FbUserSession fbUserSession, Message message, C5ry c5ry) {
        String str = message.A1V;
        if (str == null) {
            throw AnonymousClass001.A0L("Message id can't be null for notification media previews");
        }
        C00i c00i = c5ry.A01.A00;
        Uri A01 = ((5sO) c00i.get()).A01(message);
        if (A01 == null) {
            return null;
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(A01.toString());
        11T.A0D(fileExtensionFromUrl);
        if (fileExtensionFromUrl.length() == 0) {
            0fH.A0k("MediaPreviewLoader", "Unable to retrieve extension from file");
            C5s1 A02 = ((5sO) c00i.get()).A02(message);
            if (A02 == null) {
                0fH.A0k("MediaPreviewLoader", "Unable to retrieve extension from message attachment mime");
                return null;
            }
            fileExtensionFromUrl = A02.A04;
        }
        return ((C3RB) ((HnB) 1Lm.A06(fbUserSession, 99907)).A01.get()).A01(0Pz.A0j("notif_", str, 0Pz.A0K(fileExtensionFromUrl, '.')), 594169501);
    }
}

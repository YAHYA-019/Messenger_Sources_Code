package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.tincan.attachments.utils.MsysTincanVideoThumbnailHelper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.io.File;

/* renamed from: X.3Qq, reason: invalid class name */
/* loaded from: 3Qq.class */
public final class C3Qq {
    public File A00;
    public final Context A01;
    public final C00i A02 = 1BV.A00(99908);

    public C3Qq() {
        Context A00 = FbInjector.A00();
        1MC r0 = (1MC) 1Bi.A03(98404);
        this.A01 = A00;
        this.A00 = r0.BKr(1409070501);
    }

    public static final C3Qq A00() {
        return new C3Qq();
    }

    public void A01(FbUserSession fbUserSession, ImmutableSet immutableSet) {
        1Du it = immutableSet.iterator();
        while (it.hasNext()) {
            Message message = (Message) it.next();
            ImmutableList immutableList = message.A0r;
            if (immutableList != null && !immutableList.isEmpty()) {
                1Du it2 = immutableList.iterator();
                while (it2.hasNext()) {
                    AnonymousClass001.A0D(this.A00, 0Pz.A0j(message.A1V, "_", ((Attachment) it2.next()).A0F)).delete();
                }
            }
            File A0D = AnonymousClass001.A0D(MsysTincanVideoThumbnailHelper.A01(fbUserSession, (MsysTincanVideoThumbnailHelper) this.A02.get()), 0Pz.A0j("THUMBNAIL_", message.A1V, ".jpg"));
            if (A0D.exists() && !A0D.delete()) {
                0fH.A0g(A0D, "com.facebook.messaging.tincan.attachments.utils.MsysTincanVideoThumbnailHelper", "Failed to delete %s");
            }
        }
    }
}

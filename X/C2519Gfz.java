package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.attachment.image.ThreadViewImageAttachmentView;

/* renamed from: X.Gfz, reason: case insensitive filesystem */
/* loaded from: Gfz.class */
public final class C2519Gfz extends 4gL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C2519Gfz(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Bxg(String str, Throwable th) {
        2Dp r0;
        Uri uri;
        switch (this.A00) {
            case 0:
                DgG dgG = (DgG) this.A01;
                CallerContext callerContext = DgG.A02;
                dgG.A01.softReport("FigBottomSheetMenuItemWithUriIcon", th);
                return;
            case 1:
                IUS ius = (IUS) this.A01;
                CallerContext callerContext2 = IUS.A08;
                ius.A06.BrD(th);
                return;
            default:
                ThreadViewImageAttachmentView threadViewImageAttachmentView = (ThreadViewImageAttachmentView) this.A01;
                CallerContext callerContext3 = ThreadViewImageAttachmentView.A0S;
                if (threadViewImageAttachmentView.A0Q.A02(threadViewImageAttachmentView.A0D)) {
                    return;
                }
                Message message = threadViewImageAttachmentView.A0D;
                if (message == null || !ThreadKey.A0q(message.A0V)) {
                    Hbj hbj = (Hbj) this.A02;
                    if (hbj.A01.isEmpty() || (r0 = (2Dp) 1BK.A0r(hbj.A01)) == null || (uri = r0.A05) == null) {
                        return;
                    }
                    uri.toString();
                    return;
                }
                return;
        }
    }

    public /* bridge */ /* synthetic */ void Byc(Animatable animatable, Object obj, String str) {
        switch (this.A00) {
            case 0:
                ((FXN) this.A01).A03((Drawable) this.A02);
                return;
            case 1:
                2Ec r0 = (2Ec) obj;
                IUS ius = (IUS) this.A01;
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                CallerContext callerContext = IUS.A08;
                if (r0 != null) {
                    float width = r0.getWidth() / r0.getHeight();
                    F8c f8c = (F8c) ius.A07.get();
                    5YB r02 = ius.A01;
                    int i = f8c.A01(GOn.A0H(r02), fbUserSession, ius.A02, ius.A00).A05;
                    r02.A04(width);
                    r02.setY(i);
                }
                ius.A06.BrJ();
                return;
            default:
                if (animatable != null) {
                    animatable.start();
                    return;
                }
                return;
        }
    }
}

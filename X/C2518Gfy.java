package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.lang.ref.SoftReference;
import java.util.List;

/* renamed from: X.Gfy, reason: case insensitive filesystem */
/* loaded from: Gfy.class */
public final class C2518Gfy extends 4gL {
    public final /* synthetic */ IPn A00;

    public C2518Gfy(IPn iPn) {
        this.A00 = iPn;
    }

    public void Bxg(String str, Throwable th) {
        IPn iPn = this.A00;
        iPn.A0L.A03();
        iPn.A0F.setVisibility(4);
    }

    public /* bridge */ /* synthetic */ void Byc(Animatable animatable, Object obj, String str) {
        MediaResource mediaResource;
        MediaResource mediaResource2;
        JMe jMe;
        IPn iPn = this.A00;
        CallerContext callerContext = IPn.A0O;
        HRr hRr = iPn.A02;
        if (hRr != null) {
            GXo gXo = hRr.A00;
            List list = C2lb.A0J;
            HRw hRw = gXo.A00;
            if (hRw != null && (jMe = hRw.A00.A03) != null) {
                jMe.Bya();
            }
        }
        if (iPn.A07) {
            SoftReference softReference = iPn.A05;
            boolean z = false;
            if (((softReference == null || softReference.get() == null) ? false : !((Bitmap) softReference.get()).isRecycled()) && (((mediaResource2 = iPn.A03) == null || mediaResource2.A0Q != 5HP.A0H) && ((Bitmap) iPn.A05.get()).getHeight() / ((Bitmap) iPn.A05.get()).getWidth() >= 1.3333334f)) {
                z = true;
            }
            FbDraweeView fbDraweeView = iPn.A0F;
            if (z) {
                fbDraweeView.A0M(InterfaceC07034in.A01);
                return;
            }
            fbDraweeView.A0M(InterfaceC07034in.A04);
        }
        if (!iPn.A08 || (mediaResource = iPn.A03) == null) {
            return;
        }
        if (mediaResource.A0Q != 5HP.A0F) {
            iPn.A0A = null;
            AbH.A1K(iPn.A0F, 251658240);
            return;
        }
        SoftReference softReference2 = iPn.A05;
        if (softReference2 == null || softReference2.get() == null || !(!((Bitmap) softReference2.get()).isRecycled())) {
            return;
        }
        try {
            2EU A01 = 2DX.A01((Bitmap) iPn.A05.get(), iPn.A0G);
            iPn.A0M.add(A01.toString());
            ((I89) iPn.A0N.get()).A02(A01, new IT9(A01, iPn), A01.toString(), -8355712, false);
        } catch (J6r | IllegalArgumentException | OutOfMemoryError e) {
            0fH.A0p("ThumbnailViewController", "createBitmap ", e);
        }
    }
}

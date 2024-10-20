package X;

import android.content.Context;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.montage.composer.cameracore.view.CompositeCapturePreviewView;
import java.lang.ref.WeakReference;

/* loaded from: I0M.class */
public final class I0M {
    public 2EU A00;
    public AbstractC2788Go5 A01;
    public AbstractC2788Go5 A02;
    public boolean A03;
    public final JPq A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final I4U A0A;
    public final HTO A0B;
    public final String A0C;
    public final WeakReference A0D;

    public I0M(Context context, JPq jPq, I4U i4u, HTO hto, String str) {
        11T.A0F(jPq, 3);
        this.A0C = str;
        this.A04 = jPq;
        this.A0A = i4u;
        this.A0B = hto;
        this.A07 = 1Bu.A01(context, 115056);
        this.A05 = 1Bq.A00(16477);
        this.A09 = 7zM.A0P();
        this.A06 = 1Bq.A00(65630);
        this.A08 = 1Bq.A00(68523);
        this.A0D = 7zL.A14(context);
    }

    public static final void A00(I0M i0m) {
        HSk hSk;
        GnK gnK;
        I9K i9k;
        i0m.A03 = false;
        i0m.A01 = null;
        i0m.A02 = null;
        2EU r0 = i0m.A00;
        if (r0 != null) {
            r0.close();
            i0m.A00 = null;
        }
        ICU icu = i0m.A0B.A00;
        H4T h4t = icu.A0W;
        2Wo r02 = h4t.A0B;
        if (r02.A00 != null) {
            ((ImageView) ((CompositeCapturePreviewView) r02.A01()).A00.A03).setImageBitmap(null);
        }
        if (h4t.A00 == 1) {
            h4t.A0W(0);
        }
        HSl hSl = icu.A03;
        if (hSl == null || (hSk = hSl.A00.A00) == null || (i9k = (gnK = hSk.A00).A02) == null) {
            return;
        }
        IQ1 iq1 = i9k.A00;
        CallerContext callerContext = IQ1.A1m;
        iq1.A1Q.Cur(false);
        gnK.A0A.A01(true);
    }
}

package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import java.lang.ref.WeakReference;

/* loaded from: Hub.class */
public abstract class Hub {
    public float A00;
    public Context A01;
    public View.OnAttachStateChangeListener A02;
    public String A03;
    public String A04;
    public boolean A05;
    public WeakReference A06;

    public static void A01(View view) {
        if (view.getTag(2131364009) instanceof Hub) {
            ((Hub) view.getTag(2131364009)).A02();
        }
        view.setTag(2131364009, null);
    }

    public void A02() {
        View A0G = DKC.A0G(this.A06);
        if (A0G != null) {
            A0G.removeOnAttachStateChangeListener(this.A02);
        }
    }

    public void A03(Drawable drawable) {
        0RZ.A04(AnonymousClass001.A1W(Looper.myLooper(), Looper.getMainLooper()));
        ImageView imageView = (ImageView) this.A06.get();
        if (imageView == null || !equals(imageView.getTag(2131364009))) {
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    public final void A04(ImageView imageView) {
        0RZ.A04(AnonymousClass001.A1W(Looper.myLooper(), Looper.getMainLooper()));
        this.A06 = 7zL.A14(imageView);
        A01(imageView);
        imageView.setTag(2131364009, this);
        imageView.addOnAttachStateChangeListener(this.A02);
        A03(null);
        H72 h72 = (H72) this;
        2Dp A01 = 2Dp.A01(h72.A04);
        A01.getClass();
        2Ff A0B = 2Cb.A01().A0B();
        String str = h72.A03;
        1OV A07 = A0B.A07((2IE) null, C2r8.BITMAP_MEMORY_CACHE, A01, CallerContext.A0B(str), (String) null);
        h72.A00 = A07;
        2EU r0 = (2EU) A07.B7p();
        if (r0 != null) {
            H72.A00(r0, h72);
            h72.A00.AGD();
        } else {
            1OW A0A = A0B.A0A(A01, CallerContext.A0B(str));
            h72.A00 = A0A;
            A0A.D3K(new C2506Gfm(h72, 1), 1BK.A1E(h72.A01));
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Hub) {
            return this.A04.equals(((Hub) obj).A04);
        }
        return false;
    }

    public int hashCode() {
        return 589 + this.A04.hashCode();
    }
}

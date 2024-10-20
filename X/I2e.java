package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.FrameLayout;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;

/* loaded from: I2e.class */
public final class I2e {
    public FrameLayout A00;
    public IO7 A01;
    public JE9 A02;
    public Ida A03;
    public boolean A04;
    public final Context A05;
    public final HZV A06;
    public final AESelfieCaptureConfig A07;
    public final RWB A08;

    public I2e(Context context, HZV hzv, RWB rwb, AESelfieCaptureConfig aESelfieCaptureConfig) {
        1BK.A1K(hzv, 3, rwb);
        this.A05 = context;
        this.A07 = aESelfieCaptureConfig;
        this.A06 = hzv;
        this.A08 = rwb;
    }

    public static final Activity A00(Context context, I2e i2e) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        11T.A0A(baseContext);
        return A00(baseContext, i2e);
    }

    public final void A01() {
        Ida ida = this.A03;
        if (ida != null) {
            ida.pause();
        }
        Activity A00 = A00(this.A05, this);
        2Zs r0 = 2aN.A00;
        7zO.A1W(A00, 2aG.A02(4ZJ.A00), 33);
    }
}

package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import androidx.lifecycle.LifecycleObserver;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: H5t.class */
public final class H5t extends 48A implements LifecycleObserver {
    public 5HO A00;
    public MediaResource A01;
    public final ProgressBar A02;
    public final 1PA A03;
    public final 1I7 A04;

    /* JADX WARN: Multi-variable type inference failed */
    public H5t(Context context) {
        super(context);
        1I6 r0 = (1I7) 1Hv.A02(context, 65728);
        this.A04 = r0;
        setContentView(2132543558);
        this.A02 = (ProgressBar) C09s.A01(this, 2131366701);
        IgR igR = new IgR(this, 25);
        IgR igR2 = new IgR(this, 24);
        1P9 r02 = new 1P9(r0);
        r02.A05(igR, "com.facebook.orca.media.upload.PROCESS_MEDIA_TOTAL_PROGRESS");
        this.A03 = 1P9.A01(r02, igR2, 4YT.A00(61));
    }

    public final boolean A00() {
        5HO r0 = this.A00;
        if (r0 != null) {
            return AnonymousClass001.A1W(r0.BCH(this.A01).A03, 0S2.A0N);
        }
        throw 1BK.A0h();
    }

    public final void onLifecyclePause() {
        this.A02.setProgress(0);
        1PA r0 = this.A03;
        if (r0.A03()) {
            r0.A01();
        }
    }

    public final void onLifecycleResume() {
        int i = 0;
        if (!A00()) {
            1PA r0 = this.A03;
            if (!r0.A03()) {
                r0.A00();
            }
            MediaResource mediaResource = this.A01;
            5HO r02 = this.A00;
            i = (int) Math.min(100.0d, (r02 != null ? r02.B58(mediaResource) : 0.0d) * 100.0d);
        }
        this.A02.setProgress(i);
    }

    public final void setColor(int i) {
        Drawable progressDrawable = this.A02.getProgressDrawable();
        if (progressDrawable == null) {
            throw 1BK.A0h();
        }
        progressDrawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}

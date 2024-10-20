package X;

import android.view.View;
import com.facebook.messaging.montage.util.colors.MontageBackgroundColor;

/* loaded from: I7a.class */
public final class I7a {
    public int A00;
    public 2EU A01;
    public MontageBackgroundColor A02;
    public Boolean A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final View A07;

    public I7a(int i, int i2) {
        this.A03 = 1BK.A0d();
        this.A01 = null;
        this.A07 = null;
        this.A06 = i;
        this.A05 = i2;
    }

    public I7a(2EU r302) {
        this.A03 = false;
        r302.getClass();
        this.A01 = r302.A07();
        this.A07 = null;
        this.A06 = 0;
        this.A05 = 0;
    }

    public I7a(View view) {
        this.A03 = false;
        this.A01 = null;
        view.getClass();
        this.A07 = view;
        this.A06 = 0;
        this.A05 = 0;
    }
}

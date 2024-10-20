package X;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import com.facebook.widget.titlebar.TitleBarButtonSpec;

/* loaded from: F6h.class */
public final class F6h {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public View A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09 = true;

    public static F6h A00() {
        Parcelable.Creator creator = TitleBarButtonSpec.CREATOR;
        F6h f6h = new F6h();
        f6h.A00 = 2;
        f6h.A09 = false;
        return f6h;
    }
}

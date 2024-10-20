package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

/* loaded from: Epa.class */
public final class Epa {
    public int A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final TextView A05;

    public Epa(View view, View view2, View view3, View view4, TextView textView) {
        this.A04 = view4;
        this.A01 = view2;
        this.A02 = view;
        this.A05 = textView;
        this.A03 = view3;
        Resources resources = view4.getResources();
        float dimension = (resources.getDisplayMetrics().widthPixels - (resources.getDimension(2132279320) * 2.0f)) / 1.91f;
        float dimension2 = resources.getDimension(2132279387);
        this.A00 = (int) Math.floor(dimension + dimension2 + resources.getDimension(2132279387));
    }
}

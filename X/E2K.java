package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.maps.FbStaticMapView;

/* loaded from: E2K.class */
public final class E2K extends EeO {
    public final TextView A00;
    public final TextView A01;
    public final FbStaticMapView A02;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, com.facebook.maps.FbStaticMapView] */
    public E2K(View view) {
        super(view);
        View view2 = ((EeO) this).A00;
        ?? r0 = (FbStaticMapView) C09s.A01(view2, 2131365336);
        this.A02 = r0;
        r0.setVisibility(0);
        this.A01 = AbG.A09(view2, 2131365340);
        this.A00 = AbG.A09(view2, 2131365332);
    }
}

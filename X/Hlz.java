package X;

import android.widget.TextView;
import com.facebook.messaging.location.picker.NearbyPlacesView;
import com.google.common.base.Platform;

/* loaded from: Hlz.class */
public final class Hlz {
    public final /* synthetic */ AbstractC2385Gbm A00;

    public Hlz(AbstractC2385Gbm abstractC2385Gbm) {
        this.A00 = abstractC2385Gbm;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Gbm, androidx.fragment.app.Fragment] */
    public void A00(String str) {
        ?? r0 = this.A00;
        NearbyPlacesView nearbyPlacesView = r0.A06;
        int i = 2131955142;
        if (Platform.stringIsNullOrEmpty(str)) {
            i = 2131955143;
        }
        String string = r0.getString(i);
        nearbyPlacesView.A01.setVisibility(8);
        nearbyPlacesView.A00.setVisibility(8);
        TextView textView = (TextView) nearbyPlacesView.A06.A01();
        textView.setVisibility(0);
        textView.setText(string);
    }
}

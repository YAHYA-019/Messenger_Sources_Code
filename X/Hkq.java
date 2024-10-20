package X;

import android.os.Bundle;
import com.facebook.android.maps.model.LatLng;
import com.facebook.location.platform.api.Location;
import java.util.Arrays;

/* loaded from: Hkq.class */
public final class Hkq {
    public final Bundle A00(String str, String str2, String str3, double d, double d2) {
        Bundle A05 = 1BK.A05();
        if (str == null) {
            str = "";
        }
        A05.putString("title", str);
        A05.putString("description", str2);
        A05.putDouble(Location.LATITUDE, d);
        A05.putDouble("longitude", d2);
        A05.putString("placeId", str3);
        A05.putParcelableArrayList("coordinates", 1BK.A17(Arrays.asList(new LatLng(d, d2))));
        return A05;
    }
}

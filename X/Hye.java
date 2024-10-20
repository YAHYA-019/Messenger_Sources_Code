package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hye.class */
public final class Hye {
    public final int A00;
    public final ImmutableList A01;
    public final Integer A02;

    public Hye(Integer num, List list, int i) {
        this.A01 = ImmutableList.copyOf((Collection) list);
        this.A00 = i;
        this.A02 = num;
    }

    public static C03353xs A00(List list) {
        String str;
        C26T c26t = C26T.A00;
        C03353xs c03353xs = new C03353xs(c26t);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Hye hye = (Hye) it.next();
            2DM A0g = 4YU.A0g(c26t);
            C03353xs c03353xs2 = new C03353xs(c26t);
            1Du it2 = hye.A01.iterator();
            while (it2.hasNext()) {
                c03353xs2.A0e(((HBC) it2.next()).jsonValue);
            }
            A0g.A0e(c03353xs2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            int i = hye.A00;
            if (i >= 0) {
                A0g.A0i(Property.ICON_TEXT_FIT_HEIGHT, i);
            }
            Integer num = hye.A02;
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        str = "PREVIEW";
                        break;
                    case 2:
                        str = "FULL";
                        break;
                    default:
                        str = "STILL";
                        break;
                }
                A0g.A0o(4YT.A00(ActionId.RTMP_PACKET_RECEIVED), str);
            }
            c03353xs.A0d(A0g);
        }
        return c03353xs;
    }
}

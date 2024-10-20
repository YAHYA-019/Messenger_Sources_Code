package X;

import android.webkit.CookieManager;
import com.facebookpay.offsite.models.message.StartCheckoutRequest;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: G4i.class */
public final class G4i implements Runnable {
    public static final String __redex_internal_original_name = "IAWOffsiteMessageHandler$startCheckout$1";
    public final /* synthetic */ EEq A00;
    public final /* synthetic */ StartCheckoutRequest A01;
    public final /* synthetic */ 0CL A02;

    public G4i(EEq eEq, StartCheckoutRequest startCheckoutRequest, 0CL r304) {
        this.A01 = startCheckoutRequest;
        this.A02 = r304;
        this.A00 = eEq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List A0L;
        StartCheckoutRequest startCheckoutRequest = this.A01;
        List list = startCheckoutRequest.content.cookieNames;
        if (list != null && !list.isEmpty()) {
            0CL r0 = this.A02;
            List list2 = startCheckoutRequest.content.cookieNames;
            AbstractC3252Jnp A0U = this.A00.A00.A0U();
            String A08 = A0U != null ? A0U.A08() : null;
            ArrayList arrayList = null;
            if (A08 != null) {
                String A00 = R47.A00(A08);
                Pattern pattern = L9d.A01;
                KVn.A00();
                String cookie = CookieManager.getInstance().getCookie(A00);
                if (cookie != null && (A0L = 0CU.A0L(cookie, new char[]{';'}, 0)) != null) {
                    ArrayList A0z = 1BL.A0z(A0L);
                    Iterator it = A0L.iterator();
                    while (it.hasNext()) {
                        1BK.A1N(0CU.A06(AnonymousClass001.A0i(it)), A0z);
                    }
                    arrayList = AnonymousClass001.A0s();
                    for (Object obj : A0z) {
                        String str = (String) obj;
                        String A13 = 4YU.A13(0CU.A0E(str, str, '='));
                        if (list2 != null) {
                            if (!list2.contains(A13)) {
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (new C04t(AnonymousClass001.A0i(it2)).A08(A13)) {
                                        }
                                    }
                                }
                            }
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            r0.element = arrayList;
        }
        0CL r02 = this.A02;
        if (r02.element != null) {
            new Gson().A06(r02.element);
        }
    }
}

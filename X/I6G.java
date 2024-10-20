package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.Window;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: I6G.class */
public abstract class I6G {
    public static String A00(ArrayList arrayList) {
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Qpq qpq = (Qpq) it.next();
            if (A0k.length() > 0) {
                A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            A0k.append(qpq.shortName);
        }
        return A0k.toString();
    }

    public static void A01(Context context) {
        Window window;
        if (context != null) {
            while (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity == null || (window = activity.getWindow()) == null) {
                        return;
                    }
                    window.clearFlags(8192);
                    return;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
    }

    public static boolean A02(Context context, ArrayList arrayList) {
        Qpq qpq;
        if (context != null) {
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        Window window = activity.getWindow();
                        if (window != null) {
                            activity.runOnUiThread(new S9O(window));
                            return true;
                        }
                        qpq = Qpq.A02;
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
        }
        qpq = Qpq.A01;
        arrayList.add(qpq);
        return false;
    }
}

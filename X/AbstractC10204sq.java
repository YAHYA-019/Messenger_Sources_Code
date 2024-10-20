package X;

import com.facebook.mobileconfig.MobileConfigCxxLogger;
import com.facebook.proxygen.TraceFieldType;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4sq.class */
public abstract class AbstractC10204sq {
    public static MobileConfigCxxLogger A00;
    public static final Set A01 = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void A00(final String str, final String str2) {
        final String str3 = "DiskCorruptionError";
        if (A00 != null) {
            Set set = A01;
            if (set.contains("DiskCorruptionError")) {
                return;
            }
            set.add("DiskCorruptionError");
            if (A00 != null) {
                HashMap hashMap = new HashMap(str3, str, str2) { // from class: X.3k4
                    public final /* synthetic */ String val$codeLocation;
                    public final /* synthetic */ String val$errorName;
                    public final /* synthetic */ String val$humanReadableErrorMessage;

                    {
                        this.val$errorName = str3;
                        this.val$codeLocation = str;
                        this.val$humanReadableErrorMessage = str2;
                        put("err_name", str3);
                        put(TraceFieldType.CallPath, str);
                        put("err_message", str2);
                    }
                };
                A00.logEvent(AbstractC00603o4.A00(70), hashMap);
                0fH.A0l("FBMobileConfigTableOptimized", str2);
            }
        }
    }
}

package X;

import android.app.Application;
import java.util.List;

/* renamed from: X.0o0, reason: invalid class name */
/* loaded from: 0o0.class */
public final class C0o0 {
    public List A00 = AnonymousClass001.A0s();
    public final Application A01;

    public C0o0(Application application) {
        this.A01 = application;
    }

    public void A00(0hZ r302, Integer num) {
        String str;
        switch (num.intValue()) {
            case 0:
                str = "STARTUP";
                break;
            case 1:
                str = "LIFECYCLE";
                break;
            case 2:
                str = "JAVA_DETECT";
                break;
            case 3:
                str = "JAVA_APP_DEATH";
                break;
            case 4:
                str = "NATIVE";
                break;
            case 5:
                str = "ANR_DETECT";
                break;
            case 6:
                str = "ANR_APP_DEATH";
                break;
            case 7:
                str = "JAVASCRIPT";
                break;
            case 8:
                str = "SOFT_ERRORS";
                break;
            case 9:
                str = "UNEXPLAINED";
                break;
            case 10:
                str = "LATE_STARTUP";
                break;
            case 11:
                str = "AFTER_STARTUP";
                break;
            case 12:
                str = "MEMORY_SNAPSHOT";
                break;
            case 13:
                str = "CRASH_LOOP";
                break;
            default:
                str = "BACKGROUND";
                break;
        }
        0T9.A02(0Pz.A0W("MainAddOnConfig.processAddOns.", str), -734362632);
        try {
            for (0iG r0 : this.A00) {
                try {
                    r0.A7X(r302, num);
                } catch (Throwable th) {
                    0fH.A11("Lacrima", "Add on error: %s", th, new Object[]{AnonymousClass001.A0X(r0)});
                    C0iy.A00().Bwu("AddOnAddToDetectorConfig", th, null);
                }
            }
            0T9.A00(1711614192);
        } catch (Throwable th2) {
            0T9.A00(1600464635);
            throw th2;
        }
    }
}

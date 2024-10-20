package X;

import android.os.Process;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.http.interfaces.RequestPriority;

/* renamed from: X.400, reason: invalid class name */
/* loaded from: 400.class */
public abstract class AnonymousClass400 {
    public static RequestPriority A00() {
        1DW A00 = AnonymousClass401.A00(Process.getThreadPriority(Process.myTid()));
        switch (A00.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return RequestPriority.INTERACTIVE;
            case 5:
                return RequestPriority.NON_INTERACTIVE;
            case 6:
                return RequestPriority.CAN_WAIT;
            default:
                throw AnonymousClass001.A0N(StringFormatUtil.formatStrLocaleSafe("ThreadPriority %s is not supported in conversion to network priority.", A00));
        }
    }
}

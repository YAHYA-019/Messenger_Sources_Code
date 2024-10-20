package X;

import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.systrace.Systrace;

/* renamed from: X.3U2, reason: invalid class name */
/* loaded from: 3U2.class */
public final class C3U2 implements Handler.Callback {
    public final int A00;
    public final Object A01;

    public C3U2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Number number;
        if (this.A00 != 0) {
            1Fs.A00((1Fs) this.A01);
            return true;
        }
        11T.A0F(message, 0);
        if (message.what != 1) {
            return true;
        }
        Object obj = message.obj;
        if (!(obj instanceof Integer) || (number = (Number) obj) == null) {
            return true;
        }
        1Qd r0 = (1Qd) this.A01;
        int intValue = number.intValue();
        synchronized (r0.A07) {
            SparseArray sparseArray = r0.A02;
            1S6 r02 = (1S6) sparseArray.get(intValue);
            if (r02 != null && 1Br.A01(r0.A06) - r02.A00 >= 1Qd.A00(r0, intValue)) {
                sparseArray.remove(intValue);
                int i = r02.A01;
                if (i > 0) {
                    Systrace.A05(8, "Critical Path Entered", i);
                }
                0fH.A0a(Integer.valueOf(intValue), Integer.valueOf(sparseArray.size()), sparseArray, "DefaultCriticalPathController", "CriticalPathRemovedDueToTimeout. removedPathId: %d count: %d remainingActive: %s");
                QuickPerformanceLogger quickPerformanceLogger = r0.A0B;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerPoint(5505191, AnonymousClass482.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, intValue));
                }
            }
            if (!r0.A06()) {
                QuickPerformanceLogger quickPerformanceLogger2 = r0.A0B;
                if (quickPerformanceLogger2 != null) {
                    quickPerformanceLogger2.markerEnd(5505191, (short) 4);
                }
            }
        }
        1Qd.A02(r0, true);
        return true;
    }
}

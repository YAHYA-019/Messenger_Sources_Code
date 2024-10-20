package X;

import android.util.LongSparseArray;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;

/* renamed from: X.4Dg, reason: invalid class name */
/* loaded from: 4Dg.class */
public final class C4Dg implements C04H {
    public final InterfaceC03003wt A00 = new LongSparseArray();
    public volatile QuickPerformanceLogger A01;

    public static long A00(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    private void A01(int i, int i2, String str) {
        boolean z;
        if (i != 0) {
            long A00 = A00(i, i2);
            synchronized (this) {
                z = false;
                if (this.A00.indexOfKey(A00) < 0) {
                    z = true;
                }
            }
            if (z) {
                0fH.A0g(Integer.valueOf(i), "InstrumentationErrors", "Detected inactive markerAnnotate for marker %d");
                if (str == null) {
                    str = "null";
                }
                QuickPerformanceLogger quickPerformanceLogger = this.A01;
                if (quickPerformanceLogger != null) {
                    EventBuilder actionId = quickPerformanceLogger.markEventBuilder(i, "qpl_error_detector").setActionId((short) 10087);
                    actionId.annotate("annotation_name", str);
                    actionId.report();
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd0(int i, int i2, String str, int i3) {
        A01(i, i2, str);
    }

    @Override // X.C04H
    public void Cd1(int i, int i2, String str, String str2) {
        A01(i, i2, str);
    }

    @Override // X.C04H
    public void Cd2(int i, int i2) {
        long A00 = A00(i, i2);
        synchronized (this) {
            this.A00.remove(A00);
        }
    }

    @Override // X.C04H
    public void Cd3(int i, int i2) {
        if (i != 0) {
            long A00 = A00(i, i2);
            boolean z = false;
            synchronized (this) {
                InterfaceC03003wt interfaceC03003wt = this.A00;
                int indexOfKey = interfaceC03003wt.indexOfKey(A00);
                if (indexOfKey >= 0) {
                    interfaceC03003wt.removeAt(indexOfKey);
                } else {
                    z = true;
                }
            }
            if (z) {
                0fH.A0g(Integer.valueOf(i), "InstrumentationErrors", "Detected marker %d ended but not started");
                QuickPerformanceLogger quickPerformanceLogger = this.A01;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markEventBuilder(i, "qpl_error_detector").setActionId((short) 10294).report();
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd4(int i, int i2, String str) {
        boolean z;
        if (i != 0) {
            long A00 = A00(i, i2);
            synchronized (this) {
                z = false;
                if (this.A00.indexOfKey(A00) < 0) {
                    z = true;
                }
            }
            if (z) {
                0fH.A0g(Integer.valueOf(i), "InstrumentationErrors", "Detected inactive markerPoint for marker %d");
                QuickPerformanceLogger quickPerformanceLogger = this.A01;
                if (quickPerformanceLogger != null) {
                    EventBuilder actionId = quickPerformanceLogger.markEventBuilder(i, "qpl_error_detector").setActionId((short) 10088);
                    actionId.annotate("point_name", str);
                    actionId.report();
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd5(int i, int i2, boolean z) {
        if (i != 0) {
            long A00 = A00(i, i2);
            boolean z2 = false;
            synchronized (this) {
                InterfaceC03003wt interfaceC03003wt = this.A00;
                if (interfaceC03003wt.indexOfKey(A00) < 0) {
                    interfaceC03003wt.append(A00, Boolean.valueOf(z));
                } else {
                    z2 = true;
                }
            }
            if (z2) {
                0fH.A0g(Integer.valueOf(i), "InstrumentationErrors", "Detected restart for marker %d");
                QuickPerformanceLogger quickPerformanceLogger = this.A01;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markEventBuilder(i, "qpl_error_detector").setActionId((short) 10086).report();
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd6() {
        InterfaceC03003wt interfaceC03003wt;
        synchronized (this) {
            ArrayList A0s = AnonymousClass001.A0s();
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                interfaceC03003wt = this.A00;
                if (i3 >= interfaceC03003wt.size()) {
                    break;
                }
                if (AnonymousClass001.A1V(interfaceC03003wt.valueAt(i3))) {
                    AnonymousClass001.A1J(A0s, i3);
                }
                i2 = i3 + 1;
            }
            while (true) {
                if (i < A0s.size()) {
                    interfaceC03003wt.removeAt(((Integer) A0s.get(i)).intValue());
                    i++;
                }
            }
        }
    }

    @Override // X.C04H
    public void Cd7(int i, int i2, boolean z) {
        synchronized (this) {
            long A00 = A00(i, i2);
            InterfaceC03003wt interfaceC03003wt = this.A00;
            int indexOfKey = interfaceC03003wt.indexOfKey(A00);
            if (indexOfKey >= 0) {
                interfaceC03003wt.setValueAt(indexOfKey, Boolean.valueOf(z));
            }
        }
    }

    @Override // X.C04H
    public void Ctc(QuickPerformanceLogger quickPerformanceLogger) {
        this.A01 = quickPerformanceLogger;
    }
}

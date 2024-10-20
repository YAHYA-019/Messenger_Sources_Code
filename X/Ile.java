package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: Ile.class */
public final class Ile implements JMj {
    public static int A01 = 1;
    public static int A02 = 1;
    public static int A03;
    public static int A04;
    public QuickPerformanceLogger A00 = QuickPerformanceLoggerProvider.getQPLInstance();

    @Override // X.JMj
    public void A3P(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (str2 == null || (quickPerformanceLogger = this.A00) == null) {
            return;
        }
        quickPerformanceLogger.markerAnnotate(299633217, str, str2);
    }

    @Override // X.JMj
    public void A3Q() {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(299633217, (short) 2);
        }
        A01++;
    }

    @Override // X.JMj
    public void A3R(String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(299633217, str);
        }
    }

    @Override // X.JMj
    public void A3S(String str) {
        if (this.A00 == null) {
            this.A00 = QuickPerformanceLoggerProvider.getQPLInstance();
        }
        int i = A03;
        int i2 = A01;
        if (i == i2) {
            A3P("has_duplicate_start", ConstantsKt.CAMERA_ID_BACK);
            QuickPerformanceLogger quickPerformanceLogger = this.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(299633217, (short) 3);
            }
            i2 = A01 + 1;
            A01 = i2;
        }
        A03 = i2;
        QuickPerformanceLogger quickPerformanceLogger2 = this.A00;
        if (quickPerformanceLogger2 != null) {
            quickPerformanceLogger2.markerStart(299633217);
        }
        QuickPerformanceLogger quickPerformanceLogger3 = this.A00;
        if (quickPerformanceLogger3 != null) {
            quickPerformanceLogger3.markerAnnotate(299633217, UserFlowLoggerImpl.SOURCE_ANNOTATION, "acp_play");
        }
        QuickPerformanceLogger quickPerformanceLogger4 = this.A00;
        if (quickPerformanceLogger4 != null) {
            quickPerformanceLogger4.markerAnnotate(299633217, TraceFieldType.MsgId, A01);
        }
    }

    @Override // X.JMj
    public void A3T(String str, String str2) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (str2 == null || (quickPerformanceLogger = this.A00) == null) {
            return;
        }
        quickPerformanceLogger.markerAnnotate(299643486, str, str2);
    }

    @Override // X.JMj
    public void A3U() {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(299643486, (short) 2);
        }
        A02++;
    }

    @Override // X.JMj
    public void A3V(String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(299643486, str);
        }
    }

    @Override // X.JMj
    public void A3W(String str) {
        this.A00 = QuickPerformanceLoggerProvider.getQPLInstance();
        int i = A04;
        int i2 = A02;
        if (i == i2) {
            A3T("has_duplicate_start", ConstantsKt.CAMERA_ID_BACK);
            QuickPerformanceLogger quickPerformanceLogger = this.A00;
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerEnd(299643486, (short) 3);
            }
            i2 = A02 + 1;
            A02 = i2;
        }
        A04 = i2;
        QuickPerformanceLogger quickPerformanceLogger2 = this.A00;
        if (quickPerformanceLogger2 != null) {
            quickPerformanceLogger2.markerStart(299643486);
        }
        QuickPerformanceLogger quickPerformanceLogger3 = this.A00;
        if (quickPerformanceLogger3 != null) {
            quickPerformanceLogger3.markerAnnotate(299643486, UserFlowLoggerImpl.SOURCE_ANNOTATION, str);
        }
        QuickPerformanceLogger quickPerformanceLogger4 = this.A00;
        if (quickPerformanceLogger4 != null) {
            quickPerformanceLogger4.markerAnnotate(299643486, TraceFieldType.MsgId, A02);
        }
    }
}

package X;

import android.content.Intent;
import android.content.res.Resources;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.fbservice.service.BlueService;
import com.facebook.fbservice.service.BlueServiceLogic;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.Arrays;

/* renamed from: X.2rm, reason: invalid class name */
/* loaded from: 2rm.class */
public abstract class C2rm extends 0Df implements AnonymousClass025 {
    public QuickPerformanceLogger A00;
    public final 1Br A03 = 1Bu.A01(this, 16428);
    public final 1Br A01 = 1Bq.A00(16511);
    public final 1Br A02 = 1Bq.A00(16385);
    public final AnonymousClass074 A04 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:45:0x010a, code lost:
    
        if (((X.1CO) r0.get()).AZk(36319866952694175L) == false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A0w(android.content.Intent r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2rm.A0w(android.content.Intent, int, int):int");
    }

    public void A0x() {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A00 = qPLInstance;
        if (qPLInstance != null) {
            qPLInstance.markerStart(43712514, "class-name", getClass().getSimpleName());
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(43712514, "do-create");
        }
        C00j.A07("FbService[%s].doCreate", getClass().getSimpleName(), 458237556);
        try {
            A12();
            C00j.A01(613210848);
        } catch (Throwable th) {
            C00j.A01(1500442934);
            throw th;
        }
    }

    public void A0y() {
        A13();
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(43712514, (short) 2);
        }
    }

    public void A0z(String str, Object... objArr) {
        1Br.A04(this.A01).D12("FbService", StringFormatUtil.formatStrLocaleSafe(str, Arrays.copyOf(objArr, 1)), new Throwable());
    }

    public int A11(Intent intent, int i, int i2) {
        int A04;
        int A0w;
        int i3;
        if (this instanceof BlueService) {
            BlueService blueService = (BlueService) this;
            A04 = 0FI.A04(331459390);
            A0w = 2;
            if (intent == null) {
                i3 = -1467436766;
            } else {
                synchronized (blueService) {
                    try {
                        if ("Orca.DRAIN".equals(intent.getAction())) {
                            ((BlueServiceLogic) blueService.A00.get()).A02();
                        }
                    } catch (Throwable th) {
                        0FI.A0A(1109176657, A04);
                        throw th;
                    }
                }
                i3 = -1061573329;
            }
        } else {
            A04 = 0FI.A04(-187472485);
            A0w = super.A0w(intent, i, i2);
            i3 = 1735465075;
        }
        0FI.A0A(i3, A04);
        return A0w;
    }

    public void A12() {
        int A04 = 0FI.A04(1183151674);
        super.A0x();
        0FI.A0A(-1357109961, A04);
    }

    public void A13() {
        int A04 = 0FI.A04(-237846158);
        super.A0y();
        0FI.A0A(1185030550, A04);
    }

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        11T.A0F(obj, 0);
        return this.A04.A00(obj);
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        11T.A0F(obj, 0);
        11T.A0F(obj2, 1);
        this.A04.A01(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Resources getResources() {
        Resources resources = getApplicationContext().getResources();
        11T.A0A(resources);
        return resources;
    }
}

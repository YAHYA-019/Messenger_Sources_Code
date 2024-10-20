package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.conditionalworker.ConditionalWorkerService;
import com.facebook.fbservice.service.BlueServiceJobIntentService;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.livelocation.bindings.MessengerLiveLocationBooterService;
import com.facebook.push.fcm.FcmRegistrarFbJobIntentService;
import com.facebook.push.registration.RegistrarHelperService;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* renamed from: X.3un, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3un.class */
public abstract class AbstractC02263un extends 0Fc implements AnonymousClass025, 1IM {
    public QuickPerformanceLogger A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final AnonymousClass074 A04;
    public final C00i A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.074] */
    public AbstractC02263un(String str) {
        11T.A0F(str, 1);
        this.A04 = new Object();
        this.A01 = 1Bu.A00(66371);
        this.A03 = 1Bu.A01(this, 16428);
        1BP r0 = FbInjector.A00;
        11T.A0A(r0);
        this.A05 = r0;
        this.A02 = 1Bq.A00(16511);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:5|6|7|8|9|(5:11|12|13|14|(16:16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31))|59|25|26|27|28|29|30|31|(2:(0)|(1:44))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
    
        r307 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(android.content.Intent r302) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC02263un.A02(android.content.Intent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [android.content.Context, com.facebook.messaging.livelocation.bindings.MessengerLiveLocationBooterService, java.lang.Object] */
    public void A03() {
        if (this instanceof ConditionalWorkerService) {
            return;
        }
        if (this instanceof MessengerLiveLocationBooterService) {
            ?? r0 = (MessengerLiveLocationBooterService) this;
            r0.A02 = new C4Xj(r0, 5);
            r0.A00 = new 1BV((Context) r0, 49641);
            r0.A01 = new 1BV((Context) r0, 49808);
            return;
        }
        if (this instanceof RegistrarHelperService) {
            C1cx.A00((Context) this);
            return;
        }
        if (this instanceof BlueServiceJobIntentService) {
            C00j.A05("BlueService.doCreate", 66965280);
            C00j.A01(-187660593);
            return;
        }
        FcmRegistrarFbJobIntentService fcmRegistrarFbJobIntentService = (FcmRegistrarFbJobIntentService) this;
        fcmRegistrarFbJobIntentService.A01 = (4AX) 1Bi.A04(4AX.class);
        fcmRegistrarFbJobIntentService.A00 = (C4Ad) 1Bi.A04(C4Ad.class);
        1OX r02 = (1OX) 1Bi.A04(1OX.class);
        fcmRegistrarFbJobIntentService.A03 = r02;
        r02.getClass();
        fcmRegistrarFbJobIntentService.A02 = r02.A01(1OZ.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x02f3, code lost:
    
        if (((X.1OQ) r0.A02.get()).Bgz(r310) != false) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v139, types: [android.content.Context, com.facebook.push.registration.RegistrarHelperService] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.content.Context, com.facebook.push.fcm.FcmRegistrarFbJobIntentService] */
    /* JADX WARN: Type inference failed for: r0v223, types: [android.content.Context, com.facebook.conditionalworker.ConditionalWorkerService] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(android.content.Intent r302) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC02263un.A04(android.content.Intent):void");
    }

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        11T.A0F(obj, 0);
        return this.A04.A00(obj);
    }

    public void CcH(1IG r302) {
        11T.A0F(r302, 0);
        ((2CP) 1Br.A0B(this.A01)).A01(r302);
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        11T.A0F(obj, 0);
        11T.A0F(obj2, 1);
        this.A04.A01(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Resources getResources() {
        C00i c00i = this.A05;
        Context context = (Context) c00i.get();
        Resources resources = (context == null || context.getResources() == null) ? super/*android.content.ContextWrapper*/.getResources() : ((Context) c00i.get()).getResources();
        11T.A0A(resources);
        return resources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        int A00 = C08o.A00(this, 1986654877);
        int A04 = 0FI.A04(1940574473);
        C1cx.A00(this);
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        this.A00 = qPLInstance;
        if (qPLInstance != null) {
            qPLInstance.markerStart(43712513, "class-name", getClass().getSimpleName());
            qPLInstance.markerPoint(43712513, "on-create");
        }
        C00j.A07("FbJobIntentService[%s].onCreate", getClass().getSimpleName(), -2067494897);
        try {
            super/*X.0Fe*/.onCreate();
            A03();
            C00j.A01(-1781428929);
            0FI.A0A(1221521793, A04);
            C08o.A02(623090789, A00);
        } catch (Throwable th) {
            C00j.A01(-1602049205);
            0FI.A0A(126595181, A04);
            C08o.A02(-463832924, A00);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A04 = 0FI.A04(-1956591881);
        super/*X.0Fe*/.onDestroy();
        ((2CP) this.A01.A00.get()).A00();
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerEnd(43712513, (short) 2);
        }
        0FI.A0A(-98453509, A04);
        C01w.A00(this);
    }
}

package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.CancellationException;

/* renamed from: X.Db9, reason: case insensitive filesystem */
/* loaded from: Db9.class */
public final class C2084Db9 extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C2084Db9(FbUserSession fbUserSession, GK5 gk5, F8G f8g, String str, int i) {
        this.A00 = i;
        this.A03 = f8g;
        if (12 - i != 0) {
            this.A02 = gk5;
            this.A01 = fbUserSession;
            this.A04 = str;
        } else {
            this.A01 = fbUserSession;
            this.A04 = str;
            this.A02 = gk5;
        }
    }

    public C2084Db9(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A04 = str;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public static void A00(C2084Db9 c2084Db9, String str) {
        c2084Db9.A03(new RuntimeException(str));
    }

    public static boolean A01(TreeJNI treeJNI) {
        return treeJNI.getBooleanValue(1002336684);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0a35, code lost:
    
        if (android.text.TextUtils.isEmpty(r313) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0a73, code lost:
    
        if (android.text.TextUtils.isEmpty(r306) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x062b, code lost:
    
        if (X.DKC.A1X(r316) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0c77, code lost:
    
        if (r0.A0L(594892213, r320, 2042110642) != null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0e63, code lost:
    
        if (r313 != null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x14cd, code lost:
    
        if (r314 == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0976, code lost:
    
        if (android.text.TextUtils.isEmpty(r309) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x348b, code lost:
    
        if (r0.A01.A08() == false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:954:0x3703, code lost:
    
        if (r0.isEmpty() != false) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:998:0x387e, code lost:
    
        if (android.text.TextUtils.isEmpty(r313) == false) goto L791;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:228:0x0f08. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:348:0x157e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:354:0x1d1f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x1d32  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x1da0  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x1e0c  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x1e71 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x1ea4  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x2c3e  */
    /* JADX WARN: Removed duplicated region for block: B:842:0x3272  */
    /* JADX WARN: Removed duplicated region for block: B:844:0x32b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x07d8  */
    /* JADX WARN: Type inference failed for: r0v1184, types: [com.facebook.payments.contactinfo.model.PhoneNumberContactInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1240, types: [java.lang.Object, com.facebook.payments.contactinfo.model.EmailContactInfo] */
    /* JADX WARN: Type inference failed for: r0v1254, types: [java.lang.Object, com.facebook.payments.contactinfo.model.NameContactInfo] */
    /* JADX WARN: Type inference failed for: r313v144, types: [X.RLk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r313v146, types: [X.RLk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r318v4, types: [java.lang.Object, com.facebook.payments.contactinfo.model.NameContactInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 14642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2084Db9.A02(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void A03(Throwable th) {
        ServiceException A00;
        GL5 gl5;
        Object obj;
        FHO fho;
        PaymentsLoggingSessionData paymentsLoggingSessionData;
        PaymentItemType paymentItemType;
        PaymentsFlowStep paymentsFlowStep;
        FHO fho2;
        PaymentsLoggingSessionData paymentsLoggingSessionData2;
        PaymentItemType paymentItemType2;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                A00 = ServiceException.A00(th);
                E5G e5g = (E5G) this.A01;
                e5g.A02.A08(PaymentsFlowStep.A2Y, e5g.A00, e5g.A01, th);
                gl5 = (GL5) this.A03;
                obj = this.A02;
                gl5.BMd(A00, (GKX) obj, true);
                return;
            case 2:
                E5H e5h = (E5H) this.A01;
                fho = e5h.A04;
                paymentsLoggingSessionData = e5h.A01;
                paymentItemType = e5h.A02;
                paymentsFlowStep = PaymentsFlowStep.A0X;
                fho.A08(paymentsFlowStep, paymentsLoggingSessionData, paymentItemType, th);
                ((GL5) this.A02).BMd(ServiceException.A00(th), (GKX) this.A03, false);
                return;
            case 3:
                E5H e5h2 = (E5H) this.A01;
                fho = e5h2.A04;
                paymentsLoggingSessionData = e5h2.A01;
                paymentItemType = e5h2.A02;
                paymentsFlowStep = PaymentsFlowStep.A0r;
                fho.A08(paymentsFlowStep, paymentsLoggingSessionData, paymentItemType, th);
                ((GL5) this.A02).BMd(ServiceException.A00(th), (GKX) this.A03, false);
                return;
            case 4:
                A00 = ServiceException.A00(th);
                E5B e5b = (E5B) this.A01;
                e5b.A02.A08(PaymentsFlowStep.A0f, e5b.A00, e5b.A01, A00);
                gl5 = (GL5) this.A02;
                obj = this.A03;
                gl5.BMd(A00, (GKX) obj, true);
                return;
            case 5:
                E58 e58 = (E58) this.A01;
                e58.A02.A08(PaymentsFlowStep.A0i, e58.A00, e58.A01, th);
                return;
            case 6:
                E5E e5e = (E5E) this.A01;
                fho2 = e5e.A09;
                paymentsLoggingSessionData2 = e5e.A00;
                paymentItemType2 = e5e.A01;
                fho2.A08(PaymentsFlowStep.A2b, paymentsLoggingSessionData2, paymentItemType2, th);
                GLi gLi = (GLi) this.A03;
                gLi.BOC();
                gLi.AFo();
                ((GL5) this.A02).D4Z(2131963048);
                return;
            case 7:
                E5D e5d = (E5D) this.A01;
                fho = e5d.A09;
                paymentsLoggingSessionData = e5d.A00;
                paymentItemType = e5d.A01;
                paymentsFlowStep = PaymentsFlowStep.A0Y;
                fho.A08(paymentsFlowStep, paymentsLoggingSessionData, paymentItemType, th);
                ((GL5) this.A02).BMd(ServiceException.A00(th), (GKX) this.A03, false);
                return;
            case 8:
                E5F e5f = (E5F) this.A01;
                fho2 = e5f.A0B;
                paymentsLoggingSessionData2 = e5f.A01;
                paymentItemType2 = e5f.A02;
                fho2.A08(PaymentsFlowStep.A2b, paymentsLoggingSessionData2, paymentItemType2, th);
                GLi gLi2 = (GLi) this.A03;
                gLi2.BOC();
                gLi2.AFo();
                ((GL5) this.A02).D4Z(2131963048);
                return;
            case 9:
                E5A e5a = (E5A) this.A01;
                fho = e5a.A02;
                paymentsLoggingSessionData = e5a.A00;
                paymentItemType = e5a.A01;
                paymentsFlowStep = PaymentsFlowStep.A0r;
                fho.A08(paymentsFlowStep, paymentsLoggingSessionData, paymentItemType, th);
                ((GL5) this.A02).BMd(ServiceException.A00(th), (GKX) this.A03, false);
                return;
            case 10:
                A00 = ServiceException.A00(th);
                E5C e5c = (E5C) this.A01;
                e5c.A03.A08(PaymentsFlowStep.A2c, e5c.A00, e5c.A01, th);
                gl5 = (GL5) this.A02;
                obj = this.A03;
                gl5.BMd(A00, (GKX) obj, true);
                return;
            case 11:
                Epf epf = (Epf) this.A01;
                epf.A05.A08(PaymentsFlowStep.A0K, (PaymentsLoggingSessionData) this.A03, th);
                DZe.A09(((Eep) this.A02).A00.A00.A00, 0, epf.A04.A00().A05);
                return;
            case 12:
                11T.A0F(th, 0);
                0fH.A0r("ConfirmActionController", "Could not upload the photo: ", th);
                F8G f8g = (F8G) this.A03;
                GK5 gk5 = (GK5) this.A02;
                AbI.A0o(f8g.A04).A02();
                gk5.CSt();
                return;
            case 13:
                11T.A0F(th, 0);
                0fH.A0r("ConfirmActionController", "Could not scan the qr code of the image: ", th);
                GK5 gk52 = (GK5) this.A02;
                gk52.CF1();
                F8G.A00((FbUserSession) this.A01, gk52, (F8G) this.A03, this.A04);
                return;
            default:
                FIP fip = (FIP) this.A01;
                if (FIP.A03(this.A04)) {
                    QuickPerformanceLogger quickPerformanceLogger = fip.A0N;
                    quickPerformanceLogger.markerPoint(238949909, "failed_to_fetch_screen");
                    quickPerformanceLogger.markerEnd(238949909, (short) 3);
                }
                0fH.A0A(FIP.class, "Exception on FetchZeroNTMessengerInterstitial Futures.addCallback onNonCancellationFailure ");
                return;
        }
    }

    public void A04(CancellationException cancellationException) {
        if (14 - this.A00 != 0) {
            super.A04(cancellationException);
        } else {
            0fH.A0A(FIP.class, "Exception on FetchZeroNTMessengerInterstitial Futures.addCallback onCancel ");
        }
    }
}

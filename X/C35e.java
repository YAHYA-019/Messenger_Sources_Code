package X;

import com.facebook.fbservice.service.ServiceException;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.MarkThreadFields;
import com.facebook.messaging.service.model.MarkThreadsParams;

/* renamed from: X.35e, reason: invalid class name */
/* loaded from: 35e.class */
public final class C35e extends 4rX {
    public final /* synthetic */ 5I5 A00;
    public final /* synthetic */ MarkThreadsParams A01;
    public final /* synthetic */ String A02;

    public C35e(5I5 r302, MarkThreadsParams markThreadsParams, String str) {
        this.A00 = r302;
        this.A02 = str;
        this.A01 = markThreadsParams;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        5I5 r0 = this.A00;
        C6hq c6hq = (C6hq) r0.A04.get();
        String str = this.A02;
        0fH.A0g(str, 4YT.A00(745), "markReadSucceeded - %s");
        if (c6hq.A05()) {
            C6hq.A00(new C7rY(null, "operation_succeeded", 0Pz.A0W("threadKeys:", str), 1BL.A08(c6hq.A00)), c6hq);
        }
        5I6 r02 = (5I6) r0.A05.get();
        MarkThreadsParams markThreadsParams = this.A01;
        synchronized (r02) {
            String A00 = 4YT.A00(746);
            0fH.A0d(Integer.valueOf(r02.A01.size()), 5I5.A00(markThreadsParams), A00, "onMarkReadSucceeded[start] - unfinished:%d, %s");
            1Du it = markThreadsParams.A00.iterator();
            while (it.hasNext()) {
                MarkThreadFields markThreadFields = (MarkThreadFields) it.next();
                0QO r03 = r02.A01;
                ThreadKey threadKey = markThreadFields.A06;
                MarkThreadFields markThreadFields2 = (MarkThreadFields) r03.get(threadKey);
                if (markThreadFields2 != null && markThreadFields2.equals(markThreadFields)) {
                    r02.A01.remove(threadKey);
                }
            }
            r02.A00 = -1;
            0fH.A0g(Integer.valueOf(r02.A01.size()), A00, "onMarkReadSucceeded[end] - unfinished:%d");
        }
        ((2Iq) r0.A01.get()).A01("android_messaging_mark_read_success");
    }

    public void A05(ServiceException serviceException) {
        5I5 r0 = this.A00;
        ((C6hq) r0.A04.get()).A04(this.A02, serviceException);
        ((2Iq) r0.A01.get()).A01("android_messaging_mark_read_failure");
    }

    public void A06(Throwable th) {
        ((C6hq) this.A00.A04.get()).A04(this.A02, th);
    }
}

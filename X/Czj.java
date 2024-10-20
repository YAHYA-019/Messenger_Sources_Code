package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservable;

/* loaded from: Czj.class */
public final class Czj implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Czj(COs cOs, Integer num, int i) {
        this.A00 = i;
        if (74 - i != 0) {
            this.A02 = cOs;
            this.A01 = num;
        } else {
            this.A01 = num;
            this.A02 = cOs;
        }
    }

    public Czj(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static Czj A00(Object obj, Object obj2, int i) {
        return new Czj(obj, obj2, i);
    }

    public static void A01(1Um r301, MailboxFutureImpl mailboxFutureImpl, Object obj, int i) {
        if (r301.Cj2(new Czj(obj, mailboxFutureImpl, i))) {
            return;
        }
        mailboxFutureImpl.cancel(false);
    }

    public static void A02(MailboxObservable mailboxObservable, Object obj, Object obj2, int i) {
        mailboxObservable.addResultCallback(new Czj(obj, obj2, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0a00, code lost:
    
        if (r315 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x192d, code lost:
    
        if (r0.mResultSet.getInteger(r321, 4) != 2) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x1a57, code lost:
    
        if (r0.A01(r0.A09) == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x29ff, code lost:
    
        if (X.4YV.A0W(r0.A0G).AZk(36320279274863868L) != false) goto L629;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:287:0x138d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x1773  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x17bd  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x17c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x17dc  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x17c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x16f3  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x1535 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v245, types: [X.BwC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v274, types: [X.BwC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v294, types: [X.BwC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r306v68, types: [X.BwC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r306v70, types: [X.BwC, java.lang.Object] */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 13434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Czj.onCompletion(java.lang.Object):void");
    }
}

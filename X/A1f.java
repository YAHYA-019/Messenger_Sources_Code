package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservable;

/* loaded from: A1f.class */
public final class A1f implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public A1f(C1x9 c1x9, 1xH r303, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = c1x9;
            this.A01 = r303;
        } else {
            this.A01 = r303;
            this.A02 = c1x9;
        }
    }

    public A1f(AnonymousClass206 anonymousClass206, MailboxFutureImpl mailboxFutureImpl, int i) {
        this.A00 = i;
        this.A01 = anonymousClass206;
        this.A02 = mailboxFutureImpl;
    }

    public A1f(C8ye c8ye, MailboxFutureImpl mailboxFutureImpl, int i) {
        this.A00 = i;
        this.A01 = c8ye;
        this.A02 = mailboxFutureImpl;
    }

    public A1f(9OD r302, 9kY r303, int i) {
        this.A00 = i;
        if (51 - i != 0) {
            this.A02 = r303;
            this.A01 = r302;
        } else {
            this.A01 = r302;
            this.A02 = r303;
        }
    }

    public A1f(9Zi r302, 0DR r303, int i) {
        this.A00 = i;
        if (45 - i != 0) {
            this.A01 = r303;
            this.A02 = r302;
        } else {
            this.A02 = r302;
            this.A01 = r303;
        }
    }

    public A1f(AYG ayg, C9iB c9iB, int i) {
        this.A00 = i;
        switch (i) {
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
            case ActionId.INTERACTION_OPEN_PHOTO_GALLERY /* 70 */:
                this.A02 = c9iB;
                this.A01 = ayg;
                break;
            default:
                this.A01 = ayg;
                this.A02 = c9iB;
                break;
        }
    }

    public A1f(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static A1f A00(Object obj, Object obj2, int i) {
        return new A1f(obj, obj2, i);
    }

    public static void A01(MailboxObservable mailboxObservable, Object obj, Object obj2, int i) {
        mailboxObservable.addResultCallback(new A1f(obj, obj2, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:395:0x135b, code lost:
    
        if (r317 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x17a2, code lost:
    
        if (r306 == null) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x1802, code lost:
    
        if (r304 == null) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x182d, code lost:
    
        if (r311 == null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x1862, code lost:
    
        if (r328 == null) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x188e, code lost:
    
        if (r312 == null) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x1998, code lost:
    
        if (r319 == null) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x19c0, code lost:
    
        if (r310 == null) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x1a31, code lost:
    
        if (r310 == null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x1a9d, code lost:
    
        if (r310 == null) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x1b13, code lost:
    
        if (r311 == null) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x1ebd, code lost:
    
        if (r310 == null) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x1ede, code lost:
    
        if (r307 == null) goto L542;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0dd3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0e4b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x132c  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x174c  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x1779  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x1d06 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1396, types: [X.0ty] */
    /* JADX WARN: Type inference failed for: r0v1402, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1691, types: [com.facebook.msys.mca.MailboxObservable] */
    /* JADX WARN: Type inference failed for: r0v1694, types: [com.facebook.msys.mca.MailboxObservableImpl] */
    /* JADX WARN: Type inference failed for: r0v410, types: [X.8yh, com.facebook.msys.mca.MailboxObservable] */
    /* JADX WARN: Type inference failed for: r0v547, types: [com.facebook.msys.mca.MailboxObservable, X.8yg] */
    /* JADX WARN: Type inference failed for: r310v10 */
    /* JADX WARN: Type inference failed for: r310v11 */
    /* JADX WARN: Type inference failed for: r310v12, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r310v120 */
    /* JADX WARN: Type inference failed for: r310v121 */
    /* JADX WARN: Type inference failed for: r310v122, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r319v23 */
    /* JADX WARN: Type inference failed for: r319v24 */
    /* JADX WARN: Type inference failed for: r319v27, types: [java.util.AbstractCollection] */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 11606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1f.onCompletion(java.lang.Object):void");
    }
}

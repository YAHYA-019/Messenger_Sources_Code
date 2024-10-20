package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.CQLResultSet;

/* renamed from: X.4W0, reason: invalid class name */
/* loaded from: 4W0.class */
public final class C4W0 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C4W0(MailboxFutureImpl mailboxFutureImpl, C00683ob c00683ob, int i) {
        this.A00 = i;
        this.A01 = c00683ob;
        this.A02 = mailboxFutureImpl;
    }

    public C4W0(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static int A00(CQLResultSet cQLResultSet, int i, int i2) {
        Integer nullableInteger = cQLResultSet.getNullableInteger(i, i2);
        if (nullableInteger == null) {
            return 0;
        }
        return nullableInteger.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0658, code lost:
    
        if (r0.mResultSet.getBoolean(r320, 24) != false) goto L58;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:48:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0750  */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4W0.onCompletion(java.lang.Object):void");
    }
}

package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxObservable;
import kotlin.jvm.functions.Function1;

/* loaded from: A1d.class */
public final class A1d implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public A1d(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public A1d(Function1 function1, int i) {
        this.A00 = i;
        switch (i) {
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
            case ActionId.ACTIVITY_RESUMED /* 77 */:
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
            case ActionId.VIDEO_PLAYING /* 116 */:
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
            case ActionId.HEADER_DATA_LOADED /* 121 */:
            case ActionId.MESSENGER_QUEUE_CREATION /* 129 */:
            case ActionId.APP_WILL_ENTER_FOREGROUND /* 132 */:
            case ActionId.APP_DID_ENTER_BACKGROUND /* 133 */:
            case ActionId.APP_MAIN /* 134 */:
                this.A01 = function1;
                return;
            default:
                this.A01 = function1;
                return;
        }
    }

    public static A1d A00(Object obj, int i) {
        return new A1d(obj, i);
    }

    public static void A01(MailboxObservable mailboxObservable, Object obj, int i) {
        mailboxObservable.addResultCallback(new A1d(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:1062:0x3552, code lost:
    
        if (r304 != null) goto L889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0ca5, code lost:
    
        if ((r0 & (1 << 2)) != 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0ef2, code lost:
    
        if (r303 == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x1289, code lost:
    
        if (r0.mResultSet.getInteger(0, 1) == 1) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x2c4f, code lost:
    
        if (r0 == 0) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:891:0x2c74, code lost:
    
        if (X.1BK.A1X(r0.mResultSet.getNullableBoolean(0, 5), true) == false) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:991:0x3199, code lost:
    
        if (r304 == null) goto L825;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0cc2  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x3561  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1074, types: [com.facebook.msys.mca.MailboxObservable, X.8yi] */
    /* JADX WARN: Type inference failed for: r0v1177, types: [X.0ty] */
    /* JADX WARN: Type inference failed for: r0v1370, types: [com.facebook.msys.mca.MailboxObservable, X.8yy] */
    /* JADX WARN: Type inference failed for: r0v1377, types: [X.8z1, com.facebook.msys.mca.MailboxObservable] */
    /* JADX WARN: Type inference failed for: r0v1464, types: [X.8z0, com.facebook.msys.mca.MailboxObservable] */
    /* JADX WARN: Type inference failed for: r0v150, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1505, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1524, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3300, types: [X.8z4, com.facebook.msys.mca.MailboxObservable] */
    /* JADX WARN: Type inference failed for: r0v3451, types: [X.8z3, com.facebook.msys.mca.MailboxObservable] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r304v11 */
    /* JADX WARN: Type inference failed for: r304v13, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r304v3, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r304v5, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r304v9, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r311v31 */
    /* JADX WARN: Type inference failed for: r311v32 */
    /* JADX WARN: Type inference failed for: r311v34, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r311v7 */
    /* JADX WARN: Type inference failed for: r311v8 */
    /* JADX WARN: Type inference failed for: r311v9, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r327v26 */
    /* JADX WARN: Type inference failed for: r327v27 */
    /* JADX WARN: Type inference failed for: r327v31, types: [java.util.AbstractCollection] */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 15488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1d.onCompletion(java.lang.Object):void");
    }
}

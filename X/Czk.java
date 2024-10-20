package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxObservable;
import com.google.common.util.concurrent.SettableFuture;
import kotlin.jvm.functions.Function1;

/* loaded from: Czk.class */
public final class Czk implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public Czk(SettableFuture settableFuture, int i) {
        this.A00 = i;
        switch (i) {
            case 13:
            case 14:
            case 36:
            case ActionId.MINIPREVIEW_COMPLETE /* 91 */:
            case ActionId.SEARCH_TYPEAHEAD /* 92 */:
            case ActionId.ANIMATION_END /* 93 */:
            case ActionId.UDP_REQUEST_SEND /* 94 */:
            case ActionId.INTERRUPTED /* 96 */:
            case ActionId.NETWORK_FAILED /* 97 */:
            case ActionId.NETWORK_RESPONSE /* 98 */:
            case ActionId.EDGE_PROCESSING_BEGIN /* 99 */:
            case 100:
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
            case ActionId.DATA_LOAD_START /* 102 */:
            case ActionId.LEGACY_MARKER /* 103 */:
            case ActionId.ACTION_BAR_COMPLETE /* 104 */:
            case ActionId.ABORTED /* 105 */:
            case ActionId.CONTROLLER_INITIATED /* 114 */:
            case ActionId.RTMP_STREAM_PREPARED /* 115 */:
            case ActionId.VIDEO_PLAYING /* 116 */:
            case ActionId.RTMP_CONNECTION_FAILED /* 118 */:
                this.A01 = settableFuture;
                return;
            default:
                this.A01 = settableFuture;
                return;
        }
    }

    public Czk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public Czk(Function1 function1, int i) {
        this.A00 = i;
        switch (i) {
            case 7:
            case 19:
            case 24:
            case 40:
            case 41:
            case ActionId.HEADER_DATA_LOADED /* 121 */:
                this.A01 = function1;
                return;
            default:
                this.A01 = function1;
                return;
        }
    }

    public static Czk A00(Object obj, int i) {
        return new Czk(obj, i);
    }

    public static void A01(1Fi r301, String str, String str2) {
        String concat = str.concat(str2);
        if (r301.contains(concat)) {
            InterfaceC00051a0 AP5 = 1Oy.A00(C0f1.A00()).AP5();
            AP5.Cdi(concat);
            AP5.apply();
        }
    }

    public static void A02(MailboxObservable mailboxObservable, Object obj, int i) {
        mailboxObservable.addResultCallback(new Czk(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:1084:0x3247, code lost:
    
        if (X.1Ux.A00((X.1Ux) r0.get()).AZk(36323607871638318L) != false) goto L934;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x1d55, code lost:
    
        if (r0.length() == 0) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x1d7b, code lost:
    
        if (X.0CU.A0T(r0, "is_mandatory", false) == false) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x1de1, code lost:
    
        if (X.0CU.A0T(r0, "community_image", false) == false) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x1e85, code lost:
    
        if (r0 != null) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x1fc1, code lost:
    
        if (r303 == null) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x2350, code lost:
    
        if (X.AnonymousClass001.A1V(r0) == false) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x237a, code lost:
    
        if (X.AnonymousClass001.A1V(r0) != false) goto L858;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:259:0x0e66. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0fdd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0e29 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x210f  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x33a4  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x33da  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x33e1  */
    /* JADX WARN: Type inference failed for: r0v1281 */
    /* JADX WARN: Type inference failed for: r0v1291 */
    /* JADX WARN: Type inference failed for: r0v203, types: [androidx.fragment.app.Fragment, com.facebook.messaging.communitymessaging.adminassist.adminassistupsell.AdminAssistUnsendMessageUpsellBottomSheet] */
    /* JADX WARN: Type inference failed for: r0v2795, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r0v894, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v925, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r319v52 */
    /* JADX WARN: Type inference failed for: r319v53 */
    /* JADX WARN: Type inference failed for: r319v60 */
    /* JADX WARN: Type inference failed for: r374v6 */
    /* JADX WARN: Type inference failed for: r374v7 */
    /* JADX WARN: Type inference failed for: r374v8 */
    @Override // com.facebook.msys.mca.MailboxCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 13503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Czk.onCompletion(java.lang.Object):void");
    }
}

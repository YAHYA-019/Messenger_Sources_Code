package com.facebook.messenger.orca;

import X.1qX;
import X.7gZ;
import X.C07924lC;
import X.C0il;
import X.C5pn;
import X.C5pt;
import X.C5wc;
import X.C7ga;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.CQLResultSetImpl;
import com.facebook.msys.mci.JQLResultSet;

/* loaded from: ChildResultSetUtils.class */
public class ChildResultSetUtils {
    public static ChildResultSetUtils sInstance;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.messenger.orca.ChildResultSetUtils, java.lang.Object] */
    static {
        C0il.A0B("messengerorcachildresultsetutils");
        sInstance = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.5wc, X.1qX] */
    public static C5wc getOrcaTempMessageAttachmentItemListFromOrcaTempMessageList(C07924lC c07924lC, int i) {
        CQLResultSet cQLResultSet = ((1qX) c07924lC).mResultSet;
        CQLResultSet A02 = cQLResultSet instanceof JQLResultSet ? ((JQLResultSet) cQLResultSet).A02("attachmentItems", i) : getOrcaTempMessageAttachmentItemListFromOrcaTempMessageListNative((CQLResultSetImpl) cQLResultSet, i);
        if (A02 != null) {
            return new 1qX(A02);
        }
        return null;
    }

    public static native CQLResultSetImpl getOrcaTempMessageAttachmentItemListFromOrcaTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    /* JADX WARN: Type inference failed for: r0v10, types: [X.5pt, X.1qX] */
    public static C5pt getOrcaTempMessageAttachmentListFromOrcaTempMessageList(C07924lC c07924lC, int i) {
        CQLResultSet cQLResultSet = ((1qX) c07924lC).mResultSet;
        CQLResultSet A02 = cQLResultSet instanceof JQLResultSet ? ((JQLResultSet) cQLResultSet).A02("attachments", i) : getOrcaTempMessageAttachmentListFromOrcaTempMessageListNative((CQLResultSetImpl) cQLResultSet, i);
        if (A02 != null) {
            return new 1qX(A02);
        }
        return null;
    }

    public static native CQLResultSetImpl getOrcaTempMessageAttachmentListFromOrcaTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static 7gZ getOrcaTempMessageEditHistoryListFromOrcaTempMessageList(C07924lC c07924lC, int i) {
        CQLResultSet cQLResultSet = ((1qX) c07924lC).mResultSet;
        CQLResultSet A02 = cQLResultSet instanceof JQLResultSet ? ((JQLResultSet) cQLResultSet).A02("editHistory", i) : getOrcaTempMessageEditHistoryListFromOrcaTempMessageListNative((CQLResultSetImpl) cQLResultSet, i);
        if (A02 != null) {
            return new 1qX(A02);
        }
        return null;
    }

    public static native CQLResultSetImpl getOrcaTempMessageEditHistoryListFromOrcaTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    /* JADX WARN: Type inference failed for: r0v10, types: [X.5pn, X.1qX] */
    public static C5pn getOrcaTempMessageReactionListFromOrcaTempMessageList(C07924lC c07924lC, int i) {
        CQLResultSet cQLResultSet = ((1qX) c07924lC).mResultSet;
        CQLResultSet A02 = cQLResultSet instanceof JQLResultSet ? ((JQLResultSet) cQLResultSet).A02("reactions", i) : getOrcaTempMessageReactionListFromOrcaTempMessageListNative((CQLResultSetImpl) cQLResultSet, i);
        if (A02 != null) {
            return new 1qX(A02);
        }
        return null;
    }

    public static native CQLResultSetImpl getOrcaTempMessageReactionListFromOrcaTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getOrcaTempMessageReactionsSummaryFromOrcaTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    /* JADX WARN: Type inference failed for: r0v10, types: [X.7ga, X.1qX] */
    public static C7ga getOrcaTempMessageReactionsV2CountListFromOrcaTempMessageList(C07924lC c07924lC, int i) {
        CQLResultSet cQLResultSet = ((1qX) c07924lC).mResultSet;
        CQLResultSet A02 = cQLResultSet instanceof JQLResultSet ? ((JQLResultSet) cQLResultSet).A02("reactionsV2CountList", i) : getOrcaTempMessageReactionsV2CountListFromOrcaTempMessageListNative((CQLResultSetImpl) cQLResultSet, i);
        if (A02 != null) {
            return new 1qX(A02);
        }
        return null;
    }

    public static native CQLResultSetImpl getOrcaTempMessageReactionsV2CountListFromOrcaTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getOrcaTempMessageReplyAttachmentListFromOrcaTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getOrcaThreadListParticipantListFromOrcaThreadListNative(CQLResultSetImpl cQLResultSetImpl, int i);
}

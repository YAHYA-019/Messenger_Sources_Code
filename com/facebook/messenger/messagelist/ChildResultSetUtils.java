package com.facebook.messenger.messagelist;

import X.C0il;
import com.facebook.msys.mci.CQLResultSetImpl;

/* loaded from: ChildResultSetUtils.class */
public class ChildResultSetUtils {
    public static ChildResultSetUtils sInstance;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.messenger.messagelist.ChildResultSetUtils, java.lang.Object] */
    static {
        C0il.A0B("messengermessagelistchildresultsetutils");
        sInstance = new Object();
    }

    public static native CQLResultSetImpl getTempMessageAttachmentItemListFromTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getTempMessageAttachmentListFromTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getTempMessageEditHistoryListFromTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getTempMessageReactionListFromTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getTempMessageReactionV2ListFromTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getTempMessageReplyAttachmentListFromTempMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);
}

package com.facebook.messenger.msg_pinned_messages;

import X.C0il;
import com.facebook.msys.mci.CQLResultSetImpl;

/* loaded from: ChildResultSetUtils.class */
public class ChildResultSetUtils {
    public static ChildResultSetUtils sInstance;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.facebook.messenger.msg_pinned_messages.ChildResultSetUtils] */
    static {
        C0il.A0B("messengerpinnedmessageschildresultsetutils");
        sInstance = new Object();
    }

    public static native CQLResultSetImpl getOrcaTempMessageAttachmentListFromOrcaPinnedMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getOrcaTempMessageReactionListFromOrcaPinnedMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);

    public static native CQLResultSetImpl getOrcaTempMessageReplyAttachmentListFromOrcaPinnedMessageListNative(CQLResultSetImpl cQLResultSetImpl, int i);
}

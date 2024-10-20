package com.facebook.channelhealth.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxChannelHealthJNI.class */
public class MailboxChannelHealthJNI {
    static {
        C0il.A0B("mailboxchannelhealthjni");
    }

    public static final native void dispatchVO(int i, Object obj);

    public static final native void dispatchVOZ(int i, Object obj, boolean z);

    public static final native void dispatchVOZZ(int i, Object obj, boolean z, boolean z2);

    public static final native List getHeaderFields();
}

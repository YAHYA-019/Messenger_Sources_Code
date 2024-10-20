package com.facebook.tamattachmentupload.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxTamAttachmentUploadJNI.class */
public class MailboxTamAttachmentUploadJNI {
    static {
        C0il.A0B("mailboxtamattachmentuploadjni");
    }

    public static final native Object dispatchOOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}

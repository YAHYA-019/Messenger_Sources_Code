package com.facebook.messengerfoldermetadata.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxMessengerFolderMetadataJNI.class */
public class MailboxMessengerFolderMetadataJNI {
    static {
        C0il.A0B("mailboxmessengerfoldermetadatajni");
    }

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native List getHeaderFields();
}

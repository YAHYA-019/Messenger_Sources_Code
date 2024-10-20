package com.facebook.sharedalbum.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxSharedAlbumJNI.class */
public class MailboxSharedAlbumJNI {
    static {
        C0il.A0B("mailboxsharedalbumjni");
    }

    public static final native Object dispatchCqlOIOOOOO(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchDasmOJJOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOJJOOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native Object dispatchDasmOJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchDasmOJOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchOJOO(int i, long j, Object obj, Object obj2);

    public static final native void dispatchVJJJOO(int i, long j, long j2, long j3, Object obj, Object obj2);

    public static final native void dispatchVO(int i, Object obj);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields();
}

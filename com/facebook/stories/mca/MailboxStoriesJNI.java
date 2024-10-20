package com.facebook.stories.mca;

import X.C0il;
import java.util.List;

/* loaded from: MailboxStoriesJNI.class */
public class MailboxStoriesJNI {
    static {
        C0il.A0B("mailboxstoriesjni");
    }

    public static final native Object dispatchCqlOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchCqlOIOOOOZ(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchDasmOIIJJJOOOOOOOOOOOOOOOOOOOO(int i, int i2, int i3, long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20);

    public static final native Object dispatchDasmOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchDasmOIOOOO(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchDasmOJJOO(int i, long j, long j2, Object obj, Object obj2);

    public static final native Object dispatchDasmOOOZ(int i, Object obj, Object obj2, boolean z);

    public static final native void dispatchVIIJOO(int i, int i2, int i3, long j, Object obj, Object obj2);

    public static final native void dispatchVIOOOO(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native void dispatchVJOOO(int i, long j, Object obj, Object obj2, Object obj3);

    public static final native void dispatchVJOOOOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static final native void dispatchVOOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public static final native List getHeaderFields();
}

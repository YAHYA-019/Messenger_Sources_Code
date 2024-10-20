package com.facebook.msys.mca;

import X.1Vt;
import com.facebook.simplejni.NativeHolder;
import java.util.List;

/* loaded from: MailboxHealthReport.class */
public class MailboxHealthReport {
    public NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public MailboxHealthReport(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native void cleanupContext();

    public static native void endHealthReport();

    private native boolean nativeEquals(Object obj);

    public static native boolean nativeStart(Mailbox mailbox, String str);

    public static native MailboxHealthReport retrieve();

    public static boolean start(Mailbox mailbox, String str) {
        return nativeStart(mailbox, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MailboxHealthReport) {
            return nativeEquals(obj);
        }
        return false;
    }

    public native List getAllErrors();

    public native List getAllExtendedErrors();

    public native int getError();

    public native long getExtendedError();

    public native long getStatCount(int i);

    public native int hashCode();

    public native String toString();
}

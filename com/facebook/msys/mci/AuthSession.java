package com.facebook.msys.mci;

import X.1SL;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AuthSession.class */
public abstract class AuthSession {
    public final NativeHolder mNativeHolder;

    /* loaded from: AuthSession$CompletionListener.class */
    public interface CompletionListener {
        void onAuthComplete(AuthData authData, RedactedString redactedString, Throwable th);
    }

    static {
        1SL.A00();
    }

    private native void exchangeTokenNative(AuthData authData, CompletionListener completionListener);

    private native void facebookLoginNative(String str, String str2, String str3, AuthData authData, CompletionListener completionListener);

    private native void facebookWorkAccountLoginNative(String str, String str2, String str3, AuthData authData, CompletionListener completionListener);

    public static native NativeHolder initNativeHolder(NetworkSession networkSession, AppInfo appInfo);

    private native void loadUserNative(AuthData authData, CompletionListener completionListener);

    private native void logOutNative(NetworkSession networkSession, AuthData authData, CompletionListener completionListener);

    private native void personalToWorkSwitchNative(String str, AuthData authData, CompletionListener completionListener);
}

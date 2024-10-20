package com.facebook.messenger.plugins.mediareceiverfetchplugin;

import X.C0il;
import com.facebook.simplejni.NativeHolder;

/* loaded from: OrcaMediaReceiverFetchPluginCallbacks.class */
public class OrcaMediaReceiverFetchPluginCallbacks {

    /* loaded from: OrcaMediaReceiverFetchPluginCallbacks$MediaReceiverFetchExecutionCallback.class */
    public class MediaReceiverFetchExecutionCallback {
        public final NativeHolder mNativeHolder;

        static {
            C0il.A0B("OrcaMediaReceiverFetchPluginjni");
        }

        public MediaReceiverFetchExecutionCallback(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        private native void runJNI(String str, String str2, Number number, Number number2, String str3, Number number3, Number number4, Number number5);

        public void run(String str, String str2, Number number, Number number2, String str3, Number number3, Number number4, Number number5) {
            if (str == null) {
                str = null;
            }
            if (str2 == null) {
                str2 = null;
            }
            if (number == null) {
                number = null;
            }
            if (number2 == null) {
                number2 = null;
            }
            if (str3 == null) {
                str3 = null;
            }
            if (number3 == null) {
                number3 = null;
            }
            if (number4 == null) {
                number4 = null;
            }
            if (number5 == null) {
                number5 = null;
            }
            runJNI(str, str2, number, number2, str3, number3, number4, number5);
        }
    }
}

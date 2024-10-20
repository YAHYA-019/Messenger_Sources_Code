package com.facebook.simplejni.fataljavaexceptiondescriptionhandler.breakpad;

import X.1rK;
import X.C0il;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: BreakpadFatalJavaExceptionDescriptionHandler.class */
public final class BreakpadFatalJavaExceptionDescriptionHandler {
    public static final Companion Companion = new Object();

    /* loaded from: BreakpadFatalJavaExceptionDescriptionHandler$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Runnable breakpadHandlerRegistrationRunnable() {
            return 1rK.A00;
        }

        public final void registerBreakpadFatalJavaExceptionDescriptionHandler() {
            BreakpadFatalJavaExceptionDescriptionHandler.registerBreakpadFatalJavaExceptionDescriptionHandler();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.simplejni.fataljavaexceptiondescriptionhandler.breakpad.BreakpadFatalJavaExceptionDescriptionHandler$Companion] */
    static {
        C0il.A0B("breakpad-fatal-java-exception-description-handler-jni");
    }

    public static final Runnable breakpadHandlerRegistrationRunnable() {
        return 1rK.A00;
    }

    public static final native void registerBreakpadFatalJavaExceptionDescriptionHandler();
}

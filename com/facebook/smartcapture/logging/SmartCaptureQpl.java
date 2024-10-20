package com.facebook.smartcapture.logging;

import X.11T;
import X.1Br;
import X.7zM;
import X.7zP;
import X.AnonymousClass001;
import X.C06w;
import X.C06z;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SmartCaptureQpl.class */
public final class SmartCaptureQpl {
    public static final String ANNOTATION_KEY_INFRA = "upload_infra";
    public static final String ANNOTATION_KEY_MEDIUM = "medium";
    public static final String ANNOTATION_KEY_PRODUCT = "product";
    public static final String ANNOTATION_KEY_PRODUCT_FRAMEWORK = "product_framework";
    public static final String ANNOTATION_KEY_SIZE = "upload_size";
    public final 1Br qpl$delegate = 7zM.A0S();
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(SmartCaptureQpl.class, "qpl", "getQpl()Lcom/facebook/quicklog/QuickPerformanceLogger;", 0)};
    public static final Companion Companion = new Object();

    /* loaded from: SmartCaptureQpl$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final QuickPerformanceLogger getQpl() {
        return 7zP.A0e(this.qpl$delegate);
    }

    public final void scpUploadFail() {
        7zP.A0e(this.qpl$delegate).markerEnd(33882114, (short) 3);
    }

    public final void scpUploadStart(String str, String str2, String str3, File file, String str4) {
        11T.A0F(file, 3);
        7zP.A0e(this.qpl$delegate).markerStart(33882114, "upload_infra", str);
        7zP.A0e(this.qpl$delegate).markerAnnotate(33882114, "product", str2);
        7zP.A0e(this.qpl$delegate).markerAnnotate(33882114, ANNOTATION_KEY_PRODUCT_FRAMEWORK, str3);
        7zP.A0e(this.qpl$delegate).markerAnnotate(33882114, ANNOTATION_KEY_MEDIUM, str4);
        7zP.A0e(this.qpl$delegate).markerAnnotate(33882114, ANNOTATION_KEY_SIZE, file.length());
    }

    public final void scpUploadStart(String str, String str2, String str3, String str4, String str5) {
        scpUploadStart(str, str2, str3, AnonymousClass001.A0E(str4), str5);
    }

    public final void scpUploadSuccess() {
        7zP.A0e(this.qpl$delegate).markerEnd(33882114, (short) 2);
    }
}

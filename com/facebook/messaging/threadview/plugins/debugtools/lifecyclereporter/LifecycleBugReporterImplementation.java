package com.facebook.messaging.threadview.plugins.debugtools.lifecyclereporter;

import X.0fH;
import X.6Jp;
import X.C0dp;
import com.facebook.common.stringformat.StringFormatUtil;
import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;

/* loaded from: LifecycleBugReporterImplementation.class */
public final class LifecycleBugReporterImplementation {
    public 6Jp A00;

    public static void A00(LifecycleBugReporterImplementation lifecycleBugReporterImplementation, String str) {
        0fH.A0j("ThreadViewLifecycle", str);
        6Jp r0 = lifecycleBugReporterImplementation.A00;
        0fH.A0j("ThreadLifecycle", str);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s : %s", DateFormat.getTimeInstance(1, Locale.US).format(new Date(((C0dp) r0.A00.get()).now())), str);
        LinkedList linkedList = r0.A01;
        linkedList.add(formatStrLocaleSafe);
        while (linkedList.size() > 200) {
            linkedList.removeFirst();
        }
    }
}

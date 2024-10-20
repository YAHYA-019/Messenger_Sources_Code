package com.facebook.messaging.quickpromotion.filter;

import X.C0il;
import X.C22l;
import X.C22o;
import java.util.Map;

/* loaded from: QPFilterDispatcher.class */
public class QPFilterDispatcher {
    public static Map sExternalFilters;
    public static boolean sInitialized;
    public static C22o sQPFilterHandler;

    static {
        synchronized (C22l.class) {
            if (!C22l.A00) {
                C0il.A0B("messengerqpfilterdispatcherjni");
                C22l.A00 = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0136, code lost:
    
        if (r312 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c6, code lost:
    
        if (r312 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0226, code lost:
    
        if (r312 == null) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r312v3, types: [X.1pP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r312v6, types: [X.1pP, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int evaluateQPFilter(java.lang.String r301, java.lang.String r302, java.lang.Long r303, java.lang.Double r304, java.lang.Boolean r305, java.util.Map r306) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.quickpromotion.filter.QPFilterDispatcher.evaluateQPFilter(java.lang.String, java.lang.String, java.lang.Long, java.lang.Double, java.lang.Boolean, java.util.Map):int");
    }

    public static native void nativeInitialize();
}

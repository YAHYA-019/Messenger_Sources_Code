package com.facebook.fury.context;

import X.02X;

/* loaded from: ReqContextTypeResolver.class */
public class ReqContextTypeResolver {
    public static volatile 02X sProvider;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0289, code lost:
    
        if (r303 == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int resolveName(java.lang.String r301) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fury.context.ReqContextTypeResolver.resolveName(java.lang.String):int");
    }

    public static String resolveType(int i) {
        if (sProvider == null) {
            return null;
        }
        switch (i) {
            case 1:
                return "litho";
            case 2:
                return "data_fetch";
            case 3:
                return "graphql_java";
            case 4:
                return "app_jobs";
            case 5:
                return "app_choreographer";
            case 6:
                return "fresco";
            case 7:
                return "tigon_java";
            case 8:
                return "tigon_liger_native";
            case 9:
                return "tigon_native";
            case 10:
                return "graphservice_native";
            case 11:
                return "graphservice_jni";
            case 12:
                return "fb_app_initializer";
            case 13:
                return "combined_thread_pool";
            case 14:
                return "android_thread_utils";
            case 15:
                return "nt_async_action_controller";
            case 16:
                return "react_native_http";
            case 17:
                return "geo_location";
            case 18:
                return "handler_background_handler";
            case 19:
                return "fresh_feed_network_handler";
            case 20:
                return "ui_components";
            case 21:
                return "fb4a_activity";
            case 22:
                return "blue_service_queue";
            case 23:
                return "fb_async_task";
            case 24:
                return "handler_listening_executor_service";
            case 25:
                return "omnistore";
            case 26:
                return "csr_data_loader_handler";
            case 27:
                return "conditional_worker";
            default:
                return "";
        }
    }

    public static void setProvider(02X r301) {
        sProvider = r301;
    }
}

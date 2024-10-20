package com.facebook.messaging.media.prefetch.source;

/* loaded from: MediaPrefetchRequestSource.class */
public abstract class MediaPrefetchRequestSource {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "STORIES_VIEWER_AD_PREFETCHING";
            case 2:
                return "STORIES_OMNISTORE_DELTA_PREFETCH";
            case 3:
                return "STORIES_INBOX_UNIT_PREFETCH";
            case 4:
                return "STORIES_TAB_THUMBNAIL_PREFETCH";
            case 5:
                return "SYNC_DELTA_PREFETCH";
            case 6:
                return "THREAD_VIEW_PREFETCH";
            case 7:
                return "MEDIA_VIEW_PREFETCH";
            default:
                return "STORIES_VIEWER_WINDOW_PREFETCH";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r301.equals(X.0S2.A01) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(java.lang.Integer r301) {
        /*
            java.lang.Integer r0 = X.0S2.A00
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L20
            java.lang.Integer r0 = X.0S2.A01
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L22
        L20:
            r0 = 1
            r303 = r0
        L22:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.prefetch.source.MediaPrefetchRequestSource.A01(java.lang.Integer):boolean");
    }
}

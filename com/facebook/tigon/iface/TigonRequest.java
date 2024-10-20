package com.facebook.tigon.iface;

import X.AnonymousClass414;
import X.C40y;
import X.EnumC04093zx;
import java.util.Map;

/* loaded from: TigonRequest.class */
public interface TigonRequest {
    public static final Companion Companion = Companion.A00;
    public static final String FETCH = "fetch";
    public static final String GET = "GET";
    public static final String HEAD = "HEAD";
    public static final String POST = "POST";
    public static final String PREFETCH = "prefetch";

    /* loaded from: TigonRequest$Companion.class */
    public final class Companion {
        public static final /* synthetic */ Companion A00 = new Object();
        public static final String FETCH = "fetch";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String POST = "POST";
        public static final String PREFETCH = "prefetch";
    }

    long addedToMiddlewareSinceEpochMS();

    TigonAuthHandler authHandler();

    long connectionTimeoutMS();

    long expectedResponseSizeBytes();

    Object getLayerInformation(AnonymousClass414 anonymousClass414);

    Map headers();

    C40y httpPriority();

    HttpPriorityContext httpPriorityContext();

    long idleTimeoutMS();

    String loggingId();

    String method();

    boolean replaySafe();

    EnumC04093zx requestCategory();

    long requestTimeoutMS();

    boolean retryable();

    int startupStatusOnAdded();

    int tigonPriority();

    String url();
}

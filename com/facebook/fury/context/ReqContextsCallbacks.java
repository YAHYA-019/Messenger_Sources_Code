package com.facebook.fury.context;

import com.facebook.fury.props.ReqPropsProvider;

/* loaded from: ReqContextsCallbacks.class */
public interface ReqContextsCallbacks {
    long getCurrentThreadId();

    int getTrackingPolicy();

    ReqContextLifecycleCallbacks provideLifecycleCallbacks();

    ReqContextExtensions provideReqContextExtensions();

    ReqPropsProvider provideReqPropsProvider();
}

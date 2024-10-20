package com.facebook.fury.context;

import com.facebook.fury.props.ReadableProps;

/* loaded from: AcediaReqContext.class */
public interface AcediaReqContext extends ReqContext {
    int getFlags();

    ReadableProps getReqChainProps();

    ReadableProps getReqContextProps();

    boolean isPlaceholder();
}

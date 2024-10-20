package com.facebook.fury.props;

import com.facebook.fury.context.ReqContext;

/* loaded from: ReqPropsProvider.class */
public interface ReqPropsProvider {
    boolean canEnhanceCurrentScope(ReqContext reqContext, int i, int i2);

    void copyProps(ReadableProps readableProps, WritableProps writableProps);

    void fillReqChainProps(WritableProps writableProps, int i, int i2);

    void fillReqContextProps(WritableProps writableProps, ReqContext reqContext, int i, int i2);

    boolean shouldFillReqChainProps(int i, int i2);

    boolean shouldFillReqContextProps(ReqContext reqContext, int i, int i2);
}

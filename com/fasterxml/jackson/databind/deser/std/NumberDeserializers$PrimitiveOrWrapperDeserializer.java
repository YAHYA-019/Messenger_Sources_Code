package com.fasterxml.jackson.databind.deser.std;

import X.C42x;

/* loaded from: NumberDeserializers$PrimitiveOrWrapperDeserializer.class */
public abstract class NumberDeserializers$PrimitiveOrWrapperDeserializer extends StdScalarDeserializer {
    public static final long serialVersionUID = 1;
    public final Object _emptyValue;
    public final C42x _logicalType;
    public final Object _nullValue;
    public final boolean _primitive;

    public NumberDeserializers$PrimitiveOrWrapperDeserializer(C42x c42x, Class cls, Object obj, Object obj2) {
        super(cls);
        this._logicalType = c42x;
        this._nullValue = obj;
        this._emptyValue = obj2;
        this._primitive = cls.isPrimitive();
    }
}

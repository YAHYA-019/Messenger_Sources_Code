package com.fasterxml.jackson.databind.ser.impl;

import X.24S;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: UnsupportedTypeSerializer.class */
public class UnsupportedTypeSerializer extends StdSerializer {
    public static final long serialVersionUID = 1;
    public final String _message;
    public final 24S _type;

    public UnsupportedTypeSerializer(24S r302, String str) {
        super(Object.class);
        this._type = r302;
        this._message = str;
    }
}

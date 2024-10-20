package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* loaded from: FailingSerializer.class */
public class FailingSerializer extends StdSerializer {
    public final String _msg;

    public FailingSerializer() {
        super(Object.class);
        this._msg = "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)";
    }
}

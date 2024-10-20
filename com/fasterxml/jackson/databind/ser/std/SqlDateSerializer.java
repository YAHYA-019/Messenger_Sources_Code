package com.fasterxml.jackson.databind.ser.std;

import java.sql.Date;

/* loaded from: SqlDateSerializer.class */
public class SqlDateSerializer extends DateTimeSerializerBase {
    public SqlDateSerializer() {
        super(null, Date.class, null);
    }
}

package com.fasterxml.jackson.databind.ser.std;

import java.sql.Time;

/* loaded from: SqlTimeSerializer.class */
public class SqlTimeSerializer extends StdScalarSerializer {
    public SqlTimeSerializer() {
        super(Time.class);
    }
}

package com.fasterxml.jackson.databind.ext;

import X.1BL;
import X.28Q;
import X.C26a;
import X.C26c;
import X.C2cb;
import X.C42h;
import X.C4Nr;
import X.Kls;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.sql.Blob;
import java.sql.SQLException;

/* loaded from: SqlBlobSerializer.class */
public class SqlBlobSerializer extends StdScalarSerializer {
    public SqlBlobSerializer() {
        super(Blob.class);
    }

    public static void A03(28Q r301, C26c c26c, Blob blob) {
        try {
            r301.A0W(c26c._config._base._defaultBase64, blob.getBinaryStream(), -1);
        } catch (SQLException e) {
            throw new C2cb(((C26a) c26c).A00, "Failed to access `java.sql.Blob` value to write as binary value", e);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Blob blob = (Blob) obj;
        Kls A0Z = 1BL.A0Z(r302, C42h.A07, c4Nr, blob);
        A03(r302, c26c, blob);
        c4Nr.A02(r302, A0Z);
    }
}

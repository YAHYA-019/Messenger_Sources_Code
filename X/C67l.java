package X;

import com.fasterxml.jackson.databind.ext.Java7HandlersImpl;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import java.io.Serializable;
import java.util.HashMap;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* renamed from: X.67l, reason: invalid class name */
/* loaded from: 67l.class */
public final class C67l implements Serializable {
    public static final Java7HandlersImpl A00;
    public static final C67l A01;
    public static final long serialVersionUID = 1;
    public final java.util.Map _sqlDeserializers;
    public final java.util.Map _sqlSerializers;
    public static final Class A03 = Node.class;
    public static final Class A02 = Document.class;

    static {
        Java7HandlersImpl java7HandlersImpl = null;
        try {
            java7HandlersImpl = Java7HandlersImpl.A00;
        } catch (Throwable unused) {
        }
        A00 = java7HandlersImpl;
        A01 = new C67l();
    }

    public C67l() {
        HashMap hashMap = new HashMap();
        this._sqlDeserializers = hashMap;
        hashMap.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        hashMap.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap hashMap2 = new HashMap();
        this._sqlSerializers = hashMap2;
        hashMap2.put("java.sql.Timestamp", DateSerializer.A00);
        hashMap2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        hashMap2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        hashMap2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        hashMap2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public static Object A00(24S r301, String str) {
        IllegalStateException A0N;
        try {
            try {
                return 27C.A03(Class.forName(str), false);
            } finally {
            }
        } catch (Throwable th) {
            throw AnonymousClass001.A0N(0Pz.A13("Failed to find class `", str, "` for handling values of type ", 27C.A04(r301), ", problem: (", AnonymousClass001.A0Y(th), ") ", th.getMessage()));
        }
    }
}

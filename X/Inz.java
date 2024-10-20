package X;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: Inz.class */
public final class Inz implements Serializable {
    public static java.util.Map A00 = new ConcurrentHashMap();
    public final String fieldName;
    public final byte requirementType;
    public final Io0 valueMetaData;

    public Inz(Io0 io0, String str, byte b) {
        this.fieldName = str;
        this.requirementType = b;
        this.valueMetaData = io0;
    }
}

package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.7Rt, reason: invalid class name */
/* loaded from: 7Rt.class */
public final class C7Rt implements Serializable {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer _deserializer;
    public final 24S _idType;
    public final 3eQ generator;
    public final 68S idProperty;
    public final C26G propertyName;
    public final MCW resolver;

    public C7Rt(3eQ r302, MCW mcw, 24S r304, JsonDeserializer jsonDeserializer, C26G c26g, 68S r307) {
        this._idType = r304;
        this.propertyName = c26g;
        this.generator = r302;
        this.resolver = mcw;
        this._deserializer = jsonDeserializer;
        this.idProperty = r307;
    }
}

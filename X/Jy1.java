package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: Jy1.class */
public final class Jy1 extends C28g implements Serializable {
    public static final long serialVersionUID = 1;
    public HashMap _classMappings = null;
    public boolean _hasEnumDeserializer = false;

    private final JsonDeserializer A00(24S r302) {
        HashMap hashMap = this._classMappings;
        if (hashMap == null) {
            return null;
        }
        return (JsonDeserializer) hashMap.get(new Liw(r302._class));
    }

    @Override // X.C28g, X.C27J
    public JsonDeserializer ASV(C26L c26l, JsonDeserializer jsonDeserializer, AnonymousClass251 anonymousClass251, C68e c68e, C42k c42k) {
        return A00(c42k);
    }

    @Override // X.C27J
    public JsonDeserializer ASX(C26L c26l, 24S r303, AnonymousClass251 anonymousClass251) {
        return A00(r303);
    }

    @Override // X.C27J
    public JsonDeserializer ASb(C26L c26l, JsonDeserializer jsonDeserializer, AnonymousClass251 anonymousClass251, C68e c68e, 3Bw r306) {
        return A00(r306);
    }

    @Override // X.C28g, X.C27J
    public JsonDeserializer ASc(C26L c26l, JsonDeserializer jsonDeserializer, AnonymousClass251 anonymousClass251, C68e c68e, C31a c31a) {
        return A00(c31a);
    }

    @Override // X.C28g, X.C27J
    public JsonDeserializer ASh(C26L c26l, AnonymousClass251 anonymousClass251, Class cls) {
        JsonDeserializer jsonDeserializer;
        HashMap hashMap = this._classMappings;
        if (hashMap == null) {
            jsonDeserializer = null;
        } else {
            jsonDeserializer = (JsonDeserializer) hashMap.get(new Liw(cls));
            if (jsonDeserializer == null && this._hasEnumDeserializer && cls.isEnum()) {
                return (JsonDeserializer) this._classMappings.get(new Liw(Enum.class));
            }
        }
        return jsonDeserializer;
    }

    @Override // X.C27J
    public JsonDeserializer ASp(C26L c26l, JsonDeserializer jsonDeserializer, KnN knN, AnonymousClass251 anonymousClass251, C68e c68e, C4E6 c4e6) {
        return A00(c4e6);
    }

    @Override // X.C27J
    public JsonDeserializer ASq(C26L c26l, JsonDeserializer jsonDeserializer, KnN knN, AnonymousClass251 anonymousClass251, C68e c68e, C4E7 c4e7) {
        return A00(c4e7);
    }

    @Override // X.C27J
    public JsonDeserializer ASx(C26L c26l, JsonDeserializer jsonDeserializer, AnonymousClass251 anonymousClass251, C68e c68e, 3Bx r306) {
        return A00(r306);
    }

    @Override // X.C28g, X.C27J
    public JsonDeserializer ASz(C26L c26l, AnonymousClass251 anonymousClass251, Class cls) {
        HashMap hashMap = this._classMappings;
        if (hashMap == null) {
            return null;
        }
        return (JsonDeserializer) hashMap.get(new Liw(cls));
    }
}

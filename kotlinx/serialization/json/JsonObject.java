package kotlinx.serialization.json;

import X.0QD;
import X.11T;
import X.5Yu;
import X.AnonymousClass002;
import X.AnonymousClass116;
import X.LuL;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: JsonObject.class */
public final class JsonObject extends JsonElement implements Map, AnonymousClass116 {
    public static final Companion Companion = new Object();
    public final Map A00;

    /* loaded from: JsonObject$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JsonObjectSerializer.A01;
        }
    }

    public JsonObject(Map map) {
        11T.A0F(map, 1);
        this.A00 = map;
    }

    @Override // java.util.Map
    public void clear() {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        11T.A0F(obj, 0);
        return this.A00.containsKey(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        11T.A0F(obj, 0);
        return this.A00.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return this.A00.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return 11T.A0O(this.A00, obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        11T.A0F(obj, 0);
        return this.A00.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return this.A00.keySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public String toString() {
        return 0QD.A0K(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "{", "}", this.A00.entrySet(), new LuL(2), -1);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return this.A00.values();
    }
}

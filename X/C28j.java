package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.guava.ser.CacheSerializer;
import com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer;
import com.fasterxml.jackson.datatype.guava.ser.RangeSerializer;
import com.fasterxml.jackson.datatype.guava.ser.TableSerializer;
import com.google.common.collect.Range;
import java.util.Set;

/* renamed from: X.28j, reason: invalid class name */
/* loaded from: 28j.class */
public class C28j implements 28X {
    public JsonSerializer ASW(JsonSerializer jsonSerializer, C25p c25p, AnonymousClass251 anonymousClass251, C4Nr c4Nr, C42k c42k) {
        return null;
    }

    public JsonSerializer ASd(JsonSerializer jsonSerializer, C25p c25p, AnonymousClass251 anonymousClass251, C4Nr c4Nr, C31a c31a) {
        return null;
    }

    public JsonSerializer ASe(JsonSerializer jsonSerializer, C25p c25p, AnonymousClass251 anonymousClass251, C4Nr c4Nr, 3Bw r306) {
        return null;
    }

    public JsonSerializer ASr(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, C25p c25p, AnonymousClass251 anonymousClass251, C4Nr c4Nr, C4E7 c4e7) {
        if (!(this instanceof C28i)) {
            return null;
        }
        Set set = null;
        if (!1Mu.class.isAssignableFrom(((24S) c4e7)._class)) {
            return null;
        }
        AnonymousClass248 A02 = c25p.A02();
        C24q c24q = anonymousClass251.A07;
        Object A0b = A02.A0b(c24q);
        68Z A0A = c25p.A0A(c24q, 1Mu.class);
        if (A0A != null) {
            set = A0A._ignored;
        }
        return new MultimapSerializer(jsonSerializer, jsonSerializer2, c4Nr, c4e7, A0b, set);
    }

    public JsonSerializer ASs(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, C25p c25p, AnonymousClass251 anonymousClass251, C4Nr c4Nr, C4E6 c4e6) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    public JsonSerializer ASy(24S r302, C25p c25p, AnonymousClass251 anonymousClass251) {
        if (!(this instanceof C28i)) {
            return null;
        }
        Class cls = r302._class;
        if (C3Oc.class.isAssignableFrom(cls)) {
            return new Object();
        }
        if (Range.class.isAssignableFrom(cls)) {
            return new RangeSerializer(C28i.A00(r302, Range.class), null, L6w.A00);
        }
        if (L5M.class.isAssignableFrom(cls)) {
            return new TableSerializer(C28i.A00(r302, L5M.class));
        }
        if (3eX.class.isAssignableFrom(cls) || 3TD.class.isAssignableFrom(cls) || 3IN.class.isAssignableFrom(cls) || C1k8.class.isAssignableFrom(cls) || 1U9.class.isAssignableFrom(cls)) {
            return ToStringSerializer.A00;
        }
        if (1qE.class.isAssignableFrom(cls)) {
            return new StdDelegatingSerializer(C28i.A00(r302, Iterable.class), null, 3dF.A00);
        }
        if (C1ko.class.isAssignableFrom(cls)) {
            return new CacheSerializer();
        }
        return null;
    }
}

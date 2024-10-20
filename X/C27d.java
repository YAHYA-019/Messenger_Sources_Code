package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.ClassSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.FileSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: X.27d, reason: invalid class name */
/* loaded from: 27d.class */
public abstract class C27d extends C26u implements Serializable {
    public static final HashMap A00;
    public static final HashMap A01;
    public final 28V _factoryConfig;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.A00;
        hashMap2.put(StringBuffer.class.getName(), toStringSerializer);
        hashMap2.put(StringBuilder.class.getName(), toStringSerializer);
        hashMap2.put(Character.class.getName(), toStringSerializer);
        hashMap2.put(Character.TYPE.getName(), toStringSerializer);
        String name = Integer.class.getName();
        C27n c27n = C27n.INT;
        hashMap2.put(name, new NumberSerializers$Base(c27n, Integer.class, "integer"));
        Class cls = Integer.TYPE;
        hashMap2.put(cls.getName(), new NumberSerializers$Base(c27n, cls, "integer"));
        String name2 = Long.class.getName();
        C27n c27n2 = C27n.LONG;
        hashMap2.put(name2, new NumberSerializers$Base(c27n2, Long.class, "number"));
        Class cls2 = Long.TYPE;
        hashMap2.put(cls2.getName(), new NumberSerializers$Base(c27n2, cls2, "number"));
        String name3 = Byte.class.getName();
        NumberSerializers$IntLikeSerializer numberSerializers$IntLikeSerializer = NumberSerializers$IntLikeSerializer.A00;
        hashMap2.put(name3, numberSerializers$IntLikeSerializer);
        hashMap2.put(Byte.TYPE.getName(), numberSerializers$IntLikeSerializer);
        String name4 = Short.class.getName();
        NumberSerializers$ShortSerializer numberSerializers$ShortSerializer = NumberSerializers$ShortSerializer.A00;
        hashMap2.put(name4, numberSerializers$ShortSerializer);
        hashMap2.put(Short.TYPE.getName(), numberSerializers$ShortSerializer);
        String name5 = Double.class.getName();
        C27n c27n3 = C27n.DOUBLE;
        hashMap2.put(name5, new NumberSerializers$Base(c27n3, Double.class, "number"));
        Class cls3 = Double.TYPE;
        hashMap2.put(cls3.getName(), new NumberSerializers$Base(c27n3, cls3, "number"));
        String name6 = Float.class.getName();
        NumberSerializers$FloatSerializer numberSerializers$FloatSerializer = NumberSerializers$FloatSerializer.A00;
        hashMap2.put(name6, numberSerializers$FloatSerializer);
        hashMap2.put(Float.TYPE.getName(), numberSerializers$FloatSerializer);
        hashMap2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        hashMap2.put(Boolean.class.getName(), new BooleanSerializer(false));
        hashMap2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), CalendarSerializer.A00);
        hashMap2.put(Date.class.getName(), DateSerializer.A00);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(URL.class, new StdSerializer(URL.class, false));
        hashMap3.put(URI.class, new StdSerializer(URI.class, false));
        hashMap3.put(Currency.class, new StdSerializer(Currency.class, false));
        hashMap3.put(UUID.class, new UUIDSerializer(null));
        hashMap3.put(Pattern.class, new StdSerializer(Pattern.class, false));
        hashMap3.put(Locale.class, new StdSerializer(Locale.class, false));
        hashMap3.put(AtomicBoolean.class, StdJdkSerializers$AtomicBooleanSerializer.class);
        hashMap3.put(AtomicInteger.class, StdJdkSerializers$AtomicIntegerSerializer.class);
        hashMap3.put(AtomicLong.class, StdJdkSerializers$AtomicLongSerializer.class);
        hashMap3.put(File.class, FileSerializer.class);
        hashMap3.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.A00;
        hashMap3.put(Void.class, nullSerializer);
        hashMap3.put(Void.TYPE, nullSerializer);
        for (Map.Entry entry : hashMap3.entrySet()) {
            Object value = entry.getValue();
            boolean z = value instanceof JsonSerializer;
            String name7 = ((Class) entry.getKey()).getName();
            if (z) {
                hashMap2.put(name7, value);
            } else {
                hashMap.put(name7, value);
            }
        }
        hashMap.put(28P.class.getName(), TokenBufferSerializer.class);
        A00 = hashMap2;
        A01 = hashMap;
    }

    public C27d(28V r302) {
        this._factoryConfig = r302 == null ? new 28V() : r302;
    }

    public static C25c A03(24S r301, C26c c26c, AnonymousClass251 anonymousClass251, Class cls) {
        C25c c25c;
        C25d c25d;
        C25p c25p = c26c._config;
        C25c c25c2 = c25p._configOverrides._defaultInclusion;
        AnonymousClass248 anonymousClass248 = anonymousClass251.A04;
        if (anonymousClass248 != null) {
            c25c = anonymousClass248.A08(anonymousClass251.A07);
            if (c25c2 != null) {
                c25c = c25c2.A00(c25c);
            }
        } else {
            c25c = c25c2;
        }
        C25c c25c3 = c25p.A03(cls)._include;
        if (c25c3 != null) {
            c25c = c25c3;
        }
        C25c c25c4 = c25p.A03(r301._class)._include;
        if (c25c4 != null) {
            C25d c25d2 = c25c4._valueInclusion;
            int ordinal = c25d2.ordinal();
            if (ordinal == 5) {
                Class cls2 = c25c4._contentFilter;
                if (cls2 == null || cls2 == Void.class) {
                    c25d = C25d.USE_DEFAULTS;
                    cls2 = null;
                } else {
                    c25d = C25d.CUSTOM;
                }
                C25d c25d3 = c25c._valueInclusion;
                Class cls3 = c25c._valueFilter;
                if (cls3 == Void.class) {
                    cls3 = null;
                }
                if (cls2 == Void.class) {
                    cls2 = null;
                }
                C25d c25d4 = C25d.USE_DEFAULTS;
                return ((c25d3 == c25d4 || c25d3 == null) && c25d == c25d4 && cls3 == null && cls2 == null) ? C25c.A00 : new C25c(c25d3, c25d, cls3, cls2);
            }
            if (ordinal != 6 && c25d2 != c25c._contentInclusion) {
                c25c = new C25c(c25c._valueInclusion, c25d2, c25c._valueFilter, c25c._contentFilter);
            }
        }
        return c25c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.4Nr] */
    public final JsonSerializer A07(24S r302, C26c c26c, AnonymousClass251 anonymousClass251) {
        if (24Z.class.isAssignableFrom(r302._class)) {
            return SerializableSerializer.A00;
        }
        AbstractC00953pX A03 = anonymousClass251.A03();
        if (A03 == null) {
            return null;
        }
        C25p c25p = c26c._config;
        if (c25p.A07()) {
            1BL.A1B(c25p, A03.A0D());
        }
        24S A032 = A03.A03();
        JsonSerializer A08 = A08(c26c, A03);
        if (A08 == null) {
            A08 = (JsonSerializer) A032._valueHandler;
        }
        Jyi jyi = (C4Nr) A032._typeHandler;
        if (jyi == null) {
            jyi = A06(A032, c26c._config);
        }
        return new JsonValueSerializer(A08, A03, jyi);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r306 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer A08(X.C26c r302, X.C24r r303) {
        /*
            r301 = this;
            r0 = r302
            X.25p r0 = r0._config
            X.248 r0 = r0.A02()
            r304 = r0
            r0 = r304
            boolean r0 = r0 instanceof X.AnonymousClass247
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L39
            r0 = r303
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonSerialize> r1 = com.fasterxml.jackson.databind.annotation.JsonSerialize.class
            java.lang.annotation.Annotation r0 = r0.A06(r1)
            com.fasterxml.jackson.databind.annotation.JsonSerialize r0 = (com.fasterxml.jackson.databind.annotation.JsonSerialize) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3f
            r0 = r304
            java.lang.Class r0 = r0.using()
            r306 = r0
            java.lang.Class<com.fasterxml.jackson.databind.JsonSerializer$None> r0 = com.fasterxml.jackson.databind.JsonSerializer.None.class
            r304 = r0
            r0 = r306
            r1 = r304
            if (r0 == r1) goto L3f
            r0 = r306
            if (r0 != 0) goto L73
        L39:
            r0 = 0
            r307 = r0
        L3c:
            r0 = r307
            return r0
        L3f:
            r0 = r303
            java.lang.Class<com.fasterxml.jackson.annotation.JsonRawValue> r1 = com.fasterxml.jackson.annotation.JsonRawValue.class
            java.lang.annotation.Annotation r0 = r0.A06(r1)
            com.fasterxml.jackson.annotation.JsonRawValue r0 = (com.fasterxml.jackson.annotation.JsonRawValue) r0
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L39
            r0 = r304
            boolean r0 = r0.value()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L39
            r0 = r303
            java.lang.Class r0 = r0.A04()
            r308 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
            com.fasterxml.jackson.databind.ser.std.RawSerializer r0 = new com.fasterxml.jackson.databind.ser.std.RawSerializer
            r306 = r0
            r0 = r306
            r1 = r308
            r2 = 0
            r0.<init>(r1, r2)
        L73:
            r0 = r302
            r1 = r303
            r2 = r306
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0.A0R(r1, r2)
            r307 = r0
            r0 = r302
            X.25p r0 = r0._config
            X.248 r0 = r0.A02()
            r1 = r303
            java.lang.Object r0 = r0.A0e(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3c
            r0 = r302
            r1 = r304
            X.3m9 r0 = r0.A0B(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L3c
            r0 = r302
            X.24R r0 = r0.A0A()
            r304 = r0
            r0 = r306
            r1 = r304
            X.24S r0 = r0.B0m(r1)
            r308 = r0
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer r0 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer
            r304 = r0
            r0 = r304
            r1 = r308
            r2 = r307
            r3 = r306
            r0.<init>(r1, r2, r3)
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27d.A08(X.26c, X.24r):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public abstract C27b A09(28V r1);
}

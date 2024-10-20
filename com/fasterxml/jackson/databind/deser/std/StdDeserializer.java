package com.fasterxml.jackson.databind.deser.std;

import X.0Pz;
import X.0Q8;
import X.0S2;
import X.1BJ;
import X.24S;
import X.27C;
import X.3BP;
import X.42X;
import X.4WM;
import X.4WN;
import X.68U;
import X.68W;
import X.AbstractC00953pX;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass248;
import X.AnonymousClass260;
import X.C25h;
import X.C25m;
import X.C25s;
import X.C26G;
import X.C26L;
import X.C26O;
import X.C27T;
import X.C27n;
import X.C3m9;
import X.C42h;
import X.C42j;
import X.C42o;
import X.C42x;
import X.C68h;
import X.C68i;
import X.C68k;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* loaded from: StdDeserializer.class */
public abstract class StdDeserializer extends JsonDeserializer implements Serializable {
    public static final int A00 = C26O.A0N._mask | C26O.A0P._mask;
    public static final long serialVersionUID = 1;
    public final Class _valueClass;
    public final 24S _valueType;

    public StdDeserializer(24S r302) {
        this._valueClass = r302 == null ? Object.class : r302._class;
        this._valueType = r302;
    }

    public StdDeserializer(StdDeserializer stdDeserializer) {
        this._valueClass = stdDeserializer._valueClass;
        this._valueType = stdDeserializer._valueType;
    }

    public StdDeserializer(Class cls) {
        this._valueClass = cls;
        this._valueType = null;
    }

    private final int A09(C27T c27t, String str) {
        try {
            if (str.length() <= 9) {
                return C42j.A01(str);
            }
            long A04 = C42j.A04(str);
            if (A04 >= 2147483648L && A04 <= 2147483647L) {
                return (int) A04;
            }
            c27t.A0l(Integer.TYPE, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.valueOf((-1) << (-1)), Integer.valueOf((-1) >>> 1));
            throw 0Q8.createAndThrow();
        } catch (IllegalArgumentException unused) {
            c27t.A0l(Integer.TYPE, str, "not a valid `int` value", new Object[0]);
            throw 0Q8.createAndThrow();
        }
    }

    public static JsonDeserializer A0A(68U r301, C27T c27t, JsonDeserializer jsonDeserializer) {
        AbstractC00953pX AwU;
        Object A0g;
        AnonymousClass248 A02 = c27t._config.A02();
        if (A02 == null || r301 == null || (AwU = r301.AwU()) == null || (A0g = A02.A0g(AwU)) == null) {
            return jsonDeserializer;
        }
        C3m9 A0B = c27t.A0B(A0g);
        24S Aqz = A0B.Aqz(c27t.A0A());
        if (jsonDeserializer == null) {
            jsonDeserializer = c27t.A0G(r301, Aqz);
        }
        return new StdDelegatingDeserializer(Aqz, jsonDeserializer, A0B);
    }

    private C25m A0B(C27T c27t, C42x c42x, Class cls, String str) {
        C25m A0N;
        String A002;
        if (!str.isEmpty()) {
            int length = str.length();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    A0N = c27t.A0N(C25m.Fail, c42x, cls);
                    A002 = 1BJ.A00(1066);
                    break;
                }
                if (str.charAt(i2) > ' ') {
                    if (c27t.A0o(42X.A02)) {
                        return C25m.TryConvert;
                    }
                    C25m A0O = c27t.A0O(c42x, cls, 0S2.A0j);
                    if (A0O != C25m.Fail) {
                        return A0O;
                    }
                    c27t.A0e(this, "Cannot coerce String value (\"%s\") to %s (but might if coercion using `CoercionConfig` was enabled)", str, A0s());
                    throw 0Q8.createAndThrow();
                }
                i = i2 + 1;
            }
        } else {
            A0N = c27t.A0O(c42x, cls, 0S2.A1J);
            A002 = "empty String (\"\")";
        }
        A0z(c27t, A0N, cls, str, A002);
        return A0N;
    }

    public static final C42o A0C(C25h c25h, 68U r302, C27T c27t, JsonDeserializer jsonDeserializer) {
        24S BHb;
        C26G Ang;
        if (c25h == C25h.FAIL) {
            if (r302 == null) {
                BHb = c27t.A0F(jsonDeserializer == null ? Object.class : jsonDeserializer.A0S());
                Ang = null;
            } else {
                BHb = r302.BHb();
                Ang = r302.Ang();
            }
            return new 4WN(BHb, Ang);
        }
        if (c25h != C25h.AS_EMPTY) {
            if (c25h == C25h.SKIP) {
                return C68h.A01;
            }
            return null;
        }
        if (jsonDeserializer == null) {
            return null;
        }
        if (jsonDeserializer instanceof BeanDeserializerBase) {
            BeanDeserializerBase beanDeserializerBase = (BeanDeserializerBase) jsonDeserializer;
            if (!beanDeserializerBase._valueInstantiator.A0Q()) {
                24S BHb2 = r302 == null ? beanDeserializerBase._beanType : r302.BHb();
                c27t.A0D(BHb2, String.format("Cannot create empty instance of %s, no default Creator", BHb2));
                throw 0Q8.createAndThrow();
            }
        }
        if (jsonDeserializer.A0L() != C68i.CONSTANT) {
            return new 4WM(jsonDeserializer);
        }
        Object A0U = jsonDeserializer.A0U(c27t);
        return A0U == null ? C68h.A00 : new C68h(A0U);
    }

    private Boolean A0D(AbstractC01033pi abstractC01033pi, C27T c27t, Class cls) {
        C25m A0O = c27t.A0O(C42x.Boolean, cls, 0S2.A0C);
        int ordinal = A0O.ordinal();
        boolean z = true;
        if (ordinal != 3) {
            if (ordinal == 2) {
                return null;
            }
            if (ordinal != 0) {
                if (abstractC01033pi.A1E() != C27n.INT) {
                    z = !ConstantsKt.CAMERA_ID_FRONT.equals(abstractC01033pi.A1Z());
                } else if (abstractC01033pi.A15() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            A0z(c27t, A0O, cls, abstractC01033pi.A1P(), 0Pz.A0j("Integer value (", abstractC01033pi.A1Z(), ")"));
        }
        return Boolean.FALSE;
    }

    public static Object A0E(AbstractC01033pi abstractC01033pi, C27T c27t) {
        return c27t.A0p(C26O.A0N) ? abstractC01033pi.A1d() : c27t.A0p(C26O.A0P) ? Long.valueOf(abstractC01033pi.A1A()) : abstractC01033pi.A1P();
    }

    private void A0F(AbstractC01033pi abstractC01033pi, C27T c27t) {
        if (abstractC01033pi.A1K() != C42h.A01) {
            A0x(c27t);
            throw 0Q8.createAndThrow();
        }
    }

    private void A0G(AbstractC01033pi abstractC01033pi, C27T c27t) {
        c27t.A0V(abstractC01033pi, abstractC01033pi.A1I(), A0d(c27t), String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", 27C.A06(this._valueClass), C42h.A05, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"), new Object[0]);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A0H(C27T c27t, String str) {
        boolean z;
        C26O c26o;
        AnonymousClass260 anonymousClass260 = AnonymousClass260.A04;
        if (c27t._config.A09(anonymousClass260)) {
            C26O c26o2 = C26O.A0B;
            if (!c27t.A0p(c26o2)) {
                return;
            }
            z = false;
            c26o = c26o2;
        } else {
            z = true;
            c26o = anonymousClass260;
        }
        c27t.A0e(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str), A0s(), z ? "enable" : "disable", c26o.getDeclaringClass().getSimpleName(), c26o.name());
        throw 0Q8.createAndThrow();
    }

    public static boolean A0I(String str) {
        boolean z = false;
        char charAt = str.charAt(0);
        if (charAt == 'f') {
            return "false".equals(str);
        }
        if (charAt == 'F' && ("FALSE".equals(str) || "False".equals(str))) {
            z = true;
        }
        return z;
    }

    public static boolean A0J(String str) {
        boolean z = false;
        char charAt = str.charAt(0);
        if (charAt == 't') {
            return "true".equals(str);
        }
        if (charAt == 'T' && ("TRUE".equals(str) || "True".equals(str))) {
            z = true;
        }
        return z;
    }

    public final byte A0X(AbstractC01033pi abstractC01033pi, C27T c27t) {
        int A14 = abstractC01033pi.A14();
        if (A14 == 1) {
            c27t.A0Y(abstractC01033pi, Byte.TYPE);
        } else {
            if (A14 != 3) {
                if (A14 != 11) {
                    if (A14 != 6) {
                        if (A14 != 7) {
                            if (A14 == 8) {
                                C25m A0e = A0e(abstractC01033pi, c27t, Byte.TYPE);
                                if (A0e == C25m.AsNull || A0e == C25m.AsEmpty) {
                                    return (byte) 0;
                                }
                            }
                            c27t.A0W(abstractC01033pi, c27t.A0F(Byte.TYPE));
                        }
                        return abstractC01033pi.A0z();
                    }
                    String A1Z = abstractC01033pi.A1Z();
                    C25m A0B = A0B(c27t, C42x.Integer, Byte.TYPE, A1Z);
                    if (A0B != C25m.AsNull) {
                        if (A0B == C25m.AsEmpty) {
                            return (byte) 0;
                        }
                        String trim = A1Z.trim();
                        if ("null".equals(trim)) {
                            A0H(c27t, trim);
                            return (byte) 0;
                        }
                        try {
                            int A01 = C42j.A01(trim);
                            if (A01 >= -128 && A01 <= 255) {
                                return (byte) A01;
                            }
                            c27t.A0l(this._valueClass, trim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                        } catch (IllegalArgumentException unused) {
                            c27t.A0l(this._valueClass, trim, "not a valid `byte` value", new Object[0]);
                            throw 0Q8.createAndThrow();
                        }
                    }
                }
                A0y(c27t);
                return (byte) 0;
            }
            if (c27t.A0p(C26O.A0L)) {
                if (abstractC01033pi.A1K() != C42h.A05) {
                    byte A0X = A0X(abstractC01033pi, c27t);
                    A0F(abstractC01033pi, c27t);
                    return A0X;
                }
                A0G(abstractC01033pi, c27t);
            }
            c27t.A0W(abstractC01033pi, c27t.A0F(Byte.TYPE));
        }
        throw 0Q8.createAndThrow();
    }

    public final double A0Y(AbstractC01033pi abstractC01033pi, C27T c27t) {
        int A14 = abstractC01033pi.A14();
        double d = 0.0d;
        if (A14 != 1) {
            if (A14 != 3) {
                if (A14 != 11) {
                    if (A14 == 6) {
                        String A1Z = abstractC01033pi.A1Z();
                        Double A0l = A0l(A1Z);
                        if (A0l != null) {
                            d = A0l.doubleValue();
                        } else {
                            C42x c42x = C42x.Integer;
                            Class cls = Double.TYPE;
                            C25m A0B = A0B(c27t, c42x, cls, A1Z);
                            if (A0B != C25m.AsNull) {
                                if (A0B != C25m.AsEmpty) {
                                    String trim = A1Z.trim();
                                    if ("null".equals(trim)) {
                                        A0H(c27t, trim);
                                        return 0.0d;
                                    }
                                    try {
                                        if ("2.2250738585072012e-308".equals(trim)) {
                                            return Double.MIN_NORMAL;
                                        }
                                        return Double.parseDouble(trim);
                                    } catch (IllegalArgumentException unused) {
                                        c27t.A0l(cls, trim, "not a valid `double` value (as String to convert)", new Object[0]);
                                        throw 0Q8.createAndThrow();
                                    }
                                }
                            }
                        }
                        return d;
                    }
                    if (A14 == 7 || A14 == 8) {
                        return abstractC01033pi.A10();
                    }
                }
                A0y(c27t);
                return 0.0d;
            }
            if (c27t.A0p(C26O.A0L)) {
                if (abstractC01033pi.A1K() == C42h.A05) {
                    A0G(abstractC01033pi, c27t);
                    throw 0Q8.createAndThrow();
                }
                double A0Y = A0Y(abstractC01033pi, c27t);
                A0F(abstractC01033pi, c27t);
                return A0Y;
            }
        }
        c27t.A0Y(abstractC01033pi, Double.TYPE);
        throw 0Q8.createAndThrow();
    }

    public final float A0Z(AbstractC01033pi abstractC01033pi, C27T c27t) {
        int A14 = abstractC01033pi.A14();
        float f = 0.0f;
        if (A14 != 1) {
            if (A14 != 3) {
                if (A14 != 11) {
                    if (A14 == 6) {
                        String A1Z = abstractC01033pi.A1Z();
                        Float A0m = A0m(A1Z);
                        if (A0m != null) {
                            f = A0m.floatValue();
                        } else {
                            C42x c42x = C42x.Integer;
                            Class cls = Float.TYPE;
                            C25m A0B = A0B(c27t, c42x, cls, A1Z);
                            if (A0B != C25m.AsNull) {
                                if (A0B != C25m.AsEmpty) {
                                    String trim = A1Z.trim();
                                    if ("null".equals(trim)) {
                                        A0H(c27t, trim);
                                        return 0.0f;
                                    }
                                    try {
                                        return Float.parseFloat(trim);
                                    } catch (IllegalArgumentException unused) {
                                        c27t.A0l(cls, trim, "not a valid `float` value", new Object[0]);
                                        throw 0Q8.createAndThrow();
                                    }
                                }
                            }
                        }
                        return f;
                    }
                    if (A14 == 7 || A14 == 8) {
                        return abstractC01033pi.A13();
                    }
                }
                A0y(c27t);
                return 0.0f;
            }
            if (c27t.A0p(C26O.A0L)) {
                if (abstractC01033pi.A1K() == C42h.A05) {
                    A0G(abstractC01033pi, c27t);
                    throw 0Q8.createAndThrow();
                }
                float A0Z = A0Z(abstractC01033pi, c27t);
                A0F(abstractC01033pi, c27t);
                return A0Z;
            }
        }
        c27t.A0Y(abstractC01033pi, Float.TYPE);
        throw 0Q8.createAndThrow();
    }

    public final int A0a(AbstractC01033pi abstractC01033pi, C27T c27t) {
        int A14 = abstractC01033pi.A14();
        int i = 0;
        if (A14 != 1) {
            if (A14 != 3) {
                if (A14 != 11) {
                    if (A14 == 6) {
                        String A1Z = abstractC01033pi.A1Z();
                        C25m A0B = A0B(c27t, C42x.Integer, Integer.TYPE, A1Z);
                        if (A0B != C25m.AsNull) {
                            if (A0B != C25m.AsEmpty) {
                                String trim = A1Z.trim();
                                if (!"null".equals(trim)) {
                                    return A09(c27t, trim);
                                }
                                A0H(c27t, trim);
                                return 0;
                            }
                        }
                    } else {
                        if (A14 == 7) {
                            return abstractC01033pi.A15();
                        }
                        if (A14 == 8) {
                            C25m A0e = A0e(abstractC01033pi, c27t, Integer.TYPE);
                            if (A0e != C25m.AsNull && A0e != C25m.AsEmpty) {
                                i = abstractC01033pi.A1y();
                            }
                        }
                    }
                    return i;
                }
                A0y(c27t);
                return 0;
            }
            if (c27t.A0p(C26O.A0L)) {
                if (abstractC01033pi.A1K() == C42h.A05) {
                    A0G(abstractC01033pi, c27t);
                    throw 0Q8.createAndThrow();
                }
                int A0a = A0a(abstractC01033pi, c27t);
                A0F(abstractC01033pi, c27t);
                return A0a;
            }
        }
        c27t.A0Y(abstractC01033pi, Integer.TYPE);
        throw 0Q8.createAndThrow();
    }

    public final long A0b(AbstractC01033pi abstractC01033pi, C27T c27t) {
        int A14 = abstractC01033pi.A14();
        long j = 0;
        if (A14 != 1) {
            if (A14 != 3) {
                if (A14 != 11) {
                    if (A14 == 6) {
                        String A1Z = abstractC01033pi.A1Z();
                        C42x c42x = C42x.Integer;
                        Class cls = Long.TYPE;
                        C25m A0B = A0B(c27t, c42x, cls, A1Z);
                        if (A0B != C25m.AsNull) {
                            if (A0B != C25m.AsEmpty) {
                                String trim = A1Z.trim();
                                if ("null".equals(trim)) {
                                    A0H(c27t, trim);
                                    return 0L;
                                }
                                try {
                                    return C42j.A04(trim);
                                } catch (IllegalArgumentException unused) {
                                    c27t.A0l(cls, trim, "not a valid `long` value", new Object[0]);
                                    throw 0Q8.createAndThrow();
                                }
                            }
                        }
                    } else {
                        if (A14 == 7) {
                            return abstractC01033pi.A1A();
                        }
                        if (A14 == 8) {
                            C25m A0e = A0e(abstractC01033pi, c27t, Long.TYPE);
                            if (A0e != C25m.AsNull && A0e != C25m.AsEmpty) {
                                j = abstractC01033pi.A1B();
                            }
                        }
                    }
                    return j;
                }
                A0y(c27t);
                return 0L;
            }
            if (c27t.A0p(C26O.A0L)) {
                if (abstractC01033pi.A1K() == C42h.A05) {
                    A0G(abstractC01033pi, c27t);
                    throw 0Q8.createAndThrow();
                }
                long A0b = A0b(abstractC01033pi, c27t);
                A0F(abstractC01033pi, c27t);
                return A0b;
            }
        }
        c27t.A0Y(abstractC01033pi, Long.TYPE);
        throw 0Q8.createAndThrow();
    }

    public 24S A0c() {
        return this._valueType;
    }

    public 24S A0d(C27T c27t) {
        24S r303 = this._valueType;
        if (r303 == null) {
            r303 = c27t.A0F(this._valueClass);
        }
        return r303;
    }

    public C25m A0e(AbstractC01033pi abstractC01033pi, C27T c27t, Class cls) {
        C25m A0O = c27t.A0O(C42x.Integer, cls, 0S2.A0N);
        if (A0O != C25m.Fail) {
            return A0O;
        }
        A0z(c27t, A0O, cls, abstractC01033pi.A1P(), 0Pz.A0j("Floating-point value (", abstractC01033pi.A1Z(), ")"));
        throw 0Q8.createAndThrow();
    }

    public C25m A0f(C27T c27t) {
        return c27t.A0O(A0Q(), A0S(), 0S2.A15);
    }

    public C25m A0g(C27T c27t, String str) {
        return A0B(c27t, A0Q(), A0S(), str);
    }

    public C42o A0h(68U r302, C27T c27t, JsonDeserializer jsonDeserializer) {
        C42o A0C;
        24S A05;
        C26G Ang;
        C25h c25h = r302 != null ? r302.AxX()._contentNulls : c27t._config._configOverrides._defaultSetterInfo._contentNulls;
        if (c25h == C25h.SKIP) {
            A0C = C68h.A01;
        } else {
            if (c25h == C25h.FAIL) {
                if (r302 == null) {
                    A05 = c27t.A0F(jsonDeserializer.A0S());
                    if (A05.A0Q()) {
                        A05 = A05.A05();
                    }
                    Ang = null;
                } else {
                    A05 = r302.BHb().A05();
                    Ang = r302.Ang();
                }
                return new 4WN(A05, Ang);
            }
            A0C = A0C(c25h, r302, c27t, jsonDeserializer);
            if (A0C == null) {
                return jsonDeserializer;
            }
        }
        return A0C;
    }

    public 68W A0i() {
        return null;
    }

    public Boolean A0j(C68k c68k, 68U r303, C27T c27t, Class cls) {
        C26L c26l = c27t._config;
        C25s ASv = r303 != null ? r303.ASv(c26l, cls) : c26l.A00(cls);
        if (ASv != null) {
            return ASv.A01(c68k);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (A0J(r0) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        if (A0I(r0) != false) goto L29;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0035. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean A0k(X.AbstractC01033pi r302, X.C27T r303, java.lang.Class r304) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0k(X.3pi, X.27T, java.lang.Class):java.lang.Boolean");
    }

    public Double A0l(String str) {
        double d;
        if (str.isEmpty()) {
            return null;
        }
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt != 'N' || !"NaN".equals(str)) {
                    return null;
                }
                d = 0.0d / 0.0d;
            } else {
                if (!"Infinity".equals(str) && !"INF".equals(str)) {
                    return null;
                }
                d = 1.0d / 0.0d;
            }
        } else {
            if (!"-Infinity".equals(str) && !"-INF".equals(str)) {
                return null;
            }
            d = (-1.0d) / 0.0d;
        }
        return Double.valueOf(d);
    }

    public Float A0m(String str) {
        float f;
        if (str.isEmpty()) {
            return null;
        }
        char charAt = str.charAt(0);
        if (charAt != '-') {
            if (charAt != 'I') {
                if (charAt != 'N' || !"NaN".equals(str)) {
                    return null;
                }
                f = 0.0f / 0.0f;
            } else {
                if (!"Infinity".equals(str) && !"INF".equals(str)) {
                    return null;
                }
                f = 1.0f / 0.0f;
            }
        } else {
            if (!"-Infinity".equals(str) && !"-INF".equals(str)) {
                return null;
            }
            f = (-1.0f) / 0.0f;
        }
        return Float.valueOf(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0109, code lost:
    
        if (r0 > 2147483647L) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer A0n(X.AbstractC01033pi r302, X.C27T r303, java.lang.Class r304) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0n(X.3pi, X.27T, java.lang.Class):java.lang.Integer");
    }

    public final Long A0o(AbstractC01033pi abstractC01033pi, C27T c27t, Class cls) {
        Object A0p;
        long A1A;
        int A14 = abstractC01033pi.A14();
        if (A14 != 1) {
            if (A14 != 3) {
                if (A14 != 11) {
                    if (A14 != 6) {
                        if (A14 == 7) {
                            A1A = abstractC01033pi.A1A();
                        } else if (A14 != 8) {
                            JsonDeserializer.A05(abstractC01033pi, c27t, this);
                        } else {
                            C25m A0e = A0e(abstractC01033pi, c27t, cls);
                            if (A0e != C25m.AsNull) {
                                if (A0e != C25m.AsEmpty) {
                                    A1A = abstractC01033pi.A1B();
                                }
                                A0p = A0U(c27t);
                            }
                        }
                        return Long.valueOf(A1A);
                    }
                    String A1Z = abstractC01033pi.A1Z();
                    C25m A0g = A0g(c27t, A1Z);
                    if (A0g != C25m.AsNull) {
                        if (A0g != C25m.AsEmpty) {
                            String trim = A1Z.trim();
                            if (!A11(c27t, trim)) {
                                try {
                                    return Long.valueOf(C42j.A04(trim));
                                } catch (IllegalArgumentException unused) {
                                    c27t.A0l(Long.class, trim, "not a valid `java.lang.Long` value", new Object[0]);
                                    throw 0Q8.createAndThrow();
                                }
                            }
                        }
                        A0p = A0U(c27t);
                    }
                }
                A0p = Azd(c27t);
            } else {
                A0p = A0p(abstractC01033pi, c27t);
            }
            return (Long) A0p;
        }
        c27t.A0Y(abstractC01033pi, cls);
        throw 0Q8.createAndThrow();
    }

    public Object A0p(AbstractC01033pi abstractC01033pi, C27T c27t) {
        C25m A0f = A0f(c27t);
        boolean A0p = c27t.A0p(C26O.A0L);
        if (A0p || A0f != C25m.Fail) {
            C42h A1K = abstractC01033pi.A1K();
            C42h c42h = C42h.A01;
            if (A1K == c42h) {
                int ordinal = A0f.ordinal();
                if (ordinal == 3) {
                    return A0U(c27t);
                }
                if (ordinal == 2 || ordinal == 1) {
                    return Azd(c27t);
                }
            } else if (A0p) {
                if (abstractC01033pi.A1u(C42h.A05)) {
                    A0G(abstractC01033pi, c27t);
                } else {
                    Object A0M = A0M(abstractC01033pi, c27t);
                    if (abstractC01033pi.A1K() == c42h) {
                        return A0M;
                    }
                    A0x(c27t);
                }
                throw 0Q8.createAndThrow();
            }
        }
        c27t.A0V(abstractC01033pi, C42h.A05, A0d(c27t), null, new Object[0]);
        throw 0Q8.createAndThrow();
    }

    public Object A0q(AbstractC01033pi abstractC01033pi, C27T c27t) {
        68W A0i = A0i();
        Class A0S = A0S();
        String A1z = abstractC01033pi.A1z();
        if (A0i != null && A0i.A0O()) {
            return A0i.A0F(c27t, A1z);
        }
        if (A1z.isEmpty()) {
            return A0r(c27t, c27t.A0O(A0Q(), A0S, 0S2.A1J), A0S);
        }
        int length = A1z.length();
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                z = true;
                break;
            }
            if (A1z.charAt(i2) > ' ') {
                break;
            }
            i = i2 + 1;
        }
        if (z) {
            return A0r(c27t, c27t.A0N(C25m.Fail, A0Q(), A0S), A0S);
        }
        if (A0i != null) {
            A1z = A1z.trim();
            if (A0i.A0L() && c27t.A0O(C42x.Integer, Integer.class, 0S2.A0j) == C25m.TryConvert) {
                return A0i.A0B(c27t, A09(c27t, A1z));
            }
            if (A0i.A0M() && c27t.A0O(C42x.Integer, Long.class, 0S2.A0j) == C25m.TryConvert) {
                try {
                    return A0i.A0C(c27t, C42j.A04(A1z));
                } catch (IllegalArgumentException unused) {
                    c27t.A0l(Long.TYPE, A1z, "not a valid `long` value", new Object[0]);
                    throw 0Q8.createAndThrow();
                }
            }
            if (A0i.A0K() && c27t.A0O(C42x.Boolean, Boolean.class, 0S2.A0j) == C25m.TryConvert) {
                String trim = A1z.trim();
                if ("true".equals(trim)) {
                    return A0i.A0I(c27t, true);
                }
                if ("false".equals(trim)) {
                    return A0i.A0I(c27t, false);
                }
            }
        }
        c27t.A0f(A0i, A0S, "no String-argument constructor/factory method to deserialize from String value ('%s')", A1z);
        throw 0Q8.createAndThrow();
    }

    public Object A0r(C27T c27t, C25m c25m, Class cls) {
        int ordinal = c25m.ordinal();
        if (ordinal == 3) {
            return A0U(c27t);
        }
        if (ordinal != 0) {
            return null;
        }
        A0z(c27t, c25m, cls, "", "empty String (\"\")");
        return null;
    }

    public String A0s() {
        String A06;
        StringBuilder A0n;
        24S A0c = A0c();
        boolean z = false;
        if (A0c == null || A0c._class.isPrimitive()) {
            Class A0S = A0S();
            if (A0S.isArray() || Collection.class.isAssignableFrom(A0S) || Map.class.isAssignableFrom(A0S)) {
                z = true;
            }
            A06 = 27C.A06(A0S);
        } else {
            if (A0c.A0Q() || A0c.A04()) {
                z = true;
            }
            A06 = 27C.A04(A0c);
        }
        if (z) {
            A0n = AnonymousClass001.A0k();
            A0n.append("element of ");
        } else {
            A0n = AnonymousClass001.A0n(A06);
            A06 = " value";
        }
        return AnonymousClass001.A0d(A06, A0n);
    }

    public final String A0t(AbstractC01033pi abstractC01033pi, C27T c27t) {
        String A1z;
        Class cls;
        if (!abstractC01033pi.A1u(C42h.A0C)) {
            if (abstractC01033pi.A1u(C42h.A07)) {
                Object A1R = abstractC01033pi.A1R();
                if (A1R instanceof byte[]) {
                    return c27t._config._base._defaultBase64.A06((byte[]) A1R);
                }
                if (A1R == null) {
                    return null;
                }
                return A1R.toString();
            }
            if (abstractC01033pi.A1u(C42h.A06)) {
                cls = this._valueClass;
            } else {
                A1z = abstractC01033pi.A1z();
                if (A1z == null) {
                    cls = String.class;
                }
            }
            c27t.A0Y(abstractC01033pi, cls);
            throw 0Q8.createAndThrow();
        }
        A1z = abstractC01033pi.A1Z();
        return A1z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013b, code lost:
    
        if (r0 != 1) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Date A0u(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StdDeserializer.A0u(X.3pi, X.27T):java.util.Date");
    }

    public final short A0v(AbstractC01033pi abstractC01033pi, C27T c27t) {
        int A14 = abstractC01033pi.A14();
        if (A14 == 1) {
            c27t.A0Y(abstractC01033pi, Short.TYPE);
        } else {
            if (A14 != 3) {
                if (A14 != 11) {
                    if (A14 != 6) {
                        if (A14 != 7) {
                            if (A14 == 8) {
                                C25m A0e = A0e(abstractC01033pi, c27t, Short.TYPE);
                                if (A0e == C25m.AsNull || A0e == C25m.AsEmpty) {
                                    return (short) 0;
                                }
                            }
                            c27t.A0W(abstractC01033pi, c27t.A0F(Short.TYPE));
                        }
                        return abstractC01033pi.A1f();
                    }
                    String A1Z = abstractC01033pi.A1Z();
                    C42x c42x = C42x.Integer;
                    Class cls = Short.TYPE;
                    C25m A0B = A0B(c27t, c42x, cls, A1Z);
                    if (A0B != C25m.AsNull) {
                        if (A0B == C25m.AsEmpty) {
                            return (short) 0;
                        }
                        String trim = A1Z.trim();
                        if ("null".equals(trim)) {
                            A0H(c27t, trim);
                            return (short) 0;
                        }
                        try {
                            int A01 = C42j.A01(trim);
                            if (A01 >= -32768 && A01 <= 32767) {
                                return (short) A01;
                            }
                            c27t.A0l(cls, trim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                        } catch (IllegalArgumentException unused) {
                            c27t.A0l(cls, trim, "not a valid `short` value", new Object[0]);
                            throw 0Q8.createAndThrow();
                        }
                    }
                }
                A0y(c27t);
                return (short) 0;
            }
            if (c27t.A0p(C26O.A0L)) {
                if (abstractC01033pi.A1K() != C42h.A05) {
                    short A0v = A0v(abstractC01033pi, c27t);
                    A0F(abstractC01033pi, c27t);
                    return A0v;
                }
                A0G(abstractC01033pi, c27t);
            }
            c27t.A0W(abstractC01033pi, c27t.A0F(Short.TYPE));
        }
        throw 0Q8.createAndThrow();
    }

    public void A0w(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj, String str) {
        if (obj == null) {
            obj = A0S();
        }
        c27t.A0X(abstractC01033pi, this, obj, str);
    }

    public void A0x(C27T c27t) {
        c27t.A0a(C42h.A01, this, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", A0S().getName());
        throw 0Q8.createAndThrow();
    }

    public final void A0y(C27T c27t) {
        if (c27t.A0p(C26O.A0B)) {
            c27t.A0e(this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", A0s());
            throw 0Q8.createAndThrow();
        }
    }

    public void A0z(C27T c27t, C25m c25m, Class cls, Object obj, String str) {
        if (c25m == C25m.Fail) {
            throw new 3BP(c27t.A00, cls, obj, String.format("Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", str, A0s()));
        }
    }

    public final boolean A10(AbstractC01033pi abstractC01033pi, C27T c27t) {
        int A14 = abstractC01033pi.A14();
        boolean z = true;
        if (A14 != 1) {
            if (A14 != 3) {
                if (A14 != 6) {
                    if (A14 == 7) {
                        return Boolean.TRUE.equals(A0D(abstractC01033pi, c27t, Boolean.TYPE));
                    }
                    switch (A14) {
                        case 9:
                            return z;
                        case 10:
                            return false;
                    }
                }
                String A1Z = abstractC01033pi.A1Z();
                C42x c42x = C42x.Boolean;
                Class cls = Boolean.TYPE;
                C25m A0B = A0B(c27t, c42x, cls, A1Z);
                if (A0B != C25m.AsNull) {
                    if (A0B == C25m.AsEmpty) {
                        return false;
                    }
                    String trim = A1Z.trim();
                    int length = trim.length();
                    if (length == 4) {
                        if (A0J(trim)) {
                            return true;
                        }
                    } else if (length == 5 && A0I(trim)) {
                        return false;
                    }
                    if ("null".equals(trim)) {
                        A0H(c27t, trim);
                        return false;
                    }
                    c27t.A0l(cls, trim, "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized", new Object[0]);
                }
                A0y(c27t);
                return false;
            }
            if (c27t.A0p(C26O.A0L)) {
                if (abstractC01033pi.A1K() != C42h.A05) {
                    z = A10(abstractC01033pi, c27t);
                    A0F(abstractC01033pi, c27t);
                    return z;
                }
                A0G(abstractC01033pi, c27t);
            }
            throw 0Q8.createAndThrow();
        }
        c27t.A0Y(abstractC01033pi, Boolean.TYPE);
        throw 0Q8.createAndThrow();
    }

    public boolean A11(C27T c27t, String str) {
        boolean z;
        if ("null".equals(str)) {
            AnonymousClass260 anonymousClass260 = AnonymousClass260.A04;
            z = true;
            if (!c27t._config.A09(anonymousClass260)) {
                c27t.A0e(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", "String \"null\"", A0s(), "enable", anonymousClass260.getDeclaringClass().getSimpleName(), "ALLOW_COERCION_OF_SCALARS");
                throw 0Q8.createAndThrow();
            }
        } else {
            z = false;
        }
        return z;
    }
}

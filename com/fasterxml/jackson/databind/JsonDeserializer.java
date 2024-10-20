package com.fasterxml.jackson.databind;

import X.0Pz;
import X.0Q8;
import X.27C;
import X.68S;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.C09924rw;
import X.C26L;
import X.C26O;
import X.C27T;
import X.C42h;
import X.C42o;
import X.C42x;
import X.C68e;
import X.C68i;
import X.C7Rt;
import X.L1J;
import com.facebook.common.json.FbJsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicLongDeserializer;
import com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: JsonDeserializer.class */
public abstract class JsonDeserializer implements C42o {

    /* loaded from: JsonDeserializer$None.class */
    public abstract class None extends JsonDeserializer {
        public None() {
            throw 0Q8.createAndThrow();
        }
    }

    public static void A05(AbstractC01033pi abstractC01033pi, C27T c27t, StdDeserializer stdDeserializer) {
        c27t.A0W(abstractC01033pi, stdDeserializer.A0d(c27t));
        throw null;
    }

    public static void A06(Object obj, Object obj2, Object obj3, Map map, int i) {
        if (i != 0) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                map.put(obj3, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(obj2);
                map.put(obj3, arrayList);
            }
        }
    }

    public JsonDeserializer A0K(L1J l1j) {
        return this;
    }

    public C68i A0L() {
        return ((this instanceof StdScalarDeserializer) || (this instanceof PrimitiveArrayDeserializers)) ? C68i.CONSTANT : C68i.DYNAMIC;
    }

    public abstract Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t);

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0262, code lost:
    
        if (r0 != 5) goto L94;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0047. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, X.438] */
    /* JADX WARN: Type inference failed for: r0v56, types: [com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, X.438] */
    /* JADX WARN: Type inference failed for: r305v6 */
    /* JADX WARN: Type inference failed for: r305v7 */
    /* JADX WARN: Type inference failed for: r305v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r305v9, types: [java.util.Map, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0N(X.AbstractC01033pi r302, X.C27T r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonDeserializer.A0N(X.3pi, X.27T, java.lang.Object):java.lang.Object");
    }

    public 68S A0O(String str) {
        throw AnonymousClass001.A0L(0Pz.A0z("Cannot handle managed/back reference '", str, "': type: value deserializer of type ", AnonymousClass001.A0Y(this), " does not support them"));
    }

    public C7Rt A0P() {
        return null;
    }

    public C42x A0Q() {
        if (this instanceof StdScalarDeserializer) {
            StdScalarDeserializer stdScalarDeserializer = (StdScalarDeserializer) this;
            if (stdScalarDeserializer instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer) {
                return ((NumberDeserializers$PrimitiveOrWrapperDeserializer) stdScalarDeserializer)._logicalType;
            }
            if (!(stdScalarDeserializer instanceof TokenBufferDeserializer)) {
                if (!(stdScalarDeserializer instanceof StringDeserializer)) {
                    if (!(stdScalarDeserializer instanceof NumberDeserializers$NumberDeserializer) && !(stdScalarDeserializer instanceof NumberDeserializers$BigIntegerDeserializer)) {
                        if (stdScalarDeserializer instanceof NumberDeserializers$BigDecimalDeserializer) {
                            return C42x.Float;
                        }
                        if (!(stdScalarDeserializer instanceof FromStringDeserializer.StringBuilderDeserializer)) {
                            if (stdScalarDeserializer instanceof ByteBufferDeserializer) {
                                return C42x.Binary;
                            }
                            if (!(stdScalarDeserializer instanceof AtomicLongDeserializer) && !(stdScalarDeserializer instanceof AtomicIntegerDeserializer)) {
                                return stdScalarDeserializer instanceof AtomicBooleanDeserializer ? C42x.Boolean : C42x.OtherScalar;
                            }
                        }
                    }
                    return C42x.Integer;
                }
                return C42x.Textual;
            }
        } else {
            if (this instanceof TypeWrappedDeserializer) {
                return ((TypeWrappedDeserializer) this)._deserializer.A0Q();
            }
            if (!(this instanceof UntypedObjectDeserializer) && !(this instanceof UntypedObjectDeserializer.Vanilla)) {
                if (this instanceof PrimitiveArrayDeserializers) {
                    return C42x.Array;
                }
                if (!(this instanceof BaseNodeDeserializer)) {
                    return null;
                }
            }
        }
        return C42x.Untyped;
    }

    public Boolean A0R(C26L c26l) {
        if (this instanceof TypeWrappedDeserializer) {
            return ((TypeWrappedDeserializer) this)._deserializer.A0R(c26l);
        }
        if (this instanceof UntypedObjectDeserializer.Vanilla) {
            if (!((UntypedObjectDeserializer.Vanilla) this)._nonMerging) {
                return null;
            }
        } else if (!(this instanceof StdScalarDeserializer)) {
            if (this instanceof PrimitiveArrayDeserializers) {
                return Boolean.TRUE;
            }
            if (!(this instanceof NullifyingDeserializer)) {
                if (this instanceof BaseNodeDeserializer) {
                    return ((BaseNodeDeserializer) this)._supportsUpdates;
                }
                return null;
            }
        }
        return Boolean.FALSE;
    }

    public Class A0S() {
        if (this instanceof StdDeserializer) {
            return ((StdDeserializer) this)._valueClass;
        }
        if (this instanceof TypeWrappedDeserializer) {
            return ((TypeWrappedDeserializer) this)._deserializer.A0S();
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x004b. Please report as an issue. */
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        double A0Y;
        int A0a;
        JsonDeserializer jsonDeserializer;
        if (this instanceof TypeWrappedDeserializer) {
            throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
        }
        if (this instanceof UntypedObjectDeserializer) {
            UntypedObjectDeserializer untypedObjectDeserializer = (UntypedObjectDeserializer) this;
            int A14 = abstractC01033pi.A14();
            if (A14 != 1 && A14 != 3) {
                switch (A14) {
                    case 6:
                        jsonDeserializer = untypedObjectDeserializer._stringDeserializer;
                        if (jsonDeserializer == null) {
                            return abstractC01033pi.A1Z();
                        }
                        return jsonDeserializer.A0M(abstractC01033pi, c27t);
                    case 7:
                        jsonDeserializer = untypedObjectDeserializer._numberDeserializer;
                        if (jsonDeserializer == null) {
                            if ((StdDeserializer.A00 & c27t._featureFlags) != 0) {
                                return StdDeserializer.A0E(abstractC01033pi, c27t);
                            }
                            return abstractC01033pi.A1P();
                        }
                        return jsonDeserializer.A0M(abstractC01033pi, c27t);
                    case 8:
                        jsonDeserializer = untypedObjectDeserializer._numberDeserializer;
                        if (jsonDeserializer == null) {
                            if (c27t.A0p(C26O.A0M)) {
                                return abstractC01033pi.A1c();
                            }
                            return abstractC01033pi.A1P();
                        }
                        return jsonDeserializer.A0M(abstractC01033pi, c27t);
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return abstractC01033pi.A1R();
                }
            }
            return c68e.A05(abstractC01033pi, c27t);
        }
        if (this instanceof UntypedObjectDeserializer.Vanilla) {
            int A142 = abstractC01033pi.A14();
            if (A142 != 1 && A142 != 3) {
                switch (A142) {
                    case 6:
                        return abstractC01033pi.A1Z();
                    case 7:
                        if (c27t.A0p(C26O.A0N)) {
                            return abstractC01033pi.A1d();
                        }
                        break;
                    case 8:
                        if (c27t.A0p(C26O.A0M)) {
                            return abstractC01033pi.A1c();
                        }
                        break;
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return abstractC01033pi.A1R();
                }
                return abstractC01033pi.A1P();
            }
            return c68e.A05(abstractC01033pi, c27t);
        }
        if (this instanceof PrimitiveArrayDeserializers) {
            return c68e.A06(abstractC01033pi, c27t);
        }
        if (!(this instanceof StdScalarDeserializer)) {
            if (!(this instanceof NullifyingDeserializer)) {
                return c68e.A05(abstractC01033pi, c27t);
            }
            int A143 = abstractC01033pi.A14();
            if (A143 == 1 || A143 == 3 || A143 == 5) {
                return c68e.A05(abstractC01033pi, c27t);
            }
            return null;
        }
        StdScalarDeserializer stdScalarDeserializer = (StdScalarDeserializer) this;
        if (stdScalarDeserializer instanceof StringDeserializer) {
            return StringDeserializer.A00(abstractC01033pi, c27t, (StringDeserializer) stdScalarDeserializer);
        }
        if (stdScalarDeserializer instanceof NumberDeserializers$NumberDeserializer) {
            int A144 = abstractC01033pi.A14();
            if (A144 == 6 || A144 == 7 || A144 == 8) {
                return stdScalarDeserializer.A0M(abstractC01033pi, c27t);
            }
        } else {
            if (stdScalarDeserializer instanceof NumberDeserializers$IntegerDeserializer) {
                NumberDeserializers$PrimitiveOrWrapperDeserializer numberDeserializers$PrimitiveOrWrapperDeserializer = (NumberDeserializers$PrimitiveOrWrapperDeserializer) stdScalarDeserializer;
                if (abstractC01033pi.A1o()) {
                    A0a = abstractC01033pi.A15();
                } else {
                    if (!numberDeserializers$PrimitiveOrWrapperDeserializer._primitive) {
                        return numberDeserializers$PrimitiveOrWrapperDeserializer.A0n(abstractC01033pi, c27t, Integer.class);
                    }
                    A0a = numberDeserializers$PrimitiveOrWrapperDeserializer.A0a(abstractC01033pi, c27t);
                }
                return Integer.valueOf(A0a);
            }
            if (stdScalarDeserializer instanceof NumberDeserializers$DoubleDeserializer) {
                NumberDeserializers$DoubleDeserializer numberDeserializers$DoubleDeserializer = (NumberDeserializers$DoubleDeserializer) stdScalarDeserializer;
                if (abstractC01033pi.A1u(C42h.A0A)) {
                    A0Y = abstractC01033pi.A10();
                } else {
                    if (!numberDeserializers$DoubleDeserializer._primitive) {
                        return NumberDeserializers$DoubleDeserializer.A01(abstractC01033pi, c27t, numberDeserializers$DoubleDeserializer);
                    }
                    A0Y = numberDeserializers$DoubleDeserializer.A0Y(abstractC01033pi, c27t);
                }
                return Double.valueOf(A0Y);
            }
            if (stdScalarDeserializer instanceof NumberDeserializers$BooleanDeserializer) {
                NumberDeserializers$PrimitiveOrWrapperDeserializer numberDeserializers$PrimitiveOrWrapperDeserializer2 = (NumberDeserializers$PrimitiveOrWrapperDeserializer) stdScalarDeserializer;
                C42h A1I = abstractC01033pi.A1I();
                return A1I == C42h.A0D ? Boolean.TRUE : A1I == C42h.A08 ? Boolean.FALSE : numberDeserializers$PrimitiveOrWrapperDeserializer2._primitive ? Boolean.valueOf(numberDeserializers$PrimitiveOrWrapperDeserializer2.A10(abstractC01033pi, c27t)) : numberDeserializers$PrimitiveOrWrapperDeserializer2.A0k(abstractC01033pi, c27t, numberDeserializers$PrimitiveOrWrapperDeserializer2._valueClass);
            }
        }
        return c68e.A08(abstractC01033pi, c27t);
        c27t.A0Y(abstractC01033pi, Object.class);
        throw 0Q8.createAndThrow();
    }

    public Object A0U(C27T c27t) {
        Object obj;
        if (this instanceof TypeWrappedDeserializer) {
            obj = ((TypeWrappedDeserializer) this)._deserializer.A0U(c27t);
        } else {
            if (!(this instanceof PrimitiveArrayDeserializers)) {
                return this instanceof StringDeserializer ? "" : this instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer ? ((NumberDeserializers$PrimitiveOrWrapperDeserializer) this)._emptyValue : this instanceof NumberDeserializers$BigIntegerDeserializer ? BigInteger.ZERO : this instanceof NumberDeserializers$BigDecimalDeserializer ? BigDecimal.ZERO : this instanceof FromStringDeserializer.StringBuilderDeserializer ? new StringBuilder() : this instanceof AtomicLongDeserializer ? new AtomicLong() : this instanceof AtomicIntegerDeserializer ? new AtomicInteger() : this instanceof AtomicBooleanDeserializer ? new AtomicBoolean(false) : Azd(c27t);
            }
            PrimitiveArrayDeserializers primitiveArrayDeserializers = (PrimitiveArrayDeserializers) this;
            obj = primitiveArrayDeserializers.A00;
            if (obj == null) {
                Object A13 = primitiveArrayDeserializers.A13();
                primitiveArrayDeserializers.A00 = A13;
                return A13;
            }
        }
        return obj;
    }

    public Collection A0V() {
        if (this instanceof TypeWrappedDeserializer) {
            return ((TypeWrappedDeserializer) this)._deserializer.A0V();
        }
        return null;
    }

    public boolean A0W() {
        return (this instanceof BaseNodeDeserializer) || (this instanceof StringDeserializer) || (this instanceof UntypedObjectDeserializer) || (this instanceof NumberDeserializers$LongDeserializer) || (this instanceof NumberDeserializers$IntegerDeserializer) || (this instanceof FbJsonDeserializer);
    }

    @Override // X.C42o
    public Object AUt(C27T c27t) {
        if (this instanceof JsonNodeDeserializer) {
            return null;
        }
        return Azd(c27t);
    }

    @Override // X.C42o
    public Object Azd(C27T c27t) {
        if (!(this instanceof NumberDeserializers$PrimitiveOrWrapperDeserializer)) {
            if (this instanceof JsonNodeDeserializer) {
                return C09924rw.A00;
            }
            if (this instanceof TypeWrappedDeserializer) {
                return ((TypeWrappedDeserializer) this)._deserializer.Azd(c27t);
            }
            return null;
        }
        NumberDeserializers$PrimitiveOrWrapperDeserializer numberDeserializers$PrimitiveOrWrapperDeserializer = (NumberDeserializers$PrimitiveOrWrapperDeserializer) this;
        if (!numberDeserializers$PrimitiveOrWrapperDeserializer._primitive || !c27t.A0p(C26O.A0B)) {
            return numberDeserializers$PrimitiveOrWrapperDeserializer._nullValue;
        }
        c27t.A0e(numberDeserializers$PrimitiveOrWrapperDeserializer, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", 27C.A07(numberDeserializers$PrimitiveOrWrapperDeserializer.A0S()));
        throw 0Q8.createAndThrow();
    }
}

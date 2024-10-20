package com.facebook.common.json;

import X.0Pz;
import X.0Q8;
import X.5BC;
import X.AbM;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.AnonymousClass243;
import X.C27T;
import X.C42h;
import X.DKD;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: FbJsonField.class */
public abstract class FbJsonField {
    public final Field A00;
    public final Method A01;

    /* loaded from: FbJsonField$BeanJsonField.class */
    public class BeanJsonField extends FbJsonField {
        /* JADX WARN: Not initialized variable reg: 0, insn: 0x0076: INVOKE (r0 I:java.lang.Throwable) STATIC call: X.DKD.A1R(java.lang.Throwable):void, block:B:31:0x0076 */
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
            Throwable A1R;
            try {
                Method method = this.A01;
                Object A02 = AbstractC11224vw.A02(abstractC01033pi, c27t, method != null ? method.getGenericParameterTypes()[0] : this.A00.getGenericType());
                if (A02 != null) {
                    if (method != null) {
                        method.setAccessible(true);
                        method.invoke(obj, A02);
                    } else {
                        Field field = this.A00;
                        field.setAccessible(true);
                        field.set(obj, A02);
                    }
                }
            } catch (Exception unused) {
                DKD.A1R(A1R);
                throw 0Q8.createAndThrow();
            }
        }
    }

    /* loaded from: FbJsonField$BoolJsonField.class */
    public final class BoolJsonField extends FbJsonField {
        /* JADX WARN: Not initialized variable reg: 0, insn: 0x004d: INVOKE (r0 I:java.lang.Throwable) STATIC call: X.DKD.A1R(java.lang.Throwable):void, block:B:21:0x004d */
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
            Throwable A1R;
            try {
                boolean A1l = abstractC01033pi.A1l();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Boolean.valueOf(A1l));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setBoolean(obj, A1l);
                }
            } catch (Exception unused) {
                DKD.A1R(A1R);
                throw 0Q8.createAndThrow();
            }
        }
    }

    /* loaded from: FbJsonField$DoubleJsonField.class */
    public final class DoubleJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
            double d = 0.0d;
            try {
                C42h A1J = abstractC01033pi.A1J();
                if (A1J == C42h.A09) {
                    abstractC01033pi.A20();
                } else {
                    d = (A1J == C42h.A0C && "NaN".equals(abstractC01033pi.A1z())) ? 0.0d / 0.0d : abstractC01033pi.A11();
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Double.valueOf(d));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setDouble(obj, d);
                }
            } catch (Exception unused) {
                DKD.A1R((Throwable) null);
                throw 0Q8.createAndThrow();
            }
        }
    }

    /* loaded from: FbJsonField$FloatJsonField.class */
    public final class FloatJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
            float f = 0.0f;
            try {
                C42h A1J = abstractC01033pi.A1J();
                if (A1J == C42h.A09) {
                    abstractC01033pi.A20();
                } else {
                    f = (A1J == C42h.A0C && "NaN".equals(abstractC01033pi.A1z())) ? 0.0f / 0.0f : abstractC01033pi.A13();
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Float.valueOf(f));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setFloat(obj, f);
                }
            } catch (Exception unused) {
                DKD.A1R((Throwable) null);
                throw 0Q8.createAndThrow();
            }
        }
    }

    /* loaded from: FbJsonField$ImmutableListJsonField.class */
    public final class ImmutableListJsonField extends FbJsonField {
        public 5BC A00;
        public Class A01;

        /* JADX WARN: Not initialized variable reg: 0, insn: 0x00cd: INVOKE (r0 I:java.lang.Throwable) STATIC call: X.DKD.A1R(java.lang.Throwable):void A[Catch: Exception -> 0x00cd, TRY_LEAVE], block:B:49:0x00cd */
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
            Throwable A1R;
            JsonDeserializer jsonDeserializer;
            ImmutableList immutableList;
            try {
                Class cls = this.A01;
                5BC r0 = this.A00;
                if (abstractC01033pi.A1J() == C42h.A09) {
                    immutableList = ImmutableList.of();
                } else {
                    if (cls != null) {
                        new ImmutableListDeserializer(cls);
                    } else {
                        if (r0 == null) {
                            throw AnonymousClass001.A0L("Need to set simple or generic inner list type!");
                        }
                        new ImmutableListDeserializer(((AnonymousClass243) abstractC01033pi.A1M()).A0f(c27t, r0._type));
                    }
                    immutableList = (ImmutableList) jsonDeserializer.A0M(abstractC01033pi, c27t);
                }
                Method method = super.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, immutableList);
                } else {
                    Field field = super.A00;
                    field.setAccessible(true);
                    field.set(obj, immutableList);
                }
            } catch (Exception unused) {
                DKD.A1R(A1R);
                throw 0Q8.createAndThrow();
            }
        }
    }

    /* loaded from: FbJsonField$IntJsonField.class */
    public final class IntJsonField extends FbJsonField {
        /* JADX WARN: Not initialized variable reg: 0, insn: 0x004d: INVOKE (r0 I:java.lang.Throwable) STATIC call: X.DKD.A1R(java.lang.Throwable):void, block:B:21:0x004d */
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
            Throwable A1R;
            try {
                int A1y = abstractC01033pi.A1y();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Integer.valueOf(A1y));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setInt(obj, A1y);
                }
            } catch (Exception unused) {
                DKD.A1R(A1R);
                throw 0Q8.createAndThrow();
            }
        }
    }

    /* loaded from: FbJsonField$ListJsonField.class */
    public final class ListJsonField extends FbJsonField {
        public 5BC A00;
        public Class A01;
        public JsonDeserializer A02;

        /* JADX WARN: Not initialized variable reg: 0, insn: 0x00db: INVOKE (r0 I:java.lang.Throwable) STATIC call: X.DKD.A1R(java.lang.Throwable):void A[Catch: Exception -> 0x00db, TRY_LEAVE], block:B:54:0x00db */
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
            Throwable A1R;
            List list;
            try {
                if (abstractC01033pi.A1J() == C42h.A09) {
                    list = AnonymousClass001.A0s();
                } else {
                    JsonDeserializer jsonDeserializer = this.A02;
                    if (jsonDeserializer == null) {
                        Class cls = this.A01;
                        if (cls != null) {
                            new ArrayListDeserializer(cls);
                        } else {
                            5BC r0 = this.A00;
                            if (r0 == null) {
                                throw AnonymousClass001.A0L("Need to set simple or generic inner list type!");
                            }
                            new ArrayListDeserializer(((AnonymousClass243) abstractC01033pi.A1M()).A0f(c27t, r0._type));
                        }
                        this.A02 = jsonDeserializer;
                    }
                    list = (List) jsonDeserializer.A0M(abstractC01033pi, c27t);
                }
                Method method = super.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, list);
                } else {
                    Field field = super.A00;
                    field.setAccessible(true);
                    field.set(obj, list);
                }
            } catch (Exception unused) {
                DKD.A1R(A1R);
                throw 0Q8.createAndThrow();
            }
        }
    }

    /* loaded from: FbJsonField$LongJsonField.class */
    public final class LongJsonField extends FbJsonField {
        /* JADX WARN: Not initialized variable reg: 0, insn: 0x004d: INVOKE (r0 I:java.lang.Throwable) STATIC call: X.DKD.A1R(java.lang.Throwable):void, block:B:21:0x004d */
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
            Throwable A1R;
            try {
                long A1B = abstractC01033pi.A1B();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Long.valueOf(A1B));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setLong(obj, A1B);
                }
            } catch (Exception unused) {
                DKD.A1R(A1R);
                throw 0Q8.createAndThrow();
            }
        }
    }

    /* loaded from: FbJsonField$StringJsonField.class */
    public final class StringJsonField extends FbJsonField {
        /* JADX WARN: Not initialized variable reg: 0, insn: 0x0046: INVOKE (r0 I:java.lang.Throwable) STATIC call: X.DKD.A1R(java.lang.Throwable):void, block:B:20:0x0046 */
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
            Throwable A1R;
            try {
                String A03 = AbstractC11224vw.A03(abstractC01033pi);
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, A03);
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.set(obj, A03);
                }
            } catch (Exception unused) {
                DKD.A1R(A1R);
                throw 0Q8.createAndThrow();
            }
        }
    }

    public FbJsonField(Field field, Method method) {
        this.A00 = field;
        this.A01 = method;
    }

    public static FbJsonField jsonField(Field field) {
        return jsonField(field, (Class) null, (5BC) null);
    }

    public static FbJsonField jsonField(Field field, 5BC r302) {
        return jsonField(field, (Class) null, r302);
    }

    public static FbJsonField jsonField(Field field, Class cls) {
        return AbM.A0H(field, cls);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ListJsonField] */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ImmutableListJsonField] */
    public static FbJsonField jsonField(Field field, Class cls, 5BC r303) {
        Class<?> type = field.getType();
        if (type != String.class && type != Integer.TYPE && type != Long.TYPE && type != Boolean.TYPE && type != Float.TYPE && type != Double.TYPE) {
            if (type == ImmutableList.class) {
                ?? fbJsonField = new FbJsonField(field, null);
                fbJsonField.A01 = cls;
                fbJsonField.A00 = r303;
                return fbJsonField;
            }
            if (type != List.class && type != ArrayList.class) {
                return new FbJsonField(field, null);
            }
            ?? fbJsonField2 = new FbJsonField(field, null);
            fbJsonField2.A01 = cls;
            fbJsonField2.A00 = r303;
            return fbJsonField2;
        }
        return new FbJsonField(field, null);
    }

    public static FbJsonField jsonField(Method method) {
        return jsonField(method, (Class) null, (5BC) null);
    }

    public static FbJsonField jsonField(Method method, 5BC r302) {
        return jsonField(method, (Class) null, r302);
    }

    public static FbJsonField jsonField(Method method, Class cls) {
        return jsonField(method, cls, (5BC) null);
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ListJsonField] */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.facebook.common.json.FbJsonField, com.facebook.common.json.FbJsonField$ImmutableListJsonField] */
    public static FbJsonField jsonField(Method method, Class cls, 5BC r303) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1) {
            throw AnonymousClass001.A0T(0Pz.A0j("Invalid setter type ", method.getName(), " Only setter with on input parameter is supported."));
        }
        Class<?> cls2 = parameterTypes[0];
        if (cls2 != String.class && cls2 != Integer.TYPE && cls2 != Long.TYPE && cls2 != Boolean.TYPE && cls2 != Float.TYPE && cls2 != Double.TYPE) {
            if (cls2 == ImmutableList.class) {
                ?? fbJsonField = new FbJsonField(null, method);
                fbJsonField.A01 = cls;
                fbJsonField.A00 = r303;
                return fbJsonField;
            }
            if (cls2 != List.class && cls2 != ArrayList.class) {
                return new FbJsonField(null, method);
            }
            ?? fbJsonField2 = new FbJsonField(null, method);
            fbJsonField2.A01 = cls;
            fbJsonField2.A00 = r303;
            return fbJsonField2;
        }
        return new FbJsonField(null, method);
    }

    public static FbJsonField jsonFieldWithCreator(Field field) {
        return new FbJsonField(field, null);
    }

    public abstract void deserialize(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t);
}

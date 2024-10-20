package com.google.gson;

import X.0Pz;
import X.0S2;
import X.5xY;
import X.5xZ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C6f0;
import X.C6f2;
import X.JQx;
import X.JRN;
import X.JTn;
import X.KDZ;
import X.KDa;
import X.KDh;
import X.KDi;
import X.KDm;
import X.KDn;
import X.KDw;
import X.KLc;
import X.KM7;
import X.KM8;
import X.KPY;
import X.KPZ;
import X.KR3;
import X.KYh;
import X.Kcw;
import X.L2z;
import X.LgM;
import X.LgN;
import X.LgO;
import X.LgP;
import X.LgQ;
import X.LgR;
import X.MDf;
import X.MGc;
import com.facebook.acra.constants.ActionId;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: Gson.class */
public final class Gson {
    public final MDf A00;
    public final MGc A01;
    public final MGc A02;
    public final LgR A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final Map A08;
    public final boolean A09;
    public final boolean A0A;
    public final L2z A0B;
    public final LgP A0C;
    public final ThreadLocal A0D;
    public final ConcurrentMap A0E;
    public static final MDf A0F = KPY.A00;
    public static final MGc A0H = KPZ.A00;
    public static final MGc A0G = KPZ.A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Gson() {
        /*
            r301 = this;
            X.LgR r0 = X.LgR.A02
            r302 = r0
            X.MDf r0 = com.google.gson.Gson.A0F
            r303 = r0
            java.util.Map r0 = java.util.Collections.emptyMap()
            r304 = r0
            X.KM8 r0 = X.KM8.A00
            r305 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r306 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r307 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r308 = r0
            X.MGc r0 = com.google.gson.Gson.A0H
            r309 = r0
            X.MGc r0 = com.google.gson.Gson.A0G
            r310 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r311 = r0
            r0 = r301
            r1 = r303
            r2 = r305
            r3 = r309
            r4 = r310
            r5 = r302
            r6 = r306
            r7 = r307
            r8 = r308
            r9 = r311
            r10 = r304
            r11 = 0
            r12 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v214, types: [X.5xY] */
    /* JADX WARN: Type inference failed for: r0v216, types: [X.5xY] */
    public Gson(MDf mDf, KM8 km8, MGc mGc, MGc mGc2, LgR lgR, List list, List list2, List list3, List list4, Map map, boolean z, boolean z2) {
        this.A0D = new ThreadLocal();
        this.A0E = JQx.A13();
        this.A03 = lgR;
        this.A00 = mDf;
        this.A08 = map;
        L2z l2z = new L2z(list4, map);
        this.A0B = l2z;
        this.A0A = z;
        this.A09 = z2;
        this.A04 = list;
        this.A05 = list2;
        this.A02 = mGc;
        this.A01 = mGc2;
        this.A07 = list4;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(5xZ.A0d);
        5xY r0 = KDn.A02;
        A0s.add(mGc == KPZ.A00 ? KDn.A02 : new LgO(mGc, 1));
        A0s.add(lgR);
        A0s.addAll(list3);
        A0s.add(5xZ.A0i);
        A0s.add(5xZ.A0c);
        A0s.add(5xZ.A0U);
        A0s.add(5xZ.A0V);
        A0s.add(5xZ.A0f);
        KDZ kdz = km8 == KM8.A00 ? 5xZ.A0I : new KDZ();
        final Class cls = Long.TYPE;
        final KDZ kdz2 = kdz;
        final Class<Long> cls2 = Long.class;
        A0s.add(new 5xY() { // from class: X.5xb
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class cls3 = typeToken.rawType;
                if (cls3 == cls || cls3 == cls2) {
                    return kdz2;
                }
                return null;
            }

            public String toString() {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append(JQw.A00(ActionId.WAIT_FOR_BLOCKERS));
                A0k.append(cls2.getName());
                A0k.append("+");
                A0k.append(cls.getName());
                A0k.append(",adapter=");
                A0k.append(kdz2);
                return AnonymousClass001.A0d("]", A0k);
            }
        });
        final Class cls3 = Double.TYPE;
        final KDa kDa = new KDa(this, 0);
        final Class<Double> cls4 = Double.class;
        A0s.add(new 5xY() { // from class: X.5xb
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class cls32 = typeToken.rawType;
                if (cls32 == cls3 || cls32 == cls4) {
                    return kDa;
                }
                return null;
            }

            public String toString() {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append(JQw.A00(ActionId.WAIT_FOR_BLOCKERS));
                A0k.append(cls4.getName());
                A0k.append("+");
                A0k.append(cls3.getName());
                A0k.append(",adapter=");
                A0k.append(kDa);
                return AnonymousClass001.A0d("]", A0k);
            }
        });
        final Class cls5 = Float.TYPE;
        final Class<Float> cls6 = Float.class;
        final KDa kDa2 = new KDa(this, 1);
        A0s.add(new 5xY() { // from class: X.5xb
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class cls32 = typeToken.rawType;
                if (cls32 == cls5 || cls32 == cls6) {
                    return kDa2;
                }
                return null;
            }

            public String toString() {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append(JQw.A00(ActionId.WAIT_FOR_BLOCKERS));
                A0k.append(cls6.getName());
                A0k.append("+");
                A0k.append(cls5.getName());
                A0k.append(",adapter=");
                A0k.append(kDa2);
                return AnonymousClass001.A0d("]", A0k);
            }
        });
        5xY r02 = KDi.A01;
        A0s.add(mGc2 == KPZ.A01 ? KDi.A01 : new LgO(new KDi(mGc2), 0));
        A0s.add(5xZ.A0S);
        A0s.add(5xZ.A0Q);
        A0s.add(new JTn(new JRN(new KDa(kdz, 2)), AtomicLong.class, 0));
        A0s.add(new JTn(new JRN(new KDa(kdz, 3)), AtomicLongArray.class, 0));
        A0s.add(5xZ.A0R);
        A0s.add(5xZ.A0X);
        A0s.add(5xZ.A0h);
        A0s.add(5xZ.A0g);
        A0s.add(new JTn(5xZ.A03, BigDecimal.class, 0));
        A0s.add(new JTn(5xZ.A04, BigInteger.class, 0));
        A0s.add(new JTn(5xZ.A0G, KR3.class, 0));
        A0s.add(5xZ.A0k);
        A0s.add(5xZ.A0j);
        A0s.add(5xZ.A0l);
        A0s.add(5xZ.A0Z);
        A0s.add(5xZ.A0e);
        A0s.add(5xZ.A0b);
        A0s.add(5xZ.A0T);
        A0s.add(KDh.A01);
        A0s.add(5xZ.A0W);
        if (Kcw.A03) {
            A0s.add(Kcw.A02);
            A0s.add(Kcw.A00);
            A0s.add(Kcw.A01);
        }
        A0s.add(KDm.A02);
        A0s.add(5xZ.A0Y);
        A0s.add(new LgM(l2z));
        A0s.add(new LgN(l2z));
        LgP lgP = new LgP(l2z);
        this.A0C = lgP;
        A0s.add(lgP);
        A0s.add(5xZ.A0a);
        A0s.add(new LgQ(mDf, l2z, lgR, lgP, list4));
        this.A06 = Collections.unmodifiableList(A0s);
    }

    public static Object A00(Gson gson, TypeToken typeToken, JsonReader jsonReader) {
        Object obj;
        boolean z = jsonReader.A08;
        boolean z2 = true;
        jsonReader.A08 = true;
        try {
            try {
                try {
                    jsonReader.A0K();
                    z2 = false;
                    obj = gson.A03(typeToken).read(jsonReader);
                } catch (IOException e) {
                    new RuntimeException(e);
                    throw r306;
                } catch (IllegalStateException e2) {
                    new RuntimeException(e2);
                    throw r306;
                }
            } catch (EOFException e3) {
                if (!z2) {
                    new RuntimeException(e3);
                    throw r306;
                }
                obj = null;
            } catch (AssertionError e4) {
                AssertionError A0J = AnonymousClass001.A0J(0Pz.A1B("AssertionError (GSON 2.10.1): ", e4));
                throw A0J;
            }
            jsonReader.A08 = z;
            return obj;
        } catch (Throwable th) {
            jsonReader.A08 = z;
            throw th;
        }
    }

    private Object A01(TypeToken typeToken, String str) {
        Object A00;
        if (str == null) {
            A00 = null;
        } else {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.A08 = false;
            A00 = A00(this, typeToken, jsonReader);
            if (A00 != null) {
                try {
                    if (jsonReader.A0K() != 0S2.A1J) {
                        throw new RuntimeException("JSON document was not fully consumed.");
                    }
                } catch (KLc e) {
                    throw new RuntimeException((Throwable) e);
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return A00;
    }

    public TypeAdapter A02(5xY r302, TypeToken typeToken) {
        List<5xY> list = this.A06;
        if (!list.contains(r302)) {
            r302 = this.A0C;
        }
        boolean z = false;
        for (5xY r0 : list) {
            if (z) {
                TypeAdapter create = r0.create(this, typeToken);
                if (create != null) {
                    return create;
                }
            } else if (r0 == r302) {
                z = true;
            }
        }
        throw AnonymousClass002.A0C(typeToken, "GSON cannot serialize ", AnonymousClass001.A0k());
    }

    public TypeAdapter A03(TypeToken typeToken) {
        C6f2.A00("type must not be null", typeToken);
        ConcurrentMap concurrentMap = this.A0E;
        TypeAdapter typeAdapter = (TypeAdapter) concurrentMap.get(typeToken);
        if (typeAdapter == null) {
            ThreadLocal threadLocal = this.A0D;
            Map map = (Map) threadLocal.get();
            boolean z = false;
            if (map == null) {
                map = AnonymousClass001.A0u();
                threadLocal.set(map);
                z = true;
            } else {
                TypeAdapter typeAdapter2 = (TypeAdapter) map.get(typeToken);
                if (typeAdapter2 != null) {
                    return typeAdapter2;
                }
            }
            typeAdapter = null;
            try {
                KDw kDw = new KDw();
                map.put(typeToken, kDw);
                Iterator it = this.A06.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    typeAdapter = ((5xY) it.next()).create(this, typeToken);
                    if (typeAdapter != null) {
                        if (kDw.A00 != null) {
                            throw AnonymousClass001.A0J("Delegate is already set");
                        }
                        kDw.A00 = typeAdapter;
                        map.put(typeToken, typeAdapter);
                    }
                }
            } finally {
                th = th;
                if (z) {
                    threadLocal.remove();
                }
                throw th;
            }
            if (typeAdapter == null) {
                th = AnonymousClass002.A0C(typeToken, "GSON (2.10.1) cannot handle ", AnonymousClass001.A0k());
                throw th;
            }
            if (z) {
                concurrentMap.putAll(map);
                return typeAdapter;
            }
        }
        return typeAdapter;
    }

    public Object A04(String str, Class cls) {
        return KYh.A00(cls).cast(A01(new TypeToken(cls), str));
    }

    public Object A05(String str, Type type) {
        return A01(new TypeToken(type), str);
    }

    public String A06(Object obj) {
        StringWriter stringWriter;
        if (obj != null) {
            return A07(obj, obj.getClass());
        }
        C6f0 c6f0 = C6f0.A00;
        StringWriter stringWriter2 = new StringWriter();
        if (stringWriter2 instanceof Writer) {
            stringWriter = stringWriter2;
        } else {
            try {
                new KM7(stringWriter2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        boolean z = this.A09;
        jsonWriter.A01 = z;
        jsonWriter.A02 = false;
        boolean z2 = this.A0A;
        jsonWriter.A03 = z2;
        jsonWriter.A02 = true;
        jsonWriter.A01 = z;
        jsonWriter.A03 = z2;
        try {
            try {
                5xZ.A0F.write(jsonWriter, c6f0);
                jsonWriter.A02 = false;
                jsonWriter.A01 = z;
                jsonWriter.A03 = z2;
                return stringWriter2.toString();
            } catch (IOException e2) {
                new RuntimeException(e2);
                throw r304;
            } catch (AssertionError e3) {
                AssertionError A0J = AnonymousClass001.A0J(0Pz.A1B("AssertionError (GSON 2.10.1): ", e3));
                throw A0J;
            }
        } catch (Throwable th) {
            jsonWriter.A02 = false;
            jsonWriter.A01 = z;
            jsonWriter.A03 = z2;
            throw th;
        }
    }

    public String A07(Object obj, Type type) {
        StringWriter stringWriter;
        StringWriter stringWriter2 = new StringWriter();
        if (stringWriter2 instanceof Writer) {
            stringWriter = stringWriter2;
        } else {
            try {
                new KM7(stringWriter2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        boolean z = this.A09;
        jsonWriter.A01 = z;
        jsonWriter.A02 = false;
        boolean z2 = this.A0A;
        jsonWriter.A03 = z2;
        TypeAdapter A0k = JQx.A0k(this, type);
        boolean z3 = jsonWriter.A02;
        jsonWriter.A02 = true;
        boolean z4 = jsonWriter.A01;
        jsonWriter.A01 = z;
        boolean z5 = jsonWriter.A03;
        jsonWriter.A03 = z2;
        try {
            try {
                A0k.write(jsonWriter, obj);
                jsonWriter.A02 = z3;
                jsonWriter.A01 = z4;
                jsonWriter.A03 = z5;
                return stringWriter2.toString();
            } catch (IOException e2) {
                new RuntimeException(e2);
                throw r306;
            } catch (AssertionError e3) {
                AssertionError A0J = AnonymousClass001.A0J(0Pz.A1B("AssertionError (GSON 2.10.1): ", e3));
                throw A0J;
            }
        } catch (Throwable th) {
            jsonWriter.A02 = z3;
            jsonWriter.A01 = z4;
            jsonWriter.A03 = z5;
            throw th;
        }
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{serializeNulls:");
        A0k.append(this.A0A);
        A0k.append(",factories:");
        A0k.append(this.A06);
        A0k.append(",instanceCreators:");
        return AbstractC2327GOs.A0U(this.A0B, A0k);
    }
}

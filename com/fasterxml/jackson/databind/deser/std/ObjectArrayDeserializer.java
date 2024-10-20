package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24S;
import X.2Go;
import X.68U;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass437;
import X.C26O;
import X.C27T;
import X.C2cb;
import X.C42h;
import X.C42k;
import X.C42o;
import X.C42x;
import X.C68e;
import X.C68i;
import X.C68k;
import X.JQx;
import X.JQy;
import X.L8v;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Array;

/* loaded from: ObjectArrayDeserializer.class */
public class ObjectArrayDeserializer extends ContainerDeserializerBase implements AnonymousClass437 {
    public static final long serialVersionUID = 1;
    public final Class _elementClass;
    public JsonDeserializer _elementDeserializer;
    public final C68e _elementTypeDeserializer;
    public final Object[] _emptyValue;
    public final boolean _untyped;

    public ObjectArrayDeserializer(24S r302, JsonDeserializer jsonDeserializer, C68e c68e) {
        super(r302, (C42o) null, (Boolean) null);
        C42k c42k = (C42k) r302;
        Class cls = c42k._componentType._class;
        this._elementClass = cls;
        this._untyped = AnonymousClass001.A1W(cls, Object.class);
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = c68e;
        this._emptyValue = (Object[]) c42k._emptyArray;
    }

    public ObjectArrayDeserializer(JsonDeserializer jsonDeserializer, C42o c42o, ObjectArrayDeserializer objectArrayDeserializer, C68e c68e, Boolean bool) {
        super(c42o, objectArrayDeserializer, bool);
        this._elementClass = objectArrayDeserializer._elementClass;
        this._untyped = objectArrayDeserializer._untyped;
        this._emptyValue = objectArrayDeserializer._emptyValue;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = c68e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Object[] A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object[] A06;
        Object A0M;
        int i;
        if (!abstractC01033pi.A1p()) {
            return A01(abstractC01033pi, c27t);
        }
        L8v A0T = c27t.A0T();
        Object[] A03 = A0T.A03();
        C68e c68e = this._elementTypeDeserializer;
        int i2 = 0;
        while (true) {
            try {
                C42h A1K = abstractC01033pi.A1K();
                if (A1K == C42h.A01) {
                    break;
                }
                try {
                    if (A1K != C42h.A09) {
                        A0M = c68e == null ? this._elementDeserializer.A0M(abstractC01033pi, c27t) : this._elementDeserializer.A0T(abstractC01033pi, c27t, c68e);
                    } else if (this._skipNullValues) {
                        continue;
                    } else {
                        A0M = JQx.A0r(c27t, this);
                    }
                    A03[i2] = A0M;
                    i2 = i;
                } catch (Exception e) {
                    e = e;
                    i2 = i;
                    throw C2cb.A03(A03, e, A0T.A00 + i2);
                }
                if (i2 >= A03.length) {
                    A03 = A0T.A04(A03);
                    i2 = 0;
                }
                i = i2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this._untyped) {
            int i3 = A0T.A00 + i2;
            A06 = new Object[i3];
            L8v.A01(A0T, A06, A03, i3, i2);
            L8v.A00(A0T);
        } else {
            A06 = A0T.A06(A03, i2, this._elementClass);
        }
        c27t.A0i(A0T);
        return A06;
    }

    private Object[] A01(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A0M;
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && c27t.A0p(C26O.A04))) {
            if (!abstractC01033pi.A1u(C42h.A09)) {
                C68e c68e = this._elementTypeDeserializer;
                JsonDeserializer jsonDeserializer = this._elementDeserializer;
                A0M = c68e == null ? jsonDeserializer.A0M(abstractC01033pi, c27t) : jsonDeserializer.A0T(abstractC01033pi, c27t, c68e);
            } else {
                if (this._skipNullValues) {
                    return this._emptyValue;
                }
                A0M = JQx.A0r(c27t, this);
            }
            Object[] objArr = this._untyped ? new Object[1] : (Object[]) Array.newInstance((Class<?>) this._elementClass, 1);
            objArr[0] = A0M;
            return objArr;
        }
        if (!abstractC01033pi.A1u(C42h.A0C)) {
            c27t.A0W(abstractC01033pi, this._containerType);
            throw 0Q8.createAndThrow();
        }
        if (this._elementClass != Byte.class) {
            return (Object[]) A0q(abstractC01033pi, c27t);
        }
        byte[] A1w = abstractC01033pi.A1w(c27t._config._base._defaultBase64);
        int length = A1w.length;
        Byte[] bArr = new Byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = Byte.valueOf(A1w[i]);
        }
        return bArr;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C68i A0L() {
        return C68i.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        Object[] A06;
        Object A0M;
        int i;
        Object[] objArr = (Object[]) obj;
        if (!abstractC01033pi.A1p()) {
            Object[] A01 = A01(abstractC01033pi, c27t);
            if (A01 == null) {
                return objArr;
            }
            int length = objArr.length;
            int length2 = A01.length;
            Object[] objArr2 = new Object[length2 + length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(A01, 0, objArr2, length, length2);
            return objArr2;
        }
        L8v A0T = c27t.A0T();
        int length3 = objArr.length;
        Object[] A05 = A0T.A05(objArr, length3);
        C68e c68e = this._elementTypeDeserializer;
        while (true) {
            try {
                C42h A1K = abstractC01033pi.A1K();
                if (A1K == C42h.A01) {
                    break;
                }
                try {
                    if (A1K != C42h.A09) {
                        A0M = c68e == null ? this._elementDeserializer.A0M(abstractC01033pi, c27t) : this._elementDeserializer.A0T(abstractC01033pi, c27t, c68e);
                    } else if (this._skipNullValues) {
                        continue;
                    } else {
                        A0M = JQx.A0r(c27t, this);
                    }
                    A05[length3] = A0M;
                    length3 = i;
                } catch (Exception e) {
                    e = e;
                    length3 = i;
                    throw C2cb.A03(A05, e, A0T.A00 + length3);
                }
                if (length3 >= A05.length) {
                    A05 = A0T.A04(A05);
                    length3 = 0;
                }
                i = length3 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this._untyped) {
            int i2 = A0T.A00 + length3;
            A06 = new Object[i2];
            L8v.A01(A0T, A06, A05, i2, length3);
            L8v.A00(A0T);
        } else {
            A06 = A0T.A06(A05, length3, this._elementClass);
        }
        c27t.A0i(A0T);
        return A06;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Array;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        return c68e.A06(abstractC01033pi, c27t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301._elementTypeDeserializer != null) goto L6;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0W() {
        /*
            r301 = this;
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._elementDeserializer
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            X.68e r0 = r0._elementTypeDeserializer
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L18
        L14:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer.A0W():boolean");
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        JsonDeserializer jsonDeserializer = this._elementDeserializer;
        Boolean A0j = A0j(C68k.A01, r302, c27t, this._containerType._class);
        JsonDeserializer A0a = JQy.A0a(r302, c27t, StdDeserializer.A0A(r302, c27t, jsonDeserializer), this);
        C68e c68e = this._elementTypeDeserializer;
        if (c68e != null) {
            c68e = c68e.A04(r302);
        }
        C42o A0h = A0h(r302, c27t, A0a);
        return (2Go.A00(A0j, this._unwrapSingle) && A0h == this._nullProvider && A0a == this._elementDeserializer && c68e == this._elementTypeDeserializer) ? this : new ObjectArrayDeserializer(A0a, A0h, this, c68e, A0j);
    }
}

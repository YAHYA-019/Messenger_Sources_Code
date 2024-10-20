package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24S;
import X.27C;
import X.2Go;
import X.68U;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass437;
import X.C26L;
import X.C26O;
import X.C27T;
import X.C2cb;
import X.C42h;
import X.C42o;
import X.C42x;
import X.C68e;
import X.C68h;
import X.C68i;
import X.C68k;
import X.L8v;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: StringArrayDeserializer.class */
public final class StringArrayDeserializer extends StdDeserializer implements AnonymousClass437 {
    public static final long serialVersionUID = 2;
    public JsonDeserializer _elementDeserializer;
    public final C42o _nullProvider;
    public final boolean _skipNullValues;
    public final Boolean _unwrapSingle;
    public static final String[] A01 = new String[0];
    public static final StringArrayDeserializer A00 = new StringArrayDeserializer();

    public StringArrayDeserializer() {
        this(null, null, null);
    }

    public StringArrayDeserializer(JsonDeserializer jsonDeserializer, C42o c42o, Boolean bool) {
        super(String[].class);
        this._elementDeserializer = jsonDeserializer;
        this._nullProvider = c42o;
        this._unwrapSingle = bool;
        this._skipNullValues = AnonymousClass001.A1W(c42o, C68h.A01);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public String[] A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        String A1b;
        int i;
        if (!abstractC01033pi.A1p()) {
            return A01(abstractC01033pi, c27t);
        }
        if (this._elementDeserializer != null) {
            return A02(abstractC01033pi, c27t, null);
        }
        L8v A0T = c27t.A0T();
        Object[] A03 = A0T.A03();
        int i2 = 0;
        while (true) {
            try {
                A1b = abstractC01033pi.A1b();
            } catch (Exception e) {
                e = e;
            }
            try {
                if (A1b == null) {
                    C42h A1I = abstractC01033pi.A1I();
                    if (A1I == C42h.A01) {
                        String[] strArr = (String[]) A0T.A06(A03, i2, String.class);
                        c27t.A0i(A0T);
                        return strArr;
                    }
                    if (A1I != C42h.A09) {
                        A1b = A0t(abstractC01033pi, c27t);
                    } else if (this._skipNullValues) {
                        continue;
                    } else {
                        A1b = (String) this._nullProvider.Azd(c27t);
                    }
                }
                A03[i2] = A1b;
                i2 = i;
            } catch (Exception e2) {
                e = e2;
                i2 = i;
                throw C2cb.A03(A03, e, A0T.A00 + i2);
            }
            if (i2 >= A03.length) {
                A03 = A0T.A04(A03);
                i2 = 0;
            }
            i = i2 + 1;
        }
    }

    private final String[] A01(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && c27t.A0p(C26O.A04))) {
            return new String[]{(String) (abstractC01033pi.A1u(C42h.A09) ? this._nullProvider.Azd(c27t) : A0t(abstractC01033pi, c27t))};
        }
        if (abstractC01033pi.A1u(C42h.A0C)) {
            return (String[]) A0q(abstractC01033pi, c27t);
        }
        c27t.A0Y(abstractC01033pi, this._valueClass);
        throw 0Q8.createAndThrow();
    }

    private final String[] A02(AbstractC01033pi abstractC01033pi, C27T c27t, String[] strArr) {
        int length;
        Object[] A05;
        String str;
        int i;
        L8v A0T = c27t.A0T();
        if (strArr == null) {
            A05 = A0T.A03();
            length = 0;
        } else {
            length = strArr.length;
            A05 = A0T.A05(strArr, length);
        }
        JsonDeserializer jsonDeserializer = this._elementDeserializer;
        while (true) {
            try {
            } catch (Exception e) {
                e = e;
            }
            try {
                if (abstractC01033pi.A1b() == null) {
                    C42h A1I = abstractC01033pi.A1I();
                    if (A1I == C42h.A01) {
                        String[] strArr2 = (String[]) A0T.A06(A05, length, String.class);
                        c27t.A0i(A0T);
                        return strArr2;
                    }
                    if (A1I != C42h.A09) {
                        str = (String) jsonDeserializer.A0M(abstractC01033pi, c27t);
                    } else if (this._skipNullValues) {
                        continue;
                    } else {
                        str = (String) this._nullProvider.Azd(c27t);
                    }
                } else {
                    str = (String) jsonDeserializer.A0M(abstractC01033pi, c27t);
                }
                A05[length] = str;
                length = i;
            } catch (Exception e2) {
                e = e2;
                length = i;
                throw C2cb.A03(String.class, e, length);
            }
            if (length >= A05.length) {
                A05 = A0T.A04(A05);
                length = 0;
            }
            i = length + 1;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C68i A0L() {
        return C68i.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        String A1b;
        int i;
        String[] strArr = (String[]) obj;
        if (!abstractC01033pi.A1p()) {
            String[] A012 = A01(abstractC01033pi, c27t);
            if (A012 == null) {
                return strArr;
            }
            int length = strArr.length;
            int length2 = A012.length;
            String[] strArr2 = new String[length2 + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(A012, 0, strArr2, length, length2);
            return strArr2;
        }
        if (this._elementDeserializer != null) {
            return A02(abstractC01033pi, c27t, strArr);
        }
        L8v A0T = c27t.A0T();
        int length3 = strArr.length;
        Object[] A05 = A0T.A05(strArr, length3);
        while (true) {
            try {
                A1b = abstractC01033pi.A1b();
                if (A1b == null) {
                    C42h A1I = abstractC01033pi.A1I();
                    if (A1I == C42h.A01) {
                        Object[] A06 = A0T.A06(A05, length3, String.class);
                        c27t.A0i(A0T);
                        return A06;
                    }
                    if (A1I != C42h.A09) {
                        A1b = A0t(abstractC01033pi, c27t);
                    } else {
                        if (this._skipNullValues) {
                            return A01;
                        }
                        A1b = (String) this._nullProvider.Azd(c27t);
                    }
                }
                if (length3 >= A05.length) {
                    A05 = A0T.A04(A05);
                    length3 = 0;
                }
                i = length3 + 1;
            } catch (Exception e) {
                e = e;
            }
            try {
                A05[length3] = A1b;
                length3 = i;
            } catch (Exception e2) {
                e = e2;
                length3 = i;
                throw C2cb.A03(A05, e, A0T.A00 + length3);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Array;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean A0R(C26L c26l) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        return c68e.A06(abstractC01033pi, c27t);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0U(C27T c27t) {
        return A01;
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        JsonDeserializer A0A = StdDeserializer.A0A(r302, c27t, this._elementDeserializer);
        24S A0F = c27t.A0F(String.class);
        JsonDeserializer A0G = A0A == null ? c27t.A0G(r302, A0F) : c27t.A0I(r302, A0F, A0A);
        Boolean A0j = A0j(C68k.A01, r302, c27t, String[].class);
        C42o A0h = A0h(r302, c27t, A0G);
        if (A0G != null && 27C.A0L(A0G)) {
            A0G = null;
        }
        return (this._elementDeserializer == A0G && 2Go.A00(this._unwrapSingle, A0j) && this._nullProvider == A0h) ? this : new StringArrayDeserializer(A0G, A0h, A0j);
    }
}

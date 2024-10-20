package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24S;
import X.68W;
import X.AbstractC01033pi;
import X.AnonymousClass437;
import X.C26O;
import X.C27T;
import X.C2cb;
import X.C42h;
import X.C42o;
import X.C42x;
import X.C68e;
import X.JQx;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Collection;

/* loaded from: StringCollectionDeserializer.class */
public final class StringCollectionDeserializer extends ContainerDeserializerBase implements AnonymousClass437 {
    public static final long serialVersionUID = 1;
    public final JsonDeserializer _delegateDeserializer;
    public final JsonDeserializer _valueDeserializer;
    public final 68W _valueInstantiator;

    public StringCollectionDeserializer(24S r302, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, C42o c42o, 68W r306, Boolean bool) {
        super(r302, c42o, bool);
        this._valueDeserializer = jsonDeserializer2;
        this._valueInstantiator = r306;
        this._delegateDeserializer = jsonDeserializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Collection A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        JsonDeserializer jsonDeserializer = this._delegateDeserializer;
        return jsonDeserializer != null ? (Collection) this._valueInstantiator.A0E(c27t, jsonDeserializer.A0M(abstractC01033pi, c27t)) : A0N(abstractC01033pi, c27t, (Collection) this._valueInstantiator.A09(c27t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public Collection A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Collection collection) {
        String str;
        String A0t;
        try {
            if (abstractC01033pi.A1p()) {
                JsonDeserializer jsonDeserializer = this._valueDeserializer;
                if (jsonDeserializer != null) {
                    while (true) {
                        if (abstractC01033pi.A1b() == null) {
                            C42h A1I = abstractC01033pi.A1I();
                            if (A1I == C42h.A01) {
                                break;
                            }
                            if (A1I != C42h.A09) {
                                str = (String) jsonDeserializer.A0M(abstractC01033pi, c27t);
                            } else if (!this._skipNullValues) {
                                str = (String) JQx.A0r(c27t, this);
                            }
                        } else {
                            str = (String) jsonDeserializer.A0M(abstractC01033pi, c27t);
                        }
                        collection.add(str);
                    }
                } else {
                    while (true) {
                        String A1b = abstractC01033pi.A1b();
                        if (A1b == null) {
                            C42h A1I2 = abstractC01033pi.A1I();
                            if (A1I2 == C42h.A01) {
                                break;
                            }
                            if (A1I2 != C42h.A09) {
                                A1b = A0t(abstractC01033pi, c27t);
                            } else if (!this._skipNullValues) {
                                A1b = (String) JQx.A0r(c27t, this);
                            }
                        }
                        collection.add(A1b);
                    }
                }
            } else {
                Boolean bool = this._unwrapSingle;
                if (bool == Boolean.TRUE || (bool == null && c27t.A0p(C26O.A04))) {
                    JsonDeserializer jsonDeserializer2 = this._valueDeserializer;
                    if (abstractC01033pi.A1I() != C42h.A09) {
                        A0t = jsonDeserializer2 == null ? A0t(abstractC01033pi, c27t) : (String) jsonDeserializer2.A0M(abstractC01033pi, c27t);
                    } else if (!this._skipNullValues) {
                        A0t = JQx.A0r(c27t, this);
                    }
                    collection.add(A0t);
                    return collection;
                }
                if (!abstractC01033pi.A1u(C42h.A0C)) {
                    c27t.A0W(abstractC01033pi, this._containerType);
                    throw 0Q8.createAndThrow();
                }
                collection = (Collection) A0q(abstractC01033pi, c27t);
            }
            return collection;
        } catch (Exception e) {
            throw C2cb.A03(collection, e, collection.size());
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Collection;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        return c68e.A06(abstractC01033pi, c27t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301._delegateDeserializer != null) goto L6;
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
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._valueDeserializer
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._delegateDeserializer
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.A0W():boolean");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public 68W A0i() {
        return this._valueInstantiator;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // X.AnonymousClass437
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonDeserializer AJM(X.68U r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.AJM(X.68U, X.27T):com.fasterxml.jackson.databind.JsonDeserializer");
    }
}

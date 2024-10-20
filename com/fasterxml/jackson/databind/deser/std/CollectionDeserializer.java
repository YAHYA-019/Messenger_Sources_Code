package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24S;
import X.27C;
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
import X.C81f;
import X.DKE;
import X.JQx;
import X.JyA;
import X.KjG;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Collection;
import java.util.List;

/* loaded from: CollectionDeserializer.class */
public class CollectionDeserializer extends ContainerDeserializerBase implements AnonymousClass437 {
    public static final long serialVersionUID = 255;
    public final JsonDeserializer _delegateDeserializer;
    public final JsonDeserializer _valueDeserializer;
    public final 68W _valueInstantiator;
    public final C68e _valueTypeDeserializer;

    public CollectionDeserializer(24S r302, JsonDeserializer jsonDeserializer, JsonDeserializer jsonDeserializer2, C42o c42o, 68W r306, C68e c68e, Boolean bool) {
        super(r302, c42o, bool);
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = c68e;
        this._valueInstantiator = r306;
        this._delegateDeserializer = jsonDeserializer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (r309 != null) goto L21;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Collection A0M(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.A0M(X.3pi, X.27T):java.util.Collection");
    }

    private final void A01(AbstractC01033pi abstractC01033pi, C27T c27t, Collection collection) {
        Object A0M;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !c27t.A0p(C26O.A04))) {
            c27t.A0W(abstractC01033pi, this._containerType);
            throw 0Q8.createAndThrow();
        }
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        C68e c68e = this._valueTypeDeserializer;
        try {
            if (!abstractC01033pi.A1u(C42h.A09)) {
                A0M = c68e == null ? jsonDeserializer.A0M(abstractC01033pi, c27t) : jsonDeserializer.A0T(abstractC01033pi, c27t, c68e);
            } else if (this._skipNullValues) {
                return;
            } else {
                A0M = JQx.A0r(c27t, this);
            }
            collection.add(A0M);
        } catch (Exception e) {
            if (!c27t.A0p(C26O.A0Q)) {
                27C.A0H(e);
            }
            throw C2cb.A03(Object.class, e, collection.size());
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        Collection collection = (Collection) obj;
        if (abstractC01033pi.A1p()) {
            return A12(abstractC01033pi, c27t, collection);
        }
        A01(abstractC01033pi, c27t, collection);
        return collection;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Collection;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        return c68e.A06(abstractC01033pi, c27t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r301._delegateDeserializer != null) goto L8;
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
            if (r0 != 0) goto L1d
            r0 = r301
            X.68e r0 = r0._valueTypeDeserializer
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1d
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._delegateDeserializer
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L21
        L1d:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L21:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.A0W():boolean");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public 68W A0i() {
        return this._valueInstantiator;
    }

    public Collection A12(AbstractC01033pi abstractC01033pi, C27T c27t, Collection collection) {
        Object A0M;
        Object A0M2;
        abstractC01033pi.A1i(collection);
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        try {
            if (jsonDeserializer.A0P() == null) {
                C68e c68e = this._valueTypeDeserializer;
                while (true) {
                    C42h A1K = abstractC01033pi.A1K();
                    if (A1K == C42h.A01) {
                        break;
                    }
                    if (A1K != C42h.A09) {
                        A0M = c68e == null ? jsonDeserializer.A0M(abstractC01033pi, c27t) : jsonDeserializer.A0T(abstractC01033pi, c27t, c68e);
                    } else if (!this._skipNullValues) {
                        A0M = JQx.A0r(c27t, this);
                    }
                    collection.add(A0M);
                }
            } else if (abstractC01033pi.A1p()) {
                abstractC01033pi.A1i(collection);
                C68e c68e2 = this._valueTypeDeserializer;
                KjG kjG = new KjG(this._containerType.A05()._class, collection);
                while (true) {
                    C42h A1K2 = abstractC01033pi.A1K();
                    if (A1K2 == C42h.A01) {
                        break;
                    }
                    try {
                    } catch (C81f e) {
                        JyA jyA = new JyA(e, kjG, kjG.A01);
                        kjG.A00.add(jyA);
                        e._roid.A00(jyA);
                    }
                    if (A1K2 != C42h.A09) {
                        A0M2 = c68e2 == null ? jsonDeserializer.A0M(abstractC01033pi, c27t) : jsonDeserializer.A0T(abstractC01033pi, c27t, c68e2);
                    } else if (!this._skipNullValues) {
                        A0M2 = JQx.A0r(c27t, this);
                    }
                    List list = kjG.A00;
                    if (list.isEmpty()) {
                        kjG.A02.add(A0M2);
                    } else {
                        ((JyA) DKE.A0q(list)).A01.add(A0M2);
                    }
                }
            } else {
                A01(abstractC01033pi, c27t, collection);
            }
            return collection;
        } catch (Exception e2) {
            if (c27t != null && !c27t.A0p(C26O.A0Q)) {
                27C.A0H(e2);
            }
            throw C2cb.A03(collection, e2, collection.size());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0157  */
    @Override // X.AnonymousClass437
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ com.fasterxml.jackson.databind.JsonDeserializer AJM(X.68U r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.AJM(X.68U, X.27T):com.fasterxml.jackson.databind.JsonDeserializer");
    }
}

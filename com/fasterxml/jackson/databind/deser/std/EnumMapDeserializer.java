package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24S;
import X.27C;
import X.68U;
import X.68W;
import X.7Rq;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass260;
import X.AnonymousClass436;
import X.AnonymousClass437;
import X.C27T;
import X.C42o;
import X.C42x;
import X.C68e;
import X.JQx;
import X.JQy;
import X.KnN;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.util.EnumMap;

/* loaded from: EnumMapDeserializer.class */
public class EnumMapDeserializer extends ContainerDeserializerBase implements AnonymousClass436, AnonymousClass437 {
    public static final long serialVersionUID = 1;
    public JsonDeserializer _delegateDeserializer;
    public final Class _enumClass;
    public KnN _keyDeserializer;
    public 7Rq _propertyBasedCreator;
    public JsonDeserializer _valueDeserializer;
    public final 68W _valueInstantiator;
    public final C68e _valueTypeDeserializer;

    public EnumMapDeserializer(24S r302, JsonDeserializer jsonDeserializer, 68W r304, C68e c68e) {
        super(r302, (C42o) null, (Boolean) null);
        this._enumClass = r302.A06()._class;
        this._keyDeserializer = null;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = c68e;
        this._valueInstantiator = r304;
    }

    public EnumMapDeserializer(JsonDeserializer jsonDeserializer, KnN knN, C42o c42o, EnumMapDeserializer enumMapDeserializer, C68e c68e) {
        super(c42o, enumMapDeserializer, enumMapDeserializer._unwrapSingle);
        this._enumClass = enumMapDeserializer._enumClass;
        this._keyDeserializer = knN;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = c68e;
        this._valueInstantiator = enumMapDeserializer._valueInstantiator;
        this._delegateDeserializer = enumMapDeserializer._delegateDeserializer;
        this._propertyBasedCreator = enumMapDeserializer._propertyBasedCreator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0149 -> B:8:0x0038). Please report as a decompilation issue!!! */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.EnumMap A0M(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer.A0M(X.3pi, X.27T):java.util.EnumMap");
    }

    public static EnumMap A01(C27T c27t, EnumMapDeserializer enumMapDeserializer) {
        68W r0 = enumMapDeserializer._valueInstantiator;
        if (r0 == null) {
            return new EnumMap(enumMapDeserializer._enumClass);
        }
        try {
            if (r0.A0Q()) {
                return (EnumMap) r0.A09(c27t);
            }
            c27t.A0f(r0, enumMapDeserializer.A0S(), "no default constructor found", AnonymousClass001.A1Z());
            throw 0Q8.createAndThrow();
        } catch (IOException e) {
            27C.A0D(c27t, e);
            throw 0Q8.createAndThrow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0054 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(X.AbstractC01033pi r302, X.C27T r303, java.util.EnumMap r304) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer.A02(X.3pi, X.27T, java.util.EnumMap):void");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        EnumMap enumMap = (EnumMap) obj;
        A02(abstractC01033pi, c27t, enumMap);
        return enumMap;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Map;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        return c68e.A07(abstractC01033pi, c27t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r301._valueTypeDeserializer != null) goto L8;
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
            X.KnN r0 = r0._keyDeserializer
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1d
            r0 = r301
            X.68e r0 = r0._valueTypeDeserializer
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer.A0W():boolean");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public 68W A0i() {
        return this._valueInstantiator;
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        KnN knN = this._keyDeserializer;
        if (knN == null) {
            knN = c27t.A0L(this._containerType.A06());
        }
        JsonDeserializer A0a = JQy.A0a(r302, c27t, this._valueDeserializer, this);
        C68e c68e = this._valueTypeDeserializer;
        if (c68e != null) {
            c68e = c68e.A04(r302);
        }
        C42o A0h = A0h(r302, c27t, A0a);
        return (knN == this._keyDeserializer && A0h == this._nullProvider && A0a == this._valueDeserializer && c68e == this._valueTypeDeserializer) ? this : new EnumMapDeserializer(A0a, knN, A0h, this, c68e);
    }

    @Override // X.AnonymousClass436
    public void Cht(C27T c27t) {
        24S A04;
        24S r307;
        Object[] objArr;
        String str;
        68W r0 = this._valueInstantiator;
        if (r0 != null) {
            if (r0.A0R()) {
                A04 = r0.A05();
                if (A04 == null) {
                    r307 = this._containerType;
                    objArr = new Object[]{r307, AnonymousClass001.A0Y(r0)};
                    str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'";
                    JQx.A1I(c27t, r307, str, objArr);
                    throw 0Q8.createAndThrow();
                }
                this._delegateDeserializer = c27t.A0G(null, A04);
            }
            if (!r0.A0P()) {
                if (r0.A0N()) {
                    this._propertyBasedCreator = 7Rq.A00(c27t, this._valueInstantiator, r0.A0T(c27t._config), c27t._config.A09(AnonymousClass260.A02));
                    return;
                }
                return;
            }
            A04 = r0.A04();
            if (A04 == null) {
                r307 = this._containerType;
                objArr = new Object[]{r307, AnonymousClass001.A0Y(r0)};
                str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
                JQx.A1I(c27t, r307, str, objArr);
                throw 0Q8.createAndThrow();
            }
            this._delegateDeserializer = c27t.A0G(null, A04);
        }
    }
}

package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24S;
import X.27C;
import X.2Go;
import X.68U;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass437;
import X.C26L;
import X.C26O;
import X.C27F;
import X.C27T;
import X.C2cb;
import X.C42h;
import X.C42o;
import X.C42x;
import X.C68e;
import X.C68h;
import X.C68k;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.EnumSet;

/* loaded from: EnumSetDeserializer.class */
public class EnumSetDeserializer extends StdDeserializer implements AnonymousClass437 {
    public static final long serialVersionUID = 1;
    public JsonDeserializer _enumDeserializer;
    public final 24S _enumType;
    public final C42o _nullProvider;
    public final boolean _skipNullValues;
    public final Boolean _unwrapSingle;

    public EnumSetDeserializer(24S r302) {
        super(EnumSet.class);
        this._enumType = r302;
        Class cls = r302._class;
        C27F[] c27fArr = 27C.A01;
        if (!Enum.class.isAssignableFrom(cls)) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Type ");
            A0k.append(r302);
            throw AnonymousClass002.A0D(" not Java Enum type", A0k);
        }
        this._enumDeserializer = null;
        this._unwrapSingle = null;
        this._nullProvider = null;
        this._skipNullValues = false;
    }

    public EnumSetDeserializer(JsonDeserializer jsonDeserializer, C42o c42o, EnumSetDeserializer enumSetDeserializer, Boolean bool) {
        super(enumSetDeserializer);
        this._enumType = enumSetDeserializer._enumType;
        this._enumDeserializer = jsonDeserializer;
        this._nullProvider = c42o;
        this._skipNullValues = AnonymousClass001.A1W(c42o, C68h.A01);
        this._unwrapSingle = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public EnumSet A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        EnumSet noneOf = EnumSet.noneOf(this._enumType._class);
        if (abstractC01033pi.A1p()) {
            A02(abstractC01033pi, c27t, noneOf);
            return noneOf;
        }
        A01(abstractC01033pi, c27t, noneOf);
        return noneOf;
    }

    private void A01(AbstractC01033pi abstractC01033pi, C27T c27t, EnumSet enumSet) {
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !c27t.A0p(C26O.A04))) {
            c27t.A0Y(abstractC01033pi, EnumSet.class);
        } else {
            if (!abstractC01033pi.A1u(C42h.A09)) {
                try {
                    Enum r0 = (Enum) this._enumDeserializer.A0M(abstractC01033pi, c27t);
                    if (r0 != null) {
                        enumSet.add(r0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    throw C2cb.A03(enumSet, e, enumSet.size());
                }
            }
            c27t.A0W(abstractC01033pi, this._enumType);
        }
        throw 0Q8.createAndThrow();
    }

    private final void A02(AbstractC01033pi abstractC01033pi, C27T c27t, EnumSet enumSet) {
        Enum r306;
        while (true) {
            try {
                C42h A1K = abstractC01033pi.A1K();
                if (A1K == C42h.A01) {
                    return;
                }
                if (A1K != C42h.A09) {
                    r306 = (Enum) this._enumDeserializer.A0M(abstractC01033pi, c27t);
                } else if (!this._skipNullValues) {
                    r306 = (Enum) this._nullProvider.Azd(c27t);
                }
                if (r306 != null) {
                    enumSet.add(r306);
                }
            } catch (Exception e) {
                throw C2cb.A03(enumSet, e, enumSet.size());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        EnumSet enumSet = (EnumSet) obj;
        if (abstractC01033pi.A1p()) {
            A02(abstractC01033pi, c27t, enumSet);
            return enumSet;
        }
        A01(abstractC01033pi, c27t, enumSet);
        return enumSet;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Collection;
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
        return EnumSet.noneOf(this._enumType._class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean A0W() {
        boolean z = true;
        if (this._enumType._valueHandler != null) {
            z = false;
        }
        return z;
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        Boolean A0j = A0j(C68k.A01, r302, c27t, EnumSet.class);
        JsonDeserializer jsonDeserializer = this._enumDeserializer;
        24S r0 = this._enumType;
        JsonDeserializer A0G = jsonDeserializer == null ? c27t.A0G(r302, r0) : c27t.A0I(r302, r0, jsonDeserializer);
        return (2Go.A00(this._unwrapSingle, A0j) && this._enumDeserializer == A0G && this._nullProvider == A0G) ? this : new EnumSetDeserializer(A0G, A0h(r302, c27t, A0G), this, A0j);
    }
}

package X;

import java.io.Closeable;

/* renamed from: X.245, reason: invalid class name */
/* loaded from: 245.class */
public abstract class AnonymousClass245 extends AnonymousClass246 {
    public AnonymousClass259 A0A() {
        return ((AnonymousClass244) this)._jsonFactory;
    }

    public 24X A0B(AbstractC01033pi abstractC01033pi) {
        24X r305;
        AnonymousClass244 anonymousClass244 = (AnonymousClass244) this;
        AnonymousClass244.A05(K92.__redex_internal_original_name, abstractC01033pi);
        C26L c26l = anonymousClass244._deserializationConfig;
        if (abstractC01033pi.A1I() == null && abstractC01033pi.A1K() == null) {
            r305 = null;
        } else {
            r305 = (24X) anonymousClass244.A0M(abstractC01033pi, c26l, anonymousClass244._typeFactory.A09(24X.class));
            if (r305 == null) {
                return C09924rw.A00;
            }
        }
        return r305;
    }

    public C4Xb A0C(AbstractC01033pi abstractC01033pi, Class cls) {
        AnonymousClass244 anonymousClass244 = (AnonymousClass244) this;
        24S A09 = anonymousClass244._typeFactory.A09(cls);
        AnonymousClass244.A05(K92.__redex_internal_original_name, abstractC01033pi);
        C27T c27t = new C27T(abstractC01033pi, anonymousClass244._deserializationConfig, anonymousClass244._deserializationContext);
        return new C4Xb(abstractC01033pi, c27t, A09, anonymousClass244.A0G(c27t, A09), null);
    }

    public Object A0D(AbstractC01033pi abstractC01033pi, 5BC r303) {
        AnonymousClass244 anonymousClass244 = (AnonymousClass244) this;
        AnonymousClass244.A05(K92.__redex_internal_original_name, abstractC01033pi);
        return anonymousClass244.A0M(abstractC01033pi, anonymousClass244._deserializationConfig, 24R.A02((43K) null, 24R.A05, anonymousClass244._typeFactory, r303._type));
    }

    public Object A0E(AbstractC01033pi abstractC01033pi, Class cls) {
        AnonymousClass244 anonymousClass244 = (AnonymousClass244) this;
        AnonymousClass244.A05(K92.__redex_internal_original_name, abstractC01033pi);
        return anonymousClass244.A0M(abstractC01033pi, anonymousClass244._deserializationConfig, anonymousClass244._typeFactory.A09(cls));
    }

    public void A0F(28Q r302, Object obj) {
        AnonymousClass244 anonymousClass244 = (AnonymousClass244) this;
        AnonymousClass244.A05("g", r302);
        C25p c25p = anonymousClass244._serializationConfig;
        if (c25p.A0G(26D.A06) && r302.A00 == null) {
            25H r308 = c25p._defaultPrettyPrinter;
            if (r308 instanceof 25J) {
                r308 = ((25J) r308).AJw();
            }
            r302.A00 = r308;
        }
        if (!c25p.A0G(26D.A01) || !(obj instanceof Closeable)) {
            anonymousClass244.A0L(c25p).A0b(r302, obj);
            if (c25p.A0G(26D.A05)) {
                r302.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            anonymousClass244.A0L(c25p).A0b(r302, obj);
            if (c25p.A0G(26D.A05)) {
                r302.flush();
            }
            closeable.close();
        } catch (Exception e) {
            27C.A0B((28Q) null, closeable, e);
            throw 0Q8.createAndThrow();
        }
    }
}

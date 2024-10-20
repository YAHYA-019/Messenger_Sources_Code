package X;

/* renamed from: X.26d, reason: invalid class name */
/* loaded from: 26d.class */
public abstract class C26d {
    public 3eQ A06(7Rm r302) {
        return ((3eQ) 1BK.A0q(A08(), r302.A01)).A00(r302.A03);
    }

    public MCW A07(7Rm r302) {
        return (MCW) 1BK.A0q(A08(), r302.A02);
    }

    public AnonymousClass253 A08() {
        return this instanceof C26c ? ((C26c) this)._config : ((C27T) this)._config;
    }

    public 3BQ A09(24S r302, String str, String str2) {
        if (this instanceof C26c) {
            String format = String.format("Could not resolve type id '%s' as a subtype of %s", str, 27C.A04(r302));
            if (str2 != null) {
                format = 0Pz.A0j(format, ": ", str2);
            }
            return new 3BQ((AbstractC01033pi) null, r302, format, str);
        }
        String format2 = String.format("Could not resolve type id '%s' as a subtype of %s", str, 27C.A04(r302));
        AbstractC01033pi abstractC01033pi = ((C27T) this).A00;
        if (str2 != null) {
            format2 = 0Pz.A0j(format2, ": ", str2);
        }
        return new 3BQ(abstractC01033pi, r302, format2, str);
    }

    public 24R A0A() {
        return (this instanceof C27T ? ((C27T) this)._config : ((C26c) this)._config)._base._typeFactory;
    }

    public C3m9 A0B(Object obj) {
        C3m9 c3m9 = null;
        if (obj instanceof C3m9) {
            c3m9 = (C3m9) obj;
        } else {
            if (!(obj instanceof Class)) {
                throw 0Pz.A07("AnnotationIntrospector returned Converter definition of type ", AnonymousClass001.A0Y(obj), "; expected type Converter or Class<Converter> instead");
            }
            Class cls = (Class) obj;
            if (cls != 3dD.class && !27C.A0J(cls)) {
                if (C3m9.class.isAssignableFrom(cls)) {
                    return (C3m9) 1BK.A0q(A08(), cls);
                }
                throw 0Pz.A07("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<Converter>");
            }
        }
        return c3m9;
    }

    public String A0C(String str) {
        if (str == null) {
            return "[N/A]";
        }
        int length = str.length();
        if (length > 500) {
            str = 0Pz.A0j(str.substring(0, 500), "]...[", str.substring(length - 500));
        }
        return String.format("\"%s\"", str);
    }

    public void A0D(24S r302, String str) {
        if (!(this instanceof C26c)) {
            throw new 3Af(((C27T) this).A00, r302, str);
        }
        throw new 3Af(((C26a) ((C26c) this)).A00, r302, str);
    }

    public void A0E(String str, Class cls) {
        A0D(cls == null ? null : A0A().A09(cls), str);
        throw 0Q8.createAndThrow();
    }
}

package X;

/* renamed from: X.24c, reason: invalid class name */
/* loaded from: 24c.class */
public abstract class C24c extends 24S implements 24Z {
    public static final 24W A00 = 24W.A00;
    public static final long serialVersionUID = 1;
    public final 24W _bindings;
    public final 24S _superClass;
    public final 24S[] _superInterfaces;

    public C24c(24S r302, 24W r303, Class cls, Object obj, Object obj2, 24S[] r307, int i, boolean z) {
        super(cls, obj, obj2, i, z);
        this._bindings = r303 == null ? A00 : r303;
        this._superClass = r302;
        this._superInterfaces = r307;
    }

    public C24c(C24c c24c) {
        super(c24c);
        this._superClass = c24c._superClass;
        this._superInterfaces = c24c._superInterfaces;
        this._bindings = c24c._bindings;
    }

    public static void A03(Class cls, StringBuilder sb, boolean z) {
        char c;
        if (!cls.isPrimitive()) {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char charAt = name.charAt(i);
                if (charAt == '.') {
                    charAt = '/';
                }
                sb.append(charAt);
            }
            if (!z) {
                return;
            } else {
                c = ';';
            }
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Long.TYPE) {
            c = 'J';
        } else if (cls == Float.TYPE) {
            c = 'F';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else {
            if (cls != Void.TYPE) {
                throw 1BK.A0i("Unrecognized primitive type: ", cls.getName());
            }
            c = 'V';
        }
        sb.append(c);
    }

    public String A0U() {
        StringBuilder sb;
        24S r306;
        if (!(this instanceof C24b)) {
            if (this instanceof 3By) {
                return toString();
            }
            if (!(this instanceof C31a)) {
                return ((24S) this)._class.getName();
            }
            C31a c31a = (C31a) this;
            sb = new StringBuilder();
            Class cls = ((24S) c31a)._class;
            sb.append(cls.getName());
            if (c31a._elementType != null && cls.getTypeParameters().length == 1) {
                sb.append('<');
                r306 = c31a._elementType;
                sb.append(((C24c) r306).A0U());
            }
            return sb.toString();
        }
        3Bx r0 = (C24b) this;
        if (r0 instanceof 3Bx) {
            3Bx r02 = r0;
            sb = new StringBuilder();
            Class cls2 = ((24S) r02)._class;
            sb.append(cls2.getName());
            if (r02._referencedType != null && cls2.getTypeParameters().length == 1) {
                sb.append('<');
                r306 = r02._referencedType;
                sb.append(((C24c) r306).A0U());
            }
        } else {
            sb = new StringBuilder();
            Class cls3 = ((24S) r0)._class;
            sb.append(cls3.getName());
            int length = r0._bindings._types.length;
            if (length > 0 && cls3.getTypeParameters().length == length) {
                sb.append('<');
                int i = 0;
                do {
                    24S A09 = r0.A09(i);
                    if (i > 0) {
                        sb.append(',');
                    }
                    sb.append(((C24c) A09).A0U());
                    i++;
                } while (i < length);
            }
        }
        return sb.toString();
        sb.append('>');
        return sb.toString();
    }

    public void ClJ(28Q r302, C26c c26c) {
        r302.A0r(A0U());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.Kls, java.lang.Object] */
    public void ClK(28Q r302, C26c c26c, C4Nr c4Nr) {
        C42h c42h = C42h.A0C;
        ?? obj = new Object();
        obj.A03 = this;
        obj.A04 = null;
        obj.A00 = c42h;
        c4Nr.A01(r302, obj);
        ClJ(r302, c26c);
        c4Nr.A02(r302, obj);
    }
}

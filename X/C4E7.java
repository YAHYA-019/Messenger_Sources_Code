package X;

/* renamed from: X.4E7, reason: invalid class name */
/* loaded from: 4E7.class */
public class C4E7 extends C24c {
    public static final long serialVersionUID = 1;
    public final 24S _keyType;
    public final 24S _valueType;

    public C4E7(24S r302, 24S r303, 24S r304, 24W r305, Class cls, Object obj, Object obj2, 24S[] r309, boolean z) {
        super(r302, r305, cls, obj, obj2, r309, r303.hashCode() ^ r304.hashCode(), z);
        this._keyType = r303;
        this._valueType = r304;
    }

    public C4E7(24S r302, 24S r303, C24c c24c) {
        super(c24c);
        this._keyType = r302;
        this._valueType = r303;
    }

    public 24S A05() {
        return this._valueType;
    }

    public 24S A06() {
        return this._keyType;
    }

    public /* bridge */ /* synthetic */ 24S A08() {
        if (!(this instanceof C4E6)) {
            if (((24S) this)._asStatic) {
                return this;
            }
            Class cls = ((24S) this)._class;
            24W r0 = this._bindings;
            return new C4E7(this._superClass, this._keyType, this._valueType.A08(), r0, cls, ((24S) this)._valueHandler, ((24S) this)._typeHandler, this._superInterfaces, true);
        }
        C4E7 c4e7 = (C4E6) this;
        if (!((24S) c4e7)._asStatic) {
            Class cls2 = ((24S) c4e7)._class;
            24W r02 = c4e7._bindings;
            c4e7 = new C4E7(c4e7._superClass, c4e7._keyType.A08(), c4e7._valueType.A08(), r02, cls2, ((24S) c4e7)._valueHandler, ((24S) c4e7)._typeHandler, c4e7._superInterfaces, true);
        }
        return c4e7;
    }

    public 24S A0A(24S r302) {
        boolean z = this instanceof C4E6;
        24S r0 = this._valueType;
        if (z) {
            if (r0 == r302) {
                return this;
            }
            Class cls = ((24S) this)._class;
            24W r02 = this._bindings;
            return new C4E7(this._superClass, this._keyType, r302, r02, cls, ((24S) this)._valueHandler, ((24S) this)._typeHandler, this._superInterfaces, ((24S) this)._asStatic);
        }
        if (r0 == r302) {
            return this;
        }
        Class cls2 = ((24S) this)._class;
        24W r03 = this._bindings;
        return new C4E7(this._superClass, this._keyType, r302, r03, cls2, ((24S) this)._valueHandler, ((24S) this)._typeHandler, this._superInterfaces, ((24S) this)._asStatic);
    }

    public 24S A0B(24S r302) {
        24S A0B;
        24S A0B2;
        24S A0B3 = super.A0B(r302);
        24S A06 = r302.A06();
        if ((A0B3 instanceof C4E7) && A06 != null && (A0B2 = this._keyType.A0B(A06)) != this._keyType) {
            A0B3 = ((C4E7) A0B3).A0V(A0B2);
        }
        24S A05 = r302.A05();
        if (A05 != null && (A0B = this._valueType.A0B(A05)) != this._valueType) {
            A0B3 = A0B3.A0A(A0B);
        }
        return A0B3;
    }

    public 24S A0C(24S r302, 24W r303, Class cls, 24S[] r305) {
        boolean z = this instanceof C4E6;
        24S r0 = this._keyType;
        24S r02 = this._valueType;
        Object obj = ((24S) this)._valueHandler;
        Object obj2 = ((24S) this)._typeHandler;
        boolean z2 = ((24S) this)._asStatic;
        return z ? new C4E7(r302, r0, r02, r303, cls, obj, obj2, r305, z2) : new C4E7(r302, r0, r02, r303, cls, obj, obj2, r305, z2);
    }

    public /* bridge */ /* synthetic */ 24S A0E(Object obj) {
        if (!(this instanceof C4E6)) {
            Class cls = ((24S) this)._class;
            24W r0 = this._bindings;
            return new C4E7(this._superClass, this._keyType, this._valueType.A0G(obj), r0, cls, ((24S) this)._valueHandler, ((24S) this)._typeHandler, this._superInterfaces, ((24S) this)._asStatic);
        }
        C4E6 c4e6 = (C4E6) this;
        Class cls2 = ((24S) c4e6)._class;
        24W r02 = c4e6._bindings;
        return new C4E7(c4e6._superClass, c4e6._keyType, c4e6._valueType.A0G(obj), r02, cls2, ((24S) c4e6)._valueHandler, ((24S) c4e6)._typeHandler, c4e6._superInterfaces, ((24S) c4e6)._asStatic);
    }

    public /* bridge */ /* synthetic */ 24S A0F(Object obj) {
        if (!(this instanceof C4E6)) {
            Class cls = ((24S) this)._class;
            24W r0 = this._bindings;
            return new C4E7(this._superClass, this._keyType, this._valueType.A0H(obj), r0, cls, ((24S) this)._valueHandler, ((24S) this)._typeHandler, this._superInterfaces, ((24S) this)._asStatic);
        }
        C4E6 c4e6 = (C4E6) this;
        Class cls2 = ((24S) c4e6)._class;
        24W r02 = c4e6._bindings;
        return new C4E7(c4e6._superClass, c4e6._keyType, c4e6._valueType.A0H(obj), r02, cls2, ((24S) c4e6)._valueHandler, ((24S) c4e6)._typeHandler, c4e6._superInterfaces, ((24S) c4e6)._asStatic);
    }

    public /* bridge */ /* synthetic */ 24S A0G(Object obj) {
        if (!(this instanceof C4E6)) {
            Class cls = ((24S) this)._class;
            24W r0 = this._bindings;
            return new C4E7(this._superClass, this._keyType, this._valueType, r0, cls, ((24S) this)._valueHandler, obj, this._superInterfaces, ((24S) this)._asStatic);
        }
        C4E6 c4e6 = (C4E6) this;
        Class cls2 = ((24S) c4e6)._class;
        24W r02 = c4e6._bindings;
        return new C4E7(c4e6._superClass, c4e6._keyType, c4e6._valueType, r02, cls2, ((24S) c4e6)._valueHandler, obj, c4e6._superInterfaces, ((24S) c4e6)._asStatic);
    }

    public /* bridge */ /* synthetic */ 24S A0H(Object obj) {
        if (!(this instanceof C4E6)) {
            Class cls = ((24S) this)._class;
            24W r0 = this._bindings;
            return new C4E7(this._superClass, this._keyType, this._valueType, r0, cls, obj, ((24S) this)._typeHandler, this._superInterfaces, ((24S) this)._asStatic);
        }
        C4E6 c4e6 = (C4E6) this;
        Class cls2 = ((24S) c4e6)._class;
        24W r02 = c4e6._bindings;
        return new C4E7(c4e6._superClass, c4e6._keyType, c4e6._valueType, r02, cls2, obj, ((24S) c4e6)._typeHandler, c4e6._superInterfaces, ((24S) c4e6)._asStatic);
    }

    public StringBuilder A0J(StringBuilder sb) {
        C24c.A03(((24S) this)._class, sb, true);
        return sb;
    }

    public StringBuilder A0K(StringBuilder sb) {
        C24c.A03(((24S) this)._class, sb, false);
        sb.append('<');
        this._keyType.A0K(sb);
        this._valueType.A0K(sb);
        sb.append(">;");
        return sb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r301._keyType.A0M() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0M() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = super.A0M()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L27
            r0 = r301
            X.24S r0 = r0._valueType
            r303 = r0
            r0 = r303
            boolean r0 = r0.A0M()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L27
            r0 = r301
            X.24S r0 = r0._keyType
            boolean r0 = r0.A0M()
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L29
        L27:
            r0 = 1
            r302 = r0
        L29:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4E7.A0M():boolean");
    }

    public boolean A0Q() {
        return true;
    }

    public boolean A0R() {
        return true;
    }

    @Override // X.C24c
    public String A0U() {
        StringBuilder A0k = AnonymousClass001.A0k();
        Class cls = ((24S) this)._class;
        A0k.append(cls.getName());
        if (this._keyType != null && cls.getTypeParameters().length == 2) {
            A0k.append('<');
            A0k.append(((C24c) this._keyType).A0U());
            A0k.append(',');
            A0k.append(((C24c) this._valueType).A0U());
            A0k.append('>');
        }
        return A0k.toString();
    }

    public C4E7 A0V(24S r302) {
        boolean z = this instanceof C4E6;
        24S r0 = this._keyType;
        if (z) {
            if (r302 == r0) {
                return this;
            }
            Class cls = ((24S) this)._class;
            24W r02 = this._bindings;
            return new C4E7(this._superClass, r302, this._valueType, r02, cls, ((24S) this)._valueHandler, ((24S) this)._typeHandler, this._superInterfaces, ((24S) this)._asStatic);
        }
        if (r302 == r0) {
            return this;
        }
        Class cls2 = ((24S) this)._class;
        24W r03 = this._bindings;
        return new C4E7(this._superClass, r302, this._valueType, r03, cls2, ((24S) this)._valueHandler, ((24S) this)._typeHandler, this._superInterfaces, ((24S) this)._asStatic);
    }

    public C4E7 A0W(Object obj) {
        boolean z = this instanceof C4E6;
        Class cls = ((24S) this)._class;
        24W r0 = this._bindings;
        24S r02 = this._superClass;
        24S[] r03 = this._superInterfaces;
        24S A0H = this._keyType.A0H(obj);
        24S r04 = this._valueType;
        Object obj2 = ((24S) this)._valueHandler;
        Object obj3 = ((24S) this)._typeHandler;
        boolean z2 = ((24S) this)._asStatic;
        return z ? new C4E7(r02, A0H, r04, r0, cls, obj2, obj3, r03, z2) : new C4E7(r02, A0H, r04, r0, cls, obj2, obj3, r03, z2);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C4E7 c4e7 = (C4E7) obj;
            if (((24S) this)._class != ((24S) c4e7)._class || !this._keyType.equals(c4e7._keyType) || !this._valueType.equals(c4e7._valueType)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", ((24S) this)._class.getName(), this._keyType, this._valueType);
    }
}

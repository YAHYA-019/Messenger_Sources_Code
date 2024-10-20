package X;

import java.lang.reflect.Array;

/* renamed from: X.42k, reason: invalid class name */
/* loaded from: 42k.class */
public final class C42k extends C24c {
    public static final long serialVersionUID = 1;
    public final 24S _componentType;
    public final Object _emptyArray;

    public C42k(24S r302, 24W r303, Object obj, Object obj2, Object obj3, boolean z) {
        super(null, r303, obj.getClass(), obj2, obj3, null, r302.hashCode(), z);
        this._componentType = r302;
        this._emptyArray = obj;
    }

    public 24S A05() {
        return this._componentType;
    }

    public /* bridge */ /* synthetic */ 24S A08() {
        return ((24S) this)._asStatic ? this : new C42k(this._componentType.A08(), this._bindings, this._emptyArray, ((24S) this)._valueHandler, ((24S) this)._typeHandler, true);
    }

    public 24S A0A(24S r302) {
        return new C42k(r302, this._bindings, Array.newInstance((Class<?>) r302._class, 0), ((24S) this)._valueHandler, ((24S) this)._typeHandler, ((24S) this)._asStatic);
    }

    public 24S A0C(24S r302, 24W r303, Class cls, 24S[] r305) {
        return null;
    }

    public /* bridge */ /* synthetic */ 24S A0E(Object obj) {
        24S r0 = this._componentType;
        return obj == r0._typeHandler ? this : new C42k(r0.A0G(obj), this._bindings, this._emptyArray, ((24S) this)._valueHandler, ((24S) this)._typeHandler, ((24S) this)._asStatic);
    }

    public /* bridge */ /* synthetic */ 24S A0F(Object obj) {
        24S r0 = this._componentType;
        return obj == r0._valueHandler ? this : new C42k(r0.A0H(obj), this._bindings, this._emptyArray, ((24S) this)._valueHandler, ((24S) this)._typeHandler, ((24S) this)._asStatic);
    }

    public /* bridge */ /* synthetic */ 24S A0G(Object obj) {
        return obj == ((24S) this)._typeHandler ? this : new C42k(this._componentType, this._bindings, this._emptyArray, ((24S) this)._valueHandler, obj, ((24S) this)._asStatic);
    }

    public /* bridge */ /* synthetic */ 24S A0H(Object obj) {
        return obj == ((24S) this)._valueHandler ? this : new C42k(this._componentType, this._bindings, this._emptyArray, obj, ((24S) this)._typeHandler, ((24S) this)._asStatic);
    }

    public StringBuilder A0J(StringBuilder sb) {
        sb.append('[');
        return this._componentType.A0J(sb);
    }

    public StringBuilder A0K(StringBuilder sb) {
        sb.append('[');
        return this._componentType.A0K(sb);
    }

    public boolean A0L() {
        return this._componentType.A0L();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r301._componentType.A0M() != false) goto L6;
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
            if (r0 != 0) goto L17
            r0 = r301
            X.24S r0 = r0._componentType
            boolean r0 = r0.A0M()
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L19
        L17:
            r0 = 1
            r302 = r0
        L19:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42k.A0M():boolean");
    }

    public boolean A0N() {
        return false;
    }

    public boolean A0O() {
        return true;
    }

    public boolean A0P() {
        return true;
    }

    public boolean A0Q() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._componentType.equals(((C42k) obj)._componentType);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[array type, component type: ");
        A0k.append(this._componentType);
        return AnonymousClass001.A0d("]", A0k);
    }
}

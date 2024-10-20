package X;

/* renamed from: X.31a, reason: invalid class name */
/* loaded from: 31a.class */
public class C31a extends C24c {
    public static final long serialVersionUID = 1;
    public final 24S _elementType;

    public C31a(24S r302, 24S r303, 24W r304, Class cls, Object obj, Object obj2, 24S[] r308, boolean z) {
        super(r302, r304, cls, obj, obj2, r308, r303.hashCode(), z);
        this._elementType = r303;
    }

    public 24S A0B(24S r302) {
        24S A0B;
        24S A0B2 = super.A0B(r302);
        24S A05 = r302.A05();
        if (A05 != null && (A0B = this._elementType.A0B(A05)) != this._elementType) {
            A0B2 = A0B2.A0A(A0B);
        }
        return A0B2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r301._elementType.A0M() != false) goto L6;
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
            X.24S r0 = r0._elementType
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
        throw new UnsupportedOperationException("Method not decompiled: X.C31a.A0M():boolean");
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C31a c31a = (C31a) obj;
            if (((24S) this)._class != ((24S) c31a)._class || !this._elementType.equals(c31a._elementType)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[collection-like type; class ");
        A0k.append(((24S) this)._class.getName());
        A0k.append(", contains ");
        A0k.append(this._elementType);
        return AnonymousClass001.A0d("]", A0k);
    }
}

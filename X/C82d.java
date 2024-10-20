package X;

/* renamed from: X.82d, reason: invalid class name */
/* loaded from: 82d.class */
public final class C82d extends C04v {
    public String A00;
    public final int A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C82d(int i) {
        this(null, null, 1, 1);
        this.A01 = i;
        if (i != 0) {
        } else {
            this(null, null, 1, 0);
        }
    }

    public C82d(String str, int i) {
        this.A01 = i;
        this.A00 = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C82d(java.lang.String r302, kotlin.jvm.internal.DefaultConstructorMarker r303, int r304, int r305) {
        /*
            r301 = this;
            r0 = r301
            r1 = r305
            r0.A01 = r1
            java.util.UUID r0 = X.C04I.A00()
            r306 = r0
            r0 = r306
            java.lang.String r0 = r0.toString()
            r307 = r0
            r0 = r305
            if (r0 == 0) goto L28
            r0 = r307
            X.11T.A0A(r0)
            r0 = 1
            r308 = r0
        L1f:
            r0 = r301
            r1 = r307
            r2 = r308
            r0.<init>(r1, r2)
            return
        L28:
            r0 = r307
            X.11T.A0A(r0)
            r0 = 0
            r308 = r0
            r0 = 0
            r306 = r0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82d.<init>(java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    public boolean equals(Object obj) {
        int i;
        switch (this.A01) {
            case 0:
                if (this == obj) {
                    return true;
                }
                i = 0;
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                i = 1;
                break;
            case 2:
                if (this == obj) {
                    return true;
                }
                i = 2;
                break;
            default:
                return super.equals(obj);
        }
        if (!(obj instanceof C82d)) {
            return false;
        }
        C82d c82d = (C82d) obj;
        return c82d.A01 == i && 11T.A0O(this.A00, c82d.A00);
    }

    public int hashCode() {
        switch (this.A01) {
            case 0:
            case 1:
            case 2:
                return this.A00.hashCode();
            default:
                return super.hashCode();
        }
    }
}

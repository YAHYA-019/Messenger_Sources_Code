package X;

/* renamed from: X.Gje, reason: case insensitive filesystem */
/* loaded from: Gje.class */
public final class C2629Gje extends C04v {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2629Gje(int i) {
        this(true, false, 4);
        this.A00 = i;
        if (2 - i != 0) {
            this.A00 = 4;
        } else {
            this.A00 = 2;
            this(false, false, 2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2629Gje(kotlin.jvm.internal.DefaultConstructorMarker r302, int r303, int r304, boolean r305, boolean r306) {
        /*
            r301 = this;
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = 2
            r1 = r304
            int r0 = r0 - r1
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1d
            r0 = 1
            r307 = r0
            r0 = 4
            r308 = r0
        L13:
            r0 = r301
            r1 = r307
            r2 = 0
            r3 = r308
            r0.<init>(r1, r2, r3)
            return
        L1d:
            r0 = 0
            r307 = r0
            r0 = 2
            r308 = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2629Gje.<init>(kotlin.jvm.internal.DefaultConstructorMarker, int, int, boolean, boolean):void");
    }

    public C2629Gje(boolean z, boolean z2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 3:
                this.A01 = z;
                this.A02 = z2;
                return;
            default:
                this.A02 = z;
                this.A01 = z2;
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L69;
                case 2: goto L73;
                case 3: goto L28;
                case 4: goto L7d;
                default: goto L28;
            }
        L28:
            r0 = r301
            r1 = r302
            boolean r0 = super.equals(r1)
            return r0
        L2e:
            r0 = r301
            r1 = r302
            if (r0 == r1) goto Lbc
            r0 = 0
            r304 = r0
            r0 = r302
            boolean r0 = r0 instanceof X.C2629Gje
            r303 = r0
            r0 = r303
            if (r0 == 0) goto Lba
            r0 = r302
            X.Gje r0 = (X.C2629Gje) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            r1 = 0
            if (r0 != r1) goto Lba
            r0 = r301
            boolean r0 = r0.A01
            r304 = r0
            r0 = r302
            boolean r0 = r0.A01
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto Lba
            r0 = r301
            boolean r0 = r0.A02
            r304 = r0
            r0 = r302
            boolean r0 = r0.A02
            r303 = r0
            goto Lb5
        L69:
            r0 = r301
            r1 = r302
            if (r0 == r1) goto Lbc
            r0 = 1
            r304 = r0
            goto L84
        L73:
            r0 = r301
            r1 = r302
            if (r0 == r1) goto Lbc
            r0 = 2
            r304 = r0
            goto L84
        L7d:
            r0 = r301
            r1 = r302
            if (r0 == r1) goto Lbc
            r0 = 4
            r304 = r0
        L84:
            r0 = r302
            boolean r0 = r0 instanceof X.C2629Gje
            r303 = r0
            r0 = r303
            if (r0 == 0) goto Lba
            r0 = r302
            X.Gje r0 = (X.C2629Gje) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto Lba
            r0 = r301
            boolean r0 = r0.A02
            r304 = r0
            r0 = r302
            boolean r0 = r0.A02
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto Lba
            r0 = r301
            boolean r0 = r0.A01
            r304 = r0
            r0 = r302
            boolean r0 = r0.A01
            r303 = r0
        Lb5:
            r0 = r304
            r1 = r303
            if (r0 == r1) goto Lbc
        Lba:
            r0 = 0
            return r0
        Lbc:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2629Gje.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int A00;
        boolean z;
        switch (this.A00) {
            case 0:
                A00 = AnonymousClass002.A00(this.A01 ? 1 : 0) * 31;
                z = this.A02;
                break;
            case 1:
            case 2:
            case 4:
                A00 = AnonymousClass002.A00(this.A02 ? 1 : 0) * 31;
                z = this.A01;
                break;
            case 3:
            default:
                return super.hashCode();
        }
        return A00 + AnonymousClass002.A00(z ? 1 : 0);
    }
}

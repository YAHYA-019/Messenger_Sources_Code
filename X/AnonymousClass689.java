package X;

/* renamed from: X.689, reason: invalid class name */
/* loaded from: 689.class */
public final class AnonymousClass689 {
    public final C26G A00;
    public final AnonymousClass689 A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r302.A02() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnonymousClass689(X.C26G r302, X.AnonymousClass689 r303, java.lang.Object r304, boolean r305, boolean r306, boolean r307) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r302
            if (r0 == 0) goto L20
            r0 = r302
            boolean r0 = r0.A02()
            r308 = r0
            r0 = r302
            r309 = r0
            r0 = r308
            if (r0 == 0) goto L26
        L20:
            r0 = 0
            r310 = r0
            r0 = 0
            r309 = r0
        L26:
            r0 = r301
            r1 = r309
            r0.A00 = r1
            r0 = r305
            if (r0 == 0) goto L4d
            r0 = r309
            if (r0 == 0) goto L60
            r0 = r302
            java.lang.String r0 = r0._simpleName
            r309 = r0
            r0 = r309
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r310 = r0
            r0 = r310
            if (r0 != 0) goto L4d
            r0 = 0
            r305 = r0
        L4d:
            r0 = r301
            r1 = r305
            r0.A04 = r1
            r0 = r301
            r1 = r306
            r0.A05 = r1
            r0 = r301
            r1 = r307
            r0.A03 = r1
            return
        L60:
            java.lang.String r0 = "Cannot pass true for 'explName' if name is null/empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0L(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass689.<init>(X.26G, X.689, java.lang.Object, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r303 = A05(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r0 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r0 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass689 A00() {
        /*
            r301 = this;
            r0 = r301
            X.689 r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 != 0) goto Lb
            r0 = r301
            return r0
        Lb:
            r0 = r302
            X.689 r0 = r0.A00()
            r303 = r0
            r0 = r301
            X.26G r0 = r0.A00
            r304 = r0
            r0 = r303
            X.26G r0 = r0.A00
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L2a
            r0 = r302
            if (r0 != 0) goto L49
        L22:
            r0 = r301
            r1 = 0
            X.689 r0 = r0.A05(r1)
            r303 = r0
        L28:
            r0 = r303
            return r0
        L2a:
            r0 = r302
            if (r0 != 0) goto L28
            r0 = r301
            boolean r0 = r0.A05
            r305 = r0
            r0 = r303
            boolean r0 = r0.A05
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 == r1) goto L49
            r0 = r305
            if (r0 == 0) goto L28
            goto L22
        L49:
            r0 = r301
            r1 = r303
            X.689 r0 = r0.A05(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass689.A00():X.689");
    }

    public AnonymousClass689 A01() {
        AnonymousClass689 A01;
        boolean z = this.A03;
        AnonymousClass689 anonymousClass689 = this.A01;
        if (!z) {
            return (anonymousClass689 == null || (A01 = anonymousClass689.A01()) == anonymousClass689) ? this : A05(A01);
        }
        if (anonymousClass689 == null) {
            return null;
        }
        return anonymousClass689.A01();
    }

    public AnonymousClass689 A02() {
        if (this.A01 == null) {
            return this;
        }
        return new AnonymousClass689(this.A00, null, this.A02, this.A04, this.A05, this.A03);
    }

    public AnonymousClass689 A03() {
        AnonymousClass689 anonymousClass689 = this.A01;
        AnonymousClass689 A03 = anonymousClass689 == null ? null : anonymousClass689.A03();
        if (this.A05) {
            A03 = A05(A03);
        }
        return A03;
    }

    public AnonymousClass689 A04(AnonymousClass689 anonymousClass689) {
        AnonymousClass689 anonymousClass6892 = this.A01;
        if (anonymousClass6892 != null) {
            anonymousClass689 = anonymousClass6892.A04(anonymousClass689);
        }
        return A05(anonymousClass689);
    }

    public AnonymousClass689 A05(AnonymousClass689 anonymousClass689) {
        if (anonymousClass689 == this.A01) {
            return this;
        }
        return new AnonymousClass689(this.A00, anonymousClass689, this.A02, this.A04, this.A05, this.A03);
    }

    public String toString() {
        String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.A02.toString(), Boolean.valueOf(this.A05), Boolean.valueOf(this.A03), Boolean.valueOf(this.A04));
        AnonymousClass689 anonymousClass689 = this.A01;
        if (anonymousClass689 != null) {
            format = 0Pz.A0j(format, ", ", anonymousClass689.toString());
        }
        return format;
    }
}

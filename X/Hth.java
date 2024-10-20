package X;

/* loaded from: Hth.class */
public final class Hth {
    public final HFS A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (r307 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Hth(X.HFS r302, java.lang.Object r303, java.lang.Throwable r304, boolean r305) {
        /*
            r301 = this;
            r0 = 0
            r306 = r0
            r0 = r304
            if (r0 == 0) goto L2e
            r0 = r304
            java.lang.String r0 = r0.getLocalizedMessage()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L49
            r0 = r307
            boolean r0 = r0.isEmpty()
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L49
        L1e:
            r0 = r307
            boolean r0 = r0.isEmpty()
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L2e
            r0 = r307
            r306 = r0
        L2e:
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r305
            r0.A03 = r1
            r0 = r301
            r1 = r306
            r0.A02 = r1
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r301
            r1 = r302
            r0.A00 = r1
            return
        L49:
            r0 = r304
            java.lang.String r0 = r0.getMessage()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L2e
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hth.<init>(X.HFS, java.lang.Object, java.lang.Throwable, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Hth hth = (Hth) obj;
        if (this.A03 != hth.A03) {
            return false;
        }
        String str = this.A02;
        String str2 = hth.A02;
        if (str != null) {
            if (!str.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        return this.A01.equals(hth.A01);
    }

    public int hashCode() {
        return 1BK.A03(this.A01, (((this.A03 ? 1 : 0) * 31) + 1BL.A06(this.A02)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ViewModelHolder{mValue=");
        A0k.append(this.A01);
        A0k.append(", mLoading=");
        A0k.append(this.A03);
        A0k.append(", mErrorMessage='");
        A0k.append(this.A02);
        A0k.append('\'');
        return AnonymousClass001.A0f(A0k);
    }
}

package X;

/* renamed from: X.87p, reason: invalid class name */
/* loaded from: 87p.class */
public final class C87p extends C04v {
    public boolean A00;
    public final int A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C87p(int r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.A01 = r1
            r0 = r302
            switch(r0) {
                case 0: goto L74;
                case 1: goto L6f;
                case 5: goto L6a;
                case 7: goto L5d;
                case 10: goto L57;
                case 11: goto L51;
                default: goto L40;
            }
        L40:
            r0 = 13
            r303 = r0
        L43:
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = 0
            r304 = r0
        L4a:
            r0 = r301
            r1 = r304
            r2 = r303
            r0.<init>(r1, r2)
            return
        L51:
            r0 = 11
            r303 = r0
            goto L43
        L57:
            r0 = 10
            r303 = r0
            goto L43
        L5d:
            r0 = 7
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = 1
            r304 = r0
            goto L4a
        L6a:
            r0 = 5
            r303 = r0
            goto L43
        L6f:
            r0 = 1
            r303 = r0
            goto L43
        L74:
            r0 = r301
            r1 = 0
            r0.A01 = r1
            r0 = r301
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87p.<init>(int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C87p(kotlin.jvm.internal.DefaultConstructorMarker r302, int r303, int r304, boolean r305) {
        /*
            r301 = this;
            r0 = r301
            r1 = r304
            r0.A01 = r1
            r0 = r304
            switch(r0) {
                case 0: goto L80;
                case 1: goto L77;
                case 5: goto L6e;
                case 7: goto L64;
                case 10: goto L5a;
                case 11: goto L50;
                default: goto L40;
            }
        L40:
            r0 = 0
            r306 = r0
            r0 = 13
            r307 = r0
        L47:
            r0 = r301
            r1 = r306
            r2 = r307
            r0.<init>(r1, r2)
            return
        L50:
            r0 = 0
            r306 = r0
            r0 = 11
            r307 = r0
            goto L47
        L5a:
            r0 = 0
            r306 = r0
            r0 = 10
            r307 = r0
            goto L47
        L64:
            r0 = 1
            r306 = r0
            r0 = 7
            r307 = r0
            goto L47
        L6e:
            r0 = 0
            r306 = r0
            r0 = 5
            r307 = r0
            goto L47
        L77:
            r0 = 0
            r306 = r0
            r0 = 1
            r307 = r0
            goto L47
        L80:
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87p.<init>(kotlin.jvm.internal.DefaultConstructorMarker, int, int, boolean):void");
    }

    public C87p(boolean z, int i) {
        this.A01 = i;
        this.A00 = z;
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
            case 3:
            case 4:
            case 5:
            default:
                return super.equals(obj);
            case 6:
                if (this == obj) {
                    return true;
                }
                i = 6;
                break;
            case 7:
                if (this == obj) {
                    return true;
                }
                i = 7;
                break;
            case 8:
                if (this == obj) {
                    return true;
                }
                i = 8;
                break;
            case 9:
                if (this == obj) {
                    return true;
                }
                i = 9;
                break;
            case 10:
                if (this == obj) {
                    return true;
                }
                i = 10;
                break;
            case 11:
                if (this == obj) {
                    return true;
                }
                i = 11;
                break;
            case 12:
                if (this == obj) {
                    return true;
                }
                i = 12;
                break;
            case 13:
                if (this == obj) {
                    return true;
                }
                i = 13;
                break;
        }
        if (!(obj instanceof C87p)) {
            return false;
        }
        C87p c87p = (C87p) obj;
        return c87p.A01 == i && this.A00 == c87p.A00;
    }

    public int hashCode() {
        switch (this.A01) {
            case 0:
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return AnonymousClass002.A00(this.A00 ? 1 : 0);
            case 3:
            case 4:
            case 5:
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        StringBuilder A0k;
        String str;
        switch (this.A01) {
            case 8:
                A0k = AnonymousClass001.A0k();
                str = "CallStatusShowingAction(showing=";
                break;
            case 9:
                A0k = AnonymousClass001.A0k();
                str = "ScreenShareInitiatingAction(isScreenShareInitiating=";
                break;
            case 10:
            default:
                return super.toString();
            case 11:
                A0k = AnonymousClass001.A0k();
                str = "Extras(preferPictureInPictureGrid=";
                break;
        }
        A0k.append(str);
        A0k.append(this.A00);
        return 4YV.A0x(A0k);
    }
}

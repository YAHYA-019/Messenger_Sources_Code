package X;

import com.google.common.collect.ImmutableList;

/* loaded from: B25.class */
public final class B25 extends 2Yf {
    public 1Im A00;
    public BKn A01;
    public ImmutableList A02;

    public B25() {
        super("Rooms2LiveFriendsPickerSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        ImmutableList immutableList = this.A02;
        2Yr A0l = 7zL.A0l();
        C2he c2he = new C2he();
        c2he.A04 = AnonymousClass001.A0K();
        c2he.A05 = immutableList;
        c2he.A01 = 2Yg.A0A(c1qb, B25.class, "Rooms2LiveFriendsPickerSection", 54231758);
        c2he.A00 = 2Yg.A0A(c1qb, B25.class, "Rooms2LiveFriendsPickerSection", -2060322979);
        c2he.A02 = 2Yg.A0A(c1qb, B25.class, "Rooms2LiveFriendsPickerSection", -970812814);
        A0l.A01(c2he);
        return A0l.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0238, code lost:
    
        if (r0.A02 != r0.A02) goto L23;
     */
    /* JADX WARN: Type inference failed for: r0v56, types: [X.2hj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0e(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B25.A0e(X.1Im, java.lang.Object):java.lang.Object");
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B25 b25 = (B25) r302;
            BKn bKn = this.A01;
            BKn bKn2 = b25.A01;
            if (bKn != null) {
                if (!bKn.equals(bKn2)) {
                    return false;
                }
            } else if (bKn2 != null) {
                return false;
            }
            ImmutableList immutableList = this.A02;
            ImmutableList immutableList2 = b25.A02;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
        }
        return true;
    }
}
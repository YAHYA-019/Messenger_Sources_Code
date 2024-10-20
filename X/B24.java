package X;

import com.google.common.collect.ImmutableList;

/* loaded from: B24.class */
public final class B24 extends 2Yf {
    public 1Im A00;
    public ImmutableList A01;

    public B24() {
        super("Rooms2LiveSinglePickerSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        ImmutableList immutableList = this.A01;
        2Yr A0l = 7zL.A0l();
        C2he c2he = new C2he();
        c2he.A04 = AnonymousClass001.A0K();
        c2he.A05 = immutableList;
        c2he.A01 = 2Yg.A0A(c1qb, B24.class, "Rooms2LiveSinglePickerSection", 54231758);
        c2he.A00 = 2Yg.A0A(c1qb, B24.class, "Rooms2LiveSinglePickerSection", -2060322979);
        c2he.A02 = 2Yg.A0A(c1qb, B24.class, "Rooms2LiveSinglePickerSection", -970812814);
        A0l.A01(c2he);
        return A0l.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x020a, code lost:
    
        if (r0.A05() != r0.A05()) goto L22;
     */
    /* JADX WARN: Type inference failed for: r0v51, types: [X.2hj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0e(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B24.A0e(X.1Im, java.lang.Object):java.lang.Object");
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            ImmutableList immutableList = this.A01;
            ImmutableList immutableList2 = ((B24) r302).A01;
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

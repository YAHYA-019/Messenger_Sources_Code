package X;

/* renamed from: X.4hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hg.class */
public abstract class AbstractC06624hg {
    public static int A00;
    public static final 0KO A02 = 0KO.A00("ArtDistract");
    public static final 0KP A01 = new 0KP("ArtDistract");

    public static void A00(String str, Object... objArr) {
        String str2;
        String format = String.format(str, objArr);
        A02.A08(format, new Object[0], 5);
        0KP r0 = A01;
        0KO r02 = 0KP.A06;
        "ArtDistractVerifyErr".getClass();
        format.getClass();
        String format2 = String.format(format, new Object[0]);
        synchronized (r0.A01) {
            str2 = (String) r0.A03.put("ArtDistractVerifyErr", format2);
        }
        r0.A00 = null;
        if (str2 != null) {
            r02.A07("Error Message for category %s was overwritten.\n\t old: %s \n\t new: %s", new Object[]{"ArtDistractVerifyErr", str2, format});
        }
        r02.A08(format2, new Object[0], 5);
        0KP.A00(r0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x020c, code lost:
    
        if (r0 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02e8, code lost:
    
        r317 = r317 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x021f, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x028c A[LOOP:0: B:25:0x0225->B:31:0x028c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01(X.4iW r301, X.4iW r302) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC06624hg.A01(X.4iW, X.4iW):boolean");
    }

    public static boolean A02(Class cls, Class cls2, String str, Object... objArr) {
        if (cls2.isAssignableFrom(cls)) {
            return true;
        }
        A00(0Pz.A0W(str, "Reason: Class %s cannot be cast to class %s"), new 0rL(objArr, objArr.length), cls.getName(), cls2.getName());
        return false;
    }
}

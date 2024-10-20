package X;

/* renamed from: X.3Ok, reason: invalid class name */
/* loaded from: 3Ok.class */
public final class C3Ok {
    public static final 3LO A00(1lN r301) {
        String str;
        java.util.Map AWe;
        String AWg = r301.AWg();
        if (AWg == null) {
            AWg = "";
        }
        String A00 = C01e.A00(r301.getClass());
        11T.A0A(A00);
        if ((r301 instanceof C1lM) && (AWe = ((C1lM) r301).AWe()) != null) {
            try {
                str = AnonymousClass001.A0b("dest_module_uri", AWe);
            } catch (ClassCastException e) {
                0fH.A0H(C3Ok.class, "fail to parse uri", e);
            }
            1BL.A1E(AWg);
            return new 3LO(AWg, A00, str);
        }
        str = null;
        1BL.A1E(AWg);
        return new 3LO(AWg, A00, str);
    }
}

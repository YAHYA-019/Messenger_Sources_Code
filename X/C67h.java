package X;

/* renamed from: X.67h, reason: invalid class name */
/* loaded from: 67h.class */
public class C67h extends C67i {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final AnonymousClass253 A03;
    public final C24q A04;
    public final String A05;

    public C67h(AnonymousClass253 anonymousClass253, C24q c24q, String str, String str2, String str3) {
        this.A03 = anonymousClass253;
        this.A04 = c24q;
        this.A02 = anonymousClass253.A09(AnonymousClass260.A0T);
        this.A01 = str;
        this.A05 = str2;
        this.A00 = str3;
    }

    public static String A00(String str, int i) {
        int length = str.length();
        String str2 = null;
        if (length != i) {
            char charAt = str.charAt(i);
            char lowerCase = Character.toLowerCase(charAt);
            if (charAt != lowerCase) {
                StringBuilder A0l = AnonymousClass001.A0l(length - i);
                while (true) {
                    A0l.append(lowerCase);
                    i++;
                    if (i >= length) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    lowerCase = Character.toLowerCase(charAt2);
                    if (charAt2 == lowerCase) {
                        A0l.append((CharSequence) str, i, length);
                        break;
                    }
                }
                return A0l.toString();
            }
            str2 = str.substring(i);
        }
        return str2;
    }

    public static String A01(String str, int i) {
        int i2;
        int length = str.length();
        String str2 = null;
        if (length != i) {
            char charAt = str.charAt(i);
            char lowerCase = Character.toLowerCase(charAt);
            if (charAt != lowerCase && ((i2 = i + 1) >= length || !Character.isUpperCase(str.charAt(i2)))) {
                StringBuilder A0l = AnonymousClass001.A0l(length - i);
                A0l.append(lowerCase);
                A0l.append((CharSequence) str, i2, length);
                return A0l.toString();
            }
            str2 = str.substring(i);
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    @Override // X.C67i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A03(X.C68D r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A05
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L91
            r0 = r303
            r1 = r304
            boolean r0 = r0.startsWith(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L91
            java.lang.String r0 = "getCallbacks"
            r306 = r0
            r0 = r306
            r1 = r303
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L93
            r0 = r302
            java.lang.reflect.Method r0 = r0.A00
            r306 = r0
            r0 = r306
            java.lang.Class r0 = r0.getReturnType()
            r307 = r0
            r0 = r307
            boolean r0 = r0.isArray()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lb7
            r0 = r307
            java.lang.Class r0 = r0.getComponentType()
            java.lang.String r0 = r0.getName()
            r307 = r0
            java.lang.String r0 = ".cglib"
            r306 = r0
            r0 = r307
            r1 = r306
            boolean r0 = r0.contains(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lb7
            java.lang.String r0 = "net.sf.cglib"
            r306 = r0
            r0 = r307
            r1 = r306
            boolean r0 = r0.startsWith(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L91
            java.lang.String r0 = "org.hibernate.repackage.cglib"
            r306 = r0
            r0 = r307
            r1 = r306
            boolean r0 = r0.startsWith(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L91
            java.lang.String r0 = "org.springframework.cglib"
            r306 = r0
        L83:
            r0 = r307
            r1 = r306
            boolean r0 = r0.startsWith(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lb7
        L91:
            r0 = 0
            return r0
        L93:
            java.lang.String r0 = "getMetaClass"
            r306 = r0
            r0 = r306
            r1 = r303
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lb7
            r0 = r302
            java.lang.reflect.Method r0 = r0.A00
            java.lang.Class r0 = r0.getReturnType()
            java.lang.String r0 = r0.getName()
            r307 = r0
            java.lang.String r0 = "groovy.lang"
            r306 = r0
            goto L83
        Lb7:
            r0 = r301
            boolean r0 = r0.A02
            r308 = r0
            r0 = r304
            int r0 = r0.length()
            r305 = r0
            r0 = r308
            if (r0 == 0) goto Lcf
            r0 = r303
            r1 = r305
            java.lang.String r0 = A01(r0, r1)
            return r0
        Lcf:
            r0 = r303
            r1 = r305
            java.lang.String r0 = A00(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67h.A03(X.68D, java.lang.String):java.lang.String");
    }
}

package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: X.0gx, reason: invalid class name */
/* loaded from: 0gx.class */
public final class C0gx {
    public final char A00;
    public final char A01;
    public final char A02;
    public final char A03;
    public final char A04;
    public final boolean A05;
    public final boolean A06;
    public final File A07;

    public C0gx() {
        this.A06 = false;
        this.A07 = null;
        this.A03 = (char) 0;
        this.A04 = (char) 0;
        this.A00 = (char) 0;
        this.A01 = (char) 0;
        this.A02 = (char) 0;
        this.A05 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0109, code lost:
    
        if (r303 == X.C0h0.A0B.mSymbol) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x013e, code lost:
    
        r303 = r304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011b, code lost:
    
        if (r304 == X.C0h0.A08.mSymbol) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013b, code lost:
    
        if (r305 != X.C0h0.A0A.mSymbol) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        if (r303 == X.C0h0.A0B.mSymbol) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0gx(java.io.File r302, char r303, char r304, char r305, char r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0gx.<init>(java.io.File, char, char, char, char, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
    
        if (r0.A0N().contains(X.AnonymousClass001.A0X(X.0WB.A01)) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C0gx A00(X.0jH r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0gx.A00(X.0jH, boolean):X.0gx");
    }

    public String A01() {
        String str;
        StringBuilder A0k;
        String str2;
        File file = this.A07;
        if (file == null || !this.A06) {
            return "";
        }
        char c = this.A01;
        str = "fg_";
        if (C0gy.A01(C0gz.JAVA, c)) {
            File A0D = AnonymousClass001.A0D(file, "critical_suppl_java_detect_prop.txt");
            if (A0D.exists()) {
                Properties properties = new Properties();
                try {
                    FileInputStream A0F = AnonymousClass001.A0F(A0D);
                    try {
                        properties.load(A0F);
                        String property = properties.getProperty("java_cause");
                        if (property != null && property.contains("OutOfMemoryError")) {
                            String A0W = 0Pz.A0W(this.A05 ? str : "bg_", "oom");
                            A0F.close();
                            return A0W;
                        }
                        A0F.close();
                    } finally {
                    }
                } catch (IOException e) {
                    C0iy.A00().Bwu("PrevSessAppDeathFromDir", e, null);
                }
            }
            A0k = AnonymousClass001.A0k();
            A0k.append(this.A05 ? "fg_" : "bg_");
            str2 = "java";
        } else if (A02()) {
            A0k = AnonymousClass001.A0k();
            A0k.append(this.A05 ? "fg_" : "bg_");
            str2 = "anr";
        } else if (C0gy.A01(C0gz.NATIVE, c)) {
            A0k = AnonymousClass001.A0k();
            A0k.append(this.A05 ? "fg_" : "bg_");
            str2 = "native";
        } else {
            boolean A04 = A04();
            A0k = AnonymousClass001.A0k();
            if (A04) {
                A0k.append(this.A05 ? "fg_" : "bg_");
                str2 = "unexplained";
            } else {
                A0k.append(this.A03);
                A0k.append("_");
                A0k.append(this.A04);
                A0k.append("_");
                A0k.append(this.A00);
                str2 = "_null";
            }
        }
        return AnonymousClass001.A0d(str2, A0k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (X.C0gy.A01(r0, r301.A00) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (X.C0gy.A01(X.C0gz.NATIVE, r301.A04) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        r302 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return r302;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A02() {
        /*
            r301 = this;
            r0 = r301
            char r0 = r0.A03
            r302 = r0
            X.0gz r0 = X.C0gz.ANR
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = X.C0gy.A01(r0, r1)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L28
            r0 = r301
            char r0 = r0.A04
            r304 = r0
            X.0gz r0 = X.C0gz.NATIVE
            r305 = r0
            r0 = r305
            r1 = r304
            boolean r0 = X.C0gy.A01(r0, r1)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L3c
        L28:
            r0 = r301
            char r0 = r0.A00
            r302 = r0
            r0 = r303
            r1 = r302
            boolean r0 = X.C0gy.A01(r0, r1)
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L3e
        L3c:
            r0 = 1
            r302 = r0
        L3e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0gx.A02():boolean");
    }

    public boolean A03() {
        char c = this.A01;
        if (C0gy.A01(C0gz.JAVA, c) || C0gy.A01(C0gz.NATIVE, c) || A02()) {
            return true;
        }
        return this.A05 && A04();
    }

    public boolean A04() {
        char c = this.A03;
        if (C0gy.A01(C0gz.JAVA, c)) {
            return false;
        }
        C0gz c0gz = C0gz.ANR;
        if (C0gy.A01(c0gz, c)) {
            return false;
        }
        return (C0gy.A01(C0gz.NATIVE, this.A04) || C0gy.A01(c0gz, this.A00)) ? false : true;
    }
}

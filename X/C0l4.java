package X;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.0l4, reason: invalid class name */
/* loaded from: 0l4.class */
public final class C0l4 extends C0h1 {
    public 0mN[] A00;
    public final 1AE A01;
    public final ZipFile A02;
    public final /* synthetic */ C0ge A03;

    public C0l4(C0ge c0ge, 1AE r303) {
        this.A03 = c0ge;
        this.A02 = new ZipFile(c0ge.A00);
        this.A01 = r303;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        throw r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable, java.io.InputStream] */
    @Override // X.C0h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(java.io.File r302) {
        /*
            r301 = this;
            r0 = r301
            X.0mN[] r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L13
            r0 = r301
            X.0mN[] r0 = r0.A03()
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
        L13:
            r0 = 32768(0x8000, float:4.5918E-41)
            r304 = r0
            r0 = r304
            byte[] r0 = new byte[r0]
            r305 = r0
            r0 = r303
            int r0 = r0.length
            r306 = r0
            r0 = 0
            r307 = r0
        L22:
            r0 = r307
            r1 = r306
            if (r0 >= r1) goto L74
            r0 = r303
            r1 = r307
            r0 = r0[r1]
            r308 = r0
            r0 = r301
            java.util.zip.ZipFile r0 = r0.A02
            r309 = r0
            r0 = r308
            java.util.zip.ZipEntry r0 = r0.A01
            r310 = r0
            r0 = r309
            r1 = r310
            java.io.InputStream r0 = r0.getInputStream(r1)
            r310 = r0
            r0 = r308
            r1 = r302
            r2 = r310
            r3 = r305
            X.C0h1.A00(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L5d
            r0 = r310
            r0.close()     // Catch: java.lang.Throwable -> L73
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L22
        L5d:
            r309 = move-exception
            r0 = r310
            r0.close()     // Catch: java.lang.Throwable -> L67
            goto L70
        L67:
            r310 = move-exception
            r0 = r309
            r1 = r310
            X.0Ug.A00(r0, r1)     // Catch: java.lang.Throwable -> L73
        L70:
            r0 = r309
            throw r0     // Catch: java.lang.Throwable -> L73
        L73:
            throw r0     // Catch: java.lang.Throwable -> L73
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0l4.A01(java.io.File):void");
    }

    @Override // X.C0h1
    public final C0h3[] A02() {
        0mN[] r302 = this.A00;
        if (r302 == null) {
            r302 = A03();
            this.A00 = r302;
        }
        return r302;
    }

    public 0mN[] A03() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap A0u = AnonymousClass001.A0u();
        Pattern compile = Pattern.compile(this.A03.A01);
        String[] A03 = 0iL.A03();
        Enumeration<? extends ZipEntry> entries = this.A02.entries();
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            Matcher matcher = compile.matcher(nextElement.getName());
            if (matcher.matches()) {
                int groupCount = matcher.groupCount();
                String group = matcher.group(groupCount - 1);
                String group2 = matcher.group(groupCount);
                int i = 0;
                while (true) {
                    if (i >= A03.length) {
                        break;
                    }
                    String str = A03[i];
                    if (str == null || !group.equals(str)) {
                        i++;
                    } else if (i >= 0) {
                        linkedHashSet.add(group);
                        0mN r0 = (0mN) A0u.get(group2);
                        if (r0 != null) {
                            if (i < r0.A00) {
                            }
                        }
                        A0u.put(group2, new 0mN(group2, nextElement, i));
                    }
                }
            }
        }
        this.A01.A00 = AnonymousClass002.A0b(linkedHashSet);
        0mN[] r02 = (0mN[]) A0u.values().toArray(new 0mN[A0u.size()]);
        Arrays.sort(r02);
        return r02;
    }

    @Override // X.C0h1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A02.close();
    }
}

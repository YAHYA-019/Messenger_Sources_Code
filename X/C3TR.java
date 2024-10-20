package X;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlinx.coroutines.android.AndroidDispatcherFactory;

/* renamed from: X.3TR, reason: invalid class name */
/* loaded from: 3TR.class */
public final class C3TR {
    public static final C3TR A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r0 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r0.add(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List A00(java.io.BufferedReader r301) {
        /*
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r302 = r0
            r0 = r302
            r0.<init>()
        L8:
            r0 = r301
            java.lang.String r0 = r0.readLine()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L16
            r0 = r302
            java.util.List r0 = X.0QD.A0V(r0)
            return r0
        L16:
            r0 = r303
            java.lang.String r1 = "#"
            r2 = r303
            java.lang.String r0 = X.0CU.A0H(r0, r1, r2)
            java.lang.CharSequence r0 = X.0CU.A06(r0)
            r304 = r0
            r0 = r304
            java.lang.String r0 = r0.toString()
            r305 = r0
            r0 = 0
            r306 = r0
        L2a:
            r0 = r305
            int r0 = r0.length()
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 >= r1) goto L69
            r0 = r305
            r1 = r306
            char r0 = r0.charAt(r1)
            r308 = r0
            r0 = 46
            r307 = r0
            r0 = r308
            r1 = r307
            if (r0 == r1) goto L60
            r0 = r308
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r0)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L60
            java.lang.String r0 = "Illegal service provider class name: "
            r1 = r305
            java.lang.IllegalArgumentException r0 = X.0Pz.A05(r0, r1)
            throw r0
        L60:
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L2a
        L69:
            r0 = r307
            if (r0 <= 0) goto L8
            r0 = r302
            r1 = r305
            boolean r0 = r0.add(r1)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3TR.A00(java.io.BufferedReader):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r309v0 */
    /* JADX WARN: Type inference failed for: r309v1 */
    /* JADX WARN: Type inference failed for: r309v2, types: [java.util.AbstractCollection] */
    public static final List A01(ClassLoader classLoader) {
        List A0V;
        Set A0f;
        IllegalArgumentException th;
        IllegalArgumentException th2;
        List A002;
        try {
            ArrayList list = Collections.list(classLoader.getResources(0Pz.A0W("META-INF/services/", AndroidDispatcherFactory.class.getName())));
            11T.A0A(list);
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                URL url = (URL) it.next();
                String obj = url.toString();
                if (0CV.A0b(obj, "jar", false)) {
                    String A0G = 0CU.A0G(obj, "jar:file:", obj);
                    String A0E = 0CU.A0E(A0G, A0G, '!');
                    String A0G2 = 0CU.A0G(obj, "!/", obj);
                    JarFile jarFile = new JarFile(A0E, false);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(A0G2)), "UTF-8"));
                        try {
                            A002 = A00(bufferedReader);
                            bufferedReader.close();
                            try {
                                jarFile.close();
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } finally {
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            throw th2;
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                jarFile.close();
                            } catch (Throwable th6) {
                                C0ra.A01(th2, th6);
                            }
                        }
                    }
                } else {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
                    try {
                        A002 = A00(bufferedReader2);
                        bufferedReader2.close();
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            th2 = th8;
                            AnonymousClass127.A00(bufferedReader2, th7);
                        }
                    }
                }
                0QU.A0t(A002, A0s);
            }
            A0f = 0QD.A0f(A0s);
        } catch (Throwable unused) {
            A0V = 0QD.A0V(ServiceLoader.load(AndroidDispatcherFactory.class, classLoader));
        }
        if (!(!A0f.isEmpty())) {
            th = AnonymousClass001.A0L("No providers were loaded with FastServiceLoader");
            throw th;
        }
        A0V = 1BL.A0z(A0f);
        Iterator it2 = A0f.iterator();
        while (it2.hasNext()) {
            Class<?> cls = Class.forName(AnonymousClass001.A0i(it2), false, classLoader);
            if (!AndroidDispatcherFactory.class.isAssignableFrom(cls)) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Expected service of class ");
                A0k.append(AndroidDispatcherFactory.class);
                th2 = AnonymousClass002.A0C(cls, ", but found ", A0k);
                throw th2;
            }
            A0V.add(AndroidDispatcherFactory.class.cast(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
        }
        return A0V;
    }
}

package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.26u, reason: invalid class name */
/* loaded from: 26u.class */
public abstract class C26u {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
    
        if (r313 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0228, code lost:
    
        if (r311 == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer A04(X.24S r302, com.fasterxml.jackson.databind.JsonSerializer r303, X.C26c r304) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26u.A04(X.24S, com.fasterxml.jackson.databind.JsonSerializer, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0102, code lost:
    
        if (r309 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer A05(X.24S r302, X.C26c r303) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26u.A05(X.24S, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public Jyi A06(24S r302, C25p c25p) {
        C24q c24q = c25p.A05(r302._class).A07;
        InterfaceC00923pT A0L = c25p.A02().A0L(c25p, c24q);
        ArrayList arrayList = null;
        if (A0L == null) {
            A0L = c25p._base._typeResolverBuilder;
            if (A0L == null) {
                return null;
            }
        } else {
            25X r0 = c25p._subtypeResolver;
            AnonymousClass248 A02 = c25p.A02();
            HashMap A0u = AnonymousClass001.A0u();
            LinkedHashSet linkedHashSet = r0._registeredSubtypes;
            if (linkedHashSet != null) {
                Class cls = c24q.A05;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    3eR r02 = (3eR) it.next();
                    if (cls.isAssignableFrom(r02._class)) {
                        25X.A01(A02, c25p, C67f.A01(c25p, c25p, r02._class), r02, r0, A0u);
                    }
                }
            }
            25X.A01(A02, c25p, c24q, new 3eR(c24q.A05, (String) null), r0, A0u);
            arrayList = 1BK.A17(A0u.values());
        }
        return A0L.ACt(r302, c25p, arrayList);
    }
}

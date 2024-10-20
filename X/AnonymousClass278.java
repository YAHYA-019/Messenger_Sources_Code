package X;

import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import java.util.ArrayList;

/* renamed from: X.278, reason: invalid class name */
/* loaded from: 278.class */
public abstract class AnonymousClass278 {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        r0 = X.AnonymousClass001.A0k();
        r0.append("Invalid abstract type resolution from ");
        r0.append(r303);
        r0.append(" to ");
        r0.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e7, code lost:
    
        throw X.AnonymousClass002.A0D(": latter is not a subtype of former", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.24S A0E(X.C26L r302, X.24S r303) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass278.A0E(X.26L, X.24S):X.24S");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0345, code lost:
    
        if (r0.contains("List") != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0391, code lost:
    
        if (r0.contains("Set") != false) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.68e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonDeserializer A0F(X.C27T r302, X.AnonymousClass251 r303, X.3Bw r304) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass278.A0F(X.27T, X.251, X.3Bw):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* JADX WARN: Type inference failed for: r308v3, types: [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder, java.lang.Object] */
    public Jyp A0G(C26L c26l, 24S r303) {
        ArrayList A05;
        C24q c24q = c26l.A05(r303._class).A07;
        InterfaceC00923pT A0L = c26l.A02().A0L(c26l, c24q);
        if (A0L == null) {
            A0L = c26l._base._typeResolverBuilder;
            if (A0L == null) {
                return null;
            }
            A05 = null;
        } else {
            A05 = c26l._subtypeResolver.A05(c26l, c24q);
        }
        StdTypeResolverBuilder stdTypeResolverBuilder = (StdTypeResolverBuilder) A0L;
        if (stdTypeResolverBuilder._defaultImpl == null && r303.A0N()) {
            24S A0E = A0E(c26l, r303);
            Class cls = r303._class;
            Class cls2 = A0E._class;
            if (cls2 != cls) {
                Class cls3 = stdTypeResolverBuilder._defaultImpl;
                StdTypeResolverBuilder stdTypeResolverBuilder2 = stdTypeResolverBuilder;
                if (cls3 != cls2) {
                    27C.A0F(StdTypeResolverBuilder.class, stdTypeResolverBuilder, "withDefaultImpl");
                    ?? obj = new Object();
                    obj._typeIdVisible = false;
                    obj._idType = stdTypeResolverBuilder._idType;
                    obj._includeAs = stdTypeResolverBuilder._includeAs;
                    obj._typeProperty = stdTypeResolverBuilder._typeProperty;
                    obj._typeIdVisible = stdTypeResolverBuilder._typeIdVisible;
                    obj._customIdResolver = stdTypeResolverBuilder._customIdResolver;
                    obj._defaultImpl = cls2;
                    stdTypeResolverBuilder2 = obj;
                }
                A0L = stdTypeResolverBuilder2;
            }
        }
        try {
            return A0L.ACs(c26l, r303, A05);
        } catch (IllegalArgumentException | IllegalStateException e) {
            3Af r0 = new 3Af((AbstractC01033pi) null, r303, 27C.A09(e));
            r0.initCause(e);
            throw r0;
        }
    }
}

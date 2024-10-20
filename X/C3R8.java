package X;

import com.facebook.videocodec.effects.persistence.common.PersistedGLRenderer;
import java.io.IOException;

/* renamed from: X.3R8, reason: invalid class name */
/* loaded from: 3R8.class */
public final class C3R8 {
    public final C00i A00 = 1BV.A00(68334);

    public static C25i A00(C25b c25b) {
        C25i c25i = (C25i) c25b._visibilityChecker;
        C25k c25k = C25i.A01._fieldMinLevel;
        if (c25i._fieldMinLevel != c25k) {
            c25i = new C25i(c25i._getterMinLevel, c25i._isGetterMinLevel, c25i._setterMinLevel, c25i._creatorMinLevel, c25k);
        }
        return c25i;
    }

    public PersistedGLRenderer A01(Object obj, String str) {
        try {
            try {
                C00i c00i = this.A00;
                AnonymousClass243 anonymousClass243 = (AnonymousClass243) c00i.get();
                C25k c25k = C25k.ANY;
                C25b c25b = anonymousClass243._configOverrides;
                C25i c25i = (C25i) c25b._visibilityChecker;
                if (c25i._fieldMinLevel != c25k) {
                    new C25i(c25i._getterMinLevel, c25i._isGetterMinLevel, c25i._setterMinLevel, c25i._creatorMinLevel, c25k);
                }
                c25b._visibilityChecker = c25i;
                String A0W = ((AnonymousClass243) c00i.get()).A0W(obj);
                C1pq.A08("data", A0W);
                C1pq.A08("renderKey", str);
                PersistedGLRenderer persistedGLRenderer = new PersistedGLRenderer(A0W, str);
                C25b c25b2 = ((AnonymousClass244) c00i.get())._configOverrides;
                c25b2._visibilityChecker = A00(c25b2);
                return persistedGLRenderer;
            } catch (2LD e) {
                throw 1BK.A0s(0Pz.A0W("Error persisting gl config of class ", AnonymousClass001.A0Y(obj)), e);
            }
        } catch (Throwable th) {
            C25b c25b3 = ((AnonymousClass244) this.A00.get())._configOverrides;
            c25b3._visibilityChecker = A00(c25b3);
            throw th;
        }
    }

    public Object A02(String str, Class cls) {
        try {
            try {
                C00i c00i = this.A00;
                AnonymousClass243 anonymousClass243 = (AnonymousClass243) c00i.get();
                C25k c25k = C25k.ANY;
                C25b c25b = anonymousClass243._configOverrides;
                C25i c25i = (C25i) c25b._visibilityChecker;
                if (c25i._fieldMinLevel != c25k) {
                    new C25i(c25i._getterMinLevel, c25i._isGetterMinLevel, c25i._setterMinLevel, c25i._creatorMinLevel, c25k);
                }
                c25b._visibilityChecker = c25i;
                Object A0V = ((AnonymousClass243) c00i.get()).A0V(str, cls);
                C25b c25b2 = ((AnonymousClass244) c00i.get())._configOverrides;
                c25b2._visibilityChecker = A00(c25b2);
                return A0V;
            } catch (IOException e) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Error rehydrating gl renderer of class ");
                A0k.append(cls);
                throw 1BK.A0s(1BL.A0u(" data:", str, A0k), e);
            }
        } catch (Throwable th) {
            C25b c25b3 = ((AnonymousClass244) this.A00.get())._configOverrides;
            c25b3._visibilityChecker = A00(c25b3);
            throw th;
        }
    }
}

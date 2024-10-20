package X;

import java.lang.reflect.Method;

/* loaded from: LgV.class */
public final class LgV implements MGd {
    public final /* synthetic */ L2z A00;
    public final /* synthetic */ Class A01;

    public LgV(L2z l2z, Class cls) {
        this.A00 = l2z;
        this.A01 = cls;
    }

    @Override // X.MGd
    public Object AHa() {
        Method method;
        Object[] A1b;
        try {
            KDq kDq = Kxs.A00;
            Class cls = this.A01;
            if (kDq instanceof KDp) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Cannot allocate ");
                A0k.append(cls);
                throw AnonymousClass001.A0q(AnonymousClass001.A0d(". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.", A0k));
            }
            if (kDq instanceof KDq) {
                KDq kDq2 = kDq;
                Kxs.A00(cls);
                method = kDq2.A00;
                A1b = new Object[]{cls, Object.class};
            } else {
                if (!(kDq instanceof KDs)) {
                    KDr kDr = (KDr) kDq;
                    Kxs.A00(cls);
                    return kDr.A01.invoke(kDr.A00, cls);
                }
                KDs kDs = (KDs) kDq;
                Kxs.A00(cls);
                method = kDs.A01;
                A1b = AnonymousClass001.A1b(cls, kDs.A00);
            }
            return method.invoke(null, A1b);
        } catch (Exception e) {
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append("Unable to create instance of ");
            A0k2.append(this.A01);
            throw 1BK.A0s(AnonymousClass001.A0d(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", A0k2), e);
        }
    }
}

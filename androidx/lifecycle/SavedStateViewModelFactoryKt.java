package androidx.lifecycle;

import X.11T;
import X.1BK;
import X.AnonymousClass001;
import X.C0s8;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: SavedStateViewModelFactoryKt.class */
public abstract class SavedStateViewModelFactoryKt {
    public static final List ANDROID_VIEWMODEL_SIGNATURE = C0s8.A14(Application.class, SavedStateHandle.class);
    public static final List VIEWMODEL_SIGNATURE = 11T.A03(SavedStateHandle.class);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        return r306;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.reflect.Constructor findMatchingConstructor(java.lang.Class r301, java.util.List r302) {
        /*
            r0 = r301
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            r303 = r0
            r0 = r303
            X.11T.A0A(r0)
            r0 = r303
            int r0 = r0.length
            r304 = r0
            r0 = 0
            r305 = r0
        Lf:
            r0 = r305
            r1 = r304
            if (r0 >= r1) goto L92
            r0 = r303
            r1 = r305
            r0 = r0[r1]
            r306 = r0
            r0 = r306
            java.lang.Class[] r0 = r0.getParameterTypes()
            r307 = r0
            r0 = r307
            X.11T.A0A(r0)
            r0 = r307
            java.util.List r0 = X.02L.A09(r0)
            r308 = r0
            r0 = r302
            r1 = r308
            boolean r0 = r0.equals(r1)
            r309 = r0
            r0 = r309
            if (r0 != 0) goto L98
            r0 = r302
            int r0 = r0.size()
            r310 = r0
            r0 = r308
            int r0 = r0.size()
            r309 = r0
            r0 = r310
            r1 = r309
            if (r0 != r1) goto L89
            r0 = r308
            r1 = r302
            boolean r0 = r0.containsAll(r1)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto L89
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r306 = r0
            r0 = r306
            java.lang.String r1 = "Class "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r301
            java.lang.String r0 = r0.getSimpleName()
            r307 = r0
            r0 = r306
            r1 = r307
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r302
            java.lang.String r1 = " must have parameters in the proper order: "
            r2 = r306
            java.lang.String r0 = X.AnonymousClass001.A0Z(r0, r1, r2)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0q(r0)
            throw r0
        L89:
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            goto Lf
        L92:
            r0 = 0
            r310 = r0
            r0 = 0
            r306 = r0
        L98:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(java.lang.Class, java.util.List):java.lang.reflect.Constructor");
    }

    public static final ViewModel newInstance(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (ViewModel) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw 1BK.A0s(AnonymousClass001.A0Z(cls, "Failed to access ", AnonymousClass001.A0k()), e);
        } catch (InstantiationException e2) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("A ");
            A0k.append(cls);
            throw 1BK.A0s(AnonymousClass001.A0d(" cannot be instantiated.", A0k), e2);
        } catch (InvocationTargetException e3) {
            throw 1BK.A0s(AnonymousClass001.A0Z(cls, "An exception happened in constructor of ", AnonymousClass001.A0k()), e3.getCause());
        }
    }
}

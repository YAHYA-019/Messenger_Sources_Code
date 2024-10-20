package androidx.lifecycle;

import X.0BY;
import X.0BZ;
import X.0Pz;
import X.11T;
import X.1BK;
import X.2yZ;
import X.3Fx;
import X.AnonymousClass001;
import X.C0Bx;
import X.C11e;
import X.C1ew;
import X.C1j7;
import X.C1j9;
import X.C2yY;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: ViewModelProvider.class */
public class ViewModelProvider {
    public static final Companion Companion = new Object();
    public static final C1ew VIEW_MODEL_KEY = C2yY.A00;
    public final 2yZ impl;

    /* loaded from: ViewModelProvider$AndroidViewModelFactory.class */
    public class AndroidViewModelFactory extends NewInstanceFactory {
        public static AndroidViewModelFactory _instance;
        public final Application application;
        public static final Companion Companion = new Object();
        public static final C1ew APPLICATION_KEY = new C1ew() { // from class: androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$APPLICATION_KEY$1
        };

        /* loaded from: ViewModelProvider$AndroidViewModelFactory$Companion.class */
        public final class Companion {
        }

        public AndroidViewModelFactory() {
            this.application = null;
        }

        public AndroidViewModelFactory(Application application) {
            this.application = application;
        }

        private final ViewModel create(Class cls, Application application) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                ViewModel viewModel = (ViewModel) cls.getConstructor(Application.class).newInstance(application);
                11T.A08(viewModel);
                return viewModel;
            } catch (IllegalAccessException e) {
                throw 1BK.A0s(AnonymousClass001.A0m(cls, "Cannot create an instance of ").toString(), e);
            } catch (InstantiationException e2) {
                throw 1BK.A0s(AnonymousClass001.A0m(cls, "Cannot create an instance of ").toString(), e2);
            } catch (NoSuchMethodException e3) {
                throw 1BK.A0s(AnonymousClass001.A0m(cls, "Cannot create an instance of ").toString(), e3);
            } catch (InvocationTargetException e4) {
                throw 1BK.A0s(AnonymousClass001.A0m(cls, "Cannot create an instance of ").toString(), e4);
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls) {
            11T.A0F(cls, 0);
            Application application = this.application;
            if (application != null) {
                return create(cls, application);
            }
            throw AnonymousClass001.A0q("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, C1j9 c1j9) {
            11T.A0F(cls, 0);
            11T.A0F(c1j9, 1);
            if (this.application != null) {
                return create(cls);
            }
            Application application = (Application) c1j9.A00(APPLICATION_KEY);
            if (application != null) {
                return create(cls, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                throw AnonymousClass001.A0L("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.create(cls);
        }
    }

    /* loaded from: ViewModelProvider$Companion.class */
    public final class Companion {
    }

    /* loaded from: ViewModelProvider$Factory.class */
    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* renamed from: androidx.lifecycle.ViewModelProvider$Factory$-CC, reason: invalid class name */
        /* loaded from: ViewModelProvider$Factory$-CC.class */
        public abstract /* synthetic */ class CC {
            public static ViewModel $default$create(Factory factory, 0BZ r302, C1j9 c1j9) {
                11T.A0F(r302, 1);
                11T.A0F(c1j9, 2);
                return factory.create(C11e.A00(r302), c1j9);
            }

            public static ViewModel $default$create(Factory factory, Class cls, C1j9 c1j9) {
                11T.A0F(cls, 1);
                return factory.create(cls);
            }
        }

        /* loaded from: ViewModelProvider$Factory$Companion.class */
        public final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Object();
        }

        ViewModel create(0BZ r1, C1j9 c1j9);

        ViewModel create(Class cls);

        ViewModel create(Class cls, C1j9 c1j9);
    }

    /* loaded from: ViewModelProvider$NewInstanceFactory.class */
    public class NewInstanceFactory implements Factory {
        public static final Companion Companion = new Object();
        public static final C1ew VIEW_MODEL_KEY = C2yY.A00;
        public static NewInstanceFactory _instance;

        /* loaded from: ViewModelProvider$NewInstanceFactory$Companion.class */
        public final class Companion {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(0BZ r302, C1j9 c1j9) {
            11T.A0H(r302, c1j9);
            return create(C11e.A00(r302), c1j9);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls) {
            11T.A0F(cls, 0);
            return 3Fx.A00(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, C1j9 c1j9) {
            11T.A0F(cls, 0);
            return create(cls);
        }
    }

    /* loaded from: ViewModelProvider$OnRequeryFactory.class */
    public abstract class OnRequeryFactory {
        public abstract void onRequery(ViewModel viewModel);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory) {
        this(viewModelStore, factory, C1j7.A00);
        11T.A0F(viewModelStore, 1);
    }

    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory, C1j9 c1j9) {
        11T.A0F(viewModelStore, 1);
        11T.A0F(factory, 2);
        11T.A0F(c1j9, 3);
        this.impl = new 2yZ(viewModelStore, factory, c1j9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.lifecycle.ViewModelProvider$Factory] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.1j9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner r302) {
        /*
            r301 = this;
            r0 = r302
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
            r303 = r0
            r0 = r302
            boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2f
            r0 = r302
            androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
            r302 = r0
            r0 = r302
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            r305 = r0
            r0 = r302
            X.1j9 r0 = r0.getDefaultViewModelCreationExtras()
            r306 = r0
        L25:
            r0 = r301
            r1 = r303
            r2 = r305
            r3 = r306
            r0.<init>(r1, r2, r3)
            return
        L2f:
            X.3Ud r0 = X.C3Ud.A00
            r305 = r0
            X.1j7 r0 = X.C1j7.A00
            r306 = r0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ViewModelProvider.<init>(androidx.lifecycle.ViewModelStoreOwner):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.1j9] */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner, Factory factory) {
        this(viewModelStoreOwner.getViewModelStore(), factory, viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : C1j7.A00);
        11T.A0F(viewModelStoreOwner, 1);
        11T.A0F(factory, 2);
    }

    public static ViewModel A00(2yZ r301, 0BZ r302) {
        11T.A0F(r302, 0);
        String A00 = C0Bx.A00(((0BY) r302).A00);
        if (A00 != null) {
            return r301.A00(0Pz.A0W("androidx.lifecycle.ViewModelProvider.DefaultKey:", A00), r302);
        }
        throw AnonymousClass001.A0L("Local and anonymous classes can not be ViewModels");
    }

    public ViewModel get(Class cls) {
        0BY r0 = new 0BY(cls);
        11T.A0F(r0, 0);
        2yZ r02 = this.impl;
        String A00 = C0Bx.A00(r0.A00);
        if (A00 != null) {
            return r02.A00(0Pz.A0W("androidx.lifecycle.ViewModelProvider.DefaultKey:", A00), r0);
        }
        throw AnonymousClass001.A0L("Local and anonymous classes can not be ViewModels");
    }
}

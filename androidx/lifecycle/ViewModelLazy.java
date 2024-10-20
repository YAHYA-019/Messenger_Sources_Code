package androidx.lifecycle;

import X.0BZ;
import X.2yZ;
import X.7zT;
import X.AnonymousClass001;
import X.C00m;
import X.C00q;
import X.C01i;
import X.C1j7;
import X.C1j9;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: ViewModelLazy.class */
public final class ViewModelLazy implements C01i {
    public ViewModel cached;
    public final C00m extrasProducer;
    public final C00m factoryProducer;
    public final C00m storeProducer;
    public final 0BZ viewModelClass;

    /* renamed from: androidx.lifecycle.ViewModelLazy$1, reason: invalid class name */
    /* loaded from: ViewModelLazy$1.class */
    public final class AnonymousClass1 extends C00q implements C00m {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // X.C00m
        public /* bridge */ /* synthetic */ Object invoke() {
            return C1j7.A00;
        }
    }

    public ViewModelLazy(0BZ r302, C00m c00m, C00m c00m2, C00m c00m3) {
        this.viewModelClass = r302;
        this.storeProducer = c00m;
        this.factoryProducer = c00m2;
        this.extrasProducer = c00m3;
    }

    @Override // X.C01i
    public /* bridge */ /* synthetic */ Object getValue() {
        ViewModel viewModel = this.cached;
        if (viewModel == null) {
            ViewModelStore viewModelStore = (ViewModelStore) this.storeProducer.invoke();
            ViewModelProvider.Factory factory = (ViewModelProvider.Factory) this.factoryProducer.invoke();
            C1j9 c1j9 = (C1j9) this.extrasProducer.invoke();
            7zT.A1S(viewModelStore, factory, c1j9);
            viewModel = ViewModelProvider.A00(new 2yZ(viewModelStore, factory, c1j9), this.viewModelClass);
            this.cached = viewModel;
        }
        return viewModel;
    }

    @Override // X.C01i
    public boolean isInitialized() {
        return AnonymousClass001.A1T(this.cached);
    }
}

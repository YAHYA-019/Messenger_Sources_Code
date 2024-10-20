package X;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* renamed from: X.Jh3, reason: case insensitive filesystem */
/* loaded from: Jh3.class */
public final class C3040Jh3 extends ViewModelProvider.AndroidViewModelFactory {
    public final Application A00;
    public final Bundle A01;

    public C3040Jh3(Application application, Bundle bundle) {
        super(application);
        this.A00 = application;
        this.A01 = bundle;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        11T.A0F(cls, 0);
        if (cls.isAssignableFrom(C3018Jgg.class)) {
            return new C3018Jgg(this.A00, this.A01);
        }
        throw AnonymousClass002.A0C(cls, "Unknown ViewModel class: ", AnonymousClass001.A0k());
    }
}

package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.foa.session.FbMetaSessionImpl;
import java.util.List;

/* loaded from: Eqy.class */
public final class Eqy {
    public C00m A00;
    public final LifecycleOwner A01;
    public final ViewModelStoreOwner A02;
    public final FbMetaSessionImpl A03;
    public final ExC A04;
    public final GDm A05;
    public final Eyf A06;
    public final Exp A07;
    public final Object A08;
    public final java.util.Map A0D = AnonymousClass001.A0u();
    public final List A0A = AnonymousClass001.A0s();
    public final List A09 = AnonymousClass001.A0s();
    public final List A0B = AnonymousClass001.A0s();
    public final List A0C = AnonymousClass001.A0s();

    public Eqy(LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner, FbMetaSessionImpl fbMetaSessionImpl, ExC exC, GDm gDm, Eyf eyf, Exp exp, Object obj) {
        this.A04 = exC;
        this.A07 = exp;
        this.A03 = fbMetaSessionImpl;
        this.A01 = lifecycleOwner;
        this.A02 = viewModelStoreOwner;
        this.A06 = eyf;
        this.A08 = obj;
        this.A05 = gDm;
        lifecycleOwner.getLifecycle().addObserver(new FYv(this, 4));
    }
}

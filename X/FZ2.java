package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.foa.session.FbMetaSessionImpl;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: FZ2.class */
public final class FZ2 implements LifecycleOwner, GL4, ViewModelStoreOwner, GHK {
    public static final AtomicInteger A07 = new AtomicInteger();
    public final Context A00;
    public final FrameLayout A01;
    public final LifecycleRegistry A02;
    public final ViewModelStore A03;
    public final Eyf A04;
    public final Exp A05;
    public final Eqy A06;

    public FZ2(Context context, FbMetaSessionImpl fbMetaSessionImpl, ExC exC, GDm gDm, Eyf eyf, Object obj) {
        11T.A0F(gDm, 5);
        this.A00 = context;
        this.A04 = eyf;
        this.A03 = new ViewModelStore();
        this.A01 = new FrameLayout(context);
        Exp exp = new Exp(String.valueOf(A07.incrementAndGet()));
        this.A05 = exp;
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        this.A02 = lifecycleRegistry;
        this.A06 = new Eqy(this, this, fbMetaSessionImpl, exC, gDm, eyf, exp, obj);
    }

    @Override // X.GL4
    public void AN2() {
        this.A02.setCurrentState(Lifecycle.State.CREATED);
        Eqy eqy = this.A06;
        eqy.A09.clear();
        eqy.A0A.clear();
        eqy.A0B.clear();
        eqy.A0C.clear();
    }

    @Override // X.GL4
    public String AWf() {
        return this.A04.A00;
    }

    @Override // X.GL4
    public String AZY() {
        return this.A05.A00;
    }

    @Override // X.GL4
    public View AeR(Context context) {
        Eqy eqy = this.A06;
        C0Bd c0Bd = eqy.A06.A02;
        Exp exp = eqy.A07;
        EvJ evJ = new EvJ(context, eqy.A02, eqy.A03, exp);
        evJ.A00 = eqy;
        View view = (View) c0Bd.invoke(evJ, eqy.A08, eqy.A05);
        evJ.A00 = null;
        return view;
    }

    @Override // X.GL4
    public View Aot() {
        return this.A01;
    }

    @Override // X.GL4
    public EL9 B3E() {
        return EL9.A03;
    }

    public boolean Bkb() {
        C00m c00m = this.A06.A00;
        if (c00m != null) {
            return AnonymousClass001.A1V(c00m.invoke());
        }
        return false;
    }

    @Override // X.GL4
    public void CUY() {
        this.A02.setCurrentState(Lifecycle.State.RESUMED);
    }

    @Override // X.GL4
    public void Cbr() {
    }

    @Override // X.GL4
    public void destroy() {
        this.A02.setCurrentState(Lifecycle.State.DESTROYED);
        Activity A00 = FIA.A00(this.A00);
        if (A00 == null || A00.isChangingConfigurations()) {
            return;
        }
        getViewModelStore().clear();
    }

    @Override // X.GL4
    public Context getContext() {
        return this.A00;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.A02;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return this.A03;
    }

    @Override // X.GL4
    public void pause() {
        this.A02.setCurrentState(Lifecycle.State.STARTED);
    }

    @Override // X.GL4
    public void resume() {
        this.A02.setCurrentState(Lifecycle.State.RESUMED);
    }

    @Override // X.GL4
    public void stop() {
        this.A02.setCurrentState(Lifecycle.State.CREATED);
    }
}

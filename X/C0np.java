package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.0np, reason: invalid class name */
/* loaded from: 0np.class */
public final class C0np implements LifecycleEventObserver, LifecycleObserver {
    public final int A00;
    public final Object A01;

    public C0np(ComponentActivity componentActivity, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = componentActivity;
                return;
            default:
                this.A01 = componentActivity;
                return;
        }
    }

    public C0np(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Window window;
        View peekDecorView;
        switch (this.A00) {
            case 0:
                Activity activity = (Activity) this.A01;
                11T.A0F(event, 2);
                if (event == Lifecycle.Event.ON_STOP && (window = activity.getWindow()) != null) {
                    peekDecorView = window.peekDecorView();
                    break;
                } else {
                    return;
                }
            case 1:
                ComponentActivity.A1C((ComponentActivity) this.A01, event);
                return;
            case 2:
                ComponentActivity componentActivity = (ComponentActivity) this.A01;
                componentActivity.A16();
                componentActivity.getLifecycle().removeObserver(this);
                return;
            case 3:
                if (event == Lifecycle.Event.ON_STOP) {
                    peekDecorView = ((Fragment) this.A01).mView;
                    break;
                } else {
                    return;
                }
            default:
                AnonymousClass068 anonymousClass068 = (AnonymousClass068) this.A01;
                11T.A0F(anonymousClass068, 0);
                11T.A0F(event, 2);
                if (event == Lifecycle.Event.ON_START) {
                    anonymousClass068.A02 = true;
                    return;
                } else {
                    if (event == Lifecycle.Event.ON_STOP) {
                        anonymousClass068.A02 = false;
                        return;
                    }
                    return;
                }
        }
        if (peekDecorView != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }
}

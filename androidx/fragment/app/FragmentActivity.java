package androidx.fragment.app;

import X.06Q;
import X.06U;
import X.06Z;
import X.0FI;
import X.0NQ;
import X.0Pz;
import X.0fV;
import X.0qS;
import X.AnonymousClass002;
import X.C06q;
import X.C0Ac;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: FragmentActivity.class */
public class FragmentActivity extends ComponentActivity {
    public boolean mCreated;
    public boolean mResumed;
    public final C06q mFragments = new C06q(new 06U(this));
    public final LifecycleRegistry mFragmentLifecycleRegistry = new LifecycleRegistry(this);
    public boolean mStopped = true;

    public FragmentActivity() {
        getSavedStateRegistry().A02(new 0fV(this, 1), "android:support:lifecycle");
        A6e(new 0qS(this, 0));
        A2V(new 0qS(this, 1));
        A2U(new 06Q() { // from class: X.06r
            public final void BrN(Context context) {
                FragmentActivity.this.A2a();
            }
        });
    }

    public static boolean A12(06Z r301, Lifecycle.State state) {
        boolean z = false;
        for (Fragment fragment : r301.A0T.A0A()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= A12(fragment.getChildFragmentManager(), state);
                }
                C0Ac c0Ac = fragment.mViewLifecycleOwner;
                if (c0Ac != null && c0Ac.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.A04(state);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.state.isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.setCurrentState(state);
                    z = true;
                }
            }
        }
        return z;
    }

    public /* synthetic */ Bundle A2W() {
        do {
        } while (A12(BDe(), Lifecycle.State.CREATED));
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    public void A2X() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        this.mFragments.A00.A03.A0q();
    }

    public /* synthetic */ void A2Y() {
        this.mFragments.A00.A03.A0v();
    }

    public /* synthetic */ void A2Z() {
        this.mFragments.A00.A03.A0v();
    }

    public /* synthetic */ void A2a() {
        this.mFragments.A01();
    }

    public void A2b(Fragment fragment) {
    }

    public 06Z BDe() {
        return this.mFragments.A00.A03;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!androidx.core.app.ComponentActivity.A1E(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            AnonymousClass002.A0U(printWriter, System.identityHashCode(this));
            printWriter.println(" State:");
            String A0W = 0Pz.A0W(str, "  ");
            printWriter.print(A0W);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                0NQ.A00(this).A04(A0W, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.A00.A03.A1S(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.A00.A03.A0v();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = 0FI.A00(-1607969077);
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        this.mFragments.A00.A03.A0m();
        0FI.A07(-31364971, A00);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.mFragments.A00.A03.A0R.onCreateView(view, str, context, attributeSet);
        if (onCreateView == null) {
            onCreateView = super.onCreateView(view, str, context, attributeSet);
        }
        return onCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.mFragments.A00.A03.A0R.onCreateView(null, str, context, attributeSet);
        if (onCreateView == null) {
            onCreateView = super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        int A00 = 0FI.A00(-657998352);
        super.onDestroy();
        this.mFragments.A00.A03.A0n();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        0FI.A07(878966625, A00);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.A00.A03.A1Y(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        int A00 = 0FI.A00(1017292864);
        super.onPause();
        this.mResumed = false;
        06Z.A0I(this.mFragments.A00.A03, 5);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        0FI.A07(1576098307, A00);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        A2X();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.A00.A03.A0v();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(561736250);
        this.mFragments.A00.A03.A0v();
        super.onResume();
        this.mResumed = true;
        this.mFragments.A00.A03.A1T(true);
        0FI.A07(-1018825767, A00);
    }

    @Override // android.app.Activity
    public void onStart() {
        int A00 = 0FI.A00(1455024966);
        this.mFragments.A00.A03.A0v();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.A00.A03.A0k();
        }
        this.mFragments.A00.A03.A1T(true);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.mFragments.A00.A03.A0r();
        0FI.A07(-2036869785, A00);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.A00.A03.A0v();
    }

    @Override // android.app.Activity
    public void onStop() {
        int A00 = 0FI.A00(1355157239);
        super.onStop();
        this.mStopped = true;
        do {
        } while (A12(BDe(), Lifecycle.State.CREATED));
        this.mFragments.A00.A03.A0s();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        0FI.A07(853652186, A00);
    }
}

package androidx.core.app;

import X.0FI;
import X.0QO;
import X.11T;
import X.C05j;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;

/* loaded from: ComponentActivity.class */
public abstract class ComponentActivity extends Activity implements LifecycleOwner, C05j {
    public final 0QO extraDataMap = new 0QO(0);
    public final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A1E(java.lang.String[] r301) {
        /*
            r0 = 1
            r302 = r0
            r0 = r301
            if (r0 == 0) goto L48
            r0 = r301
            int r0 = r0.length
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L48
            r0 = r301
            r1 = 0
            r0 = r0[r1]
            r304 = r0
            r0 = r304
            int r0 = r0.hashCode()
            r303 = r0
            r0 = r303
            switch(r0) {
                case -645125871: goto L4a;
                case 100470631: goto L64;
                case 472614934: goto L6b;
                case 1159329357: goto L96;
                case 1455016274: goto L85;
                default: goto L48;
            }
        L48:
            r0 = 0
            return r0
        L4a:
            java.lang.String r0 = "--translation"
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L48
            int r0 = android.os.Build.VERSION.SDK_INT
            r306 = r0
            r0 = 31
            r303 = r0
            goto Lad
        L64:
            java.lang.String r0 = "--dump-dumpable"
            r305 = r0
            goto L6f
        L6b:
            java.lang.String r0 = "--list-dumpables"
            r305 = r0
        L6f:
            r0 = r304
            r1 = r305
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L48
            int r0 = android.os.Build.VERSION.SDK_INT
            r306 = r0
            r0 = 33
            r303 = r0
            goto Lad
        L85:
            java.lang.String r0 = "--autofill"
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto Lb5
            r0 = 0
            return r0
        L96:
            java.lang.String r0 = "--contentcapture"
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L48
            int r0 = android.os.Build.VERSION.SDK_INT
            r306 = r0
            r0 = 29
            r303 = r0
        Lad:
            r0 = r306
            r1 = r303
            if (r0 >= r1) goto Lb5
            r0 = 0
            r302 = r0
        Lb5:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.ComponentActivity.A1E(java.lang.String[]):boolean");
    }

    @Override // X.C05j
    public boolean D3T(KeyEvent keyEvent) {
        11T.A0F(keyEvent, 0);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        11T.A0F(keyEvent, 0);
        11T.A0A(getWindow().getDecorView());
        return D3T(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        11T.A0F(keyEvent, 0);
        11T.A0A(getWindow().getDecorView());
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int A00 = 0FI.A00(-1405646941);
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
        0FI.A07(1408521919, A00);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        this.lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }
}

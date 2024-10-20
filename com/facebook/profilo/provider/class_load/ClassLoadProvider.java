package com.facebook.profilo.provider.class_load;

import X.0FI;
import X.0S1;
import X.0eP;
import X.0eQ;
import X.AnonymousClass001;
import X.C0lu;
import android.util.Log;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: ClassLoadProvider.class */
public final class ClassLoadProvider extends C0lu {
    public static final int A01 = ProvidersRegistry.A00.A02("class_load");
    public 0eQ A00;

    public ClassLoadProvider() {
        super(null);
        this.A00 = new 0S1(A05());
    }

    @Override // X.C0lu
    public void disable() {
        int A03 = 0FI.A03(-1042262447);
        0eP A00 = 0eP.A00();
        if (A00 != null) {
            0eQ r0 = this.A00;
            synchronized (A00) {
                AtomicReference atomicReference = A00.A05;
                ArrayList A0t = AnonymousClass001.A0t(((ArrayList) atomicReference.get()).size() - 1);
                Iterator it = ((ArrayList) atomicReference.get()).iterator();
                while (it.hasNext()) {
                    0eQ r02 = (0eQ) it.next();
                    if (r02 != r0) {
                        A0t.add(r02);
                    }
                }
                atomicReference.set(A0t);
                if (((ArrayList) atomicReference.get()).isEmpty()) {
                    ClassLoader classLoader = A00.A00;
                    if (classLoader.toString().startsWith("dalvik.system.PathClassLoader") && (classLoader.getParent() instanceof 0eP)) {
                        try {
                            A00.A03.set(classLoader, A00.A01);
                            A00.A06 = false;
                            Log.w("PluginClassLoader", "Uninstalled PluginClassLoader");
                        } catch (IllegalAccessException unused) {
                            Log.w("PluginClassLoader", "Failed to uninstall PluginClassLoader");
                        }
                    } else {
                        Log.w("PluginClassLoader", "Non-standard class loader chain. PluginClassLoader will not be uninstalled");
                    }
                }
            }
        }
        0FI.A09(-1174448314, A03);
    }

    @Override // X.C0lu
    public void enable() {
        int A03 = 0FI.A03(849025068);
        0eP A00 = 0eP.A00();
        if (A00 != null) {
            A00.A01(this.A00);
        }
        0FI.A09(-1867853427, A03);
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return A01;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        boolean z;
        0eP A00 = 0eP.A00();
        int i = A01;
        if (!TraceEvents.isEnabled(i) || A00 == null) {
            return 0;
        }
        synchronized (A00) {
            z = A00.A06;
        }
        if (z) {
            return i;
        }
        return 0;
    }
}

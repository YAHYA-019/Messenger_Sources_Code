package com.facebook.soloader;

import X.C0il;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* loaded from: NativeLibrary.class */
public abstract class NativeLibrary {
    public List A01;
    public final Object A03 = new Object();
    public Boolean A00 = true;
    public boolean A02 = false;
    public volatile UnsatisfiedLinkError A04 = null;

    public NativeLibrary(List list) {
        this.A01 = list;
    }

    public void A00() {
        if (!A02()) {
            throw this.A04;
        }
    }

    public void A01() {
    }

    public boolean A02() {
        boolean z;
        synchronized (this.A03) {
            if (this.A00.booleanValue()) {
                try {
                    List list = this.A01;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C0il.A0B((String) it.next());
                        }
                    }
                    A01();
                    this.A02 = true;
                    z = true;
                    this.A01 = null;
                } catch (UnsatisfiedLinkError e) {
                    Log.e("com.facebook.soloader.NativeLibrary", "Failed to load native lib (initial check): ", e);
                    this.A04 = e;
                    this.A02 = false;
                    z = false;
                    this.A00 = false;
                    return z;
                } catch (Throwable th) {
                    Log.e("com.facebook.soloader.NativeLibrary", "Failed to load native lib (other error): ", th);
                    this.A04 = new UnsatisfiedLinkError("Failed loading libraries");
                    this.A04.initCause(th);
                    this.A02 = false;
                    z = false;
                    this.A00 = false;
                    return z;
                }
                this.A00 = false;
            } else {
                z = this.A02;
            }
        }
        return z;
    }
}

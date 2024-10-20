package com.facebook.simplejni;

import X.1MG;
import X.1Zw;
import X.AbstractC00061a1;
import X.C00081a3;
import X.C0il;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: NativeHolder.class */
public class NativeHolder {
    public final Destructor mDestructor;
    public final long mNativePointer;

    /* loaded from: NativeHolder$Destructor.class */
    public class Destructor extends 1Zw {
        public long mNativeDestructorFunctionPointer;
        public long mNativePointer;

        static {
            C0il.A0B("simplejni");
        }

        public Destructor(Object obj, long j, long j2) {
            super(obj, AbstractC00061a1.A02);
            AtomicReference atomicReference;
            1Zw r0;
            C00081a3 c00081a3 = AbstractC00061a1.A01;
            do {
                atomicReference = c00081a3.A00;
                r0 = (1Zw) atomicReference.get();
                ((1Zw) this).A00 = r0;
            } while (!1MG.A00(atomicReference, r0, this));
            this.mNativePointer = j;
            this.mNativeDestructorFunctionPointer = j2;
        }

        public static native void deleteNative(long j, long j2);

        public void destruct() {
            long j = this.mNativePointer;
            if (j != 0) {
                deleteNative(j, this.mNativeDestructorFunctionPointer);
                this.mNativePointer = 0L;
            }
        }
    }

    static {
        C0il.A0B("simplejni");
    }

    public NativeHolder(long j, long j2) {
        this.mNativePointer = j;
        this.mDestructor = new Destructor(this, j, j2);
    }
}

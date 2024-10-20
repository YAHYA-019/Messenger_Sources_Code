package com.google.common.base.internal;

import X.AnonymousClass001;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: Finalizer.class */
public class Finalizer implements Runnable {
    public static final Constructor bigThreadConstructor;
    public static final Field inheritableThreadLocals;
    public static final Logger logger = Logger.getLogger(Finalizer.class.getName());
    public final WeakReference finalizableReferenceClassReference;
    public final PhantomReference frqReference;
    public final ReferenceQueue queue;

    static {
        Constructor bigThreadConstructor2 = getBigThreadConstructor();
        bigThreadConstructor = bigThreadConstructor2;
        inheritableThreadLocals = bigThreadConstructor2 == null ? getInheritableThreadLocalsField() : null;
    }

    public Finalizer(Class cls, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        this.queue = referenceQueue;
        this.finalizableReferenceClassReference = new WeakReference(cls);
        this.frqReference = phantomReference;
    }

    private boolean cleanUp(Reference reference) {
        Method finalizeReferentMethod = getFinalizeReferentMethod();
        if (finalizeReferentMethod == null) {
            return false;
        }
        while (finalizeReference(reference, finalizeReferentMethod)) {
            reference = this.queue.poll();
            if (reference == null) {
                return true;
            }
        }
        return false;
    }

    private boolean finalizeReference(Reference reference, Method method) {
        reference.clear();
        boolean z = false;
        if (reference != this.frqReference) {
            try {
                method.invoke(reference, new Object[0]);
            } catch (Throwable th) {
                logger.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
            z = true;
        }
        return z;
    }

    public static Constructor getBigThreadConstructor() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    private Method getFinalizeReferentMethod() {
        Class cls = (Class) this.finalizableReferenceClassReference.get();
        if (cls == null) {
            return null;
        }
        Method method = null;
        try {
            method = cls.getMethod("finalizeReferent", new Class[0]);
            return method;
        } catch (NoSuchMethodException unused) {
            throw AnonymousClass001.A0J(method);
        }
    }

    public static Field getInheritableThreadLocalsField() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            logger.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r312 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void startFinalizer(java.lang.Class r301, java.lang.ref.ReferenceQueue r302, java.lang.ref.PhantomReference r303) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.internal.Finalizer.startFinalizer(java.lang.Class, java.lang.ref.ReferenceQueue, java.lang.ref.PhantomReference):void");
    }

    @Override // java.lang.Runnable
    public void run() {
        while (cleanUp(this.queue.remove())) {
        }
    }
}

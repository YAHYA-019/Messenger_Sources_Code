package com.facebook.proxygen;

import com.facebook.proxygen.utils.Preconditions;

/* loaded from: HTTPThread.class */
public class HTTPThread implements Runnable {
    public EventBase mEventBase;
    public boolean mEventBaseInitError = false;
    public EvbExceptionHandler mExHandler;

    public boolean eventBaseInitErrored() {
        boolean z;
        synchronized (this) {
            z = this.mEventBaseInitError;
        }
        return z;
    }

    public EventBase getEventBase() {
        Preconditions.checkNotNull(this.mEventBase, "EventBase has not been created yet");
        return this.mEventBase;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            try {
                try {
                    try {
                        this.mEventBase = new EventBase();
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (UnsatisfiedLinkError unused) {
                    this.mEventBaseInitError = true;
                }
            } finally {
                notifyAll();
            }
        }
        try {
            EventBase eventBase = this.mEventBase;
            if (eventBase != null) {
                eventBase.loopForever();
            }
        } catch (Throwable th2) {
            th = th2;
            EvbExceptionHandler evbExceptionHandler = this.mExHandler;
            if (evbExceptionHandler != null) {
                evbExceptionHandler.handle(th);
                return;
            }
            throw th;
        }
    }

    public HTTPThread setExceptionHandler(EvbExceptionHandler evbExceptionHandler) {
        this.mExHandler = evbExceptionHandler;
        return this;
    }

    public void waitForInitialization() {
        synchronized (this) {
            while (this.mEventBase == null && !this.mEventBaseInitError) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}

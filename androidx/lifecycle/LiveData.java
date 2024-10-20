package androidx.lifecycle;

import X.0Pz;
import X.0QJ;
import X.0yB;
import X.AnonymousClass001;
import X.C01k;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: LiveData.class */
public abstract class LiveData {
    public static final Object NOT_SET = new Object();
    public int mActiveCount;
    public boolean mChangingActiveState;
    public volatile Object mData;
    public final Object mDataLock;
    public boolean mDispatchInvalidated;
    public boolean mDispatchingValue;
    public 0QJ mObservers;
    public volatile Object mPendingData;
    public final Runnable mPostValueRunnable;
    public int mVersion;

    /* loaded from: LiveData$AlwaysActiveObserver.class */
    public class AlwaysActiveObserver extends ObserverWrapper {
        public AlwaysActiveObserver(Observer observer) {
            super(observer);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
            return true;
        }
    }

    /* loaded from: LiveData$LifecycleBoundObserver.class */
    public class LifecycleBoundObserver extends ObserverWrapper implements LifecycleEventObserver {
        public final LifecycleOwner mOwner;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer observer) {
            super(observer);
            this.mOwner = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public void detachObserver() {
            this.mOwner.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            return AnonymousClass001.A1W(this.mOwner, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State currentState = this.mOwner.getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.mObserver);
                return;
            }
            Lifecycle.State state = null;
            while (state != currentState) {
                activeStateChanged(shouldBeActive());
                state = currentState;
                currentState = this.mOwner.getLifecycle().getCurrentState();
            }
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public boolean shouldBeActive() {
            return this.mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }
    }

    /* loaded from: LiveData$ObserverWrapper.class */
    public abstract class ObserverWrapper {
        public boolean mActive;
        public int mLastVersion = -1;
        public final Observer mObserver;

        public ObserverWrapper(Observer observer) {
            this.mObserver = observer;
        }

        public void activeStateChanged(boolean z) {
            if (z != this.mActive) {
                this.mActive = z;
                LiveData liveData = LiveData.this;
                int i = -1;
                if (z) {
                    i = 1;
                }
                int i2 = liveData.mActiveCount;
                liveData.mActiveCount = i + i2;
                if (!liveData.mChangingActiveState) {
                    liveData.mChangingActiveState = true;
                    while (true) {
                        try {
                            int i3 = liveData.mActiveCount;
                            if (i2 == i3) {
                                break;
                            }
                            if (i2 == 0) {
                                if (i3 > 0) {
                                    liveData.onActive();
                                }
                            } else if (i2 > 0 && i3 == 0) {
                                liveData.onInactive();
                            }
                            i2 = i3;
                        } finally {
                            liveData.mChangingActiveState = false;
                        }
                    }
                }
                if (this.mActive) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        public void detachObserver() {
        }

        public boolean isAttachedTo(LifecycleOwner lifecycleOwner) {
            return false;
        }

        public abstract boolean shouldBeActive();
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new 0QJ();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            @Override // java.lang.Runnable
            public void run() {
                Object obj2;
                synchronized (LiveData.this.mDataLock) {
                    obj2 = LiveData.this.mPendingData;
                    LiveData.this.mPendingData = LiveData.NOT_SET;
                }
                LiveData.this.setValue(obj2);
            }
        };
        this.mData = obj;
        this.mVersion = -1;
    }

    public LiveData(Object obj) {
        this.mDataLock = new Object();
        this.mObservers = new 0QJ();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            @Override // java.lang.Runnable
            public void run() {
                Object obj2;
                synchronized (LiveData.this.mDataLock) {
                    obj2 = LiveData.this.mPendingData;
                    LiveData.this.mPendingData = LiveData.NOT_SET;
                }
                LiveData.this.setValue(obj2);
            }
        };
        this.mData = obj;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (!0yB.A00().A03()) {
            throw 0Pz.A07("Cannot invoke ", str, " on a background thread");
        }
    }

    private void considerNotify(ObserverWrapper observerWrapper) {
        if (observerWrapper.mActive) {
            if (!observerWrapper.shouldBeActive()) {
                observerWrapper.activeStateChanged(false);
                return;
            }
            int i = observerWrapper.mLastVersion;
            int i2 = this.mVersion;
            if (i < i2) {
                observerWrapper.mLastVersion = i2;
                observerWrapper.mObserver.onChanged(this.mData);
            }
        }
    }

    public void dispatchingValue(ObserverWrapper observerWrapper) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (observerWrapper != null) {
                considerNotify(observerWrapper);
                observerWrapper = null;
            } else {
                0QJ r0 = this.mObservers;
                C01k c01k = new C01k(r0);
                r0.A03.put(c01k, false);
                while (c01k.hasNext()) {
                    considerNotify((ObserverWrapper) ((Map.Entry) c01k.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public Object getValue() {
        Object obj = this.mData;
        if (obj == NOT_SET) {
            obj = null;
        }
        return obj;
    }

    public boolean hasActiveObservers() {
        boolean z = false;
        if (this.mActiveCount > 0) {
            z = true;
        }
        return z;
    }

    public void observe(LifecycleOwner lifecycleOwner, Observer observer) {
        assertMainThread("observe");
        if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
            ObserverWrapper observerWrapper = (ObserverWrapper) this.mObservers.A02(observer, lifecycleBoundObserver);
            if (observerWrapper == null) {
                lifecycleOwner.getLifecycle().addObserver(lifecycleBoundObserver);
            } else if (!observerWrapper.isAttachedTo(lifecycleOwner)) {
                throw AnonymousClass001.A0L("Cannot add the same observer with different lifecycles");
            }
        }
    }

    public void observeForever(Observer observer) {
        assertMainThread("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(observer);
        Object A02 = this.mObservers.A02(observer, alwaysActiveObserver);
        if (A02 instanceof LifecycleBoundObserver) {
            throw AnonymousClass001.A0L("Cannot add the same observer with different lifecycles");
        }
        if (A02 == null) {
            alwaysActiveObserver.activeStateChanged(true);
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(Object obj) {
        boolean z;
        synchronized (this.mDataLock) {
            z = false;
            if (this.mPendingData == NOT_SET) {
                z = true;
            }
            this.mPendingData = obj;
        }
        if (z) {
            0yB.A00().A02(this.mPostValueRunnable);
        }
    }

    public void removeObserver(Observer observer) {
        assertMainThread("removeObserver");
        ObserverWrapper observerWrapper = (ObserverWrapper) this.mObservers.A01(observer);
        if (observerWrapper != null) {
            observerWrapper.detachObserver();
            observerWrapper.activeStateChanged(false);
        }
    }

    public void removeObservers(LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            if (((ObserverWrapper) A0z.getValue()).isAttachedTo(lifecycleOwner)) {
                removeObserver((Observer) A0z.getKey());
            }
        }
    }

    public void setValue(Object obj) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = obj;
        dispatchingValue(null);
    }
}

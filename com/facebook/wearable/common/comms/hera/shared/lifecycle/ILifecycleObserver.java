package com.facebook.wearable.common.comms.hera.shared.lifecycle;

/* loaded from: ILifecycleObserver.class */
public interface ILifecycleObserver {

    /* loaded from: ILifecycleObserver$LifecycleListener.class */
    public interface LifecycleListener {
        String getTAG();

        void onAppBackgrounded();

        void onAppForegrounded();
    }

    void addLifecycleListener(LifecycleListener lifecycleListener);

    boolean attach();

    boolean detach();

    boolean isAppBackgrounded();

    void removeLifecycleListener(LifecycleListener lifecycleListener);
}

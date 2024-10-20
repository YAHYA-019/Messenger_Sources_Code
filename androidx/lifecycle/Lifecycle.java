package androidx.lifecycle;

import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Lifecycle.class */
public abstract class Lifecycle {
    public AtomicReference internalScopeRef = new AtomicReference(null);

    /* loaded from: Lifecycle$Event.class */
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final Companion Companion = new Object();

        /* loaded from: Lifecycle$Event$Companion.class */
        public final class Companion {
            public final Event downFrom(State state) {
                11T.A0F(state, 0);
                int ordinal = state.ordinal();
                if (ordinal == 2) {
                    return Event.ON_DESTROY;
                }
                if (ordinal == 3) {
                    return Event.ON_STOP;
                }
                if (ordinal != 4) {
                    return null;
                }
                return Event.ON_PAUSE;
            }
        }

        public final State getTargetState() {
            switch (this) {
                case ON_CREATE:
                case ON_STOP:
                    return State.CREATED;
                case ON_START:
                case ON_PAUSE:
                    return State.STARTED;
                case ON_RESUME:
                    return State.RESUMED;
                case ON_DESTROY:
                    return State.DESTROYED;
                default:
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append(this);
                    throw AnonymousClass002.A0D(" has no target state", A0k);
            }
        }
    }

    /* loaded from: Lifecycle$State.class */
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(State state) {
            boolean z = false;
            11T.A0F(state, 0);
            if (compareTo(state) >= 0) {
                z = true;
            }
            return z;
        }
    }

    public abstract void addObserver(LifecycleObserver lifecycleObserver);

    public abstract State getCurrentState();

    public abstract void removeObserver(LifecycleObserver lifecycleObserver);
}

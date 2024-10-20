package androidx.lifecycle;

import X.06H;
import X.06J;
import X.0Pz;
import X.0QJ;
import X.0Ro;
import X.0Xs;
import X.0yB;
import X.11T;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C01k;
import X.C0y9;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: LifecycleRegistry.class */
public class LifecycleRegistry extends Lifecycle {
    public static final Companion Companion = new Object();
    public final 0Xs _currentStateFlow;
    public int addingObserverCounter;
    public boolean handlingEvent;
    public final WeakReference lifecycleOwner;
    public boolean newEventOccurred;
    public ArrayList parentStates;
    public Lifecycle.State state;
    public final boolean enforceMainThread = true;
    public C0y9 observerMap = new C0y9();

    /* loaded from: LifecycleRegistry$Companion.class */
    public final class Companion {
    }

    /* loaded from: LifecycleRegistry$ObserverWithState.class */
    public final class ObserverWithState {
        public LifecycleEventObserver lifecycleObserver;
        public Lifecycle.State state;

        public ObserverWithState(LifecycleObserver lifecycleObserver, Lifecycle.State state) {
            11T.A0F(state, 2);
            11T.A0D(lifecycleObserver);
            this.lifecycleObserver = Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.state = state;
        }

        public final void dispatchEvent(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            Lifecycle.State state = this.state;
            11T.A0F(state, 0);
            if (targetState.compareTo(state) < 0) {
                state = targetState;
            }
            this.state = state;
            LifecycleEventObserver lifecycleEventObserver = this.lifecycleObserver;
            11T.A0D(lifecycleOwner);
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
            this.state = targetState;
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.state = state;
        this.parentStates = new ArrayList();
        this.lifecycleOwner = new WeakReference(lifecycleOwner);
        this._currentStateFlow = new 0Ro(state);
    }

    private final Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
        ObserverWithState observerWithState;
        HashMap hashMap = this.observerMap.A00;
        06H r303 = hashMap.containsKey(lifecycleObserver) ? ((06H) hashMap.get(lifecycleObserver)).A01 : null;
        Lifecycle.State state = null;
        Lifecycle.State state2 = (r303 == null || (observerWithState = (ObserverWithState) r303.getValue()) == null) ? null : observerWithState.state;
        if (!this.parentStates.isEmpty()) {
            state = (Lifecycle.State) this.parentStates.get(r0.size() - 1);
        }
        Lifecycle.State state3 = this.state;
        11T.A0F(state3, 0);
        if (state2 != null && state2.compareTo(state3) < 0) {
            state3 = state2;
        }
        return (state == null || state.compareTo(state3) >= 0) ? state3 : state;
    }

    private final void enforceMainThreadIfNeeded(String str) {
        if (this.enforceMainThread && !0yB.A00().A03()) {
            throw 0Pz.A07("Method ", str, " must be called on the main thread");
        }
    }

    private final void moveToState(Lifecycle.State state) {
        Lifecycle.State state2 = this.state;
        if (state2 != state) {
            if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("State must be at least CREATED to move to ");
                A0k.append(state);
                A0k.append(", but was ");
                A0k.append(this.state);
                A0k.append(" in component ");
                throw AnonymousClass002.A0E(this.lifecycleOwner.get(), A0k);
            }
            this.state = state;
            if (this.handlingEvent || this.addingObserverCounter != 0) {
                this.newEventOccurred = true;
                return;
            }
            this.handlingEvent = true;
            sync();
            this.handlingEvent = false;
            if (this.state == Lifecycle.State.DESTROYED) {
                this.observerMap = new C0y9();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v128, types: [X.06J, java.util.Iterator, java.lang.Object] */
    private final void sync() {
        Lifecycle.Event event;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.lifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw AnonymousClass001.A0N("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0y9 c0y9 = this.observerMap;
            boolean z = true;
            if (((0QJ) c0y9).A00 != 0) {
                06H r0 = ((0QJ) c0y9).A02;
                11T.A0D(r0);
                Lifecycle.State state = ((ObserverWithState) r0.getValue()).state;
                06H r02 = ((0QJ) this.observerMap).A01;
                11T.A0D(r02);
                Lifecycle.State state2 = ((ObserverWithState) r02.getValue()).state;
                if (state != state2 || this.state != state2) {
                    z = false;
                }
            }
            this.newEventOccurred = false;
            if (z) {
                this._currentStateFlow.Cvx(this.state);
                return;
            }
            Lifecycle.State state3 = this.state;
            06H r03 = ((0QJ) this.observerMap).A02;
            11T.A0D(r03);
            if (state3.compareTo(((ObserverWithState) r03.getValue()).state) < 0) {
                C0y9 c0y92 = this.observerMap;
                06H r04 = ((0QJ) c0y92).A01;
                06H r05 = ((0QJ) c0y92).A02;
                ?? obj = new Object();
                ((06J) obj).A00 = r05;
                ((06J) obj).A01 = r04;
                ((0QJ) c0y92).A03.put(obj, false);
                while (obj.hasNext() && !this.newEventOccurred) {
                    Map.Entry entry = (Map.Entry) obj.next();
                    11T.A08(entry);
                    Object key = entry.getKey();
                    ObserverWithState observerWithState = (ObserverWithState) entry.getValue();
                    while (observerWithState.state.compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.A00.containsKey(key)) {
                        Lifecycle.Event downFrom = Lifecycle.Event.Companion.downFrom(observerWithState.state);
                        if (downFrom == null) {
                            StringBuilder A0k = AnonymousClass001.A0k();
                            A0k.append("no event down from ");
                            throw AnonymousClass002.A0E(observerWithState.state, A0k);
                        }
                        this.parentStates.add(downFrom.getTargetState());
                        observerWithState.dispatchEvent(lifecycleOwner, downFrom);
                        this.parentStates.remove(r0.size() - 1);
                    }
                }
            }
            06H r06 = ((0QJ) this.observerMap).A01;
            if (!this.newEventOccurred && r06 != null && this.state.compareTo(((ObserverWithState) r06.getValue()).state) > 0) {
                C0y9 c0y93 = this.observerMap;
                C01k c01k = new C01k(c0y93);
                ((0QJ) c0y93).A03.put(c01k, false);
                while (c01k.hasNext() && !this.newEventOccurred) {
                    Map.Entry entry2 = (Map.Entry) c01k.next();
                    Object key2 = entry2.getKey();
                    ObserverWithState observerWithState2 = (ObserverWithState) entry2.getValue();
                    while (observerWithState2.state.compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.A00.containsKey(key2)) {
                        Lifecycle.State state4 = observerWithState2.state;
                        this.parentStates.add(state4);
                        11T.A0F(state4, 0);
                        int ordinal = state4.ordinal();
                        if (ordinal == 2) {
                            event = Lifecycle.Event.ON_START;
                        } else if (ordinal == 3) {
                            event = Lifecycle.Event.ON_RESUME;
                        } else {
                            if (ordinal != 1) {
                                StringBuilder A0k2 = AnonymousClass001.A0k();
                                A0k2.append("no event up from ");
                                throw AnonymousClass002.A0E(observerWithState2.state, A0k2);
                            }
                            event = Lifecycle.Event.ON_CREATE;
                        }
                        observerWithState2.dispatchEvent(lifecycleOwner, event);
                        this.parentStates.remove(r0.size() - 1);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (r301.handlingEvent != false) goto L13;
     */
    @Override // androidx.lifecycle.Lifecycle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addObserver(androidx.lifecycle.LifecycleObserver r302) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.LifecycleRegistry.addObserver(androidx.lifecycle.LifecycleObserver):void");
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return this.state;
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
        11T.A0F(event, 0);
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver lifecycleObserver) {
        11T.A0F(lifecycleObserver, 0);
        enforceMainThreadIfNeeded("removeObserver");
        this.observerMap.A01(lifecycleObserver);
    }

    public void setCurrentState(Lifecycle.State state) {
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }
}

package com.facebook.perf.startupstatemachine;

/* loaded from: StartupStateMachine.class */
public final class StartupStateMachine {
    public int A00 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A01 = 0;

    public void A00() {
        synchronized (this) {
            this.A00 = 1;
        }
    }

    public void A01() {
        synchronized (this) {
            this.A03 = 1;
        }
    }

    public boolean A02() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A00 == 3) {
                z = true;
            }
        }
        return z;
    }

    public boolean A03() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A02 == 3) {
                z = true;
            }
        }
        return z;
    }

    public boolean A04() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A03 == 3) {
                z = true;
            }
        }
        return z;
    }

    public String toString() {
        String obj;
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toString(this.A00));
            sb.append(':');
            sb.append(Integer.toString(this.A02));
            sb.append(':');
            sb.append(Integer.toString(this.A03));
            sb.append(':');
            sb.append(Integer.toString(this.A01));
            obj = sb.toString();
        }
        return obj;
    }
}

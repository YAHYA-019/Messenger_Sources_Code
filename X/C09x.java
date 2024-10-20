package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

/* renamed from: X.09x, reason: invalid class name */
/* loaded from: 09x.class */
public final class C09x {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Fragment A05;
    public Lifecycle.State A06;
    public Lifecycle.State A07;
    public boolean A08;

    public C09x() {
    }

    public C09x(C09x c09x) {
        this.A00 = c09x.A00;
        this.A05 = c09x.A05;
        this.A08 = c09x.A08;
        this.A01 = c09x.A01;
        this.A02 = c09x.A02;
        this.A03 = c09x.A03;
        this.A04 = c09x.A04;
        this.A07 = c09x.A07;
        this.A06 = c09x.A06;
    }

    public C09x(Fragment fragment, int i) {
        this.A00 = i;
        this.A05 = fragment;
        this.A08 = false;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.A07 = state;
        this.A06 = state;
    }

    public C09x(Fragment fragment, int i, boolean z) {
        this.A00 = i;
        this.A05 = fragment;
        this.A08 = true;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        this.A07 = state;
        this.A06 = state;
    }

    public C09x(Fragment fragment, Lifecycle.State state) {
        this.A00 = 10;
        this.A05 = fragment;
        this.A08 = false;
        this.A07 = fragment.mMaxState;
        this.A06 = state;
    }
}

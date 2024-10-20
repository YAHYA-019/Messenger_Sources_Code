package X;

import android.view.KeyEvent;

/* renamed from: X.7tz, reason: invalid class name */
/* loaded from: 7tz.class */
public final class C7tz {
    public long A00;
    public C7o3 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final 1Br A05 = 1Bq.A00(99390);

    public static final void A00(KeyEvent keyEvent, C7tz c7tz) {
        boolean A1O = AnonymousClass001.A1O(keyEvent.getAction());
        if (24 == keyEvent.getKeyCode()) {
            c7tz.A04 = A1O;
        } else if (25 == keyEvent.getKeyCode()) {
            c7tz.A03 = A1O;
        }
    }
}

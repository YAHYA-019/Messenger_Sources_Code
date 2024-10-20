package X;

import com.facebook.common.util.TriState;

/* renamed from: X.1g7, reason: invalid class name */
/* loaded from: 1g7.class */
public final class C1g7 implements C1g8 {
    public TriState A00;
    public C15h A01;

    @Override // X.C1g8
    public TriState DAJ() {
        TriState triState = this.A00;
        if (triState == null) {
            triState = TriState.UNSET;
            this.A00 = triState;
        }
        if (!triState.isSet()) {
            triState = ((1Od) this.A01.get()).A0A();
            this.A00 = triState;
            if (triState == TriState.UNSET) {
                triState = TriState.valueOf(0Xh.A04.A01);
                this.A00 = triState;
            }
        }
        return triState;
    }
}

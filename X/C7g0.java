package X;

import android.view.View;
import com.facebook.messaging.model.messages.Message;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7g0, reason: invalid class name */
/* loaded from: 7g0.class */
public final class C7g0 extends C1rj {
    public 2S4 A00;
    public 5zD A01;
    public Message A02;
    public ImmutableList A03;
    public boolean A04;

    public C7g0() {
        super("SeenHeadsContainerWrapper");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, Boolean.valueOf(this.A04), this.A00, this.A01};
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        2S4 r0 = this.A00;
        Message message = this.A02;
        ImmutableList immutableList = this.A03;
        5zD r02 = this.A01;
        boolean z = this.A04;
        11T.A0F(r302, 0);
        1BL.A11(2, r0, message, immutableList);
        11T.A0F(r02, 5);
        float A00 = r302.A0E.A00(View.MeasureSpec.getSize(i));
        int size = immutableList.size();
        float f = A00 - 24.0f;
        if (size > Math.min((int) (f / 20.0f), 9)) {
            size = Math.min((int) (((f - 60.0f) - 4.0f) / 20.0f), 9);
        }
        return new 7WP(r0, r02, message, immutableList, size, z);
    }
}

package X;

import java.util.HashMap;

/* loaded from: HuI.class */
public final class HuI {
    public long A00;
    public final JIC A01;
    public final java.util.Map A02;

    public HuI(JIC jic, I8v i8v, java.util.Map map) {
        11T.A0F(jic, 3);
        HashMap A0u = AnonymousClass001.A0u();
        this.A02 = A0u;
        A0u.putAll(map);
        if (!A0u.containsKey("media_type")) {
            A0u.put("media_type", "video");
        }
        if (i8v != null) {
            HashMap A0u2 = AnonymousClass001.A0u();
            int i = i8v.A0C;
            if (i != 0) {
                A0u2.put("target_width", String.valueOf(i));
            }
            int i2 = i8v.A0A;
            if (i2 != 0) {
                A0u2.put("target_height", String.valueOf(i2));
            }
            if (i8v.A01() != 0) {
                A0u2.put("target_bit_rate", String.valueOf(i8v.A01()));
            }
            A0u2.put("target_rotation_angle", String.valueOf(i8v.A05));
            A0u.putAll(A0u2);
        }
        this.A01 = jic;
    }

    public final void A00() {
        JIC jic = this.A01;
        HLd.A00(jic, null, "media_upload_process_cancel", this.A02, jic.now() - this.A00);
    }

    public final void A01() {
        JIC jic = this.A01;
        HLd.A00(jic, null, AbstractC00603o4.A00(218), this.A02, jic.now() - this.A00);
    }

    public final void A02() {
        JIC jic = this.A01;
        this.A00 = jic.now();
        HLd.A00(jic, null, AbstractC00603o4.A00(217), this.A02, -1);
    }

    public final void A03(Exception exc) {
        JIC jic = this.A01;
        HLd.A00(jic, exc, AbstractC00603o4.A00(215), this.A02, jic.now() - this.A00);
    }
}

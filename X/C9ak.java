package X;

import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.9ak, reason: invalid class name */
/* loaded from: 9ak.class */
public final class C9ak {
    public int A00;
    public final ImmutableList.Builder A01 = ImmutableList.builder();

    public final void A00(C1u3 c1u3, CharSequence charSequence) {
        11T.A0H(c1u3, charSequence);
        ImmutableList.Builder builder = this.A01;
        final C9hf c9hf = new C9hf(c1u3, charSequence);
        builder.m11011add((Object) new 3wO(c9hf) { // from class: X.9zg
            public final C9hf A00;

            {
                this.A00 = c9hf;
            }

            public boolean BVj(3wO r302) {
                boolean z = false;
                if (!11T.A0O(4YV.A0d(r302, 0), C9zg.class)) {
                    return false;
                }
                C9hf c9hf2 = this.A00;
                C1u3 c1u32 = c9hf2.A00;
                C9hf c9hf3 = ((C9zg) r302).A00;
                if (c1u32 == c9hf3.A00) {
                    z = 4YV.A1a(c9hf2.A01, c9hf3.A01, false);
                }
                return z;
            }

            public boolean BVl(3wO r302) {
                boolean z = false;
                if (!11T.A0O(4YV.A0d(r302, 0), C9zg.class)) {
                    return false;
                }
                if (this.A00.A00 == ((C9zg) r302).A00.A00) {
                    z = true;
                }
                return z;
            }

            public C1rh Cfh(3wQ r302, boolean z) {
                11T.A0F(r302, 0);
                C9hf c9hf2 = this.A00;
                11T.A0F(c9hf2, 0);
                1Iw r0 = r302.A00;
                8Sx r02 = new 8Sx(r0, new C8jc());
                C1u3 c1u32 = c9hf2.A00;
                C8jc c8jc = r02.A01;
                c8jc.A00 = c1u32;
                BitSet bitSet = r02.A02;
                bitSet.set(2);
                CharSequence charSequence2 = c9hf2.A01;
                r02.A2W(charSequence2);
                c8jc.A01 = r302.A01;
                bitSet.set(0);
                c8jc.A03 = z;
                bitSet.set(3);
                r02.A2K(c1u32.name());
                C1rs.A02(bitSet, r02.A03);
                r02.A0J();
                11T.A0A(charSequence2);
                return 3wQ.A00(c8jc, r0, r302, charSequence2, z, false);
            }
        });
    }

    public final void A01(CharSequence charSequence, Drawable drawable) {
        11T.A0F(charSequence, 1);
        this.A01.m11011add((Object) new RsK(new RSz(drawable, charSequence, this.A00)));
        this.A00++;
    }
}

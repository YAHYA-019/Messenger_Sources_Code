package X;

import android.content.Context;
import com.facebook.messaging.sharedcontent.plugins.media.tabcontent.SharedMediaTabContentImplementation;
import com.facebook.messaging.sharedimage.SharedMedia;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.560, reason: invalid class name */
/* loaded from: 560.class */
public final class AnonymousClass560 implements 55Q {
    public final 1Br A00;
    public final Context A01;
    public final 1De A02;

    public AnonymousClass560(1De r302) {
        this.A02 = r302;
        Context context = (Context) 1Bn.A0E((Context) null, r302.A00, 83719);
        this.A01 = context;
        this.A00 = 1HG.A00(context, 68492);
    }

    public static final void A00(C1rs c1rs, int i) {
        c1rs.A10(33.333332f);
        c1rs.A0f(1.0f);
        c1rs.A18(3.0f);
        int i2 = 2;
        if (i == 1) {
            i2 = 1;
        } else if (i != 2) {
            i2 = 0;
        }
        c1rs.A13(i2);
        int i3 = 1;
        if (i == 0) {
            i3 = 2;
        } else if (i != 1) {
            i3 = 0;
        }
        c1rs.A15(i3);
    }

    public /* bridge */ /* synthetic */ 1LI AJD(1Iw r302, AnonymousClass544 anonymousClass544) {
        final AnonymousClass561 anonymousClass561 = (AnonymousClass561) anonymousClass544;
        boolean A1X = 1BL.A1X(r302, anonymousClass561);
        AYF ayf = new AYF() { // from class: X.9xv
            public void Bog(SharedMedia sharedMedia, List list) {
                SharedMediaTabContentImplementation sharedMediaTabContentImplementation = AnonymousClass561.this.A03.A00.A00;
                9DK.A00(7zL.A0A(sharedMediaTabContentImplementation.A0B), sharedMediaTabContentImplementation.A04, sharedMediaTabContentImplementation.A0E, sharedMediaTabContentImplementation.A0H, sharedMedia, 0DW.A00(list), "SharedMediaTabContentImplementation", (Function1) null, 0, sharedMediaTabContentImplementation.A02, false, false);
                sharedMediaTabContentImplementation.A0I.A03(SharedMediaTabContentImplementation.A0M);
            }
        };
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0R();
        A01.A0e();
        int i = anonymousClass561.A00;
        List list = anonymousClass561.A04;
        int min = Math.min(3, list.size() - i);
        int i2 = i + min;
        int i3 = i;
        while (true) {
            int i4 = i3;
            if (i4 >= i2) {
                break;
            }
            int i5 = i4 - i;
            8Q7 r0 = new 8Q7(r302, new C8md());
            SharedMedia sharedMedia = (SharedMedia) list.get(i4);
            C8md c8md = r0.A01;
            c8md.A01 = sharedMedia;
            BitSet bitSet = r0.A02;
            bitSet.set(A1X ? 1 : 0);
            ImmutableList copyOf = ImmutableList.copyOf((Iterable) list);
            11T.A0A(copyOf);
            c8md.A04 = copyOf;
            bitSet.set(2);
            C62g c62g = (C62g) 1Br.A0B(this.A00);
            list.get(i4);
            c8md.A03 = Boolean.valueOf(c62g.A02(anonymousClass561.A02));
            c8md.A02 = ayf;
            bitSet.set(0);
            A00(r0, i5);
            A01.A2f(r0.A2V());
            i3 = i4 + 1;
        }
        while (min < 3) {
            2cM A012 = 2cK.A01(r302, (String) null, 0);
            A00(A012, min);
            A01.A2f(A012.A00);
            min++;
        }
        return A01.A00;
    }

    public Class BDi() {
        return AnonymousClass561.class;
    }
}

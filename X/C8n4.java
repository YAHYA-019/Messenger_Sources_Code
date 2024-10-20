package X;

import com.facebook.common.callercontext.ContextChain;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8n4, reason: invalid class name */
/* loaded from: 8n4.class */
public final class C8n4 extends C1rj {
    public static final C5j5 A0G = C5j5.A01;
    public static final C6yo A0H = new Object();
    public int A00;
    public int A01;
    public C5em A02;
    public 3xX A03;
    public C5j5 A04;
    public C6yo A05;
    public 5vH A06;
    public ImmutableList A07;
    public Boolean A08;
    public Function1 A09;
    public Function2 A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public C8n4() {
        super("VitoPhotoGridWrapperComponent");
        this.A05 = A0H;
        this.A0B = false;
        this.A04 = A0G;
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A05, Boolean.valueOf(this.A0B), null, this.A09, null, Boolean.valueOf(this.A0C), this.A03, Boolean.valueOf(this.A0D), Boolean.valueOf(this.A0E), this.A06, null, this.A0A, this.A07, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Boolean.valueOf(this.A0F), this.A08, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        ImmutableList immutableList = this.A07;
        boolean z = this.A0D;
        boolean z2 = this.A0E;
        boolean z3 = this.A0C;
        5vH r0 = this.A06;
        C5j5 c5j5 = this.A04;
        1BK.A1M(r302, immutableList);
        11T.A0F(c5j5, 6);
        8SH r02 = new 8SH(r302, new 8nF());
        8nF r03 = r02.A01;
        r03.A03 = immutableList;
        BitSet bitSet = r02.A02;
        bitSet.set(2);
        r03.A04 = z3;
        r03.A05 = z;
        bitSet.set(0);
        r03.A06 = z2;
        bitSet.set(1);
        r03.A02 = r0;
        r03.A00 = 1LI.A0A(r302, C8n4.class, "VitoPhotoGridWrapperComponent", -1619314521);
        r03.A01 = c5j5;
        C1rs.A03(bitSet, r02.A03);
        r02.A0J();
        return r03;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        7Gw A2V;
        int i = r302.A01;
        if (i != -1619314521) {
            if (i != -1048037474) {
                return null;
            }
            1LI.A0J(r302, obj);
            return null;
        }
        9Rp r0 = (9Rp) obj;
        1Iv r02 = r302.A00;
        1Is r03 = r02.A01;
        1Iw r04 = r02.A00;
        float[] fArr = r0.A02;
        Photo photo = r0.A01;
        int i2 = r0.A00;
        C8n4 c8n4 = (C8n4) r03;
        boolean z = c8n4.A0E;
        Function1 function1 = c8n4.A09;
        C5j5 c5j5 = c8n4.A04;
        int i3 = c8n4.A01;
        int i4 = c8n4.A00;
        C5em c5em = c8n4.A02;
        boolean z2 = c8n4.A0F;
        3xX r05 = c8n4.A03;
        Boolean bool = c8n4.A08;
        Function2 function2 = c8n4.A0A;
        boolean z3 = c8n4.A0B;
        C6yo c6yo = c8n4.A05;
        7zS.A16(0, r04, function1, c5j5);
        11T.A0F(c6yo, 14);
        11T.A0F(fArr, 15);
        11T.A0F(photo, 16);
        C85t A00 = 7Jz.A00(r04);
        A00.A0f(1.0f);
        7Jz r06 = A00.A01;
        r06.A04 = c5em;
        A00.A0j(1.0f);
        r06.A0S = true;
        A00.A1Q(i2);
        r06.A0T = z;
        A00.A2X(photo);
        r06.A0N = (java.util.Map) function1.invoke(photo);
        r06.A00 = i4;
        r06.A06 = r05;
        r06.A0I = bool;
        r06.A01 = i3;
        r06.A03 = InterfaceC07034in.A01;
        r06.A07 = c5j5;
        r06.A0U = z2;
        r06.A02 = new ContextChain((ContextChain) null, K92.__redex_internal_original_name, "VitoPhotoGridWrapperComponentSpec");
        A00.A0o(100.0f);
        r06.A0O = function2;
        r06.A0R = z3;
        r06.A0B = c6yo;
        if (photo.A0H) {
            C85d A002 = 7Gw.A00(r04);
            A002.A2Y(fArr);
            A002.A01.A00 = A00.A2V();
            A002.A02.set(1);
            A002.A13(1.0f);
            A2V = A002.A2V();
        } else {
            r06.A05 = 5BJ.A02(fArr, true);
            A2V = A00.A2V();
        }
        11T.A0D(A2V);
        return A2V;
    }
}

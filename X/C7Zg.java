package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;

/* renamed from: X.7Zg, reason: invalid class name */
/* loaded from: 7Zg.class */
public final class C7Zg extends C1rj {
    public C5j5 A00;
    public C6yo A01;
    public 74E A02;
    public Photo A03;
    public 5vW A04;
    public String A05;
    public String A06;
    public java.util.Map A07;
    public boolean A08;

    public C7Zg() {
        super("VitoStoryReplyMessageComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A07, this.A02, this.A05, this.A06, this.A03, this.A04, Boolean.valueOf(this.A08), this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A05;
        String str2 = this.A06;
        Photo photo = this.A03;
        C5j5 c5j5 = this.A00;
        C6yo c6yo = this.A01;
        java.util.Map map = this.A07;
        74E r0 = this.A02;
        boolean z = this.A08;
        11T.A0H(r302, str);
        11T.A0F(c5j5, 4);
        1BL.A1G(c6yo, map);
        if (photo == null) {
            return new 2AW();
        }
        2dD A00 = C2dB.A00(r302);
        C85t A002 = 7Jz.A00(r302);
        7Jz r02 = A002.A01;
        r02.A0L = str;
        r02.A0M = str2;
        A002.A2X(photo);
        r02.A03 = InterfaceC07034in.A0A;
        A002.A0l(216.0f);
        r02.A07 = c5j5;
        A002.A0z(144.0f);
        r02.A0U = z;
        1Im r312 = null;
        r02.A02 = new ContextChain((ContextChain) null, K92.__redex_internal_original_name, "VitoStoryReplyMessageComponentSpec");
        r02.A0N = map;
        r02.A0B = c6yo;
        A00.A2X(A002.A2V());
        if (r0 != null) {
            r312 = 1LI.A09(r302, C7Zg.class, "VitoStoryReplyMessageComponent", -1755229903);
        }
        A00.A2T(r312);
        return A00.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1755229903) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        View view = ((3xC) obj).A00;
        C7Zg c7Zg = (C7Zg) r02;
        5vW r04 = c7Zg.A04;
        74E r05 = c7Zg.A02;
        11T.A0H(r03, r04);
        11T.A0F(view, 3);
        if (r05 == null) {
            throw 1BK.A0h();
        }
        Context context = r03.A0D;
        11T.A0A(context);
        r05.BoE(context, view, r04);
        return null;
    }
}

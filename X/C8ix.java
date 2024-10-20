package X;

import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ix, reason: invalid class name */
/* loaded from: 8ix.class */
public final class C8ix extends C1rj {
    public 5Au A00;

    public C8ix() {
        super("AudioRoomImagePileAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5Au r0 = this.A00;
        boolean A1W = 1BL.A1W(r302, r0);
        C1rq A00 = C1rg.A00(r302);
        A00.A00.A05 = A1W;
        A00.A2i(C1rp.FLEX_END);
        A00.A0k(0.0f);
        A00.A2b();
        C1rq A002 = C1rg.A00(r302);
        A002.A13(0.0f);
        A002.A12(2.0f);
        A002.A0j(0.0f);
        A002.A0k(0.0f);
        MigColorScheme migColorScheme = r0.A00;
        int Chx = migColorScheme.Chx(C1ut.A03);
        C5be A003 = 8AV.A00();
        A003.setColor(Chx);
        A003.setShape(A1W ? 1 : 0);
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132475941);
        Number number = (Number) migColorScheme.Ci4(7zQ.A0k(A0o, 2132475942));
        C1rq A004 = C1rg.A00(r302);
        A004.A0D(A003);
        8Sk A005 = 8oJ.A00(r302);
        8oJ r02 = A005.A00;
        r02.A06 = "community_messaging";
        r02.A07 = A1W;
        r02.A08 = A1W;
        r02.A05 = "audio_wave_glyph";
        11T.A0D(number);
        A005.A2W(number.intValue());
        8Sk.A06(A005, 4);
        A005.A00.A03 = ImageView.ScaleType.FIT_CENTER;
        A005.A0l(20.0f);
        A005.A0z(20.0f);
        A005.A0J();
        A004.A2f(A005.A00);
        7zL.A1M(A004, A002);
        7zL.A1M(A002, A00);
        return A00.A00;
    }
}

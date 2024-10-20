package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mobileconfig.factory.module.AdminIdMC;

/* renamed from: X.Dfl, reason: case insensitive filesystem */
/* loaded from: Dfl.class */
public abstract class AbstractC2157Dfl extends AbstractC2178Dg6 {
    public int A00;
    public Uri A01;
    public CallerContext A02;
    public F7h A03;
    public ENi A04;
    public EZr A05;
    public 1LI A06;
    public CharSequence A07;
    public boolean A08;
    public int A09;
    public boolean A0A;

    public AbstractC2157Dfl(1Iw r302) {
        super(r302);
        this.A04 = ENi.A02;
        this.A00 = ENG.A04.mSizeDip;
        this.A05 = EZr.A00;
        this.A08 = false;
        this.A0A = false;
    }

    public static C06974ih A00(EzJ ezJ, ENi eNi, 1Iw r303, float f) {
        C07004ik A0J;
        int ordinal = eNi.ordinal();
        if (ordinal == 0) {
            C5be c5be = new C5be();
            c5be.setShape(1);
            c5be.setColor(ezJ.A00(2MR.A15));
            A0J = 7zR.A0J();
            A0J.A06(c5be);
        } else {
            if (ordinal != 1) {
                throw AnonymousClass002.A0C(eNi, "Unknown Style: ", AnonymousClass001.A0k());
            }
            int A00 = C0A8.A00(r303.A0D, f);
            C5be c5be2 = new C5be();
            c5be2.setShape(0);
            float f2 = A00;
            c5be2.setCornerRadius(f2);
            c5be2.setColor(ezJ.A00(2MR.A15));
            A0J = C06984ii.A00();
            A0J.A06(c5be2);
            7zM.A1K(A0J, f2);
        }
        return new C06974ih(A0J);
    }

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0K(C26z c26z, int i) {
        int ordinal = c26z.ordinal();
        if (ordinal == 5 || ordinal == 0) {
            this.A09 = i;
            return this;
        }
        if (ordinal != 6) {
            if (ordinal == 8) {
                this.A09 = i;
                super.A0K(C26z.BOTTOM, i);
                super.A0K(C26z.TOP, i);
            }
            super.A0K(c26z, i);
            return this;
        }
        this.A09 = i;
        c26z = C26z.START;
        super.A0K(c26z, i);
        return this;
    }

    @Override // X.AbstractC2178Dg6
    public AbstractC2178Dg6 A0L(CharSequence charSequence) {
        this.A07 = charSequence;
        return this;
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        float f;
        5BH A00;
        this.A04.getClass();
        EvK A02 = ezJ.A02();
        F7h f7h = this.A03;
        if (f7h != null) {
            A02.A01 = f7h;
        }
        EzJ A002 = A02.A00();
        FAL fal = A002.A04;
        int i = this.A00;
        ENG eng = ENG.A0C;
        fal.A00(i >= eng.mSizeDip ? EPH.A0J : EPH.A0I);
        fal.A00(this.A00 >= eng.mSizeDip ? EPH.A0J : EPH.A0I);
        1Bi.A05(1CO.class, AdminIdMC.class);
        CharSequence charSequence = null;
        this.A0A = ((2yD) 1Bi.A05(1CO.class, (Class) null)).AZk(36313080908289606L);
        ENi eNi = this.A04;
        int i2 = this.A00;
        int ordinal = eNi.ordinal();
        if (ordinal == 0) {
            f = i2 / 2.0f;
        } else {
            if (ordinal != 1) {
                throw AnonymousClass002.A0C(eNi, "Unknown style: ", AnonymousClass001.A0k());
            }
            f = FHY.A00(i2 <= 40 ? EPF.A0X : i2 <= 72 ? EPF.A0W : EPF.A0V, fal.A01);
        }
        float f2 = this.A00;
        boolean z = this.A0A;
        this.A04.getClass();
        1Iw r0 = super.A04;
        if (z) {
            A00 = 5BG.A01(r0);
            A00.A0z(f2);
            A00.A0l(f2);
            CallerContext callerContext = this.A02;
            if (callerContext == null) {
                callerContext = A002.A00;
                if (callerContext == null) {
                    callerContext = CallerContext.A08;
                }
            }
            A00.A2b(callerContext);
            A00.A2Y((InterfaceC06154g3) null);
            C6nh A0R = 7zO.A0R(r0, 0);
            C26z c26z = C26z.ALL;
            A0R.A08(c26z, A002.A00(2MR.A16));
            A0R.A07(c26z, this.A04.mBorderWidth);
            A0R.A02(f);
            A00.A1h(A0R.A01());
            A00.A2a(5Bm.A00((Uri) null, this.A01));
            A00.A2Z(A00(A002, this.A04, r0, f));
        } else {
            A00 = C5bc.A00(r0);
            A00.A0z(f2);
            A00.A0l(f2);
            CallerContext callerContext2 = this.A02;
            if (callerContext2 == null) {
                callerContext2 = A002.A00;
                if (callerContext2 == null) {
                    callerContext2 = CallerContext.A08;
                }
            }
            A00.A2X(callerContext2);
            A00.A00.A03 = null;
            C6nh A0R2 = 7zO.A0R(r0, 0);
            C26z c26z2 = C26z.ALL;
            A0R2.A08(c26z2, A002.A00(2MR.A16));
            A0R2.A07(c26z2, this.A04.mBorderWidth);
            A0R2.A02(f);
            A00.A1h(A0R2.A01());
            A00.A00.A04 = A00(A002, this.A04, r0, f);
            A00.A2W(this.A01);
        }
        if (this.A06 != null) {
            5BH A01 = C1rg.A01(r0, "FDSProfilePhotoWithOverlay", 0);
            A01.A2e(A00);
            A00 = A01;
            A01.A2f(this.A06);
        }
        A00.A0F("android.widget.ImageView");
        CharSequence charSequence2 = this.A07;
        if (charSequence2 == null || !charSequence2.equals("FDS_PROFILE_PHOTO_AX_LABEL_FIX_ME")) {
            if (((2yD) 1Bi.A05(1CO.class, AdminIdMC.class)).AZk(72339309534315034L)) {
                CharSequence[] charSequenceArr = {this.A07, null, null};
                StringBuilder A0k = AnonymousClass001.A0k();
                int i3 = 0;
                do {
                    C2cd.A07(charSequenceArr[i3], A0k, true);
                    i3++;
                } while (i3 < 3);
                charSequence = A0k.toString();
            } else {
                charSequence = this.A07;
            }
        }
        A00.A2S(charSequence);
        A00.A2A(C26z.END, this.A09);
        DKE.A1Q(A00);
        return A00;
    }
}

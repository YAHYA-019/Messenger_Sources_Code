package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.Layout;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ocean.qrcodeencoder.QRCodeEncoder;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.google.common.collect.ImmutableList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.EnumMap;

/* loaded from: Dzl.class */
public final class Dzl extends C1rj {
    public static final FGJ A0A = new Object();
    public View.OnClickListener A00;
    public MigColorScheme A01;
    public CheckoutData A02;
    public ImmutableList A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public Dzl() {
        super("QRCodePaymentBottomSheetComponent");
    }

    public static final float A00(Canvas canvas, Layout.Alignment alignment, 1Iw r303, String str, float f, float f2, int i, int i2, boolean z) {
        2Kp r0 = new 2Kp();
        r0.A0G(str);
        r0.A08(i);
        r0.A09(i2);
        r0.A0A((int) (f - (2.0f * f2)));
        r0.A0E(alignment);
        r0.A04(1.0f);
        r0.A0H(true);
        if (z) {
            r0.A0D(2KQ.A02.A00(7zL.A0A(r303)));
        }
        Layout A00 = r0.A00();
        if (A00 == null) {
            return 0.0f;
        }
        canvas.save();
        canvas.translate(f2, 0.0f);
        A00.draw(canvas);
        canvas.restore();
        canvas.translate(0.0f, A00.getHeight());
        return A00.getHeight();
    }

    public static final Bitmap A01(String str, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        11T.A0A(createBitmap);
        Qon qon = Qon.A03;
        QRCodeEncoder qRCodeEncoder = QRCodeEncoder.$redex_init_class;
        EnumMap enumMap = new EnumMap(Qon.class);
        enumMap.put((EnumMap) Qon.A02, (Qon) 1);
        enumMap.put((EnumMap) qon, (Qon) 0);
        enumMap.put((EnumMap) Qon.A04, (Qon) AbG.A11());
        enumMap.put((EnumMap) Qon.A01, (Qon) 2);
        byte[] encodeTextToQRCodeWithErrorCorrectionCapacity = !enumMap.containsKey(qon) ? new byte[0] : QRCodeEncoder.encodeTextToQRCodeWithErrorCorrectionCapacity(str, i, 1, AnonymousClass001.A03(enumMap.get(qon)));
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return createBitmap;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 < i) {
                    int i6 = -1;
                    if (encodeTextToQRCodeWithErrorCorrectionCapacity[(i3 * i) + i5] == 0) {
                        i6 = -16777216;
                    }
                    createBitmap.setPixel(i3, i5, i6);
                    i4 = i5 + 1;
                }
            }
            i2 = i3 + 1;
        }
    }

    public static final void A0L(1Iw r301, String str, String str2, String str3, String str4) {
        if (str == null || str2 == null) {
            return;
        }
        Rgz A00 = ((ETT) 7zO.A0o(r301, 99111)).A00(str);
        Long l = null;
        Long A0n = str3 != null ? 1BK.A0n(str3) : null;
        if (str4 != null) {
            l = 1BK.A0n(str4);
        }
        A00.A0D(A0n, l, str2, "user_checkout_page_save_qr");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A01, this.A00, this.A04, this.A05, this.A06, this.A03, this.A07, this.A08, this.A09};
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        2cL r313;
        MigColorScheme migColorScheme = this.A01;
        String str = this.A07;
        String str2 = this.A08;
        7zS.A16(0, r302, migColorScheme, str);
        int size = View.MeasureSpec.getSize(i);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        2RH r0 = 2RH.A03;
        4YU.A1L(A01, r0);
        Bitmap A012 = A01(str, size / 3);
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A2a(new BitmapDrawable(4YU.A0E(r302), A012));
        7zN.A1B(A01, A00);
        if (str2 == null || str2.length() == 0) {
            r313 = null;
        } else {
            2cM A0j = 7zM.A0j(r302, 0);
            4YU.A1L(A0j, r0);
            4YU.A1N(A0j, r0);
            2KD A0X = 7zN.A0X(r302, migColorScheme, 0);
            A0X.A2n();
            A0X.A2d();
            A0X.A2X();
            A0X.A2z(str2);
            4YU.A1K(A0j, A0X);
            r313 = A0j.A00;
        }
        A01.A2e(r313);
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        7zO.A1I(A013, 2RH.A06);
        8TZ A002 = C8nr.A00(r302);
        7zN.A1D(A002, r302, Dzl.class, "QRCodePaymentBottomSheetComponent", 862389825);
        A002.A2a(migColorScheme);
        A002.A2b(r302.A0D(2131962843));
        2cL A0V = 7zL.A0V(A013, A002.A2W());
        11T.A0A(A0V);
        return 7zL.A0V(A01, A0V);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == 862389825) {
            1Iv r0 = r302.A00;
            1Is r02 = r0.A01;
            1Iw r03 = r0.A00;
            View view = ((3xC) obj).A00;
            Dzl dzl = (Dzl) r02;
            MigColorScheme migColorScheme = dzl.A01;
            CheckoutData checkoutData = dzl.A02;
            String str = dzl.A09;
            String str2 = dzl.A05;
            String str3 = dzl.A04;
            String str4 = dzl.A06;
            String str5 = dzl.A07;
            String str6 = dzl.A08;
            ImmutableList immutableList = dzl.A03;
            View.OnClickListener onClickListener = dzl.A00;
            boolean A1W = 1BL.A1W(r03, migColorScheme);
            7zR.A1Q(immutableList, onClickListener);
            Context context = r03.A0D;
            53T A00 = ((53S) 7zN.A0k(context, 49478)).A00(context);
            String[] strArr = 48U.A00;
            if (A00.BNK(strArr)) {
                FGJ.A02(onClickListener, view, r03, migColorScheme, checkoutData, immutableList, (Integer) null, (Integer) null, str5, str6, (String) null, (String) null, (String) null);
                A0L(r03, str, str2, str3, str4);
                return null;
            }
            C5iw c5iw = new C5iw();
            c5iw.A00 = Integer.valueOf(A1W ? 1 : 0);
            c5iw.A06 = A1W;
            A00.AHQ(new RequestPermissionsConfig(c5iw), new Frh(onClickListener, view, r03, migColorScheme, checkoutData, immutableList, str5, str6, str, str2, str3, str4), strArr);
            return null;
        }
        if (i != 1526528040) {
            return null;
        }
        1Iv r04 = r302.A00;
        1Is r05 = r04.A01;
        1Iw r06 = r04.A00;
        View view2 = ((3xC) obj).A00;
        Dzl dzl2 = (Dzl) r05;
        String str7 = dzl2.A09;
        String str8 = dzl2.A05;
        String str9 = dzl2.A04;
        String str10 = dzl2.A06;
        String str11 = dzl2.A07;
        View.OnClickListener onClickListener2 = dzl2.A00;
        7zP.A1L(r06, 0, onClickListener2);
        Bitmap A01 = A01(str11, 200);
        try {
            11I r07 = new 11I();
            Context A0A2 = 7zL.A0A(r06);
            11I.A05(A0A2, r07, C0zj.A03, "qr_code", ".png");
            C10y A08 = r07.A08();
            FileOutputStream fileOutputStream = new FileOutputStream(A08);
            A01.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            Intent A0A3 = 4YU.A0A("android.intent.action.SEND");
            AnonymousClass106.A01(A0A3, new Uri[]{C10n.A00(7zM.A0B(A0A2), A08, new 0Tw())}, false);
            A0A3.setType("image/*");
            0LS.A01(A0A2, Intent.createChooser(A0A3, r06.A0D(2131962845)));
        } catch (IOException unused) {
        }
        onClickListener2.onClick(view2);
        if (str7 == null || str8 == null) {
            return null;
        }
        Rgz A002 = ((ETT) 7zO.A0o(r06, 99111)).A00(str7);
        Long l = null;
        Long A0n = str9 != null ? 1BK.A0n(str9) : null;
        if (str10 != null) {
            l = 1BK.A0n(str10);
        }
        A002.A0D(A0n, l, str8, "user_checkout_page_share_qr");
        return null;
    }

    @Override // X.C1rj
    public void A1C(1Iw r302) {
        String str = this.A09;
        String str2 = this.A05;
        String str3 = this.A04;
        String str4 = this.A06;
        11T.A0F(r302, 0);
        if (str == null || str2 == null) {
            return;
        }
        Rgz A00 = ((ETT) 7zO.A0o(r302, 99111)).A00(str);
        Long l = null;
        Long A0n = str3 != null ? 1BK.A0n(str3) : null;
        if (str4 != null) {
            l = 1BK.A0n(str4);
        }
        A00.A0C(A0n, l, str2);
    }

    @Override // X.C1rj
    public boolean A1R() {
        return true;
    }
}

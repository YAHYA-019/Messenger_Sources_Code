package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;
import com.facebook.stickers.model.Sticker;
import com.mapbox.mapboxsdk.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.6qr, reason: invalid class name */
/* loaded from: 6qr.class */
public abstract class C6qr implements C6qq {
    public final 6wD A00;
    public final 82O A01;
    public final C6qn A02;

    public C6qr(int i) {
        C6qn c6qn = (C6qn) 1Bn.A0A(50174);
        this.A02 = c6qn;
        82O r0 = (82O) 1Bn.A0A(486);
        this.A01 = r0;
        6wC A00 = c6qn.A00(i);
        Context A01 = FbInjector.A01();
        FbInjector.A04(r0.B92().Aqm());
        1Bn.A0M(r0);
        try {
            6wD r02 = new 6wD(A00);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A00 = r02;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v168, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v179, types: [java.util.List] */
    @Override // X.C6qq
    public 1LI AJv(Drawable drawable, Uri uri, CallerContext callerContext, 1Iw r305, 1Im r306, 1Im r307, 1Im r308, 1Im r309, Sticker sticker, 96D r311, CharSequence charSequence, String str, int i, int i2, boolean z) {
        ArrayList arrayList;
        Uri uri2;
        11T.A0F(callerContext, 8);
        Context context = r305.A0D;
        11T.A0A(context);
        1BV r0 = new 1BV(context, 50201);
        C07004ik A00 = 5BI.A00(C06974ih.A0Q);
        A00.A06(drawable);
        A00.A00(InterfaceC07034in.A04);
        2Dp A002 = 2Dp.A00(uri);
        if (A002 != null && (uri2 = A002.A05) != null) {
            5BO A01 = 5Bm.A01(uri2, (java.util.Map) null);
            A00.A0J = true;
            arrayList = Collections.singletonList(A01);
            11T.A0A(arrayList);
        } else if (((7Qb) r0.get()).A05(sticker) && z) {
            2Dp[] A06 = ((7Qb) r0.get()).A06(sticker);
            11T.A0A(A06);
            arrayList = AnonymousClass001.A0s();
            for (2Dp r02 : A06) {
                11T.A0D(r02);
                11T.A0F(r02, 0);
                Uri uri3 = r02.A05;
                if (uri3 != null) {
                    arrayList.add(5Bm.A01(uri3, (java.util.Map) null));
                }
            }
            if (1BK.A1Y(arrayList)) {
                A00.A0J = true;
            }
            if (arrayList.isEmpty()) {
                0fH.A0k("StickerComponentSpec", "Fail to find animated image resources");
                2Dp[] A07 = ((7Qb) r0.get()).A07(sticker);
                11T.A0A(A07);
                arrayList = AnonymousClass001.A0s();
                for (2Dp r03 : A07) {
                    11T.A0D(r03);
                    11T.A0F(r03, 0);
                    Uri uri4 = r03.A05;
                    if (uri4 != null) {
                        arrayList.add(5Bm.A01(uri4, (java.util.Map) null));
                    }
                }
            }
        } else {
            2Dp[] A072 = ((7Qb) r0.get()).A07(sticker);
            11T.A0A(A072);
            arrayList = new ArrayList();
            for (2Dp r04 : A072) {
                11T.A0D(r04);
                11T.A0F(r04, 0);
                Uri uri5 = r04.A05;
                if (uri5 != null) {
                    arrayList.add(5Bm.A01(uri5, (java.util.Map) null));
                }
            }
        }
        if (arrayList.isEmpty()) {
            0fH.A0k("StickerComponentSpec", "Fail to find valid image resources");
            arrayList = 11T.A03(5Bb.A00);
        }
        5BH A012 = 5BG.A01(r305);
        A012.A2S(charSequence);
        5BO[] r05 = (5BO[]) arrayList.toArray(new 5BO[0]);
        5BO[] r06 = (5BO[]) Arrays.copyOf(r05, r05.length);
        11T.A0F(r06, 0);
        A012.A2a(new 5Bc(r06));
        A012.A2Z(new C06974ih(A00));
        A012.A2b(callerContext);
        A012.A2D(C26z.VERTICAL, R.dimen.mapbox_eight_dp);
        A012.A2D(C26z.HORIZONTAL, 2132279398);
        A012.A2T(r306);
        A012.A1q(r307);
        A012.A1s(r308);
        A012.A1n(r309);
        A012.A0J();
        5BG r07 = A012.A00;
        11T.A0A(r07);
        return r07;
    }

    @Override // X.C6qq
    public 6wB B4P(Sticker sticker, boolean z) {
        return this.A00;
    }
}

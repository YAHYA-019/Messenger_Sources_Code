package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import java.io.IOException;

/* renamed from: X.Jeg, reason: case insensitive filesystem */
/* loaded from: Jeg.class */
public final class C2954Jeg extends Ktu {
    public static Font A00(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, AnonymousClass001.A1N(i & 2) ? 1 : 0);
        Font font = fontFamily.getFont(0);
        FontStyle style = font.getStyle();
        int A05 = (GOn.A05(fontStyle.getWeight(), style.getWeight()) / 100) + (fontStyle.getSlant() == style.getSlant() ? 0 : 2);
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            FontStyle style2 = font2.getStyle();
            int A052 = (GOn.A05(fontStyle.getWeight(), style2.getWeight()) / 100) + (fontStyle.getSlant() == style2.getSlant() ? 0 : 2);
            if (A052 < A05) {
                font = font2;
                A05 = A052;
            }
        }
        return font;
    }

    @Override // X.Ktu
    public Typeface A01(Context context, Resources resources, LQB lqb, int i) {
        FontFamily.Builder builder;
        Typeface typeface = null;
        try {
            KlJ[] klJArr = lqb.A00;
            int length = klJArr.length;
            builder = null;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    break;
                }
                KlJ klJ = klJArr[i3];
                try {
                    Font build = new Font.Builder(resources, klJ.A00).setWeight(klJ.A02).setSlant(AnonymousClass001.A1N(klJ.A05 ? 1 : 0) ? 1 : 0).setTtcIndex(klJ.A01).setFontVariationSettings(klJ.A04).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i2 = i3 + 1;
            }
        } catch (Exception unused2) {
        }
        if (builder == null) {
            return null;
        }
        FontFamily build2 = builder.build();
        typeface = new Typeface.CustomFallbackBuilder(build2).setStyle(A00(build2, i).getStyle()).build();
        return typeface;
    }

    @Override // X.Ktu
    public Typeface A02(Context context, Resources resources, String str, int i, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        if (r309 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ce, code lost:
    
        r0 = r309.build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fa, code lost:
    
        r307 = new android.graphics.Typeface.CustomFallbackBuilder(r0).setStyle(A00(r0, r305).getStyle()).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0103, code lost:
    
        return r307;
     */
    @Override // X.Ktu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface A03(android.content.Context r302, android.os.CancellationSignal r303, X.Kkl[] r304, int r305) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2954Jeg.A03(android.content.Context, android.os.CancellationSignal, X.Kkl[], int):android.graphics.Typeface");
    }

    @Override // X.Ktu
    public Kkl A04(Kkl[] kklArr, int i) {
        throw AnonymousClass001.A0T("Do not use this function in API 29 or later.");
    }
}

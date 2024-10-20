package X;

import android.graphics.Bitmap;
import android.text.Html;
import android.text.Layout;
import android.text.TextUtils;
import com.google.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: K1Q.class */
public final class K1Q extends K0W {
    public static final Pattern A01 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    public final StringBuilder A00 = AnonymousClass001.A0k();

    public static long A00(Matcher matcher, int i) {
        long j = 60;
        return ((Long.parseLong(matcher.group(i + 1)) * j * j * 1000) + (Long.parseLong(matcher.group(i + 2)) * j * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.6aO, java.lang.Object] */
    @Override // X.K0W
    public /* bridge */ /* synthetic */ MKB A06(byte[] bArr, int i, boolean z) {
        int i2;
        ArrayList A0s = AnonymousClass001.A0s();
        KrS krS = new KrS();
        ?? obj = new Object();
        ((6aO) obj).A02 = bArr;
        ((6aO) obj).A00 = i;
        while (true) {
            Charset charset = Charsets.UTF_8;
            String A0I = obj.A0I(charset);
            if (A0I == null) {
                break;
            }
            if (A0I.length() != 0) {
                try {
                    Integer.parseInt(A0I);
                    String A0I2 = obj.A0I(charset);
                    if (A0I2 == null) {
                        C51f.A02("HeroPlayer2SubripDecoder", "Unexpected end", new Object[0]);
                        break;
                    }
                    Matcher matcher = A01.matcher(A0I2);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        krS.A01(A00(matcher, 1));
                        if (TextUtils.isEmpty(matcher.group(6))) {
                            z2 = false;
                        } else {
                            krS.A01(A00(matcher, 6));
                        }
                        StringBuilder sb = this.A00;
                        sb.setLength(0);
                        while (true) {
                            String A0I3 = obj.A0I(charset);
                            if (TextUtils.isEmpty(A0I3)) {
                                break;
                            }
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            sb.append(A0I3.trim());
                        }
                        String obj2 = sb.toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        int i3 = (-1) << (-1);
                        A0s.add(new 6YL((Bitmap) null, (Layout.Alignment) null, (Layout.Alignment) null, Html.fromHtml(obj2), -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, 0.0f, i3, i3, i3, i3, -16777216, i3, false));
                        if (z2) {
                            A0s.add(null);
                        }
                    } else {
                        C51f.A02("HeroPlayer2SubripDecoder", 0Pz.A0W("Skipping invalid timing: ", A0I2), new Object[0]);
                    }
                } catch (NumberFormatException unused) {
                    C51f.A02("HeroPlayer2SubripDecoder", 0Pz.A0W("Skipping invalid index: ", A0I), new Object[0]);
                }
            }
        }
        int size = A0s.size();
        6YL[] r0 = new 6YL[size];
        A0s.toArray(r0);
        long[] copyOf = Arrays.copyOf(krS.A01, krS.A00);
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (int i4 = 0; i4 < size; i4++) {
            A0s2.add(new S6G(r0[i4], copyOf[i4]));
        }
        Collections.sort(A0s2);
        for (i2 = 0; i2 < size; i2++) {
            S6G s6g = (S6G) A0s2.get(i2);
            r0[i2] = s6g.A01;
            copyOf[i2] = s6g.A00;
        }
        return new S4y(copyOf, r0);
    }
}

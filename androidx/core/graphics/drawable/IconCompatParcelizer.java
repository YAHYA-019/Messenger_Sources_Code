package androidx.core.graphics.drawable;

import X.4YT;
import X.AnonymousClass001;
import X.C3086Jio;
import X.L5P;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: IconCompatParcelizer.class */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(L5P l5p) {
        Object obj;
        IconCompat iconCompat = new IconCompat();
        iconCompat.A02 = l5p.A01(iconCompat.A02, 1);
        byte[] bArr = iconCompat.A09;
        if (l5p.A09(2)) {
            Parcel parcel = ((C3086Jio) l5p).A05;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                bArr = new byte[readInt];
                parcel.readByteArray(bArr);
            }
        }
        iconCompat.A09 = bArr;
        iconCompat.A05 = l5p.A02(iconCompat.A05, 3);
        iconCompat.A00 = l5p.A01(iconCompat.A00, 4);
        iconCompat.A01 = l5p.A01(iconCompat.A01, 5);
        iconCompat.A03 = (ColorStateList) l5p.A02(iconCompat.A03, 6);
        String str = iconCompat.A08;
        if (l5p.A09(7)) {
            str = ((C3086Jio) l5p).A05.readString();
        }
        iconCompat.A08 = str;
        String str2 = iconCompat.A07;
        if (l5p.A09(8)) {
            str2 = ((C3086Jio) l5p).A05.readString();
        }
        iconCompat.A07 = str2;
        iconCompat.A04 = PorterDuff.Mode.valueOf(iconCompat.A08);
        switch (iconCompat.A02) {
            case -1:
                obj = iconCompat.A05;
                if (obj == null) {
                    throw AnonymousClass001.A0L(4YT.A00(649));
                }
                break;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                obj = iconCompat.A05;
                if (obj == null) {
                    byte[] bArr2 = iconCompat.A09;
                    iconCompat.A06 = bArr2;
                    iconCompat.A02 = 3;
                    iconCompat.A00 = 0;
                    iconCompat.A01 = bArr2.length;
                    return iconCompat;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.A09, Charset.forName("UTF-16"));
                iconCompat.A06 = str3;
                if (iconCompat.A02 == 2 && iconCompat.A07 == null) {
                    iconCompat.A07 = str3.split(":", -1)[0];
                    return iconCompat;
                }
                return iconCompat;
            case 3:
                obj = iconCompat.A09;
                break;
        }
        iconCompat.A06 = obj;
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, L5P l5p) {
        byte[] bArr;
        String str;
        iconCompat.A08 = iconCompat.A04.name();
        switch (iconCompat.A02) {
            case -1:
            case 1:
            case 5:
                iconCompat.A05 = (Parcelable) iconCompat.A06;
                break;
            case 2:
                str = (String) iconCompat.A06;
                bArr = str.getBytes(Charset.forName("UTF-16"));
                iconCompat.A09 = bArr;
                break;
            case 3:
                bArr = (byte[]) iconCompat.A06;
                iconCompat.A09 = bArr;
                break;
            case 4:
            case 6:
                str = iconCompat.A06.toString();
                bArr = str.getBytes(Charset.forName("UTF-16"));
                iconCompat.A09 = bArr;
                break;
        }
        int i = iconCompat.A02;
        if (-1 != i) {
            l5p.A06(i, 1);
        }
        byte[] bArr2 = iconCompat.A09;
        if (bArr2 != null) {
            l5p.A05(2);
            Parcel parcel = ((C3086Jio) l5p).A05;
            parcel.writeInt(bArr2.length);
            parcel.writeByteArray(bArr2);
        }
        Parcelable parcelable = iconCompat.A05;
        if (parcelable != null) {
            l5p.A07(parcelable, 3);
        }
        int i2 = iconCompat.A00;
        if (i2 != 0) {
            l5p.A06(i2, 4);
        }
        int i3 = iconCompat.A01;
        if (i3 != 0) {
            l5p.A06(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.A03;
        if (colorStateList != null) {
            l5p.A07(colorStateList, 6);
        }
        String str2 = iconCompat.A08;
        if (str2 != null) {
            l5p.A05(7);
            ((C3086Jio) l5p).A05.writeString(str2);
        }
        String str3 = iconCompat.A07;
        if (str3 != null) {
            l5p.A05(8);
            ((C3086Jio) l5p).A05.writeString(str3);
        }
    }
}

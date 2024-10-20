package com.facebook.messaging.montage.composer.crop;

import X.0S2;
import X.1Br;
import X.1iF;
import X.2Ov;
import X.AbF;
import X.AbG;
import X.AnonymousClass001;
import X.C5ic;
import X.DR6;
import X.IGS;
import X.RFp;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;

/* loaded from: AspectRatioOptionsDialog.class */
public final class AspectRatioOptionsDialog extends 2Ov {
    public RFp A00;
    public final 1Br A01 = AbG.A0a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    public Dialog A0n(Bundle bundle) {
        String str;
        int i;
        String str2;
        int i2;
        Context context = getContext();
        if (context == null) {
            return super.A0n(bundle);
        }
        DR6 A02 = ((C5ic) 1Br.A0B(this.A01)).A02(context);
        int i3 = requireArguments().getInt(Property.ICON_TEXT_FIT_WIDTH);
        int i4 = requireArguments().getInt(Property.ICON_TEXT_FIT_HEIGHT);
        int length = 0S2.A00(5).length;
        String[] strArr = new String[length];
        int i5 = 0;
        if (i4 >= i3) {
            while (i5 < length) {
                if (i5 == 0) {
                    i2 = 2131952909;
                } else if (i5 == 1) {
                    i2 = 2131952913;
                } else if (i5 == 2) {
                    i2 = 2131952912;
                } else if (i5 == 3) {
                    i2 = 2131952911;
                } else if (i5 == 4) {
                    i2 = 2131952910;
                } else {
                    str2 = "";
                    strArr[i5] = str2;
                    i5++;
                }
                str2 = context.getString(i2);
                strArr[i5] = str2;
                i5++;
            }
        } else {
            while (i5 < length) {
                if (i5 == 0) {
                    i = 2131952909;
                } else if (i5 == 1) {
                    i = 2131952913;
                } else if (i5 == 2) {
                    i = 2131952908;
                } else if (i5 == 3) {
                    i = 2131952906;
                } else if (i5 == 4) {
                    i = 2131952907;
                } else {
                    str = "";
                    strArr[i5] = str;
                    i5++;
                }
                str = context.getString(i);
                strArr[i5] = str;
                i5++;
            }
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (String str3 : strArr) {
            if (str3 != null && str3.length() != 0) {
                A0s.add(str3);
            }
        }
        A02.A01(IGS.A00(this, 12), (CharSequence[]) A0s.toArray(new String[0]));
        A02.A0C((DialogInterface.OnClickListener) new Object(), 2131952914);
        return A02.A04();
    }

    public 1iF A17() {
        return AbF.A0C(366696498039554L);
    }
}

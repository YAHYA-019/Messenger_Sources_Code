package com.facebook.quicksilver.common.sharing;

import X.FKW;
import android.os.Parcelable;

/* loaded from: GameEntityShareExtras.class */
public final class GameEntityShareExtras extends GameShareExtras {
    public static final Parcelable.Creator CREATOR = new FKW(77);
    public String A00;
    public String A01;
    public String A02;

    public GameEntityShareExtras(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str3, str4, str7, str);
        this.A02 = str6;
        this.A01 = str5;
        this.A00 = str2;
    }
}

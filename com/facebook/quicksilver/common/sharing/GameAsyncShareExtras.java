package com.facebook.quicksilver.common.sharing;

import X.FKW;
import android.os.Parcelable;
import java.io.File;

/* loaded from: GameAsyncShareExtras.class */
public final class GameAsyncShareExtras extends GameShareExtras {
    public static final Parcelable.Creator CREATOR = new FKW(76);
    public File A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public GameAsyncShareExtras(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(str2, str3, str7, str);
        this.A05 = str8;
        this.A02 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A01 = null;
        this.A00 = null;
    }
}

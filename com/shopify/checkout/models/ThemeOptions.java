package com.shopify.checkout.models;

import X.C00t;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ThemeOptions.class */
public final class ThemeOptions {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ThemeOptions[] A01;
    public static final ThemeOptions A02;
    public static final ThemeOptions A03;

    static {
        ThemeOptions themeOptions = new ThemeOptions("LIGHT", 0);
        A03 = themeOptions;
        ThemeOptions themeOptions2 = new ThemeOptions("DARK", 1);
        A02 = themeOptions2;
        ThemeOptions[] themeOptionsArr = {themeOptions, themeOptions2, new ThemeOptions("WEB_DEFAULT", 2)};
        A01 = themeOptionsArr;
        A00 = C00t.A00(themeOptionsArr);
    }

    public ThemeOptions(String str, int i) {
    }

    public static ThemeOptions valueOf(String str) {
        return (ThemeOptions) Enum.valueOf(ThemeOptions.class, str);
    }

    public static ThemeOptions[] values() {
        return (ThemeOptions[]) A01.clone();
    }
}

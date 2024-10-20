package X;

import java.util.LinkedHashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KO7.class */
public final class KO7 {
    public static final java.util.Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ KO7[] A02;
    public static final KO7 A03;
    public static final KO7 A04;
    public static final KO7 A05;
    public static final KO7 A06;
    public static final KO7 A07;
    public static final KO7 A08;
    public static final KO7 A09;
    public static final KO7 A0A;
    public final String rawText;

    static {
        KO7 ko7 = new KO7("SUBTOTAL", 0, "SUBTOTAL");
        A08 = ko7;
        KO7 ko72 = new KO7("TAX", 1, "ESTIMATED_TAX");
        A09 = ko72;
        KO7 ko73 = new KO7("SHIPPING", 2, "SHIPPING");
        A07 = ko73;
        KO7 ko74 = new KO7("DISCOUNT", 3, "OFFER");
        A03 = ko74;
        KO7 ko75 = new KO7("PRE_TAX_DISCOUNT", 4, "PRE_TAX_DISCOUNT");
        A06 = ko75;
        KO7 ko76 = new KO7("FEE", 5, "FEE");
        A04 = ko76;
        KO7 ko77 = new KO7("TOTAL", 6, "TOTAL");
        A0A = ko77;
        KO7 ko78 = new KO7("FULFILLMENT", 7, "FULFILLMENT");
        A05 = ko78;
        KO7[] ko7Arr = {ko7, ko72, ko73, ko74, ko75, ko76, ko77, ko78};
        A02 = ko7Arr;
        A01 = C00t.A00(ko7Arr);
        KO7[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbL.A00(values.length));
        for (KO7 ko79 : values) {
            linkedHashMap.put(ko79.rawText, ko79);
        }
        A00 = linkedHashMap;
    }

    public KO7(String str, int i, String str2) {
        this.rawText = str2;
    }

    public static KO7 valueOf(String str) {
        return (KO7) Enum.valueOf(KO7.class, str);
    }

    public static KO7[] values() {
        return (KO7[]) A02.clone();
    }
}

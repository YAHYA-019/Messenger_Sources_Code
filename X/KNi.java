package X;

import java.util.LinkedHashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNi.class */
public final class KNi {
    public static final java.util.Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ KNi[] A02;
    public static final KNi A03;
    public static final KNi A04;
    public final String env;

    static {
        KNi kNi = new KNi("TEST", 0, "TEST");
        A04 = kNi;
        KNi kNi2 = new KNi("LIVE", 1, "LIVE");
        A03 = kNi2;
        KNi[] kNiArr = {kNi, kNi2};
        A02 = kNiArr;
        A01 = C00t.A00(kNiArr);
        KNi[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbL.A00(values.length));
        for (KNi kNi3 : values) {
            linkedHashMap.put(kNi3.env, kNi3);
        }
        A00 = linkedHashMap;
    }

    public KNi(String str, int i, String str2) {
        this.env = str2;
    }

    public static KNi valueOf(String str) {
        return (KNi) Enum.valueOf(KNi.class, str);
    }

    public static KNi[] values() {
        return (KNi[]) A02.clone();
    }
}

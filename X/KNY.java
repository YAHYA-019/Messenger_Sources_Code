package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: KNY.class */
public final class KNY {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ KNY[] A01;
    public static final KNY A02;
    public static final KNY A03;
    public final String value;

    static {
        KNY kny = new KNY("EncryptNewData", 0, "encrypt");
        A03 = kny;
        KNY kny2 = new KNY("DecryptExistingData", 1, "decrypt");
        A02 = kny2;
        KNY[] knyArr = {kny, kny2};
        A01 = knyArr;
        A00 = C00t.A00(knyArr);
    }

    public KNY(String str, int i, String str2) {
        this.value = str2;
    }

    public static KNY valueOf(String str) {
        return (KNY) Enum.valueOf(KNY.class, str);
    }

    public static KNY[] values() {
        return (KNY[]) A01.clone();
    }
}

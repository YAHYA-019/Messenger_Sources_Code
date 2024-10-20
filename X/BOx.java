package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BOx.class */
public final class BOx implements C4zn {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BOx[] A01;
    public static final BOx A02;
    public static final BOx A03;
    public static final BOx A04;
    public final String _loggingName;

    static {
        BOx bOx = new BOx("FINISHED", 0, "finished");
        A04 = bOx;
        BOx bOx2 = new BOx("CANCELED", 1, "canceled");
        A02 = bOx2;
        BOx bOx3 = new BOx("FAILED", 2, "failed");
        A03 = bOx3;
        BOx[] bOxArr = {bOx, bOx2, bOx3};
        A01 = bOxArr;
        A00 = C00t.A00(bOxArr);
    }

    public BOx(String str, int i, String str2) {
        this._loggingName = str2;
    }

    public static BOx valueOf(String str) {
        return (BOx) Enum.valueOf(BOx.class, str);
    }

    public static BOx[] values() {
        return (BOx[]) A01.clone();
    }

    @Override // X.C4zn
    public String Aus() {
        return this._loggingName;
    }
}

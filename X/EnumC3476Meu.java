package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Meu, reason: case insensitive filesystem */
/* loaded from: Meu.class */
public final class EnumC3476Meu {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC3476Meu[] A01;
    public static final EnumC3476Meu A02;
    public static final EnumC3476Meu A03;

    static {
        EnumC3476Meu enumC3476Meu = new EnumC3476Meu("RMS", 0);
        A02 = enumC3476Meu;
        EnumC3476Meu enumC3476Meu2 = new EnumC3476Meu(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 1);
        A03 = enumC3476Meu2;
        EnumC3476Meu[] enumC3476MeuArr = {enumC3476Meu, enumC3476Meu2};
        A01 = enumC3476MeuArr;
        A00 = C00t.A00(enumC3476MeuArr);
    }

    public EnumC3476Meu(String str, int i) {
    }

    public static EnumC3476Meu valueOf(String str) {
        return (EnumC3476Meu) Enum.valueOf(EnumC3476Meu.class, str);
    }

    public static EnumC3476Meu[] values() {
        return (EnumC3476Meu[]) A01.clone();
    }
}

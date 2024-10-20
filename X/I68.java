package X;

/* loaded from: I68.class */
public abstract class I68 {
    public static void A00(0DA r301, Integer num, int i, long j) {
        r301.A06("sticker_template_id", Long.valueOf(j));
        r301.A07("sticker_type", num.intValue() != 0 ? "static" : "animated_sticker");
        Long valueOf = Long.valueOf(i);
        r301.A06("sticker_rank", valueOf);
        r301.A06("sticker_page_index", valueOf);
        r301.A06("page_number", 0L);
        r301.A06("total_pages", 1L);
    }

    public static void A01(0DA r301, Integer num, Long l, String str) {
        r301.A06(str, l);
        r301.A07("sticker_type", num.intValue() != 0 ? "static" : "animated_sticker");
    }

    public static void A02(0DA r301, Integer num, boolean z, boolean z2, boolean z3) {
        r301.A07("sticker_type", num.intValue() != 0 ? "static" : "animated_sticker");
        r301.A03("is_avatar_sticker", Boolean.valueOf(z));
        r301.A03("is_social_sticker", Boolean.valueOf(z2));
        r301.A03("is_instant_avatar_sticker", Boolean.valueOf(z3));
    }
}

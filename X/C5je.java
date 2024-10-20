package X;

import com.facebook.stickers.model.Sticker;

/* renamed from: X.5je, reason: invalid class name */
/* loaded from: 5je.class */
public final class C5je {
    public 7Fe A00;
    public C5jg A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.9hQ, boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.9hQ, float] */
    /* JADX WARN: Type inference failed for: r0v29, types: [float, X.66i] */
    /* JADX WARN: Type inference failed for: r0v30, types: [double, X.66i] */
    /* JADX WARN: Type inference failed for: r0v33, types: [double, X.66i] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.9hQ, double, X.66i] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.9hQ, double, X.66i] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, boolean] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52, types: [X.5jf] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, X.7s2] */
    /* JADX WARN: Type inference failed for: r0v58, types: [X.5jd, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v59, types: [X.5fu, X.5je] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.String, X.7s2] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, java.lang.String, X.7s2] */
    /* JADX WARN: Type inference failed for: r0v84, types: [com.google.common.collect.ImmutableList, X.4k2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    public final boolean A00(String str, boolean z) {
        C5jg c5jg;
        String str2;
        C5jd c5jd;
        ELg eLg;
        ELg eLg2;
        String str3;
        ?? r0;
        7sX r02;
        synchronized (this) {
            c5jg = this.A01;
        }
        if (c5jg == null) {
            return false;
        }
        C5jd c5jd2 = c5jg.A00;
        if (str == null) {
            str2 = "DEFAULT_HOT_LIKE_EMOJI_STRING";
            c5jd = "DEFAULT_HOT_LIKE_EMOJI_STRING";
        } else {
            str2 = str;
            c5jd = c5jd2;
        }
        ?? containsKey = c5jd.A05.containsKey(str2);
        if (containsKey == 0) {
            return false;
        }
        Object obj = containsKey.get(str2);
        if (obj == null) {
            throw 1BK.A0e();
        }
        5vL r03 = (5vL) obj;
        if (z) {
            7sX r04 = r03.A01;
            r04.A00();
            r04.remove(str2);
            ?? reverse = 0DW.A00(r04.values()).reverse();
            reverse.A05(reverse);
            r02 = reverse;
        } else {
            7sX r05 = r03.A01.A00;
            r02 = r05;
            if (r05 != null) {
                ?? r06 = ((9hQ) r05).A01;
                5wG r306 = 0.37f <= 0.37f ? 5wG.A04 : 0.65f <= 0.65f ? 5wG.A03 : 5wG.A02;
                9hQ r07 = null;
                ?? r08 = (double) ((9hQ) ((float) r07.A05.A09.A00)).A06;
                r08.A06(r08);
                ?? r09 = r306.sizeVelocityIncrease;
                r09.A08(r09);
                ?? r010 = r306.sizeEndValue;
                r010.A07(r010);
                C66i c66i = ((9hQ) r010).A04;
                ?? r011 = r306.rotationVelocity;
                r011.A08(r011);
                ((9hQ) r011).A01 = false;
                r011.A02();
                r306.ordinal();
                if (0 == 0) {
                    eLg = ELg.A05;
                    eLg2 = eLg;
                } else if (1 != 1) {
                    eLg = ELg.A02;
                    eLg2 = eLg;
                } else {
                    eLg = ELg.A03;
                    eLg2 = eLg;
                }
                7sX r012 = ((7sX) eLg).A01;
                7sX r013 = r012;
                if (r012 != null) {
                    String str4 = r306.stickerId;
                    ?? r014 = 2;
                    11T.A0F((Object) 2, 2);
                    if (str == null) {
                        str3 = "DEFAULT_HOT_LIKE_EMOJI_STRING";
                        r014 = "DEFAULT_HOT_LIKE_EMOJI_STRING";
                    } else {
                        str3 = str;
                    }
                    if (((C5fu) r014.A00.A05.remove(str3)) == null) {
                        0fH.A0o("No reference to local hotlike to send", "No reference to local hotlike to send");
                        r013 = "No reference to local hotlike to send";
                    } else {
                        if (str == null) {
                            ?? obj2 = new Object();
                            obj2.A03 = obj2;
                            r0 = obj2;
                        } else {
                            ?? obj3 = new Object();
                            obj3.A02 = str;
                            r0 = obj3;
                        }
                        r0.remove(str3);
                        final ?? r015 = r0.A04.A0B;
                        r015.A04 = r015;
                        r015.A01 = eLg2;
                        6Sh r016 = new 6Sh(r015) { // from class: X.7Ac
                            public final Sticker A00;
                            public final ELg A01;
                            public final String A02;
                            public final String A03;
                            public final String A04;
                            public final String A05;
                            public final String A06;

                            {
                                this.A01 = r015.A01;
                                String str5 = r015.A02;
                                this.A02 = str5;
                                String str6 = r015.A03;
                                this.A03 = str6;
                                this.A05 = r015.A05;
                                this.A04 = r015.A04;
                                this.A00 = r015.A00;
                                if (str5 == null && str6 == null) {
                                    throw AnonymousClass001.A0N("HotLike must correspond to either a sticker or an emoji.");
                                }
                                this.A06 = "HotLikeSendEvent";
                            }

                            public /* synthetic */ boolean B6s() {
                                return false;
                            }

                            public /* synthetic */ boolean B7e() {
                                return false;
                            }

                            public String BGe() {
                                return this.A06;
                            }
                        };
                        synchronized (r016) {
                            7sX r017 = r016.A00;
                            r013 = r017;
                            if (r017 != null) {
                                7sX r018 = (6RU) ((7Fe) r017).A00.get();
                                r013 = r018;
                                if (r018 != null) {
                                    7FI.A02(r018, r018);
                                    r013 = r018;
                                }
                            }
                        }
                    }
                }
                r013.A02 = false;
                r02 = r013;
            }
        }
        Object value = r02.A06.getValue();
        11T.A0A(value);
        ((LVe) value).A03();
        return true;
    }
}

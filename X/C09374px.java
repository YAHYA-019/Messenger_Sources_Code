package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.ArrayList;

/* renamed from: X.4px, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4px.class */
public final class C09374px {
    public static final 1G9 A02;
    public static final 1G9 A03;
    public final 1Br A01 = 1Bq.A00(33013);
    public final 1Br A00 = 1Bq.A00(99390);

    static {
        1G9 r0 = 1G0.A0B;
        A03 = r0.A0F("story_video_prefix/");
        A02 = r0.A0F("story_image_prefix/");
    }

    public static final ArrayList A00(C09374px c09374px, 1G9 r302) {
        long now = ((C0dp) c09374px.A00.A00.get()).now();
        ArrayList arrayList = new ArrayList();
        C00i c00i = c09374px.A01.A00;
        for (1G2 r0 : ((FbSharedPreferences) c00i.get()).Asu(r302)) {
            FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) c00i.get();
            long j = -1;
            long Av1 = fbSharedPreferences.Av1(r0, j);
            if (Av1 != j && Av1 < now) {
                String A09 = r0.A09(r302);
                11T.A0A(A09);
                arrayList.add(A09);
            }
        }
        return arrayList;
    }

    public final void A01(String str, long j) {
        11T.A0F(str, 0);
        1Ql edit = ((FbSharedPreferences) this.A01.A00.get()).edit();
        edit.CaH(A02.A0F(str), j);
        edit.commit();
    }

    public final void A02(String str, long j) {
        11T.A0F(str, 0);
        1Ql edit = ((FbSharedPreferences) this.A01.A00.get()).edit();
        edit.CaH(A03.A0F(str), j);
        edit.commit();
    }
}

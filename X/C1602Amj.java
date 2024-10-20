package X;

import java.util.List;

/* renamed from: X.Amj, reason: case insensitive filesystem */
/* loaded from: Amj.class */
public final class C1602Amj extends I5C {
    public static final 2T9 A04 = new B4c(3);
    public String A00;
    public 1BY A01;
    public final C00i A02 = 7zN.A0D(17054);
    public final 1K9 A03;

    public C1602Amj(1BO r302, 1K9 r303, String str) {
        this.A01 = 7zL.A0Q(r302);
        this.A03 = r303;
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object A02(Object[] objArr) {
        List[] listArr = (List[]) objArr;
        String str = this.A00;
        String[] strArr = str != null ? new String[]{str} : null;
        List list = listArr[0];
        2T9 r0 = A04;
        if (strArr == null) {
            strArr = new String[0];
        }
        return 2eI.A00(r0, (2eI) this.A02.get(), "{\"ctr_multiply_values\" : {\"base_values\" : {\"!montage_viewer_reaction && !montage_viewer_poll\" : {\"viewed\" : \"messenger_montage_seen_sheet+1\"},\"montage_viewer_reaction\" : {\"viewed\" : \"messenger_montage_seen_sheet+50\"},\"montage_viewer_poll\" : {\"viewed\" : \"messenger_montage_seen_sheet+100\"}}},\"ctr_value_features\" : {\"messenger_montage_seen_sheet\" : \"messenger_montage_seen_sheet\", \"montage_viewer_poll\" : \"montage_viewer_poll\", \"montage_viewer_reaction\" : \"montage_viewer_reaction\"}}", list, strArr, false).A00;
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        this.A03.onSuccess(obj);
    }
}

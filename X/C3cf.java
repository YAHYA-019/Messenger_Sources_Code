package X;

/* renamed from: X.3cf, reason: invalid class name */
/* loaded from: 3cf.class */
public final class C3cf implements 2vK {
    public final int A00;
    public final Object A01;

    public C3cf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bpz(2vI r302) {
        String str;
        String str2;
        int i = this.A00;
        boolean A08 = r302.A08();
        if (i != 0) {
            str = "i18n_VoltronFbtLanguagePackSideLoader";
            str2 = (A08 && r302.A04() != null && ((C3O1) r302.A04()).A00 == 1) ? "voltron sideload success" : "voltron sideload failed";
        } else {
            str = "i18n_VoltronFbtLanguagePackClient";
            str2 = (A08 && r302.A04() != null && ((2vM) r302.A04()).A04) ? "downloadModule success" : "downloadModule failed";
        }
        0fH.A0k(str, str2);
    }
}

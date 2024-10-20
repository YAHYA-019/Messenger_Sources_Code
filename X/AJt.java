package X;

/* loaded from: AJt.class */
public final class AJt extends 0DO implements 0Be {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJt(int i, 0DR r303) {
        super(4, r303);
        this.A03 = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AJt aJt = new AJt(this.A03 != 0 ? 1 : 0, (0DR) obj4);
        aJt.A00 = obj;
        aJt.A01 = obj2;
        aJt.A02 = obj3;
        return aJt.invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        0Dt.A00(obj);
        if (i == 0) {
            return new 0Oa(this.A00, this.A01, this.A02);
        }
        Object obj2 = this.A00;
        Object obj3 = this.A01;
        Object obj4 = this.A02;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("settingViewStatus: status=");
        A0k.append(obj2);
        A0k.append(", state=");
        A0k.append(obj3);
        0fH.A0j("EncryptedBackupsSettingFragmentViewData", AnonymousClass001.A0Z(obj4, GOm.A00(13), A0k));
        return obj2;
    }
}

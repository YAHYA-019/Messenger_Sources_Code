package X;

import java.util.List;

/* renamed from: X.087, reason: invalid class name */
/* loaded from: 087.class */
public final class AnonymousClass087 extends AnonymousClass088 {
    public final /* synthetic */ 06D A00;
    public final /* synthetic */ C07q A01;
    public final /* synthetic */ String A02;

    public AnonymousClass087(06D r302, C07q c07q, String str) {
        this.A00 = r302;
        this.A02 = str;
        this.A01 = c07q;
    }

    @Override // X.AnonymousClass088
    public void A00() {
        this.A00.A04(this.A02);
    }

    @Override // X.AnonymousClass088
    public void A01(AbstractC3503Mfy abstractC3503Mfy, Object obj) {
        06D r0 = this.A00;
        java.util.Map map = r0.A02;
        String str = this.A02;
        Object obj2 = map.get(str);
        C07q c07q = this.A01;
        if (obj2 == null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            A0k.append(c07q);
            A0k.append(" and input ");
            A0k.append(obj);
            throw AnonymousClass002.A0F(". You must ensure the ActivityResultLauncher is registered before calling launch().", A0k);
        }
        int intValue = ((Number) obj2).intValue();
        List list = r0.A01;
        list.add(str);
        try {
            r0.A03(c07q, (AbstractC3503Mfy) null, obj, intValue);
        } catch (Exception e) {
            list.remove(str);
            throw e;
        }
    }
}

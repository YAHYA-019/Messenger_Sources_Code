package X;

/* loaded from: A4l.class */
public final class A4l implements AYh {
    public final /* synthetic */ AnonymousClass749 A00;
    public final /* synthetic */ AZh A01;
    public final /* synthetic */ String A02;

    public A4l(AnonymousClass749 anonymousClass749, AZh aZh, String str) {
        this.A00 = anonymousClass749;
        this.A01 = aZh;
        this.A02 = str;
    }

    @Override // X.AYh
    public final void BkS(8O0 r302, String str, boolean z) {
        if (r302 == null) {
            if (!z) {
                this.A00.A07.remove(str);
            }
            this.A01.CNK(this.A02);
        } else {
            AnonymousClass749 anonymousClass749 = this.A00;
            anonymousClass749.A07.put(str, r302);
            anonymousClass749.A00(this.A01, this.A02);
        }
    }
}

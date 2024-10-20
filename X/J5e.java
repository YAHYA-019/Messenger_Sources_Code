package X;

import java.util.function.Consumer;

/* loaded from: J5e.class */
public final /* synthetic */ class J5e implements Consumer {
    public final /* synthetic */ C08664ng A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ J5e(C08664ng c08664ng, String str) {
        this.A00 = c08664ng;
        this.A01 = str;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.A00.A02(HCb.A04, this.A01, "sticker", (String) obj);
    }
}

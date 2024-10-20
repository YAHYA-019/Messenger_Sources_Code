package X;

import com.facebook.xapp.messaging.threadpre.events.events.common.messagelist.MediaMessageOnRendered;

/* renamed from: X.776, reason: invalid class name */
/* loaded from: 776.class */
public final class AnonymousClass776 extends C00q implements 0Be {
    public final /* synthetic */ boolean $photoLoadedReportEnabled;
    public final /* synthetic */ C6qu $this_photoMessageFeature;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass776(C6qu c6qu, boolean z) {
        super(4);
        this.$photoLoadedReportEnabled = z;
        this.$this_photoMessageFeature = c6qu;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        String str2 = (String) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        String str3 = (String) obj4;
        11T.A0F(str, 0);
        if (this.$photoLoadedReportEnabled) {
            2dU.A01((6Bw) null, new MediaMessageOnRendered(this.$this_photoMessageFeature.A00.BF7().A0u().hashCode(), str));
        }
        7GN.A01(this.$this_photoMessageFeature.A00.AbO(), str2, "image", str3, booleanValue);
        return 04S.A00;
    }
}

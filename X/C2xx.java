package X;

import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import kotlin.jvm.functions.Function1;

/* renamed from: X.2xx, reason: invalid class name */
/* loaded from: 2xx.class */
public final class C2xx extends C00q implements Function1 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xx(Object obj, Object obj2, Object obj3, int i, int i2, int i3, long j) {
        super(1);
        this.A00 = i3;
        this.A06 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A03 = j;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 == 0) {
            2R2 r0 = (2R2) obj;
            11T.A0F(r0, 0);
            HighlightsFeedContent highlightsFeedContent = (HighlightsFeedContent) this.A04;
            2R0.A05(r0, (HighlightsAttachmentContent) 0QD.A0E(highlightsFeedContent.A0g), highlightsFeedContent);
            2R0.A06(r0, highlightsFeedContent, (8Ke) this.A05, this.A02, this.A01, this.A03);
            2R0.A03(r0, (C98S) null, (3Ec) null, highlightsFeedContent, (String) null);
            return r0;
        }
        2R2 r02 = (2R2) obj;
        11T.A0F(r02, 0);
        8Ke r03 = (8Ke) this.A05;
        boolean z = false;
        if (((C9ci) this.A04).A01 == 96A.A02) {
            z = true;
        }
        int i = r03.A06;
        if (!z) {
            i--;
        }
        2R0.A07(r02, (Integer) null, r03.A00(), r03.A00, i, z);
        int i2 = r03.A02;
        0DA r04 = new 0DA();
        r04.A00.put("extra_ids", 02J.A01(new 03Y("unread_stories_count", String.valueOf(i2))));
        r02.A0A(r04, "action_info");
        2R0.A06(r02, (HighlightsFeedContent) null, r03, this.A02, this.A01, this.A03);
        return r02;
    }
}

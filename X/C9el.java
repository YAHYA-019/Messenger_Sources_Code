package X;

import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.9el, reason: invalid class name */
/* loaded from: 9el.class */
public abstract class C9el {
    public static final List A00;
    public static final AXu A01;
    public static final AXu A02;
    public static final List A03;

    static {
        C9vv c9vv = new AXu() { // from class: X.9vv
            /* JADX WARN: Type inference failed for: r0v0, types: [X.5fq, X.5qu] */
            @Override // X.AXu
            public final C5fv A4l(HighlightsFeedContent highlightsFeedContent) {
                ?? c5fq = new C5fq();
                String str = highlightsFeedContent.A0W;
                if (str == null) {
                    str = "";
                }
                c5fq.A09 = str;
                String str2 = highlightsFeedContent.A0X;
                if (str2 != null) {
                    c5fq.A03(new C5fr(null, null, null, null, null, null, null, "", str2, null, "", null, AnonymousClass001.A0v(), 0L, 0L, 0L));
                }
                return new 5gC((C5qu) c5fq);
            }
        };
        A02 = c9vv;
        C9vu c9vu = new AXu() { // from class: X.9vu
            @Override // X.AXu
            public final C5fv A4l(HighlightsFeedContent highlightsFeedContent) {
                Integer num;
                Integer num2;
                List list = highlightsFeedContent.A0g;
                C5ft c5ft = null;
                if (!list.isEmpty()) {
                    HighlightsAttachmentContent highlightsAttachmentContent = (HighlightsAttachmentContent) 0QD.A0D(list);
                    C96g A002 = 9CR.A00(highlightsAttachmentContent.A02);
                    if (0QD.A0k(C9el.A00, A002)) {
                        String str = A002 == C96g.A07 ? highlightsAttachmentContent.A0A : highlightsAttachmentContent.A0B;
                        if (str != null && (num = highlightsAttachmentContent.A03) != null && (num2 = highlightsAttachmentContent.A00) != null) {
                            5wW r0 = new 5wW();
                            r0.A01(highlightsAttachmentContent.A08);
                            r0.A04(str);
                            int intValue = num.intValue();
                            r0.A03 = intValue;
                            int intValue2 = num2.intValue();
                            r0.A02 = intValue2;
                            r0.A01 = intValue;
                            r0.A00 = intValue2;
                            r0.A0G = true;
                            ImmutableList of = ImmutableList.of((Object) new Photo(r0));
                            C5fp c5fp = new C5fp();
                            String str2 = highlightsFeedContent.A0W;
                            if (str2 == null) {
                                str2 = "";
                            }
                            c5fp.A09 = str2;
                            11T.A0D(of);
                            11T.A0F(of, 0);
                            c5fp.A00 = of;
                            c5ft = new C5ft(c5fp);
                        }
                    }
                }
                return c5ft;
            }
        };
        A01 = c9vu;
        A00 = C0s8.A14(C96g.A05, C96g.A07, C96g.A02, C96g.A03);
        A03 = C0s8.A14(c9vu, c9vv);
    }

    public static final C5fv A00(HighlightsFeedContent highlightsFeedContent) {
        11T.A0F(highlightsFeedContent, 0);
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            C5fv A4l = ((AXu) it.next()).A4l(highlightsFeedContent);
            if (A4l != null) {
                return A4l;
            }
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }
}

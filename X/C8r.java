package X;

import com.facebook.messaging.integrity.frx.model.FeedbackTag;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: C8r.class */
public final class C8r {
    public final FeedbackTag A00;
    public final ImmutableList A01;

    public C8r(ImmutableList immutableList) {
        Object obj;
        ImmutableList copyOf;
        11T.A0F(immutableList, 1);
        Iterator it = immutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((FeedbackTag) obj).A05) {
                    break;
                }
            }
        }
        FeedbackTag feedbackTag = (FeedbackTag) obj;
        this.A00 = feedbackTag;
        if (feedbackTag == null) {
            copyOf = null;
        } else {
            ImmutableList immutableList2 = feedbackTag.A00;
            ArrayList A0y = 7zO.A0y(immutableList2);
            1Du it2 = immutableList2.iterator();
            while (it2.hasNext()) {
                FeedbackTag feedbackTag2 = (FeedbackTag) it2.next();
                if (feedbackTag2.A05) {
                    A0y.add(feedbackTag2);
                }
            }
            copyOf = ImmutableList.copyOf((Collection) A0y);
        }
        this.A01 = copyOf;
    }

    public final ImmutableList A00() {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            String str = ((FeedbackTag) it.next()).A02;
            11T.A0A(str);
            A0s.add(str);
        }
        return ImmutableList.copyOf((Collection) A0s);
    }

    public final ArrayList A01() {
        ArrayList A0s = AnonymousClass001.A0s();
        FeedbackTag feedbackTag = this.A00;
        if (feedbackTag != null) {
            String str = feedbackTag.A02;
            11T.A0A(str);
            A0s.add(str);
        }
        ImmutableList immutableList = this.A01;
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                String str2 = ((FeedbackTag) it.next()).A02;
                11T.A0A(str2);
                A0s.add(str2);
            }
        }
        return A0s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r0.A06 == true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A02() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.integrity.frx.model.FeedbackTag r0 = r0.A00
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L66
            r0 = r302
            boolean r0 = r0.A06
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L64
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.A00
            r306 = r0
            r0 = r306
            X.11T.A0A(r0)
            r0 = r306
            java.util.Iterator r0 = r0.iterator()
            r307 = r0
        L29:
            r0 = r307
            boolean r0 = r0.hasNext()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L68
            r0 = r307
            java.lang.Object r0 = r0.next()
            r302 = r0
            r0 = r302
            r306 = r0
            r0 = r302
            com.facebook.messaging.integrity.frx.model.FeedbackTag r0 = (com.facebook.messaging.integrity.frx.model.FeedbackTag) r0
            r306 = r0
            r0 = r306
            boolean r0 = r0.A05
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L29
        L50:
            r0 = r302
            com.facebook.messaging.integrity.frx.model.FeedbackTag r0 = (com.facebook.messaging.integrity.frx.model.FeedbackTag) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L66
            r0 = r302
            boolean r0 = r0.A06
            r304 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L66
        L64:
            r0 = 1
            r303 = r0
        L66:
            r0 = r303
            return r0
        L68:
            r0 = 0
            r302 = r0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8r.A02():boolean");
    }
}
